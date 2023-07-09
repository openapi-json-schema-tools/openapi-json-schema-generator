# coding: utf-8

"""
    openapi 3.0.3 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft6  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
import collections
import dataclasses
import decimal
import re
import sys
import types
import typing
import uuid

import immutabledict as original_immutabledict
import typing_extensions

from unit_test_api import exceptions
from unit_test_api.configurations import schema_configuration

from . import format

_K = typing.TypeVar('_K')
_V = typing.TypeVar('_V')


class immutabledict(original_immutabledict.immutabledict[_K, _V]):
    def __init__(self, arg: typing.Any, **kwargs: typing.Any):
        super().__init__(arg)  # needed to omit passing on kwargs


@dataclasses.dataclass
class ValidationMetadata:
    """
    A class storing metadata that is needed to validate OpenApi Schema payloads
    """
    path_to_item: typing.Tuple[typing.Union[str, int], ...]
    configuration: schema_configuration.SchemaConfiguration
    validated_path_to_schemas: typing.Mapping[
        typing.Tuple[typing.Union[str, int], ...],
        typing.Mapping[typing.Type, None]
    ] = dataclasses.field(default_factory=dict)
    seen_classes: typing.FrozenSet[typing.Type] = frozenset()

    def validation_ran_earlier(self, cls: type) -> bool:
        validated_schemas = self.validated_path_to_schemas.get(self.path_to_item, set())
        validation_ran_earlier = validated_schemas and cls in validated_schemas
        if validation_ran_earlier:
            return True
        if cls in self.seen_classes:
            return True
        return False

def _raise_validation_error_message(value, constraint_msg, constraint_value, path_to_item, additional_txt=""):
    raise exceptions.ApiValueError(
        "Invalid value `{value}`, {constraint_msg} `{constraint_value}`{additional_txt} at {path_to_item}".format(
            value=value,
            constraint_msg=constraint_msg,
            constraint_value=constraint_value,
            additional_txt=additional_txt,
            path_to_item=path_to_item,
        )
    )


class SchemaValidator:
    __excluded_cls_properties = {
        '__module__',
        '__dict__',
        '__weakref__',
        '__doc__',
        '__annotations__',
        'default',  # excluded because it has no impact on validation
        'type_to_output_cls',  # used to pluck the output class for instantiation
    }

    @classmethod
    def _validate(
        cls,
        arg,
        validation_metadata: ValidationMetadata,
    ) -> PathToSchemasType:
        """
        SchemaValidator validate
        All keyword validation except for type checking was done in calling stack frames
        If those validations passed, the validated classes are collected in path_to_schemas
        """
        cls_schema = cls()
        json_schema_data = {
            k: v
            for k, v in vars(cls_schema).items()
            if k not in cls.__excluded_cls_properties
            and k
            not in validation_metadata.configuration.disabled_json_schema_python_keywords
        }
        path_to_schemas = {}
        for keyword, val in json_schema_data.items():
            validator =  json_schema_keyword_to_validator[keyword]

            other_path_to_schemas = validator(
                arg,
                val,
                cls,
                validation_metadata,
            )
            if other_path_to_schemas:
                update(path_to_schemas, other_path_to_schemas)

        base_class = type(arg)
        if validation_metadata.path_to_item not in path_to_schemas:
            path_to_schemas[validation_metadata.path_to_item] = dict()
        path_to_schemas[validation_metadata.path_to_item][base_class] = None
        path_to_schemas[validation_metadata.path_to_item][cls] = None
        return path_to_schemas

PathToSchemasType = typing.Dict[
    typing.Tuple[typing.Union[str, int], ...],
    typing.Dict[
        typing.Union[
            typing.Type[SchemaValidator],
            typing.Type[str],
            typing.Type[int],
            typing.Type[float],
            typing.Type[bool],
            typing.Type[None],
            typing.Type[immutabledict],
            typing.Type[tuple]
        ],
        None
    ]
]

def _get_class(
    item_cls: typing.Union[types.FunctionType, staticmethod, typing.Type[SchemaValidator]],
    local_namespace: typing.Optional[dict] = None
) -> typing.Type[SchemaValidator]:
    if isinstance(item_cls, typing._GenericAlias): # type: ignore
        # petstore_api.schemas.StrSchema[~U] -> petstore_api.schemas.StrSchema
        origin_cls = typing_extensions.get_origin(item_cls)
        if origin_cls is None:
            raise ValueError('origin class must not be None')
        return origin_cls
    elif isinstance(item_cls, types.FunctionType):
        # referenced schema
        return item_cls()
    elif isinstance(item_cls, staticmethod):
        # referenced schema
        return item_cls.__func__()
    elif isinstance(item_cls, type):
        return item_cls
    elif isinstance(item_cls, typing.ForwardRef):
        return item_cls._evaluate(None, local_namespace)
    raise ValueError('invalid class value passed in')


def update(d: dict, u: dict):
    """
    Adds u to d
    Where each dict is collections.defaultdict(dict)
    """
    if not u:
        return d
    for k, v in u.items():
        if k not in d:
            d[k] = v
        else:
            d[k].update(v)


def add_deeper_validated_schemas(validation_metadata: ValidationMetadata, path_to_schemas: dict):
    # this is called if validation_ran_earlier and current and deeper locations need to be added
    current_path_to_item = validation_metadata.path_to_item
    other_path_to_schemas = {}
    for path_to_item, schemas in validation_metadata.validated_path_to_schemas.items():
        if len(path_to_item) < len(current_path_to_item):
            continue
        path_begins_with_current_path = path_to_item[:len(current_path_to_item)] == current_path_to_item
        if path_begins_with_current_path:
            other_path_to_schemas[path_to_item] = schemas
    update(path_to_schemas, other_path_to_schemas)


def __get_valid_classes_phrase(input_classes):
    """Returns a string phrase describing what types are allowed"""
    all_classes = list(input_classes)
    all_classes = sorted(all_classes, key=lambda cls: cls.__name__)
    all_class_names = [cls.__name__ for cls in all_classes]
    if len(all_class_names) == 1:
        return "is {0}".format(all_class_names[0])
    return "is one of [{0}]".format(", ".join(all_class_names))


def __type_error_message(
    var_value=None, var_name=None, valid_classes=None, key_type=None
):
    """
    Keyword Args:
        var_value (any): the variable which has the type_error
        var_name (str): the name of the variable which has the typ error
        valid_classes (tuple): the accepted classes for current_item's
                                  value
        key_type (bool): False if our value is a value in a dict
                         True if it is a key in a dict
                         False if our item is an item in a tuple
    """
    key_or_value = "value"
    if key_type:
        key_or_value = "key"
    valid_classes_phrase = __get_valid_classes_phrase(valid_classes)
    msg = "Invalid type. Required {1} type {2} and " "passed type was {3}".format(
        var_name,
        key_or_value,
        valid_classes_phrase,
        type(var_value).__name__,
    )
    return msg


def __get_type_error(var_value, path_to_item, valid_classes, key_type=False):
    error_msg = __type_error_message(
        var_name=path_to_item[-1],
        var_value=var_value,
        valid_classes=valid_classes,
        key_type=key_type,
    )
    return exceptions.ApiTypeError(
        error_msg,
        path_to_item=path_to_item,
        valid_classes=valid_classes,
        key_type=key_type,
    )


@dataclasses.dataclass(frozen=True)
class PatternInfo:
    pattern: str
    flags: typing.Optional[re.RegexFlag] = None


def validate_types(
    arg: typing.Any,
    allowed_types: typing.Set[typing.Type],
    cls: typing.Type,
    validation_metadata: ValidationMetadata,
) -> None:
    if type(arg) not in allowed_types:
        raise __get_type_error(
            arg,
            validation_metadata.path_to_item,
            allowed_types,
            key_type=False,
        )
    return None

def validate_enum(
    arg: typing.Any,
    enum_value_to_name: typing.Dict[typing.Any, str],
    cls: typing.Type,
    validation_metadata: ValidationMetadata,
) -> None:
    if arg not in enum_value_to_name:
        raise exceptions.ApiValueError("Invalid value {} passed in to {}, allowed_values={}".format(arg, cls, enum_value_to_name.keys()))
    return None


def validate_unique_items(
    arg: typing.Any,
    unique_items_value: bool,
    cls: typing.Type,
    validation_metadata: ValidationMetadata,
) -> None:
    if not unique_items_value or not isinstance(arg, tuple):
        return None
    if len(arg) == len(set(arg)):
        return None
    _raise_validation_error_message(
        value=arg,
        constraint_msg="duplicate items were found, and the tuple must not contain duplicates because",
        constraint_value='unique_items==True',
        path_to_item=validation_metadata.path_to_item
    )


def validate_min_items(
    arg: typing.Any,
    min_items: int,
    cls: typing.Type,
    validation_metadata: ValidationMetadata,
) -> None:
    if not isinstance(arg, tuple):
        return None
    if len(arg) < min_items:
        _raise_validation_error_message(
            value=arg,
            constraint_msg="number of items must be greater than or equal to",
            constraint_value=min_items,
            path_to_item=validation_metadata.path_to_item
        )
    return None


def validate_max_items(
    arg: typing.Any,
    max_items: int,
    cls: typing.Type,
    validation_metadata: ValidationMetadata,
) -> None:
    if not isinstance(arg, tuple):
        return None
    if len(arg) > max_items:
        _raise_validation_error_message(
            value=arg,
            constraint_msg="number of items must be less than or equal to",
            constraint_value=max_items,
            path_to_item=validation_metadata.path_to_item
        )
    return None


def validate_min_properties(
    arg: typing.Any,
    min_properties: int,
    cls: typing.Type,
    validation_metadata: ValidationMetadata,
) -> None:
    if not isinstance(arg, immutabledict):
        return None
    if len(arg) < min_properties:
        _raise_validation_error_message(
            value=arg,
            constraint_msg="number of properties must be greater than or equal to",
            constraint_value=min_properties,
            path_to_item=validation_metadata.path_to_item
        )
    return None


def validate_max_properties(
    arg: typing.Any,
    max_properties: int,
    cls: typing.Type,
    validation_metadata: ValidationMetadata,
) -> None:
    if not isinstance(arg, immutabledict):
        return None
    if len(arg) > max_properties:
        _raise_validation_error_message(
            value=arg,
            constraint_msg="number of properties must be less than or equal to",
            constraint_value=max_properties,
            path_to_item=validation_metadata.path_to_item
        )
    return None


def validate_min_length(
    arg: typing.Any,
    min_length: int,
    cls: typing.Type,
    validation_metadata: ValidationMetadata,
) -> None:
    if not isinstance(arg, str):
        return None
    if len(arg) < min_length:
        _raise_validation_error_message(
            value=arg,
            constraint_msg="length must be greater than or equal to",
            constraint_value=min_length,
            path_to_item=validation_metadata.path_to_item
        )
    return None


def validate_max_length(
    arg: typing.Any,
    max_length: int,
    cls: typing.Type,
    validation_metadata: ValidationMetadata,
) -> None:
    if not isinstance(arg, str):
        return None
    if len(arg) > max_length:
        _raise_validation_error_message(
            value=arg,
            constraint_msg="length must be less than or equal to",
            constraint_value=max_length,
            path_to_item=validation_metadata.path_to_item
        )
    return None


def validate_inclusive_minimum(
    arg: typing.Any,
    inclusive_minimum: typing.Union[int, float],
    cls: typing.Type,
    validation_metadata: ValidationMetadata,
) -> None:
    if not isinstance(arg, (int, float)):
        return None
    if arg < inclusive_minimum:
        _raise_validation_error_message(
            value=arg,
            constraint_msg="must be a value greater than or equal to",
            constraint_value=inclusive_minimum,
            path_to_item=validation_metadata.path_to_item
        )
    return None


def validate_exclusive_minimum(
    arg: typing.Any,
    exclusive_minimum: typing.Union[int, float],
    cls: typing.Type,
    validation_metadata: ValidationMetadata,
) -> None:
    if not isinstance(arg, (int, float)):
        return None
    if arg <= exclusive_minimum:
        _raise_validation_error_message(
            value=arg,
            constraint_msg="must be a value greater than",
            constraint_value=exclusive_minimum,
            path_to_item=validation_metadata.path_to_item
        )
    return None


def validate_inclusive_maximum(
    arg: typing.Any,
    inclusive_maximum: typing.Union[int, float],
    cls: typing.Type,
    validation_metadata: ValidationMetadata,
) -> None:
    if not isinstance(arg, (int, float)):
        return None
    if arg > inclusive_maximum:
        _raise_validation_error_message(
            value=arg,
            constraint_msg="must be a value less than or equal to",
            constraint_value=inclusive_maximum,
            path_to_item=validation_metadata.path_to_item
        )
    return None


def validate_exclusive_maximum(
    arg: typing.Any,
    exclusive_maximum: typing.Union[int, float],
    cls: typing.Type,
    validation_metadata: ValidationMetadata,
) -> None:
    if not isinstance(arg, (int, float)):
        return None
    if arg >= exclusive_maximum:
        _raise_validation_error_message(
            value=arg,
            constraint_msg="must be a value less than",
            constraint_value=exclusive_maximum,
            path_to_item=validation_metadata.path_to_item
        )
    return None

def validate_multiple_of(
    arg: typing.Any,
    multiple_of: typing.Union[int, float],
    cls: typing.Type,
    validation_metadata: ValidationMetadata,
) -> None:
    if not isinstance(arg, (int, float)):
        return None
    if (not (float(arg) / multiple_of).is_integer()):
        # Note 'multipleOf' will be as good as the floating point arithmetic.
        _raise_validation_error_message(
            value=arg,
            constraint_msg="value must be a multiple of",
            constraint_value=multiple_of,
            path_to_item=validation_metadata.path_to_item
        )
    return None


def validate_pattern(
    arg: typing.Any,
    pattern_info: PatternInfo,
    cls: typing.Type,
    validation_metadata: ValidationMetadata,
) -> None:
    if not isinstance(arg, str):
        return None
    flags = pattern_info.flags if pattern_info.flags is not None else 0
    if not re.search(pattern_info.pattern, arg, flags=flags):
        if flags != 0:
            # Don't print the regex flags if the flags are not
            # specified in the OAS document.
            _raise_validation_error_message(
                value=arg,
                constraint_msg="must match regular expression",
                constraint_value=pattern_info.pattern,
                path_to_item=validation_metadata.path_to_item,
                additional_txt=" with flags=`{}`".format(flags)
            )
        _raise_validation_error_message(
            value=arg,
            constraint_msg="must match regular expression",
            constraint_value=pattern_info.pattern,
            path_to_item=validation_metadata.path_to_item
        )
    return None


__int32_inclusive_minimum = -2147483648
__int32_inclusive_maximum = 2147483647
__int64_inclusive_minimum = -9223372036854775808
__int64_inclusive_maximum = 9223372036854775807
__float_inclusive_minimum = -3.4028234663852886e+38
__float_inclusive_maximum = 3.4028234663852886e+38
__double_inclusive_minimum = -1.7976931348623157E+308
__double_inclusive_maximum = 1.7976931348623157E+308

def __validate_numeric_format(
    arg: typing.Union[int, float],
    format_value: str,
    validation_metadata: ValidationMetadata
) -> None:
    if format_value[:3] == 'int':
        # there is a json schema test where 1.0 validates as an integer
        if arg != int(arg):
            raise exceptions.ApiValueError(
                "Invalid non-integer value '{}' for type {} at {}".format(
                    arg, format, validation_metadata.path_to_item
                )
            )
        if format_value == 'int32':
            if not __int32_inclusive_minimum <= arg <= __int32_inclusive_maximum:
                raise exceptions.ApiValueError(
                    "Invalid value '{}' for type int32 at {}".format(arg, validation_metadata.path_to_item)
                )
            return None
        elif format_value == 'int64':
            if not __int64_inclusive_minimum <= arg <= __int64_inclusive_maximum:
                raise exceptions.ApiValueError(
                    "Invalid value '{}' for type int64 at {}".format(arg, validation_metadata.path_to_item)
                )
            return None
        return None
    elif format_value in {'float', 'double'}:
        if format_value == 'float':
            if not __float_inclusive_minimum <= arg <= __float_inclusive_maximum:
                raise exceptions.ApiValueError(
                    "Invalid value '{}' for type float at {}".format(arg, validation_metadata.path_to_item)
                )
            return None
        # double
        if not __double_inclusive_minimum <= arg <= __double_inclusive_maximum:
            raise exceptions.ApiValueError(
                "Invalid value '{}' for type double at {}".format(arg, validation_metadata.path_to_item)
            )
        return None
    return None


def __validate_string_format(
    arg: str,
    format_value: str,
    validation_metadata: ValidationMetadata
) -> None:
    if format_value == 'uuid':
        try:
            uuid.UUID(arg)
            return None
        except ValueError:
            raise exceptions.ApiValueError(
                "Invalid value '{}' for type UUID at {}".format(arg, validation_metadata.path_to_item)
            )
    elif format_value == 'number':
        try:
            decimal.Decimal(arg)
            return None
        except decimal.InvalidOperation:
            raise exceptions.ApiValueError(
                "Value cannot be converted to a decimal. "
                "Invalid value '{}' for type decimal at {}".format(arg, validation_metadata.path_to_item)
            )
    elif format_value == 'date':
        try:
            format.DEFAULT_ISOPARSER.parse_isodate(arg)
            return None
        except ValueError:
            raise exceptions.ApiValueError(
                "Value does not conform to the required ISO-8601 date format. "
                "Invalid value '{}' for type date at {}".format(arg, validation_metadata.path_to_item)
            )
    elif format_value == 'date-time':
        try:
            format.DEFAULT_ISOPARSER.parse_isodatetime(arg)
            return None
        except ValueError:
            raise exceptions.ApiValueError(
                "Value does not conform to the required ISO-8601 datetime format. "
                "Invalid value '{}' for type datetime at {}".format(arg, validation_metadata.path_to_item)
            )
    return None


def validate_format(
    arg: typing.Union[str, int, float],
    format_value: str,
    cls: typing.Type,
    validation_metadata: ValidationMetadata,
) -> None:
    # formats work for strings + numbers
    if isinstance(arg, (int, float)):
        return __validate_numeric_format(
            arg,
            format_value,
            validation_metadata
        )
    elif isinstance(arg, str):
        return __validate_string_format(
            arg,
            format_value,
            validation_metadata
        )
    return None


def validate_required(
    arg: typing.Any,
    required: typing.Set[str],
    cls: typing.Type,
    validation_metadata: ValidationMetadata,
) -> None:
    if not isinstance(arg, immutabledict):
        return None
    missing_required_arguments = required - arg.keys()
    if missing_required_arguments:
        missing_required_arguments = list(missing_required_arguments)
        missing_required_arguments.sort()
        raise exceptions.ApiTypeError(
            "{} is missing {} required argument{}: {}".format(
                cls.__name__,
                len(missing_required_arguments),
                "s" if len(missing_required_arguments) > 1 else "",
                missing_required_arguments
            )
        )
    return None


def validate_items(
    arg: typing.Any,
    item_cls: typing.Type[SchemaValidator],
    cls: typing.Type,
    validation_metadata: ValidationMetadata,
) -> typing.Optional[PathToSchemasType]:
    if not isinstance(arg, tuple):
        return None
    item_cls = _get_class(item_cls)
    path_to_schemas = {}
    for i, value in enumerate(arg):
        item_validation_metadata = ValidationMetadata(
            path_to_item=validation_metadata.path_to_item+(i,),
            configuration=validation_metadata.configuration,
            validated_path_to_schemas=validation_metadata.validated_path_to_schemas
        )
        if item_validation_metadata.validation_ran_earlier(item_cls):
            add_deeper_validated_schemas(item_validation_metadata, path_to_schemas)
            continue
        other_path_to_schemas = item_cls._validate(
            value, validation_metadata=item_validation_metadata)
        update(path_to_schemas, other_path_to_schemas)
    return path_to_schemas


def validate_properties(
    arg: typing.Any,
    properties: typing.Mapping[str, typing.Type[SchemaValidator]],
    cls: typing.Type,
    validation_metadata: ValidationMetadata,
) -> typing.Optional[PathToSchemasType]:
    if not isinstance(arg, immutabledict):
        return None
    path_to_schemas = {}
    present_properties = {k: v for k, v, in arg.items() if k in properties}
    module_namespace = vars(sys.modules[cls.__module__])
    for property_name, value in present_properties.items():
        path_to_item = validation_metadata.path_to_item + (property_name,)
        schema = properties[property_name]
        schema = _get_class(schema, module_namespace)
        arg_validation_metadata = ValidationMetadata(
            path_to_item=path_to_item,
            configuration=validation_metadata.configuration,
            validated_path_to_schemas=validation_metadata.validated_path_to_schemas
        )
        if arg_validation_metadata.validation_ran_earlier(schema):
            add_deeper_validated_schemas(arg_validation_metadata, path_to_schemas)
            continue
        other_path_to_schemas = schema._validate(value, validation_metadata=arg_validation_metadata)
        update(path_to_schemas, other_path_to_schemas)
    return path_to_schemas


def validate_additional_properties(
    arg: typing.Any,
    additional_properties_cls: typing.Type[SchemaValidator],
    cls: typing.Type,
    validation_metadata: ValidationMetadata,
) -> typing.Optional[PathToSchemasType]:
    if not isinstance(arg, immutabledict):
        return None
    schema = _get_class(additional_properties_cls)
    path_to_schemas = {}
    cls_schema = cls()
    properties = cls_schema.properties if hasattr(cls_schema, 'properties') else {}
    present_additional_properties = {k: v for k, v, in arg.items() if k not in properties}
    for property_name, value in present_additional_properties.items():
        path_to_item = validation_metadata.path_to_item + (property_name,)
        arg_validation_metadata = ValidationMetadata(
            path_to_item=path_to_item,
            configuration=validation_metadata.configuration,
            validated_path_to_schemas=validation_metadata.validated_path_to_schemas
        )
        if arg_validation_metadata.validation_ran_earlier(schema):
            add_deeper_validated_schemas(arg_validation_metadata, path_to_schemas)
            continue
        other_path_to_schemas = schema._validate(value, validation_metadata=arg_validation_metadata)
        update(path_to_schemas, other_path_to_schemas)
    return path_to_schemas


def validate_one_of(
    arg: typing.Any,
    classes: typing.Tuple[typing.Type[SchemaValidator], ...],
    cls: typing.Type,
    validation_metadata: ValidationMetadata,
) -> PathToSchemasType:
    oneof_classes = []
    path_to_schemas = collections.defaultdict(dict)
    for schema in classes:
        schema = _get_class(schema)
        if schema in path_to_schemas[validation_metadata.path_to_item]:
            oneof_classes.append(schema)
            continue
        if schema is cls:
            """
            optimistically assume that cls schema will pass validation
            do not invoke _validate on it because that is recursive
            """
            oneof_classes.append(schema)
            continue
        if validation_metadata.validation_ran_earlier(schema):
            oneof_classes.append(schema)
            add_deeper_validated_schemas(validation_metadata, path_to_schemas)
            continue
        try:
            path_to_schemas = schema._validate(arg, validation_metadata=validation_metadata)
        except (exceptions.ApiValueError, exceptions.ApiTypeError) as ex:
            # silence exceptions because the code needs to accumulate oneof_classes
            continue
        oneof_classes.append(schema)
    if not oneof_classes:
        raise exceptions.ApiValueError(
            "Invalid inputs given to generate an instance of {}. None "
            "of the oneOf schemas matched the input data.".format(cls)
        )
    elif len(oneof_classes) > 1:
        raise exceptions.ApiValueError(
            "Invalid inputs given to generate an instance of {}. Multiple "
            "oneOf schemas {} matched the inputs, but a max of one is allowed.".format(cls, oneof_classes)
        )
    # exactly one class matches
    return path_to_schemas


def validate_any_of(
    arg: typing.Any,
    classes: typing.Tuple[typing.Type[SchemaValidator], ...],
    cls: typing.Type,
    validation_metadata: ValidationMetadata,
) -> PathToSchemasType:
    anyof_classes = []
    path_to_schemas = collections.defaultdict(dict)
    for schema in classes:
        schema = _get_class(schema)
        if schema is cls:
            """
            optimistically assume that cls schema will pass validation
            do not invoke _validate on it because that is recursive
            """
            anyof_classes.append(schema)
            continue
        if validation_metadata.validation_ran_earlier(schema):
            anyof_classes.append(schema)
            add_deeper_validated_schemas(validation_metadata, path_to_schemas)
            continue

        try:
            other_path_to_schemas = schema._validate(arg, validation_metadata=validation_metadata)
        except (exceptions.ApiValueError, exceptions.ApiTypeError) as ex:
            # silence exceptions because the code needs to accumulate anyof_classes
            continue
        anyof_classes.append(schema)
        update(path_to_schemas, other_path_to_schemas)
    if not anyof_classes:
        raise exceptions.ApiValueError(
            "Invalid inputs given to generate an instance of {}. None "
            "of the anyOf schemas matched the input data.".format(cls)
        )
    return path_to_schemas


def validate_all_of(
    arg: typing.Any,
    classes: typing.Tuple[typing.Type[SchemaValidator], ...],
    cls: typing.Type,
    validation_metadata: ValidationMetadata,
) -> PathToSchemasType:
    path_to_schemas = collections.defaultdict(dict)
    for schema in classes:
        schema = _get_class(schema)
        if schema is cls:
            """
            optimistically assume that cls schema will pass validation
            do not invoke _validate on it because that is recursive
            """
            continue
        if validation_metadata.validation_ran_earlier(schema):
            add_deeper_validated_schemas(validation_metadata, path_to_schemas)
            continue
        other_path_to_schemas = schema._validate(arg, validation_metadata=validation_metadata)
        update(path_to_schemas, other_path_to_schemas)
    return path_to_schemas


def validate_not(
    arg: typing.Any,
    not_cls: typing.Type[SchemaValidator],
    cls: typing.Type,
    validation_metadata: ValidationMetadata,
) -> None:
    not_schema = _get_class(not_cls)
    other_path_to_schemas = None
    not_exception = exceptions.ApiValueError(
        "Invalid value '{}' was passed in to {}. Value is invalid because it is disallowed by {}".format(
            arg,
            cls.__name__,
            not_schema.__name__,
        )
    )
    if validation_metadata.validation_ran_earlier(not_schema):
        raise not_exception

    try:
        other_path_to_schemas = not_schema._validate(arg, validation_metadata=validation_metadata)
    except (exceptions.ApiValueError, exceptions.ApiTypeError):
        pass
    if other_path_to_schemas:
        raise not_exception
    return None


def __ensure_discriminator_value_present(
    disc_property_name: str,
    validation_metadata: ValidationMetadata,
    arg
):
    if disc_property_name not in arg:
        # The input data does not contain the discriminator property
        raise exceptions.ApiValueError(
            "Cannot deserialize input data due to missing discriminator. "
            "The discriminator property '{}' is missing at path: {}".format(disc_property_name, validation_metadata.path_to_item)
        )


def __get_discriminated_class(cls, disc_property_name: str, disc_payload_value: str):
    """
    Used in schemas with discriminators
    """
    cls_schema = cls()
    if not hasattr(cls_schema, 'discriminator'):
        return None
    disc = cls_schema.discriminator
    if disc_property_name not in disc:
        return None
    discriminated_cls = disc[disc_property_name].get(disc_payload_value)
    if discriminated_cls is not None:
        return discriminated_cls
    if not (
        hasattr(cls_schema, 'all_of') or
        hasattr(cls_schema, 'one_of') or
        hasattr(cls_schema, 'any_of')
    ):
        return None
    # TODO stop traveling if a cycle is hit
    if hasattr(cls_schema, 'all_of'):
        for allof_cls in cls_schema.all_of:
            discriminated_cls = __get_discriminated_class(
                allof_cls, disc_property_name=disc_property_name, disc_payload_value=disc_payload_value)
            if discriminated_cls is not None:
                return discriminated_cls
    if hasattr(cls_schema, 'one_of'):
        for oneof_cls in cls_schema.one_of:
            discriminated_cls = __get_discriminated_class(
                oneof_cls, disc_property_name=disc_property_name, disc_payload_value=disc_payload_value)
            if discriminated_cls is not None:
                return discriminated_cls
    if hasattr(cls_schema, 'any_of'):
        for anyof_cls in cls_schema.any_of:
            discriminated_cls = __get_discriminated_class(
                anyof_cls, disc_property_name=disc_property_name, disc_payload_value=disc_payload_value)
            if discriminated_cls is not None:
                return discriminated_cls
    return None


def validate_discriminator(
    arg: typing.Any,
    discriminator: typing.Mapping[str, typing.Mapping[str, typing.Type[SchemaValidator]]],
    cls: typing.Type,
    validation_metadata: ValidationMetadata,
) -> typing.Optional[PathToSchemasType]:
    if not isinstance(arg, immutabledict):
        return None
    disc_prop_name = list(discriminator.keys())[0]
    __ensure_discriminator_value_present(disc_prop_name, validation_metadata, arg)
    discriminated_cls = __get_discriminated_class(
        cls, disc_property_name=disc_prop_name, disc_payload_value=arg[disc_prop_name]
    )
    if discriminated_cls is None:
        raise exceptions.ApiValueError(
            "Invalid discriminator value was passed in to {}.{} Only the values {} are allowed at {}".format(
                cls.__name__,
                disc_prop_name,
                list(discriminator[disc_prop_name].keys()),
                validation_metadata.path_to_item + (disc_prop_name,)
            )
        )
    if discriminated_cls is cls:
        """
        Optimistically assume that cls will pass validation
        If the code invoked _validate on cls it would infinitely recurse
        """
        return None
    if validation_metadata.validation_ran_earlier(discriminated_cls):
        path_to_schemas = {}
        add_deeper_validated_schemas(validation_metadata, path_to_schemas)
        return path_to_schemas
    updated_vm = ValidationMetadata(
        path_to_item=validation_metadata.path_to_item,
        configuration=validation_metadata.configuration,
        seen_classes=validation_metadata.seen_classes | frozenset({cls}),
        validated_path_to_schemas=validation_metadata.validated_path_to_schemas
    )
    return discriminated_cls._validate(arg, validation_metadata=updated_vm)


json_schema_keyword_to_validator = {
    'types': validate_types,
    'enum_value_to_name': validate_enum,
    'unique_items': validate_unique_items,
    'min_items': validate_min_items,
    'max_items': validate_max_items,
    'min_properties': validate_min_properties,
    'max_properties': validate_max_properties,
    'min_length': validate_min_length,
    'max_length': validate_max_length,
    'inclusive_minimum': validate_inclusive_minimum,
    'exclusive_minimum': validate_exclusive_minimum,
    'inclusive_maximum': validate_inclusive_maximum,
    'exclusive_maximum': validate_exclusive_maximum,
    'multiple_of': validate_multiple_of,
    'pattern': validate_pattern,
    'format': validate_format,
    'required': validate_required,
    'items': validate_items,
    'properties': validate_properties,
    'additional_properties': validate_additional_properties,
    'one_of': validate_one_of,
    'any_of': validate_any_of,
    'all_of': validate_all_of,
    'not_': validate_not,
    'discriminator': validate_discriminator
}
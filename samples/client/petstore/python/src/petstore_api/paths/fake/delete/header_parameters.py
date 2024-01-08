# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose.  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

AdditionalProperties: typing_extensions.TypeAlias = schemas.NotAnyTypeSchema

from petstore_api.paths.fake.delete.parameters.parameter_1 import schema
from petstore_api.paths.fake.delete.parameters.parameter_4 import schema as schema_2
Properties = typing.TypedDict(
    'Properties',
    {
        "required_boolean_group": typing.Type[schema.Schema],
        "boolean_group": typing.Type[schema_2.Schema],
    }
)
HeaderParametersRequiredDictInput = typing.TypedDict(
    'HeaderParametersRequiredDictInput',
    {
        "required_boolean_group": typing.Literal[
            "true",
            "false"
        ],
    }
)
HeaderParametersOptionalDictInput = typing.TypedDict(
    'HeaderParametersOptionalDictInput',
    {
        "boolean_group": typing.Literal[
            "true",
            "false"
        ],
    },
    total=False
)


class HeaderParametersDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):

    __required_keys__: typing.FrozenSet[str] = frozenset({
        "required_boolean_group",
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
        "boolean_group",
    })
    
    def __new__(
        cls,
        *,
        required_boolean_group: typing.Literal[
            "true",
            "false"
        ],
        boolean_group: typing.Union[
            typing.Literal[
                "true",
                "false"
            ],
            schemas.Unset
        ] = schemas.unset,
        configuration_: typing.Optional[schema_configuration.SchemaConfiguration] = None,
    ):
        arg_: typing.Dict[str, typing.Any] = {
            "required_boolean_group": required_boolean_group,
        }
        for key_, val in (
            ("boolean_group", boolean_group),
        ):
            if isinstance(val, schemas.Unset):
                continue
            arg_[key_] = val
        used_arg_ = typing.cast(HeaderParametersDictInput, arg_)
        return HeaderParameters.validate(used_arg_, configuration=configuration_)
    
    @staticmethod
    def from_dict_(
        arg: typing.Union[
            HeaderParametersDictInput,
            HeaderParametersDict
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> HeaderParametersDict:
        return HeaderParameters.validate(arg, configuration=configuration)
    
    @property
    def required_boolean_group(self) -> typing.Literal["true", "false"]:
        return typing.cast(
            typing.Literal["true", "false"],
            self.__getitem__("required_boolean_group")
        )
    
    @property
    def boolean_group(self) -> typing.Union[typing.Literal["true", "false"], schemas.Unset]:
        val = self.get("boolean_group", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            typing.Literal["true", "false"],
            val
        )


class HeaderParametersDictInput(HeaderParametersRequiredDictInput, HeaderParametersOptionalDictInput):
    pass


@dataclasses.dataclass(frozen=True)
class HeaderParameters(
    schemas.Schema[HeaderParametersDict, tuple]
):
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    required: typing.FrozenSet[str] = frozenset({
        "required_boolean_group",
    })
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    additional_properties: typing.Type[AdditionalProperties] = dataclasses.field(default_factory=lambda: AdditionalProperties) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: HeaderParametersDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            HeaderParametersDictInput,
            HeaderParametersDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> HeaderParametersDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )


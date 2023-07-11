# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *



class ItemsEnums:

    @schemas.classproperty
    def GREATER_THAN_SIGN(cls) -> str:
        return Items.validate(">")

    @schemas.classproperty
    def DOLLAR_SIGN(cls) -> str:
        return Items.validate("$")


@dataclasses.dataclass(frozen=True)
class Items(
    schemas.StrSchema
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        str,
    })
    default: str = "$"
    enum_value_to_name: typing.Mapping[typing.Union[int, float, str, schemas.Bool, None], str] = dataclasses.field(
        default_factory=lambda: {
            ">": "GREATER_THAN_SIGN",
            "$": "DOLLAR_SIGN",
        }
    )
    enums = ItemsEnums

    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing_extensions.Literal[">"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal[">"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing_extensions.Literal["$"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal["$"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: str,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal[">","$",]: ...
    @classmethod
    def validate(
        cls,
        arg,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal[
        ">",
        "$",
    ]:
        validated_arg = super().validate_base_(
            arg,
            configuration=configuration,
        )
        return typing.cast(typing_extensions.Literal[
                ">",
                "$",
            ],
            validated_arg
        )


class EnumFormStringArrayTuple(typing.Tuple[schemas.OUTPUT_BASE_TYPES]):
    def __getitem__(self, name: int) -> typing_extensions.Literal[">", "$"]:
        return super().__getitem__(name)

    def __new__(cls, arg: EnumFormStringArrayTupleInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return EnumFormStringArray.validate(arg, configuration=configuration)
EnumFormStringArrayTupleInput = typing.Sequence[
    str,
]


@dataclasses.dataclass(frozen=True)
class EnumFormStringArray(
    schemas.ListSchema[EnumFormStringArrayTuple]
):
    types: typing.FrozenSet[typing.Type] = frozenset({tuple})
    items: typing.Type[Items] = dataclasses.field(default_factory=lambda: Items) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            tuple: EnumFormStringArrayTuple
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            EnumFormStringArrayTupleInput,
            EnumFormStringArrayTuple,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> EnumFormStringArrayTuple:
        return super().validate_base_(
            arg,
            configuration=configuration,
        )


class EnumFormStringEnums:

    @schemas.classproperty
    def _ABC(cls) -> str:
        return EnumFormString.validate("_abc")

    @schemas.classproperty
    def HYPHEN_MINUS_EFG(cls) -> str:
        return EnumFormString.validate("-efg")

    @schemas.classproperty
    def LEFT_PARENTHESIS_XYZ_RIGHT_PARENTHESIS(cls) -> str:
        return EnumFormString.validate("(xyz)")


@dataclasses.dataclass(frozen=True)
class EnumFormString(
    schemas.StrSchema
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        str,
    })
    default: str = "-efg"
    enum_value_to_name: typing.Mapping[typing.Union[int, float, str, schemas.Bool, None], str] = dataclasses.field(
        default_factory=lambda: {
            "_abc": "_ABC",
            "-efg": "HYPHEN_MINUS_EFG",
            "(xyz)": "LEFT_PARENTHESIS_XYZ_RIGHT_PARENTHESIS",
        }
    )
    enums = EnumFormStringEnums

    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing_extensions.Literal["_abc"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal["_abc"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing_extensions.Literal["-efg"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal["-efg"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing_extensions.Literal["(xyz)"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal["(xyz)"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: str,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal["_abc","-efg","(xyz)",]: ...
    @classmethod
    def validate(
        cls,
        arg,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal[
        "_abc",
        "-efg",
        "(xyz)",
    ]:
        validated_arg = super().validate_base_(
            arg,
            configuration=configuration,
        )
        return typing.cast(typing_extensions.Literal[
                "_abc",
                "-efg",
                "(xyz)",
            ],
            validated_arg
        )
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "enum_form_string_array": typing.Type[EnumFormStringArray],
        "enum_form_string": typing.Type[EnumFormString],
    }
)


class SchemaDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["enum_form_string_array"]) -> EnumFormStringArrayTuple:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["enum_form_string"]) -> typing_extensions.Literal["_abc", "-efg", "(xyz)"]:
        ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.OUTPUT_BASE_TYPES: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["enum_form_string_array"],
            typing_extensions.Literal["enum_form_string"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(cls, arg: SchemaDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return Schema.validate(arg, configuration=configuration)
SchemaDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL_INCL_SCHEMA]


@dataclasses.dataclass(frozen=True)
class Schema(
    schemas.DictSchema[SchemaDict]
):
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: SchemaDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            SchemaDictInput,
            SchemaDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> SchemaDict:
        return super().validate_base_(
            arg,
            configuration=configuration,
        )


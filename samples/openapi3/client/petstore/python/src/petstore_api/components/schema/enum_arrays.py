# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]



class JustSymbolEnums:

    @schemas.classproperty
    def GREATER_THAN_SIGN_EQUALS_SIGN(cls) -> str:
        return JustSymbol.validate(">=")

    @schemas.classproperty
    def DOLLAR_SIGN(cls) -> str:
        return JustSymbol.validate("$")


@dataclasses.dataclass(frozen=True)
class JustSymbol(
    schemas.Schema
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        str,
    })
    enum_value_to_name: typing.Mapping[typing.Union[int, float, str, schemas.Bool, None], str] = dataclasses.field(
        default_factory=lambda: {
            ">=": "GREATER_THAN_SIGN_EQUALS_SIGN",
            "$": "DOLLAR_SIGN",
        }
    )
    enums = JustSymbolEnums

    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing_extensions.Literal[">="],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal[">="]: ...
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
    ) -> typing_extensions.Literal[">=","$",]: ...
    @classmethod
    def validate(
        cls,
        arg,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal[
        ">=",
        "$",
    ]:
        validated_arg = super().validate_base(
            arg,
            configuration=configuration,
        )
        return typing.cast(typing_extensions.Literal[
                ">=",
                "$",
            ],
            validated_arg
        )


class ItemsEnums:

    @schemas.classproperty
    def FISH(cls) -> str:
        return Items.validate("fish")

    @schemas.classproperty
    def CRAB(cls) -> str:
        return Items.validate("crab")


@dataclasses.dataclass(frozen=True)
class Items(
    schemas.Schema
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        str,
    })
    enum_value_to_name: typing.Mapping[typing.Union[int, float, str, schemas.Bool, None], str] = dataclasses.field(
        default_factory=lambda: {
            "fish": "FISH",
            "crab": "CRAB",
        }
    )
    enums = ItemsEnums

    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing_extensions.Literal["fish"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal["fish"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing_extensions.Literal["crab"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal["crab"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: str,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal["fish","crab",]: ...
    @classmethod
    def validate(
        cls,
        arg,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal[
        "fish",
        "crab",
    ]:
        validated_arg = super().validate_base(
            arg,
            configuration=configuration,
        )
        return typing.cast(typing_extensions.Literal[
                "fish",
                "crab",
            ],
            validated_arg
        )


class ArrayEnumTuple(
    typing.Tuple[
        typing_extensions.Literal["fish", "crab"],
        ...
    ]
):

    def __new__(cls, arg: ArrayEnumTupleInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return ArrayEnum.validate(arg, configuration=configuration)
ArrayEnumTupleInput = typing.Union[
    typing.List[
        str,
    ],
    typing.Tuple[
        str,
        ...
    ]
]


@dataclasses.dataclass(frozen=True)
class ArrayEnum(
    schemas.Schema[schemas.immutabledict, ArrayEnumTuple]
):
    types: typing.FrozenSet[typing.Type] = frozenset({tuple})
    items: typing.Type[Items] = dataclasses.field(default_factory=lambda: Items) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            tuple: ArrayEnumTuple
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            ArrayEnumTupleInput,
            ArrayEnumTuple,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ArrayEnumTuple:
        return super().validate_base(
            arg,
            configuration=configuration,
        )
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "just_symbol": typing.Type[JustSymbol],
        "array_enum": typing.Type[ArrayEnum],
    }
)


class EnumArraysDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    @typing.overload
    def get_property(self, name: typing_extensions.Literal["just_symbol"]) -> typing_extensions.Literal[">=", "$"]:
        ...
    
    @typing.overload
    def get_property(self, name: typing_extensions.Literal["array_enum"]) -> ArrayEnumTuple:
        ...
    
    def get_property(self, name):
        return self.__getitem__(name)
    
    def get_additional_property(self, name: str) -> schemas.OUTPUT_BASE_TYPES:
        return self.__getitem__(name)

    def __new__(cls, arg: EnumArraysDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return EnumArrays.validate(arg, configuration=configuration)
EnumArraysDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL_INCL_SCHEMA]


@dataclasses.dataclass(frozen=True)
class EnumArrays(
    schemas.Schema[EnumArraysDict, tuple]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: EnumArraysDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            EnumArraysDictInput,
            EnumArraysDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> EnumArraysDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )


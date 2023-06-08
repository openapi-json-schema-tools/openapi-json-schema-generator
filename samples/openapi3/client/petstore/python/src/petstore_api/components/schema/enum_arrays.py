# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *



class JustSymbol(
    schemas.StrSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({
            str,
        })
        enum_value_to_name: typing.Mapping[typing.Union[int, float, str, schemas.BoolClass, schemas.NoneClass], str] = dataclasses.field(
            default_factory=lambda: {
                ">=": "GREATER_THAN_SIGN_EQUALS_SIGN",
                "$": "DOLLAR_SIGN",
            }
        )
    
    @schemas.classproperty
    def GREATER_THAN_SIGN_EQUALS_SIGN(cls) -> JustSymbol[str]:
        return cls(">=") # type: ignore
    
    @schemas.classproperty
    def DOLLAR_SIGN(cls) -> JustSymbol[str]:
        return cls("$") # type: ignore


class Items(
    schemas.StrSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({
            str,
        })
        enum_value_to_name: typing.Mapping[typing.Union[int, float, str, schemas.BoolClass, schemas.NoneClass], str] = dataclasses.field(
            default_factory=lambda: {
                "fish": "FISH",
                "crab": "CRAB",
            }
        )
    
    @schemas.classproperty
    def FISH(cls) -> Items[str]:
        return cls("fish") # type: ignore
    
    @schemas.classproperty
    def CRAB(cls) -> Items[str]:
        return cls("crab") # type: ignore


class ArrayEnum(
    schemas.ListSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({tuple})
        items: typing.Type[Items] = dataclasses.field(default_factory=lambda: Items) # type: ignore

    def __new__(
        cls,
        arg_: typing.Sequence[
            typing.Union[
                Items[str],
                str
            ]
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None
    ) -> ArrayEnum[tuple]:
        inst = super().__new__(
            cls,
            arg_,
            configuration_=configuration_,
        )
        inst = typing.cast(
            ArrayEnum[tuple],
            inst
        )
        return inst

    def __getitem__(self, name: int) -> Items[str]:
        return super().__getitem__(name)

Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "just_symbol": typing.Type[JustSymbol],
        "array_enum": typing.Type[ArrayEnum],
    }
)
DictInput = typing_extensions.TypedDict(
    'DictInput',
    {
        "just_symbol": typing.Union[
            JustSymbol[str],
            str
        ],
        "array_enum": typing.Union[
            ArrayEnum[tuple],
            list,
            tuple
        ],
    },
    total=False
)


class EnumArrays(
    schemas.DictSchema[schemas.T]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({frozendict.frozendict})
        properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["just_symbol"]) -> JustSymbol[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["array_enum"]) -> ArrayEnum[tuple]: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.AnyTypeSchema[typing.Union[
        frozendict.frozendict,
        str,
        decimal.Decimal,
        schemas.BoolClass,
        schemas.NoneClass,
        tuple,
        bytes,
        schemas.FileIO
    ]]: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["just_symbol"],
            typing_extensions.Literal["array_enum"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        arg_: typing.Union[
            DictInput,
            EnumArrays[frozendict.frozendict],
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None
    ) -> EnumArrays[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            arg_,
            configuration_=configuration_,
        )
        inst = typing.cast(
            EnumArrays[frozendict.frozendict],
            inst
        )
        return inst


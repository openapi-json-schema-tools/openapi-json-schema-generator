# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *



class Items(
    schemas.StrSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SchemaBase):
        types: typing.FrozenSet[typing.Type] = frozenset({
            str,
        })
        default: str = "$"
        enum_value_to_name: typing.Mapping[typing.Union[int, float, str, schemas.BoolClass, schemas.NoneClass], str] = dataclasses.field(
            default_factory=lambda: {
                ">": "GREATER_THAN_SIGN",
                "$": "DOLLAR_SIGN",
            }
        )
    
    @schemas.classproperty
    def GREATER_THAN_SIGN(cls) -> Items[str]:
        return cls(">") # type: ignore
    
    @schemas.classproperty
    def DOLLAR_SIGN(cls) -> Items[str]:
        return cls("$") # type: ignore


class EnumFormStringArray(
    schemas.ListSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SchemaBase):
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
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
    ) -> EnumFormStringArray[tuple]:
        inst = super().__new__(
            cls,
            arg_,
            configuration_=configuration_,
        )
        inst = typing.cast(
            EnumFormStringArray[tuple],
            inst
        )
        return inst

    def __getitem__(self, name: int) -> Items[str]:
        return super().__getitem__(name)



class EnumFormString(
    schemas.StrSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SchemaBase):
        types: typing.FrozenSet[typing.Type] = frozenset({
            str,
        })
        default: str = "-efg"
        enum_value_to_name: typing.Mapping[typing.Union[int, float, str, schemas.BoolClass, schemas.NoneClass], str] = dataclasses.field(
            default_factory=lambda: {
                "_abc": "_ABC",
                "-efg": "HYPHEN_MINUS_EFG",
                "(xyz)": "LEFT_PARENTHESIS_XYZ_RIGHT_PARENTHESIS",
            }
        )
    
    @schemas.classproperty
    def _ABC(cls) -> EnumFormString[str]:
        return cls("_abc") # type: ignore
    
    @schemas.classproperty
    def HYPHEN_MINUS_EFG(cls) -> EnumFormString[str]:
        return cls("-efg") # type: ignore
    
    @schemas.classproperty
    def LEFT_PARENTHESIS_XYZ_RIGHT_PARENTHESIS(cls) -> EnumFormString[str]:
        return cls("(xyz)") # type: ignore


class Schema(
    schemas.DictSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SchemaBase):
        types: typing.FrozenSet[typing.Type] = frozenset({frozendict.frozendict})
        properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["enum_form_string_array"]) -> EnumFormStringArray[tuple]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["enum_form_string"]) -> EnumFormString[str]: ...
    
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
            typing_extensions.Literal["enum_form_string_array"],
            typing_extensions.Literal["enum_form_string"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict],
        enum_form_string_array: typing.Union[
            EnumFormStringArray[tuple],
            schemas.Unset,
            list,
            tuple
        ] = schemas.unset,
        enum_form_string: typing.Union[
            EnumFormString[str],
            schemas.Unset,
            str
        ] = schemas.unset,
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: typing.Union[
            dict,
            frozendict.frozendict,
            list,
            tuple,
            decimal.Decimal,
            float,
            int,
            str,
            datetime.date,
            datetime.datetime,
            uuid.UUID,
            bool,
            None,
            bytes,
            io.FileIO,
            io.BufferedReader,
            schemas.Schema
        ],
    ) -> Schema[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            *args_,
            enum_form_string_array=enum_form_string_array,
            enum_form_string=enum_form_string,
            configuration_=configuration_,
            **kwargs,
        )
        inst = typing.cast(
            Schema[frozendict.frozendict],
            inst
        )
        return inst

Properties = typing_extensions.TypedDict(
    'SchemaProperties',
    {
        "enum_form_string_array": typing.Type[EnumFormStringArray],
        "enum_form_string": typing.Type[EnumFormString],
    }
)

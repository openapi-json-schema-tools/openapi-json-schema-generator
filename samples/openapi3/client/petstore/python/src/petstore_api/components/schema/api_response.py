# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *

Code: typing_extensions.TypeAlias = schemas.Int32Schema[U]
Type: typing_extensions.TypeAlias = schemas.StrSchema[U]
Message: typing_extensions.TypeAlias = schemas.StrSchema[U]
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "code": typing.Type[Code],
        "type": typing.Type[Type],
        "message": typing.Type[Message],
    }
)
DictInput = typing_extensions.TypedDict(
    'DictInput',
    {
        "code": typing.Union[
            Code[decimal.Decimal],
            schemas.Unset,
            decimal.Decimal,
            int
        ],
        "type": typing.Union[
            Type[str],
            schemas.Unset,
            str
        ],
        "message": typing.Union[
            Message[str],
            schemas.Unset,
            str
        ],
    },
    total=False
)


class ApiResponse(
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
    def __getitem__(self, name: typing_extensions.Literal["code"]) -> Code[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["type"]) -> Type[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["message"]) -> Message[str]: ...
    
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
            typing_extensions.Literal["code"],
            typing_extensions.Literal["type"],
            typing_extensions.Literal["message"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict],
        code: typing.Union[
            Code[decimal.Decimal],
            schemas.Unset,
            decimal.Decimal,
            int
        ] = schemas.unset,
        type: typing.Union[
            Type[str],
            schemas.Unset,
            str
        ] = schemas.unset,
        message: typing.Union[
            Message[str],
            schemas.Unset,
            str
        ] = schemas.unset,
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: schemas.INPUT_TYPES_ALL_INCL_SCHEMA
    ) -> ApiResponse[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            *args_,
            code=code,
            type=type,
            message=message,
            configuration_=configuration_,
            **kwargs,
        )
        inst = typing.cast(
            ApiResponse[frozendict.frozendict],
            inst
        )
        return inst


# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *

Id: typing_extensions.TypeAlias = schemas.Int64Schema[U]
PetId: typing_extensions.TypeAlias = schemas.Int64Schema[U]
Quantity: typing_extensions.TypeAlias = schemas.Int32Schema[U]
ShipDate: typing_extensions.TypeAlias = schemas.DateTimeSchema[U]


class Status(
    schemas.StrSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({
            str,
        })
        enum_value_to_name: typing.Mapping[typing.Union[int, float, str, schemas.BoolClass, schemas.NoneClass], str] = dataclasses.field(
            default_factory=lambda: {
                "placed": "PLACED",
                "approved": "APPROVED",
                "delivered": "DELIVERED",
            }
        )
    
    @schemas.classproperty
    def PLACED(cls) -> Status[str]:
        return cls("placed") # type: ignore
    
    @schemas.classproperty
    def APPROVED(cls) -> Status[str]:
        return cls("approved") # type: ignore
    
    @schemas.classproperty
    def DELIVERED(cls) -> Status[str]:
        return cls("delivered") # type: ignore


class Complete(
    schemas.BoolSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({
            schemas.BoolClass,
        })
        default: schemas.BoolClass = schemas.BoolClass.FALSE
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "id": typing.Type[Id],
        "petId": typing.Type[PetId],
        "quantity": typing.Type[Quantity],
        "shipDate": typing.Type[ShipDate],
        "status": typing.Type[Status],
        "complete": typing.Type[Complete],
    }
)


class Order(
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
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> Id[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["petId"]) -> PetId[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["quantity"]) -> Quantity[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["shipDate"]) -> ShipDate[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["status"]) -> Status[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["complete"]) -> Complete[schemas.BoolClass]: ...
    
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
            typing_extensions.Literal["id"],
            typing_extensions.Literal["petId"],
            typing_extensions.Literal["quantity"],
            typing_extensions.Literal["shipDate"],
            typing_extensions.Literal["status"],
            typing_extensions.Literal["complete"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        arg_: typing.Union[
            DictInput,
            Order[frozendict.frozendict],
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None
    ) -> Order[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            arg_,
            configuration_=configuration_,
        )
        inst = typing.cast(
            Order[frozendict.frozendict],
            inst
        )
        return inst


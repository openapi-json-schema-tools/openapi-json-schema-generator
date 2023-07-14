# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *

Id: typing_extensions.TypeAlias = schemas.Int64Schema
PetId: typing_extensions.TypeAlias = schemas.Int64Schema
Quantity: typing_extensions.TypeAlias = schemas.Int32Schema
ShipDate: typing_extensions.TypeAlias = schemas.DateTimeSchema


class StatusEnums:

    @schemas.classproperty
    def PLACED(cls) -> str:
        return Status.validate("placed")

    @schemas.classproperty
    def APPROVED(cls) -> str:
        return Status.validate("approved")

    @schemas.classproperty
    def DELIVERED(cls) -> str:
        return Status.validate("delivered")


@dataclasses.dataclass(frozen=True)
class Status(
    schemas.Schema
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        str,
    })
    enum_value_to_name: typing.Mapping[typing.Union[int, float, str, schemas.Bool, None], str] = dataclasses.field(
        default_factory=lambda: {
            "placed": "PLACED",
            "approved": "APPROVED",
            "delivered": "DELIVERED",
        }
    )
    enums = StatusEnums

    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing_extensions.Literal["placed"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal["placed"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing_extensions.Literal["approved"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal["approved"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing_extensions.Literal["delivered"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal["delivered"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: str,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal["placed","approved","delivered",]: ...
    @classmethod
    def validate(
        cls,
        arg,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal[
        "placed",
        "approved",
        "delivered",
    ]:
        validated_arg = super().validate_base(
            arg,
            configuration=configuration,
        )
        return typing.cast(typing_extensions.Literal[
                "placed",
                "approved",
                "delivered",
            ],
            validated_arg
        )


@dataclasses.dataclass(frozen=True)
class Complete(
    schemas.BoolSchema
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        schemas.Bool,
    })
    default: bool = False
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


class OrderDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    @property
    def id(self) -> int:
        return self.__getitem__("id")
    
    @property
    def pet_id(self) -> int:
        return self.__getitem__("petId")
    
    @property
    def quantity(self) -> int:
        return self.__getitem__("quantity")
    
    @property
    def ship_date(self) -> str:
        return self.__getitem__("shipDate")
    
    @property
    def status(self) -> typing_extensions.Literal["placed", "approved", "delivered"]:
        return self.__getitem__("status")
    
    @property
    def complete(self) -> bool:
        return self.__getitem__("complete")
    
    def get_property(self, name):
        return self.__getitem__(name)
    
    def get_additional_property(self, name: str) -> schemas.OUTPUT_BASE_TYPES:
        return self.__getitem__(name)

    def __new__(cls, arg: OrderDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return Order.validate(arg, configuration=configuration)
OrderDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL_INCL_SCHEMA]


@dataclasses.dataclass(frozen=True)
class Order(
    schemas.Schema[OrderDict, tuple]
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
            schemas.immutabledict: OrderDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            OrderDictInput,
            OrderDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> OrderDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )


# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

Id: typing_extensions.TypeAlias = schemas.Int64Schema
PetId: typing_extensions.TypeAlias = schemas.Int64Schema
Quantity: typing_extensions.TypeAlias = schemas.Int32Schema
ShipDate: typing_extensions.TypeAlias = schemas.DateTimeSchema


class StatusEnums:

    @schemas.classproperty
    def PLACED(cls) -> typing_extensions.Literal["placed"]:
        return Status.validate("placed")

    @schemas.classproperty
    def APPROVED(cls) -> typing_extensions.Literal["approved"]:
        return Status.validate("approved")

    @schemas.classproperty
    def DELIVERED(cls) -> typing_extensions.Literal["delivered"]:
        return Status.validate("delivered")


@dataclasses.dataclass(frozen=True)
class Status(
    schemas.Schema[schemas.immutabledict, str]
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

    __required_keys__: typing.FrozenSet[str] = frozenset({
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
        "id",
        "petId",
        "quantity",
        "shipDate",
        "status",
        "complete",
    })
    
    @property
    def id(self) -> typing.Union[int, schemas.Unset]:
        val = self.get("id", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            int,
            val
        )
    
    @property
    def petId(self) -> typing.Union[int, schemas.Unset]:
        val = self.get("petId", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            int,
            val
        )
    
    @property
    def quantity(self) -> typing.Union[int, schemas.Unset]:
        val = self.get("quantity", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            int,
            val
        )
    
    @property
    def shipDate(self) -> typing.Union[str, schemas.Unset]:
        val = self.get("shipDate", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            str,
            val
        )
    
    @property
    def status(self) -> typing.Union[typing_extensions.Literal["placed", "approved", "delivered"], schemas.Unset]:
        val = self.get("status", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            typing_extensions.Literal["placed", "approved", "delivered"],
            val
        )
    
    @property
    def complete(self) -> typing.Union[bool, schemas.Unset]:
        val = self.get("complete", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            bool,
            val
        )
    
    def get_additional_property_(self, name: str) -> typing.Union[schemas.OUTPUT_BASE_TYPES, schemas.Unset]:
        schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
        return self.get(name, schemas.unset)

    @staticmethod
    def from_dict_(
        arg: OrderDictInput,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> OrderDict:
        return Order.validate(arg, configuration=configuration)
    
    def __new__(
        cls,
        id: typing.Union[int, schemas.Unset] = schemas.unset,
        petId: typing.Union[int, schemas.Unset] = schemas.unset,
        quantity: typing.Union[int, schemas.Unset] = schemas.unset,
        shipDate: typing.Union[
            str,
            schemas.Unset
        ] = schemas.unset,
        status: typing.Union[
            typing_extensions.Literal[
                "placed",
                "approved",
                "delivered"
            ],
            schemas.Unset
        ] = schemas.unset,
        complete: typing.Union[
            bool,
            schemas.Unset
        ] = schemas.unset,
        configuration_: typing.Optional[schema_configuration.SchemaConfiguration] = None,
        **kwargs: schemas.INPUT_TYPES_ALL,
    ):
        arg_ = {}
        for key, val in (
            ("id", id),
            ("petId", petId),
            ("quantity", quantity),
            ("shipDate", shipDate),
            ("status", status),
            ("complete", complete),
        ):
            if isinstance(val, schemas.Unset):
                continue
            arg_[key] = val
        arg_.update(kwargs)
        return Order.validate(arg_, configuration=configuration_)
OrderDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL]


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


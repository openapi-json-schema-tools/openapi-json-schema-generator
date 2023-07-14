# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *

Width: typing_extensions.TypeAlias = schemas.DecimalSchema

from petstore_api.components.schema import decimal_payload
from petstore_api.components.schema import money
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "length": typing.Type[decimal_payload.DecimalPayload],
        "width": typing.Type[Width],
        "cost": typing.Type[money.Money],
    }
)


class ObjectWithDecimalPropertiesDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    @typing.overload
    def length(self) -> str:
        return self.__getitem__("length")
    
    @typing.overload
    def width(self) -> str:
        return self.__getitem__("width")
    
    @typing.overload
    def cost(self) -> money.MoneyDict:
        return self.__getitem__("cost")
    
    def get_property(self, name):
        return self.__getitem__(name)
    
    def get_additional_property(self, name: str) -> schemas.OUTPUT_BASE_TYPES:
        return self.__getitem__(name)

    def __new__(cls, arg: ObjectWithDecimalPropertiesDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return ObjectWithDecimalProperties.validate(arg, configuration=configuration)
ObjectWithDecimalPropertiesDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL_INCL_SCHEMA]


@dataclasses.dataclass(frozen=True)
class ObjectWithDecimalProperties(
    schemas.Schema[ObjectWithDecimalPropertiesDict, tuple]
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
            schemas.immutabledict: ObjectWithDecimalPropertiesDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            ObjectWithDecimalPropertiesDictInput,
            ObjectWithDecimalPropertiesDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ObjectWithDecimalPropertiesDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )


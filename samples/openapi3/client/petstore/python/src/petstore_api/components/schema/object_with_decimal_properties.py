# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *


class ObjectWithDecimalProperties(
    schemas.DictSchema[schemas.T]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    class Schema_:
        types = {frozendict.frozendict}
        
        class Properties:
        
            @staticmethod
            def length() -> typing.Type[decimal_payload.DecimalPayload]:
                return decimal_payload.DecimalPayload
            Width: typing_extensions.TypeAlias = schemas.DecimalSchema[U]
        
            @staticmethod
            def cost() -> typing.Type[money.Money]:
                return money.Money
            __annotations__ = {
                "length": length,
                "width": Width,
                "cost": cost,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["length"]) -> decimal_payload.DecimalPayload[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["width"]) -> Schema_.Properties.Width[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["cost"]) -> money.Money[frozendict.frozendict]: ...
    
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
            typing_extensions.Literal["length"],
            typing_extensions.Literal["width"],
            typing_extensions.Literal["cost"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict],
        length: typing.Union[
            decimal_payload.DecimalPayload[str],
            schemas.Unset,
            str
        ] = schemas.unset,
        width: typing.Union[
            Schema_.Properties.Width[str],
            schemas.Unset,
            str
        ] = schemas.unset,
        cost: typing.Union[
            money.Money[frozendict.frozendict],
            schemas.Unset,
            dict,
            frozendict.frozendict
        ] = schemas.unset,
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema],
    ) -> ObjectWithDecimalProperties[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            *args_,
            length=length,
            width=width,
            cost=cost,
            configuration_=configuration_,
            **kwargs,
        )
        inst = typing.cast(
            ObjectWithDecimalProperties[frozendict.frozendict],
            inst
        )
        return inst

from petstore_api.components.schema import decimal_payload
from petstore_api.components.schema import money

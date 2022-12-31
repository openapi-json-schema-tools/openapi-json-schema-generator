# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import datetime  # noqa: F401
import decimal  # noqa: F401
import functools  # noqa: F401
import io  # noqa: F401
import re  # noqa: F401
import typing  # noqa: F401
import typing_extensions  # noqa: F401
import uuid  # noqa: F401

import frozendict  # noqa: F401

from petstore_api import schemas  # noqa: F401


class Order(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    class Schema_:
        types = {frozendict.frozendict}
        
        class Properties:
            Id = schemas.Int64Schema
            PetId = schemas.Int64Schema
            Quantity = schemas.Int32Schema
            ShipDate = schemas.DateTimeSchema
            
            
            class Status(
                schemas.StrSchema
            ):
            
            
                class Schema_:
                    types = {
                        str,
                    }
                    enum_value_to_name = {
                        "placed": "PLACED",
                        "approved": "APPROVED",
                        "delivered": "DELIVERED",
                    }
                
                @schemas.classproperty
                def PLACED(cls):
                    return cls("placed")
                
                @schemas.classproperty
                def APPROVED(cls):
                    return cls("approved")
                
                @schemas.classproperty
                def DELIVERED(cls):
                    return cls("delivered")
            Complete = schemas.BoolSchema
            __annotations__ = {
                "id": Id,
                "petId": PetId,
                "quantity": Quantity,
                "shipDate": ShipDate,
                "status": Status,
                "complete": Complete,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> Schema_.Properties.Id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["petId"]) -> Schema_.Properties.PetId: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["quantity"]) -> Schema_.Properties.Quantity: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["shipDate"]) -> Schema_.Properties.ShipDate: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["status"]) -> Schema_.Properties.Status: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["complete"]) -> Schema_.Properties.Complete: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
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
    
    @typing.overload
    def get_item_(self, name: typing_extensions.Literal["id"]) -> typing.Union[Schema_.Properties.Id, schemas.Unset]: ...
    
    @typing.overload
    def get_item_(self, name: typing_extensions.Literal["petId"]) -> typing.Union[Schema_.Properties.PetId, schemas.Unset]: ...
    
    @typing.overload
    def get_item_(self, name: typing_extensions.Literal["quantity"]) -> typing.Union[Schema_.Properties.Quantity, schemas.Unset]: ...
    
    @typing.overload
    def get_item_(self, name: typing_extensions.Literal["shipDate"]) -> typing.Union[Schema_.Properties.ShipDate, schemas.Unset]: ...
    
    @typing.overload
    def get_item_(self, name: typing_extensions.Literal["status"]) -> typing.Union[Schema_.Properties.Status, schemas.Unset]: ...
    
    @typing.overload
    def get_item_(self, name: typing_extensions.Literal["complete"]) -> typing.Union[Schema_.Properties.Complete, schemas.Unset]: ...
    
    @typing.overload
    def get_item_(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_(
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
        return super().get_item_(name)

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict, ],
        id: typing.Union[Schema_.Properties.Id, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        petId: typing.Union[Schema_.Properties.PetId, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        quantity: typing.Union[Schema_.Properties.Quantity, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        shipDate: typing.Union[Schema_.Properties.ShipDate, str, datetime.datetime, schemas.Unset] = schemas.unset,
        status: typing.Union[Schema_.Properties.Status, str, schemas.Unset] = schemas.unset,
        complete: typing.Union[Schema_.Properties.Complete, bool, schemas.Unset] = schemas.unset,
        configuration_: typing.Optional[schemas.configuration_module.Configuration] = None,
        **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema],
    ) -> 'Order':
        return super().__new__(
            cls,
            *args_,
            id=id,
            petId=petId,
            quantity=quantity,
            shipDate=shipDate,
            status=status,
            complete=complete,
            configuration_=configuration_,
            **kwargs,
        )

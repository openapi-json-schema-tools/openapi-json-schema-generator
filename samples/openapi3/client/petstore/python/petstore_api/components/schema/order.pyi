# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""

from datetime import date, datetime  # noqa: F401
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
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        
        class Properties:
            Id = schemas.Int64Schema
            PetId = schemas.Int64Schema
            Quantity = schemas.Int32Schema
            ShipDate = schemas.DateTimeSchema
            
            
            class status(
                schemas.StrSchema
            ):
                
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
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> MetaOapg.Properties.Id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["petId"]) -> MetaOapg.Properties.PetId: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["quantity"]) -> MetaOapg.Properties.Quantity: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["shipDate"]) -> MetaOapg.Properties.ShipDate: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["status"]) -> MetaOapg.Properties.Status: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["complete"]) -> MetaOapg.Properties.Complete: ...
    
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
    def get_item_oapg(self, name: typing_extensions.Literal["id"]) -> typing.Union[MetaOapg.Properties.Id, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["petId"]) -> typing.Union[MetaOapg.Properties.PetId, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["quantity"]) -> typing.Union[MetaOapg.Properties.Quantity, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["shipDate"]) -> typing.Union[MetaOapg.Properties.ShipDate, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["status"]) -> typing.Union[MetaOapg.Properties.Status, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["complete"]) -> typing.Union[MetaOapg.Properties.Complete, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(
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
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *_args: typing.Union[dict, frozendict.frozendict, ],
        id: typing.Union[MetaOapg.Properties.Id, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        petId: typing.Union[MetaOapg.Properties.PetId, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        quantity: typing.Union[MetaOapg.Properties.Quantity, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        shipDate: typing.Union[MetaOapg.Properties.ShipDate, str, datetime, schemas.Unset] = schemas.unset,
        status: typing.Union[MetaOapg.Properties.Status, str, schemas.Unset] = schemas.unset,
        complete: typing.Union[MetaOapg.Properties.Complete, bool, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'Order':
        return super().__new__(
            cls,
            *_args,
            id=id,
            petId=petId,
            quantity=quantity,
            shipDate=shipDate,
            status=status,
            complete=complete,
            _configuration=_configuration,
            **kwargs,
        )

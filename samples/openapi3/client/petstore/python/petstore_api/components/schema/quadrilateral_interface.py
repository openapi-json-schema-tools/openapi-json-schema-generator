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


class QuadrilateralInterface(
    schemas.AnyTypeSchema,
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        types = None
        required = {
            "shapeType",
            "quadrilateralType",
        }
        
        class properties:
            
            
            class shapeType(
                schemas.EnumBase,
                schemas.StrSchema
            ):
            
            
                class MetaOapg:
                    types = {
                        str,
                    }
                    enum_value_to_name = {
                        "Quadrilateral": "QUADRILATERAL",
                    }
                
                @schemas.classproperty
                def QUADRILATERAL(cls):
                    return cls("Quadrilateral")
            quadrilateralType = schemas.StrSchema
            __annotations__ = {
                "shapeType": shapeType,
                "quadrilateralType": quadrilateralType,
            }

    
    shapeType: MetaOapg.properties.shapeType
    quadrilateralType: MetaOapg.properties.quadrilateralType
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["shapeType"]) -> MetaOapg.properties.shapeType: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["quadrilateralType"]) -> MetaOapg.properties.quadrilateralType: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["shapeType", "quadrilateralType", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["shapeType"]) -> MetaOapg.properties.shapeType: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["quadrilateralType"]) -> MetaOapg.properties.quadrilateralType: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["shapeType", "quadrilateralType", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *_args: typing.Union[dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
        shapeType: typing.Union[MetaOapg.properties.shapeType, str, ],
        quadrilateralType: typing.Union[MetaOapg.properties.quadrilateralType, str, ],
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'QuadrilateralInterface':
        return super().__new__(
            cls,
            *_args,
            shapeType=shapeType,
            quadrilateralType=quadrilateralType,
            _configuration=_configuration,
            **kwargs,
        )

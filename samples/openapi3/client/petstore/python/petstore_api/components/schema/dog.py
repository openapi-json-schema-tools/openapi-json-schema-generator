# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
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


class Dog(
    schemas.AnyTypeSchema,
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        # any type
        
        class AllOf:
        
            @staticmethod
            def all_of0() -> typing.Type['animal.Animal']:
                return animal.Animal
            
            
            class AllOf1(
                schemas.DictSchema
            ):
            
            
                class MetaOapg:
                    types = {frozendict.frozendict}
                    
                    class Properties:
                        Breed = schemas.StrSchema
                        __annotations__ = {
                            "breed": Breed,
                        }
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["breed"]) -> MetaOapg.Properties.Breed: ...
                
                @typing.overload
                def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
                
                def __getitem__(
                    self,
                    name: typing.Union[
                        typing_extensions.Literal["breed"],
                        str
                    ]
                ):
                    # dict_instance[name] accessor
                    return super().__getitem__(name)
                
                @typing.overload
                def get_item_oapg(self, name: typing_extensions.Literal["breed"]) -> typing.Union[MetaOapg.Properties.Breed, schemas.Unset]: ...
                
                @typing.overload
                def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
                
                def get_item_oapg(
                    self,
                    name: typing.Union[
                        typing_extensions.Literal["breed"],
                        str
                    ]
                ):
                    return super().get_item_oapg(name)
            
                def __new__(
                    cls,
                    *_args: typing.Union[dict, frozendict.frozendict, ],
                    breed: typing.Union[MetaOapg.Properties.Breed, str, schemas.Unset] = schemas.unset,
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, io.FileIO, io.BufferedReader, schemas.Schema],
                ) -> 'AllOf1':
                    return super().__new__(
                        cls,
                        *_args,
                        breed=breed,
                        _configuration=_configuration,
                        **kwargs,
                    )
            classes = [
                all_of0,
                AllOf1,
            ]


    def __new__(
        cls,
        *_args: typing.Union[dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, io.FileIO, io.BufferedReader, schemas.Schema],
    ) -> 'Dog':
        return super().__new__(
            cls,
            *_args,
            _configuration=_configuration,
            **kwargs,
        )

from petstore_api.components.schema import animal

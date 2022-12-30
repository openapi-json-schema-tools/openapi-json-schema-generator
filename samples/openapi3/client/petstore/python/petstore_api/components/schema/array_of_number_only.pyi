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


class ArrayOfNumberOnly(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        
        class Properties:
            
            
            class ArrayNumber(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    types = {tuple}
                    Items = schemas.NumberSchema
            
                def __new__(
                    cls,
                    _arg: typing.Union[typing.Tuple[typing.Union[MetaOapg.Items, decimal.Decimal, int, float, ]], typing.List[typing.Union[MetaOapg.Items, decimal.Decimal, int, float, ]]],
                    _configuration: typing.Optional[schemas.configuration_module.Configuration] = None,
                ) -> 'ArrayNumber':
                    return super().__new__(
                        cls,
                        _arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> MetaOapg.Items:
                    return super().__getitem__(i)
            __annotations__ = {
                "ArrayNumber": ArrayNumber,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["ArrayNumber"]) -> MetaOapg.Properties.ArrayNumber: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["ArrayNumber"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["ArrayNumber"]) -> typing.Union[MetaOapg.Properties.ArrayNumber, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(
        self,
        name: typing.Union[
            typing_extensions.Literal["ArrayNumber"],
            str
        ]
    ):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *_args: typing.Union[dict, frozendict.frozendict, ],
        ArrayNumber: typing.Union[MetaOapg.Properties.ArrayNumber, list, tuple, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.configuration_module.Configuration] = None,
        **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, io.FileIO, io.BufferedReader, schemas.Schema],
    ) -> 'ArrayOfNumberOnly':
        return super().__new__(
            cls,
            *_args,
            ArrayNumber=ArrayNumber,
            _configuration=_configuration,
            **kwargs,
        )

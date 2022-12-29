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


class AppleReq(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        required = {
            "cultivar",
        }
        
        class Properties:
            Cultivar = schemas.StrSchema
            Mealy = schemas.BoolSchema
            __annotations__ = {
                "cultivar": Cultivar,
                "mealy": Mealy,
            }
        AdditionalProperties = schemas.NotAnyTypeSchema
    
    cultivar: MetaOapg.Properties.Cultivar
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["cultivar"]) -> MetaOapg.Properties.Cultivar: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["mealy"]) -> MetaOapg.Properties.Mealy: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["cultivar"],
            typing_extensions.Literal["mealy"],
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["cultivar"]) -> MetaOapg.Properties.Cultivar: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["mealy"]) -> typing.Union[MetaOapg.Properties.Mealy, schemas.Unset]: ...
    
    def get_item_oapg(
        self,
        name: typing.Union[
            typing_extensions.Literal["cultivar"],
            typing_extensions.Literal["mealy"],
        ]
    ):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *_args: typing.Union[dict, frozendict.frozendict, ],
        cultivar: typing.Union[MetaOapg.Properties.Cultivar, str, ],
        mealy: typing.Union[MetaOapg.Properties.Mealy, bool, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
    ) -> 'AppleReq':
        return super().__new__(
            cls,
            *_args,
            cultivar=cultivar,
            mealy=mealy,
            _configuration=_configuration,
        )

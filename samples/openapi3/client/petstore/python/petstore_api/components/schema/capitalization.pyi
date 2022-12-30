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


class Capitalization(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        
        class Properties:
            SmallCamel = schemas.StrSchema
            CapitalCamel = schemas.StrSchema
            SmallSnake = schemas.StrSchema
            CapitalSnake = schemas.StrSchema
            SCAETHFlowPoints = schemas.StrSchema
            ATTNAME = schemas.StrSchema
            __annotations__ = {
                "smallCamel": SmallCamel,
                "CapitalCamel": CapitalCamel,
                "small_Snake": SmallSnake,
                "Capital_Snake": CapitalSnake,
                "SCA_ETH_Flow_Points": SCAETHFlowPoints,
                "ATT_NAME": ATTNAME,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["smallCamel"]) -> MetaOapg.Properties.SmallCamel: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["CapitalCamel"]) -> MetaOapg.Properties.CapitalCamel: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["small_Snake"]) -> MetaOapg.Properties.SmallSnake: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["Capital_Snake"]) -> MetaOapg.Properties.CapitalSnake: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["SCA_ETH_Flow_Points"]) -> MetaOapg.Properties.SCAETHFlowPoints: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["ATT_NAME"]) -> MetaOapg.Properties.ATTNAME: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["smallCamel"],
            typing_extensions.Literal["CapitalCamel"],
            typing_extensions.Literal["small_Snake"],
            typing_extensions.Literal["Capital_Snake"],
            typing_extensions.Literal["SCA_ETH_Flow_Points"],
            typing_extensions.Literal["ATT_NAME"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["smallCamel"]) -> typing.Union[MetaOapg.Properties.SmallCamel, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["CapitalCamel"]) -> typing.Union[MetaOapg.Properties.CapitalCamel, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["small_Snake"]) -> typing.Union[MetaOapg.Properties.SmallSnake, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["Capital_Snake"]) -> typing.Union[MetaOapg.Properties.CapitalSnake, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["SCA_ETH_Flow_Points"]) -> typing.Union[MetaOapg.Properties.SCAETHFlowPoints, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["ATT_NAME"]) -> typing.Union[MetaOapg.Properties.ATTNAME, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(
        self,
        name: typing.Union[
            typing_extensions.Literal["smallCamel"],
            typing_extensions.Literal["CapitalCamel"],
            typing_extensions.Literal["small_Snake"],
            typing_extensions.Literal["Capital_Snake"],
            typing_extensions.Literal["SCA_ETH_Flow_Points"],
            typing_extensions.Literal["ATT_NAME"],
            str
        ]
    ):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *_args: typing.Union[dict, frozendict.frozendict, ],
        smallCamel: typing.Union[MetaOapg.Properties.SmallCamel, str, schemas.Unset] = schemas.unset,
        CapitalCamel: typing.Union[MetaOapg.Properties.CapitalCamel, str, schemas.Unset] = schemas.unset,
        small_Snake: typing.Union[MetaOapg.Properties.SmallSnake, str, schemas.Unset] = schemas.unset,
        Capital_Snake: typing.Union[MetaOapg.Properties.CapitalSnake, str, schemas.Unset] = schemas.unset,
        SCA_ETH_Flow_Points: typing.Union[MetaOapg.Properties.SCAETHFlowPoints, str, schemas.Unset] = schemas.unset,
        ATT_NAME: typing.Union[MetaOapg.Properties.ATTNAME, str, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.configuration_module.Configuration] = None,
        **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, io.FileIO, io.BufferedReader, schemas.Schema],
    ) -> 'Capitalization':
        return super().__new__(
            cls,
            *_args,
            smallCamel=smallCamel,
            CapitalCamel=CapitalCamel,
            small_Snake=small_Snake,
            Capital_Snake=Capital_Snake,
            SCA_ETH_Flow_Points=SCA_ETH_Flow_Points,
            ATT_NAME=ATT_NAME,
            _configuration=_configuration,
            **kwargs,
        )

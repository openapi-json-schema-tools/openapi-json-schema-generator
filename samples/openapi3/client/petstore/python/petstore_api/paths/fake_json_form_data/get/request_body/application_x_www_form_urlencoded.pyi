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


class ApplicationXWwwFormUrlencoded(
    schemas.DictSchema
):


    class MetaOapg:
        required = {
            "param",
            "param2",
        }
        
        class Properties:
            Param = schemas.StrSchema
            Param2 = schemas.StrSchema
            __annotations__ = {
                "param": Param,
                "param2": Param2,
            }
    
    param: MetaOapg.Properties.Param
    param2: MetaOapg.Properties.Param2
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["param"]) -> MetaOapg.Properties.Param: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["param2"]) -> MetaOapg.Properties.Param2: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["param"],
            typing_extensions.Literal["param2"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["param"]) -> MetaOapg.Properties.Param: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["param2"]) -> MetaOapg.Properties.Param2: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(
        self,
        name: typing.Union[
            typing_extensions.Literal["param"],
            typing_extensions.Literal["param2"],
            str
        ]
    ):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *_args: typing.Union[dict, frozendict.frozendict, ],
        param: typing.Union[MetaOapg.Properties.Param, str, ],
        param2: typing.Union[MetaOapg.Properties.Param2, str, ],
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'ApplicationXWwwFormUrlencoded':
        return super().__new__(
            cls,
            *_args,
            param=param,
            param2=param2,
            _configuration=_configuration,
            **kwargs,
        )
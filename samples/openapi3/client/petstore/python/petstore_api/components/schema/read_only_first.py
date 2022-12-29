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


class ReadOnlyFirst(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        types = {frozendict.frozendict}
        
        class Properties:
            Bar = schemas.StrSchema
            Baz = schemas.StrSchema
            __annotations__ = {
                "bar": Bar,
                "baz": Baz,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["bar"]) -> MetaOapg.Properties.Bar: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["baz"]) -> MetaOapg.Properties.Baz: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["bar"],
            typing_extensions.Literal["baz"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["bar"]) -> typing.Union[MetaOapg.Properties.Bar, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["baz"]) -> typing.Union[MetaOapg.Properties.Baz, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(
        self,
        name: typing.Union[
            typing_extensions.Literal["bar"],
            typing_extensions.Literal["baz"],
            str
        ]
    ):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *_args: typing.Union[dict, frozendict.frozendict, ],
        bar: typing.Union[MetaOapg.Properties.Bar, str, schemas.Unset] = schemas.unset,
        baz: typing.Union[MetaOapg.Properties.Baz, str, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, io.FileIO, io.BufferedReader, schemas.Schema],
    ) -> 'ReadOnlyFirst':
        return super().__new__(
            cls,
            *_args,
            bar=bar,
            baz=baz,
            _configuration=_configuration,
            **kwargs,
        )

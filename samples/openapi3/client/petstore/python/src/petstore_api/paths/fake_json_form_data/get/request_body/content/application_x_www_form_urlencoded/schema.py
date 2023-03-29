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


class Schema(
    schemas.DictSchema
):


    class Schema_:
        types = {frozendict.frozendict}
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
    
    param: Schema_.Properties.Param
    param2: Schema_.Properties.Param2
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["param"]) -> Schema_.Properties.Param: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["param2"]) -> Schema_.Properties.Param2: ...
    
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
    def get_item_(self, name: typing_extensions.Literal["param"]) -> Schema_.Properties.Param: ...
    
    @typing.overload
    def get_item_(self, name: typing_extensions.Literal["param2"]) -> Schema_.Properties.Param2: ...
    
    @typing.overload
    def get_item_(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_(
        self,
        name: typing.Union[
            typing_extensions.Literal["param"],
            typing_extensions.Literal["param2"],
            str
        ]
    ):
        return super().get_item_(name)

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict],
        param: typing.Union[Schema_.Properties.Param, str],
        param2: typing.Union[Schema_.Properties.Param2, str],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema],
    ) -> 'Schema':
        return super().__new__(
            cls,
            *args_,
            param=param,
            param2=param2,
            configuration_=configuration_,
            **kwargs,
        )

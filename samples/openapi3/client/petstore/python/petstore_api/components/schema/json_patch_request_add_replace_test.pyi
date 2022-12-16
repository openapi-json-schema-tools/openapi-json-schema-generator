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


class JSONPatchRequestAddReplaceTest(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        required = {
            "op",
            "path",
            "value",
        }
        
        class Properties:
            Path = schemas.StrSchema
            Value = schemas.AnyTypeSchema
            
            
            class op(
                schemas.StrSchema
            ):
                
                @schemas.classproperty
                def ADD(cls):
                    return cls("add")
                
                @schemas.classproperty
                def REPLACE(cls):
                    return cls("replace")
                
                @schemas.classproperty
                def TEST(cls):
                    return cls("test")
            __annotations__ = {
                "path": Path,
                "value": Value,
                "op": Op,
            }
        AdditionalProperties = schemas.NotAnyTypeSchema
    
    op: MetaOapg.properties.op
    path: MetaOapg.properties.path
    value: MetaOapg.properties.value
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["op"]) -> MetaOapg.properties.op: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["path"]) -> MetaOapg.properties.path: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["value"]) -> MetaOapg.properties.value: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["op"],
            typing_extensions.Literal["path"],
            typing_extensions.Literal["value"],
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["op"]) -> MetaOapg.properties.op: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["path"]) -> MetaOapg.properties.path: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["value"]) -> MetaOapg.properties.value: ...
    
    def get_item_oapg(
        self,
        name: typing.Union[
            typing_extensions.Literal["op"],
            typing_extensions.Literal["path"],
            typing_extensions.Literal["value"],
        ]
    ):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *_args: typing.Union[dict, frozendict.frozendict, ],
        op: typing.Union[MetaOapg.properties.op, str, ],
        path: typing.Union[MetaOapg.properties.path, str, ],
        value: typing.Union[MetaOapg.properties.value, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
        _configuration: typing.Optional[schemas.Configuration] = None,
    ) -> 'JSONPatchRequestAddReplaceTest':
        return super().__new__(
            cls,
            *_args,
            op=op,
            path=path,
            value=value,
            _configuration=_configuration,
        )

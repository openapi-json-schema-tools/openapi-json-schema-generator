# coding: utf-8

"""


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
        types = {frozendict.frozendict}
        required = {
            "op",
            "path",
            "value",
        }
        
        class Properties:
            Path = schemas.StrSchema
            Value = schemas.AnyTypeSchema
            
            
            class Op(
                schemas.StrSchema
            ):
            
            
                class MetaOapg:
                    types = {
                        str,
                    }
                    enum_value_to_name = {
                        "add": "ADD",
                        "replace": "REPLACE",
                        "test": "TEST",
                    }
                
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
    
    op: MetaOapg.Properties.Op
    path: MetaOapg.Properties.Path
    value: MetaOapg.Properties.Value
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["op"]) -> MetaOapg.Properties.Op: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["path"]) -> MetaOapg.Properties.Path: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["value"]) -> MetaOapg.Properties.Value: ...
    
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
    def get_item_oapg(self, name: typing_extensions.Literal["op"]) -> MetaOapg.Properties.Op: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["path"]) -> MetaOapg.Properties.Path: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["value"]) -> MetaOapg.Properties.Value: ...
    
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
        op: typing.Union[MetaOapg.Properties.Op, str, ],
        path: typing.Union[MetaOapg.Properties.Path, str, ],
        value: typing.Union[MetaOapg.Properties.Value, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
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

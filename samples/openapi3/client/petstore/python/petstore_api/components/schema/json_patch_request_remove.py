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


class JSONPatchRequestRemove(
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
        }
        
        class properties:
            path = schemas.StrSchema
            
            
            class op(
                schemas.StrSchema
            ):
            
            
                class MetaOapg:
                    types = {
                        str,
                    }
                    enum_value_to_name = {
                        "remove": "REMOVE",
                    }
                
                @schemas.classproperty
                def REMOVE(cls):
                    return cls("remove")
            __annotations__ = {
                "path": path,
                "op": op,
            }
        additional_properties = schemas.NotAnyTypeSchema
    
    op: MetaOapg.properties.op
    path: MetaOapg.properties.path
    # type hints for required __getitem__
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["op"]) -> MetaOapg.properties.op: ...
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["path"]) -> MetaOapg.properties.path: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["op"], typing_extensions.Literal["path"], ]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["op"]) -> MetaOapg.properties.op: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["path"]) -> MetaOapg.properties.path: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["op"], typing_extensions.Literal["path"], ]):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *_args: typing.Union[dict, frozendict.frozendict, ],
        op: typing.Union[MetaOapg.properties.op, str, ],
        path: typing.Union[MetaOapg.properties.path, str, ],
        _configuration: typing.Optional[schemas.Configuration] = None,
    ) -> 'JSONPatchRequestRemove':
        return super().__new__(
            cls,
            *_args,
            op=op,
            path=path,
            _configuration=_configuration,
        )

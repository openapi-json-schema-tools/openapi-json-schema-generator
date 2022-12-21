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


class JSONPatchRequestRemove(
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
        }
        
        class Properties:
            Path = schemas.StrSchema
            
            
            class Op(
                schemas.StrSchema
            ):
                
                @schemas.classproperty
                def REMOVE(cls):
                    return cls("remove")
            __annotations__ = {
                "path": Path,
                "op": Op,
            }
        AdditionalProperties = schemas.NotAnyTypeSchema
    
    op: MetaOapg.Properties.Op
    path: MetaOapg.Properties.Path
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["op"]) -> MetaOapg.Properties.Op: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["path"]) -> MetaOapg.Properties.Path: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["op"],
            typing_extensions.Literal["path"],
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["op"]) -> MetaOapg.Properties.Op: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["path"]) -> MetaOapg.Properties.Path: ...
    
    def get_item_oapg(
        self,
        name: typing.Union[
            typing_extensions.Literal["op"],
            typing_extensions.Literal["path"],
        ]
    ):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *_args: typing.Union[dict, frozendict.frozendict, ],
        op: typing.Union[MetaOapg.Properties.Op, str, ],
        path: typing.Union[MetaOapg.Properties.Path, str, ],
        _configuration: typing.Optional[schemas.Configuration] = None,
    ) -> 'JSONPatchRequestRemove':
        return super().__new__(
            cls,
            *_args,
            op=op,
            path=path,
            _configuration=_configuration,
        )

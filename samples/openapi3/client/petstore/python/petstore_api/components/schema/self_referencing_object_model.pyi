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


class SelfReferencingObjectModel(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        
        class Properties:
        
            @staticmethod
            def self_ref() -> typing.Type['SelfReferencingObjectModel']:
                return SelfReferencingObjectModel
            __annotations__ = {
                "selfRef": self_ref,
            }
        
        @staticmethod
        def additional_properties() -> typing.Type['SelfReferencingObjectModel']:
            return SelfReferencingObjectModel
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["selfRef"]) -> 'SelfReferencingObjectModel': ...
    
    @typing.overload
    def __getitem__(self, name: str) -> 'SelfReferencingObjectModel': ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["selfRef"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["selfRef"]) -> typing.Union['SelfReferencingObjectModel', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union['SelfReferencingObjectModel', schemas.Unset]: ...
    
    def get_item_oapg(
        self,
        name: typing.Union[
            typing_extensions.Literal["selfRef"],
            str
        ]
    ):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *_args: typing.Union[dict, frozendict.frozendict, ],
        selfRef: typing.Union['SelfReferencingObjectModel', schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: 'SelfReferencingObjectModel',
    ) -> 'SelfReferencingObjectModel':
        return super().__new__(
            cls,
            *_args,
            selfRef=selfRef,
            _configuration=_configuration,
            **kwargs,
        )

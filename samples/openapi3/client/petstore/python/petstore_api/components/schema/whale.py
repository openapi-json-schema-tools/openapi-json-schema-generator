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


class Whale(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        types = {frozendict.frozendict}
        required = {
            "className",
        }
        
        class Properties:
            HasBaleen = schemas.BoolSchema
            HasTeeth = schemas.BoolSchema
            
            
            class ClassName(
                schemas.StrSchema
            ):
            
            
                class MetaOapg:
                    types = {
                        str,
                    }
                    enum_value_to_name = {
                        "whale": "WHALE",
                    }
                
                @schemas.classproperty
                def WHALE(cls):
                    return cls("whale")
            __annotations__ = {
                "hasBaleen": HasBaleen,
                "hasTeeth": HasTeeth,
                "className": ClassName,
            }
    
    className: MetaOapg.Properties.ClassName
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["className"]) -> MetaOapg.Properties.ClassName: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["hasBaleen"]) -> MetaOapg.Properties.HasBaleen: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["hasTeeth"]) -> MetaOapg.Properties.HasTeeth: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["className"],
            typing_extensions.Literal["hasBaleen"],
            typing_extensions.Literal["hasTeeth"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["className"]) -> MetaOapg.Properties.ClassName: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["hasBaleen"]) -> typing.Union[MetaOapg.Properties.HasBaleen, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["hasTeeth"]) -> typing.Union[MetaOapg.Properties.HasTeeth, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(
        self,
        name: typing.Union[
            typing_extensions.Literal["className"],
            typing_extensions.Literal["hasBaleen"],
            typing_extensions.Literal["hasTeeth"],
            str
        ]
    ):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *_args: typing.Union[dict, frozendict.frozendict, ],
        className: typing.Union[MetaOapg.Properties.ClassName, str, ],
        hasBaleen: typing.Union[MetaOapg.Properties.HasBaleen, bool, schemas.Unset] = schemas.unset,
        hasTeeth: typing.Union[MetaOapg.Properties.HasTeeth, bool, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'Whale':
        return super().__new__(
            cls,
            *_args,
            className=className,
            hasBaleen=hasBaleen,
            hasTeeth=hasTeeth,
            _configuration=_configuration,
            **kwargs,
        )

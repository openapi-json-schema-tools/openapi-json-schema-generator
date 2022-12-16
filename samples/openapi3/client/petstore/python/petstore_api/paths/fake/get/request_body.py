# coding: utf-8

"""


    Generated by: https://openapi-generator.tech
"""

from dataclasses import dataclass
import typing_extensions
import urllib3

from petstore_api import api_client, exceptions
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
        types = {frozendict.frozendict}
        
        class Properties:
            
            
            class EnumFormStringArray(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    types = {tuple}
                    
                    
                    class items(
                        schemas.StrSchema
                    ):
                    
                    
                        class MetaOapg:
                            types = {
                                str,
                            }
                            enum_value_to_name = {
                                ">": "GREATER_THAN",
                                "$": "DOLLAR",
                            }
                        
                        @schemas.classproperty
                        def GREATER_THAN(cls):
                            return cls(">")
                        
                        @schemas.classproperty
                        def DOLLAR(cls):
                            return cls("$")
            
                def __new__(
                    cls,
                    _arg: typing.Union[typing.Tuple[typing.Union[MetaOapg.Items, str, ]], typing.List[typing.Union[MetaOapg.Items, str, ]]],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'EnumFormStringArray':
                    return super().__new__(
                        cls,
                        _arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> MetaOapg.items:
                    return super().__getitem__(i)
            
            
            class enum_form_string(
                schemas.StrSchema
            ):
            
            
                class MetaOapg:
                    types = {
                        str,
                    }
                    enum_value_to_name = {
                        "_abc": "_ABC",
                        "-efg": "EFG",
                        "(xyz)": "XYZ",
                    }
                
                @schemas.classproperty
                def _ABC(cls):
                    return cls("_abc")
                
                @schemas.classproperty
                def EFG(cls):
                    return cls("-efg")
                
                @schemas.classproperty
                def XYZ(cls):
                    return cls("(xyz)")
            __annotations__ = {
                "enum_form_string_array": EnumFormStringArray,
                "enum_form_string": EnumFormString,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["enum_form_string_array"]) -> MetaOapg.Properties.EnumFormStringArray: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["enum_form_string"]) -> MetaOapg.Properties.EnumFormString: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["enum_form_string_array"],
            typing_extensions.Literal["enum_form_string"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["enum_form_string_array"]) -> typing.Union[MetaOapg.Properties.EnumFormStringArray, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["enum_form_string"]) -> typing.Union[MetaOapg.Properties.EnumFormString, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(
        self,
        name: typing.Union[
            typing_extensions.Literal["enum_form_string_array"],
            typing_extensions.Literal["enum_form_string"],
            str
        ]
    ):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *_args: typing.Union[dict, frozendict.frozendict, ],
        enum_form_string_array: typing.Union[MetaOapg.Properties.EnumFormStringArray, list, tuple, schemas.Unset] = schemas.unset,
        enum_form_string: typing.Union[MetaOapg.Properties.EnumFormString, str, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'ApplicationXWwwFormUrlencoded':
        return super().__new__(
            cls,
            *_args,
            enum_form_string_array=enum_form_string_array,
            enum_form_string=enum_form_string,
            _configuration=_configuration,
            **kwargs,
        )

parameter_oapg = api_client.RequestBody(
    content={
        'application/x-www-form-urlencoded': api_client.MediaType(
            schema=application_x_www_form_urlencoded
        ),
    },
)

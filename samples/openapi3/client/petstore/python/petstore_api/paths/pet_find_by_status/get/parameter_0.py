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




class Schema(
    schemas.ListSchema
):


    class MetaOapg:
        types = {tuple}
        
        
        class Items(
            schemas.StrSchema
        ):
        
        
            class MetaOapg:
                types = {
                    str,
                }
                enum_value_to_name = {
                    "available": "AVAILABLE",
                    "pending": "PENDING",
                    "sold": "SOLD",
                }
            
            @schemas.classproperty
            def AVAILABLE(cls):
                return cls("available")
            
            @schemas.classproperty
            def PENDING(cls):
                return cls("pending")
            
            @schemas.classproperty
            def SOLD(cls):
                return cls("sold")

    def __new__(
        cls,
        _arg: typing.Union[typing.Tuple[typing.Union[MetaOapg.Items, str, ]], typing.List[typing.Union[MetaOapg.Items, str, ]]],
        _configuration: typing.Optional[schemas.Configuration] = None,
    ) -> 'Schema':
        return super().__new__(
            cls,
            _arg,
            _configuration=_configuration,
        )

    def __getitem__(self, i: int) -> MetaOapg.Items:
        return super().__getitem__(i)


parameter_oapg = api_client.QueryParameter(
    name="status",
    style=api_client.ParameterStyle.FORM,
    schema=schema.Schema,
    required=True,
)

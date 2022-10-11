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




class schema(
    schemas.DictSchema
):


    class MetaOapg:
        
        class properties:
            keyword = schemas.StrSchema
            __annotations__ = {
                "keyword": keyword,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["keyword"]) -> MetaOapg.properties.keyword: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["keyword", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["keyword"]) -> typing.Union[MetaOapg.properties.keyword, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["keyword", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        keyword: typing.Union[MetaOapg.properties.keyword, str, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'schema':
        return super().__new__(
            cls,
            *args,
            keyword=keyword,
            _configuration=_configuration,
            **kwargs,
        )


parameter_oapg = api_client.QueryParameter(
    name="mapBean",
    style=api_client.ParameterStyle.DEEP_OBJECT,
    schema=schema,
    explode=True,
)

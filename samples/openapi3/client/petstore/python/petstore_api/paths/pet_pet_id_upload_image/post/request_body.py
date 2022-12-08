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
        types = {frozendict.frozendict}
        
        class properties:
            additionalMetadata = schemas.StrSchema
            file = schemas.BinarySchema
            __annotations__ = {
                "additionalMetadata": additionalMetadata,
                "file": file,
            }
    # type hints for optional __getitem__
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["additionalMetadata"]) -> MetaOapg.properties.additionalMetadata: ...
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["file"]) -> MetaOapg.properties.file: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["additionalMetadata"], typing_extensions.Literal["file"], ]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["additionalMetadata"]) -> typing.Union[MetaOapg.properties.additionalMetadata, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["file"]) -> typing.Union[MetaOapg.properties.file, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["additionalMetadata"], typing_extensions.Literal["file"], ]):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *_args: typing.Union[dict, frozendict.frozendict, ],
        additionalMetadata: typing.Union[MetaOapg.properties.additionalMetadata, str, schemas.Unset] = schemas.unset,
        file: typing.Union[MetaOapg.properties.file, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'schema':
        return super().__new__(
            cls,
            *_args,
            additionalMetadata=additionalMetadata,
            file=file,
            _configuration=_configuration,
            **kwargs,
        )

parameter_oapg = api_client.RequestBody(
    content={
        'multipart/form-data': api_client.MediaType(
            schema=schema
        ),
    },
)

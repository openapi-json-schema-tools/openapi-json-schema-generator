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




class multipart_form_data(
    schemas.DictSchema
):


    class MetaOapg:
        types = {frozendict.frozendict}
        required = {
            "requiredFile",
        }
        
        class properties:
            additionalMetadata = schemas.StrSchema
            requiredFile = schemas.BinarySchema
            __annotations__ = {
                "additionalMetadata": additionalMetadata,
                "requiredFile": requiredFile,
            }
    
    requiredFile: MetaOapg.properties.requiredFile
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["additionalMetadata"]) -> MetaOapg.properties.additionalMetadata: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["requiredFile"]) -> MetaOapg.properties.requiredFile: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["additionalMetadata", "requiredFile", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["additionalMetadata"]) -> typing.Union[MetaOapg.properties.additionalMetadata, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["requiredFile"]) -> MetaOapg.properties.requiredFile: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["additionalMetadata", "requiredFile", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *_args: typing.Union[dict, frozendict.frozendict, ],
        requiredFile: typing.Union[MetaOapg.properties.requiredFile, bytes, io.FileIO, io.BufferedReader, ],
        additionalMetadata: typing.Union[MetaOapg.properties.additionalMetadata, str, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'multipart_form_data':
        return super().__new__(
            cls,
            *_args,
            requiredFile=requiredFile,
            additionalMetadata=additionalMetadata,
            _configuration=_configuration,
            **kwargs,
        )

parameter_oapg = api_client.RequestBody(
    content={
        'multipart/form-data': api_client.MediaType(
            schema=multipart_form_data
        ),
    },
)

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




class MultipartFormData(
    schemas.DictSchema
):


    class MetaOapg:
        types = {frozendict.frozendict}
        required = {
            "requiredFile",
        }
        
        class Properties:
            AdditionalMetadata = schemas.StrSchema
            RequiredFile = schemas.BinarySchema
            __annotations__ = {
                "additionalMetadata": AdditionalMetadata,
                "requiredFile": RequiredFile,
            }
    
    requiredFile: MetaOapg.Properties.RequiredFile
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["requiredFile"]) -> MetaOapg.Properties.RequiredFile: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["additionalMetadata"]) -> MetaOapg.Properties.AdditionalMetadata: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["requiredFile"],
            typing_extensions.Literal["additionalMetadata"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["requiredFile"]) -> MetaOapg.Properties.RequiredFile: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["additionalMetadata"]) -> typing.Union[MetaOapg.Properties.AdditionalMetadata, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(
        self,
        name: typing.Union[
            typing_extensions.Literal["requiredFile"],
            typing_extensions.Literal["additionalMetadata"],
            str
        ]
    ):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *_args: typing.Union[dict, frozendict.frozendict, ],
        requiredFile: typing.Union[MetaOapg.Properties.RequiredFile, bytes, io.FileIO, io.BufferedReader, ],
        additionalMetadata: typing.Union[MetaOapg.Properties.AdditionalMetadata, str, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'MultipartFormData':
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

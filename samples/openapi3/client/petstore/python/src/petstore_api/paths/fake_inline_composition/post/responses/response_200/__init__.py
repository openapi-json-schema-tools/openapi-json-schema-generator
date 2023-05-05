# coding: utf-8

"""


    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import dataclasses
import datetime
import decimal
import io
import typing
import uuid

import frozendict
import typing_extensions
import urllib3

from petstore_api import api_client
from petstore_api import schemas
from .content.application_json import schema as application_json_schema
from .content.multipart_form_data import schema as multipart_form_data_schema


@dataclasses.dataclass
class ApiResponseFor200(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        application_json_schema.Schema,
        multipart_form_data_schema.Schema,
    ]
    headers: schemas.Unset = schemas.unset


class ResponseFor200(api_client.OpenApiResponse[ApiResponseFor200]):
    response_cls = ApiResponseFor200


    class __ApplicationJsonMediaType(api_client.MediaType):
        schema: typing.Type[application_json_schema.Schema] = application_json_schema.Schema


    class __MultipartFormDataMediaType(api_client.MediaType):
        schema: typing.Type[multipart_form_data_schema.Schema] = multipart_form_data_schema.Schema
    __Content = typing_extensions.TypedDict(
        '__Content',
        {
            'application/json': typing.Type[__ApplicationJsonMediaType],
            'multipart/form-data': typing.Type[__MultipartFormDataMediaType],
        }
    )
    content: __Content = {
        'application/json': __ApplicationJsonMediaType,
        'multipart/form-data': __MultipartFormDataMediaType,
    }

# coding: utf-8

"""


    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import dataclasses
import typing

import typing_extensions
import urllib3

from petstore_api import api_client
from petstore_api import schemas
from .content.application_json import schema as application_json_schema


@dataclasses.dataclass
class ApiResponseFor3XX(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: application_json_schema.Schema
    headers: schemas.Unset = schemas.unset


class ResponseFor3XX(api_client.OpenApiResponse[ApiResponseFor3XX]):
    response_cls = ApiResponseFor3XX


    class __ApplicationJsonMediaType(api_client.MediaType):
        schema: typing.Type[application_json_schema.Schema] = application_json_schema.Schema
    __Content = typing_extensions.TypedDict(
        '__Content',
        {
            'application/json': typing.Type[__ApplicationJsonMediaType],
        }
    )
    content: __Content = {
        'application/json': __ApplicationJsonMediaType,
    }

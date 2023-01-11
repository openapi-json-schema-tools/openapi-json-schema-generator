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
from .content.application_json_charsetutf8 import schema as application_json_charsetutf8_schema


@dataclasses.dataclass
class ApiResponse(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        application_json_charsetutf8_schema.Schema,
    ]
    headers: schemas.Unset = schemas.unset


class _200(api_client.OpenApiResponse[ApiResponse]):
    response_cls = ApiResponse


    class __ApplicationJsonCharsetutf8MediaType(api_client.MediaType):
        schema: typing.Type[application_json_charsetutf8_schema.Schema] = application_json_charsetutf8_schema.Schema
    __Content = typing.TypedDict(
        '__Content',
        {
            'application/json; charset=utf-8': __ApplicationJsonCharsetutf8MediaType,
        }
    )
    content: __Content = {
        'application/json; charset=utf-8': __ApplicationJsonCharsetutf8MediaType,
    }

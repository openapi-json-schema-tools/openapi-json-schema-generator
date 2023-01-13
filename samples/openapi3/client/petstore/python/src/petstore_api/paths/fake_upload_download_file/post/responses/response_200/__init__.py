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
from .content.application_octet_stream import schema as application_octet_stream_schema


@dataclasses.dataclass
class ApiResponse(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        application_octet_stream_schema.Schema,
    ]
    headers: schemas.Unset = schemas.unset


class _200(api_client.OpenApiResponse[ApiResponse]):
    response_cls = ApiResponse


    class __ApplicationOctetStreamMediaType(api_client.MediaType):
        schema: typing.Type[application_octet_stream_schema.Schema] = application_octet_stream_schema.Schema
    __Content = typing_extensions.TypedDict(
        '__Content',
        {
            'application/octet-stream': __ApplicationOctetStreamMediaType,
        }
    )
    content: __Content = {
        'application/octet-stream': __ApplicationOctetStreamMediaType,
    }

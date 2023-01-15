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


@dataclasses.dataclass
class ApiResponse(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        schemas.Unset,
        schemas.Unset,
    ]
    headers: schemas.Unset = schemas.unset


class _200(api_client.OpenApiResponse[ApiResponse]):
    response_cls = ApiResponse


    class __ApplicationJsonMediaType(api_client.MediaType):
        pass


    class __ApplicationXmlMediaType(api_client.MediaType):
        pass
    __Content = typing_extensions.TypedDict(
        '__Content',
        {
            'application/json': __ApplicationJsonMediaType,
            'application/xml': __ApplicationXmlMediaType,
        }
    )
    content: __Content = {
        'application/json': __ApplicationJsonMediaType,
        'application/xml': __ApplicationXmlMediaType,
    }
import dataclasses
import typing

import typing_extensions
import urllib3

from petstore_api import api_client
from petstore_api import schemas
from . import application_json_charsetutf_8


@dataclasses.dataclass
class ApiResponse(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        application_json_charsetutf_8.ApplicationJsonCharsetutf8,
    ]
    headers: schemas.Unset = schemas.unset


response = api_client.OpenApiResponse(
    response_cls=ApiResponse,
    content={
        'application/json; charset=utf-8': api_client.MediaType(
            application_json_charsetutf_8.ApplicationJsonCharsetutf8,
        ),
    },
)

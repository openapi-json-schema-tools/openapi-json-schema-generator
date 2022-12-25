import dataclasses
from datetime import date, datetime
import decimal
import io
import typing
import uuid

import frozendict
import typing_extensions
import urllib3

from petstore_api import api_client
from petstore_api import schemas
from . import application_octet_stream


@dataclasses.dataclass
class ApiResponse(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        application_octet_stream.ApplicationOctetStream,
    ]
    headers: schemas.Unset = schemas.unset


response = api_client.OpenApiResponse(
    response_cls=ApiResponse,
    content={
        'application/octet-stream': api_client.MediaType(
            application_octet_stream.ApplicationOctetStream,
        ),
    },
)

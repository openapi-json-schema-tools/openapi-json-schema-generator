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


@dataclasses.dataclass
class ApiResponse(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        schemas.Unset,
        schemas.Unset,
    ]
    headers: schemas.Unset = schemas.unset


class _200(api_client.OpenApiResponse):
    response_cls=ApiResponse
    content={
        'application/json': api_client.MediaType(
        ),
        'application/xml': api_client.MediaType(
        ),
    }

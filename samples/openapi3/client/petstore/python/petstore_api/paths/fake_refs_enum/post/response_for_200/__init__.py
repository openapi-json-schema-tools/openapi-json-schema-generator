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

from petstore_api.components.schema import string_enum


@dataclasses.dataclass
class ApiResponse(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        string_enum.StringEnum,
    ]
    headers: schemas.Unset = schemas.unset


class _200(api_client.OpenApiResponse):
    response_cls=ApiResponse
    content={
        'application/json': api_client.MediaType(
            string_enum.StringEnum,
        ),
    }

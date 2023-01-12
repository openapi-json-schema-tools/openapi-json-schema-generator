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
    body: schemas.Unset = schemas.unset
    headers: schemas.Unset = schemas.unset


class _405(api_client.OpenApiResponse[ApiResponse]):
    response_cls = ApiResponse
    __Content = typing_extensions.TypedDict(
        '__Content',
        {
        }
    )
    content: __Content = {
    }

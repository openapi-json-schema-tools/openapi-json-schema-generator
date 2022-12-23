import dataclasses
import typing

import urllib3

from petstore_api import api_client
from petstore_api import schemas

from petstore_api.components.schema import string


@dataclasses.dataclass
class ApiResponse(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        string.String,
    ]
    headers: schemas.Unset = schemas.unset


response = api_client.OpenApiResponse(
    response_cls=ApiResponse,
    content={
        'application/json': api_client.MediaType(
            string.String,
        ),
    },
)

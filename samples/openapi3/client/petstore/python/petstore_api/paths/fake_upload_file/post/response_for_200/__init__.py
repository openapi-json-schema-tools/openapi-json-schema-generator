import dataclasses
import typing

import urllib3

from petstore_api import api_client
from petstore_api import schemas

from petstore_api.components.schema import api_response


@dataclasses.dataclass
class ApiResponse(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        api_response.ApiResponse,
    ]
    headers: schemas.Unset = schemas.unset


response = api_client.OpenApiResponse(
    response_cls=ApiResponse,
    content={
        'application/json': api_client.MediaType(
            api_response.ApiResponse,
        ),
    },
)

import dataclasses
import urllib3

from petstore_api import api_client


@dataclasses.dataclass
class ApiResponse(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        schemas.Unset,
        schemas.Unset,
    ]
    headers: schemas.Unset = schemas.unset


response = api_client.OpenApiResponse(
    response_cls=ApiResponse,
    content={
        'application/json': api_client.MediaType(
        ),
        'application/xml': api_client.MediaType(
        ),
    },
)

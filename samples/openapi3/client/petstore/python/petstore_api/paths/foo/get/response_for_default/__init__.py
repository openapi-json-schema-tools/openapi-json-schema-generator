import dataclasses
import urllib3

from petstore_api import api_client

from petstore_api.components.schema import foo
from . import application_json


@dataclasses.dataclass
class ApiResponse(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        application_json.ApplicationJson,
    ]
    headers: schemas.Unset = schemas.unset


response = api_client.OpenApiResponse(
    response_cls=ApiResponse,
    content={
        'application/json': api_client.MediaType(
            application_json.ApplicationJson,
        ),
    },
)

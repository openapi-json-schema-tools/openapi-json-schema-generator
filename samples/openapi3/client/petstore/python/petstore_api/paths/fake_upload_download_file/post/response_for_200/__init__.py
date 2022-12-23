import dataclasses
import urllib3

from petstore_api import api_client
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

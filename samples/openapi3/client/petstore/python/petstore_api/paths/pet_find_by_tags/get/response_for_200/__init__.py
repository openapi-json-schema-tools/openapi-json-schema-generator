import dataclasses
import typing

import typing_extensions
import urllib3

from petstore_api import api_client
from petstore_api import schemas
from . import application_xml
from . import application_json


@dataclasses.dataclass
class ApiResponse(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        application_xml.ApplicationXml,
        application_json.ApplicationJson,
    ]
    headers: schemas.Unset = schemas.unset


response = api_client.OpenApiResponse(
    response_cls=ApiResponse,
    content={
        'application/xml': api_client.MediaType(
            application_xml.ApplicationXml,
        ),
        'application/json': api_client.MediaType(
            application_json.ApplicationJson,
        ),
    },
)

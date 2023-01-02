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


class _200(api_client.OpenApiResponse[ApiResponse]):
    response_cls = ApiResponse
    content = {
        'application/xml': api_client.MediaType(
            application_xml.ApplicationXml,
        ),
        'application/json': api_client.MediaType(
            application_json.ApplicationJson,
        ),
    }
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
from .content.application_xml import schema as application_xml_schema
from .content.application_json import schema as application_json_schema


@dataclasses.dataclass
class ApiResponse(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        application_xml_schema.Schema,
        application_json_schema.Schema,
    ]
    headers: schemas.Unset = schemas.unset


class _200(api_client.OpenApiResponse[ApiResponse]):
    response_cls = ApiResponse
    content = {
        'application/xml': api_client.MediaType(
            application_xml_schema.Schema,
        ),
        'application/json': api_client.MediaType(
            application_json_schema.Schema,
        ),
    }

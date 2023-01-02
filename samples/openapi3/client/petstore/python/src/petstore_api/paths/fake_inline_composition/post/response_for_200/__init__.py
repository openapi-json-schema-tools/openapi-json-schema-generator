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
from . import application_json
from . import multipart_form_data


@dataclasses.dataclass
class ApiResponse(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        application_json.ApplicationJson,
        multipart_form_data.MultipartFormData,
    ]
    headers: schemas.Unset = schemas.unset


class _200(api_client.OpenApiResponse[ApiResponse]):
    response_cls = ApiResponse
    content = {
        'application/json': api_client.MediaType(
            application_json.ApplicationJson,
        ),
        'multipart/form-data': api_client.MediaType(
            multipart_form_data.MultipartFormData,
        ),
    }

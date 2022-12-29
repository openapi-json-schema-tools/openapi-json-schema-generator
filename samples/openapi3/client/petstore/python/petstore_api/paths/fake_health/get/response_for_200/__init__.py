import dataclasses
from datetime import date, datetime
import decimal
import io
import typing
import uuid

import frozendict
import typing_extensions
import urllib3

from petstore_api import api_client
from petstore_api import schemas

from petstore_api.components.schema import health_check_result


@dataclasses.dataclass
class ApiResponse(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        health_check_result.HealthCheckResult,
    ]
    headers: schemas.Unset = schemas.unset


class _200(api_client.OpenApiResponse):
    response_cls=ApiResponse
    content={
        'application/json': api_client.MediaType(
            health_check_result.HealthCheckResult,
        ),
    }

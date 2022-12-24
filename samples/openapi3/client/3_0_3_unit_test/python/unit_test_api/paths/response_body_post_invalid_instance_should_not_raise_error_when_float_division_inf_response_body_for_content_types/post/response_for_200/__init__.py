import dataclasses
import decimal
import io
import typing
import uuid

import frozendict
import typing_extensions
import urllib3

from unit_test_api import api_client
from unit_test_api import schemas

from unit_test_api.components.schema import invalid_instance_should_not_raise_error_when_float_division_inf


@dataclasses.dataclass
class ApiResponse(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        invalid_instance_should_not_raise_error_when_float_division_inf.InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf,
    ]
    headers: schemas.Unset = schemas.unset


response = api_client.OpenApiResponse(
    response_cls=ApiResponse,
    content={
        'application/json': api_client.MediaType(
            invalid_instance_should_not_raise_error_when_float_division_inf.InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf,
        ),
    },
)

import dataclasses
import datetime
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


class _200(api_client.OpenApiResponse[ApiResponse]):
    response_cls = ApiResponse


    class __ApplicationJsonMediaType(api_client.MediaType):
        schema: typing.Type[invalid_instance_should_not_raise_error_when_float_division_inf.InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf] = invalid_instance_should_not_raise_error_when_float_division_inf.InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf
    __Content = typing_extensions.TypedDict(
        '__Content',
        {
            'application/json': __ApplicationJsonMediaType,
        }
    )
    content: __Content = {
        'application/json': __ApplicationJsonMediaType,
    }
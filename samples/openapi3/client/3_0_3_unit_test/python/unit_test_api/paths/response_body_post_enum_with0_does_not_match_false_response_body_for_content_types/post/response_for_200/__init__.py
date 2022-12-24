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

from unit_test_api.components.schema import enum_with0_does_not_match_false


@dataclasses.dataclass
class ApiResponse(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        enum_with0_does_not_match_false.EnumWith0DoesNotMatchFalse,
    ]
    headers: schemas.Unset = schemas.unset


response = api_client.OpenApiResponse(
    response_cls=ApiResponse,
    content={
        'application/json': api_client.MediaType(
            enum_with0_does_not_match_false.EnumWith0DoesNotMatchFalse,
        ),
    },
)

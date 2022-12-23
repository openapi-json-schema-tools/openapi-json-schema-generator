import dataclasses
import typing

import urllib3

from unit_test_api import api_client
from unit_test_api import schemas

from unit_test_api.components.schema import nested_anyof_to_check_validation_semantics


@dataclasses.dataclass
class ApiResponse(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        nested_anyof_to_check_validation_semantics.NestedAnyofToCheckValidationSemantics,
    ]
    headers: schemas.Unset = schemas.unset


response = api_client.OpenApiResponse(
    response_cls=ApiResponse,
    content={
        'application/json': api_client.MediaType(
            nested_anyof_to_check_validation_semantics.NestedAnyofToCheckValidationSemantics,
        ),
    },
)

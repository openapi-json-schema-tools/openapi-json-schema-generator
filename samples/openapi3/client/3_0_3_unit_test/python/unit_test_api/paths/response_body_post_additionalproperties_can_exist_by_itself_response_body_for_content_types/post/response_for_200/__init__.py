import dataclasses
import typing

import typing_extensions
import urllib3

from unit_test_api import api_client
from unit_test_api import schemas

from unit_test_api.components.schema import additionalproperties_can_exist_by_itself


@dataclasses.dataclass
class ApiResponse(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        additionalproperties_can_exist_by_itself.AdditionalpropertiesCanExistByItself,
    ]
    headers: schemas.Unset = schemas.unset


response = api_client.OpenApiResponse(
    response_cls=ApiResponse,
    content={
        'application/json': api_client.MediaType(
            additionalproperties_can_exist_by_itself.AdditionalpropertiesCanExistByItself,
        ),
    },
)

import dataclasses
import typing

import typing_extensions
import urllib3

from petstore_api import api_client
from petstore_api import schemas

from petstore_api.components.schema import additional_properties_with_array_of_enums


@dataclasses.dataclass
class ApiResponse(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        additional_properties_with_array_of_enums.AdditionalPropertiesWithArrayOfEnums,
    ]
    headers: schemas.Unset = schemas.unset


response = api_client.OpenApiResponse(
    response_cls=ApiResponse,
    content={
        'application/json': api_client.MediaType(
            additional_properties_with_array_of_enums.AdditionalPropertiesWithArrayOfEnums,
        ),
    },
)

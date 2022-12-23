import dataclasses
import urllib3

from petstore_api import api_client

from petstore_api.components.schema import array_of_enums


@dataclasses.dataclass
class ApiResponse(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        array_of_enums.ArrayOfEnums,
    ]
    headers: schemas.Unset = schemas.unset


response = api_client.OpenApiResponse(
    response_cls=ApiResponse,
    content={
        'application/json': api_client.MediaType(
            array_of_enums.ArrayOfEnums,
        ),
    },
)

import dataclasses
import urllib3

from petstore_api import api_client

from petstore_api.components.schema import composed_one_of_different_types


@dataclasses.dataclass
class ApiResponse(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        composed_one_of_different_types.ComposedOneOfDifferentTypes,
    ]
    headers: schemas.Unset = schemas.unset


response = api_client.OpenApiResponse(
    response_cls=ApiResponse,
    content={
        'application/json': api_client.MediaType(
            composed_one_of_different_types.ComposedOneOfDifferentTypes,
        ),
    },
)

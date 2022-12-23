import dataclasses
import urllib3

from petstore_api import api_client

from petstore_api.components.schema import order


@dataclasses.dataclass
class ApiResponse(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        order.Order,
        order.Order,
    ]
    headers: schemas.Unset = schemas.unset


response = api_client.OpenApiResponse(
    response_cls=ApiResponse,
    content={
        'application/xml': api_client.MediaType(
            order.Order,
        ),
        'application/json': api_client.MediaType(
            order.Order,
        ),
    },
)

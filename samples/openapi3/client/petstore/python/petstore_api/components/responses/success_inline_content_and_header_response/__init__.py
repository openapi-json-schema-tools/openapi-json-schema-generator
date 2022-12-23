import dataclasses
import typing

import urllib3

from petstore_api import api_client
from petstore_api import schemas
from . import application_json
from . import parameter_some_header


class Header:
    RequiredParams = typing_extensions.TypedDict(
        'RequiredParams',
        {
        }
    )
    OptionalParams = typing_extensions.TypedDict(
        'OptionalParams',
        {
            'someHeader': typing.Union[parameter_some_header.Schema, str, ],
        },
        total=False
    )


    class Params(RequiredParams, OptionalParams):
        pass


    parameters = [
        parameter_some_header.parameter_oapg,
    ]

@dataclasses.dataclass
class ApiResponse(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        application_json.ApplicationJson,
    ]
    headers: Header.Params


response = api_client.OpenApiResponse(
    response_cls=ApiResponse,
    content={
        'application/json': api_client.MediaType(
            application_json.ApplicationJson,
        ),
    },
    headers=Header.parameters
)

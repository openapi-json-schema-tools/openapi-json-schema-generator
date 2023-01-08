import dataclasses
import datetime
import decimal
import io
import typing
import uuid

import frozendict
import typing_extensions
import urllib3

from petstore_api import api_client
from petstore_api import schemas
from . import schema
from . import header_some_header


class Header:
    RequiredParams = typing_extensions.TypedDict(
        'RequiredParams',
        {
        }
    )
    OptionalParams = typing_extensions.TypedDict(
        'OptionalParams',
        {
            'someHeader': typing.Union[header_some_header.schema.Schema, str, ],
        },
        total=False
    )


    class Params(RequiredParams, OptionalParams):
        pass


    parameters = [
        header_some_header.SomeHeader,
    ]

@dataclasses.dataclass
class ApiResponse(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        schema.Schema,
    ]
    headers: Header.Params


class SuccessInlineContentAndHeader(api_client.OpenApiResponse[ApiResponse]):
    response_cls = ApiResponse
    content = {
        'application/json': api_client.MediaType(
            schema.Schema,
        ),
    }
    headers=Header.parameters

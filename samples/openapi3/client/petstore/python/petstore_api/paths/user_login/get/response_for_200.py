import dataclasses
import urllib3

from petstore_api import api_client
from datetime import date, datetime  # noqa: F401
import decimal  # noqa: F401
import functools  # noqa: F401
import io  # noqa: F401
import re  # noqa: F401
import typing  # noqa: F401
import typing_extensions  # noqa: F401
import uuid  # noqa: F401

import frozendict  # noqa: F401

from petstore_api import schemas  # noqa: F401


class Header:
    RequiredParams = typing_extensions.TypedDict(
        'RequiredParams',
        {
        }
    )
    OptionalParams = typing_extensions.TypedDict(
        'OptionalParams',
        {
            'X-Rate-Limit': typing.Union[x_rate_limit.x_rate_limit, decimal.Decimal, int, ],
            'X-Expires-After': typing.Union[x_expires_after.x_expires_after, str, datetime, ],
        },
        total=False
    )


    class Params(RequiredParams, OptionalParams):
        pass


    parameters = [
        x_rate_limit.parameter_oapg,
        x_expires_after.parameter_oapg,
    ]

class BodySchemas:
    # body schemas
    application_xml = schemas.StrSchema
    application_json = schemas.StrSchema
    pass


@dataclasses.dataclass
class ApiResponse(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        BodySchemas.application_xml,
        BodySchemas.application_json,
    ]
    headers: Header.Params


response = api_client.OpenApiResponse(
    response_cls=ApiResponse,
    content={
        'application/xml': api_client.MediaType(
            schema=BodySchemas.application_xml,
        ),
        'application/json': api_client.MediaType(
            schema=BodySchemas.application_json,
        ),
    },
    headers=Header.parameters
)

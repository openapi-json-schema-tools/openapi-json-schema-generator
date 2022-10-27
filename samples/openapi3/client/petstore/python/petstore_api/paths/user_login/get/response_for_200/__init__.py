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
from . import parameter_x_rate_limit
from . import parameter_x_expires_after


class Header:
    RequiredParams = typing_extensions.TypedDict(
        'RequiredParams',
        {
            'X-Rate-Limit': typing.Union[parameter_x_rate_limit.application_json, decimal.Decimal, int, ],
        }
    )
    OptionalParams = typing_extensions.TypedDict(
        'OptionalParams',
        {
            'X-Expires-After': typing.Union[parameter_x_expires_after.schema, str, datetime, ],
        },
        total=False
    )


    class Params(RequiredParams, OptionalParams):
        pass


    parameters = [
        parameter_x_rate_limit.parameter_oapg,
        parameter_x_expires_after.parameter_oapg,
    ]
# body schemas
application_xml = schemas.StrSchema
application_json = schemas.StrSchema


@dataclasses.dataclass
class ApiResponse(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        application_xml,
        application_json,
    ]
    headers: Header.Params


response = api_client.OpenApiResponse(
    response_cls=ApiResponse,
    content={
        'application/xml': api_client.MediaType(
            schema=application_xml,
        ),
        'application/json': api_client.MediaType(
            schema=application_json,
        ),
    },
    headers=Header.parameters
)

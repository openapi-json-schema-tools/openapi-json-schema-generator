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

from petstore_api.model.user import User


class BodySchemas:
    # body schemas
    application_xml = User
    application_json = User
    pass


@dataclasses.dataclass
class ApiResponse(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        BodySchemas.application_xml,
        BodySchemas.application_json,
    ]
    headers: schemas.Unset = schemas.unset


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
)

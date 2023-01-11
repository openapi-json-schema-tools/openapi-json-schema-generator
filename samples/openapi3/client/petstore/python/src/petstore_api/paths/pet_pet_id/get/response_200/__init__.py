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

from petstore_api.components.schema import pet


@dataclasses.dataclass
class ApiResponse(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        pet.Pet,
        pet.Pet,
    ]
    headers: schemas.Unset = schemas.unset


class _200(api_client.OpenApiResponse[ApiResponse]):
    response_cls = ApiResponse


    class __ApplicationXmlMediaType(api_client.MediaType):
        schema: typing.Type[pet.Pet] = pet.Pet


    class __ApplicationJsonMediaType(api_client.MediaType):
        schema: typing.Type[pet.Pet] = pet.Pet
    __Content = typing.TypedDict(
        '__Content',
        {
            'application/xml': __ApplicationXmlMediaType,
            'application/json': __ApplicationJsonMediaType,
        }
    )
    content: __Content = {
        'application/xml': __ApplicationXmlMediaType,
        'application/json': __ApplicationJsonMediaType,
    }

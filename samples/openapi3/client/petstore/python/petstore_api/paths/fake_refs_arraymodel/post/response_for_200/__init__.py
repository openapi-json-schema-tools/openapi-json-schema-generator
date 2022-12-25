import dataclasses
from datetime import date, datetime
import decimal
import io
import typing
import uuid

import frozendict
import typing_extensions
import urllib3

from petstore_api import api_client
from petstore_api import schemas

from petstore_api.components.schema import animal_farm


@dataclasses.dataclass
class ApiResponse(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        animal_farm.AnimalFarm,
    ]
    headers: schemas.Unset = schemas.unset


response = api_client.OpenApiResponse(
    response_cls=ApiResponse,
    content={
        'application/json': api_client.MediaType(
            animal_farm.AnimalFarm,
        ),
    },
)

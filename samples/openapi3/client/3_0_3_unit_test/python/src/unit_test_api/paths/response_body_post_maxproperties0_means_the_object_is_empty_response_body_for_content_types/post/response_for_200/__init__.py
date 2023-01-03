import dataclasses
import datetime
import decimal
import io
import typing
import uuid

import frozendict
import typing_extensions
import urllib3

from unit_test_api import api_client
from unit_test_api import schemas

from unit_test_api.components.schema import maxproperties0_means_the_object_is_empty


@dataclasses.dataclass
class ApiResponse(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        maxproperties0_means_the_object_is_empty.Maxproperties0MeansTheObjectIsEmpty,
    ]
    headers: schemas.Unset = schemas.unset


class _200(api_client.OpenApiResponse[ApiResponse]):
    response_cls = ApiResponse
    content = {
        'application/json': api_client.MediaType(
            maxproperties0_means_the_object_is_empty.Maxproperties0MeansTheObjectIsEmpty,
        ),
    }
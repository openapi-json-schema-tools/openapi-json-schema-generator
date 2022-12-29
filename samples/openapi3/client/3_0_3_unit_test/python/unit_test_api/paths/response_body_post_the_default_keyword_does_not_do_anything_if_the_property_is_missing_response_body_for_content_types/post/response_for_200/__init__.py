import dataclasses
from datetime import date, datetime
import decimal
import io
import typing
import uuid

import frozendict
import typing_extensions
import urllib3

from unit_test_api import api_client
from unit_test_api import schemas

from unit_test_api.components.schema import the_default_keyword_does_not_do_anything_if_the_property_is_missing


@dataclasses.dataclass
class ApiResponse(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        the_default_keyword_does_not_do_anything_if_the_property_is_missing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing,
    ]
    headers: schemas.Unset = schemas.unset


class _200(api_client.OpenApiResponse[ApiResponse]):
    response_cls = ApiResponse
    content = {
        'application/json': api_client.MediaType(
            the_default_keyword_does_not_do_anything_if_the_property_is_missing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing,
        ),
    }

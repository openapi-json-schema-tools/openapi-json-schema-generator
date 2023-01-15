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

from unit_test_api.components.schema import additionalproperties_allows_a_schema_which_should_validate


@dataclasses.dataclass
class ApiResponse(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        additionalproperties_allows_a_schema_which_should_validate.AdditionalpropertiesAllowsASchemaWhichShouldValidate,
    ]
    headers: schemas.Unset = schemas.unset


class _200(api_client.OpenApiResponse[ApiResponse]):
    response_cls = ApiResponse


    class __ApplicationJsonMediaType(api_client.MediaType):
        schema: typing.Type[additionalproperties_allows_a_schema_which_should_validate.AdditionalpropertiesAllowsASchemaWhichShouldValidate] = additionalproperties_allows_a_schema_which_should_validate.AdditionalpropertiesAllowsASchemaWhichShouldValidate
    __Content = typing_extensions.TypedDict(
        '__Content',
        {
            'application/json': __ApplicationJsonMediaType,
        }
    )
    content: __Content = {
        'application/json': __ApplicationJsonMediaType,
    }
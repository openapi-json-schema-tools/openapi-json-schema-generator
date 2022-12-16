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
from petstore_api.components.headers import ref_schema_header_header as parameter_ref_schema_header
from . import parameter_x_rate_limit
from petstore_api.components.headers import int32_json_content_type_header_header as parameter_int32_json_content_type_header
from . import parameter_x_expires_after
from petstore_api.components.headers import ref_content_schema_header_header as parameter_ref_content_schema_header
from petstore_api.components.headers import string_header_header as parameter_string_header
from petstore_api.components.headers import number_header_header as parameter_number_header


class Header:
    RequiredParams = typing_extensions.TypedDict(
        'RequiredParams',
        {
            'ref-schema-header': typing.Union[parameter_ref_schema_header.schema, ],
            'X-Rate-Limit': typing.Union[parameter_x_rate_limit.application_json, decimal.Decimal, int, ],
            'int32': typing.Union[parameter_int32_json_content_type_header.application_json, decimal.Decimal, int, ],
            'ref-content-schema-header': typing.Union[parameter_ref_content_schema_header.application_json, ],
            'stringHeader': typing.Union[parameter_string_header.schema, str, ],
        }
    )
    OptionalParams = typing_extensions.TypedDict(
        'OptionalParams',
        {
            'X-Expires-After': typing.Union[parameter_x_expires_after.schema, str, datetime, ],
            'numberHeader': typing.Union[parameter_number_header.schema, str, ],
        },
        total=False
    )


    class Params(RequiredParams, OptionalParams):
        pass


    parameters = [
        parameter_ref_schema_header.parameter_oapg,
        parameter_x_rate_limit.parameter_oapg,
        parameter_int32_json_content_type_header.parameter_oapg,
        parameter_x_expires_after.parameter_oapg,
        parameter_ref_content_schema_header.parameter_oapg,
        parameter_string_header.parameter_oapg,
        parameter_number_header.parameter_oapg,
    ]
# body schemas
ApplicationXml = schemas.StrSchema
ApplicationJson = schemas.StrSchema


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

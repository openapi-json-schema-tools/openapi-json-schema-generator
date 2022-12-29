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

from petstore_api.components.schema import api_response
from petstore_api.components.headers import header_ref_schema_header
from petstore_api.components.headers import header_int32_json_content_type_header
from petstore_api.components.headers import header_ref_content_schema_header
from petstore_api.components.headers import header_string_header
from petstore_api.components.headers import header_number_header


class Header:
    RequiredParams = typing_extensions.TypedDict(
        'RequiredParams',
        {
            'ref-schema-header': typing.Union[header_ref_schema_header.string_with_validation.StringWithValidation, ],
            'int32': typing.Union[header_int32_json_content_type_header.application_json.ApplicationJson, decimal.Decimal, int, ],
            'ref-content-schema-header': typing.Union[header_ref_content_schema_header.string_with_validation.StringWithValidation, ],
            'stringHeader': typing.Union[header_string_header.schema.Schema, str, ],
        }
    )
    OptionalParams = typing_extensions.TypedDict(
        'OptionalParams',
        {
            'numberHeader': typing.Union[header_number_header.schema.Schema, str, ],
        },
        total=False
    )


    class Params(RequiredParams, OptionalParams):
        pass


    parameters = [
        header_ref_schema_header.parameter_oapg,
        header_int32_json_content_type_header.parameter_oapg,
        header_ref_content_schema_header.parameter_oapg,
        header_string_header.parameter_oapg,
        header_number_header.parameter_oapg,
    ]

@dataclasses.dataclass
class ApiResponse(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        api_response.ApiResponse,
    ]
    headers: Header.Params


class SuccessWithJsonApiResponse(api_client.OpenApiResponse):
    response_cls=ApiResponse
    content={
        'application/json': api_client.MediaType(
            api_response.ApiResponse,
        ),
    }
    headers=Header.parameters

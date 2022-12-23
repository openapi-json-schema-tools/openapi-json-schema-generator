import dataclasses
import typing

import urllib3

from petstore_api import api_client
from petstore_api import schemas

from petstore_api.components.schema import api_response
from petstore_api.components.headers import ref_schema_header_header as parameter_ref_schema_header
from petstore_api.components.headers import int32_json_content_type_header_header as parameter_int32_json_content_type_header
from petstore_api.components.headers import ref_content_schema_header_header as parameter_ref_content_schema_header
from petstore_api.components.headers import string_header_header as parameter_string_header
from petstore_api.components.headers import number_header_header as parameter_number_header


class Header:
    RequiredParams = typing_extensions.TypedDict(
        'RequiredParams',
        {
            'ref-schema-header': typing.Union[parameter_ref_schema_header.string_with_validation.StringWithValidation, ],
            'int32': typing.Union[parameter_int32_json_content_type_header.application_json.ApplicationJson, decimal.Decimal, int, ],
            'ref-content-schema-header': typing.Union[parameter_ref_content_schema_header.string_with_validation.StringWithValidation, ],
            'stringHeader': typing.Union[parameter_string_header.schema.Schema, str, ],
        }
    )
    OptionalParams = typing_extensions.TypedDict(
        'OptionalParams',
        {
            'numberHeader': typing.Union[parameter_number_header.Schema, str, ],
        },
        total=False
    )


    class Params(RequiredParams, OptionalParams):
        pass


    parameters = [
        parameter_ref_schema_header.parameter_oapg,
        parameter_int32_json_content_type_header.parameter_oapg,
        parameter_ref_content_schema_header.parameter_oapg,
        parameter_string_header.parameter_oapg,
        parameter_number_header.parameter_oapg,
    ]

@dataclasses.dataclass
class ApiResponse(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        api_response.ApiResponse,
    ]
    headers: Header.Params


response = api_client.OpenApiResponse(
    response_cls=ApiResponse,
    content={
        'application/json': api_client.MediaType(
            api_response.ApiResponse,
        ),
    },
    headers=Header.parameters
)

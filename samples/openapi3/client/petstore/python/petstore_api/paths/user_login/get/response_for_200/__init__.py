import dataclasses
import decimal
import io
import typing
import uuid

import frozendict
import typing_extensions
import urllib3

from petstore_api import api_client
from petstore_api import schemas
from . import application_xml
from . import application_json
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
            'ref-schema-header': typing.Union[parameter_ref_schema_header.string_with_validation.StringWithValidation, ],
            'X-Rate-Limit': typing.Union[parameter_x_rate_limit.application_json.ApplicationJson, decimal.Decimal, int, ],
            'int32': typing.Union[parameter_int32_json_content_type_header.application_json.ApplicationJson, decimal.Decimal, int, ],
            'ref-content-schema-header': typing.Union[parameter_ref_content_schema_header.string_with_validation.StringWithValidation, ],
            'stringHeader': typing.Union[parameter_string_header.schema.Schema, str, ],
        }
    )
    OptionalParams = typing_extensions.TypedDict(
        'OptionalParams',
        {
            'X-Expires-After': typing.Union[parameter_x_expires_after.schema.Schema, str, datetime, ],
            'numberHeader': typing.Union[parameter_number_header.schema.Schema, str, ],
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

@dataclasses.dataclass
class ApiResponse(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        application_xml.ApplicationXml,
        application_json.ApplicationJson,
    ]
    headers: Header.Params


response = api_client.OpenApiResponse(
    response_cls=ApiResponse,
    content={
        'application/xml': api_client.MediaType(
            application_xml.ApplicationXml,
        ),
        'application/json': api_client.MediaType(
            application_json.ApplicationJson,
        ),
    },
    headers=Header.parameters
)

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
from . import application_xml
from . import application_json
from petstore_api.components.headers import ref_schema_header_header as ref_schema_header_header
from . import x_rate_limit_header
from petstore_api.components.headers import int32_json_content_type_header_header as int32_json_content_type_header_header
from . import x_expires_after_header
from petstore_api.components.headers import ref_content_schema_header_header as ref_content_schema_header_header
from petstore_api.components.headers import string_header_header as string_header_header
from petstore_api.components.headers import number_header_header as number_header_header


class Header:
    RequiredParams = typing_extensions.TypedDict(
        'RequiredParams',
        {
            'ref-schema-header': typing.Union[ref_schema_header_header.string_with_validation.StringWithValidation, ],
            'X-Rate-Limit': typing.Union[x_rate_limit_header.application_json.ApplicationJson, decimal.Decimal, int, ],
            'int32': typing.Union[int32_json_content_type_header_header.application_json.ApplicationJson, decimal.Decimal, int, ],
            'ref-content-schema-header': typing.Union[ref_content_schema_header_header.string_with_validation.StringWithValidation, ],
            'stringHeader': typing.Union[string_header_header.schema.Schema, str, ],
        }
    )
    OptionalParams = typing_extensions.TypedDict(
        'OptionalParams',
        {
            'X-Expires-After': typing.Union[x_expires_after_header.schema.Schema, str, datetime, ],
            'numberHeader': typing.Union[number_header_header.schema.Schema, str, ],
        },
        total=False
    )


    class Params(RequiredParams, OptionalParams):
        pass


    parameters = [
        ref_schema_header_header.parameter_oapg,
        x_rate_limit_header.parameter_oapg,
        int32_json_content_type_header_header.parameter_oapg,
        x_expires_after_header.parameter_oapg,
        ref_content_schema_header_header.parameter_oapg,
        string_header_header.parameter_oapg,
        number_header_header.parameter_oapg,
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

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
from petstore_api.components.headers import header_ref_schema_header
from . import header_x_rate_limit
from petstore_api.components.headers import header_int32_json_content_type_header
from . import header_x_expires_after
from petstore_api.components.headers import header_ref_content_schema_header
from petstore_api.components.headers import header_string_header
from petstore_api.components.headers import header_number_header


class Header:
    RequiredParams = typing_extensions.TypedDict(
        'RequiredParams',
        {
            'ref-schema-header': typing.Union[header_ref_schema_header.string_with_validation.StringWithValidation, ],
            'X-Rate-Limit': typing.Union[header_x_rate_limit.application_json.ApplicationJson, decimal.Decimal, int, ],
            'int32': typing.Union[header_int32_json_content_type_header.application_json.ApplicationJson, decimal.Decimal, int, ],
            'ref-content-schema-header': typing.Union[header_ref_content_schema_header.string_with_validation.StringWithValidation, ],
            'stringHeader': typing.Union[header_string_header.schema.Schema, str, ],
        }
    )
    OptionalParams = typing_extensions.TypedDict(
        'OptionalParams',
        {
            'X-Expires-After': typing.Union[header_x_expires_after.schema.Schema, str, datetime, ],
            'numberHeader': typing.Union[header_number_header.schema.Schema, str, ],
        },
        total=False
    )


    class Params(RequiredParams, OptionalParams):
        pass


    parameters = [
        header_ref_schema_header.RefSchemaHeader,
        header_x_rate_limit.XRateLimit,
        header_int32_json_content_type_header.Int32JsonContentTypeHeader,
        header_x_expires_after.XExpiresAfter,
        header_ref_content_schema_header.RefContentSchemaHeader,
        header_string_header.StringHeader,
        header_number_header.NumberHeader,
    ]

@dataclasses.dataclass
class ApiResponse(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        application_xml.ApplicationXml,
        application_json.ApplicationJson,
    ]
    headers: Header.Params


class _200(api_client.OpenApiResponse[ApiResponse]):
    response_cls = ApiResponse
    content = {
        'application/xml': api_client.MediaType(
            application_xml.ApplicationXml,
        ),
        'application/json': api_client.MediaType(
            application_json.ApplicationJson,
        ),
    }
    headers=Header.parameters

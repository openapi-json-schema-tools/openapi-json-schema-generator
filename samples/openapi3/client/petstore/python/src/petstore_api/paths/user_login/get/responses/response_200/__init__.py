import dataclasses
import datetime
import decimal
import io
import typing
import uuid

import frozendict
import typing_extensions
import urllib3

from petstore_api import api_client
from petstore_api import schemas
from .content.application_xml import schema as application_xml_schema
from .content.application_json import schema as application_json_schema
from petstore_api.components.headers import header_ref_schema_header
from .headers import header_x_rate_limit
from petstore_api.components.headers import header_int32_json_content_type_header
from .headers import header_x_expires_after
from petstore_api.components.headers import header_ref_content_schema_header
from petstore_api.components.headers import header_string_header
from petstore_api.components.headers import header_number_header


class Header:
    RequiredParams = typing_extensions.TypedDict(
        'RequiredParams',
        {
            'ref-schema-header': typing.Union[header_ref_schema_header.schema.Schema, ],
            'X-Rate-Limit': typing.Union[header_x_rate_limit.schema.Schema, decimal.Decimal, int, ],
            'int32': typing.Union[header_int32_json_content_type_header.schema.Schema, decimal.Decimal, int, ],
            'ref-content-schema-header': typing.Union[header_ref_content_schema_header.schema.Schema, ],
            'stringHeader': typing.Union[header_string_header.schema.Schema, str, ],
        }
    )
    OptionalParams = typing_extensions.TypedDict(
        'OptionalParams',
        {
            'X-Expires-After': typing.Union[header_x_expires_after.schema.Schema, str, datetime.datetime, ],
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
        application_xml_schema.Schema,
        application_json_schema.Schema,
    ]
    headers: Header.Params


class _200(api_client.OpenApiResponse[ApiResponse]):
    response_cls = ApiResponse


    class __ApplicationXmlMediaType(api_client.MediaType):
        schema: typing.Type[application_xml_schema.Schema] = application_xml_schema.Schema


    class __ApplicationJsonMediaType(api_client.MediaType):
        schema: typing.Type[application_json_schema.Schema] = application_json_schema.Schema
    __Content = typing_extensions.TypedDict(
        '__Content',
        {
            'application/xml': __ApplicationXmlMediaType,
            'application/json': __ApplicationJsonMediaType,
        }
    )
    content: __Content = {
        'application/xml': __ApplicationXmlMediaType,
        'application/json': __ApplicationJsonMediaType,
    }
    headers=Header.parameters

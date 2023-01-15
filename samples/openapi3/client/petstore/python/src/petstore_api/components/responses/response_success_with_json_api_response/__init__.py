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
from .content.application_json import schema as application_json_schema
from petstore_api.components.headers import header_ref_schema_header as header_ref_schema_header
from petstore_api.components.headers import header_int32_json_content_type_header as header_int32
from petstore_api.components.headers import header_ref_content_schema_header as header_ref_content_schema_header
from petstore_api.components.headers import header_string_header as header_string_header
from petstore_api.components.headers import header_number_header as header_number_header


class Header:
    RequiredParams = typing_extensions.TypedDict(
        'RequiredParams',
        {
            'ref-schema-header': typing.Union[header_ref_schema_header.RefSchemaHeader.schema, ],
            'int32': typing.Union[header_int32.Int32JsonContentTypeHeader.content["application/json"].schema, decimal.Decimal, int, ],
            'ref-content-schema-header': typing.Union[header_ref_content_schema_header.RefContentSchemaHeader.content["application/json"].schema, ],
            'stringHeader': typing.Union[header_string_header.StringHeader.schema, str, ],
        }
    )
    OptionalParams = typing_extensions.TypedDict(
        'OptionalParams',
        {
            'numberHeader': typing.Union[header_number_header.NumberHeader.schema, str, ],
        },
        total=False
    )


    class Params(RequiredParams, OptionalParams):
        pass


    parameters = [
        header_ref_schema_header.RefSchemaHeader,
        header_int32.Int32JsonContentTypeHeader,
        header_ref_content_schema_header.RefContentSchemaHeader,
        header_string_header.StringHeader,
        header_number_header.NumberHeader,
    ]

@dataclasses.dataclass
class ApiResponse(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        application_json_schema.Schema,
    ]
    headers: Header.Params


class SuccessWithJsonApiResponse(api_client.OpenApiResponse[ApiResponse]):
    response_cls = ApiResponse


    class __ApplicationJsonMediaType(api_client.MediaType):
        schema: typing.Type[application_json_schema.Schema] = application_json_schema.Schema
    __Content = typing_extensions.TypedDict(
        '__Content',
        {
            'application/json': typing.Type[__ApplicationJsonMediaType],
        }
    )
    content: __Content = {
        'application/json': __ApplicationJsonMediaType,
    }
    headers=Header.parameters

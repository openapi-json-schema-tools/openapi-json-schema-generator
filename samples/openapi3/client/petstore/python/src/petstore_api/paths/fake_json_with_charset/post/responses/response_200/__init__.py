# coding: utf-8

"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from petstore_api.shared_imports.response_imports import *

from .content.application_json_charsetutf8 import schema as application_json_charsetutf8_schema


@dataclasses.dataclass
class ApiResponseFor200(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: application_json_charsetutf8_schema.Schema[typing.Union[
        frozendict.frozendict,
        str,
        decimal.Decimal,
        schemas.BoolClass,
        schemas.NoneClass,
        tuple,
        bytes,
        schemas.FileIO
    ]]
    headers: schemas.Unset = schemas.unset


class ResponseFor200(api_client.OpenApiResponse[ApiResponseFor200]):
    response_cls = ApiResponseFor200


    class ApplicationJsonCharsetutf8MediaType(api_client.MediaType):
        schema: typing.Type[application_json_charsetutf8_schema.Schema] = application_json_charsetutf8_schema.Schema
    Content = typing_extensions.TypedDict(
        'Content',
        {
            'application/json; charset=utf-8': typing.Type[ApplicationJsonCharsetutf8MediaType],
        }
    )
    content: Content = {
        'application/json; charset=utf-8': ApplicationJsonCharsetutf8MediaType,
    }

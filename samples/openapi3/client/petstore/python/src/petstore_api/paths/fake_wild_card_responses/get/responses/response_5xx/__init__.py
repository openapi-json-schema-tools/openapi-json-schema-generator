# coding: utf-8

"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from petstore_api.shared_imports.response_imports import *

from . import content


@dataclasses.dataclass
class ApiResponseFor5XX(api_response.ApiResponse):
    response: urllib3.HTTPResponse
    body: schemas.OUTPUT_BASE_TYPES
    headers: schemas.Unset = schemas.unset


class ResponseFor5XX(api_client.OpenApiResponse[ApiResponseFor5XX]):
    response_cls = ApiResponseFor5XX


    class ApplicationJsonMediaType(api_client.MediaType):
        schema: typing_extensions.TypeAlias = content.application_json.schema.Schema
    Content = typing_extensions.TypedDict(
        'Content',
        {
            'application/json': typing.Type[ApplicationJsonMediaType],
        }
    )
    content: Content = {
        'application/json': ApplicationJsonMediaType,
    }

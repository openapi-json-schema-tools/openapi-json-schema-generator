# coding: utf-8

"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from petstore_api.shared_imports.response_imports import *

from .content.application_json import schema as application_json_schema


@dataclasses.dataclass
class ApiResponse(api_response.ApiResponse):
    response: urllib3.HTTPResponse
    body: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]
    headers: schemas.Unset = schemas.unset


class ResponseFor404(api_client.OpenApiResponse[ApiResponse]):
    response_cls = ApiResponse


    class ApplicationJsonMediaType(api_client.MediaType):
        schema: typing_extensions.TypeAlias = application_json_schema.Schema
    Content = typing_extensions.TypedDict(
        'Content',
        {
            'application/json': typing.Type[ApplicationJsonMediaType],
        }
    )
    content: Content = {
        'application/json': ApplicationJsonMediaType,
    }

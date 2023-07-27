# coding: utf-8

"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from petstore_api.shared_imports.response_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

from .content.application_json import schema as application_json_schema
from .content.multipart_form_data import schema as multipart_form_data_schema


@dataclasses.dataclass
class ApiResponse(api_response.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        schemas.OUTPUT_BASE_TYPES,
        multipart_form_data_schema.SchemaDict,
    ]
    headers: schemas.Unset = schemas.unset


class ResponseFor200(api_client.OpenApiResponse[ApiResponse]):
    @classmethod
    def get_response(cls, response, headers, body) -> ApiResponse:
        return ApiResponse(response=response, body=body, headers=headers)


    class ApplicationJsonMediaType(api_client.MediaType):
        schema: typing_extensions.TypeAlias = application_json_schema.Schema


    class MultipartFormDataMediaType(api_client.MediaType):
        schema: typing_extensions.TypeAlias = multipart_form_data_schema.Schema
    content = {
        'application/json': ApplicationJsonMediaType,
        'multipart/form-data': MultipartFormDataMediaType,
    }
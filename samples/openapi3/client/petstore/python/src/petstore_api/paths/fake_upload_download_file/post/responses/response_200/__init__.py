# coding: utf-8

"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from petstore_api.shared_imports.response_imports import *

from . import content


@dataclasses.dataclass
class ApiResponseFor200(api_response.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[bytes, schemas.FileIO]
    headers: schemas.Unset = schemas.unset


class ResponseFor200(api_client.OpenApiResponse[ApiResponseFor200]):
    response_cls = ApiResponseFor200


    class ApplicationOctetStreamMediaType(api_client.MediaType):
        schema: typing_extensions.TypeAlias = content.application_octet_stream.schema.Schema
    Content = typing_extensions.TypedDict(
        'Content',
        {
            'application/octet-stream': typing.Type[ApplicationOctetStreamMediaType],
        }
    )
    content: Content = {
        'application/octet-stream': ApplicationOctetStreamMediaType,
    }

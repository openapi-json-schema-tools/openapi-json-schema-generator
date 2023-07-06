# coding: utf-8

"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from petstore_api.shared_imports.response_imports import *

from .content.application_xml import schema as application_xml_schema
from .content.application_json import schema as application_json_schema


@dataclasses.dataclass
class ApiResponseFor200(api_response.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        content.application_xml.schema.user.UserDict,
        content.application_json.schema.user.UserDict,
    ]
    headers: schemas.Unset = schemas.unset


class ResponseFor200(api_client.OpenApiResponse[ApiResponseFor200]):
    response_cls = ApiResponseFor200


    class ApplicationXmlMediaType(api_client.MediaType):
        schema: typing_extensions.TypeAlias = application_xml_schema.Schema


    class ApplicationJsonMediaType(api_client.MediaType):
        schema: typing_extensions.TypeAlias = application_json_schema.Schema
    Content = typing_extensions.TypedDict(
        'Content',
        {
            'application/xml': typing.Type[ApplicationXmlMediaType],
            'application/json': typing.Type[ApplicationJsonMediaType],
        }
    )
    content: Content = {
        'application/xml': ApplicationXmlMediaType,
        'application/json': ApplicationJsonMediaType,
    }

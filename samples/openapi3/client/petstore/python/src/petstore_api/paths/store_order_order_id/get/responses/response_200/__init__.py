# coding: utf-8

"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from petstore_api.shared_imports.response_imports import *

from . import content


@dataclasses.dataclass
class ApiResponseFor200(api_response.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        content.application_xml.schema.order.OrderDict,
        content.application_json.schema.order.OrderDict,
    ]
    headers: schemas.Unset = schemas.unset


class ResponseFor200(api_client.OpenApiResponse[ApiResponseFor200]):
    response_cls = ApiResponseFor200


    class ApplicationXmlMediaType(api_client.MediaType):
        schema: typing_extensions.TypeAlias = content.application_xml.schema.Schema


    class ApplicationJsonMediaType(api_client.MediaType):
        schema: typing_extensions.TypeAlias = content.application_json.schema.Schema
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

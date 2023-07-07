# coding: utf-8

"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from petstore_api.shared_imports.header_imports import *

from .content.application_octet_stream import schema as application_octet_stream_schema

class RequestBody(api_client.RequestBody):


    class ApplicationOctetStreamMediaType(api_client.MediaType):
        schema: typing_extensions.TypeAlias = application_octet_stream_schema.Schema
    Content = typing_extensions.TypedDict(
        'Content',
        {
            'application/octet-stream': typing.Type[ApplicationOctetStreamMediaType],
        }
    )
    content: Content = {
        'application/octet-stream': ApplicationOctetStreamMediaType,
    }
    required = True

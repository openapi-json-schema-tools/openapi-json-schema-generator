# coding: utf-8

"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from petstore_api.shared_imports.header_imports import *

from . import content


class Parameter0(api_client.QueryParameter):
    name = "someParam"


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
    required = True

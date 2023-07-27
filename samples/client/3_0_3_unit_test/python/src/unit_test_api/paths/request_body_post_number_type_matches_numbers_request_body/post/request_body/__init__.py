# coding: utf-8

"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from unit_test_api.shared_imports.header_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

from .content.application_json import schema as application_json_schema


class RequestBody(api_client.RequestBody):


    class ApplicationJsonMediaType(api_client.MediaType):
        schema: typing_extensions.TypeAlias = application_json_schema.Schema
    content = {
        'application/json': ApplicationJsonMediaType,
    }
    required = True


class RequestBodyInfoForApplicationJson(typing.NamedTuple):
    body: typing.Union[
        typing.Union[int, float],
    ]
    content_type: str = 'application/json'
RequestBodyInfo = RequestBodyInfoForApplicationJson

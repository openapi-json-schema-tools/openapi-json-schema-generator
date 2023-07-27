# coding: utf-8

"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from petstore_api.shared_imports.header_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

from .content.application_x_www_form_urlencoded import schema as application_x_www_form_urlencoded_schema


class RequestBody(api_client.RequestBody):


    class ApplicationXWwwFormUrlencodedMediaType(api_client.MediaType):
        schema: typing_extensions.TypeAlias = application_x_www_form_urlencoded_schema.Schema
    content = {
        'application/x-www-form-urlencoded': ApplicationXWwwFormUrlencodedMediaType,
    }


class RequestBodyInfoForApplicationXWwwFormUrlencoded(typing.NamedTuple):
    body: typing.Union[
        application_x_www_form_urlencoded_schema.SchemaDictInput,
        application_x_www_form_urlencoded_schema.SchemaDict,
    ]
    content_type: str = 'application/x-www-form-urlencoded'
RequestBodyInfo = RequestBodyInfoForApplicationXWwwFormUrlencoded
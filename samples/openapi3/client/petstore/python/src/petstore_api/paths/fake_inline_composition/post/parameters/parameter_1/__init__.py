# coding: utf-8

"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from petstore_api.shared_imports.header_imports import *

from . import schema


class Parameter1(api_client.QueryParameter):
    name = "compositionInProperty"
    style = api_client.ParameterStyle.FORM
    schema: typing_extensions.TypeAlias = schema.Schema[frozendict.frozendict]
    explode = True

# coding: utf-8

"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from petstore_api.shared_imports.header_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

from . import schema


class Parameter8(api_client.HeaderParameter):
    name = "A-B"
    style = api_client.ParameterStyle.SIMPLE
    schema: typing_extensions.TypeAlias = schema.Schema

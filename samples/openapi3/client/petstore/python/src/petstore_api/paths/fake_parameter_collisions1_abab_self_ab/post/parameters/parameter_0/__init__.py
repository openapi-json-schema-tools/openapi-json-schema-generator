# coding: utf-8

"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from petstore_api.shared_imports.header_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

from . import schema


class Parameter0(api_client.QueryParameter):
    name = "1"
    style = api_client.ParameterStyle.FORM
    schema: typing_extensions.TypeAlias = schema.Schema
    explode = True

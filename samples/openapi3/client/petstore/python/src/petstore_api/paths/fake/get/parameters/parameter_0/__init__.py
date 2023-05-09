# coding: utf-8

"""


    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import typing_extensions

from petstore_api import api_client

from . import schema


class Parameter0(api_client.HeaderParameter):
    name: typing_extensions.Literal["enum_header_string_array"] = "enum_header_string_array"
    style = api_client.ParameterStyle.SIMPLE
    schema = schema.Schema

# coding: utf-8

"""


    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import typing_extensions

from petstore_api import api_client

from . import schema


class Parameter11(api_client.PathParameter):
    name: typing_extensions.Literal["Ab"] = "Ab"
    style = api_client.ParameterStyle.SIMPLE
    schema = schema.Schema
    required = True

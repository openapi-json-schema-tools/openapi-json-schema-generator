# coding: utf-8

"""


    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import typing_extensions

from petstore_api import api_client

from . import schema


class Parameter14(api_client.CookieParameter):
    name: typing_extensions.Literal["1"] = "1"
    style = api_client.ParameterStyle.FORM
    schema = schema.Schema
    explode = True

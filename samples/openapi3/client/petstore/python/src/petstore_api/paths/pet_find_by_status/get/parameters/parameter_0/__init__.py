# coding: utf-8

"""


    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import typing
import typing_extensions

from petstore_api import api_client
from . import schema


class _0(api_client.QueryParameter):
    name = "status"
    style = api_client.ParameterStyle.FORM
    schema = schema.Schema
    required = True

# coding: utf-8

"""


    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import typing
import typing_extensions

from petstore_api import api_client
from . import schema


class XExpiresAfter(api_client.HeaderParameterWithoutName):
    style = api_client.ParameterStyle.SIMPLE
    schema = schema.Schema
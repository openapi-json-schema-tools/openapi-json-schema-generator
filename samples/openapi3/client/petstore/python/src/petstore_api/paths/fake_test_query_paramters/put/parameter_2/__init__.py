# coding: utf-8

"""


    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from dataclasses import dataclass
import typing_extensions
import urllib3

from petstore_api import api_client, exceptions
from . import schema


class _2(api_client.QueryParameter):
    name = "http"
    style = api_client.ParameterStyle.SPACE_DELIMITED
    schema = schema.Schema
    required = True
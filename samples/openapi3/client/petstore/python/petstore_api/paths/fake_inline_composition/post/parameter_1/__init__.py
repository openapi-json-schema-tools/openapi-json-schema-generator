# coding: utf-8

"""


    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from dataclasses import dataclass
import typing_extensions
import urllib3

from petstore_api import api_client, exceptions
from . import schema


class _1(api_client.QueryParameter):
    name = "compositionInProperty"
    style = api_client.ParameterStyle.FORM
    schema = schema.Schema
    explode = True

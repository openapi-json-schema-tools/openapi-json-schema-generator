# coding: utf-8

"""


    Generated by: https://openapi-generator.tech
"""

from dataclasses import dataclass
import typing_extensions
import urllib3

from petstore_api import api_client, exceptions
from . import schema


parameter_oapg = api_client.HeaderParameter(
    name="enum_header_string_array",
    style=api_client.ParameterStyle.SIMPLE,
    schema=schema.Schema,
)

# coding: utf-8

"""


    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from dataclasses import dataclass
import typing_extensions
import urllib3

from petstore_api import api_client, exceptions
from . import application_json


class _0(api_client.QueryParameter):
    name = "someParam"
    content = {
        "application/json": application_json.ApplicationJson,
    }
    required = True
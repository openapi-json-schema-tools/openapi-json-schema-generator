# coding: utf-8

"""


    Generated by: https://openapi-generator.tech
"""

from dataclasses import dataclass
import typing_extensions
import urllib3

from petstore_api import api_client, exceptions

from petstore_api.components.schema import string_with_validation
from petstore_api.components.schema import string_with_validation


parameter_oapg = api_client.HeaderParameterWithoutName(
    style=api_client.ParameterStyle.SIMPLE,
    content={
        "application/json": string_with_validation.StringWithValidation,
    },
    required=True,
)

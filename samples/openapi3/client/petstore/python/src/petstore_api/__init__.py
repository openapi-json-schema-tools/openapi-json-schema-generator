# coding: utf-8

# flake8: noqa

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

__version__ = "1.0.0"

# import ApiClient
from petstore_api.api_client import ApiClient

# import Configuration
from petstore_api.configurations.api_configuration import ApiConfiguration
from petstore_api.signing import HttpSigningConfiguration

# import exceptions
from petstore_api.exceptions import OpenApiException
from petstore_api.exceptions import ApiAttributeError
from petstore_api.exceptions import ApiTypeError
from petstore_api.exceptions import ApiValueError
from petstore_api.exceptions import ApiKeyError
from petstore_api.api_response import ApiException

__import__('sys').setrecursionlimit(1234)

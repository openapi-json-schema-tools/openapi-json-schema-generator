# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import petstore_api
from petstore_api.components.schema.fruit import Fruit
from petstore_api import configuration


class TestFruit(unittest.TestCase):
    """Fruit unit test stubs"""
    configuration_ = configuration.Configuration()


if __name__ == '__main__':
    unittest.main()

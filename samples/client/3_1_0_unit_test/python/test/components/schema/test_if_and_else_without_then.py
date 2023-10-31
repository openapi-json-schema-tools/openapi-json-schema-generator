# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import unit_test_api
from unit_test_api.components.schema.if_and_else_without_then import IfAndElseWithoutThen
from unit_test_api.configurations import schema_configuration


class TestIfAndElseWithoutThen(unittest.TestCase):
    """IfAndElseWithoutThen unit test stubs"""
    configuration = schema_configuration.SchemaConfiguration(
        disabled_json_schema_keywords={'format'}
    )

    def test_valid_when_if_test_passes_passes(self):
        # valid when if test passes
        IfAndElseWithoutThen.validate(
            -1,
            configuration=self.configuration
        )

    def test_invalid_through_else_fails(self):
        # invalid through else
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            IfAndElseWithoutThen.validate(
                3,
                configuration=self.configuration
            )

    def test_valid_through_else_passes(self):
        # valid through else
        IfAndElseWithoutThen.validate(
            4,
            configuration=self.configuration
        )


if __name__ == '__main__':
    unittest.main()

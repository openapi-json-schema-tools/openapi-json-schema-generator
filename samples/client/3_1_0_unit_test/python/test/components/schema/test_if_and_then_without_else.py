# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import unit_test_api
from unit_test_api.components.schema.if_and_then_without_else import IfAndThenWithoutElse
from unit_test_api.configurations import schema_configuration


class TestIfAndThenWithoutElse(unittest.TestCase):
    """IfAndThenWithoutElse unit test stubs"""
    configuration = schema_configuration.SchemaConfiguration(
        disabled_json_schema_keywords={'format'}
    )

    def test_valid_when_if_test_fails_passes(self):
        # valid when if test fails
        IfAndThenWithoutElse.validate(
            3,
            configuration=self.configuration
        )

    def test_invalid_through_then_fails(self):
        # invalid through then
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            IfAndThenWithoutElse.validate(
                -100,
                configuration=self.configuration
            )

    def test_valid_through_then_passes(self):
        # valid through then
        IfAndThenWithoutElse.validate(
            -1,
            configuration=self.configuration
        )


if __name__ == '__main__':
    unittest.main()

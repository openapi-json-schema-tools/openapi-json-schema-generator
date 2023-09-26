# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import unit_test_api
from unit_test_api.components.schema.by_int import ByInt
from unit_test_api.configurations import schema_configuration


class TestByInt(unittest.TestCase):
    """ByInt unit test stubs"""
    configuration = schema_configuration.SchemaConfiguration(
        disabled_json_schema_keywords={'format'}
    )

    def test_int_by_int_fail_fails(self):
        # int by int fail
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            ByInt.validate(
                7,
                configuration=self.configuration
            )

    def test_int_by_int_passes(self):
        # int by int
        ByInt.validate(
            10,
            configuration=self.configuration
        )

    def test_ignores_non_numbers_passes(self):
        # ignores non-numbers
        ByInt.validate(
            "foo",
            configuration=self.configuration
        )


if __name__ == '__main__':
    unittest.main()
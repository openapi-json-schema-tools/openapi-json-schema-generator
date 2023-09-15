# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import unit_test_api
from unit_test_api.components.schema.oneof import Oneof
from unit_test_api.configurations import schema_configuration


class TestOneof(unittest.TestCase):
    """Oneof unit test stubs"""
    configuration = schema_configuration.SchemaConfiguration(
        disabled_json_schema_keywords={'format'}
    )

    def test_second_oneof_valid_passes(self):
        # second oneOf valid
        Oneof.validate(
            2.5,
            configuration=self.configuration
        )

    def test_both_oneof_valid_fails(self):
        # both oneOf valid
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            Oneof.validate(
                3,
                configuration=self.configuration
            )

    def test_first_oneof_valid_passes(self):
        # first oneOf valid
        Oneof.validate(
            1,
            configuration=self.configuration
        )

    def test_neither_oneof_valid_fails(self):
        # neither oneOf valid
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            Oneof.validate(
                1.5,
                configuration=self.configuration
            )


if __name__ == '__main__':
    unittest.main()

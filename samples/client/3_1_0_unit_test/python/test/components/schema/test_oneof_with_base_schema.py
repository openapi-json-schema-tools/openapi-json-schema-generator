# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import unit_test_api
from unit_test_api.components.schema.oneof_with_base_schema import OneofWithBaseSchema
from unit_test_api.configurations import schema_configuration


class TestOneofWithBaseSchema(unittest.TestCase):
    """OneofWithBaseSchema unit test stubs"""
    configuration = schema_configuration.SchemaConfiguration()

    def test_both_oneof_valid_fails(self):
        # both oneOf valid
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            OneofWithBaseSchema.validate(
                "foo",
                configuration=self.configuration
            )

    def test_mismatch_base_schema_fails(self):
        # mismatch base schema
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            OneofWithBaseSchema.validate(
                3,
                configuration=self.configuration
            )

    def test_one_oneof_valid_passes(self):
        # one oneOf valid
        OneofWithBaseSchema.validate(
            "foobar",
            configuration=self.configuration
        )


if __name__ == '__main__':
    unittest.main()

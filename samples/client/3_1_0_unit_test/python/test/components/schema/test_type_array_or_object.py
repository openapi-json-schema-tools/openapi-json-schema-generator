# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import unit_test_api
from unit_test_api.components.schema.type_array_or_object import TypeArrayOrObject
from unit_test_api.configurations import schema_configuration


class TestTypeArrayOrObject(unittest.TestCase):
    """TypeArrayOrObject unit test stubs"""
    configuration = schema_configuration.SchemaConfiguration()

    def test_null_is_invalid_fails(self):
        # null is invalid
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            TypeArrayOrObject.validate(
                None,
                configuration=self.configuration
            )

    def test_string_is_invalid_fails(self):
        # string is invalid
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            TypeArrayOrObject.validate(
                "foo",
                configuration=self.configuration
            )

    def test_object_is_valid_passes(self):
        # object is valid
        TypeArrayOrObject.validate(
            {
                "foo":
                    123,
            },
            configuration=self.configuration
        )

    def test_number_is_invalid_fails(self):
        # number is invalid
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            TypeArrayOrObject.validate(
                123,
                configuration=self.configuration
            )

    def test_array_is_valid_passes(self):
        # array is valid
        TypeArrayOrObject.validate(
            [
                1,
                2,
                3,
            ],
            configuration=self.configuration
        )


if __name__ == '__main__':
    unittest.main()

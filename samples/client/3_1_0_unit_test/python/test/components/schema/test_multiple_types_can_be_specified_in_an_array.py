# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import unit_test_api
from unit_test_api.components.schema.multiple_types_can_be_specified_in_an_array import MultipleTypesCanBeSpecifiedInAnArray
from unit_test_api.configurations import schema_configuration


class TestMultipleTypesCanBeSpecifiedInAnArray(unittest.TestCase):
    """MultipleTypesCanBeSpecifiedInAnArray unit test stubs"""
    configuration = schema_configuration.SchemaConfiguration()

    def test_null_is_invalid_fails(self):
        # null is invalid
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            MultipleTypesCanBeSpecifiedInAnArray.validate(
                None,
                configuration=self.configuration
            )

    def test_a_boolean_is_invalid_fails(self):
        # a boolean is invalid
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            MultipleTypesCanBeSpecifiedInAnArray.validate(
                True,
                configuration=self.configuration
            )

    def test_an_array_is_invalid_fails(self):
        # an array is invalid
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            MultipleTypesCanBeSpecifiedInAnArray.validate(
                [
                ],
                configuration=self.configuration
            )

    def test_an_integer_is_valid_passes(self):
        # an integer is valid
        MultipleTypesCanBeSpecifiedInAnArray.validate(
            1,
            configuration=self.configuration
        )

    def test_an_object_is_invalid_fails(self):
        # an object is invalid
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            MultipleTypesCanBeSpecifiedInAnArray.validate(
                {
                },
                configuration=self.configuration
            )

    def test_a_float_is_invalid_fails(self):
        # a float is invalid
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            MultipleTypesCanBeSpecifiedInAnArray.validate(
                1.1,
                configuration=self.configuration
            )

    def test_a_string_is_valid_passes(self):
        # a string is valid
        MultipleTypesCanBeSpecifiedInAnArray.validate(
            "foo",
            configuration=self.configuration
        )


if __name__ == '__main__':
    unittest.main()

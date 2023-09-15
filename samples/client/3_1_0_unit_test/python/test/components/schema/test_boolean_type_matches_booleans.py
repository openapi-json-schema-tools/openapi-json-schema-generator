# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import unit_test_api
from unit_test_api.components.schema.boolean_type_matches_booleans import BooleanTypeMatchesBooleans
from unit_test_api.configurations import schema_configuration


class TestBooleanTypeMatchesBooleans(unittest.TestCase):
    """BooleanTypeMatchesBooleans unit test stubs"""
    configuration = schema_configuration.SchemaConfiguration()

    def test_an_empty_string_is_not_a_boolean_fails(self):
        # an empty string is not a boolean
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            BooleanTypeMatchesBooleans.validate(
                "",
                configuration=self.configuration
            )

    def test_a_float_is_not_a_boolean_fails(self):
        # a float is not a boolean
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            BooleanTypeMatchesBooleans.validate(
                1.1,
                configuration=self.configuration
            )

    def test_null_is_not_a_boolean_fails(self):
        # null is not a boolean
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            BooleanTypeMatchesBooleans.validate(
                None,
                configuration=self.configuration
            )

    def test_zero_is_not_a_boolean_fails(self):
        # zero is not a boolean
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            BooleanTypeMatchesBooleans.validate(
                0,
                configuration=self.configuration
            )

    def test_an_array_is_not_a_boolean_fails(self):
        # an array is not a boolean
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            BooleanTypeMatchesBooleans.validate(
                [
                ],
                configuration=self.configuration
            )

    def test_a_string_is_not_a_boolean_fails(self):
        # a string is not a boolean
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            BooleanTypeMatchesBooleans.validate(
                "foo",
                configuration=self.configuration
            )

    def test_false_is_a_boolean_passes(self):
        # false is a boolean
        BooleanTypeMatchesBooleans.validate(
            False,
            configuration=self.configuration
        )

    def test_an_integer_is_not_a_boolean_fails(self):
        # an integer is not a boolean
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            BooleanTypeMatchesBooleans.validate(
                1,
                configuration=self.configuration
            )

    def test_true_is_a_boolean_passes(self):
        # true is a boolean
        BooleanTypeMatchesBooleans.validate(
            True,
            configuration=self.configuration
        )

    def test_an_object_is_not_a_boolean_fails(self):
        # an object is not a boolean
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            BooleanTypeMatchesBooleans.validate(
                {
                },
                configuration=self.configuration
            )


if __name__ == '__main__':
    unittest.main()

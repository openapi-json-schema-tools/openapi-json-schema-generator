# coding: utf-8

"""
    openapi 3.0.3 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft6  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import unit_test_api
from unit_test_api.components.schema.null_type_matches_only_the_null_object import NullTypeMatchesOnlyTheNullObject
from unit_test_api.configurations import schema_configuration


class TestNullTypeMatchesOnlyTheNullObject(unittest.TestCase):
    """NullTypeMatchesOnlyTheNullObject unit test stubs"""
    configuration = schema_configuration.SchemaConfiguration()

    def test_a_float_is_not_null_fails(self):
        # a float is not null
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            NullTypeMatchesOnlyTheNullObject.validate(
                1.1,
                configuration=self.configuration
            )

    def test_an_object_is_not_null_fails(self):
        # an object is not null
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            NullTypeMatchesOnlyTheNullObject.validate(
                {
                },
                configuration=self.configuration
            )

    def test_false_is_not_null_fails(self):
        # false is not null
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            NullTypeMatchesOnlyTheNullObject.validate(
                False,
                configuration=self.configuration
            )

    def test_an_integer_is_not_null_fails(self):
        # an integer is not null
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            NullTypeMatchesOnlyTheNullObject.validate(
                1,
                configuration=self.configuration
            )

    def test_true_is_not_null_fails(self):
        # true is not null
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            NullTypeMatchesOnlyTheNullObject.validate(
                True,
                configuration=self.configuration
            )

    def test_zero_is_not_null_fails(self):
        # zero is not null
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            NullTypeMatchesOnlyTheNullObject.validate(
                0,
                configuration=self.configuration
            )

    def test_an_empty_string_is_not_null_fails(self):
        # an empty string is not null
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            NullTypeMatchesOnlyTheNullObject.validate(
                "",
                configuration=self.configuration
            )

    def test_null_is_null_passes(self):
        # null is null
        NullTypeMatchesOnlyTheNullObject.validate(
            None,
            configuration=self.configuration
        )

    def test_an_array_is_not_null_fails(self):
        # an array is not null
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            NullTypeMatchesOnlyTheNullObject.validate(
                [
                ],
                configuration=self.configuration
            )

    def test_a_string_is_not_null_fails(self):
        # a string is not null
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            NullTypeMatchesOnlyTheNullObject.validate(
                "foo",
                configuration=self.configuration
            )


if __name__ == '__main__':
    unittest.main()

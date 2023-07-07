# coding: utf-8

"""
    openapi 3.0.3 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft6  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import unit_test_api
from unit_test_api.components.schema.uniqueitems_false_validation import UniqueitemsFalseValidation
from unit_test_api.configurations import schema_configuration


class TestUniqueitemsFalseValidation(unittest.TestCase):
    """UniqueitemsFalseValidation unit test stubs"""
    configuration = schema_configuration.SchemaConfiguration()

    def test_non_unique_array_of_integers_is_valid_passes(self):
        # non-unique array of integers is valid
        UniqueitemsFalseValidation.validate(
            [
                1,
                1,
            ],
            configuration=self.configuration
        )

    def test_unique_array_of_objects_is_valid_passes(self):
        # unique array of objects is valid
        UniqueitemsFalseValidation.validate(
            [
                {
                    "foo":
                        "bar",
                },
                {
                    "foo":
                        "baz",
                },
            ],
            configuration=self.configuration
        )

    def test_non_unique_array_of_nested_objects_is_valid_passes(self):
        # non-unique array of nested objects is valid
        UniqueitemsFalseValidation.validate(
            [
                {
                    "foo":
                        {
                            "bar":
                                {
                                    "baz":
                                        True,
                                },
                        },
                },
                {
                    "foo":
                        {
                            "bar":
                                {
                                    "baz":
                                        True,
                                },
                        },
                },
            ],
            configuration=self.configuration
        )

    def test_non_unique_array_of_objects_is_valid_passes(self):
        # non-unique array of objects is valid
        UniqueitemsFalseValidation.validate(
            [
                {
                    "foo":
                        "bar",
                },
                {
                    "foo":
                        "bar",
                },
            ],
            configuration=self.configuration
        )

    def test_1_and_true_are_unique_passes(self):
        # 1 and true are unique
        UniqueitemsFalseValidation.validate(
            [
                1,
                True,
            ],
            configuration=self.configuration
        )

    def test_unique_array_of_integers_is_valid_passes(self):
        # unique array of integers is valid
        UniqueitemsFalseValidation.validate(
            [
                1,
                2,
            ],
            configuration=self.configuration
        )

    def test_non_unique_array_of_arrays_is_valid_passes(self):
        # non-unique array of arrays is valid
        UniqueitemsFalseValidation.validate(
            [
                [
                    "foo",
                ],
                [
                    "foo",
                ],
            ],
            configuration=self.configuration
        )

    def test_numbers_are_unique_if_mathematically_unequal_passes(self):
        # numbers are unique if mathematically unequal
        UniqueitemsFalseValidation.validate(
            [
                1.0,
                1.0,
                1,
            ],
            configuration=self.configuration
        )

    def test_false_is_not_equal_to_zero_passes(self):
        # false is not equal to zero
        UniqueitemsFalseValidation.validate(
            [
                0,
                False,
            ],
            configuration=self.configuration
        )

    def test_unique_array_of_nested_objects_is_valid_passes(self):
        # unique array of nested objects is valid
        UniqueitemsFalseValidation.validate(
            [
                {
                    "foo":
                        {
                            "bar":
                                {
                                    "baz":
                                        True,
                                },
                        },
                },
                {
                    "foo":
                        {
                            "bar":
                                {
                                    "baz":
                                        False,
                                },
                        },
                },
            ],
            configuration=self.configuration
        )

    def test_0_and_false_are_unique_passes(self):
        # 0 and false are unique
        UniqueitemsFalseValidation.validate(
            [
                0,
                False,
            ],
            configuration=self.configuration
        )

    def test_unique_array_of_arrays_is_valid_passes(self):
        # unique array of arrays is valid
        UniqueitemsFalseValidation.validate(
            [
                [
                    "foo",
                ],
                [
                    "bar",
                ],
            ],
            configuration=self.configuration
        )

    def test_true_is_not_equal_to_one_passes(self):
        # true is not equal to one
        UniqueitemsFalseValidation.validate(
            [
                1,
                True,
            ],
            configuration=self.configuration
        )

    def test_non_unique_heterogeneous_types_are_valid_passes(self):
        # non-unique heterogeneous types are valid
        UniqueitemsFalseValidation.validate(
            [
                {
                },
                [
                    1,
                ],
                True,
                None,
                {
                },
                1,
            ],
            configuration=self.configuration
        )

    def test_unique_heterogeneous_types_are_valid_passes(self):
        # unique heterogeneous types are valid
        UniqueitemsFalseValidation.validate(
            [
                {
                },
                [
                    1,
                ],
                True,
                None,
                1,
            ],
            configuration=self.configuration
        )


if __name__ == '__main__':
    unittest.main()

# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import unit_test_api
from unit_test_api.components.schema.uniqueitems_validation import UniqueitemsValidation
from unit_test_api.configurations import schema_configuration


class TestUniqueitemsValidation(unittest.TestCase):
    """UniqueitemsValidation unit test stubs"""
    configuration = schema_configuration.SchemaConfiguration(
        disabled_json_schema_keywords={'format'}
    )

    def test_unique_array_of_objects_is_valid_passes(self):
        # unique array of objects is valid
        UniqueitemsValidation.validate(
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

    def test_a_true_and_a1_are_unique_passes(self):
        # {&quot;a&quot;: true} and {&quot;a&quot;: 1} are unique
        UniqueitemsValidation.validate(
            [
                {
                    "a":
                        True,
                },
                {
                    "a":
                        1,
                },
            ],
            configuration=self.configuration
        )

    def test_non_unique_heterogeneous_types_are_invalid_fails(self):
        # non-unique heterogeneous types are invalid
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            UniqueitemsValidation.validate(
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

    def test_nested0_and_false_are_unique_passes(self):
        # nested [0] and [false] are unique
        UniqueitemsValidation.validate(
            [
                [
                    [
                        0,
                    ],
                    "foo",
                ],
                [
                    [
                        False,
                    ],
                    "foo",
                ],
            ],
            configuration=self.configuration
        )

    def test_a_false_and_a0_are_unique_passes(self):
        # {&quot;a&quot;: false} and {&quot;a&quot;: 0} are unique
        UniqueitemsValidation.validate(
            [
                {
                    "a":
                        False,
                },
                {
                    "a":
                        0,
                },
            ],
            configuration=self.configuration
        )

    def test_numbers_are_unique_if_mathematically_unequal_fails(self):
        # numbers are unique if mathematically unequal
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            UniqueitemsValidation.validate(
                [
                    1.0,
                    1.0,
                    1,
                ],
                configuration=self.configuration
            )

    def test_false_is_not_equal_to_zero_passes(self):
        # false is not equal to zero
        UniqueitemsValidation.validate(
            [
                0,
                False,
            ],
            configuration=self.configuration
        )

    def test_0_and_false_are_unique_passes(self):
        # [0] and [false] are unique
        UniqueitemsValidation.validate(
            [
                [
                    0,
                ],
                [
                    False,
                ],
            ],
            configuration=self.configuration
        )

    def test_unique_array_of_arrays_is_valid_passes(self):
        # unique array of arrays is valid
        UniqueitemsValidation.validate(
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

    def test_non_unique_array_of_nested_objects_is_invalid_fails(self):
        # non-unique array of nested objects is invalid
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            UniqueitemsValidation.validate(
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

    def test_non_unique_array_of_more_than_two_integers_is_invalid_fails(self):
        # non-unique array of more than two integers is invalid
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            UniqueitemsValidation.validate(
                [
                    1,
                    2,
                    1,
                ],
                configuration=self.configuration
            )

    def test_true_is_not_equal_to_one_passes(self):
        # true is not equal to one
        UniqueitemsValidation.validate(
            [
                1,
                True,
            ],
            configuration=self.configuration
        )

    def test_property_order_of_array_of_objects_is_ignored_fails(self):
        # property order of array of objects is ignored
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            UniqueitemsValidation.validate(
                [
                    {
                        "foo":
                            "bar",
                        "bar":
                            "foo",
                    },
                    {
                        "bar":
                            "foo",
                        "foo":
                            "bar",
                    },
                ],
                configuration=self.configuration
            )

    def test_objects_are_non_unique_despite_key_order_fails(self):
        # objects are non-unique despite key order
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            UniqueitemsValidation.validate(
                [
                    {
                        "a":
                            1,
                        "b":
                            2,
                    },
                    {
                        "b":
                            2,
                        "a":
                            1,
                    },
                ],
                configuration=self.configuration
            )

    def test_unique_array_of_strings_is_valid_passes(self):
        # unique array of strings is valid
        UniqueitemsValidation.validate(
            [
                "foo",
                "bar",
                "baz",
            ],
            configuration=self.configuration
        )

    def test_1_and_true_are_unique_passes(self):
        # [1] and [true] are unique
        UniqueitemsValidation.validate(
            [
                [
                    1,
                ],
                [
                    True,
                ],
            ],
            configuration=self.configuration
        )

    def test_different_objects_are_unique_passes(self):
        # different objects are unique
        UniqueitemsValidation.validate(
            [
                {
                    "a":
                        1,
                    "b":
                        2,
                },
                {
                    "a":
                        2,
                    "b":
                        1,
                },
            ],
            configuration=self.configuration
        )

    def test_unique_array_of_integers_is_valid_passes(self):
        # unique array of integers is valid
        UniqueitemsValidation.validate(
            [
                1,
                2,
            ],
            configuration=self.configuration
        )

    def test_non_unique_array_of_more_than_two_arrays_is_invalid_fails(self):
        # non-unique array of more than two arrays is invalid
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            UniqueitemsValidation.validate(
                [
                    [
                        "foo",
                    ],
                    [
                        "bar",
                    ],
                    [
                        "foo",
                    ],
                ],
                configuration=self.configuration
            )

    def test_non_unique_array_of_objects_is_invalid_fails(self):
        # non-unique array of objects is invalid
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            UniqueitemsValidation.validate(
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

    def test_unique_array_of_nested_objects_is_valid_passes(self):
        # unique array of nested objects is valid
        UniqueitemsValidation.validate(
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

    def test_non_unique_array_of_arrays_is_invalid_fails(self):
        # non-unique array of arrays is invalid
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            UniqueitemsValidation.validate(
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

    def test_non_unique_array_of_strings_is_invalid_fails(self):
        # non-unique array of strings is invalid
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            UniqueitemsValidation.validate(
                [
                    "foo",
                    "bar",
                    "foo",
                ],
                configuration=self.configuration
            )

    def test_nested1_and_true_are_unique_passes(self):
        # nested [1] and [true] are unique
        UniqueitemsValidation.validate(
            [
                [
                    [
                        1,
                    ],
                    "foo",
                ],
                [
                    [
                        True,
                    ],
                    "foo",
                ],
            ],
            configuration=self.configuration
        )

    def test_unique_heterogeneous_types_are_valid_passes(self):
        # unique heterogeneous types are valid
        UniqueitemsValidation.validate(
            [
                {
                },
                [
                    1,
                ],
                True,
                None,
                1,
                "{}",
            ],
            configuration=self.configuration
        )

    def test_non_unique_array_of_integers_is_invalid_fails(self):
        # non-unique array of integers is invalid
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            UniqueitemsValidation.validate(
                [
                    1,
                    1,
                ],
                configuration=self.configuration
            )


if __name__ == '__main__':
    unittest.main()
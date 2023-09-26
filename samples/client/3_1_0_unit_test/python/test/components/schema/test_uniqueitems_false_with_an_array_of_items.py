# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import unit_test_api
from unit_test_api.components.schema.uniqueitems_false_with_an_array_of_items import UniqueitemsFalseWithAnArrayOfItems
from unit_test_api.configurations import schema_configuration


class TestUniqueitemsFalseWithAnArrayOfItems(unittest.TestCase):
    """UniqueitemsFalseWithAnArrayOfItems unit test stubs"""
    configuration = schema_configuration.SchemaConfiguration(
        disabled_json_schema_keywords={'format'}
    )

    def test_unique_array_extended_from_false_true_is_valid_passes(self):
        # unique array extended from [false, true] is valid
        UniqueitemsFalseWithAnArrayOfItems.validate(
            [
                False,
                True,
                "foo",
                "bar",
            ],
            configuration=self.configuration
        )

    def test_false_false_from_items_array_is_valid_passes(self):
        # [false, false] from items array is valid
        UniqueitemsFalseWithAnArrayOfItems.validate(
            [
                False,
                False,
            ],
            configuration=self.configuration
        )

    def test_false_true_from_items_array_is_valid_passes(self):
        # [false, true] from items array is valid
        UniqueitemsFalseWithAnArrayOfItems.validate(
            [
                False,
                True,
            ],
            configuration=self.configuration
        )

    def test_non_unique_array_extended_from_false_true_is_valid_passes(self):
        # non-unique array extended from [false, true] is valid
        UniqueitemsFalseWithAnArrayOfItems.validate(
            [
                False,
                True,
                "foo",
                "foo",
            ],
            configuration=self.configuration
        )

    def test_unique_array_extended_from_true_false_is_valid_passes(self):
        # unique array extended from [true, false] is valid
        UniqueitemsFalseWithAnArrayOfItems.validate(
            [
                True,
                False,
                "foo",
                "bar",
            ],
            configuration=self.configuration
        )

    def test_true_false_from_items_array_is_valid_passes(self):
        # [true, false] from items array is valid
        UniqueitemsFalseWithAnArrayOfItems.validate(
            [
                True,
                False,
            ],
            configuration=self.configuration
        )

    def test_true_true_from_items_array_is_valid_passes(self):
        # [true, true] from items array is valid
        UniqueitemsFalseWithAnArrayOfItems.validate(
            [
                True,
                True,
            ],
            configuration=self.configuration
        )

    def test_non_unique_array_extended_from_true_false_is_valid_passes(self):
        # non-unique array extended from [true, false] is valid
        UniqueitemsFalseWithAnArrayOfItems.validate(
            [
                True,
                False,
                "foo",
                "foo",
            ],
            configuration=self.configuration
        )


if __name__ == '__main__':
    unittest.main()
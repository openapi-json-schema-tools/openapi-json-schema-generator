# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import unit_test_api
from unit_test_api.components.schema.prefixitems_validation_adjusts_the_starting_index_for_items import PrefixitemsValidationAdjustsTheStartingIndexForItems
from unit_test_api.configurations import schema_configuration


class TestPrefixitemsValidationAdjustsTheStartingIndexForItems(unittest.TestCase):
    """PrefixitemsValidationAdjustsTheStartingIndexForItems unit test stubs"""
    configuration = schema_configuration.SchemaConfiguration(
        disabled_json_schema_keywords={'format'}
    )

    def test_wrong_type_of_second_item_fails(self):
        # wrong type of second item
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            PrefixitemsValidationAdjustsTheStartingIndexForItems.validate(
                [
                    "x",
                    "y",
                ],
                configuration=self.configuration
            )

    def test_valid_items_passes(self):
        # valid items
        PrefixitemsValidationAdjustsTheStartingIndexForItems.validate(
            [
                "x",
                2,
                3,
            ],
            configuration=self.configuration
        )


if __name__ == '__main__':
    unittest.main()
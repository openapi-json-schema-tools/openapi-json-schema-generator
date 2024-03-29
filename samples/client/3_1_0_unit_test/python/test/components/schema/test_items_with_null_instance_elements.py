# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import unit_test_api
from unit_test_api.components.schema.items_with_null_instance_elements import ItemsWithNullInstanceElements
from unit_test_api.configurations import schema_configuration


class TestItemsWithNullInstanceElements(unittest.TestCase):
    """ItemsWithNullInstanceElements unit test stubs"""
    configuration = schema_configuration.SchemaConfiguration(
        disabled_json_schema_keywords={'format'}
    )

    def test_allows_null_elements_passes(self):
        # allows null elements
        ItemsWithNullInstanceElements.validate(
            [
                None,
            ],
            configuration=self.configuration
        )


if __name__ == '__main__':
    unittest.main()

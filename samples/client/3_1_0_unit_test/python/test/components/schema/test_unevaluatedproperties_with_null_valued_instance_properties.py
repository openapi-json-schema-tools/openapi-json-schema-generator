# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import unit_test_api
from unit_test_api.components.schema.unevaluatedproperties_with_null_valued_instance_properties import UnevaluatedpropertiesWithNullValuedInstanceProperties
from unit_test_api.configurations import schema_configuration


class TestUnevaluatedpropertiesWithNullValuedInstanceProperties(unittest.TestCase):
    """UnevaluatedpropertiesWithNullValuedInstanceProperties unit test stubs"""
    configuration = schema_configuration.SchemaConfiguration(
        disabled_json_schema_keywords={'format'}
    )

    def test_allows_null_valued_properties_passes(self):
        # allows null valued properties
        UnevaluatedpropertiesWithNullValuedInstanceProperties.validate(
            {
                "foo":
                    None,
            },
            configuration=self.configuration
        )


if __name__ == '__main__':
    unittest.main()

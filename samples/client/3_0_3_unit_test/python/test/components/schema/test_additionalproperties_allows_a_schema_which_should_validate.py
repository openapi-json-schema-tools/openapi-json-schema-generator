# coding: utf-8

"""
    openapi 3.0.3 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft6  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import unit_test_api
from unit_test_api.components.schema.additionalproperties_allows_a_schema_which_should_validate import AdditionalpropertiesAllowsASchemaWhichShouldValidate
from unit_test_api.configurations import schema_configuration


class TestAdditionalpropertiesAllowsASchemaWhichShouldValidate(unittest.TestCase):
    """AdditionalpropertiesAllowsASchemaWhichShouldValidate unit test stubs"""
    configuration = schema_configuration.SchemaConfiguration()

    def test_no_additional_properties_is_valid_passes(self):
        # no additional properties is valid
        AdditionalpropertiesAllowsASchemaWhichShouldValidate.validate(
            {
                "foo":
                    1,
            },
            configuration=self.configuration
        )

    def test_an_additional_invalid_property_is_invalid_fails(self):
        # an additional invalid property is invalid
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            AdditionalpropertiesAllowsASchemaWhichShouldValidate.validate(
                {
                    "foo":
                        1,
                    "bar":
                        2,
                    "quux":
                        12,
                },
                configuration=self.configuration
            )

    def test_an_additional_valid_property_is_valid_passes(self):
        # an additional valid property is valid
        AdditionalpropertiesAllowsASchemaWhichShouldValidate.validate(
            {
                "foo":
                    1,
                "bar":
                    2,
                "quux":
                    True,
            },
            configuration=self.configuration
        )


if __name__ == '__main__':
    unittest.main()
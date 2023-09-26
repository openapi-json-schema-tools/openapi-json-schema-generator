# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import unit_test_api
from unit_test_api.components.schema.properties_whose_names_are_javascript_object_property_names import PropertiesWhoseNamesAreJavascriptObjectPropertyNames
from unit_test_api.configurations import schema_configuration


class TestPropertiesWhoseNamesAreJavascriptObjectPropertyNames(unittest.TestCase):
    """PropertiesWhoseNamesAreJavascriptObjectPropertyNames unit test stubs"""
    configuration = schema_configuration.SchemaConfiguration(
        disabled_json_schema_keywords={'format'}
    )

    def test_ignores_arrays_passes(self):
        # ignores arrays
        PropertiesWhoseNamesAreJavascriptObjectPropertyNames.validate(
            [
            ],
            configuration=self.configuration
        )

    def test_constructor_not_valid_fails(self):
        # constructor not valid
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            PropertiesWhoseNamesAreJavascriptObjectPropertyNames.validate(
                {
                    "constructor":
                        {
                            "length":
                                37,
                        },
                },
                configuration=self.configuration
            )

    def test_ignores_other_non_objects_passes(self):
        # ignores other non-objects
        PropertiesWhoseNamesAreJavascriptObjectPropertyNames.validate(
            12,
            configuration=self.configuration
        )

    def test_none_of_the_properties_mentioned_passes(self):
        # none of the properties mentioned
        PropertiesWhoseNamesAreJavascriptObjectPropertyNames.validate(
            {
            },
            configuration=self.configuration
        )

    def test_proto_not_valid_fails(self):
        # __proto__ not valid
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            PropertiesWhoseNamesAreJavascriptObjectPropertyNames.validate(
                {
                    "__proto__":
                        "foo",
                },
                configuration=self.configuration
            )

    def test_tostring_not_valid_fails(self):
        # toString not valid
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            PropertiesWhoseNamesAreJavascriptObjectPropertyNames.validate(
                {
                    "toString":
                        {
                            "length":
                                37,
                        },
                },
                configuration=self.configuration
            )

    def test_all_present_and_valid_passes(self):
        # all present and valid
        PropertiesWhoseNamesAreJavascriptObjectPropertyNames.validate(
            {
                "__proto__":
                    12,
                "toString":
                    {
                        "length":
                            "foo",
                    },
                "constructor":
                    37,
            },
            configuration=self.configuration
        )


if __name__ == '__main__':
    unittest.main()
# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import unit_test_api
from unit_test_api.components.schema.properties_patternproperties_additionalproperties_interaction import PropertiesPatternpropertiesAdditionalpropertiesInteraction
from unit_test_api.configurations import schema_configuration


class TestPropertiesPatternpropertiesAdditionalpropertiesInteraction(unittest.TestCase):
    """PropertiesPatternpropertiesAdditionalpropertiesInteraction unit test stubs"""
    configuration = schema_configuration.SchemaConfiguration(
        disabled_json_schema_keywords={'format'}
    )

    def test_patternproperty_invalidates_property_fails(self):
        # patternProperty invalidates property
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            PropertiesPatternpropertiesAdditionalpropertiesInteraction.validate(
                {
                    "foo":
                        [
                        ],
                },
                configuration=self.configuration
            )

    def test_patternproperty_invalidates_nonproperty_fails(self):
        # patternProperty invalidates nonproperty
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            PropertiesPatternpropertiesAdditionalpropertiesInteraction.validate(
                {
                    "fxo":
                        [
                        ],
                },
                configuration=self.configuration
            )

    def test_additionalproperty_validates_others_passes(self):
        # additionalProperty validates others
        PropertiesPatternpropertiesAdditionalpropertiesInteraction.validate(
            {
                "quux":
                    3,
            },
            configuration=self.configuration
        )

    def test_property_invalidates_property_fails(self):
        # property invalidates property
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            PropertiesPatternpropertiesAdditionalpropertiesInteraction.validate(
                {
                    "foo":
                        [
                            1,
                            2,
                            3,
                            4,
                        ],
                },
                configuration=self.configuration
            )

    def test_additionalproperty_ignores_property_passes(self):
        # additionalProperty ignores property
        PropertiesPatternpropertiesAdditionalpropertiesInteraction.validate(
            {
                "bar":
                    [
                    ],
            },
            configuration=self.configuration
        )

    def test_additionalproperty_invalidates_others_fails(self):
        # additionalProperty invalidates others
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            PropertiesPatternpropertiesAdditionalpropertiesInteraction.validate(
                {
                    "quux":
                        "foo",
                },
                configuration=self.configuration
            )

    def test_patternproperty_validates_nonproperty_passes(self):
        # patternProperty validates nonproperty
        PropertiesPatternpropertiesAdditionalpropertiesInteraction.validate(
            {
                "fxo":
                    [
                        1,
                        2,
                    ],
            },
            configuration=self.configuration
        )

    def test_property_validates_property_passes(self):
        # property validates property
        PropertiesPatternpropertiesAdditionalpropertiesInteraction.validate(
            {
                "foo":
                    [
                        1,
                        2,
                    ],
            },
            configuration=self.configuration
        )


if __name__ == '__main__':
    unittest.main()

# coding: utf-8

"""
    openapi 3.0.3 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft6  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import unit_test_api
from unit_test_api.components.schema.required_validation import RequiredValidation
from unit_test_api.configurations import schema_configuration


class TestRequiredValidation(unittest.TestCase):
    """RequiredValidation unit test stubs"""
    configuration = schema_configuration.SchemaConfiguration()

    def test_ignores_arrays_passes(self):
        # ignores arrays
        RequiredValidation.validate(
            [
            ],
            configuration=self.configuration
        )

    def test_present_required_property_is_valid_passes(self):
        # present required property is valid
        RequiredValidation.validate(
            {
                "foo":
                    1,
            },
            configuration=self.configuration
        )

    def test_ignores_other_non_objects_passes(self):
        # ignores other non-objects
        RequiredValidation.validate(
            12,
            configuration=self.configuration
        )

    def test_ignores_strings_passes(self):
        # ignores strings
        RequiredValidation.validate(
            "",
            configuration=self.configuration
        )

    def test_non_present_required_property_is_invalid_fails(self):
        # non-present required property is invalid
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            RequiredValidation.validate(
                {
                    "bar":
                        1,
                },
                configuration=self.configuration
            )


if __name__ == '__main__':
    unittest.main()

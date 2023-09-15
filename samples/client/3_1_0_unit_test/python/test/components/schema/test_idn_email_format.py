# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import unit_test_api
from unit_test_api.components.schema.idn_email_format import IdnEmailFormat
from unit_test_api.configurations import schema_configuration


class TestIdnEmailFormat(unittest.TestCase):
    """IdnEmailFormat unit test stubs"""
    configuration = schema_configuration.SchemaConfiguration()

    def test_invalid_idn_email_string_is_only_an_annotation_by_default_passes(self):
        # invalid idn-email string is only an annotation by default
        IdnEmailFormat.validate(
            "2962",
            configuration=self.configuration
        )

    def test_all_string_formats_ignore_objects_passes(self):
        # all string formats ignore objects
        IdnEmailFormat.validate(
            {
            },
            configuration=self.configuration
        )

    def test_all_string_formats_ignore_booleans_passes(self):
        # all string formats ignore booleans
        IdnEmailFormat.validate(
            False,
            configuration=self.configuration
        )

    def test_all_string_formats_ignore_integers_passes(self):
        # all string formats ignore integers
        IdnEmailFormat.validate(
            12,
            configuration=self.configuration
        )

    def test_all_string_formats_ignore_floats_passes(self):
        # all string formats ignore floats
        IdnEmailFormat.validate(
            13.7,
            configuration=self.configuration
        )

    def test_all_string_formats_ignore_arrays_passes(self):
        # all string formats ignore arrays
        IdnEmailFormat.validate(
            [
            ],
            configuration=self.configuration
        )

    def test_all_string_formats_ignore_nulls_passes(self):
        # all string formats ignore nulls
        IdnEmailFormat.validate(
            None,
            configuration=self.configuration
        )


if __name__ == '__main__':
    unittest.main()

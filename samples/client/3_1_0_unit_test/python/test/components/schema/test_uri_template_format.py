# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import unit_test_api
from unit_test_api.components.schema.uri_template_format import UriTemplateFormat
from unit_test_api.configurations import schema_configuration


class TestUriTemplateFormat(unittest.TestCase):
    """UriTemplateFormat unit test stubs"""
    configuration = schema_configuration.SchemaConfiguration(
        disabled_json_schema_keywords={'format'}
    )

    def test_all_string_formats_ignore_objects_passes(self):
        # all string formats ignore objects
        UriTemplateFormat.validate(
            {
            },
            configuration=self.configuration
        )

    def test_all_string_formats_ignore_booleans_passes(self):
        # all string formats ignore booleans
        UriTemplateFormat.validate(
            False,
            configuration=self.configuration
        )

    def test_all_string_formats_ignore_integers_passes(self):
        # all string formats ignore integers
        UriTemplateFormat.validate(
            12,
            configuration=self.configuration
        )

    def test_all_string_formats_ignore_floats_passes(self):
        # all string formats ignore floats
        UriTemplateFormat.validate(
            13.7,
            configuration=self.configuration
        )

    def test_all_string_formats_ignore_arrays_passes(self):
        # all string formats ignore arrays
        UriTemplateFormat.validate(
            [
            ],
            configuration=self.configuration
        )

    def test_invalid_uri_template_string_is_only_an_annotation_by_default_passes(self):
        # invalid uri-template string is only an annotation by default
        UriTemplateFormat.validate(
            "http://example.com/dictionary/{term:1}/{term",
            configuration=self.configuration
        )

    def test_all_string_formats_ignore_nulls_passes(self):
        # all string formats ignore nulls
        UriTemplateFormat.validate(
            None,
            configuration=self.configuration
        )


if __name__ == '__main__':
    unittest.main()

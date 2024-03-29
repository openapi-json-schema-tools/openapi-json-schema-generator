# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import unit_test_api
from unit_test_api.components.schema.relative_json_pointer_format import RelativeJsonPointerFormat
from unit_test_api.configurations import schema_configuration


class TestRelativeJsonPointerFormat(unittest.TestCase):
    """RelativeJsonPointerFormat unit test stubs"""
    configuration = schema_configuration.SchemaConfiguration(
        disabled_json_schema_keywords={'format'}
    )

    def test_invalid_relative_json_pointer_string_is_only_an_annotation_by_default_passes(self):
        # invalid relative-json-pointer string is only an annotation by default
        RelativeJsonPointerFormat.validate(
            "/foo/bar",
            configuration=self.configuration
        )

    def test_all_string_formats_ignore_objects_passes(self):
        # all string formats ignore objects
        RelativeJsonPointerFormat.validate(
            {
            },
            configuration=self.configuration
        )

    def test_all_string_formats_ignore_booleans_passes(self):
        # all string formats ignore booleans
        RelativeJsonPointerFormat.validate(
            False,
            configuration=self.configuration
        )

    def test_all_string_formats_ignore_integers_passes(self):
        # all string formats ignore integers
        RelativeJsonPointerFormat.validate(
            12,
            configuration=self.configuration
        )

    def test_all_string_formats_ignore_floats_passes(self):
        # all string formats ignore floats
        RelativeJsonPointerFormat.validate(
            13.7,
            configuration=self.configuration
        )

    def test_all_string_formats_ignore_arrays_passes(self):
        # all string formats ignore arrays
        RelativeJsonPointerFormat.validate(
            [
            ],
            configuration=self.configuration
        )

    def test_all_string_formats_ignore_nulls_passes(self):
        # all string formats ignore nulls
        RelativeJsonPointerFormat.validate(
            None,
            configuration=self.configuration
        )


if __name__ == '__main__':
    unittest.main()

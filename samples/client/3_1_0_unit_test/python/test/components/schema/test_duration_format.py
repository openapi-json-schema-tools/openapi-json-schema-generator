# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import unit_test_api
from unit_test_api.components.schema.duration_format import DurationFormat
from unit_test_api.configurations import schema_configuration


class TestDurationFormat(unittest.TestCase):
    """DurationFormat unit test stubs"""
    configuration = schema_configuration.SchemaConfiguration()

    def test_invalid_duration_string_is_only_an_annotation_by_default_passes(self):
        # invalid duration string is only an annotation by default
        DurationFormat.validate(
            "PT1D",
            configuration=self.configuration
        )

    def test_all_string_formats_ignore_objects_passes(self):
        # all string formats ignore objects
        DurationFormat.validate(
            {
            },
            configuration=self.configuration
        )

    def test_all_string_formats_ignore_booleans_passes(self):
        # all string formats ignore booleans
        DurationFormat.validate(
            False,
            configuration=self.configuration
        )

    def test_all_string_formats_ignore_integers_passes(self):
        # all string formats ignore integers
        DurationFormat.validate(
            12,
            configuration=self.configuration
        )

    def test_all_string_formats_ignore_floats_passes(self):
        # all string formats ignore floats
        DurationFormat.validate(
            13.7,
            configuration=self.configuration
        )

    def test_all_string_formats_ignore_arrays_passes(self):
        # all string formats ignore arrays
        DurationFormat.validate(
            [
            ],
            configuration=self.configuration
        )

    def test_all_string_formats_ignore_nulls_passes(self):
        # all string formats ignore nulls
        DurationFormat.validate(
            None,
            configuration=self.configuration
        )


if __name__ == '__main__':
    unittest.main()

# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import unit_test_api
from unit_test_api.components.schema.date_time_format import DateTimeFormat
from unit_test_api.configurations import schema_configuration


class TestDateTimeFormat(unittest.TestCase):
    """DateTimeFormat unit test stubs"""
    configuration = schema_configuration.SchemaConfiguration()

    def test_invalid_date_time_string_is_only_an_annotation_by_default_passes(self):
        # invalid date-time string is only an annotation by default
        DateTimeFormat.validate(
            "1990-02-31T15:59:60.123-08:00",
            configuration=self.configuration
        )

    def test_all_string_formats_ignore_objects_passes(self):
        # all string formats ignore objects
        DateTimeFormat.validate(
            {
            },
            configuration=self.configuration
        )

    def test_all_string_formats_ignore_booleans_passes(self):
        # all string formats ignore booleans
        DateTimeFormat.validate(
            False,
            configuration=self.configuration
        )

    def test_all_string_formats_ignore_integers_passes(self):
        # all string formats ignore integers
        DateTimeFormat.validate(
            12,
            configuration=self.configuration
        )

    def test_all_string_formats_ignore_floats_passes(self):
        # all string formats ignore floats
        DateTimeFormat.validate(
            13.7,
            configuration=self.configuration
        )

    def test_all_string_formats_ignore_arrays_passes(self):
        # all string formats ignore arrays
        DateTimeFormat.validate(
            [
            ],
            configuration=self.configuration
        )

    def test_all_string_formats_ignore_nulls_passes(self):
        # all string formats ignore nulls
        DateTimeFormat.validate(
            None,
            configuration=self.configuration
        )


if __name__ == '__main__':
    unittest.main()

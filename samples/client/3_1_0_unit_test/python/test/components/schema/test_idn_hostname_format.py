# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import unit_test_api
from unit_test_api.components.schema.idn_hostname_format import IdnHostnameFormat
from unit_test_api.configurations import schema_configuration


class TestIdnHostnameFormat(unittest.TestCase):
    """IdnHostnameFormat unit test stubs"""
    configuration = schema_configuration.SchemaConfiguration()

    def test_invalid_idn_hostname_string_is_only_an_annotation_by_default_passes(self):
        # invalid idn-hostname string is only an annotation by default
        IdnHostnameFormat.validate(
            "〮실례.테스트",
            configuration=self.configuration
        )

    def test_all_string_formats_ignore_objects_passes(self):
        # all string formats ignore objects
        IdnHostnameFormat.validate(
            {
            },
            configuration=self.configuration
        )

    def test_all_string_formats_ignore_booleans_passes(self):
        # all string formats ignore booleans
        IdnHostnameFormat.validate(
            False,
            configuration=self.configuration
        )

    def test_all_string_formats_ignore_integers_passes(self):
        # all string formats ignore integers
        IdnHostnameFormat.validate(
            12,
            configuration=self.configuration
        )

    def test_all_string_formats_ignore_floats_passes(self):
        # all string formats ignore floats
        IdnHostnameFormat.validate(
            13.7,
            configuration=self.configuration
        )

    def test_all_string_formats_ignore_arrays_passes(self):
        # all string formats ignore arrays
        IdnHostnameFormat.validate(
            [
            ],
            configuration=self.configuration
        )

    def test_all_string_formats_ignore_nulls_passes(self):
        # all string formats ignore nulls
        IdnHostnameFormat.validate(
            None,
            configuration=self.configuration
        )


if __name__ == '__main__':
    unittest.main()

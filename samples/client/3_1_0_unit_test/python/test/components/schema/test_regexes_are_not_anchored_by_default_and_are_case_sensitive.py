# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import unit_test_api
from unit_test_api.components.schema.regexes_are_not_anchored_by_default_and_are_case_sensitive import RegexesAreNotAnchoredByDefaultAndAreCaseSensitive
from unit_test_api.configurations import schema_configuration


class TestRegexesAreNotAnchoredByDefaultAndAreCaseSensitive(unittest.TestCase):
    """RegexesAreNotAnchoredByDefaultAndAreCaseSensitive unit test stubs"""
    configuration = schema_configuration.SchemaConfiguration(
        disabled_json_schema_keywords={'format'}
    )

    def test_regexes_are_case_sensitive2_fails(self):
        # regexes are case sensitive, 2
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.validate(
                {
                    "a_X_3":
                        3,
                },
                configuration=self.configuration
            )

    def test_non_recognized_members_are_ignored_passes(self):
        # non recognized members are ignored
        RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.validate(
            {
                "answer 1":
                    "42",
            },
            configuration=self.configuration
        )

    def test_recognized_members_are_accounted_for_fails(self):
        # recognized members are accounted for
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.validate(
                {
                    "a31b":
                        None,
                },
                configuration=self.configuration
            )

    def test_regexes_are_case_sensitive_passes(self):
        # regexes are case sensitive
        RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.validate(
            {
                "a_x_3":
                    3,
            },
            configuration=self.configuration
        )


if __name__ == '__main__':
    unittest.main()
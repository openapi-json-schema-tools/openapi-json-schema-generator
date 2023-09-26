# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import unit_test_api
from unit_test_api.components.schema.multiple_dependents_required import MultipleDependentsRequired
from unit_test_api.configurations import schema_configuration


class TestMultipleDependentsRequired(unittest.TestCase):
    """MultipleDependentsRequired unit test stubs"""
    configuration = schema_configuration.SchemaConfiguration(
        disabled_json_schema_keywords={'format'}
    )

    def test_nondependants_passes(self):
        # nondependants
        MultipleDependentsRequired.validate(
            {
                "foo":
                    1,
                "bar":
                    2,
            },
            configuration=self.configuration
        )

    def test_with_dependencies_passes(self):
        # with dependencies
        MultipleDependentsRequired.validate(
            {
                "foo":
                    1,
                "bar":
                    2,
                "quux":
                    3,
            },
            configuration=self.configuration
        )

    def test_missing_both_dependencies_fails(self):
        # missing both dependencies
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            MultipleDependentsRequired.validate(
                {
                    "quux":
                        1,
                },
                configuration=self.configuration
            )

    def test_neither_passes(self):
        # neither
        MultipleDependentsRequired.validate(
            {
            },
            configuration=self.configuration
        )

    def test_missing_dependency_fails(self):
        # missing dependency
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            MultipleDependentsRequired.validate(
                {
                    "foo":
                        1,
                    "quux":
                        2,
                },
                configuration=self.configuration
            )

    def test_missing_other_dependency_fails(self):
        # missing other dependency
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            MultipleDependentsRequired.validate(
                {
                    "bar":
                        1,
                    "quux":
                        2,
                },
                configuration=self.configuration
            )


if __name__ == '__main__':
    unittest.main()
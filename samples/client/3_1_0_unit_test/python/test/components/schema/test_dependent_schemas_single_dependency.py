# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import unit_test_api
from unit_test_api.components.schema.dependent_schemas_single_dependency import DependentSchemasSingleDependency
from unit_test_api.configurations import schema_configuration


class TestDependentSchemasSingleDependency(unittest.TestCase):
    """DependentSchemasSingleDependency unit test stubs"""
    configuration = schema_configuration.SchemaConfiguration(
        disabled_json_schema_keywords={'format'}
    )

    def test_valid_passes(self):
        # valid
        DependentSchemasSingleDependency.validate(
            {
                "foo":
                    1,
                "bar":
                    2,
            },
            configuration=self.configuration
        )

    def test_ignores_arrays_passes(self):
        # ignores arrays
        DependentSchemasSingleDependency.validate(
            [
                "bar",
            ],
            configuration=self.configuration
        )

    def test_ignores_other_non_objects_passes(self):
        # ignores other non-objects
        DependentSchemasSingleDependency.validate(
            12,
            configuration=self.configuration
        )

    def test_wrong_type_other_fails(self):
        # wrong type other
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            DependentSchemasSingleDependency.validate(
                {
                    "foo":
                        2,
                    "bar":
                        "quux",
                },
                configuration=self.configuration
            )

    def test_ignores_strings_passes(self):
        # ignores strings
        DependentSchemasSingleDependency.validate(
            "foobar",
            configuration=self.configuration
        )

    def test_no_dependency_passes(self):
        # no dependency
        DependentSchemasSingleDependency.validate(
            {
                "foo":
                    "quux",
            },
            configuration=self.configuration
        )

    def test_wrong_type_both_fails(self):
        # wrong type both
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            DependentSchemasSingleDependency.validate(
                {
                    "foo":
                        "quux",
                    "bar":
                        "quux",
                },
                configuration=self.configuration
            )

    def test_wrong_type_fails(self):
        # wrong type
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            DependentSchemasSingleDependency.validate(
                {
                    "foo":
                        "quux",
                    "bar":
                        2,
                },
                configuration=self.configuration
            )


if __name__ == '__main__':
    unittest.main()

# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import unit_test_api
from unit_test_api.components.schema.required_default_validation import RequiredDefaultValidation
from unit_test_api.configurations import schema_configuration


class TestRequiredDefaultValidation(unittest.TestCase):
    """RequiredDefaultValidation unit test stubs"""
    configuration = schema_configuration.SchemaConfiguration(
        disabled_json_schema_keywords={'format'}
    )

    def test_not_required_by_default_passes(self):
        # not required by default
        RequiredDefaultValidation.validate(
            {
            },
            configuration=self.configuration
        )


if __name__ == '__main__':
    unittest.main()
# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import unit_test_api
from unit_test_api.components.schema.nested_allof_to_check_validation_semantics import NestedAllofToCheckValidationSemantics
from unit_test_api.configurations import schema_configuration


class TestNestedAllofToCheckValidationSemantics(unittest.TestCase):
    """NestedAllofToCheckValidationSemantics unit test stubs"""
    configuration = schema_configuration.SchemaConfiguration()

    def test_anything_non_null_is_invalid_fails(self):
        # anything non-null is invalid
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            NestedAllofToCheckValidationSemantics.validate(
                123,
                configuration=self.configuration
            )

    def test_null_is_valid_passes(self):
        # null is valid
        NestedAllofToCheckValidationSemantics.validate(
            None,
            configuration=self.configuration
        )


if __name__ == '__main__':
    unittest.main()

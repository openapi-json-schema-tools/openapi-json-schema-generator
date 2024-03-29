# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import unit_test_api
from unit_test_api.components.schema.enum_with0_does_not_match_false import EnumWith0DoesNotMatchFalse
from unit_test_api.configurations import schema_configuration


class TestEnumWith0DoesNotMatchFalse(unittest.TestCase):
    """EnumWith0DoesNotMatchFalse unit test stubs"""
    configuration = schema_configuration.SchemaConfiguration(
        disabled_json_schema_keywords={'format'}
    )

    def test_integer_zero_is_valid_passes(self):
        # integer zero is valid
        EnumWith0DoesNotMatchFalse.validate(
            0,
            configuration=self.configuration
        )

    def test_float_zero_is_valid_passes(self):
        # float zero is valid
        EnumWith0DoesNotMatchFalse.validate(
            0.0,
            configuration=self.configuration
        )

    def test_false_is_invalid_fails(self):
        # false is invalid
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            EnumWith0DoesNotMatchFalse.validate(
                False,
                configuration=self.configuration
            )


if __name__ == '__main__':
    unittest.main()

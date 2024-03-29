# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import unit_test_api
from unit_test_api.components.schema.float_division_inf import FloatDivisionInf
from unit_test_api.configurations import schema_configuration


class TestFloatDivisionInf(unittest.TestCase):
    """FloatDivisionInf unit test stubs"""
    configuration = schema_configuration.SchemaConfiguration(
        disabled_json_schema_keywords={'format'}
    )

    def test_always_invalid_but_naive_implementations_may_raise_an_overflow_error_fails(self):
        # always invalid, but naive implementations may raise an overflow error
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            FloatDivisionInf.validate(
                1.0E308,
                configuration=self.configuration
            )


if __name__ == '__main__':
    unittest.main()

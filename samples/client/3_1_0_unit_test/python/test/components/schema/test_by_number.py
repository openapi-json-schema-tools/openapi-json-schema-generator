# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import unit_test_api
from unit_test_api.components.schema.by_number import ByNumber
from unit_test_api.configurations import schema_configuration


class TestByNumber(unittest.TestCase):
    """ByNumber unit test stubs"""
    configuration = schema_configuration.SchemaConfiguration()

    def test_45_is_multiple_of15_passes(self):
        # 4.5 is multiple of 1.5
        ByNumber.validate(
            4.5,
            configuration=self.configuration
        )

    def test_35_is_not_multiple_of15_fails(self):
        # 35 is not multiple of 1.5
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            ByNumber.validate(
                35,
                configuration=self.configuration
            )

    def test_zero_is_multiple_of_anything_passes(self):
        # zero is multiple of anything
        ByNumber.validate(
            0,
            configuration=self.configuration
        )


if __name__ == '__main__':
    unittest.main()

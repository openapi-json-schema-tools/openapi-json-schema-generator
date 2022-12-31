# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""


import sys
import unittest

import petstore_api
from petstore_api.components.schema.number_with_validations import NumberWithValidations


class TestNumberWithValidations(unittest.TestCase):
    """NumberWithValidations unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testNumberWithValidations(self):
        """Test NumberWithValidations"""
        valid_values = [10.0, 15.0, 20.0]
        for valid_value in valid_values:
            model = NumberWithValidations(valid_value)
            assert model == valid_value

        value_error_msg_pairs = (
            (9.0, r"Invalid value `9.0`, must be a value greater than or equal to `10` at \('args\[0\]',\)"),
            (21.0, r"Invalid value `21.0`, must be a value less than or equal to `20` at \('args\[0\]',\)"),
        )
        for invalid_value, error_msg in value_error_msg_pairs:
            with self.assertRaisesRegex(petstore_api.ApiValueError, error_msg):
                NumberWithValidations(invalid_value)


if __name__ == '__main__':
    unittest.main()

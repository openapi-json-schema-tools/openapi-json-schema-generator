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
from petstore_api.components.schema.integer_enum_one_value import IntegerEnumOneValue


class TestIntegerEnumOneValue(unittest.TestCase):
    """IntegerEnumOneValue unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testIntegerEnumOneValue(self):
        """Test IntegerEnumOneValue"""

        with self.assertRaises(TypeError):
            """
            a value must be passed in
            We cannot auto assign values because that would break composition if
            received payloads included this with no inputs and we the 0 value to the data to the incoming payload
            One is not allowed to mutate incoming payloads because then:
            - order of composed schema ingestion matters
            - one can have default value collisions
            - the added data will make expected schemas not match payloads
            """
            model = IntegerEnumOneValue.validate()

        model = IntegerEnumOneValue.validate(0)
        assert model == 0, "We can pass in the value as a positional arg"

        # one can pass in the enum value
        model = IntegerEnumOneValue.validate(IntegerEnumOneValue.enums.POSITIVE_0)

if __name__ == '__main__':
    unittest.main()

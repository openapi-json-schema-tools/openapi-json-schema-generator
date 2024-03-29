# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""


import unittest

from petstore_api.components.schema import integer_enum


class TestIntegerENum(unittest.TestCase):
    """StringEnum unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testIntegerEnum(self):
        inst = integer_enum.IntegerEnum.validate(0)
        assert isinstance(inst, int)
        assert inst is 0

        inst = integer_enum.IntegerEnum.validate(1)
        assert isinstance(inst, int)
        assert inst is 1

        inst = integer_enum.IntegerEnum.validate(2)
        assert isinstance(inst, int)
        assert inst is 2



if __name__ == '__main__':
    unittest.main()

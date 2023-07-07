# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""


import unittest

import petstore_api
from petstore_api.components.schema.string_enum import StringEnum
from petstore_api.schemas import none_type_


class TestStringEnum(unittest.TestCase):
    """StringEnum unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testStringEnum(self):
        """Test StringEnum"""
        inst = StringEnum.validate(None)
        assert isinstance(inst, none_type_)
        assert inst is None

        inst = StringEnum.validate('approved')
        assert isinstance(inst, str)
        assert inst == 'approved'

        with self.assertRaises(petstore_api.ApiValueError):
            StringEnum.validate('garbage')

        # make sure that we can access its allowed_values
        assert isinstance(StringEnum.enums.NONE, none_type_)
        assert StringEnum.enums.PLACED == 'placed'
        assert StringEnum.enums.APPROVED == 'approved'
        assert StringEnum.enums.DELIVERED == 'delivered'
        assert StringEnum.enums.DOUBLE_QUOTE_LINE_FEED_LF_WITH_NEWLINE == "double quote \n with newline"
        assert StringEnum.enums.MULTIPLE_LINE_FEED_LF_LINES == "multiple\nlines"
        assert StringEnum.enums.SINGLE_QUOTED == "single quoted"


if __name__ == '__main__':
    unittest.main()

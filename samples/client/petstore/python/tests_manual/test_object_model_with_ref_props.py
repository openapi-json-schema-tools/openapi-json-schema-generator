# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

from petstore_api import schemas
from petstore_api.components.schema import object_model_with_ref_props


class TestObjectModelWithRefProps(unittest.TestCase):
    """ObjectModelWithRefProps unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testObjectModelWithRefProps(self):
        """Test ObjectModelWithRefProps"""
        inst = object_model_with_ref_props.ObjectModelWithRefProps.validate({'myNumber': 15.0, 'myString': "a", 'myBoolean': True})
        assert isinstance(inst, object_model_with_ref_props.ObjectModelWithRefPropsDict)
        assert isinstance(inst, schemas.immutabledict)
        assert set(inst.keys()) == {"myNumber", "myString", "myBoolean"}
        assert inst["myNumber"] == 15.0
        assert isinstance(inst["myNumber"], float)
        assert inst["myString"] == 'a'
        assert isinstance(inst["myString"], str)
        assert inst["myBoolean"] is True


if __name__ == '__main__':
    unittest.main()
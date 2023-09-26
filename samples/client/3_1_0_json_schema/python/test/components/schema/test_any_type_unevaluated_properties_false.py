# coding: utf-8

"""
    Example
    No description provided (generated by Openapi JSON Schema Generator https://github.com/openapi-json-schema-tools/openapi-json-schema-generator)  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import json_schema_api
from json_schema_api.components.schema.any_type_unevaluated_properties_false import AnyTypeUnevaluatedPropertiesFalse


class TestAnyTypeUnevaluatedPropertiesFalse(unittest.TestCase):
    """AnyTypeUnevaluatedPropertiesFalse unit test stubs"""

    def test_succeeds_with_no_unevaluated_properties(self):
        inst = AnyTypeUnevaluatedPropertiesFalse.validate({})
        assert inst == {}

    def test_fails_with_unevaluated_property(self):
        with self.assertRaises(json_schema_api.ApiValueError):
            AnyTypeUnevaluatedPropertiesFalse.validate({'foo': True})


if __name__ == '__main__':
    unittest.main()
# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose."  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import petstore_api
from petstore_api.components.schema.object_with_all_of_with_req_test_prop_from_unset_add_prop import ObjectWithAllOfWithReqTestPropFromUnsetAddProp
from petstore_api.configurations import schema_configuration


class TestObjectWithAllOfWithReqTestPropFromUnsetAddProp(unittest.TestCase):
    """ObjectWithAllOfWithReqTestPropFromUnsetAddProp unit test stubs"""
    configuration = schema_configuration.SchemaConfiguration(
        disabled_json_schema_keywords={'format'}
    )


if __name__ == '__main__':
    unittest.main()

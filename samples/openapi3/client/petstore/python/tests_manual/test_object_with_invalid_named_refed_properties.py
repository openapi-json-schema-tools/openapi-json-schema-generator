# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

from petstore_api import exceptions
from petstore_api.components.schema.object_with_invalid_named_refed_properties import ObjectWithInvalidNamedRefedProperties
from petstore_api.components.schema.array_with_validations_in_items import ArrayWithValidationsInItems
from petstore_api.components.schema.from_schema import FromSchema


class TestObjectWithInvalidNamedRefedProperties(unittest.TestCase):
    """ObjectWithInvalidNamedRefedProperties unit test stubs"""

    def test_instantiation_success(self):
        array_value = ArrayWithValidationsInItems(
            [4, 5]
        )
        from_value = FromSchema({'data': 'abc', 'id': 1})
        kwargs = {
            'from': from_value,
            '!reference': array_value
        }
        # __new__ creation works
        inst = ObjectWithInvalidNamedRefedProperties(
            **kwargs
        )
        primitive_data = {
            'from': {'data': 'abc', 'id': 1},
            '!reference': (4, 5)
        }
        assert inst == primitive_data
        # from_openapi_data_ works
        inst = ObjectWithInvalidNamedRefedProperties.from_openapi_data_(primitive_data)
        assert inst == primitive_data

    def test_omitting_required_properties_fails(self):
        array_value = ArrayWithValidationsInItems(
            [4, 5]
        )
        from_value = FromSchema({'data': 'abc', 'id': 1})
        with self.assertRaises(exceptions.ApiTypeError):
            ObjectWithInvalidNamedRefedProperties(
                {
                    'from': from_value,
                }
            )
        with self.assertRaises(exceptions.ApiTypeError):
            ObjectWithInvalidNamedRefedProperties(
                {
                    '!reference': array_value
                }
            )
        with self.assertRaises(exceptions.ApiTypeError):
            ObjectWithInvalidNamedRefedProperties.from_openapi_data_(
                {
                    'from': {'data': 'abc', 'id': 1},
                }
            )
        with self.assertRaises(exceptions.ApiTypeError):
            ObjectWithInvalidNamedRefedProperties.from_openapi_data_(
                {
                    '!reference': [4, 5]
                }
            )


if __name__ == '__main__':
    unittest.main()

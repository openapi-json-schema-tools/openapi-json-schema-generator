# coding: utf-8

"""
    openapi 3.0.3 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft6  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import unit_test_api
from unit_test_api.components.schema._not import _Not
from unit_test_api.configurations import schema_configuration


class Test_Not(unittest.TestCase):
    """_Not unit test stubs"""
    configuration = schema_configuration.SchemaConfiguration()

    def test_allowed_passes(self):
        # allowed
        _Not.validate(
            "foo",
            configuration=self.configuration
        )

    def test_disallowed_fails(self):
        # disallowed
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            _Not.validate(
                1,
                configuration=self.configuration
            )


if __name__ == '__main__':
    unittest.main()
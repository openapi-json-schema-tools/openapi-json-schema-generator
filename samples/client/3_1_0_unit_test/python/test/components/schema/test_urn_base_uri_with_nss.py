# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import unit_test_api
from unit_test_api.components.schema.urn_base_uri_with_nss import UrnBaseUriWithNss
from unit_test_api.configurations import schema_configuration


class TestUrnBaseUriWithNss(unittest.TestCase):
    """UrnBaseUriWithNss unit test stubs"""
    configuration = schema_configuration.SchemaConfiguration()

    def test_a_string_is_valid_passes(self):
        # a string is valid
        UrnBaseUriWithNss.validate(
            {
                "foo":
                    "bar",
            },
            configuration=self.configuration
        )

    def test_a_non_string_is_invalid_fails(self):
        # a non-string is invalid
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            UrnBaseUriWithNss.validate(
                {
                    "foo":
                        12,
                },
                configuration=self.configuration
            )


if __name__ == '__main__':
    unittest.main()

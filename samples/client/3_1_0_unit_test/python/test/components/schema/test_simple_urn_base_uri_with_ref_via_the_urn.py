# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import unit_test_api
from unit_test_api.components.schema.simple_urn_base_uri_with_ref_via_the_urn import SimpleUrnBaseUriWithRefViaTheUrn
from unit_test_api.configurations import schema_configuration


class TestSimpleUrnBaseUriWithRefViaTheUrn(unittest.TestCase):
    """SimpleUrnBaseUriWithRefViaTheUrn unit test stubs"""
    configuration = schema_configuration.SchemaConfiguration()

    def test_valid_under_the_urn_ided_schema_passes(self):
        # valid under the URN IDed schema
        SimpleUrnBaseUriWithRefViaTheUrn.validate(
            {
                "foo":
                    37,
            },
            configuration=self.configuration
        )

    def test_invalid_under_the_urn_ided_schema_fails(self):
        # invalid under the URN IDed schema
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            SimpleUrnBaseUriWithRefViaTheUrn.validate(
                {
                    "foo":
                        12,
                },
                configuration=self.configuration
            )


if __name__ == '__main__':
    unittest.main()

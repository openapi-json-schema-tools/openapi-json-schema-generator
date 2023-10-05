# coding: utf-8

"""
    NetHSM
    All endpoints expect exactly the specified JSON. Additional properties will cause a Bad Request Error (400). All HTTP errors contain a JSON structure with an explanation of type string. All [base64](https://tools.ietf.org/html/rfc4648#section-4) encoded values are Big Endian.   # noqa: E501
    The version of the OpenAPI document: v1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest

import some_api
from some_api.components.schema.key_generate_request_data import KeyGenerateRequestData
from some_api.configurations import schema_configuration


class TestKeyGenerateRequestData(unittest.TestCase):
    """KeyGenerateRequestData unit test stubs"""
    configuration = schema_configuration.SchemaConfiguration(
        disabled_json_schema_keywords={'format'}
    )


if __name__ == '__main__':
    unittest.main()

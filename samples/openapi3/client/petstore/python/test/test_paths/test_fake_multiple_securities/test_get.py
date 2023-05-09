# coding: utf-8

"""


    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest
from unittest.mock import patch

import urllib3

import petstore_api
from petstore_api.paths.fake_multiple_securities.get import operation as get  # noqa: E501
from petstore_api import schemas, api_client
from petstore_api.configurations import api_configuration, schema_configuration

from .. import ApiTestMixin


class TestGet(ApiTestMixin, unittest.TestCase):
    """
    Get unit test stubs
        multiple security requirements  # noqa: E501
    """
    api_config = api_configuration.ApiConfiguration()
    schema_config = schema_configuration.SchemaConfiguration()
    used_api_client = api_client.ApiClient(configuration=api_config, schema_configuration=schema_config)
    api = get.ApiForGet(api_client=used_api_client)  # noqa: E501

    response_status = 200
    response_body_schema = get.response_200.ResponseFor200.content["application/json"].schema

if __name__ == '__main__':
    unittest.main()

# coding: utf-8

"""


    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest
from unittest.mock import patch

import urllib3

import petstore_api
from petstore_api.paths.fake_case_sensitive_params import put  # noqa: E501
from petstore_api import configuration, schemas, api_client

from .. import ApiTestMixin


class TestPut(ApiTestMixin, unittest.TestCase):
    """
    Put unit test stubs
    """
    configuration_ = configuration.Configuration()

    def setUp(self):
        used_api_client = api_client.ApiClient(configuration=self.configuration_)
        self.api = put.ApiForPut(api_client=used_api_client)  # noqa: E501

    def tearDown(self):
        pass

    response_status = 200
    response_body = ''

if __name__ == '__main__':
    unittest.main()

# coding: utf-8

"""


    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest
from unittest.mock import patch

import urllib3

import petstore_api
from petstore_api.paths.fake import delete  # noqa: E501
from petstore_api import configuration, schemas, api_client

from .. import ApiTestMixin


class TestGroupParameters(ApiTestMixin, unittest.TestCase):
    """
    GroupParameters unit test stubs
        Fake endpoint to test group parameters (optional)  # noqa: E501
    """
    configuration_ = configuration.Configuration()

    def setUp(self):
        used_api_client = api_client.ApiClient(configuration=self.configuration_)
        self.api = delete.ApiFordelete(api_client=used_api_client)  # noqa: E501

    def tearDown(self):
        pass

    response_status = 200
    response_body = ''

if __name__ == '__main__':
    unittest.main()

# coding: utf-8

"""


    Generated by: https://openapi-generator.tech
"""

import unittest
from unittest.mock import patch

import urllib3

import petstore_api
from petstore_api.paths.store_order import post  # noqa: E501
from petstore_api import configuration, schemas, api_client

from .. import ApiTestMixin


class TestStoreOrder(ApiTestMixin, unittest.TestCase):
    """
    StoreOrder unit test stubs
        Place an order for a pet  # noqa: E501
    """
    _configuration = configuration.Configuration()

    def setUp(self):
        used_api_client = api_client.ApiClient(configuration=self._configuration)
        self.api = post.ApiForpost(api_client=used_api_client)  # noqa: E501

    def tearDown(self):
        pass

    response_status = 200
    response_body_schema = post.response_for_200.schema
    response_body_schema = post.response_for_200.schema

if __name__ == '__main__':
    unittest.main()

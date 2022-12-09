# coding: utf-8

"""


    Generated by: https://openapi-generator.tech
"""

import unittest
from unittest.mock import patch

import urllib3

import petstore_api
from petstore_api.paths.store_order_order_id import get  # noqa: E501
from petstore_api import configuration, schemas, api_client

from .. import ApiTestMixin


class TestStoreOrderOrderId(ApiTestMixin, unittest.TestCase):
    """
    StoreOrderOrderId unit test stubs
        Find purchase order by ID  # noqa: E501
    """
    _configuration = configuration.Configuration()

    def setUp(self):
        used_api_client = api_client.ApiClient(configuration=self._configuration)
        self.api = get.ApiForget(api_client=used_api_client)  # noqa: E501

    def tearDown(self):
        pass

    response_status = 200
    response_body_schema = get.response_for_200.application_xml
    response_body_schema = get.response_for_200.application_json

if __name__ == '__main__':
    unittest.main()

# coding: utf-8

"""


    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest
from unittest.mock import patch

import urllib3

import petstore_api
from petstore_api.paths.fake_refs_arraymodel import post  # noqa: E501
from petstore_api import configuration, schemas, api_client

from .. import ApiTestMixin


class TestPost(ApiTestMixin, unittest.TestCase):
    """
    Post unit test stubs
    """
    configuration_ = configuration.Configuration()

    def setUp(self):
        used_api_client = api_client.ApiClient(configuration=self.configuration_)
        self.api = post.ApiForPost(api_client=used_api_client)  # noqa: E501

    def tearDown(self):
        pass

    response_status = 200
    response_body_schema = post.response_200._200.content["application/json"].schema

if __name__ == '__main__':
    unittest.main()

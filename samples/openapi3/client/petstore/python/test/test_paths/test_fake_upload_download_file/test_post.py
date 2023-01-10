# coding: utf-8

"""


    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest
from unittest.mock import patch

import urllib3

import petstore_api
from petstore_api.paths.fake_upload_download_file import post  # noqa: E501
from petstore_api import configuration, schemas, api_client

from .. import ApiTestMixin


class TestFakeUploadDownloadFile(ApiTestMixin, unittest.TestCase):
    """
    FakeUploadDownloadFile unit test stubs
        uploads a file and downloads a file using application/octet-stream  # noqa: E501
    """
    configuration_ = configuration.Configuration()

    def setUp(self):
        used_api_client = api_client.ApiClient(configuration=self.configuration_)
        self.api = post.ApiForpost(api_client=used_api_client)  # noqa: E501

    def tearDown(self):
        pass

    response_status = 200
    response_body_schema = post.response_200.schema.Schema

if __name__ == '__main__':
    unittest.main()

# coding: utf-8

"""


    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest
from unittest.mock import patch

import urllib3

import unit_test_api
from unit_test_api.paths.request_body_post_allof_combined_with_anyof_oneof_request_body import post  # noqa: E501
from unit_test_api import configuration, schemas, api_client

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
    response_body = ''

    def test_allof_true_anyof_false_oneof_false_fails(self):
        content_type = 'application/json'
        # allOf: true, anyOf: false, oneOf: false
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                2
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                body = post.request_body.RequestBody.content["application/json"].schema.from_openapi_data_(
                    payload,
                    configuration_=self.configuration_
                )
                self.api.post(body=body)

    def test_allof_false_anyof_false_oneof_true_fails(self):
        content_type = 'application/json'
        # allOf: false, anyOf: false, oneOf: true
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                5
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                body = post.request_body.RequestBody.content["application/json"].schema.from_openapi_data_(
                    payload,
                    configuration_=self.configuration_
                )
                self.api.post(body=body)

    def test_allof_false_anyof_true_oneof_true_fails(self):
        content_type = 'application/json'
        # allOf: false, anyOf: true, oneOf: true
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                15
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                body = post.request_body.RequestBody.content["application/json"].schema.from_openapi_data_(
                    payload,
                    configuration_=self.configuration_
                )
                self.api.post(body=body)

    def test_allof_true_anyof_true_oneof_false_fails(self):
        content_type = 'application/json'
        # allOf: true, anyOf: true, oneOf: false
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                6
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                body = post.request_body.RequestBody.content["application/json"].schema.from_openapi_data_(
                    payload,
                    configuration_=self.configuration_
                )
                self.api.post(body=body)

    def test_allof_true_anyof_true_oneof_true_passes(self):
        content_type = 'application/json'
        # allOf: true, anyOf: true, oneOf: true
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                30
            )
            body = post.request_body.RequestBody.content["application/json"].schema.from_openapi_data_(
                payload,
                configuration_=self.configuration_
            )
            mock_request.return_value = self.response(
                self.json_bytes(self.response_body),
                status=self.response_status
            )
            api_response = self.api.post(
                body=body,
                content_type=content_type
            )
            self.assert_pool_manager_request_called_with(
                mock_request,
                self.configuration_.host + "/requestBody/postAllofCombinedWithAnyofOneofRequestBody",
                method='post'.upper(),
                body=self.json_bytes(payload),
                content_type=content_type,
            )

            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, schemas.Unset)

    def test_allof_true_anyof_false_oneof_true_fails(self):
        content_type = 'application/json'
        # allOf: true, anyOf: false, oneOf: true
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                10
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                body = post.request_body.RequestBody.content["application/json"].schema.from_openapi_data_(
                    payload,
                    configuration_=self.configuration_
                )
                self.api.post(body=body)

    def test_allof_false_anyof_true_oneof_false_fails(self):
        content_type = 'application/json'
        # allOf: false, anyOf: true, oneOf: false
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                3
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                body = post.request_body.RequestBody.content["application/json"].schema.from_openapi_data_(
                    payload,
                    configuration_=self.configuration_
                )
                self.api.post(body=body)

    def test_allof_false_anyof_false_oneof_false_fails(self):
        content_type = 'application/json'
        # allOf: false, anyOf: false, oneOf: false
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                1
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                body = post.request_body.RequestBody.content["application/json"].schema.from_openapi_data_(
                    payload,
                    configuration_=self.configuration_
                )
                self.api.post(body=body)

if __name__ == '__main__':
    unittest.main()

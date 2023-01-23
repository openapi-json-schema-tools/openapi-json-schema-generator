# coding: utf-8

"""


    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest
from unittest.mock import patch

import urllib3

import unit_test_api
from unit_test_api.paths.request_body_post_anyof_complex_types_request_body import post  # noqa: E501
from unit_test_api import configuration, schemas, api_client

from .. import ApiTestMixin


class TestRequestBodyPostAnyofComplexTypesRequestBody(ApiTestMixin, unittest.TestCase):
    """
    RequestBodyPostAnyofComplexTypesRequestBody unit test stubs
    """
    configuration_ = configuration.Configuration()

    def setUp(self):
        used_api_client = api_client.ApiClient(configuration=self.configuration_)
        self.api = post.ApiForpost(api_client=used_api_client)  # noqa: E501

    def tearDown(self):
        pass

    response_status = 200
    response_body = ''

    def test_second_anyof_valid_complex_passes(self):
        content_type = 'application/json'
        # second anyOf valid (complex)
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                {
                    "foo":
                        "baz",
                }
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
                self.configuration_.host + '/requestBody/postAnyofComplexTypesRequestBody',
                method='post'.upper(),
                body=self.json_bytes(payload),
                content_type=content_type,
            )

            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, schemas.Unset)

    def test_neither_anyof_valid_complex_fails(self):
        content_type = 'application/json'
        # neither anyOf valid (complex)
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                {
                    "foo":
                        2,
                    "bar":
                        "quux",
                }
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                body = post.request_body.RequestBody.content["application/json"].schema.from_openapi_data_(
                    payload,
                    configuration_=self.configuration_
                )
                self.api.post(body=body)

    def test_both_anyof_valid_complex_passes(self):
        content_type = 'application/json'
        # both anyOf valid (complex)
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                {
                    "foo":
                        "baz",
                    "bar":
                        2,
                }
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
                self.configuration_.host + '/requestBody/postAnyofComplexTypesRequestBody',
                method='post'.upper(),
                body=self.json_bytes(payload),
                content_type=content_type,
            )

            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, schemas.Unset)

    def test_first_anyof_valid_complex_passes(self):
        content_type = 'application/json'
        # first anyOf valid (complex)
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                {
                    "bar":
                        2,
                }
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
                self.configuration_.host + '/requestBody/postAnyofComplexTypesRequestBody',
                method='post'.upper(),
                body=self.json_bytes(payload),
                content_type=content_type,
            )

            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, schemas.Unset)

if __name__ == '__main__':
    unittest.main()

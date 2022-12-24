# coding: utf-8

"""


    Generated by: https://openapi-generator.tech
"""

import unittest
from unittest.mock import patch

import urllib3

import unit_test_api
from unit_test_api.paths.request_body_post_enum_with0_does_not_match_false_request_body import post  # noqa: E501
from unit_test_api import configuration, schemas, api_client

from .. import ApiTestMixin


class TestRequestBodyPostEnumWith0DoesNotMatchFalseRequestBody(ApiTestMixin, unittest.TestCase):
    """
    RequestBodyPostEnumWith0DoesNotMatchFalseRequestBody unit test stubs
    """
    _configuration = configuration.Configuration()

    def setUp(self):
        used_api_client = api_client.ApiClient(configuration=self._configuration)
        self.api = post.ApiForpost(api_client=used_api_client)  # noqa: E501

    def tearDown(self):
        pass

    response_status = 200
    response_body = ''

    def test_integer_zero_is_valid_passes(self):
        content_type = 'application/json'
        # integer zero is valid
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                0
            )
            body = post.request_body.enum_with0_does_not_match_false.EnumWith0DoesNotMatchFalse.from_openapi_data_oapg(
                payload,
                _configuration=self._configuration
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
                self._configuration.host + '/requestBody/postEnumWith0DoesNotMatchFalseRequestBody',
                method='post'.upper(),
                body=self.json_bytes(payload),
                content_type=content_type,
            )

            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, schemas.Unset)

    def test_float_zero_is_valid_passes(self):
        content_type = 'application/json'
        # float zero is valid
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                0.0
            )
            body = post.request_body.enum_with0_does_not_match_false.EnumWith0DoesNotMatchFalse.from_openapi_data_oapg(
                payload,
                _configuration=self._configuration
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
                self._configuration.host + '/requestBody/postEnumWith0DoesNotMatchFalseRequestBody',
                method='post'.upper(),
                body=self.json_bytes(payload),
                content_type=content_type,
            )

            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, schemas.Unset)

    def test_false_is_invalid_fails(self):
        content_type = 'application/json'
        # false is invalid
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                False
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                body = post.request_body.ApplicationJson.from_openapi_data_oapg(
                    payload,
                    _configuration=self._configuration
                )
                self.api.post(body=body)

if __name__ == '__main__':
    unittest.main()

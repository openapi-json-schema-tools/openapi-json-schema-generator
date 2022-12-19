# coding: utf-8

"""


    Generated by: https://openapi-generator.tech
"""

import unittest
from unittest.mock import patch

import urllib3

import unit_test_api
from unit_test_api.paths.request_body_post_invalid_instance_should_not_raise_error_when_float_division_inf_request_body import post  # noqa: E501
from unit_test_api import configuration, schemas, api_client

from .. import ApiTestMixin


class TestRequestBodyPostInvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInfRequestBody(ApiTestMixin, unittest.TestCase):
    """
    RequestBodyPostInvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInfRequestBody unit test stubs
    """
    _configuration = configuration.Configuration()

    def setUp(self):
        used_api_client = api_client.ApiClient(configuration=self._configuration)
        self.api = post.ApiForpost(api_client=used_api_client)  # noqa: E501

    def tearDown(self):
        pass

    response_status = 200
    response_body = ''

    def test_always_invalid_but_naive_implementations_may_raise_an_overflow_error_fails(self):
        content_type = 'application/json'
        # always invalid, but naive implementations may raise an overflow error
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                1.0E308
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                body = post.request_body.application_json.from_openapi_data_oapg(
                    payload,
                    _configuration=self._configuration
                )
                self.api.post(body=body)

    def test_valid_integer_with_multipleof_float_passes(self):
        content_type = 'application/json'
        # valid integer with multipleOf float
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                123456789
            )
            body = post.request_body.ApplicationJson.from_openapi_data_oapg(
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
                self._configuration.host + '/requestBody/postInvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInfRequestBody',
                method='post'.upper(),
                body=self.json_bytes(payload),
                content_type=content_type,
            )

            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, schemas.Unset)

if __name__ == '__main__':
    unittest.main()

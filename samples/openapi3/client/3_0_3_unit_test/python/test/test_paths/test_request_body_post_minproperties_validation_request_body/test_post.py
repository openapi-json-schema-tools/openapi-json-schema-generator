# coding: utf-8

"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest
from unittest.mock import patch

import urllib3
import typing_extensions

import unit_test_api
from unit_test_api.paths.request_body_post_minproperties_validation_request_body.post import operation as post  # noqa: E501
from unit_test_api import schemas, api_client
from unit_test_api.configurations import api_configuration, schema_configuration

from .. import ApiTestMixin


class TestPost(ApiTestMixin, unittest.TestCase):
    """
    Post unit test stubs
    """
    api_config = api_configuration.ApiConfiguration()
    schema_config = schema_configuration.SchemaConfiguration()
    used_api_client = api_client.ApiClient(configuration=api_config, schema_configuration=schema_config)
    api = post.ApiForPost(api_client=used_api_client)  # noqa: E501

    response_status = 200
    response_body = ''

    def test_ignores_arrays_passes(self):
        content_type = 'application/json'
        # ignores arrays
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                ]
            )
            body = post.request_body.RequestBody.content["application/json"].schema.from_openapi_data_(
                payload,
                configuration_=self.schema_config
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
                self.api_config.get_server_url('servers', None) + "/requestBody/postMinpropertiesValidationRequestBody",
                method='post'.upper(),
                body=self.json_bytes(payload),
                content_type=content_type,
            )

            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, schemas.Unset)

    def test_ignores_other_non_objects_passes(self):
        content_type = 'application/json'
        # ignores other non-objects
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                12
            )
            body = post.request_body.RequestBody.content["application/json"].schema.from_openapi_data_(
                payload,
                configuration_=self.schema_config
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
                self.api_config.get_server_url('servers', None) + "/requestBody/postMinpropertiesValidationRequestBody",
                method='post'.upper(),
                body=self.json_bytes(payload),
                content_type=content_type,
            )

            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, schemas.Unset)

    def test_too_short_is_invalid_fails(self):
        content_type = 'application/json'
        # too short is invalid
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                {
                }
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                body = post.request_body.RequestBody.content["application/json"].schema.from_openapi_data_(
                    payload,
                    configuration_=self.schema_config
                )
                self.api.post(body=body)

    def test_ignores_strings_passes(self):
        content_type = 'application/json'
        # ignores strings
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                ""
            )
            body = post.request_body.RequestBody.content["application/json"].schema.from_openapi_data_(
                payload,
                configuration_=self.schema_config
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
                self.api_config.get_server_url('servers', None) + "/requestBody/postMinpropertiesValidationRequestBody",
                method='post'.upper(),
                body=self.json_bytes(payload),
                content_type=content_type,
            )

            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, schemas.Unset)

    def test_longer_is_valid_passes(self):
        content_type = 'application/json'
        # longer is valid
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                {
                    "foo":
                        1,
                    "bar":
                        2,
                }
            )
            body = post.request_body.RequestBody.content["application/json"].schema.from_openapi_data_(
                payload,
                configuration_=self.schema_config
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
                self.api_config.get_server_url('servers', None) + "/requestBody/postMinpropertiesValidationRequestBody",
                method='post'.upper(),
                body=self.json_bytes(payload),
                content_type=content_type,
            )

            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, schemas.Unset)

    def test_exact_length_is_valid_passes(self):
        content_type = 'application/json'
        # exact length is valid
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                {
                    "foo":
                        1,
                }
            )
            body = post.request_body.RequestBody.content["application/json"].schema.from_openapi_data_(
                payload,
                configuration_=self.schema_config
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
                self.api_config.get_server_url('servers', None) + "/requestBody/postMinpropertiesValidationRequestBody",
                method='post'.upper(),
                body=self.json_bytes(payload),
                content_type=content_type,
            )

            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, schemas.Unset)

if __name__ == '__main__':
    unittest.main()

# coding: utf-8

"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest
from unittest.mock import patch

import urllib3
import typing_extensions

import unit_test_api
from unit_test_api.paths.request_body_post_uniqueitems_with_an_array_of_items_request_body.post import operation as post  # noqa: E501
from unit_test_api import schemas, api_client
from unit_test_api.configurations import api_configuration, schema_configuration

from .. import ApiTestMixin


class TestPost(ApiTestMixin, unittest.TestCase):
    """
    Post unit test stubs
    """
    api_config = api_configuration.ApiConfiguration()
    schema_config = schema_configuration.SchemaConfiguration(
        disabled_json_schema_keywords={'format'}
    )
    used_api_client = api_client.ApiClient(configuration=api_config, schema_configuration=schema_config)
    api = post.ApiForPost(api_client=used_api_client)  # noqa: E501

    response_status = 200
    response_body = ''

    def test_unique_array_extended_from_false_true_is_valid_passes(self):
        content_type = 'application/json'
        # unique array extended from [false, true] is valid
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    False,
                    True,
                    "foo",
                    "bar",
                ]
            )
            body = post.request_body.RequestBody.content["application/json"].schema.validate(
                payload,
                configuration=self.schema_config
            )
            mock_request.return_value = self.response(
                self.json_bytes(self.response_body),
                status=self.response_status
            )
            api_response = self.api.post(
                body=body,
            )
            self.assert_pool_manager_request_called_with(
                mock_request,
                self.api_config.get_server_url('servers', None) + "/requestBody/postUniqueitemsWithAnArrayOfItemsRequestBody",
                method='post'.upper(),
                body=self.json_bytes(payload),
                content_type=content_type,
            )

            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, schemas.Unset)

    def test_non_unique_array_extended_from_true_false_is_not_valid_fails(self):
        content_type = 'application/json'
        # non-unique array extended from [true, false] is not valid
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    True,
                    False,
                    "foo",
                    "foo",
                ]
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                body = post.request_body.RequestBody.content["application/json"].schema.validate(
                    payload,
                    configuration=self.schema_config
                )
                self.api.post(body=body)

    def test_true_true_from_items_array_is_not_valid_fails(self):
        content_type = 'application/json'
        # [true, true] from items array is not valid
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    True,
                    True,
                ]
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                body = post.request_body.RequestBody.content["application/json"].schema.validate(
                    payload,
                    configuration=self.schema_config
                )
                self.api.post(body=body)

    def test_false_true_from_items_array_is_valid_passes(self):
        content_type = 'application/json'
        # [false, true] from items array is valid
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    False,
                    True,
                ]
            )
            body = post.request_body.RequestBody.content["application/json"].schema.validate(
                payload,
                configuration=self.schema_config
            )
            mock_request.return_value = self.response(
                self.json_bytes(self.response_body),
                status=self.response_status
            )
            api_response = self.api.post(
                body=body,
            )
            self.assert_pool_manager_request_called_with(
                mock_request,
                self.api_config.get_server_url('servers', None) + "/requestBody/postUniqueitemsWithAnArrayOfItemsRequestBody",
                method='post'.upper(),
                body=self.json_bytes(payload),
                content_type=content_type,
            )

            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, schemas.Unset)

    def test_false_false_from_items_array_is_not_valid_fails(self):
        content_type = 'application/json'
        # [false, false] from items array is not valid
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    False,
                    False,
                ]
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                body = post.request_body.RequestBody.content["application/json"].schema.validate(
                    payload,
                    configuration=self.schema_config
                )
                self.api.post(body=body)

    def test_unique_array_extended_from_true_false_is_valid_passes(self):
        content_type = 'application/json'
        # unique array extended from [true, false] is valid
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    True,
                    False,
                    "foo",
                    "bar",
                ]
            )
            body = post.request_body.RequestBody.content["application/json"].schema.validate(
                payload,
                configuration=self.schema_config
            )
            mock_request.return_value = self.response(
                self.json_bytes(self.response_body),
                status=self.response_status
            )
            api_response = self.api.post(
                body=body,
            )
            self.assert_pool_manager_request_called_with(
                mock_request,
                self.api_config.get_server_url('servers', None) + "/requestBody/postUniqueitemsWithAnArrayOfItemsRequestBody",
                method='post'.upper(),
                body=self.json_bytes(payload),
                content_type=content_type,
            )

            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, schemas.Unset)

    def test_non_unique_array_extended_from_false_true_is_not_valid_fails(self):
        content_type = 'application/json'
        # non-unique array extended from [false, true] is not valid
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    False,
                    True,
                    "foo",
                    "foo",
                ]
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                body = post.request_body.RequestBody.content["application/json"].schema.validate(
                    payload,
                    configuration=self.schema_config
                )
                self.api.post(body=body)

    def test_true_false_from_items_array_is_valid_passes(self):
        content_type = 'application/json'
        # [true, false] from items array is valid
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    True,
                    False,
                ]
            )
            body = post.request_body.RequestBody.content["application/json"].schema.validate(
                payload,
                configuration=self.schema_config
            )
            mock_request.return_value = self.response(
                self.json_bytes(self.response_body),
                status=self.response_status
            )
            api_response = self.api.post(
                body=body,
            )
            self.assert_pool_manager_request_called_with(
                mock_request,
                self.api_config.get_server_url('servers', None) + "/requestBody/postUniqueitemsWithAnArrayOfItemsRequestBody",
                method='post'.upper(),
                body=self.json_bytes(payload),
                content_type=content_type,
            )

            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, schemas.Unset)

if __name__ == '__main__':
    unittest.main()

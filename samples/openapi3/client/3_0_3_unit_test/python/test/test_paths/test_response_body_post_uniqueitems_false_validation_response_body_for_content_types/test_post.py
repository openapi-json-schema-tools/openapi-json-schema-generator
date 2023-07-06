# coding: utf-8

"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest
from unittest.mock import patch

import urllib3
import typing_extensions

import unit_test_api
from unit_test_api.paths.response_body_post_uniqueitems_false_validation_response_body_for_content_types.post import operation as post  # noqa: E501
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
    response_body_schema = post.response_200.ResponseFor200.content["application/json"].schema
    assert response_body_schema is not None
    
    def test_non_unique_array_of_integers_is_valid_passes(self):
        # non-unique array of integers is valid
        accept_content_type = 'application/json'
    
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    1,
                    1,
                ]
            )
            mock_request.return_value = self.response(
                self.json_bytes(payload),
                status=self.response_status
            )
            api_response = self.api.post(
                accept_content_types=(accept_content_type,)
            )
            self.assert_pool_manager_request_called_with(
                mock_request,
                self.api_config.get_server_url('servers', None) + "/responseBody/postUniqueitemsFalseValidationResponseBodyForContentTypes",
                method='post'.upper(),
                accept_content_type=accept_content_type,
            )
    
            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, self.response_body_schema)
            deserialized_response_body = self.response_body_schema(
                payload,
                configuration=self.schema_config
            )
            assert api_response.body == deserialized_response_body
    
    def test_unique_array_of_objects_is_valid_passes(self):
        # unique array of objects is valid
        accept_content_type = 'application/json'
    
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    {
                        "foo":
                            "bar",
                    },
                    {
                        "foo":
                            "baz",
                    },
                ]
            )
            mock_request.return_value = self.response(
                self.json_bytes(payload),
                status=self.response_status
            )
            api_response = self.api.post(
                accept_content_types=(accept_content_type,)
            )
            self.assert_pool_manager_request_called_with(
                mock_request,
                self.api_config.get_server_url('servers', None) + "/responseBody/postUniqueitemsFalseValidationResponseBodyForContentTypes",
                method='post'.upper(),
                accept_content_type=accept_content_type,
            )
    
            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, self.response_body_schema)
            deserialized_response_body = self.response_body_schema(
                payload,
                configuration=self.schema_config
            )
            assert api_response.body == deserialized_response_body
    
    def test_non_unique_array_of_nested_objects_is_valid_passes(self):
        # non-unique array of nested objects is valid
        accept_content_type = 'application/json'
    
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    {
                        "foo":
                            {
                                "bar":
                                    {
                                        "baz":
                                            True,
                                    },
                            },
                    },
                    {
                        "foo":
                            {
                                "bar":
                                    {
                                        "baz":
                                            True,
                                    },
                            },
                    },
                ]
            )
            mock_request.return_value = self.response(
                self.json_bytes(payload),
                status=self.response_status
            )
            api_response = self.api.post(
                accept_content_types=(accept_content_type,)
            )
            self.assert_pool_manager_request_called_with(
                mock_request,
                self.api_config.get_server_url('servers', None) + "/responseBody/postUniqueitemsFalseValidationResponseBodyForContentTypes",
                method='post'.upper(),
                accept_content_type=accept_content_type,
            )
    
            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, self.response_body_schema)
            deserialized_response_body = self.response_body_schema(
                payload,
                configuration=self.schema_config
            )
            assert api_response.body == deserialized_response_body
    
    def test_non_unique_array_of_objects_is_valid_passes(self):
        # non-unique array of objects is valid
        accept_content_type = 'application/json'
    
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    {
                        "foo":
                            "bar",
                    },
                    {
                        "foo":
                            "bar",
                    },
                ]
            )
            mock_request.return_value = self.response(
                self.json_bytes(payload),
                status=self.response_status
            )
            api_response = self.api.post(
                accept_content_types=(accept_content_type,)
            )
            self.assert_pool_manager_request_called_with(
                mock_request,
                self.api_config.get_server_url('servers', None) + "/responseBody/postUniqueitemsFalseValidationResponseBodyForContentTypes",
                method='post'.upper(),
                accept_content_type=accept_content_type,
            )
    
            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, self.response_body_schema)
            deserialized_response_body = self.response_body_schema(
                payload,
                configuration=self.schema_config
            )
            assert api_response.body == deserialized_response_body
    
    def test_1_and_true_are_unique_passes(self):
        # 1 and true are unique
        accept_content_type = 'application/json'
    
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    1,
                    True,
                ]
            )
            mock_request.return_value = self.response(
                self.json_bytes(payload),
                status=self.response_status
            )
            api_response = self.api.post(
                accept_content_types=(accept_content_type,)
            )
            self.assert_pool_manager_request_called_with(
                mock_request,
                self.api_config.get_server_url('servers', None) + "/responseBody/postUniqueitemsFalseValidationResponseBodyForContentTypes",
                method='post'.upper(),
                accept_content_type=accept_content_type,
            )
    
            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, self.response_body_schema)
            deserialized_response_body = self.response_body_schema(
                payload,
                configuration=self.schema_config
            )
            assert api_response.body == deserialized_response_body
    
    def test_unique_array_of_integers_is_valid_passes(self):
        # unique array of integers is valid
        accept_content_type = 'application/json'
    
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    1,
                    2,
                ]
            )
            mock_request.return_value = self.response(
                self.json_bytes(payload),
                status=self.response_status
            )
            api_response = self.api.post(
                accept_content_types=(accept_content_type,)
            )
            self.assert_pool_manager_request_called_with(
                mock_request,
                self.api_config.get_server_url('servers', None) + "/responseBody/postUniqueitemsFalseValidationResponseBodyForContentTypes",
                method='post'.upper(),
                accept_content_type=accept_content_type,
            )
    
            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, self.response_body_schema)
            deserialized_response_body = self.response_body_schema(
                payload,
                configuration=self.schema_config
            )
            assert api_response.body == deserialized_response_body
    
    def test_non_unique_array_of_arrays_is_valid_passes(self):
        # non-unique array of arrays is valid
        accept_content_type = 'application/json'
    
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    [
                        "foo",
                    ],
                    [
                        "foo",
                    ],
                ]
            )
            mock_request.return_value = self.response(
                self.json_bytes(payload),
                status=self.response_status
            )
            api_response = self.api.post(
                accept_content_types=(accept_content_type,)
            )
            self.assert_pool_manager_request_called_with(
                mock_request,
                self.api_config.get_server_url('servers', None) + "/responseBody/postUniqueitemsFalseValidationResponseBodyForContentTypes",
                method='post'.upper(),
                accept_content_type=accept_content_type,
            )
    
            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, self.response_body_schema)
            deserialized_response_body = self.response_body_schema(
                payload,
                configuration=self.schema_config
            )
            assert api_response.body == deserialized_response_body
    
    def test_numbers_are_unique_if_mathematically_unequal_passes(self):
        # numbers are unique if mathematically unequal
        accept_content_type = 'application/json'
    
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    1.0,
                    1.0,
                    1,
                ]
            )
            mock_request.return_value = self.response(
                self.json_bytes(payload),
                status=self.response_status
            )
            api_response = self.api.post(
                accept_content_types=(accept_content_type,)
            )
            self.assert_pool_manager_request_called_with(
                mock_request,
                self.api_config.get_server_url('servers', None) + "/responseBody/postUniqueitemsFalseValidationResponseBodyForContentTypes",
                method='post'.upper(),
                accept_content_type=accept_content_type,
            )
    
            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, self.response_body_schema)
            deserialized_response_body = self.response_body_schema(
                payload,
                configuration=self.schema_config
            )
            assert api_response.body == deserialized_response_body
    
    def test_false_is_not_equal_to_zero_passes(self):
        # false is not equal to zero
        accept_content_type = 'application/json'
    
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    0,
                    False,
                ]
            )
            mock_request.return_value = self.response(
                self.json_bytes(payload),
                status=self.response_status
            )
            api_response = self.api.post(
                accept_content_types=(accept_content_type,)
            )
            self.assert_pool_manager_request_called_with(
                mock_request,
                self.api_config.get_server_url('servers', None) + "/responseBody/postUniqueitemsFalseValidationResponseBodyForContentTypes",
                method='post'.upper(),
                accept_content_type=accept_content_type,
            )
    
            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, self.response_body_schema)
            deserialized_response_body = self.response_body_schema(
                payload,
                configuration=self.schema_config
            )
            assert api_response.body == deserialized_response_body
    
    def test_unique_array_of_nested_objects_is_valid_passes(self):
        # unique array of nested objects is valid
        accept_content_type = 'application/json'
    
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    {
                        "foo":
                            {
                                "bar":
                                    {
                                        "baz":
                                            True,
                                    },
                            },
                    },
                    {
                        "foo":
                            {
                                "bar":
                                    {
                                        "baz":
                                            False,
                                    },
                            },
                    },
                ]
            )
            mock_request.return_value = self.response(
                self.json_bytes(payload),
                status=self.response_status
            )
            api_response = self.api.post(
                accept_content_types=(accept_content_type,)
            )
            self.assert_pool_manager_request_called_with(
                mock_request,
                self.api_config.get_server_url('servers', None) + "/responseBody/postUniqueitemsFalseValidationResponseBodyForContentTypes",
                method='post'.upper(),
                accept_content_type=accept_content_type,
            )
    
            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, self.response_body_schema)
            deserialized_response_body = self.response_body_schema(
                payload,
                configuration=self.schema_config
            )
            assert api_response.body == deserialized_response_body
    
    def test_0_and_false_are_unique_passes(self):
        # 0 and false are unique
        accept_content_type = 'application/json'
    
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    0,
                    False,
                ]
            )
            mock_request.return_value = self.response(
                self.json_bytes(payload),
                status=self.response_status
            )
            api_response = self.api.post(
                accept_content_types=(accept_content_type,)
            )
            self.assert_pool_manager_request_called_with(
                mock_request,
                self.api_config.get_server_url('servers', None) + "/responseBody/postUniqueitemsFalseValidationResponseBodyForContentTypes",
                method='post'.upper(),
                accept_content_type=accept_content_type,
            )
    
            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, self.response_body_schema)
            deserialized_response_body = self.response_body_schema(
                payload,
                configuration=self.schema_config
            )
            assert api_response.body == deserialized_response_body
    
    def test_unique_array_of_arrays_is_valid_passes(self):
        # unique array of arrays is valid
        accept_content_type = 'application/json'
    
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    [
                        "foo",
                    ],
                    [
                        "bar",
                    ],
                ]
            )
            mock_request.return_value = self.response(
                self.json_bytes(payload),
                status=self.response_status
            )
            api_response = self.api.post(
                accept_content_types=(accept_content_type,)
            )
            self.assert_pool_manager_request_called_with(
                mock_request,
                self.api_config.get_server_url('servers', None) + "/responseBody/postUniqueitemsFalseValidationResponseBodyForContentTypes",
                method='post'.upper(),
                accept_content_type=accept_content_type,
            )
    
            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, self.response_body_schema)
            deserialized_response_body = self.response_body_schema(
                payload,
                configuration=self.schema_config
            )
            assert api_response.body == deserialized_response_body
    
    def test_true_is_not_equal_to_one_passes(self):
        # true is not equal to one
        accept_content_type = 'application/json'
    
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    1,
                    True,
                ]
            )
            mock_request.return_value = self.response(
                self.json_bytes(payload),
                status=self.response_status
            )
            api_response = self.api.post(
                accept_content_types=(accept_content_type,)
            )
            self.assert_pool_manager_request_called_with(
                mock_request,
                self.api_config.get_server_url('servers', None) + "/responseBody/postUniqueitemsFalseValidationResponseBodyForContentTypes",
                method='post'.upper(),
                accept_content_type=accept_content_type,
            )
    
            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, self.response_body_schema)
            deserialized_response_body = self.response_body_schema(
                payload,
                configuration=self.schema_config
            )
            assert api_response.body == deserialized_response_body
    
    def test_non_unique_heterogeneous_types_are_valid_passes(self):
        # non-unique heterogeneous types are valid
        accept_content_type = 'application/json'
    
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    {
                    },
                    [
                        1,
                    ],
                    True,
                    None,
                    {
                    },
                    1,
                ]
            )
            mock_request.return_value = self.response(
                self.json_bytes(payload),
                status=self.response_status
            )
            api_response = self.api.post(
                accept_content_types=(accept_content_type,)
            )
            self.assert_pool_manager_request_called_with(
                mock_request,
                self.api_config.get_server_url('servers', None) + "/responseBody/postUniqueitemsFalseValidationResponseBodyForContentTypes",
                method='post'.upper(),
                accept_content_type=accept_content_type,
            )
    
            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, self.response_body_schema)
            deserialized_response_body = self.response_body_schema(
                payload,
                configuration=self.schema_config
            )
            assert api_response.body == deserialized_response_body
    
    def test_unique_heterogeneous_types_are_valid_passes(self):
        # unique heterogeneous types are valid
        accept_content_type = 'application/json'
    
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    {
                    },
                    [
                        1,
                    ],
                    True,
                    None,
                    1,
                ]
            )
            mock_request.return_value = self.response(
                self.json_bytes(payload),
                status=self.response_status
            )
            api_response = self.api.post(
                accept_content_types=(accept_content_type,)
            )
            self.assert_pool_manager_request_called_with(
                mock_request,
                self.api_config.get_server_url('servers', None) + "/responseBody/postUniqueitemsFalseValidationResponseBodyForContentTypes",
                method='post'.upper(),
                accept_content_type=accept_content_type,
            )
    
            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, self.response_body_schema)
            deserialized_response_body = self.response_body_schema(
                payload,
                configuration=self.schema_config
            )
            assert api_response.body == deserialized_response_body

if __name__ == '__main__':
    unittest.main()

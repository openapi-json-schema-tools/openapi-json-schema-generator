# coding: utf-8

"""


    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest
from unittest.mock import patch

import urllib3

import unit_test_api
from unit_test_api.paths.response_body_post_array_type_matches_arrays_response_body_for_content_types import post  # noqa: E501
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
    response_body_schema = post.response_200._200.content["application/json"].schema
    
    def test_a_float_is_not_an_array_fails(self):
        # a float is not an array
        accept_content_type = 'application/json'
    
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                1.1
            )
            mock_request.return_value = self.response(
                self.json_bytes(payload),
                status=self.response_status
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                self.api.post(
                    accept_content_types=(accept_content_type,)
                )
            self.assert_pool_manager_request_called_with(
                mock_request,
                self.configuration_.host + 'org.openapijsonschematools.codegen.model.CodegenKey@9b0e492c',
                method='post'.upper(),
                content_type=None,
                accept_content_type=accept_content_type,
            )
    
    def test_a_boolean_is_not_an_array_fails(self):
        # a boolean is not an array
        accept_content_type = 'application/json'
    
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                True
            )
            mock_request.return_value = self.response(
                self.json_bytes(payload),
                status=self.response_status
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                self.api.post(
                    accept_content_types=(accept_content_type,)
                )
            self.assert_pool_manager_request_called_with(
                mock_request,
                self.configuration_.host + 'org.openapijsonschematools.codegen.model.CodegenKey@9b0e492c',
                method='post'.upper(),
                content_type=None,
                accept_content_type=accept_content_type,
            )
    
    def test_null_is_not_an_array_fails(self):
        # null is not an array
        accept_content_type = 'application/json'
    
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                None
            )
            mock_request.return_value = self.response(
                self.json_bytes(payload),
                status=self.response_status
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                self.api.post(
                    accept_content_types=(accept_content_type,)
                )
            self.assert_pool_manager_request_called_with(
                mock_request,
                self.configuration_.host + 'org.openapijsonschematools.codegen.model.CodegenKey@9b0e492c',
                method='post'.upper(),
                content_type=None,
                accept_content_type=accept_content_type,
            )
    
    def test_an_object_is_not_an_array_fails(self):
        # an object is not an array
        accept_content_type = 'application/json'
    
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                {
                }
            )
            mock_request.return_value = self.response(
                self.json_bytes(payload),
                status=self.response_status
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                self.api.post(
                    accept_content_types=(accept_content_type,)
                )
            self.assert_pool_manager_request_called_with(
                mock_request,
                self.configuration_.host + 'org.openapijsonschematools.codegen.model.CodegenKey@9b0e492c',
                method='post'.upper(),
                content_type=None,
                accept_content_type=accept_content_type,
            )
    
    def test_a_string_is_not_an_array_fails(self):
        # a string is not an array
        accept_content_type = 'application/json'
    
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                "foo"
            )
            mock_request.return_value = self.response(
                self.json_bytes(payload),
                status=self.response_status
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                self.api.post(
                    accept_content_types=(accept_content_type,)
                )
            self.assert_pool_manager_request_called_with(
                mock_request,
                self.configuration_.host + 'org.openapijsonschematools.codegen.model.CodegenKey@9b0e492c',
                method='post'.upper(),
                content_type=None,
                accept_content_type=accept_content_type,
            )
    
    def test_an_array_is_an_array_passes(self):
        # an array is an array
        accept_content_type = 'application/json'
    
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
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
                self.configuration_.host + 'org.openapijsonschematools.codegen.model.CodegenKey@9b0e492c',
                method='post'.upper(),
                accept_content_type=accept_content_type,
            )
    
            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, self.response_body_schema)
            deserialized_response_body = self.response_body_schema.from_openapi_data_(
                payload,
                configuration_=self.configuration_
            )
            assert api_response.body == deserialized_response_body
    
    def test_an_integer_is_not_an_array_fails(self):
        # an integer is not an array
        accept_content_type = 'application/json'
    
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                1
            )
            mock_request.return_value = self.response(
                self.json_bytes(payload),
                status=self.response_status
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                self.api.post(
                    accept_content_types=(accept_content_type,)
                )
            self.assert_pool_manager_request_called_with(
                mock_request,
                self.configuration_.host + 'org.openapijsonschematools.codegen.model.CodegenKey@9b0e492c',
                method='post'.upper(),
                content_type=None,
                accept_content_type=accept_content_type,
            )

if __name__ == '__main__':
    unittest.main()

# coding: utf-8

"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest
from unittest.mock import patch

import urllib3
import typing_extensions

import unit_test_api
from unit_test_api.paths.request_body_post_dependent_schemas_single_dependency_request_body.post import operation as post  # noqa: E501
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

    def test_valid_passes(self):
        content_type = 'application/json'
        # valid
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                {
                    "foo":
                        1,
                    "bar":
                        2,
                }
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
                self.api_config.get_server_url('servers', None) + "/requestBody/postDependentSchemasSingleDependencyRequestBody",
                method='post'.upper(),
                body=self.json_bytes(payload),
                content_type=content_type,
            )

            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, schemas.Unset)

    def test_ignores_arrays_passes(self):
        content_type = 'application/json'
        # ignores arrays
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
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
                self.api_config.get_server_url('servers', None) + "/requestBody/postDependentSchemasSingleDependencyRequestBody",
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
                self.api_config.get_server_url('servers', None) + "/requestBody/postDependentSchemasSingleDependencyRequestBody",
                method='post'.upper(),
                body=self.json_bytes(payload),
                content_type=content_type,
            )

            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, schemas.Unset)

    def test_wrong_type_other_fails(self):
        content_type = 'application/json'
        # wrong type other
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
                body = post.request_body.RequestBody.content["application/json"].schema.validate(
                    payload,
                    configuration=self.schema_config
                )
                self.api.post(body=body)

    def test_ignores_strings_passes(self):
        content_type = 'application/json'
        # ignores strings
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                "foobar"
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
                self.api_config.get_server_url('servers', None) + "/requestBody/postDependentSchemasSingleDependencyRequestBody",
                method='post'.upper(),
                body=self.json_bytes(payload),
                content_type=content_type,
            )

            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, schemas.Unset)

    def test_no_dependency_passes(self):
        content_type = 'application/json'
        # no dependency
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                {
                    "foo":
                        "quux",
                }
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
                self.api_config.get_server_url('servers', None) + "/requestBody/postDependentSchemasSingleDependencyRequestBody",
                method='post'.upper(),
                body=self.json_bytes(payload),
                content_type=content_type,
            )

            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, schemas.Unset)

    def test_wrong_type_both_fails(self):
        content_type = 'application/json'
        # wrong type both
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                {
                    "foo":
                        "quux",
                    "bar":
                        "quux",
                }
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                body = post.request_body.RequestBody.content["application/json"].schema.validate(
                    payload,
                    configuration=self.schema_config
                )
                self.api.post(body=body)

    def test_wrong_type_fails(self):
        content_type = 'application/json'
        # wrong type
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                {
                    "foo":
                        "quux",
                    "bar":
                        2,
                }
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                body = post.request_body.RequestBody.content["application/json"].schema.validate(
                    payload,
                    configuration=self.schema_config
                )
                self.api.post(body=body)

if __name__ == '__main__':
    unittest.main()
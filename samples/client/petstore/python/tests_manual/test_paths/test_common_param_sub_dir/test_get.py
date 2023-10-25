# coding: utf-8

"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest
from unittest.mock import patch

import urllib3
import typing_extensions

import petstore_api
from petstore_api.paths.common_param_sub_dir.get import operation as get  # noqa: E501
from petstore_api import schemas, api_client
from petstore_api.configurations import api_configuration, schema_configuration

from ... import ApiTestMixin


class TestGet(ApiTestMixin, unittest.TestCase):
    """
    Get unit test stubs
    """
    api_config = api_configuration.ApiConfiguration()
    schema_config = schema_configuration.SchemaConfiguration(
        disabled_json_schema_keywords={'format'}
    )
    used_api_client = api_client.ApiClient(configuration=api_config, schema_configuration=schema_config)
    api = get.ApiForGet(api_client=used_api_client)  # noqa: E501

    response_status = 200
    response_body = ''

    @patch.object(urllib3.PoolManager, 'request')
    def test_get(self, mock_request):
        mock_request.return_value = self.response(b'')

        api = get.ApiForGet(api_client=self.used_api_client)
        path_params: get.PathParametersDictInput = {'subDir': 'a'}
        query_params: get.QueryParametersDictInput = {'searchStr': 'f'}
        api_response = api.get(path_params=path_params, query_params=query_params)
        self.assert_pool_manager_request_called_with(
            mock_request,
            f'http://petstore.swagger.io:80/v2/commonParam/a/?searchStr=f',
            body=None,
            method='GET',
            content_type=None,
            accept_content_type=None
        )

        assert isinstance(api_response.response, urllib3.HTTPResponse)
        assert isinstance(api_response.body, schemas.Unset)
        assert isinstance(api_response.headers, schemas.Unset)
        assert api_response.response.status == 200

if __name__ == '__main__':
    unittest.main()
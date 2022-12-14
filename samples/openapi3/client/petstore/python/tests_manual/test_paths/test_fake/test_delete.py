# coding: utf-8

"""


    Generated by: https://openapi-generator.tech
"""

import unittest
from unittest.mock import patch

import urllib3

from petstore_api.paths.fake import delete
from petstore_api import configuration, schemas, api_client

from ... import ApiTestMixin


class TestFake(ApiTestMixin, unittest.TestCase):
    used_configuration = configuration.Configuration(
        access_token='someBearerToken'
    )
    used_api_client = api_client.ApiClient(
        configuration=used_configuration
    )
    api = delete.ApiFordelete(api_client=used_api_client)

    @patch.object(urllib3.PoolManager, 'request')
    def test_delete_uses_http_bearer_auth(self, mock_request):
        mock_request.return_value = self.response(b'')

        query_params = {
            'required_string_group': 'a',
            'required_int64_group': 1,
        }
        header_params = {
            'required_boolean_group': 'true'
        }
        api_response = self.api.delete(query_params=query_params, header_params=header_params)
        self.assert_pool_manager_request_called_with(
            mock_request,
            f'http://petstore.swagger.io:80/v2/fake?required_string_group=a&required_int64_group=1',
            body=None,
            method='DELETE',
            content_type=None,
            accept_content_type=None,
            headers={
                'Authorization': 'Bearer someBearerToken',
                'required_boolean_group': 'true'
            }
        )

        assert isinstance(api_response.response, urllib3.HTTPResponse)
        assert isinstance(api_response.body, schemas.Unset)
        assert isinstance(api_response.headers, schemas.Unset)
        assert api_response.response.status == 200


if __name__ == '__main__':
    unittest.main()

# coding: utf-8

"""


    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest
from unittest.mock import patch

import urllib3

from petstore_api.paths.fake.post import operation as post
from petstore_api import schemas, api_client
from petstore_api.configurations import api_configuration

from ... import ApiTestMixin


class TestFake(ApiTestMixin, unittest.TestCase):
    security_scheme_info = api_configuration.SecuritySchemeInfo(
        http_basic_test = api_configuration.security_scheme_http_basic_test.HttpBasicTest(
            user_id='demo',
            password='p@55w0rd'
        )
    )
    used_configuration = api_configuration.ApiConfiguration(security_scheme_info=security_scheme_info)
    used_api_client = api_client.ApiClient(
        configuration=used_configuration
    )
    api = post.ApiForPost(api_client=used_api_client)

    @patch.object(urllib3.PoolManager, 'request')
    def test_post_uses_http_basic_auth(self, mock_request):
        mock_request.return_value = self.response(b'')

        api_response = self.api.post()
        self.assert_pool_manager_request_called_with(
            mock_request,
            f'http://petstore.swagger.io:80/v2/fake',
            body=None,
            method='POST',
            content_type=None,
            accept_content_type=None,
            headers={'Authorization': 'Basic ZGVtbzpwQDU1dzByZA=='}
        )

        assert isinstance(api_response.response, urllib3.HTTPResponse)
        assert isinstance(api_response.body, schemas.Unset)
        assert isinstance(api_response.headers, schemas.Unset)
        assert api_response.response.status == 200


if __name__ == '__main__':
    unittest.main()

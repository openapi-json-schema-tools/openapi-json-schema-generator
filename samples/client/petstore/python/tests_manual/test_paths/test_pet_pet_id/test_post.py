# coding: utf-8

"""


    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest
from unittest.mock import patch

import urllib3

import petstore_api
from petstore_api.paths.pet_pet_id.post import operation as post
from petstore_api import schemas, api_client
from petstore_api.configurations import api_configuration

from ... import ApiTestMixin


class TestPetPetId(ApiTestMixin, unittest.TestCase):
    """
    PetPetId unit test stubs
        Updates a pet in the store with form data  # noqa: E501
    """

    def test_post(self):
        security_scheme_info = api_configuration.SecuritySchemeInfo(
            api_key=api_configuration.security_scheme_api_key.ApiKey(api_key='abcdefg')
        )
        used_api_client = api_client.ApiClient(
            configuration=api_configuration.ApiConfiguration(security_scheme_info=security_scheme_info)
        )
        api = post.ApiForPost(api_client=used_api_client)

        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            body = {
                'name': 'mister furball award',
                'status': 'happy, fuzzy, and bouncy'
            }
            mock_request.return_value = self.response("")
            from petstore_api.paths.pet_pet_id.post import request_body
            body_info = request_body.RequestBodyInfoForApplicationXWwwFormUrlencoded(body)
            api_response = api.post(path_params={'petId': 2345}, body_info=body_info)
            mock_request.assert_called_with(
                'POST',
                'http://petstore.swagger.io:80/v2/pet/2345',
                body='name=mister%20furball%20award&status=happy%2C%20fuzzy%2C%20and%20bouncy',
                encode_multipart=False,
                preload_content=True,
                timeout=None,
                headers={
                    'User-Agent': self.user_agent,
                    'Content-Type': 'application/x-www-form-urlencoded',
                    'api_key': 'abcdefg'
                }
            )
            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, schemas.Unset)
            assert isinstance(api_response.headers, schemas.Unset)
            assert api_response.response.status == 200


if __name__ == '__main__':
    unittest.main()
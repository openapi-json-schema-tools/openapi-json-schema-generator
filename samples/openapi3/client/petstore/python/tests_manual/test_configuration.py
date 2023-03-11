# coding: utf-8

# flake8: noqa

"""
Run the tests.
$ pip install nose (optional)
$ cd OpenAPIetstore-python
$ nosetests -v
"""

import unittest

from unittest.mock import patch
import urllib3
from urllib3._collections import HTTPHeaderDict

import petstore_api
from petstore_api import configuration
from petstore_api.api_client import ApiClient
from petstore_api.apis.tags import pet_api


class ConfigurationTests(unittest.TestCase):

    def test_configuration(self):
        config = petstore_api.Configuration()

        config.disabled_json_schema_keywords = set(("multipleOf,maximum,exclusiveMaximum,minimum,exclusiveMinimum,"
            "maxLength,minLength,pattern,maxItems,minItems").split(','))
        with self.assertRaisesRegex(ValueError, "Invalid keyword: 'foo'"):
            config.disabled_json_schema_keywords = {'foo'}
        config.disabled_json_schema_keywords = set()

    def test_spec_root_servers(self):
        auth_info = configuration.AuthInfo(
            api_key=configuration.security_scheme_api_key.ApiKey(api_key='abcdefg')
        )
        server_info: configuration.ServerInfo = {
            'servers/1': configuration.server_1.Server1(variables={'version': 'v2'})
        }
        config = petstore_api.Configuration(auth_info=auth_info, server_info=server_info, server_index=1)
        client = ApiClient(configuration=config)
        api = pet_api.PetApi(client)

        with patch.object(ApiClient, 'request') as mock_request:
            mock_request.return_value = urllib3.HTTPResponse(status=200)
            body = {'name': 'pet', 'photoUrls': []}
            api.add_pet(body)
            mock_request.assert_called_with(
                'post',
                'https://localhost:8080/v2/pet',
                headers=HTTPHeaderDict({
                    'Content-Type': 'application/json',
                    'User-Agent': 'OpenAPI-JSON-Schema-Generator/1.0.0/python',
                    'api_key': 'abcdefg'
                }),
                fields=None,
                body=b'{"name":"pet","photoUrls":[]}',
                stream=False,
                timeout=None,
            )

        with patch.object(ApiClient, 'request') as mock_request:
            mock_request.return_value = urllib3.HTTPResponse(status=200)
            api.delete_pet(path_params=dict(petId=123456789))
            mock_request.assert_called_with(
                'delete',
                'https://localhost:8080/v2/pet/123456789',
                headers={
                    'User-Agent': 'OpenAPI-JSON-Schema-Generator/1.0.0/python',
                    'api_key': 'abcdefg'
                },
                fields=None,
                body=None,
                stream=False,
                timeout=None,
            )
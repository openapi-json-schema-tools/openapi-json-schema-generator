# coding: utf-8

# flake8: noqa

import unittest

from unittest.mock import patch
import urllib3
from urllib3._collections import HTTPHeaderDict

import petstore_api
from petstore_api import configuration
from petstore_api.api_client import ApiClient
from petstore_api.apis.tags import pet_api

from . import ApiTestMixin

class ConfigurationTests(ApiTestMixin, unittest.TestCase):

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

    def test_path_servers(self):
        auth_info = configuration.AuthInfo(
            api_key=configuration.security_scheme_api_key.ApiKey(api_key='abcdefg')
        )
        server_info: configuration.ServerInfo = {
            "paths//pet/findByStatus//servers/1": configuration.pet_find_by_status_server_1.Server1(
                variables={'version': 'v2'}
            )
        }
        config = petstore_api.Configuration(auth_info=auth_info, server_info=server_info)
        client = ApiClient(configuration=config)
        api = pet_api.PetApi(client)

        with patch.object(ApiClient, 'request') as mock_request:
            pet_json = {
                "name": "pet",
                "photoUrls":[]
            }
            body = self.json_bytes(
                [
                    pet_json
                ]
            )
            mock_request.return_value = self.response(body)
            _pets = api.find_pets_by_status(
                query_params={'status': ['available']},
                server_index=1
            )
            mock_request.assert_called_with(
                'get',
                'https://petstore.swagger.io/v2/pet/findByStatus?status=available',
                headers=HTTPHeaderDict({
                    'User-Agent': 'OpenAPI-JSON-Schema-Generator/1.0.0/python',
                    'api_key': 'abcdefg',
                    'Accept': 'application/xml, application/json'
                }),
                fields=None,
                body=None,
                stream=False,
                timeout=None,
            )

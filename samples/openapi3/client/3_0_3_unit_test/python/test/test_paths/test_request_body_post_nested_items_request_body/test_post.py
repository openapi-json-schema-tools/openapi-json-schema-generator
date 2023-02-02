# coding: utf-8

"""


    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import unittest
from unittest.mock import patch

import urllib3

import unit_test_api
from unit_test_api.paths.request_body_post_nested_items_request_body import post  # noqa: E501
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
    response_body = ''

    def test_valid_nested_array_passes(self):
        content_type = 'application/json'
        # valid nested array
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    [
                        [
                            [
                                1,
                            ],
                        ],
                        [
                            [
                                2,
                            ],
                            [
                                3,
                            ],
                        ],
                    ],
                    [
                        [
                            [
                                4,
                            ],
                            [
                                5,
                            ],
                            [
                                6,
                            ],
                        ],
                    ],
                ]
            )
            body = post.request_body.RequestBody.content["application/json"].schema.from_openapi_data_(
                payload,
                configuration_=self.configuration_
            )
            mock_request.return_value = self.response(
                self.json_bytes(self.response_body),
                status=self.response_status
            )
            api_response = self.api.post(
                body=body,
                content_type=content_type
            )
            self.assert_pool_manager_request_called_with(
                mock_request,
                self.configuration_.host + 'org.openapijsonschematools.codegen.model.CodegenKey@230c0713',
                method='post'.upper(),
                body=self.json_bytes(payload),
                content_type=content_type,
            )

            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, schemas.Unset)

    def test_nested_array_with_invalid_type_fails(self):
        content_type = 'application/json'
        # nested array with invalid type
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    [
                        [
                            [
                                "1",
                            ],
                        ],
                        [
                            [
                                2,
                            ],
                            [
                                3,
                            ],
                        ],
                    ],
                    [
                        [
                            [
                                4,
                            ],
                            [
                                5,
                            ],
                            [
                                6,
                            ],
                        ],
                    ],
                ]
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                body = post.request_body.RequestBody.content["application/json"].schema.from_openapi_data_(
                    payload,
                    configuration_=self.configuration_
                )
                self.api.post(body=body)

    def test_not_deep_enough_fails(self):
        content_type = 'application/json'
        # not deep enough
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    [
                        [
                            1,
                        ],
                        [
                            2,
                        ],
                        [
                            3,
                        ],
                    ],
                    [
                        [
                            4,
                        ],
                        [
                            5,
                        ],
                        [
                            6,
                        ],
                    ],
                ]
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                body = post.request_body.RequestBody.content["application/json"].schema.from_openapi_data_(
                    payload,
                    configuration_=self.configuration_
                )
                self.api.post(body=body)

if __name__ == '__main__':
    unittest.main()

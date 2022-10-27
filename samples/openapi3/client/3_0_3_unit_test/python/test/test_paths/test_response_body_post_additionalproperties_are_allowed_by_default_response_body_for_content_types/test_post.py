# coding: utf-8

"""


    Generated by: https://openapi-generator.tech
"""

import unittest
from unittest.mock import patch

import urllib3

import unit_test_api
from unit_test_api.paths.response_body_post_additionalproperties_are_allowed_by_default_response_body_for_content_types import post  # noqa: E501
from unit_test_api import configuration, schemas, api_client

from .. import ApiTestMixin


class TestResponseBodyPostAdditionalpropertiesAreAllowedByDefaultResponseBodyForContentTypes(ApiTestMixin, unittest.TestCase):
    """
    ResponseBodyPostAdditionalpropertiesAreAllowedByDefaultResponseBodyForContentTypes unit test stubs
    """
    _configuration = configuration.Configuration()

    def setUp(self):
        used_api_client = api_client.ApiClient(configuration=self._configuration)
        self.api = post.ApiForpost(api_client=used_api_client)  # noqa: E501

    def tearDown(self):
        pass

    response_status = 200
    response_body_schema = post.response_for_200.application_json

    def test_additional_properties_are_allowed_passes(self):
        # additional properties are allowed
        accept_content_type = 'application/json'

        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                {
                    "foo":
                        1,
                    "bar":
                        2,
                    "quux":
                        True,
                }
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
                self._configuration.host + '/responseBody/postAdditionalpropertiesAreAllowedByDefaultResponseBodyForContentTypes',
                method='post'.upper(),
                accept_content_type=accept_content_type,
            )

            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, self.response_body_schema)
            deserialized_response_body = self.response_body_schema.from_openapi_data_oapg(
                payload,
                _configuration=self._configuration
            )
            assert api_response.body == deserialized_response_body




if __name__ == '__main__':
    unittest.main()

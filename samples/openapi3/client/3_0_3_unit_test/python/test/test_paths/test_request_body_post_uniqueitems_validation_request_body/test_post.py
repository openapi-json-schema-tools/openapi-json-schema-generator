# coding: utf-8

"""


    Generated by: https://openapi-generator.tech
"""

import unittest
from unittest.mock import patch

import urllib3

import unit_test_api
from unit_test_api.paths.request_body_post_uniqueitems_validation_request_body import post  # noqa: E501
from unit_test_api import configuration, schemas, api_client

from .. import ApiTestMixin


class TestRequestBodyPostUniqueitemsValidationRequestBody(ApiTestMixin, unittest.TestCase):
    """
    RequestBodyPostUniqueitemsValidationRequestBody unit test stubs
    """
    _configuration = configuration.Configuration()

    def setUp(self):
        used_api_client = api_client.ApiClient(configuration=self._configuration)
        self.api = post.ApiForpost(api_client=used_api_client)  # noqa: E501

    def tearDown(self):
        pass

    response_status = 200
    response_body = ''

    def test_unique_array_of_objects_is_valid_passes(self):
        content_type = 'application/json'
        # unique array of objects is valid
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    {
                        "foo":
                            "bar",
                    },
                    {
                        "foo":
                            "baz",
                    },
                ]
            )
            body = post.request_body.uniqueitems_validation.UniqueitemsValidation.from_openapi_data_oapg(
                payload,
                _configuration=self._configuration
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
                self._configuration.host + '/requestBody/postUniqueitemsValidationRequestBody',
                method='post'.upper(),
                body=self.json_bytes(payload),
                content_type=content_type,
            )

            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, schemas.Unset)

    def test_a_true_and_a1_are_unique_passes(self):
        content_type = 'application/json'
        # {&quot;a&quot;: true} and {&quot;a&quot;: 1} are unique
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    {
                        "a":
                            True,
                    },
                    {
                        "a":
                            1,
                    },
                ]
            )
            body = post.request_body.uniqueitems_validation.UniqueitemsValidation.from_openapi_data_oapg(
                payload,
                _configuration=self._configuration
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
                self._configuration.host + '/requestBody/postUniqueitemsValidationRequestBody',
                method='post'.upper(),
                body=self.json_bytes(payload),
                content_type=content_type,
            )

            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, schemas.Unset)

    def test_non_unique_heterogeneous_types_are_invalid_fails(self):
        content_type = 'application/json'
        # non-unique heterogeneous types are invalid
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    {
                    },
                    [
                        1,
                    ],
                    True,
                    None,
                    {
                    },
                    1,
                ]
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                body = post.request_body.uniqueitems_validation.UniqueitemsValidation.from_openapi_data_oapg(
                    payload,
                    _configuration=self._configuration
                )
                self.api.post(body=body)

    def test_nested0_and_false_are_unique_passes(self):
        content_type = 'application/json'
        # nested [0] and [false] are unique
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    [
                        [
                            0,
                        ],
                        "foo",
                    ],
                    [
                        [
                            False,
                        ],
                        "foo",
                    ],
                ]
            )
            body = post.request_body.uniqueitems_validation.UniqueitemsValidation.from_openapi_data_oapg(
                payload,
                _configuration=self._configuration
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
                self._configuration.host + '/requestBody/postUniqueitemsValidationRequestBody',
                method='post'.upper(),
                body=self.json_bytes(payload),
                content_type=content_type,
            )

            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, schemas.Unset)

    def test_a_false_and_a0_are_unique_passes(self):
        content_type = 'application/json'
        # {&quot;a&quot;: false} and {&quot;a&quot;: 0} are unique
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    {
                        "a":
                            False,
                    },
                    {
                        "a":
                            0,
                    },
                ]
            )
            body = post.request_body.uniqueitems_validation.UniqueitemsValidation.from_openapi_data_oapg(
                payload,
                _configuration=self._configuration
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
                self._configuration.host + '/requestBody/postUniqueitemsValidationRequestBody',
                method='post'.upper(),
                body=self.json_bytes(payload),
                content_type=content_type,
            )

            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, schemas.Unset)

    def test_numbers_are_unique_if_mathematically_unequal_fails(self):
        content_type = 'application/json'
        # numbers are unique if mathematically unequal
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    1.0,
                    1.0,
                    1,
                ]
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                body = post.request_body.uniqueitems_validation.UniqueitemsValidation.from_openapi_data_oapg(
                    payload,
                    _configuration=self._configuration
                )
                self.api.post(body=body)

    def test_false_is_not_equal_to_zero_passes(self):
        content_type = 'application/json'
        # false is not equal to zero
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    0,
                    False,
                ]
            )
            body = post.request_body.uniqueitems_validation.UniqueitemsValidation.from_openapi_data_oapg(
                payload,
                _configuration=self._configuration
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
                self._configuration.host + '/requestBody/postUniqueitemsValidationRequestBody',
                method='post'.upper(),
                body=self.json_bytes(payload),
                content_type=content_type,
            )

            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, schemas.Unset)

    def test_0_and_false_are_unique_passes(self):
        content_type = 'application/json'
        # [0] and [false] are unique
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    [
                        0,
                    ],
                    [
                        False,
                    ],
                ]
            )
            body = post.request_body.uniqueitems_validation.UniqueitemsValidation.from_openapi_data_oapg(
                payload,
                _configuration=self._configuration
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
                self._configuration.host + '/requestBody/postUniqueitemsValidationRequestBody',
                method='post'.upper(),
                body=self.json_bytes(payload),
                content_type=content_type,
            )

            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, schemas.Unset)

    def test_unique_array_of_arrays_is_valid_passes(self):
        content_type = 'application/json'
        # unique array of arrays is valid
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    [
                        "foo",
                    ],
                    [
                        "bar",
                    ],
                ]
            )
            body = post.request_body.uniqueitems_validation.UniqueitemsValidation.from_openapi_data_oapg(
                payload,
                _configuration=self._configuration
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
                self._configuration.host + '/requestBody/postUniqueitemsValidationRequestBody',
                method='post'.upper(),
                body=self.json_bytes(payload),
                content_type=content_type,
            )

            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, schemas.Unset)

    def test_non_unique_array_of_nested_objects_is_invalid_fails(self):
        content_type = 'application/json'
        # non-unique array of nested objects is invalid
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    {
                        "foo":
                            {
                                "bar":
                                    {
                                        "baz":
                                            True,
                                    },
                            },
                    },
                    {
                        "foo":
                            {
                                "bar":
                                    {
                                        "baz":
                                            True,
                                    },
                            },
                    },
                ]
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                body = post.request_body.uniqueitems_validation.UniqueitemsValidation.from_openapi_data_oapg(
                    payload,
                    _configuration=self._configuration
                )
                self.api.post(body=body)

    def test_non_unique_array_of_more_than_two_integers_is_invalid_fails(self):
        content_type = 'application/json'
        # non-unique array of more than two integers is invalid
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    1,
                    2,
                    1,
                ]
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                body = post.request_body.uniqueitems_validation.UniqueitemsValidation.from_openapi_data_oapg(
                    payload,
                    _configuration=self._configuration
                )
                self.api.post(body=body)

    def test_true_is_not_equal_to_one_passes(self):
        content_type = 'application/json'
        # true is not equal to one
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    1,
                    True,
                ]
            )
            body = post.request_body.uniqueitems_validation.UniqueitemsValidation.from_openapi_data_oapg(
                payload,
                _configuration=self._configuration
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
                self._configuration.host + '/requestBody/postUniqueitemsValidationRequestBody',
                method='post'.upper(),
                body=self.json_bytes(payload),
                content_type=content_type,
            )

            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, schemas.Unset)

    def test_objects_are_non_unique_despite_key_order_fails(self):
        content_type = 'application/json'
        # objects are non-unique despite key order
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    {
                        "a":
                            1,
                        "b":
                            2,
                    },
                    {
                        "b":
                            2,
                        "a":
                            1,
                    },
                ]
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                body = post.request_body.uniqueitems_validation.UniqueitemsValidation.from_openapi_data_oapg(
                    payload,
                    _configuration=self._configuration
                )
                self.api.post(body=body)

    def test_unique_array_of_strings_is_valid_passes(self):
        content_type = 'application/json'
        # unique array of strings is valid
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    "foo",
                    "bar",
                    "baz",
                ]
            )
            body = post.request_body.uniqueitems_validation.UniqueitemsValidation.from_openapi_data_oapg(
                payload,
                _configuration=self._configuration
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
                self._configuration.host + '/requestBody/postUniqueitemsValidationRequestBody',
                method='post'.upper(),
                body=self.json_bytes(payload),
                content_type=content_type,
            )

            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, schemas.Unset)

    def test_1_and_true_are_unique_passes(self):
        content_type = 'application/json'
        # [1] and [true] are unique
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    [
                        1,
                    ],
                    [
                        True,
                    ],
                ]
            )
            body = post.request_body.uniqueitems_validation.UniqueitemsValidation.from_openapi_data_oapg(
                payload,
                _configuration=self._configuration
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
                self._configuration.host + '/requestBody/postUniqueitemsValidationRequestBody',
                method='post'.upper(),
                body=self.json_bytes(payload),
                content_type=content_type,
            )

            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, schemas.Unset)

    def test_different_objects_are_unique_passes(self):
        content_type = 'application/json'
        # different objects are unique
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    {
                        "a":
                            1,
                        "b":
                            2,
                    },
                    {
                        "a":
                            2,
                        "b":
                            1,
                    },
                ]
            )
            body = post.request_body.uniqueitems_validation.UniqueitemsValidation.from_openapi_data_oapg(
                payload,
                _configuration=self._configuration
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
                self._configuration.host + '/requestBody/postUniqueitemsValidationRequestBody',
                method='post'.upper(),
                body=self.json_bytes(payload),
                content_type=content_type,
            )

            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, schemas.Unset)

    def test_unique_array_of_integers_is_valid_passes(self):
        content_type = 'application/json'
        # unique array of integers is valid
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    1,
                    2,
                ]
            )
            body = post.request_body.uniqueitems_validation.UniqueitemsValidation.from_openapi_data_oapg(
                payload,
                _configuration=self._configuration
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
                self._configuration.host + '/requestBody/postUniqueitemsValidationRequestBody',
                method='post'.upper(),
                body=self.json_bytes(payload),
                content_type=content_type,
            )

            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, schemas.Unset)

    def test_non_unique_array_of_more_than_two_arrays_is_invalid_fails(self):
        content_type = 'application/json'
        # non-unique array of more than two arrays is invalid
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    [
                        "foo",
                    ],
                    [
                        "bar",
                    ],
                    [
                        "foo",
                    ],
                ]
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                body = post.request_body.uniqueitems_validation.UniqueitemsValidation.from_openapi_data_oapg(
                    payload,
                    _configuration=self._configuration
                )
                self.api.post(body=body)

    def test_non_unique_array_of_objects_is_invalid_fails(self):
        content_type = 'application/json'
        # non-unique array of objects is invalid
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    {
                        "foo":
                            "bar",
                    },
                    {
                        "foo":
                            "bar",
                    },
                ]
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                body = post.request_body.uniqueitems_validation.UniqueitemsValidation.from_openapi_data_oapg(
                    payload,
                    _configuration=self._configuration
                )
                self.api.post(body=body)

    def test_unique_array_of_nested_objects_is_valid_passes(self):
        content_type = 'application/json'
        # unique array of nested objects is valid
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    {
                        "foo":
                            {
                                "bar":
                                    {
                                        "baz":
                                            True,
                                    },
                            },
                    },
                    {
                        "foo":
                            {
                                "bar":
                                    {
                                        "baz":
                                            False,
                                    },
                            },
                    },
                ]
            )
            body = post.request_body.uniqueitems_validation.UniqueitemsValidation.from_openapi_data_oapg(
                payload,
                _configuration=self._configuration
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
                self._configuration.host + '/requestBody/postUniqueitemsValidationRequestBody',
                method='post'.upper(),
                body=self.json_bytes(payload),
                content_type=content_type,
            )

            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, schemas.Unset)

    def test_non_unique_array_of_arrays_is_invalid_fails(self):
        content_type = 'application/json'
        # non-unique array of arrays is invalid
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    [
                        "foo",
                    ],
                    [
                        "foo",
                    ],
                ]
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                body = post.request_body.uniqueitems_validation.UniqueitemsValidation.from_openapi_data_oapg(
                    payload,
                    _configuration=self._configuration
                )
                self.api.post(body=body)

    def test_non_unique_array_of_strings_is_invalid_fails(self):
        content_type = 'application/json'
        # non-unique array of strings is invalid
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    "foo",
                    "bar",
                    "foo",
                ]
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                body = post.request_body.uniqueitems_validation.UniqueitemsValidation.from_openapi_data_oapg(
                    payload,
                    _configuration=self._configuration
                )
                self.api.post(body=body)

    def test_nested1_and_true_are_unique_passes(self):
        content_type = 'application/json'
        # nested [1] and [true] are unique
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    [
                        [
                            1,
                        ],
                        "foo",
                    ],
                    [
                        [
                            True,
                        ],
                        "foo",
                    ],
                ]
            )
            body = post.request_body.uniqueitems_validation.UniqueitemsValidation.from_openapi_data_oapg(
                payload,
                _configuration=self._configuration
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
                self._configuration.host + '/requestBody/postUniqueitemsValidationRequestBody',
                method='post'.upper(),
                body=self.json_bytes(payload),
                content_type=content_type,
            )

            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, schemas.Unset)

    def test_unique_heterogeneous_types_are_valid_passes(self):
        content_type = 'application/json'
        # unique heterogeneous types are valid
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    {
                    },
                    [
                        1,
                    ],
                    True,
                    None,
                    1,
                    "{}",
                ]
            )
            body = post.request_body.uniqueitems_validation.UniqueitemsValidation.from_openapi_data_oapg(
                payload,
                _configuration=self._configuration
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
                self._configuration.host + '/requestBody/postUniqueitemsValidationRequestBody',
                method='post'.upper(),
                body=self.json_bytes(payload),
                content_type=content_type,
            )

            assert isinstance(api_response.response, urllib3.HTTPResponse)
            assert isinstance(api_response.body, schemas.Unset)

    def test_non_unique_array_of_integers_is_invalid_fails(self):
        content_type = 'application/json'
        # non-unique array of integers is invalid
        with patch.object(urllib3.PoolManager, 'request') as mock_request:
            payload = (
                [
                    1,
                    1,
                ]
            )
            with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
                body = post.request_body.uniqueitems_validation.UniqueitemsValidation.from_openapi_data_oapg(
                    payload,
                    _configuration=self._configuration
                )
                self.api.post(body=body)

if __name__ == '__main__':
    unittest.main()

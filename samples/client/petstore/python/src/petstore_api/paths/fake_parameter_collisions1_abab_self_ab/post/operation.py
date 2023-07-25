# coding: utf-8

"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]
from petstore_api import api_client
from petstore_api.shared_imports.operation_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

from .. import path
from .responses import response_200
from . import request_body
from petstore_api.paths.fake_parameter_collisions1_abab_self_ab.post.request_body.content.application_json import schema as request_body_application_json_schema
from .parameters import (
    parameter_0,
    parameter_1,
    parameter_2,
    parameter_3,
    parameter_4,
    parameter_5,
    parameter_6,
    parameter_7,
    parameter_8,
    parameter_9,
    parameter_10,
    parameter_11,
    parameter_12,
    parameter_13,
    parameter_14,
    parameter_15,
    parameter_16,
    parameter_17,
    parameter_18,
)
from . import path_parameters
from . import query_parameters
from . import header_parameters
from . import cookie_parameters
query_parameter_classes = (
    parameter_0.Parameter0,
    parameter_1.Parameter1,
    parameter_2.Parameter2,
    parameter_3.Parameter3,
    parameter_4.Parameter4,
)
header_parameter_classes = (
    parameter_5.Parameter5,
    parameter_6.Parameter6,
    parameter_7.Parameter7,
    parameter_8.Parameter8,
)
path_parameter_classes = (
    parameter_9.Parameter9,
    parameter_10.Parameter10,
    parameter_11.Parameter11,
    parameter_12.Parameter12,
    parameter_13.Parameter13,
)
cookie_parameter_classes = (
    parameter_9.Parameter9,
    parameter_10.Parameter10,
    parameter_11.Parameter11,
    parameter_12.Parameter12,
    parameter_13.Parameter13,
)


__StatusCodeToResponse = typing_extensions.TypedDict(
    '__StatusCodeToResponse',
    {
        '200': typing.Type[response_200.ResponseFor200],
    }
)
_status_code_to_response: __StatusCodeToResponse = {
    '200': response_200.ResponseFor200,
}
_non_error_status_codes = frozenset({
    '200',
})

_all_accept_content_types = (
    "application/json",
)


class BaseApi(api_client.Api):
    @typing.overload
    def _parameter_collisions(
        self,
        path_params: typing.Union[
            path_parameters.PathParametersDictInput,
            path_parameters.PathParametersDict
        ],
        body: typing.Union[
            schemas.INPUT_TYPES_ALL,
            schemas.OUTPUT_BASE_TYPES,
            schemas.Unset
        ] = schemas.unset,
        query_params: typing.Union[
            query_parameters.QueryParametersDictInput,
            query_parameters.QueryParametersDict,
            None
        ] = None,
        header_params: typing.Union[
            header_parameters.HeaderParametersDictInput,
            header_parameters.HeaderParametersDict,
            None
        ] = None,
        cookie_params: typing.Union[
            cookie_parameters.CookieParametersDictInput,
            cookie_parameters.CookieParametersDict,
            None
        ] = None,
        *,
        skip_deserialization: typing_extensions.Literal[False] = False,
        content_type: typing_extensions.Literal["application/json"] = "application/json",
        accept_content_types: typing.Tuple[str, ...] = _all_accept_content_types,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
    ) -> response_200.ApiResponse: ...

    @typing.overload
    def _parameter_collisions(
        self,
        path_params: typing.Union[
            path_parameters.PathParametersDictInput,
            path_parameters.PathParametersDict
        ],
        body: typing.Union[
            schemas.INPUT_TYPES_ALL,
            schemas.OUTPUT_BASE_TYPES,
            schemas.Unset
        ] = schemas.unset,
        query_params: typing.Union[
            query_parameters.QueryParametersDictInput,
            query_parameters.QueryParametersDict,
            None
        ] = None,
        header_params: typing.Union[
            header_parameters.HeaderParametersDictInput,
            header_parameters.HeaderParametersDict,
            None
        ] = None,
        cookie_params: typing.Union[
            cookie_parameters.CookieParametersDictInput,
            cookie_parameters.CookieParametersDict,
            None
        ] = None,
        *,
        skip_deserialization: typing_extensions.Literal[True],
        content_type: typing_extensions.Literal["application/json"] = "application/json",
        accept_content_types: typing.Tuple[str, ...] = _all_accept_content_types,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
    ) -> api_response.ApiResponseWithoutDeserialization: ...

    def _parameter_collisions(
        self,
        path_params: typing.Union[
            path_parameters.PathParametersDictInput,
            path_parameters.PathParametersDict
        ],
        body: typing.Union[
            schemas.INPUT_TYPES_ALL,
            schemas.OUTPUT_BASE_TYPES,
            schemas.Unset
        ] = schemas.unset,
        query_params: typing.Union[
            query_parameters.QueryParametersDictInput,
            query_parameters.QueryParametersDict,
            None
        ] = None,
        header_params: typing.Union[
            header_parameters.HeaderParametersDictInput,
            header_parameters.HeaderParametersDict,
            None
        ] = None,
        cookie_params: typing.Union[
            cookie_parameters.CookieParametersDictInput,
            cookie_parameters.CookieParametersDict,
            None
        ] = None,
        *,
        skip_deserialization: bool = False,
        content_type: typing_extensions.Literal["application/json"] = "application/json",
        accept_content_types: typing.Tuple[str, ...] = _all_accept_content_types,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
    ):
        """
        parameter collision case
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        path_params = path_parameters.PathParameters.validate(path_params)
        if query_params is not None:
            query_params = query_parameters.QueryParameters.validate(query_params)
        if header_params is not None:
            header_params = header_parameters.HeaderParameters.validate(header_params)
        if cookie_params is not None:
            cookie_params = cookie_parameters.CookieParameters.validate(cookie_params)
        used_path, query_params_suffix = self._get_used_path(
            path,
            path_parameters=path_parameter_classes,
            path_params=path_params,
            query_parameters=query_parameter_classes,
            query_params=query_params
        )
        _headers = self._get_headers(
            header_parameters=header_parameter_classes,
            header_params=header_params,
            accept_content_types=accept_content_types,
            skip_validation=True
        )
        # TODO add cookie handling

        _fields, _body = self._get_fields_and_body(
            request_body=request_body.RequestBody,
            body=body,
            headers=_headers,
            content_type=content_type
        )
        host = self.api_client.configuration.get_server_url(
            "servers", server_index
        )

        raw_response = self.api_client.call_api(
            resource_path=used_path,
            query_params_suffix=query_params_suffix,
            method='post',
            host=host,
            headers=_headers,
            fields=_fields,
            body=_body,
            stream=stream,
            timeout=timeout,
        )

        if skip_deserialization:
            skip_deser_response = api_response.ApiResponseWithoutDeserialization(response=raw_response)
            self._verify_response_status(skip_deser_response)
            return skip_deser_response

        status = str(raw_response.status)
        if status in _non_error_status_codes:
            status_code = typing.cast(
                typing_extensions.Literal[
                    '200',
                ],
                status
            )
            return _status_code_to_response[status_code].deserialize(
                raw_response, self.api_client.schema_configuration)

        response = api_response.ApiResponseWithoutDeserialization(response=raw_response)
        self._verify_response_status(response)
        return response


class ParameterCollisions(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId.snakeCase fn names
    parameter_collisions = BaseApi._parameter_collisions


class ApiForPost(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names
    post = BaseApi._parameter_collisions

# coding: utf-8

"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from petstore_api import api_client
from petstore_api.shared_imports.operation_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

from .. import path
from .responses import response_default
from . import request_body


default_response = response_default.Default


class BaseApi(api_client.Api):
    @typing.overload
    def _create_user(
        self,
        body_info: request_body.RequestBodyInfo,
        *,
        skip_deserialization: typing_extensions.Literal[False] = False,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
    ) -> response_default.ApiResponse: ...

    @typing.overload
    def _create_user(
        self,
        body_info: request_body.RequestBodyInfo,
        *,
        skip_deserialization: typing_extensions.Literal[True],
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
    ) -> api_response.ApiResponseWithoutDeserialization: ...

    def _create_user(
        self,
        body_info: request_body.RequestBodyInfo,
        *,
        skip_deserialization: bool = False,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
    ):
        """
        Create user
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        used_path = path
        _headers = self._get_headers()
        # TODO add cookie handling

        fields, body = self._get_fields_and_body(
            request_body=request_body.RequestBody,
            body_info=body_info,
            headers=_headers
        )
        host = self.api_client.configuration.get_server_url(
            "servers", server_index
        )

        raw_response = self.api_client.call_api(
            resource_path=used_path,
            method='post',
            host=host,
            headers=_headers,
            fields=fields,
            body=body,
            stream=stream,
            timeout=timeout,
        )

        if skip_deserialization:
            skip_deser_response = api_response.ApiResponseWithoutDeserialization(response=raw_response)
            self._verify_response_status(skip_deser_response)
            return skip_deser_response

        response = default_response.deserialize(raw_response, self.api_client.schema_configuration)
        self._verify_response_status(response)
        return response


class CreateUser(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId.snakeCase fn names
    create_user = BaseApi._create_user


class ApiForPost(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names
    post = BaseApi._create_user
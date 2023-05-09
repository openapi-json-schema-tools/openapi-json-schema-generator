# coding: utf-8

"""


    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from dataclasses import dataclass
import typing_extensions
import urllib3
from urllib3._collections import HTTPHeaderDict

from petstore_api import api_client, exceptions
import datetime  # noqa: F401
import decimal  # noqa: F401
import io  # noqa: F401
import re  # noqa: F401
import typing  # noqa: F401
import typing_extensions  # noqa: F401
import uuid  # noqa: F401

import frozendict  # noqa: F401

from petstore_api import schemas  # noqa: F401

from .. import path
from .responses import (
    response_400,
    response_404,
)
from . import request_body
from .parameters import parameter_0



class RequestPathParameters:
    RequiredParams = typing_extensions.TypedDict(
        'RequiredParams',
        {
            'username': typing.Union[parameter_0.Parameter0.schema, str],
        }
    )
    OptionalParams = typing_extensions.TypedDict(
        'OptionalParams',
        {
        },
        total=False
    )


    class Params(RequiredParams, OptionalParams):
        pass


    parameters = (
        parameter_0.Parameter0,
    )

__StatusCodeToResponse = typing_extensions.TypedDict(
    '__StatusCodeToResponse',
    {
        '400': typing.Type[response_400.ResponseFor400],
        '404': typing.Type[response_404.ResponseFor404],
    }
)
_status_code_to_response: __StatusCodeToResponse = {
    '400': response_400.ResponseFor400,
    '404': response_404.ResponseFor404,
}


class BaseApi(api_client.Api):
    @typing.overload
    def _update_user(
        self,
        body: typing.Union[
            request_body.RequestBody.content["application/json"].schema,
            dict,
            frozendict.frozendict
        ],
        content_type: typing_extensions.Literal["application/json"] = ...,
        path_params: RequestPathParameters.Params = frozendict.frozendict(),
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> api_client.ApiResponseWithoutDeserialization: ...
    @typing.overload
    def _update_user(
        self,
        body: typing.Union[
            request_body.RequestBody.content["application/json"].schema,
                dict,
                frozendict.frozendict
        ],
        content_type: str = ...,
        path_params: RequestPathParameters.Params = frozendict.frozendict(),
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> api_client.ApiResponseWithoutDeserialization: ...

    @typing.overload
    def _update_user(
        self,
        body: typing.Union[
            request_body.RequestBody.content["application/json"].schema,
                dict,
                frozendict.frozendict
        ],
        skip_deserialization: typing_extensions.Literal[True],
        content_type: str = ...,
        path_params: RequestPathParameters.Params = frozendict.frozendict(),
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
    ) -> api_client.ApiResponseWithoutDeserialization: ...

    @typing.overload
    def _update_user(
        self,
        body: typing.Union[
            request_body.RequestBody.content["application/json"].schema,
                dict,
                frozendict.frozendict
        ],
        content_type: str = ...,
        path_params: RequestPathParameters.Params = frozendict.frozendict(),
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = ...,
    ) -> typing.Union[
        api_client.ApiResponseWithoutDeserialization,
    ]: ...

    def _update_user(
        self,
        body: typing.Union[
            request_body.RequestBody.content["application/json"].schema,
                dict,
                frozendict.frozendict
        ],
        content_type: str = 'application/json',
        path_params: RequestPathParameters.Params = frozendict.frozendict(),
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = False,
    ):
        """
        Updated user
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        self._verify_typed_dict_inputs(RequestPathParameters.Params, path_params)
        used_path = self._get_used_path(
            path,
            path_parameters=RequestPathParameters.parameters,
            path_params=path_params
        )
        _headers = self._get_headers()
        # TODO add cookie handling

        _fields, _body = self._get_field_and_body(
            request_body=request_body.RequestBody,
            body=body,
            headers=_headers,
            content_type=content_type
        )
        host = self.api_client.configuration.get_server_url(
            'servers', server_index
        )

        response = self.api_client.call_api(
            resource_path=used_path,
            method='put',
            host=host,
            headers=_headers,
            fields=_fields,
            body=_body,
            stream=stream,
            timeout=timeout,
        )

        if skip_deserialization:
            api_response = api_client.ApiResponseWithoutDeserialization(response=response)
        else:
            status = str(response.status)
            if status in _status_code_to_response:
                status: typing_extensions.Literal[
                    '400',
                    '404',
                ]
                api_response = _status_code_to_response[status].deserialize(
                    response, self.api_client.schema_configuration)
            else:
                api_response = api_client.ApiResponseWithoutDeserialization(response=response)

        if not 200 <= response.status <= 399:
            raise exceptions.ApiException(
                status=response.status,
                reason=response.reason,
                api_response=api_response
            )

        return api_response


class UpdateUser(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId.snakeCase fn names
    update_user = BaseApi._update_user


class ApiForPut(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names
    put = BaseApi._update_user

# coding: utf-8

"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from petstore_api import api_client
from petstore_api.shared_imports.operation_imports import *

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
    ) -> api_response.ApiResponseWithoutDeserialization: ...
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
    ) -> api_response.ApiResponseWithoutDeserialization: ...

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
    ) -> api_response.ApiResponseWithoutDeserialization: ...

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
        api_response.ApiResponseWithoutDeserialization,
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

        _fields, _body = self._get_fields_and_body(
            request_body=request_body.RequestBody,
            body=body,
            headers=_headers,
            content_type=content_type
        )
        host = self.api_client.configuration.get_server_url(
            'servers', server_index
        )

        raw_response = self.api_client.call_api(
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
            response = api_response.ApiResponseWithoutDeserialization(response=raw_response)
        else:
            status = str(raw_response.status)
            if status in _status_code_to_response:
                status: typing_extensions.Literal[
                    '400',
                    '404',
                ]
                response = _status_code_to_response[status].deserialize(
                    raw_response, self.api_client.schema_configuration)
            else:
                response = api_response.ApiResponseWithoutDeserialization(response=raw_response)

        self._verify_response_status(response)

        return response


class UpdateUser(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId.snakeCase fn names
    update_user = BaseApi._update_user


class ApiForPut(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names
    put = BaseApi._update_user

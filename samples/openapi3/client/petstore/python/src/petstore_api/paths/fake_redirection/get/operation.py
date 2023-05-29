# coding: utf-8

"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from petstore_api import api_client
from petstore_api.shared_imports.operation_imports import *

from .. import path
from .responses import (
    response_303,
    response_3xx,
)



__StatusCodeToResponse = typing_extensions.TypedDict(
    '__StatusCodeToResponse',
    {
        '303': typing.Type[response_303.ResponseFor303],
    }
)
_status_code_to_response: __StatusCodeToResponse = {
    '303': response_303.ResponseFor303,
}
__RangedStatusCodeToResponse = typing_extensions.TypedDict(
    '__RangedStatusCodeToResponse',
    {
        '3': typing.Type[response_3xx.ResponseFor3XX],
    }
)
_ranged_status_code_to_response: __RangedStatusCodeToResponse = {
    '3': response_3xx.ResponseFor3XX,
}


class BaseApi(api_client.Api):
    @typing.overload
    def _redirection(
        self,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = False
    ) -> typing.Union[
        response_3xx.ResponseFor3XX.response_cls,
        response_303.ResponseFor303.response_cls,
    ]: ...

    @typing.overload
    def _redirection(
        self,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[True] = ...
    ) -> api_response.ApiResponseWithoutDeserialization: ...

    def _redirection(
        self,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
        skip_deserialization: bool = False
    ):
        """
        operation with redirection responses
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        used_path = path
        # TODO add cookie handling
        host = self.api_client.configuration.get_server_url(
            'servers', server_index
        )

        raw_response = self.api_client.call_api(
            resource_path=used_path,
            method='get',
            host=host,
            stream=stream,
            timeout=timeout,
        )

        if skip_deserialization:
            response = api_response.ApiResponseWithoutDeserialization(response=raw_response)
        else:
            status = str(raw_response.status)
            ranged_response_status_code = status[0]
            if status in _status_code_to_response:
                status = typing.cast(
                    typing_extensions.Literal[
                    '303',
                    ],
                    status
                )
                response = _status_code_to_response[status].deserialize(
                    raw_response, self.api_client.schema_configuration)
            elif ranged_response_status_code in _ranged_status_code_to_response:
                ranged_response_status_code: typing_extensions.Literal[
                    '3',
                ]
                response = _ranged_status_code_to_response[ranged_response_status_code].deserialize(
                    raw_response, self.api_client.schema_configuration)
            else:
                response = api_response.ApiResponseWithoutDeserialization(response=raw_response)

        self._verify_response_status(response)

        return response


class Redirection(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId.snakeCase fn names
    redirection = BaseApi._redirection


class ApiForGet(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names
    get = BaseApi._redirection

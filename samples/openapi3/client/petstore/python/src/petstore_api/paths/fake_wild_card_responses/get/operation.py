# coding: utf-8

"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from petstore_api import api_client
from petstore_api.shared_imports.operation_imports import *

from .. import path
from .responses import (
    response_1xx,
    response_200,
    response_2xx,
    response_3xx,
    response_4xx,
    response_5xx,
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
__RangedStatusCodeToResponse = typing_extensions.TypedDict(
    '__RangedStatusCodeToResponse',
    {
        '1': typing.Type[response_1xx.ResponseFor1XX],
        '2': typing.Type[response_2xx.ResponseFor2XX],
        '3': typing.Type[response_3xx.ResponseFor3XX],
        '4': typing.Type[response_4xx.ResponseFor4XX],
        '5': typing.Type[response_5xx.ResponseFor5XX],
    }
)
_ranged_status_code_to_response: __RangedStatusCodeToResponse = {
    '1': response_1xx.ResponseFor1XX,
    '2': response_2xx.ResponseFor2XX,
    '3': response_3xx.ResponseFor3XX,
    '4': response_4xx.ResponseFor4XX,
    '5': response_5xx.ResponseFor5XX,
}

_all_accept_content_types = (
    "application/json",
)


class BaseApi(api_client.Api):
    @typing.overload
    def _wild_card_responses(
        self,
        accept_content_types: typing.Tuple[str, ...] = _all_accept_content_types,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> typing.Union[
        response_200.ResponseFor200.response_cls,
        response_2xx.ResponseFor2XX.response_cls,
        response_3xx.ResponseFor3XX.response_cls,
    ]: ...

    @typing.overload
    def _wild_card_responses(
        self,
        accept_content_types: typing.Tuple[str, ...] = _all_accept_content_types,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[True] = ...,
    ) -> api_response.ApiResponseWithoutDeserialization: ...

    def _wild_card_responses(
        self,
        accept_content_types: typing.Tuple[str, ...] = _all_accept_content_types,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
        skip_deserialization: bool = False,
    ):
        """
        operation with wildcard responses
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        used_path = path
        _headers = self._get_headers(accept_content_types=accept_content_types)
        # TODO add cookie handling
        host = self.api_client.configuration.get_server_url(
            'servers', server_index
        )

        raw_response = self.api_client.call_api(
            resource_path=used_path,
            method='get',
            host=host,
            headers=_headers,
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
                    '200',
                    ],
                    status
                )
                response = _status_code_to_response[status].deserialize(
                    raw_response, self.api_client.schema_configuration)
            elif ranged_response_status_code in _ranged_status_code_to_response:
                ranged_response_status_code: typing_extensions.Literal[
                    '1',
                    '2',
                    '3',
                    '4',
                    '5',
                ]
                response = _ranged_status_code_to_response[ranged_response_status_code].deserialize(
                    raw_response, self.api_client.schema_configuration)
            else:
                response = api_response.ApiResponseWithoutDeserialization(response=raw_response)

        self._verify_response_status(response)

        return response


class WildCardResponses(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId.snakeCase fn names
    wild_card_responses = BaseApi._wild_card_responses


class ApiForGet(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names
    get = BaseApi._wild_card_responses

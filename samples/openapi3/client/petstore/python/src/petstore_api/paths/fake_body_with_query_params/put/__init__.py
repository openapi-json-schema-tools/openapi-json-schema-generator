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
import functools  # noqa: F401
import io  # noqa: F401
import re  # noqa: F401
import typing  # noqa: F401
import typing_extensions  # noqa: F401
import uuid  # noqa: F401

import frozendict  # noqa: F401

from petstore_api import schemas  # noqa: F401

from .. import path
from .responses import response_200
from . import request_body
from .parameters import parameter_0



class RequestQueryParameters:
    RequiredParams = typing_extensions.TypedDict(
        'RequiredParams',
        {
            'query': typing.Union[parameter_0.Parameter0.schema, str, ],
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


    parameters = [
        parameter_0.Parameter0,
    ]

__StatusCodeToResponse = typing_extensions.TypedDict(
    '__StatusCodeToResponse',
    {
        '200': response_200.ResponseFor200,
    }
)
_status_code_to_response: __StatusCodeToResponse = {
    '200': response_200.ResponseFor200,
}


class BaseApi(api_client.Api):
    @typing.overload
    def _body_with_query_params(
        self,
        body: typing.Union[request_body.RequestBody.content["application/json"].schema, dict, frozendict.frozendict, ],
        content_type: typing_extensions.Literal["application/json"] = ...,
        query_params: RequestQueryParameters.Params = frozendict.frozendict(),
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> typing.Union[
        response_200.ResponseFor200.response_cls,
    ]: ...

    @typing.overload
    def _body_with_query_params(
        self,
        body: typing.Union[request_body.RequestBody.content["application/json"].schema, dict, frozendict.frozendict, ],
        content_type: str = ...,
        query_params: RequestQueryParameters.Params = frozendict.frozendict(),
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> typing.Union[
        response_200.ResponseFor200.response_cls,
    ]: ...


    @typing.overload
    def _body_with_query_params(
        self,
        body: typing.Union[request_body.RequestBody.content["application/json"].schema, dict, frozendict.frozendict, ],
        skip_deserialization: typing_extensions.Literal[True],
        content_type: str = ...,
        query_params: RequestQueryParameters.Params = frozendict.frozendict(),
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
    ) -> api_client.ApiResponseWithoutDeserialization: ...

    @typing.overload
    def _body_with_query_params(
        self,
        body: typing.Union[request_body.RequestBody.content["application/json"].schema, dict, frozendict.frozendict, ],
        content_type: str = ...,
        query_params: RequestQueryParameters.Params = frozendict.frozendict(),
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = ...,
    ) -> typing.Union[
        response_200.ResponseFor200.response_cls,
        api_client.ApiResponseWithoutDeserialization,
    ]: ...

    def _body_with_query_params(
        self,
        body: typing.Union[request_body.RequestBody.content["application/json"].schema, dict, frozendict.frozendict, ],
        content_type: str = 'application/json',
        query_params: RequestQueryParameters.Params = frozendict.frozendict(),
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = False,
    ):
        """
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        self._verify_typed_dict_inputs(RequestQueryParameters.Params, query_params)
        used_path = path

        prefix_separator_iterator = None
        for parameter in RequestQueryParameters.parameters:
            parameter_data = query_params.get(parameter.name, schemas.unset)
            if parameter_data is schemas.unset:
                continue
            if prefix_separator_iterator is None:
                prefix_separator_iterator = parameter.get_prefix_separator_iterator()
            serialized_data = parameter.serialize(parameter_data, prefix_separator_iterator)
            for serialized_value in serialized_data.values():
                used_path += serialized_value

        _headers = HTTPHeaderDict()
        # TODO add cookie handling

        if body is schemas.unset:
            raise exceptions.ApiValueError(
                'The required body parameter has an invalid value of: unset. Set a valid value instead')
        _fields = None
        _body = None
        serialized_data = request_body.RequestBody.serialize(body, content_type)
        _headers.add('Content-Type', content_type)
        if 'fields' in serialized_data:
            _fields = serialized_data['fields']
        elif 'body' in serialized_data:
            _body = serialized_data['body']
        response = self.api_client.call_api(
            resource_path=used_path,
            method='put',
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
                    '200',
                ]
                api_response = _status_code_to_response[status].deserialize(response, self.api_client.configuration)
            else:
                api_response = api_client.ApiResponseWithoutDeserialization(response=response)

        if not 200 <= response.status <= 299:
            raise exceptions.ApiException(
                status=response.status,
                reason=response.reason,
                api_response=api_response
            )

        return api_response


class BodyWithQueryParams(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId.snakeCase fn names

    @typing.overload
    def body_with_query_params(
        self,
        body: typing.Union[request_body.RequestBody.content["application/json"].schema, dict, frozendict.frozendict, ],
        content_type: typing_extensions.Literal["application/json"] = ...,
        query_params: RequestQueryParameters.Params = frozendict.frozendict(),
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> typing.Union[
        response_200.ResponseFor200.response_cls,
    ]: ...

    @typing.overload
    def body_with_query_params(
        self,
        body: typing.Union[request_body.RequestBody.content["application/json"].schema, dict, frozendict.frozendict, ],
        content_type: str = ...,
        query_params: RequestQueryParameters.Params = frozendict.frozendict(),
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> typing.Union[
        response_200.ResponseFor200.response_cls,
    ]: ...


    @typing.overload
    def body_with_query_params(
        self,
        body: typing.Union[request_body.RequestBody.content["application/json"].schema, dict, frozendict.frozendict, ],
        skip_deserialization: typing_extensions.Literal[True],
        content_type: str = ...,
        query_params: RequestQueryParameters.Params = frozendict.frozendict(),
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
    ) -> api_client.ApiResponseWithoutDeserialization: ...

    @typing.overload
    def body_with_query_params(
        self,
        body: typing.Union[request_body.RequestBody.content["application/json"].schema, dict, frozendict.frozendict, ],
        content_type: str = ...,
        query_params: RequestQueryParameters.Params = frozendict.frozendict(),
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = ...,
    ) -> typing.Union[
        response_200.ResponseFor200.response_cls,
        api_client.ApiResponseWithoutDeserialization,
    ]: ...

    def body_with_query_params(
        self,
        body: typing.Union[request_body.RequestBody.content["application/json"].schema, dict, frozendict.frozendict, ],
        content_type: str = 'application/json',
        query_params: RequestQueryParameters.Params = frozendict.frozendict(),
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = False,
    ):
        return self._body_with_query_params(
            body=body,
            query_params=query_params,
            content_type=content_type,
            stream=stream,
            timeout=timeout,
            skip_deserialization=skip_deserialization
        )


class ApiForPut(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names

    @typing.overload
    def put(
        self,
        body: typing.Union[request_body.RequestBody.content["application/json"].schema, dict, frozendict.frozendict, ],
        content_type: typing_extensions.Literal["application/json"] = ...,
        query_params: RequestQueryParameters.Params = frozendict.frozendict(),
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> typing.Union[
        response_200.ResponseFor200.response_cls,
    ]: ...

    @typing.overload
    def put(
        self,
        body: typing.Union[request_body.RequestBody.content["application/json"].schema, dict, frozendict.frozendict, ],
        content_type: str = ...,
        query_params: RequestQueryParameters.Params = frozendict.frozendict(),
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> typing.Union[
        response_200.ResponseFor200.response_cls,
    ]: ...


    @typing.overload
    def put(
        self,
        body: typing.Union[request_body.RequestBody.content["application/json"].schema, dict, frozendict.frozendict, ],
        skip_deserialization: typing_extensions.Literal[True],
        content_type: str = ...,
        query_params: RequestQueryParameters.Params = frozendict.frozendict(),
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
    ) -> api_client.ApiResponseWithoutDeserialization: ...

    @typing.overload
    def put(
        self,
        body: typing.Union[request_body.RequestBody.content["application/json"].schema, dict, frozendict.frozendict, ],
        content_type: str = ...,
        query_params: RequestQueryParameters.Params = frozendict.frozendict(),
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = ...,
    ) -> typing.Union[
        response_200.ResponseFor200.response_cls,
        api_client.ApiResponseWithoutDeserialization,
    ]: ...

    def put(
        self,
        body: typing.Union[request_body.RequestBody.content["application/json"].schema, dict, frozendict.frozendict, ],
        content_type: str = 'application/json',
        query_params: RequestQueryParameters.Params = frozendict.frozendict(),
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = False,
    ):
        return self._body_with_query_params(
            body=body,
            query_params=query_params,
            content_type=content_type,
            stream=stream,
            timeout=timeout,
            skip_deserialization=skip_deserialization
        )



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



__StatusCodeToResponse = typing_extensions.TypedDict(
    '__StatusCodeToResponse',
    {
        '200': response_200.ResponseFor200,
    }
)
_status_code_to_response: __StatusCodeToResponse = {
    '200': response_200.ResponseFor200,
}
_all_accept_content_types = (
    "application/json",
)


class BaseApi(api_client.Api):
    @typing.overload
    def _additional_properties_with_array_of_enums(
        self,
        content_type: typing_extensions.Literal["application/json"] = ...,
        body: typing.Union[request_body.RequestBody.content["application/json"].schema, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> typing.Union[
        response_200.ResponseFor200.response_cls,
    ]: ...

    @typing.overload
    def _additional_properties_with_array_of_enums(
        self,
        content_type: str = ...,
        body: typing.Union[request_body.RequestBody.content["application/json"].schema, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> typing.Union[
        response_200.ResponseFor200.response_cls,
    ]: ...


    @typing.overload
    def _additional_properties_with_array_of_enums(
        self,
        skip_deserialization: typing_extensions.Literal[True],
        content_type: str = ...,
        body: typing.Union[request_body.RequestBody.content["application/json"].schema, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
    ) -> api_client.ApiResponseWithoutDeserialization: ...

    @typing.overload
    def _additional_properties_with_array_of_enums(
        self,
        content_type: str = ...,
        body: typing.Union[request_body.RequestBody.content["application/json"].schema, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = ...,
    ) -> typing.Union[
        response_200.ResponseFor200.response_cls,
        api_client.ApiResponseWithoutDeserialization,
    ]: ...

    def _additional_properties_with_array_of_enums(
        self,
        content_type: str = 'application/json',
        body: typing.Union[request_body.RequestBody.content["application/json"].schema, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = False,
    ):
        """
        Additional Properties with Array of Enums
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        used_path = path

        _headers = HTTPHeaderDict()
        # TODO add cookie handling
        if accept_content_types:
            for accept_content_type in accept_content_types:
                _headers.add('Accept', accept_content_type)

        _fields = None
        _body = None
        if body is not schemas.unset:
            serialized_data = request_body.RequestBody.serialize(body, content_type)
            _headers.add('Content-Type', content_type)
            if 'fields' in serialized_data:
                _fields = serialized_data['fields']
            elif 'body' in serialized_data:
                _body = serialized_data['body']
        # TODO detect and use path servers if they exist
        host = self.api_client.configuration.get_server_url(
            ('servers',), server_index
        )

        response = self.api_client.call_api(
            resource_path=used_path,
            method='get',
            headers=_headers,
            fields=_fields,
            body=_body,
            host=host,
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


class AdditionalPropertiesWithArrayOfEnums(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId.snakeCase fn names

    @typing.overload
    def additional_properties_with_array_of_enums(
        self,
        content_type: typing_extensions.Literal["application/json"] = ...,
        body: typing.Union[request_body.RequestBody.content["application/json"].schema, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> typing.Union[
        response_200.ResponseFor200.response_cls,
    ]: ...

    @typing.overload
    def additional_properties_with_array_of_enums(
        self,
        content_type: str = ...,
        body: typing.Union[request_body.RequestBody.content["application/json"].schema, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> typing.Union[
        response_200.ResponseFor200.response_cls,
    ]: ...


    @typing.overload
    def additional_properties_with_array_of_enums(
        self,
        skip_deserialization: typing_extensions.Literal[True],
        content_type: str = ...,
        body: typing.Union[request_body.RequestBody.content["application/json"].schema, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
    ) -> api_client.ApiResponseWithoutDeserialization: ...

    @typing.overload
    def additional_properties_with_array_of_enums(
        self,
        content_type: str = ...,
        body: typing.Union[request_body.RequestBody.content["application/json"].schema, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = ...,
    ) -> typing.Union[
        response_200.ResponseFor200.response_cls,
        api_client.ApiResponseWithoutDeserialization,
    ]: ...

    def additional_properties_with_array_of_enums(
        self,
        content_type: str = 'application/json',
        body: typing.Union[request_body.RequestBody.content["application/json"].schema, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = False,
    ):
        return self._additional_properties_with_array_of_enums(
            body=body,
            content_type=content_type,
            accept_content_types=accept_content_types,
            stream=stream,
            timeout=timeout,
            skip_deserialization=skip_deserialization
        )


class ApiForGet(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names

    @typing.overload
    def get(
        self,
        content_type: typing_extensions.Literal["application/json"] = ...,
        body: typing.Union[request_body.RequestBody.content["application/json"].schema, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> typing.Union[
        response_200.ResponseFor200.response_cls,
    ]: ...

    @typing.overload
    def get(
        self,
        content_type: str = ...,
        body: typing.Union[request_body.RequestBody.content["application/json"].schema, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> typing.Union[
        response_200.ResponseFor200.response_cls,
    ]: ...


    @typing.overload
    def get(
        self,
        skip_deserialization: typing_extensions.Literal[True],
        content_type: str = ...,
        body: typing.Union[request_body.RequestBody.content["application/json"].schema, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
    ) -> api_client.ApiResponseWithoutDeserialization: ...

    @typing.overload
    def get(
        self,
        content_type: str = ...,
        body: typing.Union[request_body.RequestBody.content["application/json"].schema, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = ...,
    ) -> typing.Union[
        response_200.ResponseFor200.response_cls,
        api_client.ApiResponseWithoutDeserialization,
    ]: ...

    def get(
        self,
        content_type: str = 'application/json',
        body: typing.Union[request_body.RequestBody.content["application/json"].schema, dict, frozendict.frozendict, schemas.Unset] = schemas.unset,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = False,
    ):
        return self._additional_properties_with_array_of_enums(
            body=body,
            content_type=content_type,
            accept_content_types=accept_content_types,
            stream=stream,
            timeout=timeout,
            skip_deserialization=skip_deserialization
        )



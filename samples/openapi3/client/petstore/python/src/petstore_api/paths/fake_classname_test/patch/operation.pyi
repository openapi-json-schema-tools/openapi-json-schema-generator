# coding: utf-8

"""


    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from dataclasses import dataclass
import typing_extensions
import urllib3
from urllib3._collections import HTTPHeaderDict

from petstore_api import api_client, exceptions, security_schemes
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

from .responses import response_200
from . import request_body
from .security import security_requirement_object_0


_all_accept_content_types = (
    "application/json",
)


class BaseApi(api_client.Api):
    @typing.overload
    def _classname(
        self,
        body: typing.Union[request_body.RequestBody.content["application/json"].schema, dict, frozendict.frozendict],
        content_type: typing_extensions.Literal["application/json"] = ...,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        security_index: typing.Optional[int] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> response_200.ResponseFor200.response_cls: ...

    @typing.overload
    def _classname(
        self,
        body: typing.Union[
            request_body.RequestBody.content["application/json"].schema,
                        dict, frozendict.frozendict,
        ],
        content_type: str = ...,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        security_index: typing.Optional[int] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> response_200.ResponseFor200.response_cls: ...


    @typing.overload
    def _classname(
        self,
        body: typing.Union[
            request_body.RequestBody.content["application/json"].schema,
                        dict, frozendict.frozendict,
        ],
        skip_deserialization: typing_extensions.Literal[True],
        content_type: str = ...,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        security_index: typing.Optional[int] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
    ) -> api_client.ApiResponseWithoutDeserialization: ...

    @typing.overload
    def _classname(
        self,
        body: typing.Union[
            request_body.RequestBody.content["application/json"].schema,
                        dict, frozendict.frozendict,
        ],
        content_type: str = ...,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        security_index: typing.Optional[int] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = ...,
    ) -> typing.Union[
        response_200.ResponseFor200.response_cls,
        api_client.ApiResponseWithoutDeserialization,
    ]: ...

    def _classname(
        self,
        body: typing.Union[
            request_body.RequestBody.content["application/json"].schema,
                        dict, frozendict.frozendict,
        ],
        content_type: str = 'application/json',
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        security_index: typing.Optional[int] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = False,
    ):
        """
        To test class name in snake case
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
        host = self.api_client.configuration.get_server_url(
            'servers', server_index
        )
        security_requirement_object = self.api_client.configuration.get_security_requirement_object(
            'paths/' + path + '/patch/security',
            _security,
            security_index
        )

        response = self.api_client.call_api(
            resource_path=used_path,
            method='patch',
            host=host,
            headers=_headers,
            fields=_fields,
            body=_body,
            security_requirement_object=security_requirement_object,
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
                api_response = _status_code_to_response[status].deserialize(response, self.api_client.schema_configuration)
            else:
                api_response = api_client.ApiResponseWithoutDeserialization(response=response)

        if not 200 <= response.status <= 299:
            raise exceptions.ApiException(
                status=response.status,
                reason=response.reason,
                api_response=api_response
            )

        return api_response


class Classname(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId.snakeCase fn names

    @typing.overload
    def classname(
        self,
        body: typing.Union[request_body.RequestBody.content["application/json"].schema, dict, frozendict.frozendict],
        content_type: typing_extensions.Literal["application/json"] = ...,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        security_index: typing.Optional[int] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> response_200.ResponseFor200.response_cls: ...

    @typing.overload
    def classname(
        self,
        body: typing.Union[
            request_body.RequestBody.content["application/json"].schema,
                        dict, frozendict.frozendict,
        ],
        content_type: str = ...,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        security_index: typing.Optional[int] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> response_200.ResponseFor200.response_cls: ...


    @typing.overload
    def classname(
        self,
        body: typing.Union[
            request_body.RequestBody.content["application/json"].schema,
                        dict, frozendict.frozendict,
        ],
        skip_deserialization: typing_extensions.Literal[True],
        content_type: str = ...,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        security_index: typing.Optional[int] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
    ) -> api_client.ApiResponseWithoutDeserialization: ...

    @typing.overload
    def classname(
        self,
        body: typing.Union[
            request_body.RequestBody.content["application/json"].schema,
                        dict, frozendict.frozendict,
        ],
        content_type: str = ...,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        security_index: typing.Optional[int] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = ...,
    ) -> typing.Union[
        response_200.ResponseFor200.response_cls,
        api_client.ApiResponseWithoutDeserialization,
    ]: ...

    def classname(
        self,
        body: typing.Union[
            request_body.RequestBody.content["application/json"].schema,
                        dict, frozendict.frozendict,
        ],
        content_type: str = 'application/json',
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        security_index: typing.Optional[int] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = False,
    ):
        return self._classname(
            body=body,
            content_type=content_type,
            accept_content_types=accept_content_types,
            security_index=security_index,
            server_index=server_index,
            stream=stream,
            timeout=timeout,
            skip_deserialization=skip_deserialization
        )


class ApiForPatch(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names

    @typing.overload
    def patch(
        self,
        body: typing.Union[request_body.RequestBody.content["application/json"].schema, dict, frozendict.frozendict],
        content_type: typing_extensions.Literal["application/json"] = ...,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        security_index: typing.Optional[int] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> response_200.ResponseFor200.response_cls: ...

    @typing.overload
    def patch(
        self,
        body: typing.Union[
            request_body.RequestBody.content["application/json"].schema,
                        dict, frozendict.frozendict,
        ],
        content_type: str = ...,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        security_index: typing.Optional[int] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> response_200.ResponseFor200.response_cls: ...


    @typing.overload
    def patch(
        self,
        body: typing.Union[
            request_body.RequestBody.content["application/json"].schema,
                        dict, frozendict.frozendict,
        ],
        skip_deserialization: typing_extensions.Literal[True],
        content_type: str = ...,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        security_index: typing.Optional[int] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
    ) -> api_client.ApiResponseWithoutDeserialization: ...

    @typing.overload
    def patch(
        self,
        body: typing.Union[
            request_body.RequestBody.content["application/json"].schema,
                        dict, frozendict.frozendict,
        ],
        content_type: str = ...,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        security_index: typing.Optional[int] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = ...,
    ) -> typing.Union[
        response_200.ResponseFor200.response_cls,
        api_client.ApiResponseWithoutDeserialization,
    ]: ...

    def patch(
        self,
        body: typing.Union[
            request_body.RequestBody.content["application/json"].schema,
                        dict, frozendict.frozendict,
        ],
        content_type: str = 'application/json',
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        security_index: typing.Optional[int] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = False,
    ):
        return self._classname(
            body=body,
            content_type=content_type,
            accept_content_types=accept_content_types,
            security_index=security_index,
            server_index=server_index,
            stream=stream,
            timeout=timeout,
            skip_deserialization=skip_deserialization
        )



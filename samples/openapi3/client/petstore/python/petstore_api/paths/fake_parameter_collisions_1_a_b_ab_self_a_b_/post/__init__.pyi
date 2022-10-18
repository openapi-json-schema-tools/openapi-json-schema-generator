# coding: utf-8

"""


    Generated by: https://openapi-generator.tech
"""

from dataclasses import dataclass
import typing_extensions
import urllib3
from urllib3._collections import HTTPHeaderDict

from petstore_api import api_client, exceptions
from datetime import date, datetime  # noqa: F401
import decimal  # noqa: F401
import functools  # noqa: F401
import io  # noqa: F401
import re  # noqa: F401
import typing  # noqa: F401
import typing_extensions  # noqa: F401
import uuid  # noqa: F401

import frozendict  # noqa: F401

from petstore_api import schemas  # noqa: F401

from . import response_for_200
from . import request_body
from . import parameter_9
from . import parameter_10
from . import parameter_11
from . import parameter_12
from . import parameter_13
from . import parameter_0
from . import parameter_1
from . import parameter_2
from . import parameter_3
from . import parameter_4
from . import parameter_5
from . import parameter_6
from . import parameter_7
from . import parameter_8
from . import parameter_14
from . import parameter_15
from . import parameter_16
from . import parameter_17
from . import parameter_18
from . import body



class RequestQueryParameters:
    RequiredParams = typing_extensions.TypedDict(
        'RequiredParams',
        {
        }
    )
    OptionalParams = typing_extensions.TypedDict(
        'OptionalParams',
        {
            '1': typing.Union[parameter_0._1, str, ],
            'aB': typing.Union[parameter_1.aB, str, ],
            'Ab': typing.Union[parameter_2.Ab, str, ],
            'self': typing.Union[parameter_3._self, str, ],
            'A-B': typing.Union[parameter_4.a_b, str, ],
        },
        total=False
    )


    class Params(RequiredParams, OptionalParams):
        pass


    parameters = [
        parameter_0.parameter_oapg,
        parameter_1.parameter_oapg,
        parameter_2.parameter_oapg,
        parameter_3.parameter_oapg,
        parameter_4.parameter_oapg,
    ]

class RequestHeaderParameters:
    RequiredParams = typing_extensions.TypedDict(
        'RequiredParams',
        {
        }
    )
    OptionalParams = typing_extensions.TypedDict(
        'OptionalParams',
        {
            '1': typing.Union[parameter_5._1, str, ],
            'aB': typing.Union[parameter_6.aB, str, ],
            'self': typing.Union[parameter_7._self, str, ],
            'A-B': typing.Union[parameter_8.a_b, str, ],
        },
        total=False
    )


    class Params(RequiredParams, OptionalParams):
        pass


    parameters = [
        parameter_5.parameter_oapg,
        parameter_6.parameter_oapg,
        parameter_7.parameter_oapg,
        parameter_8.parameter_oapg,
    ]

class RequestPathParameters:
    RequiredParams = typing_extensions.TypedDict(
        'RequiredParams',
        {
            '1': typing.Union[parameter_9._1, str, ],
            'aB': typing.Union[parameter_10.aB, str, ],
            'Ab': typing.Union[parameter_11.Ab, str, ],
            'self': typing.Union[parameter_12._self, str, ],
            'A-B': typing.Union[parameter_13.a_b, str, ],
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
        parameter_9.parameter_oapg,
        parameter_10.parameter_oapg,
        parameter_11.parameter_oapg,
        parameter_12.parameter_oapg,
        parameter_13.parameter_oapg,
    ]

class RequestCookieParameters:
    RequiredParams = typing_extensions.TypedDict(
        'RequiredParams',
        {
        }
    )
    OptionalParams = typing_extensions.TypedDict(
        'OptionalParams',
        {
            '1': typing.Union[parameter_14._1, str, ],
            'aB': typing.Union[parameter_15.aB, str, ],
            'Ab': typing.Union[parameter_16.Ab, str, ],
            'self': typing.Union[parameter_17._self, str, ],
            'A-B': typing.Union[parameter_18.a_b, str, ],
        },
        total=False
    )


    class Params(RequiredParams, OptionalParams):
        pass


    parameters = [
        parameter_14.parameter_oapg,
        parameter_15.parameter_oapg,
        parameter_16.parameter_oapg,
        parameter_17.parameter_oapg,
        parameter_18.parameter_oapg,
    ]_all_accept_content_types = (
    'application/json',
)


class BaseApi(api_client.Api):
    @typing.overload
    def _parameter_collisions_oapg(
        self,
        content_type: typing_extensions.Literal["application/json"] = ...,
        body: typing.Union[request_body.application_json, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        query_params: RequestQueryParameters.Params = frozendict.frozendict(),
        header_params: RequestHeaderParameters.Params = frozendict.frozendict(),
        path_params: RequestPathParameters.Params = frozendict.frozendict(),
        cookie_params: RequestCookieParameters.Params = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> typing.Union[
        response_for_200.ApiResponse,
    ]: ...

    @typing.overload
    def _parameter_collisions_oapg(
        self,
        content_type: str = ...,
        body: typing.Union[request_body.application_json, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        query_params: RequestQueryParameters.Params = frozendict.frozendict(),
        header_params: RequestHeaderParameters.Params = frozendict.frozendict(),
        path_params: RequestPathParameters.Params = frozendict.frozendict(),
        cookie_params: RequestCookieParameters.Params = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> typing.Union[
        response_for_200.ApiResponse,
    ]: ...


    @typing.overload
    def _parameter_collisions_oapg(
        self,
        skip_deserialization: typing_extensions.Literal[True],
        content_type: str = ...,
        body: typing.Union[request_body.application_json, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        query_params: RequestQueryParameters.Params = frozendict.frozendict(),
        header_params: RequestHeaderParameters.Params = frozendict.frozendict(),
        path_params: RequestPathParameters.Params = frozendict.frozendict(),
        cookie_params: RequestCookieParameters.Params = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
    ) -> api_client.ApiResponseWithoutDeserialization: ...

    @typing.overload
    def _parameter_collisions_oapg(
        self,
        content_type: str = ...,
        body: typing.Union[request_body.application_json, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        query_params: RequestQueryParameters.Params = frozendict.frozendict(),
        header_params: RequestHeaderParameters.Params = frozendict.frozendict(),
        path_params: RequestPathParameters.Params = frozendict.frozendict(),
        cookie_params: RequestCookieParameters.Params = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = ...,
    ) -> typing.Union[
        response_for_200.ApiResponse,
        api_client.ApiResponseWithoutDeserialization,
    ]: ...

    def _parameter_collisions_oapg(
        self,
        content_type: str = 'application/json',
        body: typing.Union[request_body.application_json, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        query_params: RequestQueryParameters.Params = frozendict.frozendict(),
        header_params: RequestHeaderParameters.Params = frozendict.frozendict(),
        path_params: RequestPathParameters.Params = frozendict.frozendict(),
        cookie_params: RequestCookieParameters.Params = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = False,
    ):
        """
        parameter collision case
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        self._verify_typed_dict_inputs_oapg(RequestQueryParameters.Params, query_params)
        self._verify_typed_dict_inputs_oapg(RequestHeaderParameters.Params, header_params)
        self._verify_typed_dict_inputs_oapg(RequestPathParameters.Params, path_params)
        self._verify_typed_dict_inputs_oapg(RequestCookieParameters.Params, cookie_params)
        used_path = path.value

        _path_params = {}
        for parameter in RequestPathParameters.parameters:
            parameter_data = path_params.get(parameter.name, schemas.unset)
            if parameter_data is schemas.unset:
                continue
            serialized_data = parameter.serialize(parameter_data)
            _path_params.update(serialized_data)

        for k, v in _path_params.items():
            used_path = used_path.replace('{%s}' % k, v)

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
        for parameter in RequestHeaderParameters.parameters:
            parameter_data = header_params.get(parameter.name, schemas.unset)
            if parameter_data is schemas.unset:
                continue
            serialized_data = parameter.serialize(parameter_data)
            _headers.extend(serialized_data)
        # TODO add cookie handling
        if accept_content_types:
            for accept_content_type in accept_content_types:
                _headers.add('Accept', accept_content_type)

        _fields = None
        _body = None
        if body is not schemas.unset:
            serialized_data = request_body.parameter_oapg.serialize(body, content_type)
            _headers.add('Content-Type', content_type)
            if 'fields' in serialized_data:
                _fields = serialized_data['fields']
            elif 'body' in serialized_data:
                _body = serialized_data['body']
        response = self.api_client.call_api(
            resource_path=used_path,
            method='post'.upper(),
            headers=_headers,
            fields=_fields,
            body=_body,
            stream=stream,
            timeout=timeout,
        )

        if skip_deserialization:
            api_response = api_client.ApiResponseWithoutDeserialization(response=response)
        else:
            response_for_status = _status_code_to_response.get(str(response.status))
            if response_for_status:
                api_response = response_for_status.deserialize(response, self.api_client.configuration)
            else:
                api_response = api_client.ApiResponseWithoutDeserialization(response=response)

        if not 200 <= response.status <= 299:
            raise exceptions.ApiException(api_response=api_response)

        return api_response


class ParameterCollisions(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId fn names

    @typing.overload
    def parameter_collisions(
        self,
        content_type: typing_extensions.Literal["application/json"] = ...,
        body: typing.Union[request_body.application_json, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        query_params: RequestQueryParameters.Params = frozendict.frozendict(),
        header_params: RequestHeaderParameters.Params = frozendict.frozendict(),
        path_params: RequestPathParameters.Params = frozendict.frozendict(),
        cookie_params: RequestCookieParameters.Params = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> typing.Union[
        response_for_200.ApiResponse,
    ]: ...

    @typing.overload
    def parameter_collisions(
        self,
        content_type: str = ...,
        body: typing.Union[request_body.application_json, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        query_params: RequestQueryParameters.Params = frozendict.frozendict(),
        header_params: RequestHeaderParameters.Params = frozendict.frozendict(),
        path_params: RequestPathParameters.Params = frozendict.frozendict(),
        cookie_params: RequestCookieParameters.Params = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> typing.Union[
        response_for_200.ApiResponse,
    ]: ...


    @typing.overload
    def parameter_collisions(
        self,
        skip_deserialization: typing_extensions.Literal[True],
        content_type: str = ...,
        body: typing.Union[request_body.application_json, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        query_params: RequestQueryParameters.Params = frozendict.frozendict(),
        header_params: RequestHeaderParameters.Params = frozendict.frozendict(),
        path_params: RequestPathParameters.Params = frozendict.frozendict(),
        cookie_params: RequestCookieParameters.Params = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
    ) -> api_client.ApiResponseWithoutDeserialization: ...

    @typing.overload
    def parameter_collisions(
        self,
        content_type: str = ...,
        body: typing.Union[request_body.application_json, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        query_params: RequestQueryParameters.Params = frozendict.frozendict(),
        header_params: RequestHeaderParameters.Params = frozendict.frozendict(),
        path_params: RequestPathParameters.Params = frozendict.frozendict(),
        cookie_params: RequestCookieParameters.Params = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = ...,
    ) -> typing.Union[
        response_for_200.ApiResponse,
        api_client.ApiResponseWithoutDeserialization,
    ]: ...

    def parameter_collisions(
        self,
        content_type: str = 'application/json',
        body: typing.Union[request_body.application_json, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        query_params: RequestQueryParameters.Params = frozendict.frozendict(),
        header_params: RequestHeaderParameters.Params = frozendict.frozendict(),
        path_params: RequestPathParameters.Params = frozendict.frozendict(),
        cookie_params: RequestCookieParameters.Params = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = False,
    ):
        return self._parameter_collisions_oapg(
            body=body,
            query_params=query_params,
            header_params=header_params,
            path_params=path_params,
            cookie_params=cookie_params,
            content_type=content_type,
            accept_content_types=accept_content_types,
            stream=stream,
            timeout=timeout,
            skip_deserialization=skip_deserialization
        )


class ApiForpost(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names

    @typing.overload
    def post(
        self,
        content_type: typing_extensions.Literal["application/json"] = ...,
        body: typing.Union[request_body.application_json, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        query_params: RequestQueryParameters.Params = frozendict.frozendict(),
        header_params: RequestHeaderParameters.Params = frozendict.frozendict(),
        path_params: RequestPathParameters.Params = frozendict.frozendict(),
        cookie_params: RequestCookieParameters.Params = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> typing.Union[
        response_for_200.ApiResponse,
    ]: ...

    @typing.overload
    def post(
        self,
        content_type: str = ...,
        body: typing.Union[request_body.application_json, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        query_params: RequestQueryParameters.Params = frozendict.frozendict(),
        header_params: RequestHeaderParameters.Params = frozendict.frozendict(),
        path_params: RequestPathParameters.Params = frozendict.frozendict(),
        cookie_params: RequestCookieParameters.Params = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> typing.Union[
        response_for_200.ApiResponse,
    ]: ...


    @typing.overload
    def post(
        self,
        skip_deserialization: typing_extensions.Literal[True],
        content_type: str = ...,
        body: typing.Union[request_body.application_json, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        query_params: RequestQueryParameters.Params = frozendict.frozendict(),
        header_params: RequestHeaderParameters.Params = frozendict.frozendict(),
        path_params: RequestPathParameters.Params = frozendict.frozendict(),
        cookie_params: RequestCookieParameters.Params = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
    ) -> api_client.ApiResponseWithoutDeserialization: ...

    @typing.overload
    def post(
        self,
        content_type: str = ...,
        body: typing.Union[request_body.application_json, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        query_params: RequestQueryParameters.Params = frozendict.frozendict(),
        header_params: RequestHeaderParameters.Params = frozendict.frozendict(),
        path_params: RequestPathParameters.Params = frozendict.frozendict(),
        cookie_params: RequestCookieParameters.Params = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = ...,
    ) -> typing.Union[
        response_for_200.ApiResponse,
        api_client.ApiResponseWithoutDeserialization,
    ]: ...

    def post(
        self,
        content_type: str = 'application/json',
        body: typing.Union[request_body.application_json, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        query_params: RequestQueryParameters.Params = frozendict.frozendict(),
        header_params: RequestHeaderParameters.Params = frozendict.frozendict(),
        path_params: RequestPathParameters.Params = frozendict.frozendict(),
        cookie_params: RequestCookieParameters.Params = frozendict.frozendict(),
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = False,
    ):
        return self._parameter_collisions_oapg(
            body=body,
            query_params=query_params,
            header_params=header_params,
            path_params=path_params,
            cookie_params=cookie_params,
            content_type=content_type,
            accept_content_types=accept_content_types,
            stream=stream,
            timeout=timeout,
            skip_deserialization=skip_deserialization
        )



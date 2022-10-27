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

from .. import path
from . import response_for_400
from . import parameter_0
from . import parameter_1



class RequestHeaderParameters:
    RequiredParams = typing_extensions.TypedDict(
        'RequiredParams',
        {
        }
    )
    OptionalParams = typing_extensions.TypedDict(
        'OptionalParams',
        {
            'api_key': typing.Union[parameter_0.schema, str, ],
        },
        total=False
    )


    class Params(RequiredParams, OptionalParams):
        pass


    parameters = [
        parameter_0.parameter_oapg,
    ]

class RequestPathParameters:
    RequiredParams = typing_extensions.TypedDict(
        'RequiredParams',
        {
            'petId': typing.Union[parameter_1.schema, decimal.Decimal, int, ],
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
        parameter_1.parameter_oapg,
    ]
_auth = [
    'petstore_auth',
]

_status_code_to_response = {
    '400': response_for_400.response,
}


class BaseApi(api_client.Api):
    @typing.overload
    def _delete_pet_oapg(
        self,
        header_params: RequestHeaderParameters.Params = frozendict.frozendict(),
        path_params: RequestPathParameters.Params = frozendict.frozendict(),
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> api_client.ApiResponseWithoutDeserialization: ...
    @typing.overload
    def _delete_pet_oapg(
        self,
        skip_deserialization: typing_extensions.Literal[True],
        header_params: RequestHeaderParameters.Params = frozendict.frozendict(),
        path_params: RequestPathParameters.Params = frozendict.frozendict(),
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
    ) -> api_client.ApiResponseWithoutDeserialization: ...

    @typing.overload
    def _delete_pet_oapg(
        self,
        header_params: RequestHeaderParameters.Params = frozendict.frozendict(),
        path_params: RequestPathParameters.Params = frozendict.frozendict(),
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = ...,
    ) -> typing.Union[
        api_client.ApiResponseWithoutDeserialization,
    ]: ...

    def _delete_pet_oapg(
        self,
        header_params: RequestHeaderParameters.Params = frozendict.frozendict(),
        path_params: RequestPathParameters.Params = frozendict.frozendict(),
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = False,
    ):
        """
        Deletes a pet
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        self._verify_typed_dict_inputs_oapg(RequestHeaderParameters.Params, header_params)
        self._verify_typed_dict_inputs_oapg(RequestPathParameters.Params, path_params)
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

        _headers = HTTPHeaderDict()
        for parameter in RequestHeaderParameters.parameters:
            parameter_data = header_params.get(parameter.name, schemas.unset)
            if parameter_data is schemas.unset:
                continue
            serialized_data = parameter.serialize(parameter_data)
            _headers.extend(serialized_data)
        # TODO add cookie handling

        response = self.api_client.call_api(
            resource_path=used_path,
            method='delete'.upper(),
            headers=_headers,
            auth_settings=_auth,
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
            raise exceptions.ApiException(
                status=response.status,
                reason=response.reason,
                api_response=api_response
            )

        return api_response


class DeletePet(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId fn names

    @typing.overload
    def delete_pet(
        self,
        header_params: RequestHeaderParameters.Params = frozendict.frozendict(),
        path_params: RequestPathParameters.Params = frozendict.frozendict(),
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> api_client.ApiResponseWithoutDeserialization: ...
    @typing.overload
    def delete_pet(
        self,
        skip_deserialization: typing_extensions.Literal[True],
        header_params: RequestHeaderParameters.Params = frozendict.frozendict(),
        path_params: RequestPathParameters.Params = frozendict.frozendict(),
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
    ) -> api_client.ApiResponseWithoutDeserialization: ...

    @typing.overload
    def delete_pet(
        self,
        header_params: RequestHeaderParameters.Params = frozendict.frozendict(),
        path_params: RequestPathParameters.Params = frozendict.frozendict(),
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = ...,
    ) -> typing.Union[
        api_client.ApiResponseWithoutDeserialization,
    ]: ...

    def delete_pet(
        self,
        header_params: RequestHeaderParameters.Params = frozendict.frozendict(),
        path_params: RequestPathParameters.Params = frozendict.frozendict(),
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = False,
    ):
        return self._delete_pet_oapg(
            header_params=header_params,
            path_params=path_params,
            stream=stream,
            timeout=timeout,
            skip_deserialization=skip_deserialization
        )


class ApiFordelete(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names

    @typing.overload
    def delete(
        self,
        header_params: RequestHeaderParameters.Params = frozendict.frozendict(),
        path_params: RequestPathParameters.Params = frozendict.frozendict(),
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> api_client.ApiResponseWithoutDeserialization: ...
    @typing.overload
    def delete(
        self,
        skip_deserialization: typing_extensions.Literal[True],
        header_params: RequestHeaderParameters.Params = frozendict.frozendict(),
        path_params: RequestPathParameters.Params = frozendict.frozendict(),
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
    ) -> api_client.ApiResponseWithoutDeserialization: ...

    @typing.overload
    def delete(
        self,
        header_params: RequestHeaderParameters.Params = frozendict.frozendict(),
        path_params: RequestPathParameters.Params = frozendict.frozendict(),
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = ...,
    ) -> typing.Union[
        api_client.ApiResponseWithoutDeserialization,
    ]: ...

    def delete(
        self,
        header_params: RequestHeaderParameters.Params = frozendict.frozendict(),
        path_params: RequestPathParameters.Params = frozendict.frozendict(),
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = False,
    ):
        return self._delete_pet_oapg(
            header_params=header_params,
            path_params=path_params,
            stream=stream,
            timeout=timeout,
            skip_deserialization=skip_deserialization
        )



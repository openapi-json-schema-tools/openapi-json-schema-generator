# coding: utf-8

"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from petstore_api import api_client, security_schemes
from petstore_api.shared_imports.operation_imports import *

from .. import path
from .responses import response_200
from .parameters import (
    parameter_0,
    parameter_1,
    parameter_2,
    parameter_3,
    parameter_4,
    parameter_5,
)
from .security import security_requirement_object_0



class RequestQueryParameters:
    RequiredParams = typing_extensions.TypedDict(
        'RequiredParams',
        {
            'required_string_group': typing.Union[parameter_0.Parameter0.schema, str],
            'required_int64_group': typing.Union[parameter_2.Parameter2.schema, decimal.Decimal, int],
        }
    )
    OptionalParams = typing_extensions.TypedDict(
        'OptionalParams',
        {
            'string_group': typing.Union[parameter_3.Parameter3.schema, str],
            'int64_group': typing.Union[parameter_5.Parameter5.schema, decimal.Decimal, int],
        },
        total=False
    )


    class Params(RequiredParams, OptionalParams):
        pass


    parameters = (
        parameter_0.Parameter0,
        parameter_2.Parameter2,
        parameter_3.Parameter3,
        parameter_5.Parameter5,
    )

class RequestHeaderParameters:
    RequiredParams = typing_extensions.TypedDict(
        'RequiredParams',
        {
            'required_boolean_group': typing.Union[parameter_1.Parameter1.schema, str],
        }
    )
    OptionalParams = typing_extensions.TypedDict(
        'OptionalParams',
        {
            'boolean_group': typing.Union[parameter_4.Parameter4.schema, str],
        },
        total=False
    )


    class Params(RequiredParams, OptionalParams):
        pass


    parameters = (
        parameter_1.Parameter1,
        parameter_4.Parameter4,
    )
_security: typing.List[security_schemes.SecurityRequirementObject] = [
    security_requirement_object_0.security_requirement_object,
]


__StatusCodeToResponse = typing_extensions.TypedDict(
    '__StatusCodeToResponse',
    {
        '200': typing.Type[response_200.ResponseFor200],
    }
)
_status_code_to_response: __StatusCodeToResponse = {
    '200': response_200.ResponseFor200,
}


class BaseApi(api_client.Api):
    @typing.overload
    def _group_parameters(
        self,
        query_params: RequestQueryParameters.Params = frozendict.frozendict(),
        header_params: RequestHeaderParameters.Params = frozendict.frozendict(),
        security_index: typing.Optional[int] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> response_200.ResponseFor200.response_cls: ...

    @typing.overload
    def _group_parameters(
        self,
        skip_deserialization: typing_extensions.Literal[True],
        query_params: RequestQueryParameters.Params = frozendict.frozendict(),
        header_params: RequestHeaderParameters.Params = frozendict.frozendict(),
        security_index: typing.Optional[int] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
    ) -> api_response.ApiResponseWithoutDeserialization: ...

    @typing.overload
    def _group_parameters(
        self,
        query_params: RequestQueryParameters.Params = frozendict.frozendict(),
        header_params: RequestHeaderParameters.Params = frozendict.frozendict(),
        security_index: typing.Optional[int] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = ...,
    ) -> typing.Union[
        response_200.ResponseFor200.response_cls,
        api_response.ApiResponseWithoutDeserialization,
    ]: ...

    def _group_parameters(
        self,
        query_params: RequestQueryParameters.Params = frozendict.frozendict(),
        header_params: RequestHeaderParameters.Params = frozendict.frozendict(),
        security_index: typing.Optional[int] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = False,
    ):
        """
        Fake endpoint to test group parameters (optional)
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        self._verify_typed_dict_inputs(RequestQueryParameters.Params, query_params)
        self._verify_typed_dict_inputs(RequestHeaderParameters.Params, header_params)
        used_path = self._get_used_path(
            path,
            query_parameters=RequestQueryParameters.parameters,
            query_params=query_params
        )
        _headers = self._get_headers(
            header_parameters=RequestHeaderParameters.parameters,
            header_params=header_params
        )
        # TODO add cookie handling
        host = self.api_client.configuration.get_server_url(
            'servers', server_index
        )
        security_requirement_object = self.api_client.configuration.get_security_requirement_object(
            'paths/' + path + '/delete/security',
            _security,
            security_index
        )

        raw_response = self.api_client.call_api(
            resource_path=used_path,
            method='delete',
            host=host,
            headers=_headers,
            security_requirement_object=security_requirement_object,
            stream=stream,
            timeout=timeout,
        )

        if skip_deserialization:
            response = api_response.ApiResponseWithoutDeserialization(response=raw_response)
        else:
            status = str(raw_response.status)
            if status in _status_code_to_response:
                status: typing_extensions.Literal[
                    '200',
                ]
                response = _status_code_to_response[status].deserialize(
                    raw_response, self.api_client.schema_configuration)
            else:
                response = api_response.ApiResponseWithoutDeserialization(response=raw_response)

        self._verify_response_status(response)

        return response


class GroupParameters(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId.snakeCase fn names
    group_parameters = BaseApi._group_parameters


class ApiForDelete(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names
    delete = BaseApi._group_parameters

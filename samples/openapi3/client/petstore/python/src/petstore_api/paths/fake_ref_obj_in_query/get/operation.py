# coding: utf-8

"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from petstore_api import api_client
from petstore_api.shared_imports.operation_imports import *

from .. import path
from .responses import response_200
from .parameters import parameter_0



class RequestQueryParameters:
    RequiredParams = typing_extensions.TypedDict(
        'RequiredParams',
        {
        }
    )
    OptionalParams = typing_extensions.TypedDict(
        'OptionalParams',
        {
            'mapBean': typing.Union[parameter_0.Parameter0.schema, dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader],
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
        '200': typing.Type[response_200.ResponseFor200],
    }
)
_status_code_to_response: __StatusCodeToResponse = {
    '200': response_200.ResponseFor200,
}


class BaseApi(api_client.Api):
    @typing.overload
    def _ref_object_in_query(
        self,
        query_params: typing.Optional[RequestQueryParameters.Params] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> response_200.ResponseFor200.response_cls: ...

    @typing.overload
    def _ref_object_in_query(
        self,
        skip_deserialization: typing_extensions.Literal[True],
        query_params: typing.Optional[RequestQueryParameters.Params] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
    ) -> api_response.ApiResponseWithoutDeserialization: ...

    @typing.overload
    def _ref_object_in_query(
        self,
        query_params: typing.Optional[RequestQueryParameters.Params] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
        skip_deserialization: bool = ...,
    ) -> typing.Union[
        response_200.ResponseFor200.response_cls,
        api_response.ApiResponseWithoutDeserialization,
    ]: ...

    def _ref_object_in_query(
        self,
        query_params: typing.Optional[RequestQueryParameters.Params] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
        skip_deserialization: bool = False,
    ):
        """
        user list
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        self._verify_typed_dict_inputs(RequestQueryParameters.Params, query_params)
        used_path = self._get_used_path(
            path,
            query_parameters=RequestQueryParameters.parameters,
            query_params=query_params
        )
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


class RefObjectInQuery(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId.snakeCase fn names
    ref_object_in_query = BaseApi._ref_object_in_query


class ApiForGet(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names
    get = BaseApi._ref_object_in_query

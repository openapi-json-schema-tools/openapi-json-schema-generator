# coding: utf-8

"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from some_api import api_client, exceptions, security_schemes
from some_api.shared_imports.operation_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]
from some_api.components.schema import time_config

from .. import path
from .responses import (
    response_204,
    response_400,
    response_401,
    response_403,
    response_406,
    response_412,
)
from . import request_body
from .security import security_requirement_object_0

_security: typing.List[security_schemes.SecurityRequirementObject] = [
    security_requirement_object_0.security_requirement_object,
]


__StatusCodeToResponse = typing.TypedDict(
    '__StatusCodeToResponse',
    {
        '204': typing.Type[response_204.ResponseFor204],
        '400': typing.Type[response_400.ResponseFor400],
        '401': typing.Type[response_401.ResponseFor401],
        '403': typing.Type[response_403.ResponseFor403],
        '406': typing.Type[response_406.ResponseFor406],
        '412': typing.Type[response_412.ResponseFor412],
    }
)
_status_code_to_response: __StatusCodeToResponse = {
    '204': response_204.ResponseFor204,
    '400': response_400.ResponseFor400,
    '401': response_401.ResponseFor401,
    '403': response_403.ResponseFor403,
    '406': response_406.ResponseFor406,
    '412': response_412.ResponseFor412,
}
_non_error_status_codes = frozenset({
    '204',
})
_error_status_codes = frozenset({
    '400',
    '401',
    '403',
    '406',
    '412',
})


class BaseApi(api_client.Api):
    @typing.overload
    def _config_time_put(
        self,
        body: typing.Union[
            time_config.TimeConfigDictInput,
            time_config.TimeConfigDict,
        ],
        *,
        skip_deserialization: typing.Literal[False] = False,
        content_type: typing.Literal["application/json"] = "application/json",
        security_index: typing.Optional[int] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
    ) -> response_204.ApiResponse: ...

    @typing.overload
    def _config_time_put(
        self,
        body: typing.Union[
            time_config.TimeConfigDictInput,
            time_config.TimeConfigDict,
        ],
        *,
        skip_deserialization: typing.Literal[True],
        content_type: typing.Literal["application/json"] = "application/json",
        security_index: typing.Optional[int] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
    ) -> api_response.ApiResponseWithoutDeserialization: ...

    def _config_time_put(
        self,
        body: typing.Union[
            time_config.TimeConfigDictInput,
            time_config.TimeConfigDict,
        ],
        *,
        skip_deserialization: bool = False,
        content_type: typing.Literal["application/json"] = "application/json",
        security_index: typing.Optional[int] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
    ):
        """
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        used_path = path
        headers = self._get_headers()
        # TODO add cookie handling

        fields, serialized_body = self._get_fields_and_body(
            request_body=request_body.RequestBody,
            body=body,
            content_type=content_type,
            headers=headers
        )
        host = self.api_client.configuration.get_server_url(
            "servers", server_index
        )
        security_requirement_object = self.api_client.configuration.get_security_requirement_object(
            "paths//config/time/put/security",
            _security,
            security_index
        )

        raw_response = self.api_client.call_api(
            resource_path=used_path,
            method='put',
            host=host,
            headers=headers,
            fields=fields,
            body=serialized_body,
            security_requirement_object=security_requirement_object,
            stream=stream,
            timeout=timeout,
        )

        if skip_deserialization:
            skip_deser_response = api_response.ApiResponseWithoutDeserialization(response=raw_response)
            self._verify_response_status(skip_deser_response)
            return skip_deser_response

        status = str(raw_response.status)
        if status in _non_error_status_codes:
            status_code = typing.cast(
                typing.Literal[
                    '204',
                ],
                status
            )
            return _status_code_to_response[status_code].deserialize(
                raw_response, self.api_client.schema_configuration)
        elif status in _error_status_codes:
            error_status_code = typing.cast(
                typing.Literal[
                    '400',
                    '401',
                    '403',
                    '406',
                    '412',
                ],
                status
            )
            error_response = _status_code_to_response[error_status_code].deserialize(
                raw_response, self.api_client.schema_configuration)
            raise exceptions.ApiException(
                status=error_response.response.status,
                reason=error_response.response.reason,
                api_response=error_response
            )

        response = api_response.ApiResponseWithoutDeserialization(response=raw_response)
        self._verify_response_status(response)
        return response


class ConfigTimePut(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId.snakeCase fn names
    config_time_put = BaseApi._config_time_put


class ApiForPut(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names
    put = BaseApi._config_time_put

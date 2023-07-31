# coding: utf-8

"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]
from petstore_api import api_client, exceptions, security_schemes
from petstore_api.shared_imports.operation_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

from .. import path
from .responses import response_400
from .parameters import (
    parameter_0,
    parameter_1,
)
from .security import (
    security_requirement_object_0,
    security_requirement_object_1,
)
from .path_parameters import PathParameters
from .header_parameters import HeaderParameters
header_parameter_classes = (
    parameter_0.Parameter0,
)
path_parameter_classes = (
    parameter_1.Parameter1,
)

_security: typing.List[security_schemes.SecurityRequirementObject] = [
    security_requirement_object_0.security_requirement_object,
    security_requirement_object_1.security_requirement_object,
]


__StatusCodeToResponse = typing_extensions.TypedDict(
    '__StatusCodeToResponse',
    {
        '400': typing.Type[response_400.ResponseFor400],
    }
)
_status_code_to_response: __StatusCodeToResponse = {
    '400': response_400.ResponseFor400,
}
_error_status_codes = frozenset({
    '400',
})


class BaseApi(api_client.Api):
    @typing.overload
    def _delete_pet(
        self,
        path_params: typing.Union[
            path_parameters.PathParametersDictInput,
            path_parameters.PathParametersDict
        ],
        header_params: typing.Union[
            header_parameters.HeaderParametersDictInput,
            header_parameters.HeaderParametersDict,
            None
        ] = None,
        *,
        skip_deserialization: typing_extensions.Literal[False] = False,
        security_index: typing.Optional[int] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
    ) -> api_response.ApiResponseWithoutDeserialization: ...
    @typing.overload
    def _delete_pet(
        self,
        path_params: typing.Union[
            path_parameters.PathParametersDictInput,
            path_parameters.PathParametersDict
        ],
        header_params: typing.Union[
            header_parameters.HeaderParametersDictInput,
            header_parameters.HeaderParametersDict,
            None
        ] = None,
        *,
        skip_deserialization: typing_extensions.Literal[True],
        security_index: typing.Optional[int] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
    ) -> api_response.ApiResponseWithoutDeserialization: ...

    def _delete_pet(
        self,
        path_params: typing.Union[
            path_parameters.PathParametersDictInput,
            path_parameters.PathParametersDict
        ],
        header_params: typing.Union[
            header_parameters.HeaderParametersDictInput,
            header_parameters.HeaderParametersDict,
            None
        ] = None,
        *,
        skip_deserialization: bool = False,
        security_index: typing.Optional[int] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
    ):
        """
        Deletes a pet
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        path_params = PathParameters.validate(path_params)
        if header_params is not None:
            header_params = HeaderParameters.validate(header_params)
        used_path, query_params_suffix = self._get_used_path(
            path,
            path_parameters=path_parameter_classes,
            path_params=path_params,
            skip_validation=True
        )
        headers = self._get_headers(
            header_parameters=header_parameter_classes,
            header_params=header_params,
            skip_validation=True
        )
        # TODO add cookie handling
        host = self.api_client.configuration.get_server_url(
            "servers", server_index
        )
        security_requirement_object = self.api_client.configuration.get_security_requirement_object(
            "paths//pet/{petId}/delete/security",
            _security,
            security_index
        )

        raw_response = self.api_client.call_api(
            resource_path=used_path,
            method='delete',
            host=host,
            headers=headers,
            security_requirement_object=security_requirement_object,
            stream=stream,
            timeout=timeout,
        )

        if skip_deserialization:
            skip_deser_response = api_response.ApiResponseWithoutDeserialization(response=raw_response)
            self._verify_response_status(skip_deser_response)
            return skip_deser_response

        status = str(raw_response.status)
        if status in _error_status_codes:
            error_status_code = typing.cast(
                typing_extensions.Literal[
                    '400',
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


class DeletePet(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId.snakeCase fn names
    delete_pet = BaseApi._delete_pet


class ApiForDelete(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names
    delete = BaseApi._delete_pet

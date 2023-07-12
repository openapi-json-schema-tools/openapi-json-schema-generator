# coding: utf-8

"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *
from petstore_api import api_client, exceptions, security_schemes
from petstore_api.shared_imports.operation_imports import *

from .. import path
from .responses import (
    response_400,
    response_404,
    response_405,
)
from . import request_body
from petstore_api.components.schema import pet as request_body_application_json_schema
from petstore_api.components.schema import pet as request_body_application_xml_schema
from .security import (
    security_requirement_object_0,
    security_requirement_object_1,
)


_security: typing.List[security_schemes.SecurityRequirementObject] = [
    security_requirement_object_0.security_requirement_object,
    security_requirement_object_1.security_requirement_object,
]


__StatusCodeToResponse = typing_extensions.TypedDict(
    '__StatusCodeToResponse',
    {
        '400': typing.Type[response_400.ResponseFor400],
        '404': typing.Type[response_404.ResponseFor404],
        '405': typing.Type[response_405.ResponseFor405],
    }
)
_status_code_to_response: __StatusCodeToResponse = {
    '400': response_400.ResponseFor400,
    '404': response_404.ResponseFor404,
    '405': response_405.ResponseFor405,
}
_error_status_codes = frozenset({
    '400',
    '404',
    '405',
})


class BaseApi(api_client.Api):
    @typing.overload
    def _update_pet(
        self,
        body: typing.Union[
            request_body_application_json_schema.PetDictInput,
            request_body_application_json_schema.PetDict,
            request_body_application_xml_schema.PetDictInput,
            request_body_application_xml_schema.PetDict,
        ],
        *,
        skip_deserialization: typing_extensions.Literal[False] = False,
        content_type: typing_extensions.Literal[
            "application/json",
            "application/xml",
        ] = "application/json",
        security_index: typing.Optional[int] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
    ) -> api_response.ApiResponseWithoutDeserialization: ...
    @typing.overload
    def _update_pet(
        self,
        body: typing.Union[
            request_body_application_json_schema.PetDictInput,
            request_body_application_json_schema.PetDict,
            request_body_application_xml_schema.PetDictInput,
            request_body_application_xml_schema.PetDict,
        ],
        *,
        skip_deserialization: typing_extensions.Literal[True],
        content_type: typing_extensions.Literal[
            "application/json",
            "application/xml",
        ] = "application/json",
        security_index: typing.Optional[int] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
    ) -> api_response.ApiResponseWithoutDeserialization: ...

    def _update_pet(
        self,
        body: typing.Union[
            request_body_application_json_schema.PetDictInput,
            request_body_application_json_schema.PetDict,
            request_body_application_xml_schema.PetDictInput,
            request_body_application_xml_schema.PetDict,
        ],
        *,
        skip_deserialization: bool = False,
        content_type: typing_extensions.Literal[
            "application/json",
            "application/xml",
        ] = "application/json",
        security_index: typing.Optional[int] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
    ):
        """
        Update an existing pet
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        used_path = path
        _headers = self._get_headers()
        # TODO add cookie handling

        _fields, _body = self._get_fields_and_body(
            request_body=request_body.RequestBody,
            body=body,
            headers=_headers,
            content_type=content_type
        )
        host = self.api_client.configuration.get_server_url(
            "servers", server_index
        )
        security_requirement_object = self.api_client.configuration.get_security_requirement_object(
            "paths//pet/put/security",
            _security,
            security_index
        )

        raw_response = self.api_client.call_api(
            resource_path=used_path,
            method='put',
            host=host,
            headers=_headers,
            fields=_fields,
            body=_body,
            security_requirement_object=security_requirement_object,
            stream=stream,
            timeout=timeout,
        )

        if skip_deserialization:
            response = api_response.ApiResponseWithoutDeserialization(response=raw_response)
            self._verify_response_status(response)
            return response

        status = str(raw_response.status)
        if status in _error_status_codes:
            error_status_code = typing.cast(
                typing_extensions.Literal[
                    '400',
                    '404',
                    '405',
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


class UpdatePet(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId.snakeCase fn names
    update_pet = BaseApi._update_pet


class ApiForPut(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names
    put = BaseApi._update_pet

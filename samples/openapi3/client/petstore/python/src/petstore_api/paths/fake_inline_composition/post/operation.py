# coding: utf-8

"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]
from petstore_api import api_client
from petstore_api.shared_imports.operation_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

from .. import path
from .responses import response_200
from . import request_body
from petstore_api.paths.fake_inline_composition.post.request_body.content.application_json import schema as request_body_application_json_schema
from petstore_api.paths.fake_inline_composition.post.request_body.content.multipart_form_data import schema as request_body_multipart_form_data_schema
from .parameters import (
    parameter_0,
    parameter_1,
)


AdditionalProperties: typing_extensions.TypeAlias = schemas.NotAnyTypeSchema

from petstore_api.paths.fake_inline_composition.post.parameters.parameter_0 import schema as parameter_0_schema
from petstore_api.paths.fake_inline_composition.post.parameters.parameter_1 import schema as parameter_1_schema
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "compositionAtRoot": typing.Type[parameter_0_schema.Schema],
        "compositionInProperty": typing.Type[parameter_1_schema.Schema],
    }
)


class QueryParametersDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    __required_keys__ = frozenset({
    })
    __optional_keys__ = frozenset({
        "compositionAtRoot",
        "compositionInProperty",
    })
    
    @typing.overload
    def get_property(self, name: typing_extensions.Literal["compositionAtRoot"]) -> schemas.OUTPUT_BASE_TYPES:
        ...
    
    @typing.overload
    def get_property(self, name: typing_extensions.Literal["compositionInProperty"]) -> parameter_1_schema.SchemaDict:
        ...
    
    def get_property(self, name):
        schemas.raise_if_key_unknown(name, self.__required_keys__, self.__optional_keys__)
        return self.__getitem__(name)

    def __new__(cls, arg: QueryParametersDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return QueryParameters.validate(arg, configuration=configuration)
QueryParametersDictInput = typing_extensions.TypedDict(
    'QueryParametersDictInput',
    {
        "compositionAtRoot": typing.Union[
            dict,
            schemas.immutabledict,
            str,
            datetime.date,
            datetime.datetime,
            uuid.UUID,
            int,
            float,
            bool,
            None,
            list,
            tuple,
            bytes,
            io.FileIO,
            io.BufferedReader
        ],
        "compositionInProperty": typing.Union[
            parameter_1_schema.SchemaDict,
            dict,
            schemas.immutabledict
        ],
    },
    total=False
)


@dataclasses.dataclass(frozen=True)
class QueryParameters(
    schemas.Schema[QueryParametersDict, tuple]
):
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    additional_properties: typing.Type[AdditionalProperties] = dataclasses.field(default_factory=lambda: AdditionalProperties) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: QueryParametersDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            QueryParametersDictInput,
            QueryParametersDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> QueryParametersDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )

query_parameter_classes = (
    parameter_0.Parameter0,
    parameter_1.Parameter1,
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
_non_error_status_codes = frozenset({
    '200',
})

_all_accept_content_types = (
    "application/json",
    "multipart/form-data",
)


class BaseApi(api_client.Api):
    @typing.overload
    def _inline_composition(
        self,
        body: typing.Union[
            schemas.INPUT_TYPES_ALL,
            schemas.OUTPUT_BASE_TYPES,
            request_body_multipart_form_data_schema.SchemaDictInput,
            request_body_multipart_form_data_schema.SchemaDict,
            schemas.Unset
        ] = schemas.unset,
        query_params: typing.Union[
            QueryParametersDictInput,
            QueryParametersDict,
            None
        ] = None,
        *,
        skip_deserialization: typing_extensions.Literal[False] = False,
        content_type: typing_extensions.Literal[
            "application/json",
            "multipart/form-data",
        ] = "application/json",
        accept_content_types: typing.Tuple[str, ...] = _all_accept_content_types,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
    ) -> response_200.ApiResponse: ...

    @typing.overload
    def _inline_composition(
        self,
        body: typing.Union[
            schemas.INPUT_TYPES_ALL,
            schemas.OUTPUT_BASE_TYPES,
            request_body_multipart_form_data_schema.SchemaDictInput,
            request_body_multipart_form_data_schema.SchemaDict,
            schemas.Unset
        ] = schemas.unset,
        query_params: typing.Union[
            QueryParametersDictInput,
            QueryParametersDict,
            None
        ] = None,
        *,
        skip_deserialization: typing_extensions.Literal[True],
        content_type: typing_extensions.Literal[
            "application/json",
            "multipart/form-data",
        ] = "application/json",
        accept_content_types: typing.Tuple[str, ...] = _all_accept_content_types,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
    ) -> api_response.ApiResponseWithoutDeserialization: ...

    def _inline_composition(
        self,
        body: typing.Union[
            schemas.INPUT_TYPES_ALL,
            schemas.OUTPUT_BASE_TYPES,
            request_body_multipart_form_data_schema.SchemaDictInput,
            request_body_multipart_form_data_schema.SchemaDict,
            schemas.Unset
        ] = schemas.unset,
        query_params: typing.Union[
            QueryParametersDictInput,
            QueryParametersDict,
            None
        ] = None,
        *,
        skip_deserialization: bool = False,
        content_type: typing_extensions.Literal[
            "application/json",
            "multipart/form-data",
        ] = "application/json",
        accept_content_types: typing.Tuple[str, ...] = _all_accept_content_types,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
    ):
        """
        testing composed schemas at inline locations
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        if query_params is not None:
            query_params = QueryParameters.validate(query_params)
        used_path, query_params_suffix = self._get_used_path(
            path,
            query_parameters=query_parameter_classes,
            query_params=query_params
        )
        _headers = self._get_headers(accept_content_types=accept_content_types)
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

        raw_response = self.api_client.call_api(
            resource_path=used_path,
            query_params_suffix=query_params_suffix,
            method='post',
            host=host,
            headers=_headers,
            fields=_fields,
            body=_body,
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
                typing_extensions.Literal[
                    '200',
                ],
                status
            )
            return _status_code_to_response[status_code].deserialize(
                raw_response, self.api_client.schema_configuration)

        response = api_response.ApiResponseWithoutDeserialization(response=raw_response)
        self._verify_response_status(response)
        return response


class InlineComposition(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId.snakeCase fn names
    inline_composition = BaseApi._inline_composition


class ApiForPost(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names
    post = BaseApi._inline_composition

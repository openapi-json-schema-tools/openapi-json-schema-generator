# coding: utf-8

"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *
from petstore_api import api_client
from petstore_api.shared_imports.operation_imports import *

from .. import path
from .responses import (
    response_200,
    response_404,
)
from . import request_body
from .parameters import (
    parameter_0,
    parameter_1,
    parameter_2,
    parameter_3,
    parameter_4,
    parameter_5,
)


AdditionalProperties: typing_extensions.TypeAlias = schemas.NotAnyTypeSchema

from petstore_api.paths.fake.get.parameters.parameter_2 import schema as parameter_2_schema
from petstore_api.paths.fake.get.parameters.parameter_3 import schema as parameter_3_schema
from petstore_api.paths.fake.get.parameters.parameter_4 import schema as parameter_4_schema
from petstore_api.paths.fake.get.parameters.parameter_5 import schema as parameter_5_schema
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "enum_query_double": typing.Type[parameter_5_schema.Schema],
        "enum_query_string": typing.Type[parameter_3_schema.Schema],
        "enum_query_integer": typing.Type[parameter_4_schema.Schema],
        "enum_query_string_array": typing.Type[parameter_2_schema.Schema],
    }
)


class QueryParametersDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["enum_query_double"]) -> typing.Union[float, int]:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["enum_query_string"]) -> str:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["enum_query_integer"]) -> int:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["enum_query_string_array"]) -> parameter_2_schema.SchemaTuple:
        ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["enum_query_double"],
            typing_extensions.Literal["enum_query_string"],
            typing_extensions.Literal["enum_query_integer"],
            typing_extensions.Literal["enum_query_string_array"],
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(cls, arg: QueryParametersDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return QueryParameters.validate(arg, configuration=configuration)
QueryParametersDictInput = typing_extensions.TypedDict(
    'QueryParametersDictInput',
    {
        "enum_query_double": typing.Union[
            float,
            int
        ],
        "enum_query_string": str,
        "enum_query_integer": int,
        "enum_query_string_array": typing.Union[
            parameter_2_schema.SchemaTuple,
            list,
            tuple
        ],
    },
    total=False
)


@dataclasses.dataclass(frozen=True)
class QueryParameters(
    schemas.DictSchema[QueryParametersDict]
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
        return super().validate(
            arg,
            configuration=configuration,
        )


AdditionalProperties2: typing_extensions.TypeAlias = schemas.NotAnyTypeSchema

from petstore_api.paths.fake.get.parameters.parameter_0 import schema as parameter_0_schema
from petstore_api.paths.fake.get.parameters.parameter_1 import schema as parameter_1_schema
Properties2 = typing_extensions.TypedDict(
    'Properties2',
    {
        "enum_header_string": typing.Type[parameter_1_schema.Schema],
        "enum_header_string_array": typing.Type[parameter_0_schema.Schema],
    }
)


class HeaderParametersDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["enum_header_string"]) -> str:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["enum_header_string_array"]) -> parameter_0_schema.SchemaTuple:
        ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["enum_header_string"],
            typing_extensions.Literal["enum_header_string_array"],
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(cls, arg: HeaderParametersDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return HeaderParameters.validate(arg, configuration=configuration)
HeaderParametersDictInput = typing_extensions.TypedDict(
    'HeaderParametersDictInput',
    {
        "enum_header_string": str,
        "enum_header_string_array": typing.Union[
            parameter_0_schema.SchemaTuple,
            list,
            tuple
        ],
    },
    total=False
)


@dataclasses.dataclass(frozen=True)
class HeaderParameters(
    schemas.DictSchema[HeaderParametersDict]
):
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    properties: Properties2 = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties2)) # type: ignore
    additional_properties: typing.Type[AdditionalProperties2] = dataclasses.field(default_factory=lambda: AdditionalProperties2) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: HeaderParametersDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            HeaderParametersDictInput,
            HeaderParametersDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> HeaderParametersDict:
        return super().validate(
            arg,
            configuration=configuration,
        )

query_parameter_classes = (
    parameter_2.Parameter2,
    parameter_3.Parameter3,
    parameter_4.Parameter4,
    parameter_5.Parameter5,
)
header_parameter_classes = (
    parameter_0.Parameter0,
    parameter_1.Parameter1,
)


__StatusCodeToResponse = typing_extensions.TypedDict(
    '__StatusCodeToResponse',
    {
        '200': typing.Type[response_200.ResponseFor200],
        '404': typing.Type[response_404.ResponseFor404],
    }
)
_status_code_to_response: __StatusCodeToResponse = {
    '200': response_200.ResponseFor200,
    '404': response_404.ResponseFor404,
}

_all_accept_content_types = (
    "application/json",
)


class BaseApi(api_client.Api):
    @typing.overload
    def _enum_parameters(
        self,
        body: typing.Union[
            request_body.content.application_x_www_form_urlencoded.schema.SchemaDictInput,
            request_body.content.application_x_www_form_urlencoded.schema.SchemaDict,
            schemas.Unset
        ] = schemas.unset,
        query_params: typing.Union[
            QueryParametersDictInput,
            QueryParametersDict,
            None
        ] = None,
        header_params: typing.Union[
            HeaderParametersDictInput,
            HeaderParametersDict,
            None
        ] = None,
        content_type: typing_extensions.Literal["application/x-www-form-urlencoded"] = "application/x-www-form-urlencoded",
        accept_content_types: typing.Tuple[str, ...] = _all_accept_content_types,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = False
    ) -> response_200.ResponseFor200.response_cls: ...

    @typing.overload
    def _enum_parameters(
        self,
        body: typing.Union[
            request_body.content.application_x_www_form_urlencoded.schema.SchemaDictInput,
            request_body.content.application_x_www_form_urlencoded.schema.SchemaDict,
            schemas.Unset
        ] = schemas.unset,
        query_params: typing.Union[
            QueryParametersDictInput,
            QueryParametersDict,
            None
        ] = None,
        header_params: typing.Union[
            HeaderParametersDictInput,
            HeaderParametersDict,
            None
        ] = None,
        content_type: typing_extensions.Literal["application/x-www-form-urlencoded"] = "application/x-www-form-urlencoded",
        accept_content_types: typing.Tuple[str, ...] = _all_accept_content_types,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[True] = ...
    ) -> api_response.ApiResponseWithoutDeserialization: ...

    def _enum_parameters(
        self,
        body: typing.Union[
            request_body.content.application_x_www_form_urlencoded.schema.SchemaDictInput,
            request_body.content.application_x_www_form_urlencoded.schema.SchemaDict,
            schemas.Unset
        ] = schemas.unset,
        query_params: typing.Union[
            QueryParametersDictInput,
            QueryParametersDict,
            None
        ] = None,
        header_params: typing.Union[
            HeaderParametersDictInput,
            HeaderParametersDict,
            None
        ] = None,
        content_type: typing_extensions.Literal["application/x-www-form-urlencoded"] = "application/x-www-form-urlencoded",
        accept_content_types: typing.Tuple[str, ...] = _all_accept_content_types,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
        skip_deserialization: bool = False
    ):
        """
        To test enum parameters
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        if query_params is not None:
            query_params = QueryParameters.validate(query_params)
        if header_params is not None:
            header_params = HeaderParameters.validate(header_params)
        used_path = self._get_used_path(
            path,
            query_parameters=query_parameter_classes,
            query_params=query_params
        )
        _headers = self._get_headers(
            header_parameters=header_parameter_classes,
            header_params=header_params,
            accept_content_types=accept_content_types,
            skip_validation=True
        )
        # TODO add cookie handling

        _fields, _body = self._get_fields_and_body(
            request_body=request_body.RequestBody,
            body=body,
            headers=_headers,
            content_type=content_type
        )
        host = self.api_client.configuration.get_server_url(
            'servers', server_index
        )

        raw_response = self.api_client.call_api(
            resource_path=used_path,
            method='get',
            host=host,
            headers=_headers,
            fields=_fields,
            body=_body,
            stream=stream,
            timeout=timeout,
        )

        if skip_deserialization:
            response = api_response.ApiResponseWithoutDeserialization(response=raw_response)
        else:
            status = str(raw_response.status)
            if status in _status_code_to_response:
                status = typing.cast(
                    typing_extensions.Literal[
                    '200',
                    '404',
                    ],
                    status
                )
                response = _status_code_to_response[status].deserialize(
                    raw_response, self.api_client.schema_configuration)
            else:
                response = api_response.ApiResponseWithoutDeserialization(response=raw_response)

        self._verify_response_status(response)

        return response


class EnumParameters(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId.snakeCase fn names
    enum_parameters = BaseApi._enum_parameters


class ApiForGet(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names
    get = BaseApi._enum_parameters

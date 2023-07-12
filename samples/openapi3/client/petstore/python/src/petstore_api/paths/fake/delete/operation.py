# coding: utf-8

"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *
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


AdditionalProperties: typing_extensions.TypeAlias = schemas.NotAnyTypeSchema

from petstore_api.paths.fake.delete.parameters.parameter_0 import schema as parameter_0_schema
from petstore_api.paths.fake.delete.parameters.parameter_2 import schema as parameter_2_schema
from petstore_api.paths.fake.delete.parameters.parameter_3 import schema as parameter_3_schema
from petstore_api.paths.fake.delete.parameters.parameter_5 import schema as parameter_5_schema
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "required_string_group": typing.Type[parameter_0_schema.Schema],
        "int64_group": typing.Type[parameter_5_schema.Schema],
        "string_group": typing.Type[parameter_3_schema.Schema],
        "required_int64_group": typing.Type[parameter_2_schema.Schema],
    }
)
QueryParametersRequiredDictInput = typing_extensions.TypedDict(
    'QueryParametersRequiredDictInput',
    {
        "required_int64_group": int,
        "required_string_group": str,
    }
)
QueryParametersOptionalDictInput = typing_extensions.TypedDict(
    'QueryParametersOptionalDictInput',
    {
        "int64_group": int,
        "string_group": str,
    },
    total=False
)


class QueryParametersDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    @property
    def required_int64_group(self) -> int:
        return self.__getitem__("required_int64_group")
    
    @property
    def required_string_group(self) -> str:
        return self.__getitem__("required_string_group")
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["required_int64_group"]) -> int:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["required_string_group"]) -> str:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["int64_group"]) -> int:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["string_group"]) -> str:
        ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["required_int64_group"],
            typing_extensions.Literal["required_string_group"],
            typing_extensions.Literal["int64_group"],
            typing_extensions.Literal["string_group"],
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(cls, arg: QueryParametersDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return QueryParameters.validate(arg, configuration=configuration)


class QueryParametersDictInput(QueryParametersRequiredDictInput, QueryParametersOptionalDictInput):
    pass


@dataclasses.dataclass(frozen=True)
class QueryParameters(
    schemas.Schema[QueryParametersDict, tuple]
):
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    required: typing.FrozenSet[str] = frozenset({
        "required_int64_group",
        "required_string_group",
    })
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


AdditionalProperties2: typing_extensions.TypeAlias = schemas.NotAnyTypeSchema

from petstore_api.paths.fake.delete.parameters.parameter_1 import schema as parameter_1_schema
from petstore_api.paths.fake.delete.parameters.parameter_4 import schema as parameter_4_schema
Properties2 = typing_extensions.TypedDict(
    'Properties2',
    {
        "required_boolean_group": typing.Type[parameter_1_schema.Schema],
        "boolean_group": typing.Type[parameter_4_schema.Schema],
    }
)
HeaderParametersRequiredDictInput = typing_extensions.TypedDict(
    'HeaderParametersRequiredDictInput',
    {
        "required_boolean_group": str,
    }
)
HeaderParametersOptionalDictInput = typing_extensions.TypedDict(
    'HeaderParametersOptionalDictInput',
    {
        "boolean_group": str,
    },
    total=False
)


class HeaderParametersDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    @property
    def required_boolean_group(self) -> typing_extensions.Literal["true", "false"]:
        return self.__getitem__("required_boolean_group")
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["required_boolean_group"]) -> typing_extensions.Literal["true", "false"]:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["boolean_group"]) -> typing_extensions.Literal["true", "false"]:
        ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["required_boolean_group"],
            typing_extensions.Literal["boolean_group"],
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(cls, arg: HeaderParametersDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return HeaderParameters.validate(arg, configuration=configuration)


class HeaderParametersDictInput(HeaderParametersRequiredDictInput, HeaderParametersOptionalDictInput):
    pass


@dataclasses.dataclass(frozen=True)
class HeaderParameters(
    schemas.Schema[HeaderParametersDict, tuple]
):
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    required: typing.FrozenSet[str] = frozenset({
        "required_boolean_group",
    })
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
        return super().validate_base(
            arg,
            configuration=configuration,
        )

query_parameter_classes = (
    parameter_0.Parameter0,
    parameter_2.Parameter2,
    parameter_3.Parameter3,
    parameter_5.Parameter5,
)
header_parameter_classes = (
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
_non_error_status_codes = frozenset({
    '200',
})


class BaseApi(api_client.Api):
    @typing.overload
    def _group_parameters(
        self,
        query_params: typing.Union[
            QueryParametersDictInput,
            QueryParametersDict
        ],
        header_params: typing.Union[
            HeaderParametersDictInput,
            HeaderParametersDict
        ],
        security_index: typing.Optional[int] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = False
    ) -> response_200.ApiResponse: ...

    @typing.overload
    def _group_parameters(
        self,
        query_params: typing.Union[
            QueryParametersDictInput,
            QueryParametersDict
        ],
        header_params: typing.Union[
            HeaderParametersDictInput,
            HeaderParametersDict
        ],
        security_index: typing.Optional[int] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[True] = ...
    ) -> api_response.ApiResponseWithoutDeserialization: ...

    def _group_parameters(
        self,
        query_params: typing.Union[
            QueryParametersDictInput,
            QueryParametersDict
        ],
        header_params: typing.Union[
            HeaderParametersDictInput,
            HeaderParametersDict
        ],
        security_index: typing.Optional[int] = None,
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
        skip_deserialization: bool = False
    ):
        """
        Fake endpoint to test group parameters (optional)
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        query_params = QueryParameters.validate(query_params)
        header_params = HeaderParameters.validate(header_params)
        used_path, query_params_suffix = self._get_used_path(
            path,
            query_parameters=query_parameter_classes,
            query_params=query_params
        )
        _headers = self._get_headers(
            header_parameters=header_parameter_classes,
            header_params=header_params,
            skip_validation=True
        )
        # TODO add cookie handling
        host = self.api_client.configuration.get_server_url(
            "servers", server_index
        )
        security_requirement_object = self.api_client.configuration.get_security_requirement_object(
            "paths//fake/delete/security",
            _security,
            security_index
        )

        raw_response = self.api_client.call_api(
            resource_path=used_path,
            query_params_suffix=query_params_suffix,
            method='delete',
            host=host,
            headers=_headers,
            security_requirement_object=security_requirement_object,
            stream=stream,
            timeout=timeout,
        )

        if skip_deserialization:
            response = api_response.ApiResponseWithoutDeserialization(response=raw_response)
            self._verify_response_status(response)
            return response

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


class GroupParameters(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId.snakeCase fn names
    group_parameters = BaseApi._group_parameters


class ApiForDelete(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names
    delete = BaseApi._group_parameters

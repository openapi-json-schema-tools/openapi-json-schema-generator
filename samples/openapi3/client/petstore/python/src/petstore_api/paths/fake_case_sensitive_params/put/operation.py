# coding: utf-8

"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *
from petstore_api import api_client
from petstore_api.shared_imports.operation_imports import *

from .. import path
from .responses import response_200
from .parameters import (
    parameter_0,
    parameter_1,
    parameter_2,
)


AdditionalProperties: typing_extensions.TypeAlias = schemas.NotAnyTypeSchema

from petstore_api.paths.fake_case_sensitive_params.put.parameters.parameter_0 import schema as parameter_0_schema
from petstore_api.paths.fake_case_sensitive_params.put.parameters.parameter_1 import schema as parameter_1_schema
from petstore_api.paths.fake_case_sensitive_params.put.parameters.parameter_2 import schema as parameter_2_schema
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "someVar": typing.Type[parameter_0_schema.Schema],
        "some_var": typing.Type[parameter_2_schema.Schema],
        "SomeVar": typing.Type[parameter_1_schema.Schema],
    }
)


class QueryParametersDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    @property
    def SomeVar(self) -> str:
        return self.__getitem__("SomeVar")
    
    @property
    def someVar(self) -> str:
        return self.__getitem__("someVar")
    
    @property
    def some_var(self) -> str:
        return self.__getitem__("some_var")
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["SomeVar"]) -> str:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["someVar"]) -> str:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["some_var"]) -> str:
        ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["SomeVar"],
            typing_extensions.Literal["someVar"],
            typing_extensions.Literal["some_var"],
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(cls, arg: QueryParametersDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return QueryParameters.validate(arg, configuration=configuration)
QueryParametersDictInput = typing_extensions.TypedDict(
    'QueryParametersDictInput',
    {
        "SomeVar": str,
        "someVar": str,
        "some_var": str,
    }
)


@dataclasses.dataclass(frozen=True)
class QueryParameters(
    schemas.DictSchema[QueryParametersDict]
):
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    required: typing.FrozenSet[str] = frozenset({
        "SomeVar",
        "someVar",
        "some_var",
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
        return super().validate(
            arg,
            configuration=configuration,
        )

query_parameter_classes = (
    parameter_0.Parameter0,
    parameter_1.Parameter1,
    parameter_2.Parameter2,
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
    def _case_sensitive_params(
        self,
        query_params: typing.Union[
            QueryParametersDictInput,
            QueryParametersDict
        ],
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = False
    ) -> response_200.ResponseFor200.response_cls: ...

    @typing.overload
    def _case_sensitive_params(
        self,
        query_params: typing.Union[
            QueryParametersDictInput,
            QueryParametersDict
        ],
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[True] = ...
    ) -> api_response.ApiResponseWithoutDeserialization: ...

    def _case_sensitive_params(
        self,
        query_params: typing.Union[
            QueryParametersDictInput,
            QueryParametersDict
        ],
        server_index: typing.Optional[int] = None,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, float, typing.Tuple]] = None,
        skip_deserialization: bool = False
    ):
        """
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        query_params = QueryParameters.validate(query_params)
        used_path = self._get_used_path(
            path,
            query_parameters=query_parameter_classes,
            query_params=query_params
        )
        # TODO add cookie handling
        host = self.api_client.configuration.get_server_url(
            'servers', server_index
        )

        raw_response = self.api_client.call_api(
            resource_path=used_path,
            method='put',
            host=host,
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
                    ],
                    status
                )
                response = _status_code_to_response[status].deserialize(
                    raw_response, self.api_client.schema_configuration)
            else:
                response = api_response.ApiResponseWithoutDeserialization(response=raw_response)

        self._verify_response_status(response)

        return response


class CaseSensitiveParams(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId.snakeCase fn names
    case_sensitive_params = BaseApi._case_sensitive_params


class ApiForPut(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names
    put = BaseApi._case_sensitive_params

# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

AdditionalProperties: typing_extensions.TypeAlias = schemas.NotAnyTypeSchema

from petstore_api.paths.fake_case_sensitive_params.put.parameters.parameter_0 import schema
from petstore_api.paths.fake_case_sensitive_params.put.parameters.parameter_1 import schema as schema_3
from petstore_api.paths.fake_case_sensitive_params.put.parameters.parameter_2 import schema as schema_2
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "someVar": typing.Type[schema.Schema],
        "some_var": typing.Type[schema_2.Schema],
        "SomeVar": typing.Type[schema_3.Schema],
    }
)


class QueryParametersDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):

    __required_keys__: typing.FrozenSet[str] = frozenset({
        "SomeVar",
        "someVar",
        "some_var",
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
    })
    
    @property
    def SomeVar(self) -> str:
        return typing.cast(
            str,
            self.__getitem__("SomeVar")
        )
    
    @property
    def someVar(self) -> str:
        return typing.cast(
            str,
            self.__getitem__("someVar")
        )
    
    @property
    def some_var(self) -> str:
        return typing.cast(
            str,
            self.__getitem__("some_var")
        )

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
    schemas.Schema[QueryParametersDict, tuple]
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
        return super().validate_base(
            arg,
            configuration=configuration,
        )

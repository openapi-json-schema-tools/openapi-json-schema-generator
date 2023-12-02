# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \\\" \\\\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

AdditionalProperties: typing_extensions.TypeAlias = schemas.NotAnyTypeSchema

from petstore_api.components.schema import string_with_validation
from petstore_api.paths.fake_test_query_paramters.put.parameters.parameter_0 import schema as schema_4
from petstore_api.paths.fake_test_query_paramters.put.parameters.parameter_1 import schema
from petstore_api.paths.fake_test_query_paramters.put.parameters.parameter_2 import schema as schema_3
from petstore_api.paths.fake_test_query_paramters.put.parameters.parameter_3 import schema as schema_5
from petstore_api.paths.fake_test_query_paramters.put.parameters.parameter_4 import schema as schema_2
Properties = typing.TypedDict(
    'Properties',
    {
        "refParam": typing.Type[string_with_validation.StringWithValidation],
        "ioutil": typing.Type[schema.Schema],
        "context": typing.Type[schema_2.Schema],
        "http": typing.Type[schema_3.Schema],
        "pipe": typing.Type[schema_4.Schema],
        "url": typing.Type[schema_5.Schema],
    }
)


class QueryParametersDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):

    __required_keys__: typing.FrozenSet[str] = frozenset({
        "context",
        "http",
        "ioutil",
        "pipe",
        "refParam",
        "url",
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
    })
    
    def __new__(
        cls,
        *,
        context: typing.Union[
            schema_2.SchemaTupleInput,
            schema_2.SchemaTuple
        ],
        http: typing.Union[
            schema_3.SchemaTupleInput,
            schema_3.SchemaTuple
        ],
        ioutil: typing.Union[
            schema.SchemaTupleInput,
            schema.SchemaTuple
        ],
        pipe: typing.Union[
            schema_4.SchemaTupleInput,
            schema_4.SchemaTuple
        ],
        refParam: str,
        url: typing.Union[
            schema_5.SchemaTupleInput,
            schema_5.SchemaTuple
        ],
        configuration_: typing.Optional[schema_configuration.SchemaConfiguration] = None,
    ):
        arg_: typing.Dict[str, typing.Any] = {
            "context": context,
            "http": http,
            "ioutil": ioutil,
            "pipe": pipe,
            "refParam": refParam,
            "url": url,
        }
        used_arg_ = typing.cast(QueryParametersDictInput, arg_)
        return QueryParameters.validate(used_arg_, configuration=configuration_)
    
    @staticmethod
    def from_dict_(
        arg: typing.Union[
            QueryParametersDictInput,
            QueryParametersDict
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> QueryParametersDict:
        return QueryParameters.validate(arg, configuration=configuration)
    
    @property
    def context(self) -> schema_2.SchemaTuple:
        return typing.cast(
            schema_2.SchemaTuple,
            self.__getitem__("context")
        )
    
    @property
    def http(self) -> schema_3.SchemaTuple:
        return typing.cast(
            schema_3.SchemaTuple,
            self.__getitem__("http")
        )
    
    @property
    def ioutil(self) -> schema.SchemaTuple:
        return typing.cast(
            schema.SchemaTuple,
            self.__getitem__("ioutil")
        )
    
    @property
    def pipe(self) -> schema_4.SchemaTuple:
        return typing.cast(
            schema_4.SchemaTuple,
            self.__getitem__("pipe")
        )
    
    @property
    def refParam(self) -> str:
        return typing.cast(
            str,
            self.__getitem__("refParam")
        )
    
    @property
    def url(self) -> schema_5.SchemaTuple:
        return typing.cast(
            schema_5.SchemaTuple,
            self.__getitem__("url")
        )
QueryParametersDictInput = typing.TypedDict(
    'QueryParametersDictInput',
    {
        "context": typing.Union[
            schema_2.SchemaTupleInput,
            schema_2.SchemaTuple
        ],
        "http": typing.Union[
            schema_3.SchemaTupleInput,
            schema_3.SchemaTuple
        ],
        "ioutil": typing.Union[
            schema.SchemaTupleInput,
            schema.SchemaTuple
        ],
        "pipe": typing.Union[
            schema_4.SchemaTupleInput,
            schema_4.SchemaTuple
        ],
        "refParam": str,
        "url": typing.Union[
            schema_5.SchemaTupleInput,
            schema_5.SchemaTuple
        ],
    }
)


@dataclasses.dataclass(frozen=True)
class QueryParameters(
    schemas.Schema[QueryParametersDict, tuple]
):
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    required: typing.FrozenSet[str] = frozenset({
        "context",
        "http",
        "ioutil",
        "pipe",
        "refParam",
        "url",
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


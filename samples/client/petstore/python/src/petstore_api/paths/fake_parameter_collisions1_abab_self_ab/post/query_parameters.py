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

from petstore_api.paths.fake_parameter_collisions1_abab_self_ab.post.parameters.parameter_0 import schema as parameter_0_schema
from petstore_api.paths.fake_parameter_collisions1_abab_self_ab.post.parameters.parameter_1 import schema as parameter_1_schema
from petstore_api.paths.fake_parameter_collisions1_abab_self_ab.post.parameters.parameter_2 import schema as parameter_2_schema
from petstore_api.paths.fake_parameter_collisions1_abab_self_ab.post.parameters.parameter_3 import schema as parameter_3_schema
from petstore_api.paths.fake_parameter_collisions1_abab_self_ab.post.parameters.parameter_4 import schema as parameter_4_schema
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "1": typing.Type[parameter_0_schema.Schema],
        "aB": typing.Type[parameter_1_schema.Schema],
        "Ab": typing.Type[parameter_2_schema.Schema],
        "A-B": typing.Type[parameter_4_schema.Schema],
        "self": typing.Type[parameter_3_schema.Schema],
    }
)


class QueryParametersDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):

    __required_keys__: typing.FrozenSet[str] = frozenset({
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
        "1",
        "aB",
        "Ab",
        "A-B",
        "self",
    })
    
    @property
    def aB(self) -> typing.Union[str, schemas.Unset]:
        val = self.get("aB", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            str,
            val
        )
    
    @property
    def Ab(self) -> typing.Union[str, schemas.Unset]:
        val = self.get("Ab", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            str,
            val
        )

    def __new__(cls, arg: QueryParametersDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return QueryParameters.validate(arg, configuration=configuration)
QueryParametersDictInput = typing_extensions.TypedDict(
    'QueryParametersDictInput',
    {
        "1": str,
        "aB": str,
        "Ab": str,
        "A-B": str,
        "self": str,
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


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

from petstore_api.components.schema import foo
Properties = typing.TypedDict(
    'Properties',
    {
        "mapBean": typing.Type[foo.Foo],
    }
)


class QueryParametersDict(schemas.immutabledict[str, foo.FooDict]):

    __required_keys__: typing.FrozenSet[str] = frozenset({
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
        "mapBean",
    })
    
    def __new__(
        cls,
        *,
        mapBean: typing.Union[
            foo.FooDictInput,
            foo.FooDict,
            schemas.Unset
        ] = schemas.unset,
        configuration_: typing.Optional[schema_configuration.SchemaConfiguration] = None,
    ):
        arg_: typing.Dict[str, typing.Any] = {}
        for key_, val in (
            ("mapBean", mapBean),
        ):
            if isinstance(val, schemas.Unset):
                continue
            arg_[key_] = val
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
    def mapBean(self) -> typing.Union[foo.FooDict, schemas.Unset]:
        val = self.get("mapBean", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return val
QueryParametersDictInput = typing.TypedDict(
    'QueryParametersDictInput',
    {
        "mapBean": typing.Union[
            foo.FooDictInput,
            foo.FooDict,
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


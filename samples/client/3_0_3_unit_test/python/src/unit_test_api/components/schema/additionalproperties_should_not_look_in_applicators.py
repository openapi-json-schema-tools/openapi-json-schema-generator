# coding: utf-8

"""
    openapi 3.0.3 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft6  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from unit_test_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

AdditionalProperties: typing_extensions.TypeAlias = schemas.BoolSchema
Foo: typing_extensions.TypeAlias = schemas.AnyTypeSchema
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "foo": typing.Type[Foo],
    }
)


class _0Dict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):

    __required_keys__: typing.FrozenSet[str] = frozenset({
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
        "foo",
    })
    
    @property
    def foo(self) -> typing.Union[schemas.OUTPUT_BASE_TYPES, schemas.Unset]:
        val = self.get("foo", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            schemas.OUTPUT_BASE_TYPES,
            val
        )
    
    def get_additional_property_(self, name: str) -> typing.Union[schemas.OUTPUT_BASE_TYPES, schemas.Unset]:
        schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
        return self.get(name, schemas.unset)

    def __new__(cls, arg: _0DictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return _0.validate(arg, configuration=configuration)
_0DictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL]


@dataclasses.dataclass(frozen=True)
class _0(
    schemas.AnyTypeSchema[_0Dict, typing.Tuple[schemas.OUTPUT_BASE_TYPES, ...]],
):
    # any type
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: _0Dict,
        }
    )

AllOf = typing.Tuple[
    typing.Type[_0],
]


class AdditionalpropertiesShouldNotLookInApplicatorsDict(schemas.immutabledict[str, bool]):

    __required_keys__: typing.FrozenSet[str] = frozenset({
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
    })
    
    def get_additional_property_(self, name: str) -> typing.Union[bool, schemas.Unset]:
        schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
        val = self.get(name, schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            bool,
            val
        )

    def __new__(cls, arg: AdditionalpropertiesShouldNotLookInApplicatorsDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return AdditionalpropertiesShouldNotLookInApplicators.validate(arg, configuration=configuration)
AdditionalpropertiesShouldNotLookInApplicatorsDictInput = typing.Mapping[
    str,
    bool,
]


@dataclasses.dataclass(frozen=True)
class AdditionalpropertiesShouldNotLookInApplicators(
    schemas.AnyTypeSchema[AdditionalpropertiesShouldNotLookInApplicatorsDict, typing.Tuple[schemas.OUTPUT_BASE_TYPES, ...]],
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    # any type
    additional_properties: typing.Type[AdditionalProperties] = dataclasses.field(default_factory=lambda: AdditionalProperties) # type: ignore
    all_of: AllOf = dataclasses.field(default_factory=lambda: schemas.tuple_to_instance(AllOf)) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: AdditionalpropertiesShouldNotLookInApplicatorsDict,
        }
    )

# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *

SpecialPropertyName: typing_extensions.TypeAlias = schemas.Int64Schema
_123List: typing_extensions.TypeAlias = schemas.StrSchema
_123Number: typing_extensions.TypeAlias = schemas.IntSchema
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "$special[property.name]": typing.Type[SpecialPropertyName],
        "123-list": typing.Type[_123List],
        "123Number": typing.Type[_123Number],
    }
)


class ObjectWithDifficultlyNamedPropsDict(immutabledict.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["123-list"]) -> str:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["$special[property.name]"]) -> int:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["123Number"]) -> int:
        ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.OUTPUT_BASE_TYPES: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["123-list"],
            typing_extensions.Literal["$special[property.name]"],
            typing_extensions.Literal["123Number"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)
ObjectWithDifficultlyNamedPropsDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL_INCL_SCHEMA]


@dataclasses.dataclass(frozen=True)
class ObjectWithDifficultlyNamedProps(
    schemas.DictSchema[ObjectWithDifficultlyNamedPropsDict]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.

    model with properties that have invalid names for python
    """
    types: typing.FrozenSet[typing.Type] = frozenset({immutabledict.immutabledict})
    required: typing.FrozenSet[str] = frozenset({
        "123-list",
    })
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            immutabledict.immutabledict: ObjectWithDifficultlyNamedPropsDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: ObjectWithDifficultlyNamedPropsDictInput,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ObjectWithDifficultlyNamedPropsDict:
        return super().validate(
            arg,
            configuration=configuration,
        )


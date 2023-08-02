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
A: typing_extensions.TypeAlias = schemas.StrSchema
B: typing_extensions.TypeAlias = schemas.NumberSchema
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "a": typing.Type[A],
        "b": typing.Type[B],
    }
)


class ObjectWithOnlyOptionalPropsDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):

    __required_keys__: typing.FrozenSet[str] = frozenset({
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
        "a",
        "b",
    })
    
    @property
    def a(self) -> typing.Union[str, schemas.Unset]:
        val = self.get("a", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            str,
            val
        )
    
    @property
    def b(self) -> typing.Union[int, float, schemas.Unset]:
        val = self.get("b", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            typing.Union[int, float],
            val
        )

    @staticmethod
    def from_dict_(
        arg: ObjectWithOnlyOptionalPropsDictInput,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ObjectWithOnlyOptionalPropsDict:
        return ObjectWithOnlyOptionalProps.validate(arg, configuration=configuration)
    
    def __new__(
        cls,
        a: typing.Union[
            str,
            schemas.Unset
        ] = schemas.unset,
        b: typing.Union[
            int,
            float,
            schemas.Unset
        ] = schemas.unset,
        configuration_: typing.Optional[schema_configuration.SchemaConfiguration] = None,
    ):
        arg_ = {}
        for key, val in (
            ("a", a),
            ("b", b),
        ):
            if isinstance(val, schemas.Unset):
                continue
            arg_[key] = val
        return ObjectWithOnlyOptionalProps.validate(arg_, configuration=configuration_)
ObjectWithOnlyOptionalPropsDictInput = typing_extensions.TypedDict(
    'ObjectWithOnlyOptionalPropsDictInput',
    {
        "a": str,
        "b": typing.Union[
            float,
            int
        ],
    },
    total=False
)


@dataclasses.dataclass(frozen=True)
class ObjectWithOnlyOptionalProps(
    schemas.Schema[ObjectWithOnlyOptionalPropsDict, tuple]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    additional_properties: typing.Type[AdditionalProperties] = dataclasses.field(default_factory=lambda: AdditionalProperties) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: ObjectWithOnlyOptionalPropsDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            ObjectWithOnlyOptionalPropsDictInput,
            ObjectWithOnlyOptionalPropsDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ObjectWithOnlyOptionalPropsDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )


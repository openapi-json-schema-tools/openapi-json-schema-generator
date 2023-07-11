# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *


from petstore_api.components.schema import enum_class


class AdditionalPropertiesTuple(typing.Tuple[schemas.OUTPUT_BASE_TYPES]):
    def __getitem__(self, name: int) -> typing_extensions.Literal["_abc", "-efg", "(xyz)", "COUNT_1M", "COUNT_50M"]:
        return super().__getitem__(name)

    def __new__(cls, arg: AdditionalPropertiesTupleInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return AdditionalProperties.validate(arg, configuration=configuration)
AdditionalPropertiesTupleInput = typing.Sequence[
    str,
]


@dataclasses.dataclass(frozen=True)
class AdditionalProperties(
    schemas.ListSchema[AdditionalPropertiesTuple]
):
    types: typing.FrozenSet[typing.Type] = frozenset({tuple})
    items: typing.Type[enum_class.EnumClass] = dataclasses.field(default_factory=lambda: enum_class.EnumClass) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            tuple: AdditionalPropertiesTuple
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            AdditionalPropertiesTupleInput,
            AdditionalPropertiesTuple,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> AdditionalPropertiesTuple:
        return super().validate_base(
            arg,
            configuration=configuration,
        )


class AdditionalPropertiesWithArrayOfEnumsDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    def __getitem__(self, name: str) -> AdditionalPropertiesTuple:
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(cls, arg: AdditionalPropertiesWithArrayOfEnumsDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return AdditionalPropertiesWithArrayOfEnums.validate(arg, configuration=configuration)
AdditionalPropertiesWithArrayOfEnumsDictInput = typing.Mapping[
    str,
    typing.Union[
        AdditionalPropertiesTuple,
        list,
        tuple
    ],
]


@dataclasses.dataclass(frozen=True)
class AdditionalPropertiesWithArrayOfEnums(
    schemas.Schema[AdditionalPropertiesWithArrayOfEnumsDict, tuple]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    additional_properties: typing.Type[AdditionalProperties] = dataclasses.field(default_factory=lambda: AdditionalProperties) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: AdditionalPropertiesWithArrayOfEnumsDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            AdditionalPropertiesWithArrayOfEnumsDictInput,
            AdditionalPropertiesWithArrayOfEnumsDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> AdditionalPropertiesWithArrayOfEnumsDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )


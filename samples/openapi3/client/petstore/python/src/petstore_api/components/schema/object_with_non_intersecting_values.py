# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *

AdditionalProperties: typing_extensions.TypeAlias = schemas.StrSchema
A: typing_extensions.TypeAlias = schemas.NumberSchema
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "a": typing.Type[A],
    }
)


class ObjectWithNonIntersectingValuesDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    def get_property(self, name: typing_extensions.Literal["a"]) -> typing.Union[int, float]:
        return self.__getitem__(name)
    
    def get_additional_property(self, name: str) -> str:
        return typing.cast(
            str,
            self.__getitem__(name)
        )

    def __new__(cls, arg: ObjectWithNonIntersectingValuesDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return ObjectWithNonIntersectingValues.validate(arg, configuration=configuration)
ObjectWithNonIntersectingValuesDictInput = typing.Mapping[
    str,
    typing.Union[
        typing.Union[
            float,
            int
        ],
        str,
    ]
]


@dataclasses.dataclass(frozen=True)
class ObjectWithNonIntersectingValues(
    schemas.Schema[ObjectWithNonIntersectingValuesDict, tuple]
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
            schemas.immutabledict: ObjectWithNonIntersectingValuesDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            ObjectWithNonIntersectingValuesDictInput,
            ObjectWithNonIntersectingValuesDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ObjectWithNonIntersectingValuesDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )


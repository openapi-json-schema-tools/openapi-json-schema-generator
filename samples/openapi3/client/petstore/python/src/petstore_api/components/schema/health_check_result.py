# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *



@dataclasses.dataclass(frozen=True)
class NullableMessage(
    schemas.Schema[schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES], typing.Tuple[schemas.OUTPUT_BASE_TYPES, ...]],
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        type(None),
        str,
    })

    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: None,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> None: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: str,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> str: ...
    @classmethod
    def validate(
        cls,
        arg,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ):
        return super().validate_base(
            arg,
            configuration=configuration,
        )

Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "NullableMessage": typing.Type[NullableMessage],
    }
)


class HealthCheckResultDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    def get_property(self, name: typing_extensions.Literal["NullableMessage"]) -> typing.Union[
        None,
        str,
    ]:
        return self.__getitem__(name)
    
    def get_additional_property(self, name: str) -> schemas.OUTPUT_BASE_TYPES:
        return self.__getitem__(name)

    def __new__(cls, arg: HealthCheckResultDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return HealthCheckResult.validate(arg, configuration=configuration)
HealthCheckResultDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL_INCL_SCHEMA]


@dataclasses.dataclass(frozen=True)
class HealthCheckResult(
    schemas.Schema[HealthCheckResultDict, tuple]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.

    Just a string to inform instance is up and running. Make it nullable in hope to get it as pointer in generated model.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: HealthCheckResultDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            HealthCheckResultDictInput,
            HealthCheckResultDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> HealthCheckResultDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )


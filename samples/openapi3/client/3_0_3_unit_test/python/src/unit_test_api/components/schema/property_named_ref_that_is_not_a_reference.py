# coding: utf-8

"""
    openapi 3.0.3 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft6  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from unit_test_api.shared_imports.schema_imports import *

Ref: typing_extensions.TypeAlias = schemas.StrSchema
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "$ref": typing.Type[Ref],
    }
)


class PropertyNamedRefThatIsNotAReferenceDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["$ref"]) -> str:
        ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.OUTPUT_BASE_TYPES: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["$ref"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(cls, arg: PropertyNamedRefThatIsNotAReferenceDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return PropertyNamedRefThatIsNotAReference.validate(arg, configuration=configuration)
PropertyNamedRefThatIsNotAReferenceDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL_INCL_SCHEMA]


@dataclasses.dataclass(frozen=True)
class PropertyNamedRefThatIsNotAReference(
    schemas.AnyTypeSchema[PropertyNamedRefThatIsNotAReferenceDict, typing.Tuple[schemas.OUTPUT_BASE_TYPES, ...]],
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    # any type
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: PropertyNamedRefThatIsNotAReferenceDict,
        }
    )


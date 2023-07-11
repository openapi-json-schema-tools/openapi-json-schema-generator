# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *

Data: typing_extensions.TypeAlias = schemas.StrSchema
Id: typing_extensions.TypeAlias = schemas.IntSchema
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "data": typing.Type[Data],
        "id": typing.Type[Id],
    }
)


class FromSchemaDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["data"]) -> str:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> int:
        ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.OUTPUT_BASE_TYPES: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["data"],
            typing_extensions.Literal["id"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(cls, arg: FromSchemaDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return FromSchema.validate(arg, configuration=configuration)
FromSchemaDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL_INCL_SCHEMA]


@dataclasses.dataclass(frozen=True)
class FromSchema(
    schemas.DictSchema[FromSchemaDict]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: FromSchemaDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            FromSchemaDictInput,
            FromSchemaDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> FromSchemaDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )


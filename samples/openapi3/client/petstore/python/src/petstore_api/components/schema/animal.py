# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *

ClassName: typing_extensions.TypeAlias = schemas.StrSchema


@dataclasses.dataclass(frozen=True)
class Color(
    schemas.StrSchema
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        str,
    })
    default: str = "red"
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "className": typing.Type[ClassName],
        "color": typing.Type[Color],
    }
)


class AnimalDict(immutabledict.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    @property
    def className(self) -> str:
        return self.__getitem__("className")
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["className"]) -> str:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["color"]) -> str:
        ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.OUTPUT_BASE_TYPES: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["className"],
            typing_extensions.Literal["color"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)
AnimalDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL_INCL_SCHEMA]


@dataclasses.dataclass(frozen=True)
class Animal(
    schemas.DictSchema[AnimalDict]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({immutabledict.immutabledict})
    required: typing.FrozenSet[str] = frozenset({
        "className",
    })
    discriminator: typing.Mapping[str, typing.Mapping[str, typing.Type[schemas.Schema]]] = dataclasses.field(
        default_factory=lambda: {
            'className': {
                'Cat': cat.Cat,
                'Dog': dog.Dog,
            }
        }
    )
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            immutabledict.immutabledict: AnimalDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: AnimalDictInput,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> AnimalDict:
        return super().validate(
            arg,
            configuration=configuration,
        )


from petstore_api.components.schema import cat
from petstore_api.components.schema import dog

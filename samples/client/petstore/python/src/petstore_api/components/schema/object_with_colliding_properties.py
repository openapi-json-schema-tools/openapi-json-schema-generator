# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

SomeProp: typing_extensions.TypeAlias = schemas.DictSchema
Someprop2: typing_extensions.TypeAlias = schemas.DictSchema
Properties = typing.TypedDict(
    'Properties',
    {
        "someProp": typing.Type[SomeProp],
        "someprop": typing.Type[Someprop2],
    }
)


class ObjectWithCollidingPropertiesDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):

    __required_keys__: typing.FrozenSet[str] = frozenset({
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
        "someProp",
        "someprop",
    })
    
    def __new__(
        cls,
        *,
        someProp: typing.Union[
            typing.Mapping[str, schemas.INPUT_TYPES_ALL],
            schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES],
            schemas.Unset
        ] = schemas.unset,
        someprop: typing.Union[
            typing.Mapping[str, schemas.INPUT_TYPES_ALL],
            schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES],
            schemas.Unset
        ] = schemas.unset,
        configuration_: typing.Optional[schema_configuration.SchemaConfiguration] = None,
        **kwargs: schemas.INPUT_TYPES_ALL,
    ):
        arg_: typing.Dict[str, typing.Any] = {}
        for key_, val in (
            ("someProp", someProp),
            ("someprop", someprop),
        ):
            if isinstance(val, schemas.Unset):
                continue
            arg_[key_] = val
        arg_.update(kwargs)
        used_arg_ = typing.cast(ObjectWithCollidingPropertiesDictInput, arg_)
        return ObjectWithCollidingProperties.validate(used_arg_, configuration=configuration_)
    
    @staticmethod
    def from_dict_(
        arg: typing.Union[
            ObjectWithCollidingPropertiesDictInput,
            ObjectWithCollidingPropertiesDict
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ObjectWithCollidingPropertiesDict:
        return ObjectWithCollidingProperties.validate(arg, configuration=configuration)
    
    @property
    def someProp(self) -> typing.Union[schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES], schemas.Unset]:
        val = self.get("someProp", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES],
            val
        )
    
    @property
    def someprop(self) -> typing.Union[schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES], schemas.Unset]:
        val = self.get("someprop", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES],
            val
        )
    
    def get_additional_property_(self, name: str) -> typing.Union[schemas.OUTPUT_BASE_TYPES, schemas.Unset]:
        schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
        return self.get(name, schemas.unset)
ObjectWithCollidingPropertiesDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL]


@dataclasses.dataclass(frozen=True)
class ObjectWithCollidingProperties(
    schemas.Schema[ObjectWithCollidingPropertiesDict, tuple]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.

    component with properties that have name collisions
    """
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: ObjectWithCollidingPropertiesDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            ObjectWithCollidingPropertiesDictInput,
            ObjectWithCollidingPropertiesDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ObjectWithCollidingPropertiesDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )


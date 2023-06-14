# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *

Arg: typing_extensions.TypeAlias = schemas.StrSchema
Args: typing_extensions.TypeAlias = schemas.StrSchema
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "arg": typing.Type[Arg],
        "args": typing.Type[Args],
    }
)


class ObjectModelWithArgAndArgsPropertiesDict(immutabledict.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    @property
    def arg(self) -> str:
        return self.__getitem__("arg")
    
    @property
    def args(self) -> str:
        return self.__getitem__("args")
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["arg"]) -> str:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["args"]) -> str:
        ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.OUTPUT_BASE_TYPES: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["arg"],
            typing_extensions.Literal["args"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)
ObjectModelWithArgAndArgsPropertiesDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL_INCL_SCHEMA]


@dataclasses.dataclass(frozen=True)
class ObjectModelWithArgAndArgsProperties(
    schemas.DictSchema[ObjectModelWithArgAndArgsPropertiesDict]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({immutabledict.immutabledict})
    required: typing.FrozenSet[str] = frozenset({
        "arg",
        "args",
    })
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            immutabledict.immutabledict: ObjectModelWithArgAndArgsPropertiesDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: ObjectModelWithArgAndArgsPropertiesDictInput,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ObjectModelWithArgAndArgsPropertiesDict:
        return super().validate(
            arg,
            configuration=configuration,
        )


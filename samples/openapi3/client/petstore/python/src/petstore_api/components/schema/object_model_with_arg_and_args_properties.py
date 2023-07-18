# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

Arg: typing_extensions.TypeAlias = schemas.StrSchema
Args: typing_extensions.TypeAlias = schemas.StrSchema
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "arg": typing.Type[Arg],
        "args": typing.Type[Args],
    }
)


class ObjectModelWithArgAndArgsPropertiesDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    __required_keys__: typing.FrozenSet[str] = frozenset({
        "arg",
        "args",
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
    })
    
    @property
    def get_arg(self) -> str:
        return typing.cast(
            str,
            self.__getitem__("arg")
        )
    
    @property
    def get_args(self) -> str:
        return typing.cast(
            str,
            self.__getitem__("args")
        )
    
    def get_additional_property_(self, name: str) -> typing.Union[schemas.OUTPUT_BASE_TYPES, schemas.Unset]:
        schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
        return self.get(name, schemas.unset)

    def __new__(cls, arg: ObjectModelWithArgAndArgsPropertiesDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return ObjectModelWithArgAndArgsProperties.validate(arg, configuration=configuration)
ObjectModelWithArgAndArgsPropertiesDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL]


@dataclasses.dataclass(frozen=True)
class ObjectModelWithArgAndArgsProperties(
    schemas.Schema[ObjectModelWithArgAndArgsPropertiesDict, tuple]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
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
            schemas.immutabledict: ObjectModelWithArgAndArgsPropertiesDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            ObjectModelWithArgAndArgsPropertiesDictInput,
            ObjectModelWithArgAndArgsPropertiesDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ObjectModelWithArgAndArgsPropertiesDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )


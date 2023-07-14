# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

LengthCm: typing_extensions.TypeAlias = schemas.NumberSchema
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "lengthCm": typing.Type[LengthCm],
    }
)


class BananaDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    __required_keys__ = frozenset({
        "lengthCm",
    })
    __optional_keys__ = frozenset({
    })
    
    def get_property(self, name: typing_extensions.Literal["lengthCm"]) -> typing.Union[int, float]:
        schemas.raise_if_key_unknown(name, self.__required_keys__, self.__optional_keys__)
        return typing.cast(
            typing.Union[int, float],
            self.__getitem__(name)
        )
    
    def get_additional_property(self, name: str) -> schemas.OUTPUT_BASE_TYPES:
        schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
        return self.__getitem__(name)

    def __new__(cls, arg: BananaDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return Banana.validate(arg, configuration=configuration)
BananaDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL]


@dataclasses.dataclass(frozen=True)
class Banana(
    schemas.Schema[BananaDict, tuple]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    required: typing.FrozenSet[str] = frozenset({
        "lengthCm",
    })
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: BananaDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            BananaDictInput,
            BananaDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> BananaDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )


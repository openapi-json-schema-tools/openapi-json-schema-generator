# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *

AdditionalProperties: typing_extensions.TypeAlias = schemas.NotAnyTypeSchema
Cultivar: typing_extensions.TypeAlias = schemas.StrSchema
Mealy: typing_extensions.TypeAlias = schemas.BoolSchema
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "cultivar": typing.Type[Cultivar],
        "mealy": typing.Type[Mealy],
    }
)
AppleReqRequiredDictInput = typing_extensions.TypedDict(
    'AppleReqRequiredDictInput',
    {
        "cultivar": str,
    }
)
AppleReqOptionalDictInput = typing_extensions.TypedDict(
    'AppleReqOptionalDictInput',
    {
        "mealy": bool,
    },
    total=False
)


class AppleReqDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    @property
    def cultivar(self) -> str:
        return self.__getitem__("cultivar")
    
    @property
    def mealy(self) -> bool:
        return self.__getitem__("mealy")
    
    def get_property(self, name):
        return self.__getitem__(name)

    def __new__(cls, arg: AppleReqDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return AppleReq.validate(arg, configuration=configuration)


class AppleReqDictInput(AppleReqRequiredDictInput, AppleReqOptionalDictInput):
    pass


@dataclasses.dataclass(frozen=True)
class AppleReq(
    schemas.Schema[AppleReqDict, tuple]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    required: typing.FrozenSet[str] = frozenset({
        "cultivar",
    })
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    additional_properties: typing.Type[AdditionalProperties] = dataclasses.field(default_factory=lambda: AdditionalProperties) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: AppleReqDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            AppleReqDictInput,
            AppleReqDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> AppleReqDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )


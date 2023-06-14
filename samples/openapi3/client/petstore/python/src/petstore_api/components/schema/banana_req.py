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
LengthCm: typing_extensions.TypeAlias = schemas.NumberSchema
Sweet: typing_extensions.TypeAlias = schemas.BoolSchema
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "lengthCm": typing.Type[LengthCm],
        "sweet": typing.Type[Sweet],
    }
)
BananaReqRequiredDictInput = typing_extensions.TypedDict(
    'BananaReqRequiredDictInput',
    {
        "lengthCm": typing.Union[
            float,
            int
        ],
    }
)
BananaReqOptionalDictInput = typing_extensions.TypedDict(
    'BananaReqOptionalDictInput',
    {
        "sweet": bool,
    },
    total=False
)


class BananaReqDict(immutabledict.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    @property
    def lengthCm(self) -> typing.Union[float, int]:
        return self.__getitem__("lengthCm")
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["lengthCm"]) -> typing.Union[float, int]:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["sweet"]) -> bool:
        ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["lengthCm"],
            typing_extensions.Literal["sweet"],
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)


class BananaReqDictInput(BananaReqRequiredDictInput, BananaReqOptionalDictInput):
    pass


@dataclasses.dataclass(frozen=True)
class BananaReq(
    schemas.DictSchema[BananaReqDict]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({immutabledict.immutabledict})
    required: typing.FrozenSet[str] = frozenset({
        "lengthCm",
    })
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    additional_properties: typing.Type[AdditionalProperties] = dataclasses.field(default_factory=lambda: AdditionalProperties) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            immutabledict.immutabledict: BananaReqDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: BananaReqDictInput,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> BananaReqDict:
        return super().validate(
            arg,
            configuration=configuration,
        )


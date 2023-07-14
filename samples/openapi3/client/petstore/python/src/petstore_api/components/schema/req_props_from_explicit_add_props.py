# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

AdditionalProperties: typing_extensions.TypeAlias = schemas.StrSchema


class ReqPropsFromExplicitAddPropsDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    @typing.overload
    def get_property(self, name: typing_extensions.Literal["invalid-name"]) -> str:
        ...
    
    @typing.overload
    def get_property(self, name: typing_extensions.Literal["validName"]) -> str:
        ...
    
    def get_property(self, name):
        return self.__getitem__(name)
    
    def get_additional_property(self, name: str) -> str:
        return typing.cast(
            str,
            self.__getitem__(name)
        )

    def __new__(cls, arg: ReqPropsFromExplicitAddPropsDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return ReqPropsFromExplicitAddProps.validate(arg, configuration=configuration)
ReqPropsFromExplicitAddPropsDictInput = typing.Mapping[
    str,
    typing.Union[
        str,
        str,
        str,
    ]
]


@dataclasses.dataclass(frozen=True)
class ReqPropsFromExplicitAddProps(
    schemas.Schema[ReqPropsFromExplicitAddPropsDict, tuple]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    required: typing.FrozenSet[str] = frozenset({
        "invalid-name",
        "validName",
    })
    additional_properties: typing.Type[AdditionalProperties] = dataclasses.field(default_factory=lambda: AdditionalProperties) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: ReqPropsFromExplicitAddPropsDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            ReqPropsFromExplicitAddPropsDictInput,
            ReqPropsFromExplicitAddPropsDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ReqPropsFromExplicitAddPropsDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )


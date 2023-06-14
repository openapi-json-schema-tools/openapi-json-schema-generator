# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *

Return2: typing_extensions.TypeAlias = schemas.Int32Schema
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "return": typing.Type[Return2],
    }
)


class ReturnDict(immutabledict.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["return"]) -> int:
        ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.OUTPUT_BASE_TYPES: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["return"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)
ReturnDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL_INCL_SCHEMA]


@dataclasses.dataclass(frozen=True)
class _Return(
    schemas.AnyTypeSchema[ReturnDict, typing.Tuple[schemas.OUTPUT_BASE_TYPES, ...]],
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.

    Model for testing reserved words
    """
    # any type
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            immutabledict.immutabledict: ReturnDict,
        }
    )


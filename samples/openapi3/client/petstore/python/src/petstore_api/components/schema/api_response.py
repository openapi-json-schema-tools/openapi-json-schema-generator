# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

Code: typing_extensions.TypeAlias = schemas.Int32Schema
Type: typing_extensions.TypeAlias = schemas.StrSchema
Message: typing_extensions.TypeAlias = schemas.StrSchema
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "code": typing.Type[Code],
        "type": typing.Type[Type],
        "message": typing.Type[Message],
    }
)


class ApiResponseDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    @typing.overload
    def get_property(self, name: typing_extensions.Literal["code"]) -> int:
        ...
    
    @typing.overload
    def get_property(self, name: typing_extensions.Literal["type"]) -> str:
        ...
    
    @typing.overload
    def get_property(self, name: typing_extensions.Literal["message"]) -> str:
        ...
    
    def get_property(self, name):
        return self.__getitem__(name)
    
    def get_additional_property(self, name: str) -> schemas.OUTPUT_BASE_TYPES:
        return self.__getitem__(name)

    def __new__(cls, arg: ApiResponseDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return ApiResponse.validate(arg, configuration=configuration)
ApiResponseDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL_INCL_SCHEMA]


@dataclasses.dataclass(frozen=True)
class ApiResponse(
    schemas.Schema[ApiResponseDict, tuple]
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
            schemas.immutabledict: ApiResponseDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            ApiResponseDictInput,
            ApiResponseDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ApiResponseDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )


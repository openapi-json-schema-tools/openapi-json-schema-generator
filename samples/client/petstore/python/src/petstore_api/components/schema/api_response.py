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

    __required_keys__: typing.FrozenSet[str] = frozenset({
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
        "code",
        "type",
        "message",
    })
    @staticmethod
    def from_dict_(
        arg: ApiResponseDictInput,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ApiResponseDict:
        return ApiResponse.validate(arg, configuration=configuration)
    
    def __new__(
        cls,
        code: typing.Union[
            int,
            schemas.Unset
        ] = schemas.unset,
        type: typing.Union[
            str,
            schemas.Unset
        ] = schemas.unset,
        message: typing.Union[
            str,
            schemas.Unset
        ] = schemas.unset,
        configuration_: typing.Optional[schema_configuration.SchemaConfiguration] = None,
        **kwargs: schemas.INPUT_TYPES_ALL,
    ):
        arg_: typing.Dict[str, typing.Any] = {}
        for key, val in (
            ("code", code),
            ("type", type),
            ("message", message),
        ):
            if isinstance(val, schemas.Unset):
                continue
            arg_[key] = val
        arg_.update(kwargs)
        used_arg_ = typing.cast(ApiResponseDictInput, arg_)
        return ApiResponse.validate(used_arg_, configuration=configuration_)

    
    @property
    def code(self) -> typing.Union[int, schemas.Unset]:
        val = self.get("code", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            int,
            val
        )
    
    @property
    def type(self) -> typing.Union[str, schemas.Unset]:
        val = self.get("type", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            str,
            val
        )
    
    @property
    def message(self) -> typing.Union[str, schemas.Unset]:
        val = self.get("message", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            str,
            val
        )
    
    def get_additional_property_(self, name: str) -> typing.Union[schemas.OUTPUT_BASE_TYPES, schemas.Unset]:
        schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
        return self.get(name, schemas.unset)
ApiResponseDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL]


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


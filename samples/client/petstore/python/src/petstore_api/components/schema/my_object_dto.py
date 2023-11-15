# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

AdditionalProperties: typing_extensions.TypeAlias = schemas.NotAnyTypeSchema
Id: typing_extensions.TypeAlias = schemas.UUIDSchema
Properties = typing.TypedDict(
    'Properties',
    {
        "id": typing.Type[Id],
    }
)


class MyObjectDtoDict(schemas.immutabledict[str, str]):

    __required_keys__: typing.FrozenSet[str] = frozenset({
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
        "id",
    })
    
    def __new__(
        cls,
        *,
        id: typing.Union[
            str,
            uuid.UUID,
            schemas.Unset
        ] = schemas.unset,
        configuration_: typing.Optional[schema_configuration.SchemaConfiguration] = None,
    ):
        arg_: typing.Dict[str, typing.Any] = {}
        for key_, val in (
            ("id", id),
        ):
            if isinstance(val, schemas.Unset):
                continue
            arg_[key_] = val
        used_arg_ = typing.cast(MyObjectDtoDictInput, arg_)
        return MyObjectDto.validate(used_arg_, configuration=configuration_)
    
    @staticmethod
    def from_dict_(
        arg: typing.Union[
            MyObjectDtoDictInput,
            MyObjectDtoDict
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> MyObjectDtoDict:
        return MyObjectDto.validate(arg, configuration=configuration)
    
    @property
    def id(self) -> typing.Union[str, schemas.Unset]:
        val = self.get("id", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return val
MyObjectDtoDictInput = typing.TypedDict(
    'MyObjectDtoDictInput',
    {
        "id": typing.Union[
            str,
            uuid.UUID
        ],
    },
    total=False
)


@dataclasses.dataclass(frozen=True)
class MyObjectDto(
    schemas.Schema[MyObjectDtoDict, tuple]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    additional_properties: typing.Type[AdditionalProperties] = dataclasses.field(default_factory=lambda: AdditionalProperties) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: MyObjectDtoDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            MyObjectDtoDictInput,
            MyObjectDtoDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> MyObjectDtoDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )

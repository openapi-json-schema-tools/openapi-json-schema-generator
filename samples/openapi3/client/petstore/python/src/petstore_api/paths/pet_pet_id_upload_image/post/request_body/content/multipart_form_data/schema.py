# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *

AdditionalMetadata: typing_extensions.TypeAlias = schemas.StrSchema[U]
File: typing_extensions.TypeAlias = schemas.BinarySchema[U]


class Schema(
    schemas.DictSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_:
        types: typing.FrozenSet[typing.Type] = frozenset({frozendict.frozendict})
        properties: SchemaProperties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(SchemaProperties)) # type: ignore
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["additionalMetadata"]) -> AdditionalMetadata[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["file"]) -> File[typing.Union[bytes, schemas.FileIO]]: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.AnyTypeSchema[typing.Union[
        frozendict.frozendict,
        str,
        decimal.Decimal,
        schemas.BoolClass,
        schemas.NoneClass,
        tuple,
        bytes,
        schemas.FileIO
    ]]: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["additionalMetadata"],
            typing_extensions.Literal["file"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict],
        additionalMetadata: typing.Union[
            AdditionalMetadata[str],
            schemas.Unset,
            str
        ] = schemas.unset,
        file: typing.Union[
            File[typing.Union[bytes, schemas.FileIO]],
            schemas.Unset,
            bytes,
            io.FileIO,
            io.BufferedReader
        ] = schemas.unset,
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: typing.Union[
            dict,
            frozendict.frozendict,
            list,
            tuple,
            decimal.Decimal,
            float,
            int,
            str,
            datetime.date,
            datetime.datetime,
            uuid.UUID,
            bool,
            None,
            bytes,
            io.FileIO,
            io.BufferedReader,
            schemas.Schema
        ],
    ) -> Schema[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            *args_,
            additionalMetadata=additionalMetadata,
            file=file,
            configuration_=configuration_,
            **kwargs,
        )
        inst = typing.cast(
            Schema[frozendict.frozendict],
            inst
        )
        return inst

SchemaProperties = typing_extensions.TypedDict(
    'SchemaProperties',
    {
        "additionalMetadata": typing.Type[AdditionalMetadata],
        "file": typing.Type[File],
    }
)

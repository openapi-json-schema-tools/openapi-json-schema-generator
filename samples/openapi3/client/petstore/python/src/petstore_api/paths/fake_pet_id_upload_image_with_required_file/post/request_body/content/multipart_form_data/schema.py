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
RequiredFile: typing_extensions.TypeAlias = schemas.BinarySchema[U]
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "additionalMetadata": typing.Type[AdditionalMetadata],
        "requiredFile": typing.Type[RequiredFile],
    }
)
RequiredDictInput = typing_extensions.TypedDict(
    'RequiredDictInput',
    {
        "requiredFile": typing.Union[
            RequiredFile[typing.Union[bytes, schemas.FileIO]],
            bytes,
            io.FileIO,
            io.BufferedReader
        ],
    }
)
OptionalDictInput = typing_extensions.TypedDict(
    'OptionalDictInput',
    {
        "additionalMetadata": typing.Union[
            AdditionalMetadata[str],
            schemas.Unset,
            str
        ],
    },
    total=False
)


class Schema(
    schemas.DictSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({frozendict.frozendict})
        required: typing.FrozenSet[str] = frozenset({
            "requiredFile",
        })
        properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    
    @property
    def requiredFile(self) -> RequiredFile[typing.Union[bytes, schemas.FileIO]]:
        return self.__getitem__("requiredFile")
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["requiredFile"]) -> RequiredFile[typing.Union[bytes, schemas.FileIO]]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["additionalMetadata"]) -> AdditionalMetadata[str]: ...
    
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
            typing_extensions.Literal["requiredFile"],
            typing_extensions.Literal["additionalMetadata"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict],
        requiredFile: typing.Union[
            RequiredFile[typing.Union[bytes, schemas.FileIO]],
            bytes,
            io.FileIO,
            io.BufferedReader
        ],
        additionalMetadata: typing.Union[
            AdditionalMetadata[str],
            schemas.Unset,
            str
        ] = schemas.unset,
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: schemas.INPUT_TYPES_ALL_INCL_SCHEMA
    ) -> Schema[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            *args_,
            requiredFile=requiredFile,
            additionalMetadata=additionalMetadata,
            configuration_=configuration_,
            **kwargs,
        )
        inst = typing.cast(
            Schema[frozendict.frozendict],
            inst
        )
        return inst


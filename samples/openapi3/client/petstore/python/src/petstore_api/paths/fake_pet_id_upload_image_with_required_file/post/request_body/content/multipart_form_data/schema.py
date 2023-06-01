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


class Schema(
    schemas.DictSchema[schemas.T]
):


    class Schema_:
        types = {frozendict.frozendict}
        required = {
            "requiredFile",
        }
        
        @staticmethod
        def properties():
            return {
                "additionalMetadata": AdditionalMetadata,
                "requiredFile": RequiredFile,
            }
    
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

SchemaProperties = typing.TypedDict(
    'SchemaProperties',
    {
        "additionalMetadata": AdditionalMetadata,
        "requiredFile": RequiredFile,
    }
)

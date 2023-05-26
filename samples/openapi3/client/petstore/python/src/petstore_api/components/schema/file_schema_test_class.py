# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *


class FileSchemaTestClass(
    schemas.DictSchema[schemas.T]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    class Schema_:
        types = {frozendict.frozendict}
        
        class Properties:
        
            @staticmethod
            def file() -> typing.Type[file.File]:
                return file.File
            
            
            class Files(
                schemas.ListSchema[schemas.T]
            ):
            
            
                class Schema_:
                    types = {tuple}
                    
                    @staticmethod
                    def items() -> typing.Type[file.File]:
                        return file.File
            
                def __new__(
                    cls,
                    arg_: typing.Union[
                        typing.Tuple[
                            typing.Union[
                                file.File,
                                dict,
                                frozendict.frozendict
                            ], ...
                        ],
                        typing.List[
                            typing.Union[
                                file.File,
                                dict,
                                frozendict.frozendict
                            ]
                        ],
                    ],
                    configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
                ) -> FileSchemaTestClass.Schema_.Properties.Files[tuple]:
                    inst = super().__new__(
                        cls,
                        arg_,
                        configuration_=configuration_,
                    )
                    inst = typing.cast(
                        FileSchemaTestClass.Schema_.Properties.Files[tuple],
                        inst
                    )
                    return inst
            
                def __getitem__(self, name: int) -> file.File[frozendict.frozendict]:
                    return super().__getitem__(name)
            __annotations__ = {
                "file": file,
                "files": Files,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["file"]) -> file.File[frozendict.frozendict]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["files"]) -> Schema_.Properties.Files[tuple]: ...
    
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
            typing_extensions.Literal["file"],
            typing_extensions.Literal["files"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict],
        file: typing.Union[
            file.File,
            schemas.Unset,
            dict,
            frozendict.frozendict
        ] = schemas.unset,
        files: typing.Union[
            Schema_.Properties.Files,
            schemas.Unset,
            list,
            tuple
        ] = schemas.unset,
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema],
    ) -> FileSchemaTestClass[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            *args_,
            file=file,
            files=files,
            configuration_=configuration_,
            **kwargs,
        )
        inst = typing.cast(
            FileSchemaTestClass[frozendict.frozendict],
            inst
        )
        return inst

from petstore_api.components.schema import file

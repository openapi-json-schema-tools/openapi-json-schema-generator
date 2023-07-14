# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

Items: typing_extensions.TypeAlias = schemas.BinarySchema


class FilesTuple(
    typing.Tuple[
        typing.Union[bytes, schemas.FileIO],
        ...
    ]
):

    def __new__(cls, arg: FilesTupleInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return Files.validate(arg, configuration=configuration)
FilesTupleInput = typing.Union[
    typing.List[
        typing.Union[
            bytes,
            io.FileIO,
            io.BufferedReader
        ],
    ],
    typing.Tuple[
        typing.Union[
            bytes,
            io.FileIO,
            io.BufferedReader
        ],
        ...
    ]
]


@dataclasses.dataclass(frozen=True)
class Files(
    schemas.Schema[schemas.immutabledict, FilesTuple]
):
    types: typing.FrozenSet[typing.Type] = frozenset({tuple})
    items: typing.Type[Items] = dataclasses.field(default_factory=lambda: Items) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            tuple: FilesTuple
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            FilesTupleInput,
            FilesTuple,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> FilesTuple:
        return super().validate_base(
            arg,
            configuration=configuration,
        )
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "files": typing.Type[Files],
    }
)


class SchemaDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    __required_keys__ = frozenset({
    })
    __optional_keys__ = frozenset({
        "files",
    })
    
    def get_property(self, name: typing_extensions.Literal["files"]) -> FilesTuple:
        schemas.raise_if_key_unknown(name, self.__required_keys__, self.__optional_keys__)
        val = self.get(name, schemas.unset)
        if val is schemas.unset:
            return val
        return typing.cast(
            FilesTuple,
            val
        )
    
    def get_additional_property(self, name: str) -> schemas.OUTPUT_BASE_TYPES:
        schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
        return self.__getitem__(name)

    def __new__(cls, arg: SchemaDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return Schema.validate(arg, configuration=configuration)
SchemaDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL]


@dataclasses.dataclass(frozen=True)
class Schema(
    schemas.Schema[SchemaDict, tuple]
):
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: SchemaDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            SchemaDictInput,
            SchemaDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> SchemaDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )


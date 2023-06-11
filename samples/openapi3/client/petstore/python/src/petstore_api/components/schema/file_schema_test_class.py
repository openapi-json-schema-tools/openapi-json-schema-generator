# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *



class Files(
    schemas.ListSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({tuple})
        items: typing.Type[file.File] = dataclasses.field(default_factory=lambda: file.File) # type: ignore

    def __new__(
        cls,
        arg_: typing.Sequence[
            typing.Union[
                file.File[frozendict.frozendict],
                dict,
                frozendict.frozendict
            ]
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None
    ) -> Files[tuple]:
        inst = super().__new__(
            cls,
            arg_,
            configuration_=configuration_,
        )
        inst = typing.cast(
            Files[tuple],
            inst
        )
        return inst

    def __getitem__(self, name: int) -> file.File[frozendict.frozendict]:
        return super().__getitem__(name)



class FileSchemaTestClass(
    schemas.DictSchema[schemas.T]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({frozendict.frozendict})
        properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["file"]) -> file.File[frozendict.frozendict]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["files"]) -> Files[tuple]: ...
    
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
        arg_: typing.Union[
            DictInput,
            FileSchemaTestClass[frozendict.frozendict],
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None
    ) -> FileSchemaTestClass[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            arg_,
            configuration_=configuration_,
        )
        inst = typing.cast(
            FileSchemaTestClass[frozendict.frozendict],
            inst
        )
        return inst


from petstore_api.components.schema import file
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "file": typing.Type[file.File],
        "files": typing.Type[Files],
    }
)
DictInput = typing.Mapping[
    str,
    typing.Union[
        typing.Union[
            file.File[frozendict.frozendict],
            dict,
            frozendict.frozendict
        ],
        typing.Union[
            Files[tuple],
            list,
            tuple
        ],
        schemas.INPUT_TYPES_ALL_INCL_SCHEMA
    ]
]

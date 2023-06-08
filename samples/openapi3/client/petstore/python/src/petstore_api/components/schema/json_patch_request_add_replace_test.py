# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *

AdditionalProperties: typing_extensions.TypeAlias = schemas.NotAnyTypeSchema[U]
Path: typing_extensions.TypeAlias = schemas.StrSchema[U]
Value: typing_extensions.TypeAlias = schemas.AnyTypeSchema[U]


class Op(
    schemas.StrSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({
            str,
        })
        enum_value_to_name: typing.Mapping[typing.Union[int, float, str, schemas.BoolClass, schemas.NoneClass], str] = dataclasses.field(
            default_factory=lambda: {
                "add": "ADD",
                "replace": "REPLACE",
                "test": "TEST",
            }
        )
    
    @schemas.classproperty
    def ADD(cls) -> Op[str]:
        return cls("add") # type: ignore
    
    @schemas.classproperty
    def REPLACE(cls) -> Op[str]:
        return cls("replace") # type: ignore
    
    @schemas.classproperty
    def TEST(cls) -> Op[str]:
        return cls("test") # type: ignore
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "path": typing.Type[Path],
        "value": typing.Type[Value],
        "op": typing.Type[Op],
    }
)
DictInput = typing_extensions.TypedDict(
    'DictInput',
    {
        "op": typing.Union[
            Op[str],
            str
        ],
        "path": typing.Union[
            Path[str],
            str
        ],
        "value": typing.Union[
            Value[
                schemas.INPUT_BASE_TYPES
            ],
            dict,
            frozendict.frozendict,
            str,
            datetime.date,
            datetime.datetime,
            uuid.UUID,
            int,
            float,
            decimal.Decimal,
            bool,
            None,
            list,
            tuple,
            bytes,
            io.FileIO,
            io.BufferedReader
        ],
    }
)


class JSONPatchRequestAddReplaceTest(
    schemas.DictSchema[schemas.T]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({frozendict.frozendict})
        required: typing.FrozenSet[str] = frozenset({
            "op",
            "path",
            "value",
        })
        properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
        additional_properties: typing.Type[AdditionalProperties] = dataclasses.field(default_factory=lambda: AdditionalProperties) # type: ignore
    
    @property
    def op(self) -> Op[str]:
        return self.__getitem__("op")
    
    @property
    def path(self) -> Path[str]:
        return self.__getitem__("path")
    
    @property
    def value(self) -> Value[typing.Union[
        frozendict.frozendict,
        str,
        decimal.Decimal,
        schemas.BoolClass,
        schemas.NoneClass,
        tuple,
        bytes,
        schemas.FileIO
    ]]:
        return self.__getitem__("value")
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["op"]) -> Op[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["path"]) -> Path[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["value"]) -> Value[typing.Union[
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
            typing_extensions.Literal["op"],
            typing_extensions.Literal["path"],
            typing_extensions.Literal["value"],
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        arg_: typing.Union[
            DictInput,
            typing.Mapping[str, schemas.INPUT_TYPES_ALL_INCL_SCHEMA],
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None
    ) -> JSONPatchRequestAddReplaceTest[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            arg_,
            configuration_=configuration_,
        )
        inst = typing.cast(
            JSONPatchRequestAddReplaceTest[frozendict.frozendict],
            inst
        )
        return inst


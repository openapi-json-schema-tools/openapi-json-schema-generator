# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *

AdditionalProperties: typing_extensions.TypeAlias = schemas.StrSchema[U]
DictInput = typing.Mapping[
    str,
    typing.Union[
        AdditionalProperties[str],
        str
    ],
]


class MapProperty(
    schemas.DictSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({frozendict.frozendict})
        additional_properties: typing.Type[AdditionalProperties] = dataclasses.field(default_factory=lambda: AdditionalProperties) # type: ignore
    
    def __getitem__(self, name: str) -> AdditionalProperties[str]:
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        arg: typing.Union[
            DictInput,
            MapProperty[frozendict.frozendict],
        ],
        configuration: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None
    ) -> MapProperty[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            arg,
            configuration=configuration,
        )
        inst = typing.cast(
            MapProperty[frozendict.frozendict],
            inst
        )
        return inst

AdditionalProperties3: typing_extensions.TypeAlias = schemas.StrSchema[U]
DictInput2 = typing.Mapping[
    str,
    typing.Union[
        AdditionalProperties3[str],
        str
    ],
]


class AdditionalProperties2(
    schemas.DictSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({frozendict.frozendict})
        additional_properties: typing.Type[AdditionalProperties3] = dataclasses.field(default_factory=lambda: AdditionalProperties3) # type: ignore
    
    def __getitem__(self, name: str) -> AdditionalProperties3[str]:
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        arg: typing.Union[
            DictInput2,
            AdditionalProperties2[frozendict.frozendict],
        ],
        configuration: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None
    ) -> AdditionalProperties2[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            arg,
            configuration=configuration,
        )
        inst = typing.cast(
            AdditionalProperties2[frozendict.frozendict],
            inst
        )
        return inst

DictInput3 = typing.Mapping[
    str,
    typing.Union[
        AdditionalProperties2[frozendict.frozendict],
        dict,
        frozendict.frozendict
    ],
]


class MapOfMapProperty(
    schemas.DictSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({frozendict.frozendict})
        additional_properties: typing.Type[AdditionalProperties2] = dataclasses.field(default_factory=lambda: AdditionalProperties2) # type: ignore
    
    def __getitem__(self, name: str) -> AdditionalProperties2[frozendict.frozendict]:
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        arg: typing.Union[
            DictInput3,
            MapOfMapProperty[frozendict.frozendict],
        ],
        configuration: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None
    ) -> MapOfMapProperty[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            arg,
            configuration=configuration,
        )
        inst = typing.cast(
            MapOfMapProperty[frozendict.frozendict],
            inst
        )
        return inst

DictInput4 = typing.Mapping[str, schemas.INPUT_TYPES_ALL_INCL_SCHEMA]
Anytype1: typing_extensions.TypeAlias = schemas.AnyTypeSchema[U]
DictInput5 = typing.Mapping[str, schemas.INPUT_TYPES_ALL_INCL_SCHEMA]
MapWithUndeclaredPropertiesAnytype1: typing_extensions.TypeAlias = schemas.DictSchema[U]
DictInput6 = typing.Mapping[str, schemas.INPUT_TYPES_ALL_INCL_SCHEMA]
MapWithUndeclaredPropertiesAnytype2: typing_extensions.TypeAlias = schemas.DictSchema[U]
DictInput7 = typing.Mapping[str, schemas.INPUT_TYPES_ALL_INCL_SCHEMA]
AdditionalProperties4: typing_extensions.TypeAlias = schemas.AnyTypeSchema[U]
DictInput8 = typing.Mapping[
    str,
    typing.Union[
        AdditionalProperties4[
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
]


class MapWithUndeclaredPropertiesAnytype3(
    schemas.DictSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({frozendict.frozendict})
        additional_properties: typing.Type[AdditionalProperties4] = dataclasses.field(default_factory=lambda: AdditionalProperties4) # type: ignore
    
    def __getitem__(self, name: str) -> AdditionalProperties4[typing.Union[
        frozendict.frozendict,
        str,
        decimal.Decimal,
        schemas.BoolClass,
        schemas.NoneClass,
        tuple,
        bytes,
        schemas.FileIO
    ]]:
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        arg: typing.Union[
            DictInput8,
            MapWithUndeclaredPropertiesAnytype3[frozendict.frozendict],
        ],
        configuration: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None
    ) -> MapWithUndeclaredPropertiesAnytype3[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            arg,
            configuration=configuration,
        )
        inst = typing.cast(
            MapWithUndeclaredPropertiesAnytype3[frozendict.frozendict],
            inst
        )
        return inst

AdditionalProperties5: typing_extensions.TypeAlias = schemas.NotAnyTypeSchema[U]
DictInput11 = typing.Mapping # mapping must be empty


class EmptyMap(
    schemas.DictSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({frozendict.frozendict})
        additional_properties: typing.Type[AdditionalProperties5] = dataclasses.field(default_factory=lambda: AdditionalProperties5) # type: ignore

    def __new__(
        cls,
        arg: typing.Union[
            DictInput11,
            EmptyMap[frozendict.frozendict],
        ],
        configuration: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None
    ) -> EmptyMap[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            arg,
            configuration=configuration,
        )
        inst = typing.cast(
            EmptyMap[frozendict.frozendict],
            inst
        )
        return inst

AdditionalProperties6: typing_extensions.TypeAlias = schemas.StrSchema[U]
DictInput12 = typing.Mapping[
    str,
    typing.Union[
        AdditionalProperties6[str],
        str
    ],
]


class MapWithUndeclaredPropertiesString(
    schemas.DictSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({frozendict.frozendict})
        additional_properties: typing.Type[AdditionalProperties6] = dataclasses.field(default_factory=lambda: AdditionalProperties6) # type: ignore
    
    def __getitem__(self, name: str) -> AdditionalProperties6[str]:
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        arg: typing.Union[
            DictInput12,
            MapWithUndeclaredPropertiesString[frozendict.frozendict],
        ],
        configuration: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None
    ) -> MapWithUndeclaredPropertiesString[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            arg,
            configuration=configuration,
        )
        inst = typing.cast(
            MapWithUndeclaredPropertiesString[frozendict.frozendict],
            inst
        )
        return inst

Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "map_property": typing.Type[MapProperty],
        "map_of_map_property": typing.Type[MapOfMapProperty],
        "anytype_1": typing.Type[Anytype1],
        "map_with_undeclared_properties_anytype_1": typing.Type[MapWithUndeclaredPropertiesAnytype1],
        "map_with_undeclared_properties_anytype_2": typing.Type[MapWithUndeclaredPropertiesAnytype2],
        "map_with_undeclared_properties_anytype_3": typing.Type[MapWithUndeclaredPropertiesAnytype3],
        "empty_map": typing.Type[EmptyMap],
        "map_with_undeclared_properties_string": typing.Type[MapWithUndeclaredPropertiesString],
    }
)
DictInput13 = typing.Mapping[
    str,
    typing.Union[
        typing.Union[
            MapProperty[frozendict.frozendict],
            dict,
            frozendict.frozendict
        ],
        typing.Union[
            MapOfMapProperty[frozendict.frozendict],
            dict,
            frozendict.frozendict
        ],
        typing.Union[
            Anytype1[
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
        typing.Union[
            MapWithUndeclaredPropertiesAnytype1[frozendict.frozendict],
            dict,
            frozendict.frozendict
        ],
        typing.Union[
            MapWithUndeclaredPropertiesAnytype2[frozendict.frozendict],
            dict,
            frozendict.frozendict
        ],
        typing.Union[
            MapWithUndeclaredPropertiesAnytype3[frozendict.frozendict],
            dict,
            frozendict.frozendict
        ],
        typing.Union[
            EmptyMap[frozendict.frozendict],
            dict,
            frozendict.frozendict
        ],
        typing.Union[
            MapWithUndeclaredPropertiesString[frozendict.frozendict],
            dict,
            frozendict.frozendict
        ],
        schemas.INPUT_TYPES_ALL_INCL_SCHEMA
    ]
]


class AdditionalPropertiesClass(
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
    def __getitem__(self, name: typing_extensions.Literal["map_property"]) -> MapProperty[frozendict.frozendict]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["map_of_map_property"]) -> MapOfMapProperty[frozendict.frozendict]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["anytype_1"]) -> Anytype1[typing.Union[
        frozendict.frozendict,
        str,
        decimal.Decimal,
        schemas.BoolClass,
        schemas.NoneClass,
        tuple,
        bytes,
        schemas.FileIO
    ]]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["map_with_undeclared_properties_anytype_1"]) -> MapWithUndeclaredPropertiesAnytype1[frozendict.frozendict]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["map_with_undeclared_properties_anytype_2"]) -> MapWithUndeclaredPropertiesAnytype2[frozendict.frozendict]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["map_with_undeclared_properties_anytype_3"]) -> MapWithUndeclaredPropertiesAnytype3[frozendict.frozendict]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["empty_map"]) -> EmptyMap[frozendict.frozendict]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["map_with_undeclared_properties_string"]) -> MapWithUndeclaredPropertiesString[frozendict.frozendict]: ...
    
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
            typing_extensions.Literal["map_property"],
            typing_extensions.Literal["map_of_map_property"],
            typing_extensions.Literal["anytype_1"],
            typing_extensions.Literal["map_with_undeclared_properties_anytype_1"],
            typing_extensions.Literal["map_with_undeclared_properties_anytype_2"],
            typing_extensions.Literal["map_with_undeclared_properties_anytype_3"],
            typing_extensions.Literal["empty_map"],
            typing_extensions.Literal["map_with_undeclared_properties_string"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        arg: typing.Union[
            DictInput13,
            AdditionalPropertiesClass[frozendict.frozendict],
        ],
        configuration: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None
    ) -> AdditionalPropertiesClass[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            arg,
            configuration=configuration,
        )
        inst = typing.cast(
            AdditionalPropertiesClass[frozendict.frozendict],
            inst
        )
        return inst


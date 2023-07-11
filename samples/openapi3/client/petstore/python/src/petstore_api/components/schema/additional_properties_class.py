# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *

AdditionalProperties: typing_extensions.TypeAlias = schemas.StrSchema


class MapPropertyDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    def __getitem__(self, name: str) -> str:
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(cls, arg: MapPropertyDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return MapProperty.validate(arg, configuration=configuration)
MapPropertyDictInput = typing.Mapping[
    str,
    str,
]


@dataclasses.dataclass(frozen=True)
class MapProperty(
    schemas.Schema[MapPropertyDict, tuple]
):
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    additional_properties: typing.Type[AdditionalProperties] = dataclasses.field(default_factory=lambda: AdditionalProperties) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: MapPropertyDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            MapPropertyDictInput,
            MapPropertyDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> MapPropertyDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )

AdditionalProperties3: typing_extensions.TypeAlias = schemas.StrSchema


class AdditionalPropertiesDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    def __getitem__(self, name: str) -> str:
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(cls, arg: AdditionalPropertiesDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return AdditionalProperties2.validate(arg, configuration=configuration)
AdditionalPropertiesDictInput = typing.Mapping[
    str,
    str,
]


@dataclasses.dataclass(frozen=True)
class AdditionalProperties2(
    schemas.Schema[AdditionalPropertiesDict, tuple]
):
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    additional_properties: typing.Type[AdditionalProperties3] = dataclasses.field(default_factory=lambda: AdditionalProperties3) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: AdditionalPropertiesDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            AdditionalPropertiesDictInput,
            AdditionalPropertiesDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> AdditionalPropertiesDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )



class MapOfMapPropertyDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    def __getitem__(self, name: str) -> AdditionalPropertiesDict:
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(cls, arg: MapOfMapPropertyDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return MapOfMapProperty.validate(arg, configuration=configuration)
MapOfMapPropertyDictInput = typing.Mapping[
    str,
    typing.Union[
        AdditionalPropertiesDict,
        dict,
        schemas.immutabledict
    ],
]


@dataclasses.dataclass(frozen=True)
class MapOfMapProperty(
    schemas.Schema[MapOfMapPropertyDict, tuple]
):
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    additional_properties: typing.Type[AdditionalProperties2] = dataclasses.field(default_factory=lambda: AdditionalProperties2) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: MapOfMapPropertyDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            MapOfMapPropertyDictInput,
            MapOfMapPropertyDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> MapOfMapPropertyDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )

Anytype1: typing_extensions.TypeAlias = schemas.AnyTypeSchema
MapWithUndeclaredPropertiesAnytype1: typing_extensions.TypeAlias = schemas.DictSchema
MapWithUndeclaredPropertiesAnytype2: typing_extensions.TypeAlias = schemas.DictSchema
AdditionalProperties4: typing_extensions.TypeAlias = schemas.AnyTypeSchema


class MapWithUndeclaredPropertiesAnytype3Dict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    def __getitem__(self, name: str) -> schemas.OUTPUT_BASE_TYPES:
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(cls, arg: MapWithUndeclaredPropertiesAnytype3DictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return MapWithUndeclaredPropertiesAnytype3.validate(arg, configuration=configuration)
MapWithUndeclaredPropertiesAnytype3DictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL_INCL_SCHEMA]


@dataclasses.dataclass(frozen=True)
class MapWithUndeclaredPropertiesAnytype3(
    schemas.Schema[MapWithUndeclaredPropertiesAnytype3Dict, tuple]
):
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    additional_properties: typing.Type[AdditionalProperties4] = dataclasses.field(default_factory=lambda: AdditionalProperties4) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: MapWithUndeclaredPropertiesAnytype3Dict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            MapWithUndeclaredPropertiesAnytype3DictInput,
            MapWithUndeclaredPropertiesAnytype3Dict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> MapWithUndeclaredPropertiesAnytype3Dict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )

AdditionalProperties5: typing_extensions.TypeAlias = schemas.NotAnyTypeSchema


class EmptyMapDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    # empty mapping
    pass

    def __new__(cls, arg: EmptyMapDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return EmptyMap.validate(arg, configuration=configuration)
EmptyMapDictInput = typing.Mapping # mapping must be empty


@dataclasses.dataclass(frozen=True)
class EmptyMap(
    schemas.Schema[EmptyMapDict, tuple]
):
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    additional_properties: typing.Type[AdditionalProperties5] = dataclasses.field(default_factory=lambda: AdditionalProperties5) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: EmptyMapDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            EmptyMapDictInput,
            EmptyMapDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> EmptyMapDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )

AdditionalProperties6: typing_extensions.TypeAlias = schemas.StrSchema


class MapWithUndeclaredPropertiesStringDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    def __getitem__(self, name: str) -> str:
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(cls, arg: MapWithUndeclaredPropertiesStringDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return MapWithUndeclaredPropertiesString.validate(arg, configuration=configuration)
MapWithUndeclaredPropertiesStringDictInput = typing.Mapping[
    str,
    str,
]


@dataclasses.dataclass(frozen=True)
class MapWithUndeclaredPropertiesString(
    schemas.Schema[MapWithUndeclaredPropertiesStringDict, tuple]
):
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    additional_properties: typing.Type[AdditionalProperties6] = dataclasses.field(default_factory=lambda: AdditionalProperties6) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: MapWithUndeclaredPropertiesStringDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            MapWithUndeclaredPropertiesStringDictInput,
            MapWithUndeclaredPropertiesStringDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> MapWithUndeclaredPropertiesStringDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )

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


class AdditionalPropertiesClassDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["map_property"]) -> MapPropertyDict:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["map_of_map_property"]) -> MapOfMapPropertyDict:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["anytype_1"]) -> schemas.OUTPUT_BASE_TYPES:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["map_with_undeclared_properties_anytype_1"]) -> schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["map_with_undeclared_properties_anytype_2"]) -> schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["map_with_undeclared_properties_anytype_3"]) -> MapWithUndeclaredPropertiesAnytype3Dict:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["empty_map"]) -> EmptyMapDict:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["map_with_undeclared_properties_string"]) -> MapWithUndeclaredPropertiesStringDict:
        ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.OUTPUT_BASE_TYPES: ...
    
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

    def __new__(cls, arg: AdditionalPropertiesClassDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return AdditionalPropertiesClass.validate(arg, configuration=configuration)
AdditionalPropertiesClassDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL_INCL_SCHEMA]


@dataclasses.dataclass(frozen=True)
class AdditionalPropertiesClass(
    schemas.Schema[AdditionalPropertiesClassDict, tuple]
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
            schemas.immutabledict: AdditionalPropertiesClassDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            AdditionalPropertiesClassDictInput,
            AdditionalPropertiesClassDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> AdditionalPropertiesClassDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )


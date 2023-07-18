# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

AdditionalProperties2: typing_extensions.TypeAlias = schemas.StrSchema


class AdditionalPropertiesDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    __required_keys__: typing.FrozenSet[str] = frozenset({
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
    })
    
    def get_additional_property_(self, name: str) -> typing.Union[str, schemas.Unset]:
        schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
        val = self.get(name, schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            str,
            val
        )

    def __new__(cls, arg: AdditionalPropertiesDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return AdditionalProperties.validate(arg, configuration=configuration)
AdditionalPropertiesDictInput = typing.Mapping[
    str,
    str,
]


@dataclasses.dataclass(frozen=True)
class AdditionalProperties(
    schemas.Schema[AdditionalPropertiesDict, tuple]
):
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    additional_properties: typing.Type[AdditionalProperties2] = dataclasses.field(default_factory=lambda: AdditionalProperties2) # type: ignore
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



class MapMapOfStringDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    __required_keys__: typing.FrozenSet[str] = frozenset({
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
    })
    
    def get_additional_property_(self, name: str) -> typing.Union[AdditionalPropertiesDict, schemas.Unset]:
        schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
        val = self.get(name, schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            AdditionalPropertiesDict,
            val
        )

    def __new__(cls, arg: MapMapOfStringDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return MapMapOfString.validate(arg, configuration=configuration)
MapMapOfStringDictInput = typing.Mapping[
    str,
    typing.Union[
        AdditionalPropertiesDict,
        dict,
        schemas.immutabledict
    ],
]


@dataclasses.dataclass(frozen=True)
class MapMapOfString(
    schemas.Schema[MapMapOfStringDict, tuple]
):
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    additional_properties: typing.Type[AdditionalProperties] = dataclasses.field(default_factory=lambda: AdditionalProperties) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: MapMapOfStringDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            MapMapOfStringDictInput,
            MapMapOfStringDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> MapMapOfStringDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )



class AdditionalPropertiesEnums:

    @schemas.classproperty
    def UPPER(cls) -> str:
        return AdditionalProperties3.validate("UPPER")

    @schemas.classproperty
    def LOWER(cls) -> str:
        return AdditionalProperties3.validate("lower")


@dataclasses.dataclass(frozen=True)
class AdditionalProperties3(
    schemas.Schema[schemas.immutabledict, str]
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        str,
    })
    enum_value_to_name: typing.Mapping[typing.Union[int, float, str, schemas.Bool, None], str] = dataclasses.field(
        default_factory=lambda: {
            "UPPER": "UPPER",
            "lower": "LOWER",
        }
    )
    enums = AdditionalPropertiesEnums

    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing_extensions.Literal["UPPER"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal["UPPER"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing_extensions.Literal["lower"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal["lower"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: str,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal["UPPER","lower",]: ...
    @classmethod
    def validate(
        cls,
        arg,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal[
        "UPPER",
        "lower",
    ]:
        validated_arg = super().validate_base(
            arg,
            configuration=configuration,
        )
        return typing.cast(typing_extensions.Literal[
                "UPPER",
                "lower",
            ],
            validated_arg
        )


class MapOfEnumStringDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    __required_keys__: typing.FrozenSet[str] = frozenset({
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
    })
    
    def get_additional_property_(self, name: str) -> typing.Union[typing_extensions.Literal["UPPER", "lower"], schemas.Unset]:
        schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
        val = self.get(name, schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            typing_extensions.Literal["UPPER", "lower"],
            val
        )

    def __new__(cls, arg: MapOfEnumStringDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return MapOfEnumString.validate(arg, configuration=configuration)
MapOfEnumStringDictInput = typing.Mapping[
    str,
    str,
]


@dataclasses.dataclass(frozen=True)
class MapOfEnumString(
    schemas.Schema[MapOfEnumStringDict, tuple]
):
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    additional_properties: typing.Type[AdditionalProperties3] = dataclasses.field(default_factory=lambda: AdditionalProperties3) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: MapOfEnumStringDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            MapOfEnumStringDictInput,
            MapOfEnumStringDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> MapOfEnumStringDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )

AdditionalProperties4: typing_extensions.TypeAlias = schemas.BoolSchema


class DirectMapDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    __required_keys__: typing.FrozenSet[str] = frozenset({
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
    })
    
    def get_additional_property_(self, name: str) -> typing.Union[bool, schemas.Unset]:
        schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
        val = self.get(name, schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            bool,
            val
        )

    def __new__(cls, arg: DirectMapDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return DirectMap.validate(arg, configuration=configuration)
DirectMapDictInput = typing.Mapping[
    str,
    bool,
]


@dataclasses.dataclass(frozen=True)
class DirectMap(
    schemas.Schema[DirectMapDict, tuple]
):
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    additional_properties: typing.Type[AdditionalProperties4] = dataclasses.field(default_factory=lambda: AdditionalProperties4) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: DirectMapDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            DirectMapDictInput,
            DirectMapDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> DirectMapDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )


from petstore_api.components.schema import string_boolean_map
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "map_map_of_string": typing.Type[MapMapOfString],
        "map_of_enum_string": typing.Type[MapOfEnumString],
        "direct_map": typing.Type[DirectMap],
        "indirect_map": typing.Type[string_boolean_map.StringBooleanMap],
    }
)


class MapTestDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    __required_keys__: typing.FrozenSet[str] = frozenset({
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
        "map_map_of_string",
        "map_of_enum_string",
        "direct_map",
        "indirect_map",
    })
    
    @property
    def map_map_of_string(self) -> typing.Union[MapMapOfStringDict, schemas.Unset]:
        val = self.get("map_map_of_string", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            MapMapOfStringDict,
            val
        )
    
    @property
    def map_of_enum_string(self) -> typing.Union[MapOfEnumStringDict, schemas.Unset]:
        val = self.get("map_of_enum_string", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            MapOfEnumStringDict,
            val
        )
    
    @property
    def direct_map(self) -> typing.Union[DirectMapDict, schemas.Unset]:
        val = self.get("direct_map", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            DirectMapDict,
            val
        )
    
    @property
    def indirect_map(self) -> typing.Union[string_boolean_map.StringBooleanMapDict, schemas.Unset]:
        val = self.get("indirect_map", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            string_boolean_map.StringBooleanMapDict,
            val
        )
    
    def get_additional_property_(self, name: str) -> typing.Union[schemas.OUTPUT_BASE_TYPES, schemas.Unset]:
        schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
        return self.get(name, schemas.unset)

    def __new__(cls, arg: MapTestDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return MapTest.validate(arg, configuration=configuration)
MapTestDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL]


@dataclasses.dataclass(frozen=True)
class MapTest(
    schemas.Schema[MapTestDict, tuple]
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
            schemas.immutabledict: MapTestDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            MapTestDictInput,
            MapTestDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> MapTestDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )


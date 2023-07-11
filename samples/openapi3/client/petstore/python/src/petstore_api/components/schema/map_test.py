# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *

AdditionalProperties2: typing_extensions.TypeAlias = schemas.StrSchema


class AdditionalPropertiesDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    def __getitem__(self, name: str) -> str:
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(cls, arg: AdditionalPropertiesDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return AdditionalProperties.validate(arg, configuration=configuration)
AdditionalPropertiesDictInput = typing.Mapping[
    str,
    str,
]


@dataclasses.dataclass(frozen=True)
class AdditionalProperties(
    schemas.DictSchema[AdditionalPropertiesDict]
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
    
    def __getitem__(self, name: str) -> AdditionalPropertiesDict:
        # dict_instance[name] accessor
        return super().__getitem__(name)

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
    schemas.DictSchema[MapMapOfStringDict]
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
    schemas.StrSchema
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
    
    def __getitem__(self, name: str) -> typing_extensions.Literal["UPPER", "lower"]:
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(cls, arg: MapOfEnumStringDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return MapOfEnumString.validate(arg, configuration=configuration)
MapOfEnumStringDictInput = typing.Mapping[
    str,
    str,
]


@dataclasses.dataclass(frozen=True)
class MapOfEnumString(
    schemas.DictSchema[MapOfEnumStringDict]
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
    
    def __getitem__(self, name: str) -> bool:
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(cls, arg: DirectMapDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return DirectMap.validate(arg, configuration=configuration)
DirectMapDictInput = typing.Mapping[
    str,
    bool,
]


@dataclasses.dataclass(frozen=True)
class DirectMap(
    schemas.DictSchema[DirectMapDict]
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
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["map_map_of_string"]) -> MapMapOfStringDict:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["map_of_enum_string"]) -> MapOfEnumStringDict:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["direct_map"]) -> DirectMapDict:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["indirect_map"]) -> string_boolean_map.StringBooleanMapDict:
        ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.OUTPUT_BASE_TYPES: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["map_map_of_string"],
            typing_extensions.Literal["map_of_enum_string"],
            typing_extensions.Literal["direct_map"],
            typing_extensions.Literal["indirect_map"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(cls, arg: MapTestDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return MapTest.validate(arg, configuration=configuration)
MapTestDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL_INCL_SCHEMA]


@dataclasses.dataclass(frozen=True)
class MapTest(
    schemas.DictSchema[MapTestDict]
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


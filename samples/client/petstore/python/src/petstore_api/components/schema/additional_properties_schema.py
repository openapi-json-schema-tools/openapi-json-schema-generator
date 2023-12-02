# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \\\" \\\\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

AdditionalProperties: typing_extensions.TypeAlias = schemas.AnyTypeSchema


class _0Dict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):

    __required_keys__: typing.FrozenSet[str] = frozenset({
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
    })
    def __new__(
        cls,
        configuration_: typing.Optional[schema_configuration.SchemaConfiguration] = None,
        **kwargs: schemas.INPUT_TYPES_ALL,
    ):
        used_kwargs = typing.cast(_0DictInput, kwargs)
        return _0.validate(used_kwargs, configuration=configuration_)
    
    @staticmethod
    def from_dict_(
        arg: typing.Union[
            _0DictInput,
            _0Dict
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> _0Dict:
        return _0.validate(arg, configuration=configuration)
    
    def get_additional_property_(self, name: str) -> typing.Union[schemas.OUTPUT_BASE_TYPES, schemas.Unset]:
        schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
        val = self.get(name, schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            schemas.OUTPUT_BASE_TYPES,
            val
        )
_0DictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL]


@dataclasses.dataclass(frozen=True)
class _0(
    schemas.Schema[_0Dict, tuple]
):
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    additional_properties: typing.Type[AdditionalProperties] = dataclasses.field(default_factory=lambda: AdditionalProperties) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: _0Dict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            _0DictInput,
            _0Dict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> _0Dict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )



@dataclasses.dataclass(frozen=True)
class AdditionalProperties2(
    schemas.AnyTypeSchema[schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES], typing.Tuple[schemas.OUTPUT_BASE_TYPES, ...]],
):
    # any type
    min_length: int = 3



class _1Dict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):

    __required_keys__: typing.FrozenSet[str] = frozenset({
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
    })
    def __new__(
        cls,
        configuration_: typing.Optional[schema_configuration.SchemaConfiguration] = None,
        **kwargs: typing.Union[
            schemas.INPUT_TYPES_ALL,
            schemas.OUTPUT_BASE_TYPES
        ],
    ):
        used_kwargs = typing.cast(_1DictInput, kwargs)
        return _1.validate(used_kwargs, configuration=configuration_)
    
    @staticmethod
    def from_dict_(
        arg: typing.Union[
            _1DictInput,
            _1Dict
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> _1Dict:
        return _1.validate(arg, configuration=configuration)
    
    def get_additional_property_(self, name: str) -> typing.Union[schemas.OUTPUT_BASE_TYPES, schemas.Unset]:
        schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
        val = self.get(name, schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            schemas.OUTPUT_BASE_TYPES,
            val
        )
_1DictInput = typing.Mapping[
    str,
    typing.Union[
        schemas.INPUT_TYPES_ALL,
        schemas.OUTPUT_BASE_TYPES
    ],
]


@dataclasses.dataclass(frozen=True)
class _1(
    schemas.Schema[_1Dict, tuple]
):
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    additional_properties: typing.Type[AdditionalProperties2] = dataclasses.field(default_factory=lambda: AdditionalProperties2) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: _1Dict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            _1DictInput,
            _1Dict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> _1Dict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )



@dataclasses.dataclass(frozen=True)
class AdditionalProperties3(
    schemas.AnyTypeSchema[schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES], typing.Tuple[schemas.OUTPUT_BASE_TYPES, ...]],
):
    # any type
    max_length: int = 5



class _2Dict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):

    __required_keys__: typing.FrozenSet[str] = frozenset({
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
    })
    def __new__(
        cls,
        configuration_: typing.Optional[schema_configuration.SchemaConfiguration] = None,
        **kwargs: typing.Union[
            schemas.INPUT_TYPES_ALL,
            schemas.OUTPUT_BASE_TYPES
        ],
    ):
        used_kwargs = typing.cast(_2DictInput, kwargs)
        return _2.validate(used_kwargs, configuration=configuration_)
    
    @staticmethod
    def from_dict_(
        arg: typing.Union[
            _2DictInput,
            _2Dict
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> _2Dict:
        return _2.validate(arg, configuration=configuration)
    
    def get_additional_property_(self, name: str) -> typing.Union[schemas.OUTPUT_BASE_TYPES, schemas.Unset]:
        schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
        val = self.get(name, schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            schemas.OUTPUT_BASE_TYPES,
            val
        )
_2DictInput = typing.Mapping[
    str,
    typing.Union[
        schemas.INPUT_TYPES_ALL,
        schemas.OUTPUT_BASE_TYPES
    ],
]


@dataclasses.dataclass(frozen=True)
class _2(
    schemas.Schema[_2Dict, tuple]
):
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    additional_properties: typing.Type[AdditionalProperties3] = dataclasses.field(default_factory=lambda: AdditionalProperties3) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: _2Dict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            _2DictInput,
            _2Dict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> _2Dict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )

AllOf = typing.Tuple[
    typing.Type[_0],
    typing.Type[_1],
    typing.Type[_2],
]


@dataclasses.dataclass(frozen=True)
class AdditionalPropertiesSchema(
    schemas.Schema[schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES], tuple]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    all_of: AllOf = dataclasses.field(default_factory=lambda: schemas.tuple_to_instance(AllOf)) # type: ignore

    @classmethod
    def validate(
        cls,
        arg: typing.Mapping[str, schemas.INPUT_TYPES_ALL],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]:
        return super().validate_base(
            arg,
            configuration=configuration,
        )


# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from unit_test_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

AdditionalProperties: typing_extensions.TypeAlias = schemas.IntSchema


@dataclasses.dataclass(frozen=True)
class FO(
    schemas.AnyTypeSchema[schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES], typing.Tuple[schemas.OUTPUT_BASE_TYPES, ...]],
):
    # any type
    min_items: int = 2



@dataclasses.dataclass(frozen=True)
class Foo(
    schemas.Schema[schemas.immutabledict, typing.Tuple[schemas.OUTPUT_BASE_TYPES, ...]]
):
    types: typing.FrozenSet[typing.Type] = frozenset({tuple})
    max_items: int = 3

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            typing.List[schemas.INPUT_TYPES_ALL],
            typing.Tuple[schemas.INPUT_TYPES_ALL, ...],
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing.Tuple[schemas.OUTPUT_BASE_TYPES, ...]:
        return super().validate_base(
            arg,
            configuration=configuration,
        )
Bar: typing_extensions.TypeAlias = schemas.ListSchema
Properties = typing.TypedDict(
    'Properties',
    {
        "foo": typing.Type[Foo],
        "bar": typing.Type[Bar],
    }
)


class PropertiesPatternpropertiesAdditionalpropertiesInteractionDict(schemas.immutabledict[str, typing.Union[
    typing.Tuple[schemas.OUTPUT_BASE_TYPES],
    int,
]]):

    __required_keys__: typing.FrozenSet[str] = frozenset({
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
        "foo",
        "bar",
    })
    
    def __new__(
        cls,
        *,
        foo: typing.Union[
            typing.Tuple[schemas.INPUT_TYPES_ALL, ...],
            typing.Tuple[schemas.OUTPUT_BASE_TYPES, ...],
            schemas.Unset
        ] = schemas.unset,
        bar: typing.Union[
            typing.Tuple[schemas.INPUT_TYPES_ALL, ...],
            typing.Tuple[schemas.OUTPUT_BASE_TYPES, ...],
            schemas.Unset
        ] = schemas.unset,
        configuration_: typing.Optional[schema_configuration.SchemaConfiguration] = None,
        **kwargs: int,
    ):
        arg_: typing.Dict[str, typing.Any] = {}
        for key_, val in (
            ("foo", foo),
            ("bar", bar),
        ):
            if isinstance(val, schemas.Unset):
                continue
            arg_[key_] = val
        arg_.update(kwargs)
        used_arg_ = typing.cast(PropertiesPatternpropertiesAdditionalpropertiesInteractionDictInput, arg_)
        return PropertiesPatternpropertiesAdditionalpropertiesInteraction.validate(used_arg_, configuration=configuration_)
    
    @staticmethod
    def from_dict_(
        arg: typing.Union[
            PropertiesPatternpropertiesAdditionalpropertiesInteractionDictInput,
            PropertiesPatternpropertiesAdditionalpropertiesInteractionDict
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> PropertiesPatternpropertiesAdditionalpropertiesInteractionDict:
        return PropertiesPatternpropertiesAdditionalpropertiesInteraction.validate(arg, configuration=configuration)
    
    @property
    def foo(self) -> typing.Union[typing.Tuple[schemas.OUTPUT_BASE_TYPES], schemas.Unset]:
        val = self.get("foo", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            typing.Tuple[schemas.OUTPUT_BASE_TYPES],
            val
        )
    
    @property
    def bar(self) -> typing.Union[typing.Tuple[schemas.OUTPUT_BASE_TYPES], schemas.Unset]:
        val = self.get("bar", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            typing.Tuple[schemas.OUTPUT_BASE_TYPES],
            val
        )
    
    def get_additional_property_(self, name: str) -> typing.Union[int, schemas.Unset]:
        schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
        val = self.get(name, schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            int,
            val
        )
PropertiesPatternpropertiesAdditionalpropertiesInteractionDictInput = typing.Mapping[
    str,
    typing.Union[
        typing.Union[
            typing.Tuple[schemas.INPUT_TYPES_ALL, ...],
            typing.Tuple[schemas.OUTPUT_BASE_TYPES, ...],
        ],
        typing.Union[
            typing.Tuple[schemas.INPUT_TYPES_ALL, ...],
            typing.Tuple[schemas.OUTPUT_BASE_TYPES, ...],
        ],
        int,
    ]
]


@dataclasses.dataclass(frozen=True)
class PropertiesPatternpropertiesAdditionalpropertiesInteraction(
    schemas.Schema[PropertiesPatternpropertiesAdditionalpropertiesInteractionDict, tuple]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    pattern_properties: typing.Mapping[
        schemas.PatternInfo,
        typing.Type[schemas.Schema]
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.PatternInfo(
                pattern=r'f.o'  # noqa: E501
            ): FO,
        }
    )
    additional_properties: typing.Type[AdditionalProperties] = dataclasses.field(default_factory=lambda: AdditionalProperties) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: PropertiesPatternpropertiesAdditionalpropertiesInteractionDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            PropertiesPatternpropertiesAdditionalpropertiesInteractionDictInput,
            PropertiesPatternpropertiesAdditionalpropertiesInteractionDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> PropertiesPatternpropertiesAdditionalpropertiesInteractionDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )


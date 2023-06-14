# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *

Items2: typing_extensions.TypeAlias = schemas.NumberSchema


class ItemsTuple(typing.Tuple[schemas.OUTPUT_BASE_TYPES]):
    def __getitem__(self, name: int) -> typing.Union[float, int]:
        return super().__getitem__(name)
ItemsTupleInput = typing.Sequence[
    typing.Union[
        float,
        int
    ],
]


@dataclasses.dataclass(frozen=True)
class Items(
    schemas.ListSchema[ItemsTuple]
):
    types: typing.FrozenSet[typing.Type] = frozenset({tuple})
    items: typing.Type[Items2] = dataclasses.field(default_factory=lambda: Items2) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            tuple: ItemsTuple
        }
    )

    @classmethod
    def validate(
        cls,
        arg: ItemsTupleInput,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ItemsTuple:
        return super().validate(
            arg,
            configuration=configuration,
        )


class ArrayArrayNumberTuple(typing.Tuple[schemas.OUTPUT_BASE_TYPES]):
    def __getitem__(self, name: int) -> ItemsTuple:
        return super().__getitem__(name)
ArrayArrayNumberTupleInput = typing.Sequence[
    typing.Union[
        ItemsTuple,
        list,
        tuple
    ],
]


@dataclasses.dataclass(frozen=True)
class ArrayArrayNumber(
    schemas.ListSchema[ArrayArrayNumberTuple]
):
    types: typing.FrozenSet[typing.Type] = frozenset({tuple})
    items: typing.Type[Items] = dataclasses.field(default_factory=lambda: Items) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            tuple: ArrayArrayNumberTuple
        }
    )

    @classmethod
    def validate(
        cls,
        arg: ArrayArrayNumberTupleInput,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ArrayArrayNumberTuple:
        return super().validate(
            arg,
            configuration=configuration,
        )
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "ArrayArrayNumber": typing.Type[ArrayArrayNumber],
    }
)


class ArrayOfArrayOfNumberOnlyDict(immutabledict.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["ArrayArrayNumber"]) -> ArrayArrayNumberTuple:
        ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.OUTPUT_BASE_TYPES: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["ArrayArrayNumber"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)
ArrayOfArrayOfNumberOnlyDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL_INCL_SCHEMA]


@dataclasses.dataclass(frozen=True)
class ArrayOfArrayOfNumberOnly(
    schemas.DictSchema[ArrayOfArrayOfNumberOnlyDict]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({immutabledict.immutabledict})
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            immutabledict.immutabledict: ArrayOfArrayOfNumberOnlyDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: ArrayOfArrayOfNumberOnlyDictInput,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ArrayOfArrayOfNumberOnlyDict:
        return super().validate(
            arg,
            configuration=configuration,
        )


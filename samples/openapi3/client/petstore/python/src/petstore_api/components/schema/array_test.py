# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *

Items: typing_extensions.TypeAlias = schemas.StrSchema


class ArrayOfStringTuple(typing.Tuple[schemas.OUTPUT_BASE_TYPES]):
    def __getitem__(self, name: int) -> str:
        return super().__getitem__(name)

    def __new__(cls, arg: ArrayOfStringTupleInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return ArrayOfString.validate(arg, configuration=configuration)

ArrayOfStringTupleInput = typing.Sequence[
    str,
]


@dataclasses.dataclass(frozen=True)
class ArrayOfString(
    schemas.ListSchema[ArrayOfStringTuple]
):
    types: typing.FrozenSet[typing.Type] = frozenset({tuple})
    items: typing.Type[Items] = dataclasses.field(default_factory=lambda: Items) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            tuple: ArrayOfStringTuple
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            ArrayOfStringTupleInput,
            ArrayOfStringTuple,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ArrayOfStringTuple:
        return super().validate(
            arg,
            configuration=configuration,
        )
Items3: typing_extensions.TypeAlias = schemas.Int64Schema


class ItemsTuple(typing.Tuple[schemas.OUTPUT_BASE_TYPES]):
    def __getitem__(self, name: int) -> int:
        return super().__getitem__(name)

    def __new__(cls, arg: ItemsTupleInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return Items2.validate(arg, configuration=configuration)

ItemsTupleInput = typing.Sequence[
    int,
]


@dataclasses.dataclass(frozen=True)
class Items2(
    schemas.ListSchema[ItemsTuple]
):
    types: typing.FrozenSet[typing.Type] = frozenset({tuple})
    items: typing.Type[Items3] = dataclasses.field(default_factory=lambda: Items3) # type: ignore
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
        arg: typing.Union[
            ItemsTupleInput,
            ItemsTuple,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ItemsTuple:
        return super().validate(
            arg,
            configuration=configuration,
        )


class ArrayArrayOfIntegerTuple(typing.Tuple[schemas.OUTPUT_BASE_TYPES]):
    def __getitem__(self, name: int) -> ItemsTuple:
        return super().__getitem__(name)

    def __new__(cls, arg: ArrayArrayOfIntegerTupleInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return ArrayArrayOfInteger.validate(arg, configuration=configuration)

ArrayArrayOfIntegerTupleInput = typing.Sequence[
    typing.Union[
        ItemsTuple,
        list,
        tuple
    ],
]


@dataclasses.dataclass(frozen=True)
class ArrayArrayOfInteger(
    schemas.ListSchema[ArrayArrayOfIntegerTuple]
):
    types: typing.FrozenSet[typing.Type] = frozenset({tuple})
    items: typing.Type[Items2] = dataclasses.field(default_factory=lambda: Items2) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            tuple: ArrayArrayOfIntegerTuple
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            ArrayArrayOfIntegerTupleInput,
            ArrayArrayOfIntegerTuple,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ArrayArrayOfIntegerTuple:
        return super().validate(
            arg,
            configuration=configuration,
        )

from petstore_api.components.schema import read_only_first


class ItemsTuple2(typing.Tuple[schemas.OUTPUT_BASE_TYPES]):
    def __getitem__(self, name: int) -> read_only_first.ReadOnlyFirstDict:
        return super().__getitem__(name)

    def __new__(cls, arg: ItemsTupleInput2, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return Items4.validate(arg, configuration=configuration)

ItemsTupleInput2 = typing.Sequence[
    typing.Union[
        read_only_first.ReadOnlyFirstDict,
        dict,
        immutabledict.immutabledict
    ],
]


@dataclasses.dataclass(frozen=True)
class Items4(
    schemas.ListSchema[ItemsTuple2]
):
    types: typing.FrozenSet[typing.Type] = frozenset({tuple})
    items: typing.Type[read_only_first.ReadOnlyFirst] = dataclasses.field(default_factory=lambda: read_only_first.ReadOnlyFirst) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            tuple: ItemsTuple2
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            ItemsTupleInput2,
            ItemsTuple2,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ItemsTuple2:
        return super().validate(
            arg,
            configuration=configuration,
        )


class ArrayArrayOfModelTuple(typing.Tuple[schemas.OUTPUT_BASE_TYPES]):
    def __getitem__(self, name: int) -> ItemsTuple2:
        return super().__getitem__(name)

    def __new__(cls, arg: ArrayArrayOfModelTupleInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return ArrayArrayOfModel.validate(arg, configuration=configuration)

ArrayArrayOfModelTupleInput = typing.Sequence[
    typing.Union[
        ItemsTuple2,
        list,
        tuple
    ],
]


@dataclasses.dataclass(frozen=True)
class ArrayArrayOfModel(
    schemas.ListSchema[ArrayArrayOfModelTuple]
):
    types: typing.FrozenSet[typing.Type] = frozenset({tuple})
    items: typing.Type[Items4] = dataclasses.field(default_factory=lambda: Items4) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            tuple: ArrayArrayOfModelTuple
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            ArrayArrayOfModelTupleInput,
            ArrayArrayOfModelTuple,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ArrayArrayOfModelTuple:
        return super().validate(
            arg,
            configuration=configuration,
        )
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "array_of_string": typing.Type[ArrayOfString],
        "array_array_of_integer": typing.Type[ArrayArrayOfInteger],
        "array_array_of_model": typing.Type[ArrayArrayOfModel],
    }
)


class ArrayTestDict(immutabledict.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["array_of_string"]) -> ArrayOfStringTuple:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["array_array_of_integer"]) -> ArrayArrayOfIntegerTuple:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["array_array_of_model"]) -> ArrayArrayOfModelTuple:
        ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.OUTPUT_BASE_TYPES: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["array_of_string"],
            typing_extensions.Literal["array_array_of_integer"],
            typing_extensions.Literal["array_array_of_model"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)
ArrayTestDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL_INCL_SCHEMA]


@dataclasses.dataclass(frozen=True)
class ArrayTest(
    schemas.DictSchema[ArrayTestDict]
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
            immutabledict.immutabledict: ArrayTestDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            ArrayTestDictInput,
            ArrayTestDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ArrayTestDict:
        return super().validate(
            arg,
            configuration=configuration,
        )


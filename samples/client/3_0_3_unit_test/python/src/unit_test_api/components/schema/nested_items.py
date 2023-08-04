# coding: utf-8

"""
    openapi 3.0.3 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft6  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from unit_test_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

Items4: typing_extensions.TypeAlias = schemas.NumberSchema


class ItemsTuple(
    typing.Tuple[
        typing.Union[int, float],
        ...
    ]
):

    def __new__(cls, arg: ItemsTupleInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return Items3.validate(arg, configuration=configuration)
ItemsTupleInput = typing.Union[
    typing.List[
        typing.Union[
            int,
            float
        ],
    ],
    typing.Tuple[
        typing.Union[
            int,
            float
        ],
        ...
    ]
]


@dataclasses.dataclass(frozen=True)
class Items3(
    schemas.Schema[schemas.immutabledict, ItemsTuple]
):
    types: typing.FrozenSet[typing.Type] = frozenset({tuple})
    items: typing.Type[Items4] = dataclasses.field(default_factory=lambda: Items4) # type: ignore
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
        return super().validate_base(
            arg,
            configuration=configuration,
        )


class ItemsTuple2(
    typing.Tuple[
        ItemsTuple,
        ...
    ]
):

    def __new__(cls, arg: ItemsTupleInput2, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return Items2.validate(arg, configuration=configuration)
ItemsTupleInput2 = typing.Union[
    typing.List[
        typing.Union[
            ItemsTupleInput,
            ItemsTuple
        ],
    ],
    typing.Tuple[
        typing.Union[
            ItemsTupleInput,
            ItemsTuple
        ],
        ...
    ]
]


@dataclasses.dataclass(frozen=True)
class Items2(
    schemas.Schema[schemas.immutabledict, ItemsTuple2]
):
    types: typing.FrozenSet[typing.Type] = frozenset({tuple})
    items: typing.Type[Items3] = dataclasses.field(default_factory=lambda: Items3) # type: ignore
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
        return super().validate_base(
            arg,
            configuration=configuration,
        )


class ItemsTuple3(
    typing.Tuple[
        ItemsTuple2,
        ...
    ]
):

    def __new__(cls, arg: ItemsTupleInput3, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return Items.validate(arg, configuration=configuration)
ItemsTupleInput3 = typing.Union[
    typing.List[
        typing.Union[
            ItemsTupleInput2,
            ItemsTuple2
        ],
    ],
    typing.Tuple[
        typing.Union[
            ItemsTupleInput2,
            ItemsTuple2
        ],
        ...
    ]
]


@dataclasses.dataclass(frozen=True)
class Items(
    schemas.Schema[schemas.immutabledict, ItemsTuple3]
):
    types: typing.FrozenSet[typing.Type] = frozenset({tuple})
    items: typing.Type[Items2] = dataclasses.field(default_factory=lambda: Items2) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            tuple: ItemsTuple3
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            ItemsTupleInput3,
            ItemsTuple3,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ItemsTuple3:
        return super().validate_base(
            arg,
            configuration=configuration,
        )


class NestedItemsTuple(
    typing.Tuple[
        ItemsTuple3,
        ...
    ]
):

    def __new__(cls, arg: NestedItemsTupleInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return NestedItems.validate(arg, configuration=configuration)
NestedItemsTupleInput = typing.Union[
    typing.List[
        typing.Union[
            ItemsTupleInput3,
            ItemsTuple3
        ],
    ],
    typing.Tuple[
        typing.Union[
            ItemsTupleInput3,
            ItemsTuple3
        ],
        ...
    ]
]


@dataclasses.dataclass(frozen=True)
class NestedItems(
    schemas.Schema[schemas.immutabledict, NestedItemsTuple]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({tuple})
    items: typing.Type[Items] = dataclasses.field(default_factory=lambda: Items) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            tuple: NestedItemsTuple
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            NestedItemsTupleInput,
            NestedItemsTuple,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> NestedItemsTuple:
        return super().validate_base(
            arg,
            configuration=configuration,
        )

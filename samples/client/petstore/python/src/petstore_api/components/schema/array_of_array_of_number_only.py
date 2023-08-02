# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

Items2: typing_extensions.TypeAlias = schemas.NumberSchema


class ItemsTuple(
    typing.Tuple[
        typing.Union[int, float],
        ...
    ]
):

    def __new__(cls, arg: ItemsTupleInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return Items.validate(arg, configuration=configuration)
ItemsTupleInput = typing.Union[
    typing.List[
        typing.Union[
            float,
            int
        ],
    ],
    typing.Tuple[
        typing.Union[
            float,
            int
        ],
        ...
    ]
]


@dataclasses.dataclass(frozen=True)
class Items(
    schemas.Schema[schemas.immutabledict, ItemsTuple]
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


class ArrayArrayNumberTuple(
    typing.Tuple[
        ItemsTuple,
        ...
    ]
):

    def __new__(cls, arg: ArrayArrayNumberTupleInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return ArrayArrayNumber.validate(arg, configuration=configuration)
ArrayArrayNumberTupleInput = typing.Union[
    typing.List[
        typing.Union[
            ItemsTuple,
            list,
            tuple
        ],
    ],
    typing.Tuple[
        typing.Union[
            ItemsTuple,
            list,
            tuple
        ],
        ...
    ]
]


@dataclasses.dataclass(frozen=True)
class ArrayArrayNumber(
    schemas.Schema[schemas.immutabledict, ArrayArrayNumberTuple]
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
        arg: typing.Union[
            ArrayArrayNumberTupleInput,
            ArrayArrayNumberTuple,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ArrayArrayNumberTuple:
        return super().validate_base(
            arg,
            configuration=configuration,
        )
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "ArrayArrayNumber": typing.Type[ArrayArrayNumber],
    }
)


class ArrayOfArrayOfNumberOnlyDict(schemas.immutabledict[str, typing.Tuple[schemas.OUTPUT_BASE_TYPES]]):

    __required_keys__: typing.FrozenSet[str] = frozenset({
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
        "ArrayArrayNumber",
    })
    
    @property
    def ArrayArrayNumber(self) -> typing.Union[ArrayArrayNumberTuple, schemas.Unset]:
        val = self.get("ArrayArrayNumber", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            ArrayArrayNumberTuple,
            val
        )
    
    def get_additional_property_(self, name: str) -> typing.Union[schemas.OUTPUT_BASE_TYPES, schemas.Unset]:
        schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
        return self.get(name, schemas.unset)

    @staticmethod
    def from_dict_(
        arg: ArrayOfArrayOfNumberOnlyDictInput,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ArrayOfArrayOfNumberOnlyDict:
        return ArrayOfArrayOfNumberOnly.validate(arg, configuration=configuration)
    
    def __new__(
        cls,
        ArrayArrayNumber: typing.Union[
            ArrayArrayNumberTupleInput,
            ArrayArrayNumberTuple,
            schemas.Unset
        ] = schemas.unset,
        configuration_: typing.Optional[schema_configuration.SchemaConfiguration] = None,
        **kwargs: schemas.INPUT_TYPES_ALL,
    ):
        arg_ = {}
        for key, val in (
            ("ArrayArrayNumber", ArrayArrayNumber),
        ):
            if isinstance(val, schemas.Unset):
                continue
            arg_[key] = val
        arg_.update(kwargs)
        return ArrayOfArrayOfNumberOnly.validate(arg_, configuration=configuration_)
ArrayOfArrayOfNumberOnlyDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL]


@dataclasses.dataclass(frozen=True)
class ArrayOfArrayOfNumberOnly(
    schemas.Schema[ArrayOfArrayOfNumberOnlyDict, tuple]
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
            schemas.immutabledict: ArrayOfArrayOfNumberOnlyDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            ArrayOfArrayOfNumberOnlyDictInput,
            ArrayOfArrayOfNumberOnlyDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ArrayOfArrayOfNumberOnlyDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )


# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

Items: typing_extensions.TypeAlias = schemas.StrSchema


class ArrayOfStringTuple(
    typing.Tuple[
        str,
        ...
    ]
):

    def __new__(cls, arg: ArrayOfStringTupleInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return ArrayOfString.validate(arg, configuration=configuration)
ArrayOfStringTupleInput = typing.Union[
    typing.List[
        str,
    ],
    typing.Tuple[
        str,
        ...
    ]
]


@dataclasses.dataclass(frozen=True)
class ArrayOfString(
    schemas.Schema[schemas.immutabledict, ArrayOfStringTuple]
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
        return super().validate_base(
            arg,
            configuration=configuration,
        )
Items3: typing_extensions.TypeAlias = schemas.Int64Schema


class ItemsTuple(
    typing.Tuple[
        int,
        ...
    ]
):

    def __new__(cls, arg: ItemsTupleInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return Items2.validate(arg, configuration=configuration)
ItemsTupleInput = typing.Union[
    typing.List[
        int,
    ],
    typing.Tuple[
        int,
        ...
    ]
]


@dataclasses.dataclass(frozen=True)
class Items2(
    schemas.Schema[schemas.immutabledict, ItemsTuple]
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
        return super().validate_base(
            arg,
            configuration=configuration,
        )


class ArrayArrayOfIntegerTuple(
    typing.Tuple[
        ItemsTuple,
        ...
    ]
):

    def __new__(cls, arg: ArrayArrayOfIntegerTupleInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return ArrayArrayOfInteger.validate(arg, configuration=configuration)
ArrayArrayOfIntegerTupleInput = typing.Union[
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
class ArrayArrayOfInteger(
    schemas.Schema[schemas.immutabledict, ArrayArrayOfIntegerTuple]
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
        return super().validate_base(
            arg,
            configuration=configuration,
        )

from petstore_api.components.schema import read_only_first


class ItemsTuple2(
    typing.Tuple[
        read_only_first.ReadOnlyFirstDict,
        ...
    ]
):

    def __new__(cls, arg: ItemsTupleInput2, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return Items4.validate(arg, configuration=configuration)
ItemsTupleInput2 = typing.Union[
    typing.List[
        typing.Union[
            read_only_first.ReadOnlyFirstDictInput,
            read_only_first.ReadOnlyFirstDict,
        ],
    ],
    typing.Tuple[
        typing.Union[
            read_only_first.ReadOnlyFirstDictInput,
            read_only_first.ReadOnlyFirstDict,
        ],
        ...
    ]
]


@dataclasses.dataclass(frozen=True)
class Items4(
    schemas.Schema[schemas.immutabledict, ItemsTuple2]
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
        return super().validate_base(
            arg,
            configuration=configuration,
        )


class ArrayArrayOfModelTuple(
    typing.Tuple[
        ItemsTuple2,
        ...
    ]
):

    def __new__(cls, arg: ArrayArrayOfModelTupleInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return ArrayArrayOfModel.validate(arg, configuration=configuration)
ArrayArrayOfModelTupleInput = typing.Union[
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
class ArrayArrayOfModel(
    schemas.Schema[schemas.immutabledict, ArrayArrayOfModelTuple]
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
        return super().validate_base(
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


class ArrayTestDict(schemas.immutabledict[str, typing.Tuple[schemas.OUTPUT_BASE_TYPES]]):

    __required_keys__: typing.FrozenSet[str] = frozenset({
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
        "array_of_string",
        "array_array_of_integer",
        "array_array_of_model",
    })
    
    @property
    def array_of_string(self) -> typing.Union[ArrayOfStringTuple, schemas.Unset]:
        val = self.get("array_of_string", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            ArrayOfStringTuple,
            val
        )
    
    @property
    def array_array_of_integer(self) -> typing.Union[ArrayArrayOfIntegerTuple, schemas.Unset]:
        val = self.get("array_array_of_integer", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            ArrayArrayOfIntegerTuple,
            val
        )
    
    @property
    def array_array_of_model(self) -> typing.Union[ArrayArrayOfModelTuple, schemas.Unset]:
        val = self.get("array_array_of_model", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            ArrayArrayOfModelTuple,
            val
        )
    
    def get_additional_property_(self, name: str) -> typing.Union[schemas.OUTPUT_BASE_TYPES, schemas.Unset]:
        schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
        return self.get(name, schemas.unset)

    @staticmethod
    def from_dict_(
        arg: ArrayTestDictInput,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ArrayTestDict:
        return ArrayTest.validate(arg, configuration=configuration)
    
    def __new__(
        cls,
        array_of_string: typing.Union[
            ArrayOfStringTupleInput,
            ArrayOfStringTuple,
            schemas.Unset
        ] = schemas.unset,
        array_array_of_integer: typing.Union[
            ArrayArrayOfIntegerTupleInput,
            ArrayArrayOfIntegerTuple,
            schemas.Unset
        ] = schemas.unset,
        array_array_of_model: typing.Union[
            ArrayArrayOfModelTupleInput,
            ArrayArrayOfModelTuple,
            schemas.Unset
        ] = schemas.unset,
        configuration_: typing.Optional[schema_configuration.SchemaConfiguration] = None,
        **kwargs: schemas.INPUT_TYPES_ALL,
    ):
        arg_: typing.Dict[str, typing.Any] = {}
        for key, val in (
            ("array_of_string", array_of_string),
            ("array_array_of_integer", array_array_of_integer),
            ("array_array_of_model", array_array_of_model),
        ):
            if isinstance(val, schemas.Unset):
                continue
            arg_[key] = val
        arg_.update(kwargs)
        used_arg_ = typing.cast(ArrayTestDictInput, arg_)
        return ArrayTest.validate(used_arg_, configuration=configuration_)
ArrayTestDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL]


@dataclasses.dataclass(frozen=True)
class ArrayTest(
    schemas.Schema[ArrayTestDict, tuple]
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
            schemas.immutabledict: ArrayTestDict
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
        return super().validate_base(
            arg,
            configuration=configuration,
        )


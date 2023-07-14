# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

Items: typing_extensions.TypeAlias = schemas.NumberSchema


class ArrayNumberTuple(
    typing.Tuple[
        typing.Union[int, float],
        ...
    ]
):

    def __new__(cls, arg: ArrayNumberTupleInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return ArrayNumber.validate(arg, configuration=configuration)
ArrayNumberTupleInput = typing.Union[
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
class ArrayNumber(
    schemas.Schema[schemas.immutabledict, ArrayNumberTuple]
):
    types: typing.FrozenSet[typing.Type] = frozenset({tuple})
    items: typing.Type[Items] = dataclasses.field(default_factory=lambda: Items) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            tuple: ArrayNumberTuple
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            ArrayNumberTupleInput,
            ArrayNumberTuple,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ArrayNumberTuple:
        return super().validate_base(
            arg,
            configuration=configuration,
        )
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "ArrayNumber": typing.Type[ArrayNumber],
    }
)


class ArrayOfNumberOnlyDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    __required_keys__: typing.FrozenSet[str] = frozenset({
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
        "ArrayNumber",
    })
    
    def get_property(self, name: typing_extensions.Literal["ArrayNumber"]) -> ArrayNumberTuple:
        schemas.raise_if_key_unknown(name, self.__required_keys__, self.__optional_keys__)
        val = self.get(name, schemas.unset)
        if val is schemas.unset:
            return val
        return typing.cast(
            ArrayNumberTuple,
            val
        )
    
    def get_additional_property(self, name: str) -> schemas.OUTPUT_BASE_TYPES:
        schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
        return self.__getitem__(name)

    def __new__(cls, arg: ArrayOfNumberOnlyDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return ArrayOfNumberOnly.validate(arg, configuration=configuration)
ArrayOfNumberOnlyDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL]


@dataclasses.dataclass(frozen=True)
class ArrayOfNumberOnly(
    schemas.Schema[ArrayOfNumberOnlyDict, tuple]
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
            schemas.immutabledict: ArrayOfNumberOnlyDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            ArrayOfNumberOnlyDictInput,
            ArrayOfNumberOnlyDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ArrayOfNumberOnlyDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )


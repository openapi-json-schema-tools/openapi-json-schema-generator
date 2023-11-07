# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

AdditionalProperties: typing_extensions.TypeAlias = schemas.NotAnyTypeSchema
Count: typing_extensions.TypeAlias = schemas.IntSchema


class PaginatedResultMyObjectDtoDict(schemas.immutabledict[str, typing.Union[
    typing.Tuple[schemas.OUTPUT_BASE_TYPES],
    int,
]]):

    __required_keys__: typing.FrozenSet[str] = frozenset({
        "count",
        "results",
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
    })
    
    def __new__(
        cls,
        *,
        count: int,
        results: typing.Union[
            ResultsTupleInput,
            ResultsTuple
        ],
        configuration_: typing.Optional[schema_configuration.SchemaConfiguration] = None,
    ):
        arg_: typing.Dict[str, typing.Any] = {
            "count": count,
            "results": results,
        }
        used_arg_ = typing.cast(PaginatedResultMyObjectDtoDictInput, arg_)
        return PaginatedResultMyObjectDto.validate(used_arg_, configuration=configuration_)
    
    @staticmethod
    def from_dict_(
        arg: typing.Union[
            PaginatedResultMyObjectDtoDictInput,
            PaginatedResultMyObjectDtoDict
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> PaginatedResultMyObjectDtoDict:
        return PaginatedResultMyObjectDto.validate(arg, configuration=configuration)
    
    @property
    def count(self) -> int:
        return typing.cast(
            int,
            self.__getitem__("count")
        )
    
    @property
    def results(self) -> ResultsTuple:
        return typing.cast(
            ResultsTuple,
            self.__getitem__("results")
        )
PaginatedResultMyObjectDtoDictInput = typing.TypedDict(
    'PaginatedResultMyObjectDtoDictInput',
    {
        "count": int,
        "results": typing.Union[
            ResultsTupleInput,
            ResultsTuple
        ],
    }
)


@dataclasses.dataclass(frozen=True)
class PaginatedResultMyObjectDto(
    schemas.Schema[PaginatedResultMyObjectDtoDict, tuple]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    required: typing.FrozenSet[str] = frozenset({
        "count",
        "results",
    })
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    additional_properties: typing.Type[AdditionalProperties] = dataclasses.field(default_factory=lambda: AdditionalProperties) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: PaginatedResultMyObjectDtoDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            PaginatedResultMyObjectDtoDictInput,
            PaginatedResultMyObjectDtoDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> PaginatedResultMyObjectDtoDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )


from petstore_api.components.schema import my_object_dto


class ResultsTuple(
    typing.Tuple[
        my_object_dto.MyObjectDtoDict,
        ...
    ]
):

    def __new__(cls, arg: typing.Union[ResultsTupleInput, ResultsTuple], configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return Results.validate(arg, configuration=configuration)
ResultsTupleInput = typing.Union[
    typing.List[
        typing.Union[
            my_object_dto.MyObjectDtoDictInput,
            my_object_dto.MyObjectDtoDict,
        ],
    ],
    typing.Tuple[
        typing.Union[
            my_object_dto.MyObjectDtoDictInput,
            my_object_dto.MyObjectDtoDict,
        ],
        ...
    ]
]


@dataclasses.dataclass(frozen=True)
class Results(
    schemas.Schema[schemas.immutabledict, ResultsTuple]
):
    types: typing.FrozenSet[typing.Type] = frozenset({tuple})
    items: typing.Type[my_object_dto.MyObjectDto] = dataclasses.field(default_factory=lambda: my_object_dto.MyObjectDto) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            tuple: ResultsTuple
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            ResultsTupleInput,
            ResultsTuple,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ResultsTuple:
        return super().validate_base(
            arg,
            configuration=configuration,
        )
Properties = typing.TypedDict(
    'Properties',
    {
        "count": typing.Type[Count],
        "results": typing.Type[Results],
    }
)

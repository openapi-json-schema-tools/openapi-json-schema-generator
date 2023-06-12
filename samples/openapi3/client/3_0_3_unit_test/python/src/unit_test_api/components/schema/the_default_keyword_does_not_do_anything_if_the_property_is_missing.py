# coding: utf-8

"""
    openapi 3.0.3 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft6  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from unit_test_api.shared_imports.schema_imports import *



class Alpha(
    schemas.NumberSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({
            decimal.Decimal,
        })
        inclusive_maximum: typing.Union[int, float] = 3
        default: typing.Union[int, float] = 5
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "alpha": typing.Type[Alpha],
    }
)
DictInput = typing.Mapping[
    str,
    typing.Union[
        typing.Union[
            Alpha[decimal.Decimal],
            decimal.Decimal,
            int,
            float
        ],
        schemas.INPUT_TYPES_ALL_INCL_SCHEMA
    ]
]


class TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing(
    schemas.DictSchema[schemas.T]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({frozendict.frozendict})
        properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["alpha"]) -> Alpha[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.AnyTypeSchema[typing.Union[
        frozendict.frozendict,
        str,
        decimal.Decimal,
        schemas.BoolClass,
        schemas.NoneClass,
        tuple,
        bytes,
        schemas.FileIO
    ]]: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["alpha"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        arg: typing.Union[
            DictInput,
            TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing[frozendict.frozendict],
        ],
        configuration: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None
    ) -> TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            arg,
            configuration=configuration,
        )
        inst = typing.cast(
            TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing[frozendict.frozendict],
            inst
        )
        return inst


# coding: utf-8

"""
    openapi 3.0.3 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft6  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from unit_test_api.shared_imports.schema_imports import *

_02: typing_extensions.TypeAlias = schemas.NoneSchema[U]
AnyOf = typing.Tuple[
    typing.Type[_02[schemas.U]],
]
DictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL_INCL_SCHEMA]


class _0(
    schemas.AnyTypeSchema[schemas.T],
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        # any type
        any_of: AnyOf = dataclasses.field(default_factory=lambda: schemas.tuple_to_instance(AnyOf)) # type: ignore


    def __new__(
        cls,
        arg: typing.Union[
            DictInput,
            schemas.INPUT_TYPES_ALL_INCL_SCHEMA
        ],
        configuration: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None
    ) -> _0[
        typing.Union[
            frozendict.frozendict,
            str,
            decimal.Decimal,
            schemas.BoolClass,
            schemas.NoneClass,
            tuple,
            bytes,
            schemas.FileIO
        ]
    ]:
        inst = super().__new__(
            cls,
            arg,
            configuration=configuration,
        )
        inst = typing.cast(
            _0[
                typing.Union[
                    frozendict.frozendict,
                    str,
                    decimal.Decimal,
                    schemas.BoolClass,
                    schemas.NoneClass,
                    tuple,
                    bytes,
                    schemas.FileIO
                ]
            ],
            inst
        )
        return inst

AnyOf = typing.Tuple[
    typing.Type[_0[schemas.U]],
]
DictInput2 = typing.Mapping[str, schemas.INPUT_TYPES_ALL_INCL_SCHEMA]


class NestedAnyofToCheckValidationSemantics(
    schemas.AnyTypeSchema[schemas.T],
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        # any type
        any_of: AnyOf = dataclasses.field(default_factory=lambda: schemas.tuple_to_instance(AnyOf)) # type: ignore


    def __new__(
        cls,
        arg: typing.Union[
            DictInput2,
            schemas.INPUT_TYPES_ALL_INCL_SCHEMA
        ],
        configuration: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None
    ) -> NestedAnyofToCheckValidationSemantics[
        typing.Union[
            frozendict.frozendict,
            str,
            decimal.Decimal,
            schemas.BoolClass,
            schemas.NoneClass,
            tuple,
            bytes,
            schemas.FileIO
        ]
    ]:
        inst = super().__new__(
            cls,
            arg,
            configuration=configuration,
        )
        inst = typing.cast(
            NestedAnyofToCheckValidationSemantics[
                typing.Union[
                    frozendict.frozendict,
                    str,
                    decimal.Decimal,
                    schemas.BoolClass,
                    schemas.NoneClass,
                    tuple,
                    bytes,
                    schemas.FileIO
                ]
            ],
            inst
        )
        return inst


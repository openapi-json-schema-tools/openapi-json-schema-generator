# coding: utf-8

"""
    openapi 3.0.3 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft6  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from unit_test_api.shared_imports.schema_imports import *



class SimpleEnumValidationEnums:

    @schemas.classproperty
    def POSITIVE_1(cls) -> int:
        return SimpleEnumValidation.validate(1)

    @schemas.classproperty
    def POSITIVE_2(cls) -> int:
        return SimpleEnumValidation.validate(2)

    @schemas.classproperty
    def POSITIVE_3(cls) -> int:
        return SimpleEnumValidation.validate(3)


@dataclasses.dataclass(frozen=True)
class SimpleEnumValidation(
    schemas.NumberSchema
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({
        float,
        int,
    })
    enum_value_to_name: typing.Mapping[typing.Union[int, float, str, bool, schemas.none_type_], str] = dataclasses.field(
        default_factory=lambda: {
            1: "POSITIVE_1",
            2: "POSITIVE_2",
            3: "POSITIVE_3",
        }
    )
    enums = SimpleEnumValidationEnums

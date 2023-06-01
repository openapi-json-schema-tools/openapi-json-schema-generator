# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *



class Schema(
    schemas.Float64Schema[schemas.T]
):


    class Schema_:
        types: typing.FrozenSet[typing.Type] = frozenset({
            decimal.Decimal,
        })
        format = 'double'
        enum_value_to_name = {
            1.1: "POSITIVE_1_PT_1",
            -1.2: "NEGATIVE_1_PT_2",
        }
    
    @schemas.classproperty
    def POSITIVE_1_PT_1(cls):
        return cls(1.1) # type: ignore
    
    @schemas.classproperty
    def NEGATIVE_1_PT_2(cls):
        return cls(-1.2) # type: ignore

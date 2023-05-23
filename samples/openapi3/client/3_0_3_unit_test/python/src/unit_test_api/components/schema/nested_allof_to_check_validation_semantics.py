# coding: utf-8

"""
    openapi 3.0.3 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft6  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from unit_test_api.shared_imports.schema_imports import *


class NestedAllofToCheckValidationSemantics(
    schemas.AnyTypeSchema[schemas.T],
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    class Schema_:
        # any type
        
        class AllOf:
            
            
            class _0(
                schemas.AnyTypeSchema[schemas.T],
            ):
            
            
                class Schema_:
                    # any type
                    
                    class AllOf:
                        _0: typing_extensions.TypeAlias = schemas.NoneSchema[U]
                        classes = [
                            _0,
                        ]
            
            
                def __new__(
                    cls,
                    *args_: typing.Union[dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader],
                    configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
                    **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema],
                ) -> NestedAllofToCheckValidationSemantics.Schema_.AllOf._0[
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
                        *args_,
                        configuration_=configuration_,
                        **kwargs,
                    )
                    inst = typing.cast(
                        NestedAllofToCheckValidationSemantics.Schema_.AllOf._0[
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
            classes = [
                _0,
            ]


    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema],
    ) -> NestedAllofToCheckValidationSemantics[
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
            *args_,
            configuration_=configuration_,
            **kwargs,
        )
        inst = typing.cast(
            NestedAllofToCheckValidationSemantics[
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

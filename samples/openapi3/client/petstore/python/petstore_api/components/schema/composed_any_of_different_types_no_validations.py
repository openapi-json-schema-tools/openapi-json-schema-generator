# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""

from datetime import date, datetime  # noqa: F401
import decimal  # noqa: F401
import functools  # noqa: F401
import io  # noqa: F401
import re  # noqa: F401
import typing  # noqa: F401
import typing_extensions  # noqa: F401
import uuid  # noqa: F401

import frozendict  # noqa: F401

from petstore_api import schemas  # noqa: F401


class ComposedAnyOfDifferentTypesNoValidations(
    schemas.AnyTypeSchema,
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        # any type
        
        class any_of:
            anyOf_0 = schemas.DictSchema
            anyOf_1 = schemas.DateSchema
            anyOf_2 = schemas.DateTimeSchema
            anyOf_3 = schemas.BinarySchema
            anyOf_4 = schemas.StrSchema
            anyOf_5 = schemas.StrSchema
            anyOf_6 = schemas.DictSchema
            anyOf_7 = schemas.BoolSchema
            anyOf_8 = schemas.NoneSchema
            
            
            class anyOf_9(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    types = {tuple}
                    items = schemas.AnyTypeSchema
            
                def __new__(
                    cls,
                    _arg: typing.Union[typing.Tuple[typing.Union[MetaOapg.items, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ]], typing.List[typing.Union[MetaOapg.items, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ]]],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'anyOf_9':
                    return super().__new__(
                        cls,
                        _arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> MetaOapg.items:
                    return super().__getitem__(i)
            anyOf_10 = schemas.NumberSchema
            anyOf_11 = schemas.Float32Schema
            anyOf_12 = schemas.Float64Schema
            anyOf_13 = schemas.IntSchema
            anyOf_14 = schemas.Int32Schema
            anyOf_15 = schemas.Int64Schema
            classes = [
                anyOf_0,
                anyOf_1,
                anyOf_2,
                anyOf_3,
                anyOf_4,
                anyOf_5,
                anyOf_6,
                anyOf_7,
                anyOf_8,
                anyOf_9,
                anyOf_10,
                anyOf_11,
                anyOf_12,
                anyOf_13,
                anyOf_14,
                anyOf_15,
            ]


    def __new__(
        cls,
        *_args: typing.Union[dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'ComposedAnyOfDifferentTypesNoValidations':
        return super().__new__(
            cls,
            *_args,
            _configuration=_configuration,
            **kwargs,
        )

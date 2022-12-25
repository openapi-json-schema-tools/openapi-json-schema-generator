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


class Quadrilateral(
    schemas.AnyTypeSchema,
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        # any type
        
        @staticmethod
        def discriminator():
            return {
                'quadrilateralType': {
                    'ComplexQuadrilateral': complex_quadrilateral.ComplexQuadrilateral,
                    'SimpleQuadrilateral': simple_quadrilateral.SimpleQuadrilateral,
                }
            }
        
        class OneOf:
        
            @staticmethod
            def one_of0() -> typing.Type['simple_quadrilateral.SimpleQuadrilateral']:
                return simple_quadrilateral.SimpleQuadrilateral
        
            @staticmethod
            def one_of1() -> typing.Type['complex_quadrilateral.ComplexQuadrilateral']:
                return complex_quadrilateral.ComplexQuadrilateral
            classes = [
                one_of0,
                one_of1,
            ]


    def __new__(
        cls,
        *_args: typing.Union[dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'Quadrilateral':
        return super().__new__(
            cls,
            *_args,
            _configuration=_configuration,
            **kwargs,
        )

from petstore_api.components.schema import complex_quadrilateral
from petstore_api.components.schema import simple_quadrilateral

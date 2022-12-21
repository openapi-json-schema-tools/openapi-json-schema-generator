# coding: utf-8

"""


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


class ShapeOrNull(
    schemas.AnyTypeSchema,
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.

    The value may be a shape or the 'null' value. This is introduced in OAS schema >= 3.1.
    """


    class MetaOapg:
        # any type
        
        @staticmethod
        def discriminator():
            return {
                'shapeType': {
                    'Quadrilateral': quadrilateral.Quadrilateral,
                    'Triangle': triangle.Triangle,
                }
            }
        
        class OneOf:
            OneOf0 = schemas.NoneSchema
        
            @staticmethod
            def one_of_1() -> typing.Type['triangle.Triangle']:
                return triangle.Triangle
        
            @staticmethod
            def one_of_2() -> typing.Type['quadrilateral.Quadrilateral']:
                return quadrilateral.Quadrilateral
            classes = [
                OneOf0,
                one_of_1,
                one_of_2,
            ]


    def __new__(
        cls,
        *_args: typing.Union[dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'ShapeOrNull':
        return super().__new__(
            cls,
            *_args,
            _configuration=_configuration,
            **kwargs,
        )

from petstore_api.components.schema import quadrilateral
from petstore_api.components.schema import triangle

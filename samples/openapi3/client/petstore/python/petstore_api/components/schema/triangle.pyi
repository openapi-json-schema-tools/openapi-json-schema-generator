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


class Triangle(
    schemas.ComposedSchema,
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        
        @staticmethod
        def discriminator():
            return {
                'triangleType': {
                    'EquilateralTriangle': EquilateralTriangle,
                    'IsoscelesTriangle': IsoscelesTriangle,
                    'ScaleneTriangle': ScaleneTriangle,
                }
            }
        
        @classmethod
        @functools.lru_cache()
        def one_of(cls):
            # we need this here to make our import statements work
            # we must store _composed_schemas in here so the code is only run
            # when we invoke this method. If we kept this at the class
            # level we would get an error because the class level
            # code would be run when this module is imported, and these composed
            # classes don't exist yet because their module has not finished
            # loading
            return [
                equilateral_triangle.EquilateralTriangle,
                isosceles_triangle.IsoscelesTriangle,
                scalene_triangle.ScaleneTriangle,
            ]


    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'Triangle':
        return super().__new__(
            cls,
            *args,
            _configuration=_configuration,
            **kwargs,
        )

from petstore_api.components.schema.equilateral_triangle import EquilateralTriangle
from petstore_api.components.schema.equilateral_triangle_equilateral_triangle import EquilateralTriangleEquilateralTriangle
from petstore_api.components.schema.isosceles_triangle import IsoscelesTriangle
from petstore_api.components.schema.isosceles_triangle_isosceles_triangle import IsoscelesTriangleIsoscelesTriangle
from petstore_api.components.schema.scalene_triangle import ScaleneTriangle
from petstore_api.components.schema.scalene_triangle_scalene_triangle import ScaleneTriangleScaleneTriangle

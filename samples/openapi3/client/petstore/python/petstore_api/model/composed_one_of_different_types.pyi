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


class ComposedOneOfDifferentTypes(
    schemas.ComposedSchema,
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.

    this is a model that allows payloads of type object or number
    """


    class MetaOapg:
        one_of_2 = schemas.NoneSchema
        one_of_3 = schemas.DateSchema
        
        
        class one_of_4(
            schemas.DictSchema
        ):
        
            def __new__(
                cls,
                *_args: typing.Union[dict, frozendict.frozendict, ],
                _configuration: typing.Optional[schemas.Configuration] = None,
                **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
            ) -> 'one_of_4':
                return super().__new__(
                    cls,
                    *_args,
                    _configuration=_configuration,
                    **kwargs,
                )        
        
        class one_of_5(
            schemas.ListSchema
        ):
        
        
            class MetaOapg:
                items = schemas.AnyTypeSchema
        
            def __new__(
                cls,
                _arg: typing.Union[typing.Tuple[typing.Union[MetaOapg.items, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ]], typing.List[typing.Union[MetaOapg.items, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ]]],
                _configuration: typing.Optional[schemas.Configuration] = None,
            ) -> 'one_of_5':
                return super().__new__(
                    cls,
                    _arg,
                    _configuration=_configuration,
                )        
            def __getitem__(self, i: int) -> MetaOapg.items:
                return super().__getitem__(i)
        
        
        class one_of_6(
            schemas.DateTimeSchema
        ):
            pass
        
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
                NumberWithValidations,
                Animal,
                cls.one_of_2,
                cls.one_of_3,
                cls.one_of_4,
                cls.one_of_5,
                cls.one_of_6,
            ]


    def __new__(
        cls,
        *_args: typing.Union[dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'ComposedOneOfDifferentTypes':
        return super().__new__(
            cls,
            *_args,
            _configuration=_configuration,
            **kwargs,
        )
from petstore_api.model.animal import Animal
from petstore_api.model.number_with_validations import NumberWithValidations

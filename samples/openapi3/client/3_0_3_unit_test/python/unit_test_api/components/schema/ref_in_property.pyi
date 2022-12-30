# coding: utf-8

"""
    openapi 3.0.3 sample spec

    sample spec for testing openapi functionality, built from json schema tests for draft6  # noqa: E501

    The version of the OpenAPI document: 0.0.1
    Generated by: https://openapi-generator.tech
"""

import datetime  # noqa: F401
import decimal  # noqa: F401
import functools  # noqa: F401
import io  # noqa: F401
import re  # noqa: F401
import typing  # noqa: F401
import typing_extensions  # noqa: F401
import uuid  # noqa: F401

import frozendict  # noqa: F401

from unit_test_api import schemas  # noqa: F401


class RefInProperty(
    schemas.AnyTypeSchema,
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class Schema_:
        # any type
        
        class Properties:
        
            @staticmethod
            def a() -> typing.Type['property_named_ref_that_is_not_a_reference.PropertyNamedRefThatIsNotAReference']:
                return property_named_ref_that_is_not_a_reference.PropertyNamedRefThatIsNotAReference
            __annotations__ = {
                "a": a,
            }

    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["a"]) -> 'property_named_ref_that_is_not_a_reference.PropertyNamedRefThatIsNotAReference': ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["a"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_(self, name: typing_extensions.Literal["a"]) -> typing.Union['property_named_ref_that_is_not_a_reference.PropertyNamedRefThatIsNotAReference', schemas.Unset]: ...
    
    @typing.overload
    def get_item_(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_(
        self,
        name: typing.Union[
            typing_extensions.Literal["a"],
            str
        ]
    ):
        return super().get_item_(name)

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
        a: typing.Union['property_named_ref_that_is_not_a_reference.PropertyNamedRefThatIsNotAReference', schemas.Unset] = schemas.unset,
        configuration_: typing.Optional[schemas.configuration_module.Configuration] = None,
        **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema],
    ) -> 'RefInProperty':
        return super().__new__(
            cls,
            *args_,
            a=a,
            configuration_=configuration_,
            **kwargs,
        )

from unit_test_api.components.schema import property_named_ref_that_is_not_a_reference

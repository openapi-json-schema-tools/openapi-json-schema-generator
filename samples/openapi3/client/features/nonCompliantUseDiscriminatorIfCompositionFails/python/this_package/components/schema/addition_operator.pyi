# coding: utf-8

"""
    discriminator-test

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)  # noqa: E501

    The version of the OpenAPI document: 1.0
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

from this_package import schemas  # noqa: F401


class AdditionOperator(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        required = {
            "a",
            "b",
            "operator_id",
        }
        
        class properties:
            a = schemas.Float64Schema
            b = schemas.Float64Schema
            operator_id = schemas.StrSchema
            __annotations__ = {
                "a": a,
                "b": b,
                "operator_id": operator_id,
            }
        additional_properties = schemas.NotAnyTypeSchema
    
    a: MetaOapg.properties.a
    b: MetaOapg.properties.b
    operator_id: MetaOapg.properties.operator_id
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["a"]) -> MetaOapg.properties.a: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["b"]) -> MetaOapg.properties.b: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["operator_id"]) -> MetaOapg.properties.operator_id: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["a"], typing_extensions.Literal["b"], typing_extensions.Literal["operator_id"], ]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["a"]) -> MetaOapg.properties.a: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["b"]) -> MetaOapg.properties.b: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["operator_id"]) -> MetaOapg.properties.operator_id: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["a"], typing_extensions.Literal["b"], typing_extensions.Literal["operator_id"], ]):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *_args: typing.Union[dict, frozendict.frozendict, ],
        a: typing.Union[MetaOapg.properties.a, decimal.Decimal, int, float, ],
        b: typing.Union[MetaOapg.properties.b, decimal.Decimal, int, float, ],
        operator_id: typing.Union[MetaOapg.properties.operator_id, str, ],
        _configuration: typing.Optional[schemas.Configuration] = None,
    ) -> 'AdditionOperator':
        return super().__new__(
            cls,
            *_args,
            a=a,
            b=b,
            operator_id=operator_id,
            _configuration=_configuration,
        )
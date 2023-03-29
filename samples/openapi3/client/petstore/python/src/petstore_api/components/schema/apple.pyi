# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
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

from petstore_api import schemas  # noqa: F401


class Apple(
    schemas.NoneBase,
    schemas.DictBase,
    schemas.Schema,
    schemas.NoneFrozenDictMixin
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    class Schema_:
        types = {
            schemas.NoneClass,
            frozendict.frozendict,
        }
        required = {
            "cultivar",
        }
        
        class Properties:
            
            
            class Cultivar(
                schemas.StrSchema
            ):
                pass
            
            
            class Origin(
                schemas.StrSchema
            ):
                pass
            __annotations__ = {
                "cultivar": Cultivar,
                "origin": Origin,
            }

    
    cultivar: Schema_.Properties.Cultivar
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["cultivar"]) -> Schema_.Properties.Cultivar: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["origin"]) -> Schema_.Properties.Origin: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["cultivar"],
            typing_extensions.Literal["origin"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_(self, name: typing_extensions.Literal["cultivar"]) -> Schema_.Properties.Cultivar: ...
    
    @typing.overload
    def get_item_(self, name: typing_extensions.Literal["origin"]) -> typing.Union[Schema_.Properties.Origin, schemas.Unset]: ...
    
    @typing.overload
    def get_item_(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_(
        self,
        name: typing.Union[
            typing_extensions.Literal["cultivar"],
            typing_extensions.Literal["origin"],
            str
        ]
    ):
        return super().get_item_(name)

    def __new__(
        cls,
        *args_: typing.Union[Nonedict, frozendict.frozendict],
        origin: typing.Union[Schema_.Properties.Origin, str, schemas.Unset] = schemas.unset,
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema],
    ) -> 'Apple':
        return super().__new__(
            cls,
            *args_,
            origin=origin,
            configuration_=configuration_,
            **kwargs,
        )

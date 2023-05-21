# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *


class Name(
    schemas.AnyTypeSchema[schemas.T],
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.

    Model for testing model name same as property name
    """


    class Schema_:
        # any type
        required = {
            "name",
        }
        
        class Properties:
            Name: typing_extensions.TypeAlias = schemas.Int32Schema[U]
            SnakeCase: typing_extensions.TypeAlias = schemas.Int32Schema[U]
            _Property: typing_extensions.TypeAlias = schemas.StrSchema[U]
            __annotations__ = {
                "name": Name,
                "snake_case": SnakeCase,
                "property": _Property,
            }

    
    @property
    def name(self) -> Schema_.Properties.Name[decimal.Decimal]:
        return self.__getitem__("name")
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["name"]) -> Schema_.Properties.Name[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["snake_case"]) -> Schema_.Properties.SnakeCase[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["property"]) -> Schema_.Properties._Property[str]: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.AnyTypeSchema[typing.Union[
        frozendict.frozendict,
        str,
        decimal.Decimal,
        schemas.BoolClass,
        schemas.NoneClass,
        tuple,
        bytes,
        schemas.FileIO
    ]]: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["name"],
            typing_extensions.Literal["snake_case"],
            typing_extensions.Literal["property"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)


# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import datetime  # noqa: F401
import decimal  # noqa: F401
import io  # noqa: F401
import re  # noqa: F401
import typing  # noqa: F401
import typing_extensions  # noqa: F401
import uuid  # noqa: F401

import frozendict  # noqa: F401

from petstore_api import schemas  # noqa: F401


class ObjectModelWithRefProps(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.

    a model that includes properties which should stay primitive (String + Boolean) and one which is defined as a class, NumberWithValidations
    """


    class Schema_:
        types = {frozendict.frozendict}
        
        class Properties:
        
            @staticmethod
            def my_number() -> typing.Type['number_with_validations.NumberWithValidations']:
                return number_with_validations.NumberWithValidations
        
            @staticmethod
            def my_string() -> typing.Type['string.String']:
                return string.String
        
            @staticmethod
            def my_boolean() -> typing.Type['boolean.Boolean']:
                return boolean.Boolean
            __annotations__ = {
                "myNumber": my_number,
                "myString": my_string,
                "myBoolean": my_boolean,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["myNumber"]) -> 'number_with_validations.NumberWithValidations': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["myString"]) -> 'string.String': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["myBoolean"]) -> 'boolean.Boolean': ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["myNumber"],
            typing_extensions.Literal["myString"],
            typing_extensions.Literal["myBoolean"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict],
        myNumber: typing.Union['number_with_validations.NumberWithValidations', decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
        myString: typing.Union['string.String', str, schemas.Unset] = schemas.unset,
        myBoolean: typing.Union['boolean.Boolean', bool, schemas.Unset] = schemas.unset,
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema],
    ) -> 'ObjectModelWithRefProps':
        return super().__new__(
            cls,
            *args_,
            myNumber=myNumber,
            myString=myString,
            myBoolean=myBoolean,
            configuration_=configuration_,
            **kwargs,
        )

from petstore_api.components.schema import boolean
from petstore_api.components.schema import number_with_validations
from petstore_api.components.schema import string

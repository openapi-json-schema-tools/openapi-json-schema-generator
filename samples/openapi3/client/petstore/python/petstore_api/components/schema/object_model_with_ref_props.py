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


class ObjectModelWithRefProps(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.

    a model that includes properties which should stay primitive (String + Boolean) and one which is defined as a class, NumberWithValidations
    """


    class MetaOapg:
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
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["myNumber"]) -> typing.Union['number_with_validations.NumberWithValidations', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["myString"]) -> typing.Union['string.String', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["myBoolean"]) -> typing.Union['boolean.Boolean', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(
        self,
        name: typing.Union[
            typing_extensions.Literal["myNumber"],
            typing_extensions.Literal["myString"],
            typing_extensions.Literal["myBoolean"],
            str
        ]
    ):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *_args: typing.Union[dict, frozendict.frozendict, ],
        myNumber: typing.Union['number_with_validations.NumberWithValidations', schemas.Unset] = schemas.unset,
        myString: typing.Union['string.String', schemas.Unset] = schemas.unset,
        myBoolean: typing.Union['boolean.Boolean', schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'ObjectModelWithRefProps':
        return super().__new__(
            cls,
            *_args,
            myNumber=myNumber,
            myString=myString,
            myBoolean=myBoolean,
            _configuration=_configuration,
            **kwargs,
        )

from petstore_api.components.schema import boolean
from petstore_api.components.schema import number_with_validations
from petstore_api.components.schema import string

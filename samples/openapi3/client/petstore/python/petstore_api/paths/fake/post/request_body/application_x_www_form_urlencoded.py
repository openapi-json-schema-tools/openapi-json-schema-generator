# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
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

from petstore_api import schemas  # noqa: F401


class ApplicationXWwwFormUrlencoded(
    schemas.DictSchema
):


    class MetaOapg:
        types = {frozendict.frozendict}
        required = {
            "byte",
            "double",
            "number",
            "pattern_without_delimiter",
        }
        
        class Properties:
            
            
            class Integer(
                schemas.IntSchema
            ):
            
            
                class MetaOapg:
                    types = {
                        decimal.Decimal,
                    }
                    format = 'int'
                    inclusive_maximum = 100
                    inclusive_minimum = 10
            
            
            class Int32(
                schemas.Int32Schema
            ):
            
            
                class MetaOapg:
                    types = {
                        decimal.Decimal,
                    }
                    format = 'int32'
                    inclusive_maximum = 200
                    inclusive_minimum = 20
            Int64 = schemas.Int64Schema
            
            
            class Number(
                schemas.NumberSchema
            ):
            
            
                class MetaOapg:
                    types = {
                        decimal.Decimal,
                    }
                    inclusive_maximum = 543.2
                    inclusive_minimum = 32.1
            
            
            class _Float(
                schemas.Float32Schema
            ):
            
            
                class MetaOapg:
                    types = {
                        decimal.Decimal,
                    }
                    format = 'float'
                    inclusive_maximum = 987.6
            
            
            class Double(
                schemas.Float64Schema
            ):
            
            
                class MetaOapg:
                    types = {
                        decimal.Decimal,
                    }
                    format = 'double'
                    inclusive_maximum = 123.4
                    inclusive_minimum = 67.8
            
            
            class String(
                schemas.StrSchema
            ):
            
            
                class MetaOapg:
                    types = {
                        str,
                    }
                    regex={
                        'pattern': r'[a-z]',  # noqa: E501
                        'flags': (
                            re.IGNORECASE
                        )
                    }
            
            
            class PatternWithoutDelimiter(
                schemas.StrSchema
            ):
            
            
                class MetaOapg:
                    types = {
                        str,
                    }
                    regex={
                        'pattern': r'^[A-Z].*',  # noqa: E501
                    }
            Byte = schemas.StrSchema
            Binary = schemas.BinarySchema
            Date = schemas.DateSchema
            DateTime = schemas.DateTimeSchema
            
            
            class Password(
                schemas.StrSchema
            ):
            
            
                class MetaOapg:
                    types = {
                        str,
                    }
                    format = 'password'
                    max_length = 64
                    min_length = 10
            Callback = schemas.StrSchema
            __annotations__ = {
                "integer": Integer,
                "int32": Int32,
                "int64": Int64,
                "number": Number,
                "float": _Float,
                "double": Double,
                "string": String,
                "pattern_without_delimiter": PatternWithoutDelimiter,
                "byte": Byte,
                "binary": Binary,
                "date": Date,
                "dateTime": DateTime,
                "password": Password,
                "callback": Callback,
            }
    
    byte: MetaOapg.Properties.Byte
    double: MetaOapg.Properties.Double
    number: MetaOapg.Properties.Number
    pattern_without_delimiter: MetaOapg.Properties.PatternWithoutDelimiter
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["byte"]) -> MetaOapg.Properties.Byte: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["double"]) -> MetaOapg.Properties.Double: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["number"]) -> MetaOapg.Properties.Number: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["pattern_without_delimiter"]) -> MetaOapg.Properties.PatternWithoutDelimiter: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["integer"]) -> MetaOapg.Properties.Integer: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["int32"]) -> MetaOapg.Properties.Int32: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["int64"]) -> MetaOapg.Properties.Int64: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["float"]) -> MetaOapg.Properties._Float: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["string"]) -> MetaOapg.Properties.String: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["binary"]) -> MetaOapg.Properties.Binary: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["date"]) -> MetaOapg.Properties.Date: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["dateTime"]) -> MetaOapg.Properties.DateTime: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["password"]) -> MetaOapg.Properties.Password: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["callback"]) -> MetaOapg.Properties.Callback: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["byte"],
            typing_extensions.Literal["double"],
            typing_extensions.Literal["number"],
            typing_extensions.Literal["pattern_without_delimiter"],
            typing_extensions.Literal["integer"],
            typing_extensions.Literal["int32"],
            typing_extensions.Literal["int64"],
            typing_extensions.Literal["float"],
            typing_extensions.Literal["string"],
            typing_extensions.Literal["binary"],
            typing_extensions.Literal["date"],
            typing_extensions.Literal["dateTime"],
            typing_extensions.Literal["password"],
            typing_extensions.Literal["callback"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["byte"]) -> MetaOapg.Properties.Byte: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["double"]) -> MetaOapg.Properties.Double: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["number"]) -> MetaOapg.Properties.Number: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["pattern_without_delimiter"]) -> MetaOapg.Properties.PatternWithoutDelimiter: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["integer"]) -> typing.Union[MetaOapg.Properties.Integer, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["int32"]) -> typing.Union[MetaOapg.Properties.Int32, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["int64"]) -> typing.Union[MetaOapg.Properties.Int64, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["float"]) -> typing.Union[MetaOapg.Properties._Float, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["string"]) -> typing.Union[MetaOapg.Properties.String, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["binary"]) -> typing.Union[MetaOapg.Properties.Binary, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["date"]) -> typing.Union[MetaOapg.Properties.Date, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["dateTime"]) -> typing.Union[MetaOapg.Properties.DateTime, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["password"]) -> typing.Union[MetaOapg.Properties.Password, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["callback"]) -> typing.Union[MetaOapg.Properties.Callback, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(
        self,
        name: typing.Union[
            typing_extensions.Literal["byte"],
            typing_extensions.Literal["double"],
            typing_extensions.Literal["number"],
            typing_extensions.Literal["pattern_without_delimiter"],
            typing_extensions.Literal["integer"],
            typing_extensions.Literal["int32"],
            typing_extensions.Literal["int64"],
            typing_extensions.Literal["float"],
            typing_extensions.Literal["string"],
            typing_extensions.Literal["binary"],
            typing_extensions.Literal["date"],
            typing_extensions.Literal["dateTime"],
            typing_extensions.Literal["password"],
            typing_extensions.Literal["callback"],
            str
        ]
    ):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *_args: typing.Union[dict, frozendict.frozendict, ],
        byte: typing.Union[MetaOapg.Properties.Byte, str, ],
        double: typing.Union[MetaOapg.Properties.Double, decimal.Decimal, int, float, ],
        number: typing.Union[MetaOapg.Properties.Number, decimal.Decimal, int, float, ],
        pattern_without_delimiter: typing.Union[MetaOapg.Properties.PatternWithoutDelimiter, str, ],
        integer: typing.Union[MetaOapg.Properties.Integer, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        int32: typing.Union[MetaOapg.Properties.Int32, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        int64: typing.Union[MetaOapg.Properties.Int64, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        string: typing.Union[MetaOapg.Properties.String, str, schemas.Unset] = schemas.unset,
        binary: typing.Union[MetaOapg.Properties.Binary, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        date: typing.Union[MetaOapg.Properties.Date, str, datetime.date, schemas.Unset] = schemas.unset,
        dateTime: typing.Union[MetaOapg.Properties.DateTime, str, datetime.datetime, schemas.Unset] = schemas.unset,
        password: typing.Union[MetaOapg.Properties.Password, str, schemas.Unset] = schemas.unset,
        callback: typing.Union[MetaOapg.Properties.Callback, str, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, io.FileIO, io.BufferedReader, schemas.Schema],
    ) -> 'ApplicationXWwwFormUrlencoded':
        return super().__new__(
            cls,
            *_args,
            byte=byte,
            double=double,
            number=number,
            pattern_without_delimiter=pattern_without_delimiter,
            integer=integer,
            int32=int32,
            int64=int64,
            string=string,
            binary=binary,
            date=date,
            dateTime=dateTime,
            password=password,
            callback=callback,
            _configuration=_configuration,
            **kwargs,
        )

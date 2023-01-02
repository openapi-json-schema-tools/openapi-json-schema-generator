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


class AnyTypeAndFormat(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    class Schema_:
        
        class Properties:
            
            
            class Uuid(
                schemas.UUIDBase,
                schemas.AnyTypeSchema,
            ):
            
            
                class Schema_:
                    # any type
                    format = 'uuid'
            
            
                def __new__(
                    cls,
                    *args_: typing.Union[dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
                    configuration_: typing.Optional[schemas.configuration_module.Configuration] = None,
                    **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema],
                ) -> 'Uuid':
                    return super().__new__(
                        cls,
                        *args_,
                        configuration_=configuration_,
                        **kwargs,
                    )
            
            
            class Date(
                schemas.DateBase,
                schemas.AnyTypeSchema,
            ):
            
            
                class Schema_:
                    # any type
                    format = 'date'
            
            
                def __new__(
                    cls,
                    *args_: typing.Union[dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
                    configuration_: typing.Optional[schemas.configuration_module.Configuration] = None,
                    **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema],
                ) -> 'Date':
                    return super().__new__(
                        cls,
                        *args_,
                        configuration_=configuration_,
                        **kwargs,
                    )
            
            
            class DateTime(
                schemas.DateTimeBase,
                schemas.AnyTypeSchema,
            ):
            
            
                class Schema_:
                    # any type
                    format = 'date-time'
            
            
                def __new__(
                    cls,
                    *args_: typing.Union[dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
                    configuration_: typing.Optional[schemas.configuration_module.Configuration] = None,
                    **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema],
                ) -> 'DateTime':
                    return super().__new__(
                        cls,
                        *args_,
                        configuration_=configuration_,
                        **kwargs,
                    )
            
            
            class Number(
                schemas.DecimalBase,
                schemas.AnyTypeSchema,
            ):
            
            
                class Schema_:
                    # any type
                    format = 'number'
            
            
                def __new__(
                    cls,
                    *args_: typing.Union[dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
                    configuration_: typing.Optional[schemas.configuration_module.Configuration] = None,
                    **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema],
                ) -> 'Number':
                    return super().__new__(
                        cls,
                        *args_,
                        configuration_=configuration_,
                        **kwargs,
                    )
            
            
            class Binary(
                schemas.AnyTypeSchema,
            ):
            
            
                class Schema_:
                    # any type
                    format = 'binary'
            
            
                def __new__(
                    cls,
                    *args_: typing.Union[dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
                    configuration_: typing.Optional[schemas.configuration_module.Configuration] = None,
                    **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema],
                ) -> 'Binary':
                    return super().__new__(
                        cls,
                        *args_,
                        configuration_=configuration_,
                        **kwargs,
                    )
            
            
            class Int32(
                schemas.AnyTypeSchema,
            ):
            
            
                class Schema_:
                    # any type
                    format = 'int32'
            
            
                def __new__(
                    cls,
                    *args_: typing.Union[dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
                    configuration_: typing.Optional[schemas.configuration_module.Configuration] = None,
                    **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema],
                ) -> 'Int32':
                    return super().__new__(
                        cls,
                        *args_,
                        configuration_=configuration_,
                        **kwargs,
                    )
            
            
            class Int64(
                schemas.AnyTypeSchema,
            ):
            
            
                class Schema_:
                    # any type
                    format = 'int64'
            
            
                def __new__(
                    cls,
                    *args_: typing.Union[dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
                    configuration_: typing.Optional[schemas.configuration_module.Configuration] = None,
                    **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema],
                ) -> 'Int64':
                    return super().__new__(
                        cls,
                        *args_,
                        configuration_=configuration_,
                        **kwargs,
                    )
            
            
            class Double(
                schemas.AnyTypeSchema,
            ):
            
            
                class Schema_:
                    # any type
                    format = 'double'
            
            
                def __new__(
                    cls,
                    *args_: typing.Union[dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
                    configuration_: typing.Optional[schemas.configuration_module.Configuration] = None,
                    **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema],
                ) -> 'Double':
                    return super().__new__(
                        cls,
                        *args_,
                        configuration_=configuration_,
                        **kwargs,
                    )
            
            
            class _Float(
                schemas.AnyTypeSchema,
            ):
            
            
                class Schema_:
                    # any type
                    format = 'float'
            
            
                def __new__(
                    cls,
                    *args_: typing.Union[dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
                    configuration_: typing.Optional[schemas.configuration_module.Configuration] = None,
                    **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema],
                ) -> '_Float':
                    return super().__new__(
                        cls,
                        *args_,
                        configuration_=configuration_,
                        **kwargs,
                    )
            __annotations__ = {
                "uuid": Uuid,
                "date": Date,
                "date-time": DateTime,
                "number": Number,
                "binary": Binary,
                "int32": Int32,
                "int64": Int64,
                "double": Double,
                "float": _Float,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["uuid"]) -> Schema_.Properties.Uuid: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["date"]) -> Schema_.Properties.Date: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["date-time"]) -> Schema_.Properties.DateTime: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["number"]) -> Schema_.Properties.Number: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["binary"]) -> Schema_.Properties.Binary: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["int32"]) -> Schema_.Properties.Int32: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["int64"]) -> Schema_.Properties.Int64: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["double"]) -> Schema_.Properties.Double: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["float"]) -> Schema_.Properties._Float: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["uuid"],
            typing_extensions.Literal["date"],
            typing_extensions.Literal["date-time"],
            typing_extensions.Literal["number"],
            typing_extensions.Literal["binary"],
            typing_extensions.Literal["int32"],
            typing_extensions.Literal["int64"],
            typing_extensions.Literal["double"],
            typing_extensions.Literal["float"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_(self, name: typing_extensions.Literal["uuid"]) -> typing.Union[Schema_.Properties.Uuid, schemas.Unset]: ...
    
    @typing.overload
    def get_item_(self, name: typing_extensions.Literal["date"]) -> typing.Union[Schema_.Properties.Date, schemas.Unset]: ...
    
    @typing.overload
    def get_item_(self, name: typing_extensions.Literal["date-time"]) -> typing.Union[Schema_.Properties.DateTime, schemas.Unset]: ...
    
    @typing.overload
    def get_item_(self, name: typing_extensions.Literal["number"]) -> typing.Union[Schema_.Properties.Number, schemas.Unset]: ...
    
    @typing.overload
    def get_item_(self, name: typing_extensions.Literal["binary"]) -> typing.Union[Schema_.Properties.Binary, schemas.Unset]: ...
    
    @typing.overload
    def get_item_(self, name: typing_extensions.Literal["int32"]) -> typing.Union[Schema_.Properties.Int32, schemas.Unset]: ...
    
    @typing.overload
    def get_item_(self, name: typing_extensions.Literal["int64"]) -> typing.Union[Schema_.Properties.Int64, schemas.Unset]: ...
    
    @typing.overload
    def get_item_(self, name: typing_extensions.Literal["double"]) -> typing.Union[Schema_.Properties.Double, schemas.Unset]: ...
    
    @typing.overload
    def get_item_(self, name: typing_extensions.Literal["float"]) -> typing.Union[Schema_.Properties._Float, schemas.Unset]: ...
    
    @typing.overload
    def get_item_(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_(
        self,
        name: typing.Union[
            typing_extensions.Literal["uuid"],
            typing_extensions.Literal["date"],
            typing_extensions.Literal["date-time"],
            typing_extensions.Literal["number"],
            typing_extensions.Literal["binary"],
            typing_extensions.Literal["int32"],
            typing_extensions.Literal["int64"],
            typing_extensions.Literal["double"],
            typing_extensions.Literal["float"],
            str
        ]
    ):
        return super().get_item_(name)

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict, ],
        uuid: typing.Union[Schema_.Properties.Uuid, dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        date: typing.Union[Schema_.Properties.Date, dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        number: typing.Union[Schema_.Properties.Number, dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        binary: typing.Union[Schema_.Properties.Binary, dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        int32: typing.Union[Schema_.Properties.Int32, dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        int64: typing.Union[Schema_.Properties.Int64, dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        double: typing.Union[Schema_.Properties.Double, dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        configuration_: typing.Optional[schemas.configuration_module.Configuration] = None,
        **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema],
    ) -> 'AnyTypeAndFormat':
        return super().__new__(
            cls,
            *args_,
            uuid=uuid,
            date=date,
            number=number,
            binary=binary,
            int32=int32,
            int64=int64,
            double=double,
            configuration_=configuration_,
            **kwargs,
        )
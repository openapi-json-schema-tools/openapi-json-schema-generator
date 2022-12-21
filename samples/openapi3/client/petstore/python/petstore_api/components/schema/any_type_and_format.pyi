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


class AnyTypeAndFormat(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        
        class Properties:
            
            
            class Uuid(
                schemas.UUIDBase,
                schemas.AnyTypeSchema,
            ):
            
            
                class MetaOapg:
                    # any type
                    format = 'uuid'
            
            
                def __new__(
                    cls,
                    *_args: typing.Union[dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
                ) -> 'Uuid':
                    return super().__new__(
                        cls,
                        *_args,
                        _configuration=_configuration,
                        **kwargs,
                    )
            
            
            class Date(
                schemas.DateBase,
                schemas.AnyTypeSchema,
            ):
            
            
                class MetaOapg:
                    # any type
                    format = 'date'
            
            
                def __new__(
                    cls,
                    *_args: typing.Union[dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
                ) -> 'Date':
                    return super().__new__(
                        cls,
                        *_args,
                        _configuration=_configuration,
                        **kwargs,
                    )
            
            
            class DateTime(
                schemas.DateTimeBase,
                schemas.AnyTypeSchema,
            ):
            
            
                class MetaOapg:
                    # any type
                    format = 'date-time'
            
            
                def __new__(
                    cls,
                    *_args: typing.Union[dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
                ) -> 'DateTime':
                    return super().__new__(
                        cls,
                        *_args,
                        _configuration=_configuration,
                        **kwargs,
                    )
            
            
            class Number(
                schemas.DecimalBase,
                schemas.AnyTypeSchema,
            ):
            
            
                class MetaOapg:
                    # any type
                    format = 'number'
            
            
                def __new__(
                    cls,
                    *_args: typing.Union[dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
                ) -> 'Number':
                    return super().__new__(
                        cls,
                        *_args,
                        _configuration=_configuration,
                        **kwargs,
                    )
            
            
            class Binary(
                schemas.AnyTypeSchema,
            ):
            
            
                class MetaOapg:
                    # any type
                    format = 'binary'
            
            
                def __new__(
                    cls,
                    *_args: typing.Union[dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
                ) -> 'Binary':
                    return super().__new__(
                        cls,
                        *_args,
                        _configuration=_configuration,
                        **kwargs,
                    )
            
            
            class Int32(
                schemas.AnyTypeSchema,
            ):
            
            
                class MetaOapg:
                    # any type
                    format = 'int32'
            
            
                def __new__(
                    cls,
                    *_args: typing.Union[dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
                ) -> 'Int32':
                    return super().__new__(
                        cls,
                        *_args,
                        _configuration=_configuration,
                        **kwargs,
                    )
            
            
            class Int64(
                schemas.AnyTypeSchema,
            ):
            
            
                class MetaOapg:
                    # any type
                    format = 'int64'
            
            
                def __new__(
                    cls,
                    *_args: typing.Union[dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
                ) -> 'Int64':
                    return super().__new__(
                        cls,
                        *_args,
                        _configuration=_configuration,
                        **kwargs,
                    )
            
            
            class Double(
                schemas.AnyTypeSchema,
            ):
            
            
                class MetaOapg:
                    # any type
                    format = 'double'
            
            
                def __new__(
                    cls,
                    *_args: typing.Union[dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
                ) -> 'Double':
                    return super().__new__(
                        cls,
                        *_args,
                        _configuration=_configuration,
                        **kwargs,
                    )
            
            
            class ModelFloat(
                schemas.AnyTypeSchema,
            ):
            
            
                class MetaOapg:
                    # any type
                    format = 'float'
            
            
                def __new__(
                    cls,
                    *_args: typing.Union[dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
                ) -> 'ModelFloat':
                    return super().__new__(
                        cls,
                        *_args,
                        _configuration=_configuration,
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
                "float": ModelFloat,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["uuid"]) -> MetaOapg.Properties.Uuid: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["date"]) -> MetaOapg.Properties.Date: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["date-time"]) -> MetaOapg.Properties.DateTime: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["number"]) -> MetaOapg.Properties.Number: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["binary"]) -> MetaOapg.Properties.Binary: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["int32"]) -> MetaOapg.Properties.Int32: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["int64"]) -> MetaOapg.Properties.Int64: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["double"]) -> MetaOapg.Properties.Double: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["float"]) -> MetaOapg.Properties.ModelFloat: ...
    
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
    def get_item_oapg(self, name: typing_extensions.Literal["uuid"]) -> typing.Union[MetaOapg.Properties.Uuid, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["date"]) -> typing.Union[MetaOapg.Properties.Date, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["date-time"]) -> typing.Union[MetaOapg.Properties.DateTime, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["number"]) -> typing.Union[MetaOapg.Properties.Number, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["binary"]) -> typing.Union[MetaOapg.Properties.Binary, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["int32"]) -> typing.Union[MetaOapg.Properties.Int32, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["int64"]) -> typing.Union[MetaOapg.Properties.Int64, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["double"]) -> typing.Union[MetaOapg.Properties.Double, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["float"]) -> typing.Union[MetaOapg.Properties.ModelFloat, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(
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
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *_args: typing.Union[dict, frozendict.frozendict, ],
        uuid: typing.Union[MetaOapg.Properties.Uuid, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        date: typing.Union[MetaOapg.Properties.Date, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        number: typing.Union[MetaOapg.Properties.Number, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        binary: typing.Union[MetaOapg.Properties.Binary, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        int32: typing.Union[MetaOapg.Properties.Int32, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        int64: typing.Union[MetaOapg.Properties.Int64, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        double: typing.Union[MetaOapg.Properties.Double, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'AnyTypeAndFormat':
        return super().__new__(
            cls,
            *_args,
            uuid=uuid,
            date=date,
            number=number,
            binary=binary,
            int32=int32,
            int64=int64,
            double=double,
            _configuration=_configuration,
            **kwargs,
        )

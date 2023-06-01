# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *



class Integer(
    schemas.IntSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_:
        types: typing.FrozenSet[typing.Type] = frozenset({
            decimal.Decimal,
        })
        format: str = 'int'
        inclusive_maximum: typing.Union[int, float] = 100
        inclusive_minimum: typing.Union[int, float] = 10


class Int32(
    schemas.Int32Schema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_:
        types: typing.FrozenSet[typing.Type] = frozenset({
            decimal.Decimal,
        })
        format: str = 'int32'
        inclusive_maximum: typing.Union[int, float] = 200
        inclusive_minimum: typing.Union[int, float] = 20
Int64: typing_extensions.TypeAlias = schemas.Int64Schema[U]


class Number(
    schemas.NumberSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_:
        types: typing.FrozenSet[typing.Type] = frozenset({
            decimal.Decimal,
        })
        inclusive_maximum: typing.Union[int, float] = 543.2
        inclusive_minimum: typing.Union[int, float] = 32.1


class _Float(
    schemas.Float32Schema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_:
        types: typing.FrozenSet[typing.Type] = frozenset({
            decimal.Decimal,
        })
        format: str = 'float'
        inclusive_maximum: typing.Union[int, float] = 987.6


class Double(
    schemas.Float64Schema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_:
        types: typing.FrozenSet[typing.Type] = frozenset({
            decimal.Decimal,
        })
        format: str = 'double'
        inclusive_maximum: typing.Union[int, float] = 123.4
        inclusive_minimum: typing.Union[int, float] = 67.8


class String(
    schemas.StrSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_:
        types: typing.FrozenSet[typing.Type] = frozenset({
            str,
        })
        regex={
            'pattern': r'[a-z]',  # noqa: E501
            'flags': re.I,
        }


class PatternWithoutDelimiter(
    schemas.StrSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_:
        types: typing.FrozenSet[typing.Type] = frozenset({
            str,
        })
        regex={
            'pattern': r'^[A-Z].*',  # noqa: E501
        }
Byte: typing_extensions.TypeAlias = schemas.StrSchema[U]
Binary: typing_extensions.TypeAlias = schemas.BinarySchema[U]
Date: typing_extensions.TypeAlias = schemas.DateSchema[U]


class DateTime(
    schemas.DateTimeSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_:
        types: typing.FrozenSet[typing.Type] = frozenset({
            str,
        })
        format: str = 'date-time'


class Password(
    schemas.StrSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_:
        types: typing.FrozenSet[typing.Type] = frozenset({
            str,
        })
        format: str = 'password'
        max_length: int = 64
        min_length: int = 10
Callback: typing_extensions.TypeAlias = schemas.StrSchema[U]


class Schema(
    schemas.DictSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_:
        types: typing.FrozenSet[typing.Type] = frozenset({frozendict.frozendict})
        required: typing.FrozenSet[str] = frozenset({
            "byte",
            "double",
            "number",
            "pattern_without_delimiter",
        })
        properties: SchemaProperties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(SchemaProperties)) # type: ignore
    
    @property
    def byte(self) -> Byte[str]:
        return self.__getitem__("byte")
    
    @property
    def double(self) -> Double[decimal.Decimal]:
        return self.__getitem__("double")
    
    @property
    def number(self) -> Number[decimal.Decimal]:
        return self.__getitem__("number")
    
    @property
    def pattern_without_delimiter(self) -> PatternWithoutDelimiter[str]:
        return self.__getitem__("pattern_without_delimiter")
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["byte"]) -> Byte[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["double"]) -> Double[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["number"]) -> Number[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["pattern_without_delimiter"]) -> PatternWithoutDelimiter[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["integer"]) -> Integer[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["int32"]) -> Int32[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["int64"]) -> Int64[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["float"]) -> _Float[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["string"]) -> String[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["binary"]) -> Binary[typing.Union[bytes, schemas.FileIO]]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["date"]) -> Date[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["dateTime"]) -> DateTime[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["password"]) -> Password[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["callback"]) -> Callback[str]: ...
    
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

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict],
        byte: typing.Union[
            Byte[str],
            str
        ],
        double: typing.Union[
            Double[decimal.Decimal],
            decimal.Decimal,
            int,
            float
        ],
        number: typing.Union[
            Number[decimal.Decimal],
            decimal.Decimal,
            int,
            float
        ],
        pattern_without_delimiter: typing.Union[
            PatternWithoutDelimiter[str],
            str
        ],
        integer: typing.Union[
            Integer[decimal.Decimal],
            schemas.Unset,
            decimal.Decimal,
            int
        ] = schemas.unset,
        int32: typing.Union[
            Int32[decimal.Decimal],
            schemas.Unset,
            decimal.Decimal,
            int
        ] = schemas.unset,
        int64: typing.Union[
            Int64[decimal.Decimal],
            schemas.Unset,
            decimal.Decimal,
            int
        ] = schemas.unset,
        string: typing.Union[
            String[str],
            schemas.Unset,
            str
        ] = schemas.unset,
        binary: typing.Union[
            Binary[typing.Union[bytes, schemas.FileIO]],
            schemas.Unset,
            bytes,
            io.FileIO,
            io.BufferedReader
        ] = schemas.unset,
        date: typing.Union[
            Date[str],
            schemas.Unset,
            str,
            datetime.date
        ] = schemas.unset,
        dateTime: typing.Union[
            DateTime[str],
            schemas.Unset,
            str,
            datetime.datetime
        ] = schemas.unset,
        password: typing.Union[
            Password[str],
            schemas.Unset,
            str
        ] = schemas.unset,
        callback: typing.Union[
            Callback[str],
            schemas.Unset,
            str
        ] = schemas.unset,
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: typing.Union[
            dict,
            frozendict.frozendict,
            list,
            tuple,
            decimal.Decimal,
            float,
            int,
            str,
            datetime.date,
            datetime.datetime,
            uuid.UUID,
            bool,
            None,
            bytes,
            io.FileIO,
            io.BufferedReader,
            schemas.Schema
        ],
    ) -> Schema[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            *args_,
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
            configuration_=configuration_,
            **kwargs,
        )
        inst = typing.cast(
            Schema[frozendict.frozendict],
            inst
        )
        return inst

SchemaProperties = typing_extensions.TypedDict(
    'SchemaProperties',
    {
        "integer": typing.Type[Integer],
        "int32": typing.Type[Int32],
        "int64": typing.Type[Int64],
        "number": typing.Type[Number],
        "float": typing.Type[_Float],
        "double": typing.Type[Double],
        "string": typing.Type[String],
        "pattern_without_delimiter": typing.Type[PatternWithoutDelimiter],
        "byte": typing.Type[Byte],
        "binary": typing.Type[Binary],
        "date": typing.Type[Date],
        "dateTime": typing.Type[DateTime],
        "password": typing.Type[Password],
        "callback": typing.Type[Callback],
    }
)

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
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({
            decimal.Decimal,
        })
        format: str = 'int'
        inclusive_maximum: typing.Union[int, float] = 100
        inclusive_minimum: typing.Union[int, float] = 10
        multiple_of: typing.Union[int, float] = 2
Int32: typing_extensions.TypeAlias = schemas.Int32Schema[U]


class Int32withValidations(
    schemas.Int32Schema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
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
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({
            decimal.Decimal,
        })
        inclusive_maximum: typing.Union[int, float] = 543.2
        inclusive_minimum: typing.Union[int, float] = 32.1
        multiple_of: typing.Union[int, float] = 32.5


class _Float(
    schemas.Float32Schema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({
            decimal.Decimal,
        })
        format: str = 'float'
        inclusive_maximum: typing.Union[int, float] = 987.6
        inclusive_minimum: typing.Union[int, float] = 54.3
Float32: typing_extensions.TypeAlias = schemas.Float32Schema[U]


class Double(
    schemas.Float64Schema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({
            decimal.Decimal,
        })
        format: str = 'double'
        inclusive_maximum: typing.Union[int, float] = 123.4
        inclusive_minimum: typing.Union[int, float] = 67.8
Float64: typing_extensions.TypeAlias = schemas.Float64Schema[U]
Items: typing_extensions.TypeAlias = schemas.NumberSchema[U]


class ArrayWithUniqueItems(
    schemas.ListSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({tuple})
        unique_items: bool = True
        items: typing.Type[Items] = dataclasses.field(default_factory=lambda: Items) # type: ignore

    def __new__(
        cls,
        arg_: typing.Sequence[
            typing.Union[
                Items[decimal.Decimal],
                decimal.Decimal,
                int,
                float
            ]
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None
    ) -> ArrayWithUniqueItems[tuple]:
        inst = super().__new__(
            cls,
            arg_,
            configuration_=configuration_,
        )
        inst = typing.cast(
            ArrayWithUniqueItems[tuple],
            inst
        )
        return inst

    def __getitem__(self, name: int) -> Items[decimal.Decimal]:
        return super().__getitem__(name)



class String(
    schemas.StrSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({
            str,
        })
        pattern: schemas.PatternInfo = schemas.PatternInfo(
            pattern=r'[a-z]',  # noqa: E501
            flags=re.I,
        )
Byte: typing_extensions.TypeAlias = schemas.StrSchema[U]
Binary: typing_extensions.TypeAlias = schemas.BinarySchema[U]
Date: typing_extensions.TypeAlias = schemas.DateSchema[U]
DateTime: typing_extensions.TypeAlias = schemas.DateTimeSchema[U]
Uuid: typing_extensions.TypeAlias = schemas.UUIDSchema[U]
UuidNoExample: typing_extensions.TypeAlias = schemas.UUIDSchema[U]


class Password(
    schemas.StrSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({
            str,
        })
        format: str = 'password'
        max_length: int = 64
        min_length: int = 10


class PatternWithDigits(
    schemas.StrSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({
            str,
        })
        pattern: schemas.PatternInfo = schemas.PatternInfo(
            pattern=r'^\d{10}$'  # noqa: E501
        )


class PatternWithDigitsAndDelimiter(
    schemas.StrSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({
            str,
        })
        pattern: schemas.PatternInfo = schemas.PatternInfo(
            pattern=r'^image_\d{1,3}$',  # noqa: E501
            flags=re.I,
        )
NoneProp: typing_extensions.TypeAlias = schemas.NoneSchema[U]
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "integer": typing.Type[Integer],
        "int32": typing.Type[Int32],
        "int32withValidations": typing.Type[Int32withValidations],
        "int64": typing.Type[Int64],
        "number": typing.Type[Number],
        "float": typing.Type[_Float],
        "float32": typing.Type[Float32],
        "double": typing.Type[Double],
        "float64": typing.Type[Float64],
        "arrayWithUniqueItems": typing.Type[ArrayWithUniqueItems],
        "string": typing.Type[String],
        "byte": typing.Type[Byte],
        "binary": typing.Type[Binary],
        "date": typing.Type[Date],
        "dateTime": typing.Type[DateTime],
        "uuid": typing.Type[Uuid],
        "uuidNoExample": typing.Type[UuidNoExample],
        "password": typing.Type[Password],
        "pattern_with_digits": typing.Type[PatternWithDigits],
        "pattern_with_digits_and_delimiter": typing.Type[PatternWithDigitsAndDelimiter],
        "noneProp": typing.Type[NoneProp],
    }
)


class FormatTest(
    schemas.DictSchema[schemas.T]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({frozendict.frozendict})
        required: typing.FrozenSet[str] = frozenset({
            "byte",
            "date",
            "number",
            "password",
        })
        properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    
    @property
    def byte(self) -> Byte[str]:
        return self.__getitem__("byte")
    
    @property
    def date(self) -> Date[str]:
        return self.__getitem__("date")
    
    @property
    def number(self) -> Number[decimal.Decimal]:
        return self.__getitem__("number")
    
    @property
    def password(self) -> Password[str]:
        return self.__getitem__("password")
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["byte"]) -> Byte[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["date"]) -> Date[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["number"]) -> Number[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["password"]) -> Password[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["integer"]) -> Integer[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["int32"]) -> Int32[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["int32withValidations"]) -> Int32withValidations[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["int64"]) -> Int64[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["float"]) -> _Float[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["float32"]) -> Float32[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["double"]) -> Double[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["float64"]) -> Float64[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["arrayWithUniqueItems"]) -> ArrayWithUniqueItems[tuple]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["string"]) -> String[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["binary"]) -> Binary[typing.Union[bytes, schemas.FileIO]]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["dateTime"]) -> DateTime[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["uuid"]) -> Uuid[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["uuidNoExample"]) -> UuidNoExample[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["pattern_with_digits"]) -> PatternWithDigits[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["pattern_with_digits_and_delimiter"]) -> PatternWithDigitsAndDelimiter[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["noneProp"]) -> NoneProp[schemas.NoneClass]: ...
    
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
            typing_extensions.Literal["date"],
            typing_extensions.Literal["number"],
            typing_extensions.Literal["password"],
            typing_extensions.Literal["integer"],
            typing_extensions.Literal["int32"],
            typing_extensions.Literal["int32withValidations"],
            typing_extensions.Literal["int64"],
            typing_extensions.Literal["float"],
            typing_extensions.Literal["float32"],
            typing_extensions.Literal["double"],
            typing_extensions.Literal["float64"],
            typing_extensions.Literal["arrayWithUniqueItems"],
            typing_extensions.Literal["string"],
            typing_extensions.Literal["binary"],
            typing_extensions.Literal["dateTime"],
            typing_extensions.Literal["uuid"],
            typing_extensions.Literal["uuidNoExample"],
            typing_extensions.Literal["pattern_with_digits"],
            typing_extensions.Literal["pattern_with_digits_and_delimiter"],
            typing_extensions.Literal["noneProp"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        arg_: typing.Union[
            DictInput,
            FormatTest[frozendict.frozendict],
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None
    ) -> FormatTest[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            arg_,
            configuration_=configuration_,
        )
        inst = typing.cast(
            FormatTest[frozendict.frozendict],
            inst
        )
        return inst


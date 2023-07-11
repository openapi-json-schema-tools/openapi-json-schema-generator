# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *



@dataclasses.dataclass(frozen=True)
class Integer(
    schemas.IntSchema
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        int,
    })
    format: str = 'int'
    inclusive_maximum: typing.Union[int, float] = 100
    inclusive_minimum: typing.Union[int, float] = 10
    multiple_of: typing.Union[int, float] = 2
Int32: typing_extensions.TypeAlias = schemas.Int32Schema


@dataclasses.dataclass(frozen=True)
class Int32withValidations(
    schemas.Int32Schema
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        int,
    })
    format: str = 'int32'
    inclusive_maximum: typing.Union[int, float] = 200
    inclusive_minimum: typing.Union[int, float] = 20
Int64: typing_extensions.TypeAlias = schemas.Int64Schema


@dataclasses.dataclass(frozen=True)
class Number(
    schemas.NumberSchema
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        float,
        int,
    })
    inclusive_maximum: typing.Union[int, float] = 543.2
    inclusive_minimum: typing.Union[int, float] = 32.1
    multiple_of: typing.Union[int, float] = 32.5


@dataclasses.dataclass(frozen=True)
class _Float(
    schemas.Float32Schema
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        float,
        int,
    })
    format: str = 'float'
    inclusive_maximum: typing.Union[int, float] = 987.6
    inclusive_minimum: typing.Union[int, float] = 54.3
Float32: typing_extensions.TypeAlias = schemas.Float32Schema


@dataclasses.dataclass(frozen=True)
class Double(
    schemas.Float64Schema
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        float,
        int,
    })
    format: str = 'double'
    inclusive_maximum: typing.Union[int, float] = 123.4
    inclusive_minimum: typing.Union[int, float] = 67.8
Float64: typing_extensions.TypeAlias = schemas.Float64Schema
Items: typing_extensions.TypeAlias = schemas.NumberSchema


class ArrayWithUniqueItemsTuple(typing.Tuple[schemas.OUTPUT_BASE_TYPES]):
    def __getitem__(self, name: int) -> typing.Union[float, int]:
        return super().__getitem__(name)

    def __new__(cls, arg: ArrayWithUniqueItemsTupleInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return ArrayWithUniqueItems.validate(arg, configuration=configuration)
ArrayWithUniqueItemsTupleInput = typing.Sequence[
    typing.Union[
        float,
        int
    ],
]


@dataclasses.dataclass(frozen=True)
class ArrayWithUniqueItems(
    schemas.ListSchema[ArrayWithUniqueItemsTuple]
):
    types: typing.FrozenSet[typing.Type] = frozenset({tuple})
    unique_items: bool = True
    items: typing.Type[Items] = dataclasses.field(default_factory=lambda: Items) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            tuple: ArrayWithUniqueItemsTuple
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            ArrayWithUniqueItemsTupleInput,
            ArrayWithUniqueItemsTuple,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ArrayWithUniqueItemsTuple:
        return super().validate_base(
            arg,
            configuration=configuration,
        )


@dataclasses.dataclass(frozen=True)
class String(
    schemas.StrSchema
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        str,
    })
    pattern: schemas.PatternInfo = schemas.PatternInfo(
        pattern=r'[a-z]',  # noqa: E501
        flags=re.I,
    )
Byte: typing_extensions.TypeAlias = schemas.StrSchema
Binary: typing_extensions.TypeAlias = schemas.BinarySchema
Date: typing_extensions.TypeAlias = schemas.DateSchema
DateTime: typing_extensions.TypeAlias = schemas.DateTimeSchema
Uuid: typing_extensions.TypeAlias = schemas.UUIDSchema
UuidNoExample: typing_extensions.TypeAlias = schemas.UUIDSchema


@dataclasses.dataclass(frozen=True)
class Password(
    schemas.StrSchema
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        str,
    })
    format: str = 'password'
    max_length: int = 64
    min_length: int = 10


@dataclasses.dataclass(frozen=True)
class PatternWithDigits(
    schemas.StrSchema
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        str,
    })
    pattern: schemas.PatternInfo = schemas.PatternInfo(
        pattern=r'^\d{10}$'  # noqa: E501
    )


@dataclasses.dataclass(frozen=True)
class PatternWithDigitsAndDelimiter(
    schemas.StrSchema
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        str,
    })
    pattern: schemas.PatternInfo = schemas.PatternInfo(
        pattern=r'^image_\d{1,3}$',  # noqa: E501
        flags=re.I,
    )
NoneProp: typing_extensions.TypeAlias = schemas.NoneSchema
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


class FormatTestDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    @property
    def byte(self) -> str:
        return self.__getitem__("byte")
    
    @property
    def date(self) -> str:
        return self.__getitem__("date")
    
    @property
    def number(self) -> typing.Union[float, int]:
        return self.__getitem__("number")
    
    @property
    def password(self) -> str:
        return self.__getitem__("password")
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["byte"]) -> str:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["date"]) -> str:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["number"]) -> typing.Union[float, int]:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["password"]) -> str:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["integer"]) -> int:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["int32"]) -> int:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["int32withValidations"]) -> int:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["int64"]) -> int:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["float"]) -> typing.Union[float, int]:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["float32"]) -> typing.Union[float, int]:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["double"]) -> typing.Union[float, int]:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["float64"]) -> typing.Union[float, int]:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["arrayWithUniqueItems"]) -> ArrayWithUniqueItemsTuple:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["string"]) -> str:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["binary"]) -> typing.Union[bytes, schemas.FileIO]:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["dateTime"]) -> str:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["uuid"]) -> str:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["uuidNoExample"]) -> str:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["pattern_with_digits"]) -> str:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["pattern_with_digits_and_delimiter"]) -> str:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["noneProp"]) -> None:
        ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.OUTPUT_BASE_TYPES: ...
    
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

    def __new__(cls, arg: FormatTestDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return FormatTest.validate(arg, configuration=configuration)
FormatTestDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL_INCL_SCHEMA]


@dataclasses.dataclass(frozen=True)
class FormatTest(
    schemas.Schema[FormatTestDict, tuple]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    required: typing.FrozenSet[str] = frozenset({
        "byte",
        "date",
        "number",
        "password",
    })
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: FormatTestDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            FormatTestDictInput,
            FormatTestDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> FormatTestDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )


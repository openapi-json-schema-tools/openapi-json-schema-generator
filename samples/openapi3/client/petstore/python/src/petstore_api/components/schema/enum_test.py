# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *


class EnumTest(
    schemas.DictSchema[schemas.T]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    class Schema_:
        types = {frozendict.frozendict}
        required = {
            "enum_string_required",
        }
        
        class Properties:
            
            
            class EnumString(
                schemas.StrSchema[schemas.T]
            ):
            
            
                class Schema_:
                    types = {
                        str,
                    }
                    enum_value_to_name = {
                        "UPPER": "UPPER",
                        "lower": "LOWER",
                        "": "EMPTY",
                    }
                
                @schemas.classproperty
                def UPPER(cls):
                    return cls("UPPER")
                
                @schemas.classproperty
                def LOWER(cls):
                    return cls("lower")
                
                @schemas.classproperty
                def EMPTY(cls):
                    return cls("")
            
            
            class EnumStringRequired(
                schemas.StrSchema[schemas.T]
            ):
            
            
                class Schema_:
                    types = {
                        str,
                    }
                    enum_value_to_name = {
                        "UPPER": "UPPER",
                        "lower": "LOWER",
                        "": "EMPTY",
                    }
                
                @schemas.classproperty
                def UPPER(cls):
                    return cls("UPPER")
                
                @schemas.classproperty
                def LOWER(cls):
                    return cls("lower")
                
                @schemas.classproperty
                def EMPTY(cls):
                    return cls("")
            
            
            class EnumInteger(
                schemas.Int32Schema[schemas.T]
            ):
            
            
                class Schema_:
                    types = {
                        decimal.Decimal,
                    }
                    format = 'int32'
                    enum_value_to_name = {
                        1: "POSITIVE_1",
                        -1: "NEGATIVE_1",
                    }
                
                @schemas.classproperty
                def POSITIVE_1(cls):
                    return cls(1)
                
                @schemas.classproperty
                def NEGATIVE_1(cls):
                    return cls(-1)
            
            
            class EnumNumber(
                schemas.Float64Schema[schemas.T]
            ):
            
            
                class Schema_:
                    types = {
                        decimal.Decimal,
                    }
                    format = 'double'
                    enum_value_to_name = {
                        1.1: "POSITIVE_1_PT_1",
                        -1.2: "NEGATIVE_1_PT_2",
                    }
                
                @schemas.classproperty
                def POSITIVE_1_PT_1(cls):
                    return cls(1.1)
                
                @schemas.classproperty
                def NEGATIVE_1_PT_2(cls):
                    return cls(-1.2)
        
            @staticmethod
            def string_enum() -> typing.Type[string_enum.StringEnum]:
                return string_enum.StringEnum
        
            @staticmethod
            def integer_enum() -> typing.Type[integer_enum.IntegerEnum]:
                return integer_enum.IntegerEnum
        
            @staticmethod
            def string_enum_with_default_value() -> typing.Type[string_enum_with_default_value.StringEnumWithDefaultValue]:
                return string_enum_with_default_value.StringEnumWithDefaultValue
        
            @staticmethod
            def integer_enum_with_default_value() -> typing.Type[integer_enum_with_default_value.IntegerEnumWithDefaultValue]:
                return integer_enum_with_default_value.IntegerEnumWithDefaultValue
        
            @staticmethod
            def integer_enum_one_value() -> typing.Type[integer_enum_one_value.IntegerEnumOneValue]:
                return integer_enum_one_value.IntegerEnumOneValue
            __annotations__ = {
                "enum_string": EnumString,
                "enum_string_required": EnumStringRequired,
                "enum_integer": EnumInteger,
                "enum_number": EnumNumber,
                "stringEnum": string_enum,
                "IntegerEnum": integer_enum,
                "StringEnumWithDefaultValue": string_enum_with_default_value,
                "IntegerEnumWithDefaultValue": integer_enum_with_default_value,
                "IntegerEnumOneValue": integer_enum_one_value,
            }
    
    @property
    def enum_string_required(self) -> Schema_.Properties.EnumStringRequired[str]:
        return self.__getitem__("enum_string_required")
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["enum_string_required"]) -> Schema_.Properties.EnumStringRequired[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["enum_string"]) -> Schema_.Properties.EnumString[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["enum_integer"]) -> Schema_.Properties.EnumInteger[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["enum_number"]) -> Schema_.Properties.EnumNumber[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["stringEnum"]) -> string_enum.StringEnum[typing.Union[
        schemas.NoneClass,
        str
    ]]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["IntegerEnum"]) -> integer_enum.IntegerEnum[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["StringEnumWithDefaultValue"]) -> string_enum_with_default_value.StringEnumWithDefaultValue[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["IntegerEnumWithDefaultValue"]) -> integer_enum_with_default_value.IntegerEnumWithDefaultValue[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["IntegerEnumOneValue"]) -> integer_enum_one_value.IntegerEnumOneValue[decimal.Decimal]: ...
    
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
            typing_extensions.Literal["enum_string_required"],
            typing_extensions.Literal["enum_string"],
            typing_extensions.Literal["enum_integer"],
            typing_extensions.Literal["enum_number"],
            typing_extensions.Literal["stringEnum"],
            typing_extensions.Literal["IntegerEnum"],
            typing_extensions.Literal["StringEnumWithDefaultValue"],
            typing_extensions.Literal["IntegerEnumWithDefaultValue"],
            typing_extensions.Literal["IntegerEnumOneValue"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict],
        enum_string_required: typing.Union[Schema_.Properties.EnumStringRequired, str],
        enum_string: typing.Union[Schema_.Properties.EnumString, str, schemas.Unset] = schemas.unset,
        enum_integer: typing.Union[Schema_.Properties.EnumInteger, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        enum_number: typing.Union[Schema_.Properties.EnumNumber, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
        stringEnum: typing.Union['string_enum.StringEnum', None, str, schemas.Unset] = schemas.unset,
        IntegerEnum: typing.Union['integer_enum.IntegerEnum', decimal.Decimal, int, schemas.Unset] = schemas.unset,
        StringEnumWithDefaultValue: typing.Union['string_enum_with_default_value.StringEnumWithDefaultValue', str, schemas.Unset] = schemas.unset,
        IntegerEnumWithDefaultValue: typing.Union['integer_enum_with_default_value.IntegerEnumWithDefaultValue', decimal.Decimal, int, schemas.Unset] = schemas.unset,
        IntegerEnumOneValue: typing.Union['integer_enum_one_value.IntegerEnumOneValue', decimal.Decimal, int, schemas.Unset] = schemas.unset,
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema],
    ) -> EnumTest[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            *args_,
            enum_string_required=enum_string_required,
            enum_string=enum_string,
            enum_integer=enum_integer,
            enum_number=enum_number,
            stringEnum=stringEnum,
            IntegerEnum=IntegerEnum,
            StringEnumWithDefaultValue=StringEnumWithDefaultValue,
            IntegerEnumWithDefaultValue=IntegerEnumWithDefaultValue,
            IntegerEnumOneValue=IntegerEnumOneValue,
            configuration_=configuration_,
            **kwargs,
        )
        inst = typing.cast(
            EnumTest[frozendict.frozendict],
            inst
        )
        return inst

from petstore_api.components.schema import integer_enum
from petstore_api.components.schema import integer_enum_one_value
from petstore_api.components.schema import integer_enum_with_default_value
from petstore_api.components.schema import string_enum
from petstore_api.components.schema import string_enum_with_default_value

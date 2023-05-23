# coding: utf-8

"""
    openapi 3.0.3 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft6  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from unit_test_api.shared_imports.schema_imports import *


class OneofWithRequired(
    schemas.DictSchema[schemas.T]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    class Schema_:
        types = {
            frozendict.frozendict,
        }
        
        class OneOf:
            
            
            class _0(
                schemas.AnyTypeSchema[schemas.T],
            ):
            
            
                class Schema_:
                    # any type
                    required = {
                        "bar",
                        "foo",
                    }
            
                
                @property
                def bar(self) -> schemas.AnyTypeSchema[typing.Union[
                    frozendict.frozendict,
                    str,
                    decimal.Decimal,
                    schemas.BoolClass,
                    schemas.NoneClass,
                    tuple,
                    bytes,
                    schemas.FileIO
                ]]:
                    return self.__getitem__("bar")
                
                @property
                def foo(self) -> schemas.AnyTypeSchema[typing.Union[
                    frozendict.frozendict,
                    str,
                    decimal.Decimal,
                    schemas.BoolClass,
                    schemas.NoneClass,
                    tuple,
                    bytes,
                    schemas.FileIO
                ]]:
                    return self.__getitem__("foo")
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["bar"]) -> schemas.AnyTypeSchema[typing.Union[
                    frozendict.frozendict,
                    str,
                    decimal.Decimal,
                    schemas.BoolClass,
                    schemas.NoneClass,
                    tuple,
                    bytes,
                    schemas.FileIO
                ]]: ...
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["foo"]) -> schemas.AnyTypeSchema[typing.Union[
                    frozendict.frozendict,
                    str,
                    decimal.Decimal,
                    schemas.BoolClass,
                    schemas.NoneClass,
                    tuple,
                    bytes,
                    schemas.FileIO
                ]]: ...
                
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
                        typing_extensions.Literal["bar"],
                        typing_extensions.Literal["foo"],
                        str
                    ]
                ):
                    # dict_instance[name] accessor
                    return super().__getitem__(name)
            
                def __new__(
                    cls,
                    *args_: typing.Union[dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader],
                    configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
                    **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema],
                ) -> OneofWithRequired.Schema_.OneOf._0[
                    typing.Union[
                        frozendict.frozendict,
                        str,
                        decimal.Decimal,
                        schemas.BoolClass,
                        schemas.NoneClass,
                        tuple,
                        bytes,
                        schemas.FileIO
                    ]
                ]:
                    inst = super().__new__(
                        cls,
                        *args_,
                        configuration_=configuration_,
                        **kwargs,
                    )
                    inst = typing.cast(
                        OneofWithRequired.Schema_.OneOf._0[
                            typing.Union[
                                frozendict.frozendict,
                                str,
                                decimal.Decimal,
                                schemas.BoolClass,
                                schemas.NoneClass,
                                tuple,
                                bytes,
                                schemas.FileIO
                            ]
                        ],
                        inst
                    )
                    return inst
            
            
            class _1(
                schemas.AnyTypeSchema[schemas.T],
            ):
            
            
                class Schema_:
                    # any type
                    required = {
                        "baz",
                        "foo",
                    }
            
                
                @property
                def baz(self) -> schemas.AnyTypeSchema[typing.Union[
                    frozendict.frozendict,
                    str,
                    decimal.Decimal,
                    schemas.BoolClass,
                    schemas.NoneClass,
                    tuple,
                    bytes,
                    schemas.FileIO
                ]]:
                    return self.__getitem__("baz")
                
                @property
                def foo(self) -> schemas.AnyTypeSchema[typing.Union[
                    frozendict.frozendict,
                    str,
                    decimal.Decimal,
                    schemas.BoolClass,
                    schemas.NoneClass,
                    tuple,
                    bytes,
                    schemas.FileIO
                ]]:
                    return self.__getitem__("foo")
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["baz"]) -> schemas.AnyTypeSchema[typing.Union[
                    frozendict.frozendict,
                    str,
                    decimal.Decimal,
                    schemas.BoolClass,
                    schemas.NoneClass,
                    tuple,
                    bytes,
                    schemas.FileIO
                ]]: ...
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["foo"]) -> schemas.AnyTypeSchema[typing.Union[
                    frozendict.frozendict,
                    str,
                    decimal.Decimal,
                    schemas.BoolClass,
                    schemas.NoneClass,
                    tuple,
                    bytes,
                    schemas.FileIO
                ]]: ...
                
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
                        typing_extensions.Literal["baz"],
                        typing_extensions.Literal["foo"],
                        str
                    ]
                ):
                    # dict_instance[name] accessor
                    return super().__getitem__(name)
            
                def __new__(
                    cls,
                    *args_: typing.Union[dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader],
                    configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
                    **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema],
                ) -> OneofWithRequired.Schema_.OneOf._1[
                    typing.Union[
                        frozendict.frozendict,
                        str,
                        decimal.Decimal,
                        schemas.BoolClass,
                        schemas.NoneClass,
                        tuple,
                        bytes,
                        schemas.FileIO
                    ]
                ]:
                    inst = super().__new__(
                        cls,
                        *args_,
                        configuration_=configuration_,
                        **kwargs,
                    )
                    inst = typing.cast(
                        OneofWithRequired.Schema_.OneOf._1[
                            typing.Union[
                                frozendict.frozendict,
                                str,
                                decimal.Decimal,
                                schemas.BoolClass,
                                schemas.NoneClass,
                                tuple,
                                bytes,
                                schemas.FileIO
                            ]
                        ],
                        inst
                    )
                    return inst
            classes = [
                _0,
                _1,
            ]


    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema],
    ) -> OneofWithRequired[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            *args_,
            configuration_=configuration_,
            **kwargs,
        )
        inst = typing.cast(
            OneofWithRequired[frozendict.frozendict],
            inst
        )
        return inst

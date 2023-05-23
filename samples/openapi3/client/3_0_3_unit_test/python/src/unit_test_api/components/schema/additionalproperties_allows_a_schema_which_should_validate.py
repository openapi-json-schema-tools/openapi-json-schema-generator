# coding: utf-8

"""
    openapi 3.0.3 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft6  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from unit_test_api.shared_imports.schema_imports import *


class AdditionalpropertiesAllowsASchemaWhichShouldValidate(
    schemas.DictSchema[schemas.T]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    class Schema_:
        types = {frozendict.frozendict}
        
        class Properties:
            Foo: typing_extensions.TypeAlias = schemas.AnyTypeSchema[U]
            Bar: typing_extensions.TypeAlias = schemas.AnyTypeSchema[U]
            __annotations__ = {
                "foo": Foo,
                "bar": Bar,
            }
        AdditionalProperties: typing_extensions.TypeAlias = schemas.BoolSchema[U]
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["foo"]) -> Schema_.Properties.Foo[typing.Union[
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
    def __getitem__(self, name: typing_extensions.Literal["bar"]) -> Schema_.Properties.Bar[typing.Union[
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
    def __getitem__(self, name: str) -> Schema_.AdditionalProperties[schemas.BoolClass]: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["foo"],
            typing_extensions.Literal["bar"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict],
        foo: typing.Union[Schema_.Properties.Foo, dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        bar: typing.Union[Schema_.Properties.Bar, dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset] = schemas.unset,
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: typing.Union[Schema_.AdditionalProperties, bool],
    ) -> AdditionalpropertiesAllowsASchemaWhichShouldValidate[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            *args_,
            foo=foo,
            bar=bar,
            configuration_=configuration_,
            **kwargs,
        )
        inst = typing.cast(
            AdditionalpropertiesAllowsASchemaWhichShouldValidate[frozendict.frozendict],
            inst
        )
        return inst

# coding: utf-8

"""
    discriminator-test
    No description provided (generated by Openapi JSON Schema Generator https://github.com/openapi-json-schema-tools/openapi-json-schema-generator)  # noqa: E501
    The version of the OpenAPI document: 1.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from this_package.shared_imports.schema_imports import *


class AdditionOperator(
    schemas.DictSchema[schemas.T]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    class Schema_:
        types = {frozendict.frozendict}
        required = {
            "a",
            "b",
            "operator_id",
        }
        
        class Properties:
            A: typing_extensions.TypeAlias = schemas.Float64Schema[U]
            B: typing_extensions.TypeAlias = schemas.Float64Schema[U]
            
            
            class OperatorId(
                schemas.StrSchema[schemas.T]
            ):
            
            
                class Schema_:
                    types = {
                        str,
                    }
                    default = "ADD"
            __annotations__ = {
                "a": A,
                "b": B,
                "operator_id": OperatorId,
            }
        AdditionalProperties: typing_extensions.TypeAlias = schemas.NotAnyTypeSchema[U]
    
    @property
    def a(self) -> Schema_.Properties.A[decimal.Decimal]:
        return self.__getitem__("a")
    
    @property
    def b(self) -> Schema_.Properties.B[decimal.Decimal]:
        return self.__getitem__("b")
    
    @property
    def operator_id(self) -> Schema_.Properties.OperatorId[str]:
        return self.__getitem__("operator_id")
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["a"]) -> Schema_.Properties.A[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["b"]) -> Schema_.Properties.B[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["operator_id"]) -> Schema_.Properties.OperatorId[str]: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["a"],
            typing_extensions.Literal["b"],
            typing_extensions.Literal["operator_id"],
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict],
        a: typing.Union[Schema_.Properties.A, decimal.Decimal, int, float],
        b: typing.Union[Schema_.Properties.B, decimal.Decimal, int, float],
        operator_id: typing.Union[Schema_.Properties.OperatorId, str],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
    ) -> AdditionOperator[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            *args_,
            a=a,
            b=b,
            operator_id=operator_id,
            configuration_=configuration_,
        )
        inst = typing.cast(
            AdditionOperator[frozendict.frozendict],
            inst
        )
        return inst

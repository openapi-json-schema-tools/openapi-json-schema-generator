# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *


class BananaReq(
    schemas.DictSchema[schemas.T]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    class Schema_:
        types = {frozendict.frozendict}
        required = {
            "lengthCm",
        }
        
        class Properties:
            LengthCm: typing_extensions.TypeAlias = schemas.NumberSchema[U]
            Sweet: typing_extensions.TypeAlias = schemas.BoolSchema[U]
            __annotations__ = {
                "lengthCm": LengthCm,
                "sweet": Sweet,
            }
        AdditionalProperties: typing_extensions.TypeAlias = schemas.NotAnyTypeSchema[U]
    
    @property
    def lengthCm(self) -> Schema_.Properties.LengthCm[decimal.Decimal]:
        return self.__getitem__("lengthCm")
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["lengthCm"]) -> Schema_.Properties.LengthCm[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["sweet"]) -> Schema_.Properties.Sweet[schemas.BoolClass]: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["lengthCm"],
            typing_extensions.Literal["sweet"],
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict],
        lengthCm: typing.Union[Schema_.Properties.LengthCm, decimal.Decimal, int, float],
        sweet: typing.Union[Schema_.Properties.Sweet, bool, schemas.Unset] = schemas.unset,
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
    ) -> BananaReq[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            *args_,
            lengthCm=lengthCm,
            sweet=sweet,
            configuration_=configuration_,
        )
        inst = typing.cast(
            BananaReq[frozendict.frozendict],
            inst
        )
        return inst

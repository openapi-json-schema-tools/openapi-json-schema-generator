# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *


class ReqPropsFromExplicitAddProps(
    schemas.DictSchema[schemas.T]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    class Schema_:
        types = {frozendict.frozendict}
        required = {
            "invalid-name",
            "validName",
        }
        AdditionalProperties: typing_extensions.TypeAlias = schemas.StrSchema[U]
    
    @property
    def validName(self) -> Schema_.AdditionalProperties[str]:
        return self.__getitem__("validName")
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["invalid-name"]) -> Schema_.AdditionalProperties[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["validName"]) -> Schema_.AdditionalProperties[str]: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> Schema_.AdditionalProperties[str]: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["invalid-name"],
            typing_extensions.Literal["validName"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict],
        validName: typing.Union[Schema_.AdditionalProperties, str],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: typing.Union[Schema_.AdditionalProperties, str],
    ) -> ReqPropsFromExplicitAddProps[frozendict.frozendict]:
        return super().__new__(
            cls,
            *args_,
            validName=validName,
            configuration_=configuration_,
            **kwargs,
        )

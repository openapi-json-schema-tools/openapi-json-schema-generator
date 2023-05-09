# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from petstore_api.shared_imports.schema_imports import *


class Capitalization(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    class Schema_:
        types = {frozendict.frozendict}
        
        class Properties:
            SmallCamel = schemas.StrSchema
            CapitalCamel = schemas.StrSchema
            SmallSnake = schemas.StrSchema
            CapitalSnake = schemas.StrSchema
            SCAETHFlowPoints = schemas.StrSchema
            ATTNAME = schemas.StrSchema
            __annotations__ = {
                "smallCamel": SmallCamel,
                "CapitalCamel": CapitalCamel,
                "small_Snake": SmallSnake,
                "Capital_Snake": CapitalSnake,
                "SCA_ETH_Flow_Points": SCAETHFlowPoints,
                "ATT_NAME": ATTNAME,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["smallCamel"]) -> Schema_.Properties.SmallCamel: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["CapitalCamel"]) -> Schema_.Properties.CapitalCamel: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["small_Snake"]) -> Schema_.Properties.SmallSnake: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["Capital_Snake"]) -> Schema_.Properties.CapitalSnake: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["SCA_ETH_Flow_Points"]) -> Schema_.Properties.SCAETHFlowPoints: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["ATT_NAME"]) -> Schema_.Properties.ATTNAME: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["smallCamel"],
            typing_extensions.Literal["CapitalCamel"],
            typing_extensions.Literal["small_Snake"],
            typing_extensions.Literal["Capital_Snake"],
            typing_extensions.Literal["SCA_ETH_Flow_Points"],
            typing_extensions.Literal["ATT_NAME"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict],
        smallCamel: typing.Union[Schema_.Properties.SmallCamel, str, schemas.Unset] = schemas.unset,
        CapitalCamel: typing.Union[Schema_.Properties.CapitalCamel, str, schemas.Unset] = schemas.unset,
        small_Snake: typing.Union[Schema_.Properties.SmallSnake, str, schemas.Unset] = schemas.unset,
        Capital_Snake: typing.Union[Schema_.Properties.CapitalSnake, str, schemas.Unset] = schemas.unset,
        SCA_ETH_Flow_Points: typing.Union[Schema_.Properties.SCAETHFlowPoints, str, schemas.Unset] = schemas.unset,
        ATT_NAME: typing.Union[Schema_.Properties.ATTNAME, str, schemas.Unset] = schemas.unset,
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema],
    ) -> 'Capitalization':
        return super().__new__(
            cls,
            *args_,
            smallCamel=smallCamel,
            CapitalCamel=CapitalCamel,
            small_Snake=small_Snake,
            Capital_Snake=Capital_Snake,
            SCA_ETH_Flow_Points=SCA_ETH_Flow_Points,
            ATT_NAME=ATT_NAME,
            configuration_=configuration_,
            **kwargs,
        )

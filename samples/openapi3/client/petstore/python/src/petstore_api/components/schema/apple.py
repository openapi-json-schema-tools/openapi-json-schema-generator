# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from petstore_api.shared_imports.schema_imports import *


class Apple(
    schemas.NoneBase,
    schemas.DictBase,
    schemas.Schema,
    schemas.NoneFrozenDictMixin
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    class Schema_:
        types = {
            schemas.NoneClass,
            frozendict.frozendict,
        }
        required = {
            "cultivar",
        }
        
        class Properties:
            
            
            class Cultivar(
                schemas.StrSchema
            ):
            
            
                class Schema_:
                    types = {
                        str,
                    }
                    regex={
                        'pattern': r'^[a-zA-Z\s]*$',  # noqa: E501
                    }
            
            
            class Origin(
                schemas.StrSchema
            ):
            
            
                class Schema_:
                    types = {
                        str,
                    }
                    regex={
                        'pattern': r'^[A-Z\s]*$',  # noqa: E501
                        'flags': re.I,
                    }
            __annotations__ = {
                "cultivar": Cultivar,
                "origin": Origin,
            }

    
    cultivar: Schema_.Properties.Cultivar
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["cultivar"]) -> Schema_.Properties.Cultivar: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["origin"]) -> Schema_.Properties.Origin: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["cultivar"],
            typing_extensions.Literal["origin"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        *args_: typing.Union[None, dict, frozendict.frozendict],
        origin: typing.Union[Schema_.Properties.Origin, str, schemas.Unset] = schemas.unset,
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema],
    ) -> 'Apple':
        return super().__new__(
            cls,
            *args_,
            origin=origin,
            configuration_=configuration_,
            **kwargs,
        )


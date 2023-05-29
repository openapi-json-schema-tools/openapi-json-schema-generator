# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *


class Whale(
    schemas.DictSchema[schemas.T]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    class Schema_:
        types = {frozendict.frozendict}
        required = {
            "className",
        }
        
        class Properties:
            HasBaleen: typing_extensions.TypeAlias = schemas.BoolSchema[U]
            HasTeeth: typing_extensions.TypeAlias = schemas.BoolSchema[U]
            
            
            class ClassName(
                schemas.StrSchema[schemas.T]
            ):
            
            
                class Schema_:
                    types = {
                        str,
                    }
                    enum_value_to_name = {
                        "whale": "WHALE",
                    }
                
                @schemas.classproperty
                def WHALE(cls):
                    return cls("whale") # type: ignore
            __annotations__ = {
                "hasBaleen": HasBaleen,
                "hasTeeth": HasTeeth,
                "className": ClassName,
            }
    
    @property
    def className(self) -> Schema_.Properties.ClassName[str]:
        return self.__getitem__("className")
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["className"]) -> Schema_.Properties.ClassName[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["hasBaleen"]) -> Schema_.Properties.HasBaleen[schemas.BoolClass]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["hasTeeth"]) -> Schema_.Properties.HasTeeth[schemas.BoolClass]: ...
    
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
            typing_extensions.Literal["className"],
            typing_extensions.Literal["hasBaleen"],
            typing_extensions.Literal["hasTeeth"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict],
        className: typing.Union[
            Schema_.Properties.ClassName[str],
            str
        ],
        hasBaleen: typing.Union[
            Schema_.Properties.HasBaleen[schemas.BoolClass],
            schemas.Unset,
            bool
        ] = schemas.unset,
        hasTeeth: typing.Union[
            Schema_.Properties.HasTeeth[schemas.BoolClass],
            schemas.Unset,
            bool
        ] = schemas.unset,
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: typing.Union[
            dict,
            frozendict.frozendict,
            list,
            tuple,
            decimal.Decimal,
            float,
            int,
            str,
            datetime.date,
            datetime.datetime,
            uuid.UUID,
            bool,
            None,
            bytes,
            io.FileIO,
            io.BufferedReader,
            schemas.Schema
        ],
    ) -> Whale[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            *args_,
            className=className,
            hasBaleen=hasBaleen,
            hasTeeth=hasTeeth,
            configuration_=configuration_,
            **kwargs,
        )
        inst = typing.cast(
            Whale[frozendict.frozendict],
            inst
        )
        return inst

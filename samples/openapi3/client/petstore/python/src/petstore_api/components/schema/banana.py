# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *

LengthCm: typing_extensions.TypeAlias = schemas.NumberSchema[U]


class Banana(
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
        
        @staticmethod
        def properties():
            return {
                "lengthCm": LengthCm,
            }
    
    @property
    def lengthCm(self) -> LengthCm[decimal.Decimal]:
        return self.__getitem__("lengthCm")
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["lengthCm"]) -> LengthCm[decimal.Decimal]: ...
    
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
            typing_extensions.Literal["lengthCm"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict],
        lengthCm: typing.Union[
            LengthCm[decimal.Decimal],
            decimal.Decimal,
            int,
            float
        ],
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
    ) -> Banana[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            *args_,
            lengthCm=lengthCm,
            configuration_=configuration_,
            **kwargs,
        )
        inst = typing.cast(
            Banana[frozendict.frozendict],
            inst
        )
        return inst

BananaProperties = typing.TypedDict(
    'BananaProperties',
    {
        "lengthCm": LengthCm,
    }
)

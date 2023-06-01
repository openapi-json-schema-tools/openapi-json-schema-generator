# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *

SpecialPropertyName: typing_extensions.TypeAlias = schemas.Int64Schema[U]
_123List: typing_extensions.TypeAlias = schemas.StrSchema[U]
_123Number: typing_extensions.TypeAlias = schemas.IntSchema[U]


class ObjectWithDifficultlyNamedProps(
    schemas.DictSchema[schemas.T]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.

    model with properties that have invalid names for python
    """


    @dataclasses.dataclass(frozen=True)
    class Schema_:
        types: typing.FrozenSet[typing.Type] = frozenset({frozendict.frozendict})
        required = {
            "123-list",
        }
        properties: ObjectWithDifficultlyNamedPropsProperties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(ObjectWithDifficultlyNamedPropsProperties)) # type: ignore
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["123-list"]) -> _123List[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["$special[property.name]"]) -> SpecialPropertyName[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["123Number"]) -> _123Number[decimal.Decimal]: ...
    
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
            typing_extensions.Literal["123-list"],
            typing_extensions.Literal["$special[property.name]"],
            typing_extensions.Literal["123Number"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict],
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
    ) -> ObjectWithDifficultlyNamedProps[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            *args_,
            configuration_=configuration_,
            **kwargs,
        )
        inst = typing.cast(
            ObjectWithDifficultlyNamedProps[frozendict.frozendict],
            inst
        )
        return inst

ObjectWithDifficultlyNamedPropsProperties = typing_extensions.TypedDict(
    'ObjectWithDifficultlyNamedPropsProperties',
    {
        "$special[property.name]": typing.Type[SpecialPropertyName],
        "123-list": typing.Type[_123List],
        "123Number": typing.Type[_123Number],
    }
)

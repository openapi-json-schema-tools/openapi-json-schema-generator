# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *



class ObjectWithInvalidNamedRefedProperties(
    schemas.DictSchema[schemas.T]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    @dataclasses.dataclass(frozen=True)
    class Schema_:
        types: typing.FrozenSet[typing.Type] = frozenset({frozendict.frozendict})
        required = {
            "!reference",
            "from",
        }
        properties: ObjectWithInvalidNamedRefedPropertiesProperties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(ObjectWithInvalidNamedRefedPropertiesProperties)) # type: ignore
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["!reference"]) -> array_with_validations_in_items.ArrayWithValidationsInItems[tuple]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["from"]) -> from_schema.FromSchema[frozendict.frozendict]: ...
    
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
            typing_extensions.Literal["!reference"],
            typing_extensions.Literal["from"],
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
    ) -> ObjectWithInvalidNamedRefedProperties[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            *args_,
            configuration_=configuration_,
            **kwargs,
        )
        inst = typing.cast(
            ObjectWithInvalidNamedRefedProperties[frozendict.frozendict],
            inst
        )
        return inst


from petstore_api.components.schema import array_with_validations_in_items
from petstore_api.components.schema import from_schema
ObjectWithInvalidNamedRefedPropertiesProperties = typing_extensions.TypedDict(
    'ObjectWithInvalidNamedRefedPropertiesProperties',
    {
        "from": typing.Type[from_schema.FromSchema],
        "!reference": typing.Type[array_with_validations_in_items.ArrayWithValidationsInItems],
    }
)

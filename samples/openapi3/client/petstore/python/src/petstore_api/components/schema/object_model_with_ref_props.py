# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *



class ObjectModelWithRefProps(
    schemas.DictSchema[schemas.T]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.

    a model that includes properties which should stay primitive (String + Boolean) and one which is defined as a class, NumberWithValidations
    """


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({frozendict.frozendict})
        properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["myNumber"]) -> number_with_validations.NumberWithValidations[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["myString"]) -> string.String[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["myBoolean"]) -> boolean.Boolean[schemas.BoolClass]: ...
    
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
            typing_extensions.Literal["myNumber"],
            typing_extensions.Literal["myString"],
            typing_extensions.Literal["myBoolean"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        arg_: typing.Union[
            DictInput,
            ObjectModelWithRefProps[frozendict.frozendict],
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None
    ) -> ObjectModelWithRefProps[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            arg_,
            configuration_=configuration_,
        )
        inst = typing.cast(
            ObjectModelWithRefProps[frozendict.frozendict],
            inst
        )
        return inst


from petstore_api.components.schema import boolean
from petstore_api.components.schema import number_with_validations
from petstore_api.components.schema import string
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "myNumber": typing.Type[number_with_validations.NumberWithValidations],
        "myString": typing.Type[string.String],
        "myBoolean": typing.Type[boolean.Boolean],
    }
)
DictInput = typing_extensions.TypedDict(
    'DictInput',
    {
        "myNumber": typing.Union[
            number_with_validations.NumberWithValidations[decimal.Decimal],
            decimal.Decimal,
            int,
            float
        ],
        "myString": typing.Union[
            string.String[str],
            str
        ],
        "myBoolean": typing.Union[
            boolean.Boolean[schemas.BoolClass],
            bool
        ],
    },
    total=False
)

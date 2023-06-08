# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *

Bar: typing_extensions.TypeAlias = schemas.StrSchema[U]
Foo: typing_extensions.TypeAlias = schemas.StrSchema[U]
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "bar": typing.Type[Bar],
        "foo": typing.Type[Foo],
    }
)
DictInput = typing_extensions.TypedDict(
    'DictInput',
    {
        "bar": typing.Union[
            Bar[str],
            schemas.Unset,
            str
        ],
        "foo": typing.Union[
            Foo[str],
            schemas.Unset,
            str
        ],
    },
    total=False
)


class HasOnlyReadOnly(
    schemas.DictSchema[schemas.T]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({frozendict.frozendict})
        properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["bar"]) -> Bar[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["foo"]) -> Foo[str]: ...
    
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
            typing_extensions.Literal["bar"],
            typing_extensions.Literal["foo"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict],
        bar: typing.Union[
            Bar[str],
            schemas.Unset,
            str
        ] = schemas.unset,
        foo: typing.Union[
            Foo[str],
            schemas.Unset,
            str
        ] = schemas.unset,
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: schemas.INPUT_TYPES_ALL_INCL_SCHEMA
    ) -> HasOnlyReadOnly[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            *args_,
            bar=bar,
            foo=foo,
            configuration_=configuration_,
            **kwargs,
        )
        inst = typing.cast(
            HasOnlyReadOnly[frozendict.frozendict],
            inst
        )
        return inst


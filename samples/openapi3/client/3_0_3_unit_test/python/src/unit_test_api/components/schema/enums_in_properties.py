# coding: utf-8

"""
    openapi 3.0.3 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft6  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from unit_test_api.shared_imports.schema_imports import *



class FooEnums:

    @schemas.classproperty
    def FOO(cls) -> str:
        return Foo.validate("foo")


@dataclasses.dataclass(frozen=True)
class Foo(
    schemas.StrSchema
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        str,
    })
    enum_value_to_name: typing.Mapping[typing.Union[int, float, str, bool, schemas.none_type_], str] = dataclasses.field(
        default_factory=lambda: {
            "foo": "FOO",
        }
    )
    enums = FooEnums


class BarEnums:

    @schemas.classproperty
    def BAR(cls) -> str:
        return Bar.validate("bar")


@dataclasses.dataclass(frozen=True)
class Bar(
    schemas.StrSchema
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        str,
    })
    enum_value_to_name: typing.Mapping[typing.Union[int, float, str, bool, schemas.none_type_], str] = dataclasses.field(
        default_factory=lambda: {
            "bar": "BAR",
        }
    )
    enums = BarEnums
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "foo": typing.Type[Foo],
        "bar": typing.Type[Bar],
    }
)


class EnumsInPropertiesDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    @property
    def bar(self) -> str:
        return self.__getitem__("bar")
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["bar"]) -> str:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["foo"]) -> str:
        ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.OUTPUT_BASE_TYPES: ...
    
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

    def __new__(cls, arg: EnumsInPropertiesDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return EnumsInProperties.validate(arg, configuration=configuration)
EnumsInPropertiesDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL_INCL_SCHEMA]


@dataclasses.dataclass(frozen=True)
class EnumsInProperties(
    schemas.DictSchema[EnumsInPropertiesDict]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    required: typing.FrozenSet[str] = frozenset({
        "bar",
    })
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: EnumsInPropertiesDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            EnumsInPropertiesDictInput,
            EnumsInPropertiesDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> EnumsInPropertiesDict:
        return super().validate(
            arg,
            configuration=configuration,
        )


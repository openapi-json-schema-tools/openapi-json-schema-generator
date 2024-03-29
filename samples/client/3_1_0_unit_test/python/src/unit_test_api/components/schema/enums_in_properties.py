# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from unit_test_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]



class FooEnums:

    @schemas.classproperty
    def FOO(cls) -> typing.Literal["foo"]:
        return Foo.validate("foo")


@dataclasses.dataclass(frozen=True)
class Foo(
    schemas.Schema
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        str,
    })
    enum_value_to_name: typing.Mapping[typing.Union[int, float, str, schemas.Bool, None], str] = dataclasses.field(
        default_factory=lambda: {
            "foo": "FOO",
        }
    )
    enums = FooEnums

    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing.Literal["foo"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing.Literal["foo"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: str,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing.Literal["foo",]: ...
    @classmethod
    def validate(
        cls,
        arg: typing.Union[str, datetime.date, datetime.datetime, uuid.UUID],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing.Literal[
        "foo",
    ]:
        validated_arg = super().validate_base(
            arg,
            configuration=configuration,
        )
        return typing.cast(typing.Literal[
                "foo",
            ],
            validated_arg
        )


class BarEnums:

    @schemas.classproperty
    def BAR(cls) -> typing.Literal["bar"]:
        return Bar.validate("bar")


@dataclasses.dataclass(frozen=True)
class Bar(
    schemas.Schema
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        str,
    })
    enum_value_to_name: typing.Mapping[typing.Union[int, float, str, schemas.Bool, None], str] = dataclasses.field(
        default_factory=lambda: {
            "bar": "BAR",
        }
    )
    enums = BarEnums

    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing.Literal["bar"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing.Literal["bar"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: str,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing.Literal["bar",]: ...
    @classmethod
    def validate(
        cls,
        arg: typing.Union[str, datetime.date, datetime.datetime, uuid.UUID],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing.Literal[
        "bar",
    ]:
        validated_arg = super().validate_base(
            arg,
            configuration=configuration,
        )
        return typing.cast(typing.Literal[
                "bar",
            ],
            validated_arg
        )
Properties = typing.TypedDict(
    'Properties',
    {
        "foo": typing.Type[Foo],
        "bar": typing.Type[Bar],
    }
)


class EnumsInPropertiesDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):

    __required_keys__: typing.FrozenSet[str] = frozenset({
        "bar",
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
        "foo",
    })
    
    def __new__(
        cls,
        *,
        bar: typing.Literal[
            "bar"
        ],
        foo: typing.Union[
            typing.Literal[
                "foo"
            ],
            schemas.Unset
        ] = schemas.unset,
        configuration_: typing.Optional[schema_configuration.SchemaConfiguration] = None,
        **kwargs: schemas.INPUT_TYPES_ALL,
    ):
        arg_: typing.Dict[str, typing.Any] = {
            "bar": bar,
        }
        for key_, val in (
            ("foo", foo),
        ):
            if isinstance(val, schemas.Unset):
                continue
            arg_[key_] = val
        arg_.update(kwargs)
        used_arg_ = typing.cast(EnumsInPropertiesDictInput, arg_)
        return EnumsInProperties.validate(used_arg_, configuration=configuration_)
    
    @staticmethod
    def from_dict_(
        arg: typing.Union[
            EnumsInPropertiesDictInput,
            EnumsInPropertiesDict
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> EnumsInPropertiesDict:
        return EnumsInProperties.validate(arg, configuration=configuration)
    
    @property
    def bar(self) -> typing.Literal["bar"]:
        return typing.cast(
            typing.Literal["bar"],
            self.__getitem__("bar")
        )
    
    @property
    def foo(self) -> typing.Union[typing.Literal["foo"], schemas.Unset]:
        val = self.get("foo", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            typing.Literal["foo"],
            val
        )
    
    def get_additional_property_(self, name: str) -> typing.Union[schemas.OUTPUT_BASE_TYPES, schemas.Unset]:
        schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
        return self.get(name, schemas.unset)
EnumsInPropertiesDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL]


@dataclasses.dataclass(frozen=True)
class EnumsInProperties(
    schemas.Schema[EnumsInPropertiesDict, tuple]
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
        return super().validate_base(
            arg,
            configuration=configuration,
        )


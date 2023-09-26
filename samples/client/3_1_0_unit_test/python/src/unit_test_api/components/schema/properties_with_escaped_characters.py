# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from unit_test_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

FooNbar: typing_extensions.TypeAlias = schemas.NumberSchema
FooBar: typing_extensions.TypeAlias = schemas.NumberSchema
FooBar: typing_extensions.TypeAlias = schemas.NumberSchema
FooRbar: typing_extensions.TypeAlias = schemas.NumberSchema
FooTbar: typing_extensions.TypeAlias = schemas.NumberSchema
FooFbar: typing_extensions.TypeAlias = schemas.NumberSchema
Properties = typing.TypedDict(
    'Properties',
    {
        "foo\nbar": typing.Type[FooNbar],
        "foo\"bar": typing.Type[FooBar],
        "foo\\bar": typing.Type[FooBar],
        "foo\rbar": typing.Type[FooRbar],
        "foo\tbar": typing.Type[FooTbar],
        "foo\fbar": typing.Type[FooFbar],
    }
)


class PropertiesWithEscapedCharactersDict(schemas.immutabledict[str, typing.Union[int, float]]):

    __required_keys__: typing.FrozenSet[str] = frozenset({
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
        "foo\nbar",
        "foo\"bar",
        "foo\\bar",
        "foo\rbar",
        "foo\tbar",
        "foo\fbar",
    })
    
    def __new__(
        cls,
        *,
        configuration_: typing.Optional[schema_configuration.SchemaConfiguration] = None,
        **kwargs: schemas.INPUT_TYPES_ALL,
    ):
        arg_: typing.Dict[str, typing.Any] = {}
        arg_.update(kwargs)
        used_arg_ = typing.cast(PropertiesWithEscapedCharactersDictInput, arg_)
        return PropertiesWithEscapedCharacters.validate(used_arg_, configuration=configuration_)
    
    @staticmethod
    def from_dict_(
        arg: typing.Union[
            PropertiesWithEscapedCharactersDictInput,
            PropertiesWithEscapedCharactersDict
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> PropertiesWithEscapedCharactersDict:
        return PropertiesWithEscapedCharacters.validate(arg, configuration=configuration)
    
    def get_additional_property_(self, name: str) -> typing.Union[schemas.OUTPUT_BASE_TYPES, schemas.Unset]:
        schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
        return self.get(name, schemas.unset)
PropertiesWithEscapedCharactersDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL]


@dataclasses.dataclass(frozen=True)
class PropertiesWithEscapedCharacters(
    schemas.AnyTypeSchema[PropertiesWithEscapedCharactersDict, typing.Tuple[schemas.OUTPUT_BASE_TYPES, ...]],
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    # any type
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: PropertiesWithEscapedCharactersDict,
        }
    )

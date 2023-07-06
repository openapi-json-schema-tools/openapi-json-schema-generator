# coding: utf-8

"""
    openapi 3.0.3 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft6  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from unit_test_api.shared_imports.schema_imports import *

Foo: typing_extensions.TypeAlias = schemas.AnyTypeSchema
Bar: typing_extensions.TypeAlias = schemas.AnyTypeSchema
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "foo": typing.Type[Foo],
        "bar": typing.Type[Bar],
    }
)


class RequiredValidationDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    @property
    def foo(self) -> schemas.OUTPUT_BASE_TYPES:
        return self.__getitem__("foo")
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["foo"]) -> schemas.OUTPUT_BASE_TYPES:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["bar"]) -> schemas.OUTPUT_BASE_TYPES:
        ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.OUTPUT_BASE_TYPES: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["foo"],
            typing_extensions.Literal["bar"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(cls, arg: RequiredValidationDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return RequiredValidation.validate(arg, configuration=configuration)
RequiredValidationDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL_INCL_SCHEMA]


@dataclasses.dataclass(frozen=True)
class RequiredValidation(
    schemas.AnyTypeSchema[RequiredValidationDict, typing.Tuple[schemas.OUTPUT_BASE_TYPES, ...]],
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    # any type
    required: typing.FrozenSet[str] = frozenset({
        "foo",
    })
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: RequiredValidationDict,
        }
    )


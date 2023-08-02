# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]


from petstore_api.components.schema import bar
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "bar": typing.Type[bar.Bar],
    }
)


class FooDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    __required_keys__: typing.FrozenSet[str] = frozenset({
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
        "bar",
    })
    
    @property
    def bar(self) -> typing.Union[str, schemas.Unset]:
        val = self.get("bar", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            str,
            val
        )
    
    def get_additional_property_(self, name: str) -> typing.Union[schemas.OUTPUT_BASE_TYPES, schemas.Unset]:
        schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
        return self.get(name, schemas.unset)

    @staticmethod
    def from_dict_(
        arg: FooDictInput,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> FooDict:
        return Foo.validate(arg, configuration=configuration)
    
    def __new__(
        cls,
        bar: typing.Union[
            str,
            schemas.Unset,
        ] = schemas.unset,
        configuration_: typing.Optional[schema_configuration.SchemaConfiguration] = None,
        **kwargs: schemas.INPUT_TYPES_ALL,
    ):
        arg_ = {}
        for key, val in (
            ("bar", bar),
        ):
            if isinstance(val, schemas.Unset):
                continue
            arg_[key] = val
        arg_.update(kwargs)
        return Foo.validate(arg_, configuration=configuration_)
FooDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL]


@dataclasses.dataclass(frozen=True)
class Foo(
    schemas.Schema[FooDict, tuple]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: FooDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            FooDictInput,
            FooDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> FooDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )


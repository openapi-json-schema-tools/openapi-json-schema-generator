# coding: utf-8

"""
    openapi 3.0.3 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft6  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from unit_test_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]


from unit_test_api.components.schema import property_named_ref_that_is_not_a_reference
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "a": typing.Type[property_named_ref_that_is_not_a_reference.PropertyNamedRefThatIsNotAReference],
    }
)


class RefInPropertyDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    __required_keys__: typing.FrozenSet[str] = frozenset({
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
        "a",
    })
    
    @property
    def a(self) -> typing.Union[schemas.OUTPUT_BASE_TYPES, schemas.Unset]:
        val = self.get("a", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            schemas.OUTPUT_BASE_TYPES,
            val
        )
    
    def get_additional_property_(self, name: str) -> typing.Union[schemas.OUTPUT_BASE_TYPES, schemas.Unset]:
        schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
        return self.get(name, schemas.unset)

    def __new__(cls, arg: RefInPropertyDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return RefInProperty.validate(arg, configuration=configuration)
RefInPropertyDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL]


@dataclasses.dataclass(frozen=True)
class RefInProperty(
    schemas.AnyTypeSchema[RefInPropertyDict, typing.Tuple[schemas.OUTPUT_BASE_TYPES, ...]],
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
            schemas.immutabledict: RefInPropertyDict,
        }
    )

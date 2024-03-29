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


class RefInAdditionalpropertiesDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):

    __required_keys__: typing.FrozenSet[str] = frozenset({
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
    })
    def __new__(
        cls,
        configuration_: typing.Optional[schema_configuration.SchemaConfiguration] = None,
        **kwargs: typing.Union[
            schemas.INPUT_TYPES_ALL,
            schemas.OUTPUT_BASE_TYPES
        ],
    ):
        used_kwargs = typing.cast(RefInAdditionalpropertiesDictInput, kwargs)
        return RefInAdditionalproperties.validate(used_kwargs, configuration=configuration_)
    
    @staticmethod
    def from_dict_(
        arg: typing.Union[
            RefInAdditionalpropertiesDictInput,
            RefInAdditionalpropertiesDict
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> RefInAdditionalpropertiesDict:
        return RefInAdditionalproperties.validate(arg, configuration=configuration)
    
    def get_additional_property_(self, name: str) -> typing.Union[schemas.OUTPUT_BASE_TYPES, schemas.Unset]:
        schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
        val = self.get(name, schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            schemas.OUTPUT_BASE_TYPES,
            val
        )
RefInAdditionalpropertiesDictInput = typing.Mapping[
    str,
    typing.Union[
        schemas.INPUT_TYPES_ALL,
        schemas.OUTPUT_BASE_TYPES
    ],
]


@dataclasses.dataclass(frozen=True)
class RefInAdditionalproperties(
    schemas.Schema[RefInAdditionalpropertiesDict, tuple]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    additional_properties: typing.Type[property_named_ref_that_is_not_a_reference.PropertyNamedRefThatIsNotAReference] = dataclasses.field(default_factory=lambda: property_named_ref_that_is_not_a_reference.PropertyNamedRefThatIsNotAReference) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: RefInAdditionalpropertiesDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            RefInAdditionalpropertiesDictInput,
            RefInAdditionalpropertiesDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> RefInAdditionalpropertiesDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )


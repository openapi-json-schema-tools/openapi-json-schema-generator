# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

Test: typing_extensions.TypeAlias = schemas.StrSchema
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "test": typing.Type[Test],
    }
)


class ObjectWithOptionalTestPropDict(schemas.immutabledict[str, str]):

    __required_keys__: typing.FrozenSet[str] = frozenset({
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
        "test",
    })
    
    @property
    def test(self) -> typing.Union[str, schemas.Unset]:
        val = self.get("test", schemas.unset)
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
        arg: ObjectWithOptionalTestPropDictInput,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ObjectWithOptionalTestPropDict:
        return ObjectWithOptionalTestProp.validate(arg, configuration=configuration)
    
    def __new__(
        cls,
        test: typing.Union[
            str,
            schemas.Unset
        ] = schemas.unset,
        configuration_: typing.Optional[schema_configuration.SchemaConfiguration] = None,
        **kwargs: schemas.INPUT_TYPES_ALL,
    ):
        arg_ = {}
        for key, val in (
            ("test", test),
        ):
            if isinstance(val, schemas.Unset):
                continue
            arg_[key] = val
        arg_.update(kwargs)
        return ObjectWithOptionalTestProp.validate(arg_, configuration=configuration_)
ObjectWithOptionalTestPropDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL]


@dataclasses.dataclass(frozen=True)
class ObjectWithOptionalTestProp(
    schemas.Schema[ObjectWithOptionalTestPropDict, tuple]
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
            schemas.immutabledict: ObjectWithOptionalTestPropDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            ObjectWithOptionalTestPropDictInput,
            ObjectWithOptionalTestPropDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ObjectWithOptionalTestPropDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )


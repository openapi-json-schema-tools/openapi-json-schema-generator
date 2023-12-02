# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \\\" \\\\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

Properties = typing.TypedDict(
    'Properties',
    {
        "selfRef": typing.Type['SelfReferencingObjectModel'],
    }
)


class SelfReferencingObjectModelDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):

    __required_keys__: typing.FrozenSet[str] = frozenset({
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
        "selfRef",
    })
    
    def __new__(
        cls,
        *,
        selfRef: typing.Union[
            SelfReferencingObjectModelDictInput,
            SelfReferencingObjectModelDict,
            schemas.Unset
        ] = schemas.unset,
        configuration_: typing.Optional[schema_configuration.SchemaConfiguration] = None,
        **kwargs: typing.Union[
            SelfReferencingObjectModelDictInput,
            SelfReferencingObjectModelDict,
        ],
    ):
        arg_: typing.Dict[str, typing.Any] = {}
        for key_, val in (
            ("selfRef", selfRef),
        ):
            if isinstance(val, schemas.Unset):
                continue
            arg_[key_] = val
        arg_.update(kwargs)
        used_arg_ = typing.cast(SelfReferencingObjectModelDictInput, arg_)
        return SelfReferencingObjectModel.validate(used_arg_, configuration=configuration_)
    
    @staticmethod
    def from_dict_(
        arg: typing.Union[
            SelfReferencingObjectModelDictInput,
            SelfReferencingObjectModelDict
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> SelfReferencingObjectModelDict:
        return SelfReferencingObjectModel.validate(arg, configuration=configuration)
    
    @property
    def selfRef(self) -> typing.Union[SelfReferencingObjectModelDict, schemas.Unset]:
        val = self.get("selfRef", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            SelfReferencingObjectModelDict,
            val
        )
    
    def get_additional_property_(self, name: str) -> typing.Union[SelfReferencingObjectModelDict, schemas.Unset]:
        schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
        val = self.get(name, schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            SelfReferencingObjectModelDict,
            val
        )
SelfReferencingObjectModelDictInput = typing.Mapping[
    str,
    typing.Union[
        typing.Union[
            'SelfReferencingObjectModelDictInput',
            SelfReferencingObjectModelDict,
        ],
        typing.Union[
            'SelfReferencingObjectModelDictInput',
            SelfReferencingObjectModelDict,
        ],
    ]
]


@dataclasses.dataclass(frozen=True)
class SelfReferencingObjectModel(
    schemas.Schema[SelfReferencingObjectModelDict, tuple]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    additional_properties: typing.Type[SelfReferencingObjectModel] = dataclasses.field(default_factory=lambda: SelfReferencingObjectModel) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: SelfReferencingObjectModelDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            SelfReferencingObjectModelDictInput,
            SelfReferencingObjectModelDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> SelfReferencingObjectModelDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )


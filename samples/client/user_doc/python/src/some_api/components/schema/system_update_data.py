# coding: utf-8

"""
    NetHSM
    All endpoints expect exactly the specified JSON. Additional properties will cause a Bad Request Error (400). All HTTP errors contain a JSON structure with an explanation of type string. All [base64](https://tools.ietf.org/html/rfc4648#section-4) encoded values are Big Endian.   # noqa: E501
    The version of the OpenAPI document: v1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from some_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

ReleaseNotes: typing_extensions.TypeAlias = schemas.StrSchema
Properties = typing.TypedDict(
    'Properties',
    {
        "releaseNotes": typing.Type[ReleaseNotes],
    }
)


class SystemUpdateDataDict(schemas.immutabledict[str, str]):

    __required_keys__: typing.FrozenSet[str] = frozenset({
        "releaseNotes",
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
    })
    
    def __new__(
        cls,
        *,
        releaseNotes: str,
        configuration_: typing.Optional[schema_configuration.SchemaConfiguration] = None,
        **kwargs: schemas.INPUT_TYPES_ALL,
    ):
        arg_: typing.Dict[str, typing.Any] = {
            "releaseNotes": releaseNotes,
        }
        arg_.update(kwargs)
        used_arg_ = typing.cast(SystemUpdateDataDictInput, arg_)
        return SystemUpdateData.validate(used_arg_, configuration=configuration_)
    
    @staticmethod
    def from_dict_(
        arg: typing.Union[
            SystemUpdateDataDictInput,
            SystemUpdateDataDict
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> SystemUpdateDataDict:
        return SystemUpdateData.validate(arg, configuration=configuration)
    
    @property
    def releaseNotes(self) -> str:
        return typing.cast(
            str,
            self.__getitem__("releaseNotes")
        )
    
    def get_additional_property_(self, name: str) -> typing.Union[schemas.OUTPUT_BASE_TYPES, schemas.Unset]:
        schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
        return self.get(name, schemas.unset)
SystemUpdateDataDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL]


@dataclasses.dataclass(frozen=True)
class SystemUpdateData(
    schemas.Schema[SystemUpdateDataDict, tuple]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    required: typing.FrozenSet[str] = frozenset({
        "releaseNotes",
    })
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: SystemUpdateDataDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            SystemUpdateDataDictInput,
            SystemUpdateDataDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> SystemUpdateDataDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )


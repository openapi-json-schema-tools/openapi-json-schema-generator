# coding: utf-8

"""
    NetHSM
    All endpoints expect exactly the specified JSON. Additional properties will cause a Bad Request Error (400). All HTTP errors contain a JSON structure with an explanation of type string. All [base64](https://tools.ietf.org/html/rfc4648#section-4) encoded values are Big Endian.   # noqa: E501
    The version of the OpenAPI document: v1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from some_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]


from some_api.components.schema import switch
Properties = typing.TypedDict(
    'Properties',
    {
        "status": typing.Type[switch.Switch],
    }
)


class UnattendedBootConfigDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    __required_keys__: typing.FrozenSet[str] = frozenset({
        "status",
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
    })
    
    def __new__(
        cls,
        *,
        status: typing.Literal[
            "on",
            "off"
        ],
        configuration_: typing.Optional[schema_configuration.SchemaConfiguration] = None,
        **kwargs: schemas.INPUT_TYPES_ALL,
    ):
        arg_: typing.Dict[str, typing.Any] = {
            "status": status,
        }
        arg_.update(kwargs)
        used_arg_ = typing.cast(UnattendedBootConfigDictInput, arg_)
        return UnattendedBootConfig.validate(used_arg_, configuration=configuration_)
    
    @staticmethod
    def from_dict_(
        arg: typing.Union[
            UnattendedBootConfigDictInput,
            UnattendedBootConfigDict
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> UnattendedBootConfigDict:
        return UnattendedBootConfig.validate(arg, configuration=configuration)
    
    @property
    def status(self) -> typing.Literal["on", "off"]:
        return typing.cast(
            typing.Literal["on", "off"],
            self.__getitem__("status")
        )
    
    def get_additional_property_(self, name: str) -> typing.Union[schemas.OUTPUT_BASE_TYPES, schemas.Unset]:
        schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
        return self.get(name, schemas.unset)
UnattendedBootConfigDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL]


@dataclasses.dataclass(frozen=True)
class UnattendedBootConfig(
    schemas.Schema[UnattendedBootConfigDict, tuple]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    required: typing.FrozenSet[str] = frozenset({
        "status",
    })
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: UnattendedBootConfigDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            UnattendedBootConfigDictInput,
            UnattendedBootConfigDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> UnattendedBootConfigDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )


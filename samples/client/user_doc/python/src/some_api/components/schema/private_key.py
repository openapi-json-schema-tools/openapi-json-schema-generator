# coding: utf-8

"""
    NetHSM
    All endpoints expect exactly the specified JSON. Additional properties will cause a Bad Request Error (400). All HTTP errors contain a JSON structure with an explanation of type string. All [base64](https://tools.ietf.org/html/rfc4648#section-4) encoded values are Big Endian.   # noqa: E501
    The version of the OpenAPI document: v1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from some_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]


from some_api.components.schema import key_mechanisms
from some_api.components.schema import key_private_data
from some_api.components.schema import key_restrictions
from some_api.components.schema import key_type
Properties = typing.TypedDict(
    'Properties',
    {
        "mechanisms": typing.Type[key_mechanisms.KeyMechanisms],
        "type": typing.Type[key_type.KeyType],
        "key": typing.Type[key_private_data.KeyPrivateData],
        "restrictions": typing.Type[key_restrictions.KeyRestrictions],
    }
)


class PrivateKeyDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):

    __required_keys__: typing.FrozenSet[str] = frozenset({
        "key",
        "mechanisms",
        "type",
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
        "restrictions",
    })
    
    def __new__(
        cls,
        *,
        key: typing.Union[
            key_private_data.KeyPrivateDataDictInput,
            key_private_data.KeyPrivateDataDict,
        ],
        mechanisms: typing.Union[
            key_mechanisms.KeyMechanismsTupleInput,
            key_mechanisms.KeyMechanismsTuple
        ],
        type: typing.Literal[
            "RSA",
            "Curve25519",
            "EC_P224",
            "EC_P256",
            "EC_P384",
            "EC_P521",
            "Generic"
        ],
        restrictions: typing.Union[
            key_restrictions.KeyRestrictionsDictInput,
            key_restrictions.KeyRestrictionsDict,
            schemas.Unset
        ] = schemas.unset,
        configuration_: typing.Optional[schema_configuration.SchemaConfiguration] = None,
        **kwargs: schemas.INPUT_TYPES_ALL,
    ):
        arg_: typing.Dict[str, typing.Any] = {
            "key": key,
            "mechanisms": mechanisms,
            "type": type,
        }
        for key, val in (
            ("restrictions", restrictions),
        ):
            if isinstance(val, schemas.Unset):
                continue
            arg_[key] = val
        arg_.update(kwargs)
        used_arg_ = typing.cast(PrivateKeyDictInput, arg_)
        return PrivateKey.validate(used_arg_, configuration=configuration_)
    
    @staticmethod
    def from_dict_(
        arg: typing.Union[
            PrivateKeyDictInput,
            PrivateKeyDict
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> PrivateKeyDict:
        return PrivateKey.validate(arg, configuration=configuration)
    
    @property
    def key(self) -> key_private_data.KeyPrivateDataDict:
        return typing.cast(
            key_private_data.KeyPrivateDataDict,
            self.__getitem__("key")
        )
    
    @property
    def mechanisms(self) -> key_mechanisms.KeyMechanismsTuple:
        return typing.cast(
            key_mechanisms.KeyMechanismsTuple,
            self.__getitem__("mechanisms")
        )
    
    @property
    def type(self) -> typing.Literal["RSA", "Curve25519", "EC_P224", "EC_P256", "EC_P384", "EC_P521", "Generic"]:
        return typing.cast(
            typing.Literal["RSA", "Curve25519", "EC_P224", "EC_P256", "EC_P384", "EC_P521", "Generic"],
            self.__getitem__("type")
        )
    
    @property
    def restrictions(self) -> typing.Union[key_restrictions.KeyRestrictionsDict, schemas.Unset]:
        val = self.get("restrictions", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            key_restrictions.KeyRestrictionsDict,
            val
        )
    
    def get_additional_property_(self, name: str) -> typing.Union[schemas.OUTPUT_BASE_TYPES, schemas.Unset]:
        schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
        return self.get(name, schemas.unset)
PrivateKeyDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL]


@dataclasses.dataclass(frozen=True)
class PrivateKey(
    schemas.Schema[PrivateKeyDict, tuple]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    required: typing.FrozenSet[str] = frozenset({
        "key",
        "mechanisms",
        "type",
    })
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: PrivateKeyDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            PrivateKeyDictInput,
            PrivateKeyDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> PrivateKeyDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )


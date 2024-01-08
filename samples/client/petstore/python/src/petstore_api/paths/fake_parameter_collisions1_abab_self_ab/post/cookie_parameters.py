# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose.  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

AdditionalProperties: typing_extensions.TypeAlias = schemas.NotAnyTypeSchema

from petstore_api.paths.fake_parameter_collisions1_abab_self_ab.post.parameters.parameter_14 import schema
from petstore_api.paths.fake_parameter_collisions1_abab_self_ab.post.parameters.parameter_15 import schema as schema_2
from petstore_api.paths.fake_parameter_collisions1_abab_self_ab.post.parameters.parameter_16 import schema as schema_3
from petstore_api.paths.fake_parameter_collisions1_abab_self_ab.post.parameters.parameter_17 import schema as schema_5
from petstore_api.paths.fake_parameter_collisions1_abab_self_ab.post.parameters.parameter_18 import schema as schema_4
Properties = typing.TypedDict(
    'Properties',
    {
        "1": typing.Type[schema.Schema],
        "aB": typing.Type[schema_2.Schema],
        "Ab": typing.Type[schema_3.Schema],
        "A-B": typing.Type[schema_4.Schema],
        "self": typing.Type[schema_5.Schema],
    }
)


class CookieParametersDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):

    __required_keys__: typing.FrozenSet[str] = frozenset({
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
        "1",
        "aB",
        "Ab",
        "A-B",
        "self",
    })
    
    def __new__(
        cls,
        *,
        aB: typing.Union[
            str,
            schemas.Unset
        ] = schemas.unset,
        Ab: typing.Union[
            str,
            schemas.Unset
        ] = schemas.unset,
        configuration_: typing.Optional[schema_configuration.SchemaConfiguration] = None,
    ):
        arg_: typing.Dict[str, typing.Any] = {}
        for key_, val in (
            ("aB", aB),
            ("Ab", Ab),
        ):
            if isinstance(val, schemas.Unset):
                continue
            arg_[key_] = val
        used_arg_ = typing.cast(CookieParametersDictInput, arg_)
        return CookieParameters.validate(used_arg_, configuration=configuration_)
    
    @staticmethod
    def from_dict_(
        arg: typing.Union[
            CookieParametersDictInput,
            CookieParametersDict
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> CookieParametersDict:
        return CookieParameters.validate(arg, configuration=configuration)
    
    @property
    def aB(self) -> typing.Union[str, schemas.Unset]:
        val = self.get("aB", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            str,
            val
        )
    
    @property
    def Ab(self) -> typing.Union[str, schemas.Unset]:
        val = self.get("Ab", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            str,
            val
        )
CookieParametersDictInput = typing.TypedDict(
    'CookieParametersDictInput',
    {
        "1": str,
        "aB": str,
        "Ab": str,
        "A-B": str,
        "self": str,
    },
    total=False
)


@dataclasses.dataclass(frozen=True)
class CookieParameters(
    schemas.Schema[CookieParametersDict, tuple]
):
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    additional_properties: typing.Type[AdditionalProperties] = dataclasses.field(default_factory=lambda: AdditionalProperties) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: CookieParametersDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            CookieParametersDictInput,
            CookieParametersDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> CookieParametersDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )


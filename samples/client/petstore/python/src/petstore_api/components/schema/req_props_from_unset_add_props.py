# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose.  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]



class ReqPropsFromUnsetAddPropsDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):

    __required_keys__: typing.FrozenSet[str] = frozenset({
        "invalid-name",
        "validName",
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
    })
    
    def __new__(
        cls,
        *,
        validName: typing.Union[
            schemas.INPUT_TYPES_ALL,
            schemas.OUTPUT_BASE_TYPES
        ],
        configuration_: typing.Optional[schema_configuration.SchemaConfiguration] = None,
        **kwargs: schemas.INPUT_TYPES_ALL,
    ):
        arg_: typing.Dict[str, typing.Any] = {
            "validName": validName,
        }
        arg_.update(kwargs)
        used_arg_ = typing.cast(ReqPropsFromUnsetAddPropsDictInput, arg_)
        return ReqPropsFromUnsetAddProps.validate(used_arg_, configuration=configuration_)
    
    @staticmethod
    def from_dict_(
        arg: typing.Union[
            ReqPropsFromUnsetAddPropsDictInput,
            ReqPropsFromUnsetAddPropsDict
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ReqPropsFromUnsetAddPropsDict:
        return ReqPropsFromUnsetAddProps.validate(arg, configuration=configuration)
    
    @property
    def validName(self) -> schemas.OUTPUT_BASE_TYPES:
        return self.__getitem__("validName")
    
    def get_additional_property_(self, name: str) -> typing.Union[schemas.OUTPUT_BASE_TYPES, schemas.Unset]:
        schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
        return self.get(name, schemas.unset)
ReqPropsFromUnsetAddPropsDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL]


@dataclasses.dataclass(frozen=True)
class ReqPropsFromUnsetAddProps(
    schemas.Schema[ReqPropsFromUnsetAddPropsDict, tuple]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    required: typing.FrozenSet[str] = frozenset({
        "invalid-name",
        "validName",
    })
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: ReqPropsFromUnsetAddPropsDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            ReqPropsFromUnsetAddPropsDictInput,
            ReqPropsFromUnsetAddPropsDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ReqPropsFromUnsetAddPropsDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )


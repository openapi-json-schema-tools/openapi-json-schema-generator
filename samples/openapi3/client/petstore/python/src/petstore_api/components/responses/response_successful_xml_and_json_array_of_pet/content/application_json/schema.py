# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *


class Schema(
    schemas.ListSchema[schemas.T]
):


    class Schema_:
        types = {tuple}
        
        @staticmethod
        def items() -> typing.Type['ref_pet.RefPet']:
            return ref_pet.RefPet

    def __new__(
        cls,
        arg_: typing.Union[
            typing.Tuple[
                typing.Union['ref_pet.RefPet', dict, frozendict.frozendict], ...
            ],
            typing.List[
                typing.Union['ref_pet.RefPet', dict, frozendict.frozendict]
            ],
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
    ) -> Schema[tuple]:
        return super().__new__(
            cls,
            arg_,
            configuration_=configuration_,
        )

    def __getitem__(self, name: int) -> ref_pet.RefPet[frozendict.frozendict]:
        return super().__getitem__(name)

from petstore_api.components.schema import ref_pet

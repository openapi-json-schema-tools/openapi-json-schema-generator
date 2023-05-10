# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *


class AnimalFarm(
    schemas.ListSchema[schemas.T]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    class Schema_:
        types = {tuple}
        
        @staticmethod
        def items() -> typing.Type['animal.Animal']:
            return animal.Animal

    def __new__(
        cls,
        arg_: typing.Union[
            typing.Tuple[
                typing.Union['animal.Animal', dict, frozendict.frozendict], ...
            ],
            typing.List[
                typing.Union['animal.Animal', dict, frozendict.frozendict]
            ],
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
    ) -> AnimalFarm[tuple]:
        return super().__new__(
            cls,
            arg_,
            configuration_=configuration_,
        )

    def __getitem__(self, name: int) -> animal.Animal[frozendict.frozendict]:
        return super().__getitem__(name)

from petstore_api.components.schema import animal

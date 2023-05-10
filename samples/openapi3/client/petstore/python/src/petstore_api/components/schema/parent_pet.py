# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *


class ParentPet(
    schemas.DictSchema[schemas.T]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    class Schema_:
        types = {
            frozendict.frozendict,
        }
        
        @staticmethod
        def discriminator():
            return {
                'pet_type': {
                    'ChildCat': child_cat.ChildCat,
                }
            }
        
        class AllOf:
        
            @staticmethod
            def _0() -> typing.Type['grandparent_animal.GrandparentAnimal']:
                return grandparent_animal.GrandparentAnimal
            classes = [
                _0,
            ]


    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: typing.Union[dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema],
    ) -> ParentPet[frozendict.frozendict]:
        return super().__new__(
            cls,
            *args_,
            configuration_=configuration_,
            **kwargs,
        )


from petstore_api.components.schema import child_cat
from petstore_api.components.schema import grandparent_animal

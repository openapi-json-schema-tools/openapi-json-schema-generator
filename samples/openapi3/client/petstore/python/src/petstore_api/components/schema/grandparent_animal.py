# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *

PetType: typing_extensions.TypeAlias = schemas.StrSchema[U]


class GrandparentAnimal(
    schemas.DictSchema[schemas.T]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SchemaBase):
        types: typing.FrozenSet[typing.Type] = frozenset({frozendict.frozendict})
        required: typing.FrozenSet[str] = frozenset({
            "pet_type",
        })
        discriminator: typing.Mapping[str, typing.Mapping[str, typing.Type[schemas.Schema]]] = dataclasses.field(
            default_factory=lambda: {
                'pet_type': {
                    'ChildCat': child_cat.ChildCat,
                    'ParentPet': parent_pet.ParentPet,
                }
            }
        )
        properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    
    @property
    def pet_type(self) -> PetType[str]:
        return self.__getitem__("pet_type")
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["pet_type"]) -> PetType[str]: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.AnyTypeSchema[typing.Union[
        frozendict.frozendict,
        str,
        decimal.Decimal,
        schemas.BoolClass,
        schemas.NoneClass,
        tuple,
        bytes,
        schemas.FileIO
    ]]: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["pet_type"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict],
        pet_type: typing.Union[
            PetType[str],
            str
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: typing.Union[
            dict,
            frozendict.frozendict,
            list,
            tuple,
            decimal.Decimal,
            float,
            int,
            str,
            datetime.date,
            datetime.datetime,
            uuid.UUID,
            bool,
            None,
            bytes,
            io.FileIO,
            io.BufferedReader,
            schemas.Schema
        ],
    ) -> GrandparentAnimal[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            *args_,
            pet_type=pet_type,
            configuration_=configuration_,
            **kwargs,
        )
        inst = typing.cast(
            GrandparentAnimal[frozendict.frozendict],
            inst
        )
        return inst


from petstore_api.components.schema import child_cat
from petstore_api.components.schema import parent_pet
Properties = typing_extensions.TypedDict(
    'GrandparentAnimalProperties',
    {
        "pet_type": typing.Type[PetType],
    }
)

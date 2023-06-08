# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *

Uuid: typing_extensions.TypeAlias = schemas.UUIDSchema[U]
DateTime: typing_extensions.TypeAlias = schemas.DateTimeSchema[U]


class Map(
    schemas.DictSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({frozendict.frozendict})
        additional_properties: typing.Type[animal.Animal] = dataclasses.field(default_factory=lambda: animal.Animal) # type: ignore
    
    def __getitem__(self, name: str) -> animal.Animal[frozendict.frozendict]:
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: typing.Union[
            animal.Animal[frozendict.frozendict],
            dict,
            frozendict.frozendict
        ],
    ) -> Map[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            *args_,
            configuration_=configuration_,
            **kwargs,
        )
        inst = typing.cast(
            Map[frozendict.frozendict],
            inst
        )
        return inst

Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "uuid": typing.Type[Uuid],
        "dateTime": typing.Type[DateTime],
        "map": typing.Type[Map],
    }
)
DictInput = typing_extensions.TypedDict(
    'DictInput',
    {
        "uuid": typing.Union[
            Uuid[str],
            schemas.Unset,
            str,
            uuid.UUID
        ],
        "dateTime": typing.Union[
            DateTime[str],
            schemas.Unset,
            str,
            datetime.datetime
        ],
        "map": typing.Union[
            Map[frozendict.frozendict],
            schemas.Unset,
            dict,
            frozendict.frozendict
        ],
    },
    total=False
)


class MixedPropertiesAndAdditionalPropertiesClass(
    schemas.DictSchema[schemas.T]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({frozendict.frozendict})
        properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["uuid"]) -> Uuid[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["dateTime"]) -> DateTime[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["map"]) -> Map[frozendict.frozendict]: ...
    
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
            typing_extensions.Literal["uuid"],
            typing_extensions.Literal["dateTime"],
            typing_extensions.Literal["map"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict],
        uuid: typing.Union[
            Uuid[str],
            schemas.Unset,
            str,
            uuid.UUID
        ] = schemas.unset,
        dateTime: typing.Union[
            DateTime[str],
            schemas.Unset,
            str,
            datetime.datetime
        ] = schemas.unset,
        map: typing.Union[
            Map[frozendict.frozendict],
            schemas.Unset,
            dict,
            frozendict.frozendict
        ] = schemas.unset,
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: schemas.INPUT_TYPES_ALL_INCL_SCHEMA
    ) -> MixedPropertiesAndAdditionalPropertiesClass[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            *args_,
            uuid=uuid,
            dateTime=dateTime,
            map=map,
            configuration_=configuration_,
            **kwargs,
        )
        inst = typing.cast(
            MixedPropertiesAndAdditionalPropertiesClass[frozendict.frozendict],
            inst
        )
        return inst


from petstore_api.components.schema import animal

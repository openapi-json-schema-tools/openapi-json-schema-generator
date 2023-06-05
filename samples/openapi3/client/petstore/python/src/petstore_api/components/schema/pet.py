# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *

Id: typing_extensions.TypeAlias = schemas.Int64Schema[U]
Name: typing_extensions.TypeAlias = schemas.StrSchema[U]
Items: typing_extensions.TypeAlias = schemas.StrSchema[U]


class PhotoUrls(
    schemas.ListSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SchemaBase):
        types: typing.FrozenSet[typing.Type] = frozenset({tuple})
        items: typing.Type[Items] = dataclasses.field(default_factory=lambda: Items) # type: ignore

    def __new__(
        cls,
        arg_: typing.Sequence[
            typing.Union[
                Items[str],
                str
            ]
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
    ) -> PhotoUrls[tuple]:
        inst = super().__new__(
            cls,
            arg_,
            configuration_=configuration_,
        )
        inst = typing.cast(
            PhotoUrls[tuple],
            inst
        )
        return inst

    def __getitem__(self, name: int) -> Items[str]:
        return super().__getitem__(name)



class Tags(
    schemas.ListSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SchemaBase):
        types: typing.FrozenSet[typing.Type] = frozenset({tuple})
        items: typing.Type[tag.Tag] = dataclasses.field(default_factory=lambda: tag.Tag) # type: ignore

    def __new__(
        cls,
        arg_: typing.Sequence[
            typing.Union[
                tag.Tag[frozendict.frozendict],
                dict,
                frozendict.frozendict
            ]
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
    ) -> Tags[tuple]:
        inst = super().__new__(
            cls,
            arg_,
            configuration_=configuration_,
        )
        inst = typing.cast(
            Tags[tuple],
            inst
        )
        return inst

    def __getitem__(self, name: int) -> tag.Tag[frozendict.frozendict]:
        return super().__getitem__(name)



class Status(
    schemas.StrSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SchemaBase):
        types: typing.FrozenSet[typing.Type] = frozenset({
            str,
        })
        enum_value_to_name: typing.Mapping[typing.Union[int, float, str, schemas.BoolClass, schemas.NoneClass], str] = dataclasses.field(
            default_factory=lambda: {
                "available": "AVAILABLE",
                "pending": "PENDING",
                "sold": "SOLD",
            }
        )
    
    @schemas.classproperty
    def AVAILABLE(cls) -> Status[str]:
        return cls("available") # type: ignore
    
    @schemas.classproperty
    def PENDING(cls) -> Status[str]:
        return cls("pending") # type: ignore
    
    @schemas.classproperty
    def SOLD(cls) -> Status[str]:
        return cls("sold") # type: ignore


class Pet(
    schemas.DictSchema[schemas.T]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.

    Pet object that needs to be added to the store
    """


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SchemaBase):
        types: typing.FrozenSet[typing.Type] = frozenset({frozendict.frozendict})
        required: typing.FrozenSet[str] = frozenset({
            "name",
            "photoUrls",
        })
        properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    
    @property
    def name(self) -> Name[str]:
        return self.__getitem__("name")
    
    @property
    def photoUrls(self) -> PhotoUrls[tuple]:
        return self.__getitem__("photoUrls")
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["name"]) -> Name[str]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["photoUrls"]) -> PhotoUrls[tuple]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> Id[decimal.Decimal]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["category"]) -> category.Category[frozendict.frozendict]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["tags"]) -> Tags[tuple]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["status"]) -> Status[str]: ...
    
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
            typing_extensions.Literal["name"],
            typing_extensions.Literal["photoUrls"],
            typing_extensions.Literal["id"],
            typing_extensions.Literal["category"],
            typing_extensions.Literal["tags"],
            typing_extensions.Literal["status"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict],
        name: typing.Union[
            Name[str],
            str
        ],
        photoUrls: typing.Union[
            PhotoUrls[tuple],
            list,
            tuple
        ],
        id: typing.Union[
            Id[decimal.Decimal],
            schemas.Unset,
            decimal.Decimal,
            int
        ] = schemas.unset,
        category: typing.Union[
            category.Category[frozendict.frozendict],
            schemas.Unset,
            dict,
            frozendict.frozendict
        ] = schemas.unset,
        tags: typing.Union[
            Tags[tuple],
            schemas.Unset,
            list,
            tuple
        ] = schemas.unset,
        status: typing.Union[
            Status[str],
            schemas.Unset,
            str
        ] = schemas.unset,
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
        **kwargs: schemas.INPUT_TYPES_ALL_INCL_SCHEMA
    ) -> Pet[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            *args_,
            name=name,
            photoUrls=photoUrls,
            id=id,
            category=category,
            tags=tags,
            status=status,
            configuration_=configuration_,
            **kwargs,
        )
        inst = typing.cast(
            Pet[frozendict.frozendict],
            inst
        )
        return inst


from petstore_api.components.schema import category
from petstore_api.components.schema import tag
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "id": typing.Type[Id],
        "category": typing.Type[category.Category],
        "name": typing.Type[Name],
        "photoUrls": typing.Type[PhotoUrls],
        "tags": typing.Type[Tags],
        "status": typing.Type[Status],
    }
)
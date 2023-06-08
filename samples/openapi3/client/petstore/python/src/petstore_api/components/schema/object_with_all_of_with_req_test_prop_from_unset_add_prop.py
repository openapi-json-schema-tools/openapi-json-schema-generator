# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *

Name: typing_extensions.TypeAlias = schemas.StrSchema[U]
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "name": typing.Type[Name],
    }
)
RequiredDictInput = typing_extensions.TypedDict(
    'RequiredDictInput',
    {
        "test": typing.Union[
            schemas.AnyTypeSchema[typing.Union[
                frozendict.frozendict,
                str,
                decimal.Decimal,
                schemas.BoolClass,
                schemas.NoneClass,
                tuple,
                bytes,
                schemas.FileIO
            ]],
            dict,
            frozendict.frozendict,
            str,
            datetime.date,
            datetime.datetime,
            uuid.UUID,
            int,
            float,
            decimal.Decimal,
            bool,
            None,
            list,
            tuple,
            bytes,
            io.FileIO,
            io.BufferedReader
        ],
    }
)
OptionalDictInput = typing_extensions.TypedDict(
    'OptionalDictInput',
    {
        "name": typing.Union[
            Name[str],
            schemas.Unset,
            str
        ],
    },
    total=False
)


class DictInput(RequiredDictInput, OptionalDictInput):
    pass


class _1(
    schemas.DictSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({frozendict.frozendict})
        required: typing.FrozenSet[str] = frozenset({
            "test",
        })
        properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    
    @property
    def test(self) -> schemas.AnyTypeSchema[typing.Union[
        frozendict.frozendict,
        str,
        decimal.Decimal,
        schemas.BoolClass,
        schemas.NoneClass,
        tuple,
        bytes,
        schemas.FileIO
    ]]:
        return self.__getitem__("test")
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["test"]) -> schemas.AnyTypeSchema[typing.Union[
        frozendict.frozendict,
        str,
        decimal.Decimal,
        schemas.BoolClass,
        schemas.NoneClass,
        tuple,
        bytes,
        schemas.FileIO
    ]]: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["name"]) -> Name[str]: ...
    
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
            typing_extensions.Literal["test"],
            typing_extensions.Literal["name"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        arg_: typing.Union[
            DictInput,
            typing.Mapping[str, schemas.INPUT_TYPES_ALL_INCL_SCHEMA],
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None
    ) -> _1[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            arg_,
            configuration_=configuration_,
        )
        inst = typing.cast(
            _1[frozendict.frozendict],
            inst
        )
        return inst



class ObjectWithAllOfWithReqTestPropFromUnsetAddProp(
    schemas.AnyTypeSchema[schemas.T],
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        # any type
        all_of: AllOf = dataclasses.field(default_factory=lambda: schemas.tuple_to_instance(AllOf)) # type: ignore


    def __new__(
        cls,
        arg_: schemas.INPUT_TYPES_ALL_INCL_SCHEMA,
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None
    ) -> ObjectWithAllOfWithReqTestPropFromUnsetAddProp[
        typing.Union[
            frozendict.frozendict,
            str,
            decimal.Decimal,
            schemas.BoolClass,
            schemas.NoneClass,
            tuple,
            bytes,
            schemas.FileIO
        ]
    ]:
        inst = super().__new__(
            cls,
            arg_,
            configuration_=configuration_,
        )
        inst = typing.cast(
            ObjectWithAllOfWithReqTestPropFromUnsetAddProp[
                typing.Union[
                    frozendict.frozendict,
                    str,
                    decimal.Decimal,
                    schemas.BoolClass,
                    schemas.NoneClass,
                    tuple,
                    bytes,
                    schemas.FileIO
                ]
            ],
            inst
        )
        return inst


from petstore_api.components.schema import object_with_optional_test_prop
AllOf = typing.Tuple[
    typing.Type[object_with_optional_test_prop.ObjectWithOptionalTestProp],
    typing.Type[_1[schemas.U]],
]

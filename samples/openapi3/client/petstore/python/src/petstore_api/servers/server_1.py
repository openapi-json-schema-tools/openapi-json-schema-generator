# coding: utf-8
"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *
from petstore_api.shared_imports.server_imports import *
AdditionalProperties: typing_extensions.TypeAlias = schemas.NotAnyTypeSchema[U]


class Version(
    schemas.StrSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({
            str,
        })
        default: str = "v2"
        enum_value_to_name: typing.Mapping[typing.Union[int, float, str, schemas.BoolClass, schemas.NoneClass], str] = dataclasses.field(
            default_factory=lambda: {
                "v1": "V1",
                "v2": "V2",
            }
        )
    
    @schemas.classproperty
    def V1(cls) -> Version[str]:
        return cls("v1") # type: ignore
    
    @schemas.classproperty
    def V2(cls) -> Version[str]:
        return cls("v2") # type: ignore
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "version": typing.Type[Version],
    }
)
RequiredProperties = typing_extensions.TypedDict(
    'RequiredProperties',
    {
        "version": typing.Union[
            Version[str],
            str
        ],
    }
)


class Variables(
    schemas.DictSchema[schemas.T]
):


    @dataclasses.dataclass(frozen=True)
    class Schema_(metaclass=schemas.SingletonMeta):
        types: typing.FrozenSet[typing.Type] = frozenset({frozendict.frozendict})
        required: typing.FrozenSet[str] = frozenset({
            "version",
        })
        properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
        additional_properties: typing.Type[AdditionalProperties] = dataclasses.field(default_factory=lambda: AdditionalProperties) # type: ignore
    
    @property
    def version(self) -> Version[str]:
        return self.__getitem__("version")
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["version"]) -> Version[str]: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["version"],
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(
        cls,
        *args_: typing.Union[dict, frozendict.frozendict],
        version: typing.Union[
            Version[str],
            str
        ],
        configuration_: typing.Optional[schemas.schema_configuration.SchemaConfiguration] = None,
    ) -> Variables[frozendict.frozendict]:
        inst = super().__new__(
            cls,
            *args_,
            version=version,
            configuration_=configuration_,
        )
        inst = typing.cast(
            Variables[frozendict.frozendict],
            inst
        )
        return inst



@dataclasses.dataclass
class Server1(server.ServerWithVariables):
    '''
    The local server
    '''
    variables: Variables[frozendict.frozendict] = Variables.from_openapi_data_({
        "version": Version.Schema_.default,
    })
    variables_cls: typing.Type[Variables] = Variables
    _url: str = "https://localhost:8080/{version}"

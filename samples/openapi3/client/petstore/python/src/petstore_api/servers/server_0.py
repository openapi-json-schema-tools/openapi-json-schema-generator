# coding: utf-8
"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *
from petstore_api.shared_imports.server_imports import *
AdditionalProperties: typing_extensions.TypeAlias = schemas.NotAnyTypeSchema


class ServerEnums:

    @schemas.classproperty
    def PETSTORE(cls) -> str:
        return Server.validate("petstore")

    @schemas.classproperty
    def QA_HYPHEN_MINUS_PETSTORE(cls) -> str:
        return Server.validate("qa-petstore")

    @schemas.classproperty
    def DEV_HYPHEN_MINUS_PETSTORE(cls) -> str:
        return Server.validate("dev-petstore")


@dataclasses.dataclass(frozen=True)
class Server(
    schemas.StrSchema
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        str,
    })
    default: str = "petstore"
    enum_value_to_name: typing.Mapping[typing.Union[int, float, str, bool, schemas.none_type_], str] = dataclasses.field(
        default_factory=lambda: {
            "petstore": "PETSTORE",
            "qa-petstore": "QA_HYPHEN_MINUS_PETSTORE",
            "dev-petstore": "DEV_HYPHEN_MINUS_PETSTORE",
        }
    )
    enums = ServerEnums


class PortEnums:

    @schemas.classproperty
    def POSITIVE_80(cls) -> str:
        return Port.validate("80")

    @schemas.classproperty
    def POSITIVE_8080(cls) -> str:
        return Port.validate("8080")


@dataclasses.dataclass(frozen=True)
class Port(
    schemas.StrSchema
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        str,
    })
    default: str = "80"
    enum_value_to_name: typing.Mapping[typing.Union[int, float, str, bool, schemas.none_type_], str] = dataclasses.field(
        default_factory=lambda: {
            "80": "POSITIVE_80",
            "8080": "POSITIVE_8080",
        }
    )
    enums = PortEnums
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "server": typing.Type[Server],
        "port": typing.Type[Port],
    }
)


class VariablesDict(immutabledict.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    @property
    def port(self) -> str:
        return self.__getitem__("port")
    
    @property
    def server(self) -> str:
        return self.__getitem__("server")
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["port"]) -> str:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["server"]) -> str:
        ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["port"],
            typing_extensions.Literal["server"],
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)
VariablesDictInput = typing_extensions.TypedDict(
    'VariablesDictInput',
    {
        "port": str,
        "server": str,
    }
)


@dataclasses.dataclass(frozen=True)
class Variables(
    schemas.DictSchema[VariablesDict]
):
    types: typing.FrozenSet[typing.Type] = frozenset({immutabledict.immutabledict})
    required: typing.FrozenSet[str] = frozenset({
        "port",
        "server",
    })
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    additional_properties: typing.Type[AdditionalProperties] = dataclasses.field(default_factory=lambda: AdditionalProperties) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            immutabledict.immutabledict: VariablesDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: VariablesDictInput,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> VariablesDict:
        return super().validate(
            arg,
            configuration=configuration,
        )



@dataclasses.dataclass
class Server0(server.ServerWithVariables):
    '''
    petstore server
    '''
    variables: VariablesDict = dataclasses.field(
        default_factory=lambda: Variables.validate({
            "server": Server.default,
            "port": Port.default,
        })
    )
    variables_schema: typing.Type[Variables] = Variables
    _url: str = "http://{server}.swagger.io:{port}/v2"

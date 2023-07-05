# coding: utf-8

"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *
from petstore_api.shared_imports.response_imports import *

from . import content
from .headers import header_x_rate_limit
from .headers import header_int32
from .headers import header_x_expires_after
from .headers import header_ref_content_schema_header
from .headers import header_number_header
parameters: typing.Dict[str, typing.Type[api_client.HeaderParameterWithoutName]] = {
    'X-Rate-Limit': header_x_rate_limit.XRateLimit,
    'int32': header_int32.Int32,
    'X-Expires-After': header_x_expires_after.XExpiresAfter,
    'ref-content-schema-header': header_ref_content_schema_header.RefContentSchemaHeader,
    'numberHeader': header_number_header.NumberHeader,
}

AdditionalProperties: typing_extensions.TypeAlias = schemas.NotAnyTypeSchema

from petstore_api.components.headers.header_int32_json_content_type_header.content.application_json import schema as header_int32_json_content_type_header_schema
from petstore_api.components.headers.header_number_header import schema as header_number_header_schema
from petstore_api.components.schema import string_with_validation
from petstore_api.paths.user_login.get.responses.response_200.headers.header_x_expires_after import schema as header_x_expires_after_schema
from petstore_api.paths.user_login.get.responses.response_200.headers.header_x_rate_limit.content.application_json import schema as header_x_rate_limit_schema
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "X-Rate-Limit": typing.Type[header_x_rate_limit_schema.Schema],
        "int32": typing.Type[header_int32_json_content_type_header_schema.Schema],
        "X-Expires-After": typing.Type[header_x_expires_after_schema.Schema],
        "ref-content-schema-header": typing.Type[string_with_validation.StringWithValidation],
        "numberHeader": typing.Type[header_number_header_schema.Schema],
    }
)
HeadersRequiredDictInput = typing_extensions.TypedDict(
    'HeadersRequiredDictInput',
    {
        "X-Rate-Limit": int,
        "int32": int,
        "ref-content-schema-header": str,
    }
)
HeadersOptionalDictInput = typing_extensions.TypedDict(
    'HeadersOptionalDictInput',
    {
        "X-Expires-After": typing.Union[
            str,
            datetime.datetime
        ],
        "numberHeader": typing.Union[
            str
        ],
    },
    total=False
)


class HeadersDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    @property
    def int32(self) -> int:
        return self.__getitem__("int32")
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["X-Rate-Limit"]) -> int:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["int32"]) -> int:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["ref-content-schema-header"]) -> str:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["X-Expires-After"]) -> str:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["numberHeader"]) -> str:
        ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["X-Rate-Limit"],
            typing_extensions.Literal["int32"],
            typing_extensions.Literal["ref-content-schema-header"],
            typing_extensions.Literal["X-Expires-After"],
            typing_extensions.Literal["numberHeader"],
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(cls, arg: HeadersDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return Headers.validate(arg, configuration=configuration)


class HeadersDictInput(HeadersRequiredDictInput, HeadersOptionalDictInput):
    pass


@dataclasses.dataclass(frozen=True)
class Headers(
    schemas.DictSchema[HeadersDict]
):
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    required: typing.FrozenSet[str] = frozenset({
        "X-Rate-Limit",
        "int32",
        "ref-content-schema-header",
    })
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    additional_properties: typing.Type[AdditionalProperties] = dataclasses.field(default_factory=lambda: AdditionalProperties) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: HeadersDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            HeadersDictInput,
            HeadersDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> HeadersDict:
        return super().validate(
            arg,
            configuration=configuration,
        )



@dataclasses.dataclass
class ApiResponseFor200(api_response.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        str,
        str,
    ]
    headers: HeadersDict


class ResponseFor200(api_client.OpenApiResponse[ApiResponseFor200]):
    response_cls = ApiResponseFor200


    class ApplicationXmlMediaType(api_client.MediaType):
        schema: typing_extensions.TypeAlias = content.application_xml.schema.Schema


    class ApplicationJsonMediaType(api_client.MediaType):
        schema: typing_extensions.TypeAlias = content.application_json.schema.Schema
    Content = typing_extensions.TypedDict(
        'Content',
        {
            'application/xml': typing.Type[ApplicationXmlMediaType],
            'application/json': typing.Type[ApplicationJsonMediaType],
        }
    )
    content: Content = {
        'application/xml': ApplicationXmlMediaType,
        'application/json': ApplicationJsonMediaType,
    }
    headers=parameters
    headers_schema = Headers

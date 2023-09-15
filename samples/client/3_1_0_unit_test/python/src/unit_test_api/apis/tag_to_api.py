import typing
import typing_extensions

from unit_test_api.apis.tags.additional_properties_api import AdditionalPropertiesApi
from unit_test_api.apis.tags.content_type_json_api import ContentTypeJsonApi
from unit_test_api.apis.tags.response_content_content_type_schema_api import ResponseContentContentTypeSchemaApi
from unit_test_api.apis.tags.all_of_api import AllOfApi
from unit_test_api.apis.tags.any_of_api import AnyOfApi
from unit_test_api.apis.tags.enum_api import EnumApi
from unit_test_api.apis.tags.items_api import ItemsApi
from unit_test_api.apis.tags.operation_request_body_api import OperationRequestBodyApi
from unit_test_api.apis.tags.format_api import FormatApi
from unit_test_api.apis.tags.one_of_api import OneOfApi
from unit_test_api.apis.tags.path_post_api import PathPostApi

TagToApi = typing.TypedDict(
    'TagToApi',
    {
        "additionalProperties": typing.Type[AdditionalPropertiesApi],
        "contentType_json": typing.Type[ContentTypeJsonApi],
        "response.content.contentType.schema": typing.Type[ResponseContentContentTypeSchemaApi],
        "allOf": typing.Type[AllOfApi],
        "anyOf": typing.Type[AnyOfApi],
        "enum": typing.Type[EnumApi],
        "items": typing.Type[ItemsApi],
        "operation.requestBody": typing.Type[OperationRequestBodyApi],
        "format": typing.Type[FormatApi],
        "oneOf": typing.Type[OneOfApi],
        "path.post": typing.Type[PathPostApi],
    }
)

tag_to_api = TagToApi(
    {
        "additionalProperties": AdditionalPropertiesApi,
        "contentType_json": ContentTypeJsonApi,
        "response.content.contentType.schema": ResponseContentContentTypeSchemaApi,
        "allOf": AllOfApi,
        "anyOf": AnyOfApi,
        "enum": EnumApi,
        "items": ItemsApi,
        "operation.requestBody": OperationRequestBodyApi,
        "format": FormatApi,
        "oneOf": OneOfApi,
        "path.post": PathPostApi,
    }
)

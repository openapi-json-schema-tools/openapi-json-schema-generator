import typing
import typing_extensions

from unit_test_api.apis.tags.maximum_api import MaximumApi
from unit_test_api.apis.tags.additional_properties_api import AdditionalPropertiesApi
from unit_test_api.apis.tags.response_content_content_type_schema_api import ResponseContentContentTypeSchemaApi
from unit_test_api.apis.tags.all_of_api import AllOfApi
from unit_test_api.apis.tags.any_of_api import AnyOfApi
from unit_test_api.apis.tags.items_api import ItemsApi
from unit_test_api.apis.tags.format_api import FormatApi
from unit_test_api.apis.tags.max_length_api import MaxLengthApi
from unit_test_api.apis.tags.path_post_api import PathPostApi
from unit_test_api.apis.tags.content_type_json_api import ContentTypeJsonApi
from unit_test_api.apis.tags.max_properties_api import MaxPropertiesApi
from unit_test_api.apis.tags.enum_api import EnumApi
from unit_test_api.apis.tags.operation_request_body_api import OperationRequestBodyApi
from unit_test_api.apis.tags.max_items_api import MaxItemsApi
from unit_test_api.apis.tags.one_of_api import OneOfApi

TagToApi = typing.TypedDict(
    'TagToApi',
    {
        "maximum": typing.Type[MaximumApi],
        "additionalProperties": typing.Type[AdditionalPropertiesApi],
        "response.content.contentType.schema": typing.Type[ResponseContentContentTypeSchemaApi],
        "allOf": typing.Type[AllOfApi],
        "anyOf": typing.Type[AnyOfApi],
        "items": typing.Type[ItemsApi],
        "format": typing.Type[FormatApi],
        "maxLength": typing.Type[MaxLengthApi],
        "path.post": typing.Type[PathPostApi],
        "contentType_json": typing.Type[ContentTypeJsonApi],
        "maxProperties": typing.Type[MaxPropertiesApi],
        "enum": typing.Type[EnumApi],
        "operation.requestBody": typing.Type[OperationRequestBodyApi],
        "maxItems": typing.Type[MaxItemsApi],
        "oneOf": typing.Type[OneOfApi],
    }
)

tag_to_api = TagToApi(
    {
        "maximum": MaximumApi,
        "additionalProperties": AdditionalPropertiesApi,
        "response.content.contentType.schema": ResponseContentContentTypeSchemaApi,
        "allOf": AllOfApi,
        "anyOf": AnyOfApi,
        "items": ItemsApi,
        "format": FormatApi,
        "maxLength": MaxLengthApi,
        "path.post": PathPostApi,
        "contentType_json": ContentTypeJsonApi,
        "maxProperties": MaxPropertiesApi,
        "enum": EnumApi,
        "operation.requestBody": OperationRequestBodyApi,
        "maxItems": MaxItemsApi,
        "oneOf": OneOfApi,
    }
)

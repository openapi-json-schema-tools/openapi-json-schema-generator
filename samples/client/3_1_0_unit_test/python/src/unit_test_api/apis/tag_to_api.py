import typing
import typing_extensions

from unit_test_api.apis.tags.maximum_api import MaximumApi
from unit_test_api.apis.tags.pattern_api import PatternApi
from unit_test_api.apis.tags.additional_properties_api import AdditionalPropertiesApi
from unit_test_api.apis.tags.response_content_content_type_schema_api import ResponseContentContentTypeSchemaApi
from unit_test_api.apis.tags.min_items_api import MinItemsApi
from unit_test_api.apis.tags.all_of_api import AllOfApi
from unit_test_api.apis.tags.minimum_api import MinimumApi
from unit_test_api.apis.tags.any_of_api import AnyOfApi
from unit_test_api.apis.tags.multiple_of_api import MultipleOfApi
from unit_test_api.apis.tags.items_api import ItemsApi
from unit_test_api.apis.tags.min_length_api import MinLengthApi
from unit_test_api.apis.tags.format_api import FormatApi
from unit_test_api.apis.tags.max_length_api import MaxLengthApi
from unit_test_api.apis.tags._not_api import _NotApi
from unit_test_api.apis.tags.properties_api import PropertiesApi
from unit_test_api.apis.tags.path_post_api import PathPostApi
from unit_test_api.apis.tags.content_type_json_api import ContentTypeJsonApi
from unit_test_api.apis.tags.max_properties_api import MaxPropertiesApi
from unit_test_api.apis.tags.min_properties_api import MinPropertiesApi
from unit_test_api.apis.tags.enum_api import EnumApi
from unit_test_api.apis.tags.operation_request_body_api import OperationRequestBodyApi
from unit_test_api.apis.tags.max_items_api import MaxItemsApi
from unit_test_api.apis.tags.one_of_api import OneOfApi

TagToApi = typing.TypedDict(
    'TagToApi',
    {
        "maximum": typing.Type[MaximumApi],
        "pattern": typing.Type[PatternApi],
        "additionalProperties": typing.Type[AdditionalPropertiesApi],
        "response.content.contentType.schema": typing.Type[ResponseContentContentTypeSchemaApi],
        "minItems": typing.Type[MinItemsApi],
        "allOf": typing.Type[AllOfApi],
        "minimum": typing.Type[MinimumApi],
        "anyOf": typing.Type[AnyOfApi],
        "multipleOf": typing.Type[MultipleOfApi],
        "items": typing.Type[ItemsApi],
        "minLength": typing.Type[MinLengthApi],
        "format": typing.Type[FormatApi],
        "maxLength": typing.Type[MaxLengthApi],
        "not": typing.Type[_NotApi],
        "properties": typing.Type[PropertiesApi],
        "path.post": typing.Type[PathPostApi],
        "contentType_json": typing.Type[ContentTypeJsonApi],
        "maxProperties": typing.Type[MaxPropertiesApi],
        "minProperties": typing.Type[MinPropertiesApi],
        "enum": typing.Type[EnumApi],
        "operation.requestBody": typing.Type[OperationRequestBodyApi],
        "maxItems": typing.Type[MaxItemsApi],
        "oneOf": typing.Type[OneOfApi],
    }
)

tag_to_api = TagToApi(
    {
        "maximum": MaximumApi,
        "pattern": PatternApi,
        "additionalProperties": AdditionalPropertiesApi,
        "response.content.contentType.schema": ResponseContentContentTypeSchemaApi,
        "minItems": MinItemsApi,
        "allOf": AllOfApi,
        "minimum": MinimumApi,
        "anyOf": AnyOfApi,
        "multipleOf": MultipleOfApi,
        "items": ItemsApi,
        "minLength": MinLengthApi,
        "format": FormatApi,
        "maxLength": MaxLengthApi,
        "not": _NotApi,
        "properties": PropertiesApi,
        "path.post": PathPostApi,
        "contentType_json": ContentTypeJsonApi,
        "maxProperties": MaxPropertiesApi,
        "minProperties": MinPropertiesApi,
        "enum": EnumApi,
        "operation.requestBody": OperationRequestBodyApi,
        "maxItems": MaxItemsApi,
        "oneOf": OneOfApi,
    }
)

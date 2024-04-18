import typing
import typing_extensions

from unit_test_api.apis.tags.operation_request_body_api import OperationRequestBodyApi
from unit_test_api.apis.tags.path_post_api import PathPostApi
from unit_test_api.apis.tags.content_type_json_api import ContentTypeJsonApi
from unit_test_api.apis.tags.additional_properties_api import AdditionalPropertiesApi
from unit_test_api.apis.tags.all_of_api import AllOfApi
from unit_test_api.apis.tags.any_of_api import AnyOfApi
from unit_test_api.apis.tags.type_api import TypeApi
from unit_test_api.apis.tags.multiple_of_api import MultipleOfApi
from unit_test_api.apis.tags.format_api import FormatApi
from unit_test_api.apis.tags.enum_api import EnumApi
from unit_test_api.apis.tags.not_api import NotApi
from unit_test_api.apis.tags.default_api import DefaultApi
from unit_test_api.apis.tags.maximum_api import MaximumApi
from unit_test_api.apis.tags.max_items_api import MaxItemsApi
from unit_test_api.apis.tags.max_length_api import MaxLengthApi
from unit_test_api.apis.tags.max_properties_api import MaxPropertiesApi
from unit_test_api.apis.tags.minimum_api import MinimumApi
from unit_test_api.apis.tags.min_items_api import MinItemsApi
from unit_test_api.apis.tags.min_length_api import MinLengthApi
from unit_test_api.apis.tags.min_properties_api import MinPropertiesApi
from unit_test_api.apis.tags.items_api import ItemsApi
from unit_test_api.apis.tags.one_of_api import OneOfApi
from unit_test_api.apis.tags.properties_api import PropertiesApi
from unit_test_api.apis.tags.pattern_api import PatternApi
from unit_test_api.apis.tags.ref_api import RefApi
from unit_test_api.apis.tags.required_api import RequiredApi
from unit_test_api.apis.tags.unique_items_api import UniqueItemsApi
from unit_test_api.apis.tags.response_content_content_type_schema_api import ResponseContentContentTypeSchemaApi

TagToApi = typing.TypedDict(
    'TagToApi',
    {
        "operation.requestBody": typing.Type[OperationRequestBodyApi],
        "path.post": typing.Type[PathPostApi],
        "contentType_json": typing.Type[ContentTypeJsonApi],
        "additionalProperties": typing.Type[AdditionalPropertiesApi],
        "allOf": typing.Type[AllOfApi],
        "anyOf": typing.Type[AnyOfApi],
        "type": typing.Type[TypeApi],
        "multipleOf": typing.Type[MultipleOfApi],
        "format": typing.Type[FormatApi],
        "enum": typing.Type[EnumApi],
        "not": typing.Type[NotApi],
        "default": typing.Type[DefaultApi],
        "maximum": typing.Type[MaximumApi],
        "maxItems": typing.Type[MaxItemsApi],
        "maxLength": typing.Type[MaxLengthApi],
        "maxProperties": typing.Type[MaxPropertiesApi],
        "minimum": typing.Type[MinimumApi],
        "minItems": typing.Type[MinItemsApi],
        "minLength": typing.Type[MinLengthApi],
        "minProperties": typing.Type[MinPropertiesApi],
        "items": typing.Type[ItemsApi],
        "oneOf": typing.Type[OneOfApi],
        "properties": typing.Type[PropertiesApi],
        "pattern": typing.Type[PatternApi],
        "$ref": typing.Type[RefApi],
        "required": typing.Type[RequiredApi],
        "uniqueItems": typing.Type[UniqueItemsApi],
        "response.content.contentType.schema": typing.Type[ResponseContentContentTypeSchemaApi],
    }
)

tag_to_api = TagToApi(
    {
        "operation.requestBody": OperationRequestBodyApi,
        "path.post": PathPostApi,
        "contentType_json": ContentTypeJsonApi,
        "additionalProperties": AdditionalPropertiesApi,
        "allOf": AllOfApi,
        "anyOf": AnyOfApi,
        "type": TypeApi,
        "multipleOf": MultipleOfApi,
        "format": FormatApi,
        "enum": EnumApi,
        "not": NotApi,
        "default": DefaultApi,
        "maximum": MaximumApi,
        "maxItems": MaxItemsApi,
        "maxLength": MaxLengthApi,
        "maxProperties": MaxPropertiesApi,
        "minimum": MinimumApi,
        "minItems": MinItemsApi,
        "minLength": MinLengthApi,
        "minProperties": MinPropertiesApi,
        "items": ItemsApi,
        "oneOf": OneOfApi,
        "properties": PropertiesApi,
        "pattern": PatternApi,
        "$ref": RefApi,
        "required": RequiredApi,
        "uniqueItems": UniqueItemsApi,
        "response.content.contentType.schema": ResponseContentContentTypeSchemaApi,
    }
)

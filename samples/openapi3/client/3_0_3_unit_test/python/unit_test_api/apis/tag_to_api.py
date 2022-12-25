import typing_extensions

from unit_test_api.apis.tags.operation_request_body_api import OperationRequestBodyApi
from unit_test_api.apis.tags.path_post_api import PathPostApi
from unit_test_api.apis.tags.content_type_json_api import ContentTypeJsonApi
from unit_test_api.apis.tags.response_content_content_type_schema_api import ResponseContentContentTypeSchemaApi
from unit_test_api.apis.tags.additional_properties_api import AdditionalPropertiesApi
from unit_test_api.apis.tags.all_of_api import AllOfApi
from unit_test_api.apis.tags.any_of_api import AnyOfApi
from unit_test_api.apis.tags.default_api import DefaultApi
from unit_test_api.apis.tags.enum_api import EnumApi
from unit_test_api.apis.tags.format_api import FormatApi
from unit_test_api.apis.tags.items_api import ItemsApi
from unit_test_api.apis.tags.maximum_api import MaximumApi
from unit_test_api.apis.tags.max_items_api import MaxItemsApi
from unit_test_api.apis.tags.max_length_api import MaxLengthApi
from unit_test_api.apis.tags.max_properties_api import MaxPropertiesApi
from unit_test_api.apis.tags.minimum_api import MinimumApi
from unit_test_api.apis.tags.min_items_api import MinItemsApi
from unit_test_api.apis.tags.min_length_api import MinLengthApi
from unit_test_api.apis.tags.min_properties_api import MinPropertiesApi
from unit_test_api.apis.tags.multiple_of_api import MultipleOfApi
from unit_test_api.apis.tags._not_api import _NotApi
from unit_test_api.apis.tags.one_of_api import OneOfApi
from unit_test_api.apis.tags.pattern_api import PatternApi
from unit_test_api.apis.tags.properties_api import PropertiesApi
from unit_test_api.apis.tags.ref_api import RefApi
from unit_test_api.apis.tags.required_api import RequiredApi
from unit_test_api.apis.tags.type_api import TypeApi
from unit_test_api.apis.tags.unique_items_api import UniqueItemsApi

TagToApi = typing_extensions.TypedDict(
    'TagToApi',
    {
        "operation.requestBody": OperationRequestBodyApi,
        "path.post": PathPostApi,
        "contentType_json": ContentTypeJsonApi,
        "response.content.contentType.schema": ResponseContentContentTypeSchemaApi,
        "additionalProperties": AdditionalPropertiesApi,
        "allOf": AllOfApi,
        "anyOf": AnyOfApi,
        "default": DefaultApi,
        "enum": EnumApi,
        "format": FormatApi,
        "items": ItemsApi,
        "maximum": MaximumApi,
        "maxItems": MaxItemsApi,
        "maxLength": MaxLengthApi,
        "maxProperties": MaxPropertiesApi,
        "minimum": MinimumApi,
        "minItems": MinItemsApi,
        "minLength": MinLengthApi,
        "minProperties": MinPropertiesApi,
        "multipleOf": MultipleOfApi,
        "not": _NotApi,
        "oneOf": OneOfApi,
        "pattern": PatternApi,
        "properties": PropertiesApi,
        "$ref": RefApi,
        "required": RequiredApi,
        "type": TypeApi,
        "uniqueItems": UniqueItemsApi,
    }
)

tag_to_api = TagToApi(
    {
        "operation.requestBody": OperationRequestBodyApi,
        "path.post": PathPostApi,
        "contentType_json": ContentTypeJsonApi,
        "response.content.contentType.schema": ResponseContentContentTypeSchemaApi,
        "additionalProperties": AdditionalPropertiesApi,
        "allOf": AllOfApi,
        "anyOf": AnyOfApi,
        "default": DefaultApi,
        "enum": EnumApi,
        "format": FormatApi,
        "items": ItemsApi,
        "maximum": MaximumApi,
        "maxItems": MaxItemsApi,
        "maxLength": MaxLengthApi,
        "maxProperties": MaxPropertiesApi,
        "minimum": MinimumApi,
        "minItems": MinItemsApi,
        "minLength": MinLengthApi,
        "minProperties": MinPropertiesApi,
        "multipleOf": MultipleOfApi,
        "not": _NotApi,
        "oneOf": OneOfApi,
        "pattern": PatternApi,
        "properties": PropertiesApi,
        "$ref": RefApi,
        "required": RequiredApi,
        "type": TypeApi,
        "uniqueItems": UniqueItemsApi,
    }
)

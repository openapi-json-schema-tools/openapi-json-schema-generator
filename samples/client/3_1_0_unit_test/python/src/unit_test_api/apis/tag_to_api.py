import typing
import typing_extensions

from unit_test_api.apis.tags.prefix_items_api import PrefixItemsApi
from unit_test_api.apis.tags.maximum_api import MaximumApi
from unit_test_api.apis.tags.pattern_api import PatternApi
from unit_test_api.apis.tags.additional_properties_api import AdditionalPropertiesApi
from unit_test_api.apis.tags.response_content_content_type_schema_api import ResponseContentContentTypeSchemaApi
from unit_test_api.apis.tags.dependent_required_api import DependentRequiredApi
from unit_test_api.apis.tags.min_items_api import MinItemsApi
from unit_test_api.apis.tags.min_length_api import MinLengthApi
from unit_test_api.apis.tags.required_api import RequiredApi
from unit_test_api.apis.tags.max_length_api import MaxLengthApi
from unit_test_api.apis.tags._not_api import _NotApi
from unit_test_api.apis.tags.path_post_api import PathPostApi
from unit_test_api.apis.tags.min_properties_api import MinPropertiesApi
from unit_test_api.apis.tags.unique_items_api import UniqueItemsApi
from unit_test_api.apis.tags.operation_request_body_api import OperationRequestBodyApi
from unit_test_api.apis.tags.contains_api import ContainsApi
from unit_test_api.apis.tags.one_of_api import OneOfApi
from unit_test_api.apis.tags.min_contains_api import MinContainsApi
from unit_test_api.apis.tags.max_contains_api import MaxContainsApi
from unit_test_api.apis.tags.ref_api import RefApi
from unit_test_api.apis.tags.all_of_api import AllOfApi
from unit_test_api.apis.tags.minimum_api import MinimumApi
from unit_test_api.apis.tags.any_of_api import AnyOfApi
from unit_test_api.apis.tags.multiple_of_api import MultipleOfApi
from unit_test_api.apis.tags.type_api import TypeApi
from unit_test_api.apis.tags.items_api import ItemsApi
from unit_test_api.apis.tags.format_api import FormatApi
from unit_test_api.apis.tags.properties_api import PropertiesApi
from unit_test_api.apis.tags.content_type_json_api import ContentTypeJsonApi
from unit_test_api.apis.tags.max_properties_api import MaxPropertiesApi
from unit_test_api.apis.tags.const_api import ConstApi
from unit_test_api.apis.tags.enum_api import EnumApi
from unit_test_api.apis.tags.max_items_api import MaxItemsApi
from unit_test_api.apis.tags.pattern_properties_api import PatternPropertiesApi
from unit_test_api.apis.tags.dependent_schemas_api import DependentSchemasApi

TagToApi = typing.TypedDict(
    'TagToApi',
    {
        "prefixItems": typing.Type[PrefixItemsApi],
        "maximum": typing.Type[MaximumApi],
        "pattern": typing.Type[PatternApi],
        "additionalProperties": typing.Type[AdditionalPropertiesApi],
        "response.content.contentType.schema": typing.Type[ResponseContentContentTypeSchemaApi],
        "dependentRequired": typing.Type[DependentRequiredApi],
        "minItems": typing.Type[MinItemsApi],
        "minLength": typing.Type[MinLengthApi],
        "required": typing.Type[RequiredApi],
        "maxLength": typing.Type[MaxLengthApi],
        "not": typing.Type[_NotApi],
        "path.post": typing.Type[PathPostApi],
        "minProperties": typing.Type[MinPropertiesApi],
        "uniqueItems": typing.Type[UniqueItemsApi],
        "operation.requestBody": typing.Type[OperationRequestBodyApi],
        "contains": typing.Type[ContainsApi],
        "oneOf": typing.Type[OneOfApi],
        "minContains": typing.Type[MinContainsApi],
        "maxContains": typing.Type[MaxContainsApi],
        "$ref": typing.Type[RefApi],
        "allOf": typing.Type[AllOfApi],
        "minimum": typing.Type[MinimumApi],
        "anyOf": typing.Type[AnyOfApi],
        "multipleOf": typing.Type[MultipleOfApi],
        "type": typing.Type[TypeApi],
        "items": typing.Type[ItemsApi],
        "format": typing.Type[FormatApi],
        "properties": typing.Type[PropertiesApi],
        "contentType_json": typing.Type[ContentTypeJsonApi],
        "maxProperties": typing.Type[MaxPropertiesApi],
        "const": typing.Type[ConstApi],
        "enum": typing.Type[EnumApi],
        "maxItems": typing.Type[MaxItemsApi],
        "patternProperties": typing.Type[PatternPropertiesApi],
        "dependentSchemas": typing.Type[DependentSchemasApi],
    }
)

tag_to_api = TagToApi(
    {
        "prefixItems": PrefixItemsApi,
        "maximum": MaximumApi,
        "pattern": PatternApi,
        "additionalProperties": AdditionalPropertiesApi,
        "response.content.contentType.schema": ResponseContentContentTypeSchemaApi,
        "dependentRequired": DependentRequiredApi,
        "minItems": MinItemsApi,
        "minLength": MinLengthApi,
        "required": RequiredApi,
        "maxLength": MaxLengthApi,
        "not": _NotApi,
        "path.post": PathPostApi,
        "minProperties": MinPropertiesApi,
        "uniqueItems": UniqueItemsApi,
        "operation.requestBody": OperationRequestBodyApi,
        "contains": ContainsApi,
        "oneOf": OneOfApi,
        "minContains": MinContainsApi,
        "maxContains": MaxContainsApi,
        "$ref": RefApi,
        "allOf": AllOfApi,
        "minimum": MinimumApi,
        "anyOf": AnyOfApi,
        "multipleOf": MultipleOfApi,
        "type": TypeApi,
        "items": ItemsApi,
        "format": FormatApi,
        "properties": PropertiesApi,
        "contentType_json": ContentTypeJsonApi,
        "maxProperties": MaxPropertiesApi,
        "const": ConstApi,
        "enum": EnumApi,
        "maxItems": MaxItemsApi,
        "patternProperties": PatternPropertiesApi,
        "dependentSchemas": DependentSchemasApi,
    }
)

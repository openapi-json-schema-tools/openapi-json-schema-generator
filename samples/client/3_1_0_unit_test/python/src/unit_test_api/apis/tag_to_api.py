import typing
import typing_extensions

from unit_test_api.apis.tags.operation_request_body_api import OperationRequestBodyApi
from unit_test_api.apis.tags.path_post_api import PathPostApi
from unit_test_api.apis.tags.prefix_items_api import PrefixItemsApi
from unit_test_api.apis.tags.content_type_json_api import ContentTypeJsonApi
from unit_test_api.apis.tags.additional_properties_api import AdditionalPropertiesApi
from unit_test_api.apis.tags.all_of_api import AllOfApi
from unit_test_api.apis.tags.any_of_api import AnyOfApi
from unit_test_api.apis.tags.type_api import TypeApi
from unit_test_api.apis.tags.multiple_of_api import MultipleOfApi
from unit_test_api.apis.tags.const_api import ConstApi
from unit_test_api.apis.tags.contains_api import ContainsApi
from unit_test_api.apis.tags.format_api import FormatApi
from unit_test_api.apis.tags.dependent_schemas_api import DependentSchemasApi
from unit_test_api.apis.tags.dependent_required_api import DependentRequiredApi
from unit_test_api.apis.tags.enum_api import EnumApi
from unit_test_api.apis.tags.exclusive_maximum_api import ExclusiveMaximumApi
from unit_test_api.apis.tags.exclusive_minimum_api import ExclusiveMinimumApi
from unit_test_api.apis.tags._not_api import _NotApi
from unit_test_api.apis.tags.if_then_else_api import IfThenElseApi
from unit_test_api.apis.tags.items_api import ItemsApi
from unit_test_api.apis.tags.max_contains_api import MaxContainsApi
from unit_test_api.apis.tags.maximum_api import MaximumApi
from unit_test_api.apis.tags.max_items_api import MaxItemsApi
from unit_test_api.apis.tags.max_length_api import MaxLengthApi
from unit_test_api.apis.tags.max_properties_api import MaxPropertiesApi
from unit_test_api.apis.tags.min_contains_api import MinContainsApi
from unit_test_api.apis.tags.minimum_api import MinimumApi
from unit_test_api.apis.tags.min_items_api import MinItemsApi
from unit_test_api.apis.tags.min_length_api import MinLengthApi
from unit_test_api.apis.tags.min_properties_api import MinPropertiesApi
from unit_test_api.apis.tags.pattern_properties_api import PatternPropertiesApi
from unit_test_api.apis.tags.one_of_api import OneOfApi
from unit_test_api.apis.tags.properties_api import PropertiesApi
from unit_test_api.apis.tags.pattern_api import PatternApi
from unit_test_api.apis.tags.ref_api import RefApi
from unit_test_api.apis.tags.property_names_api import PropertyNamesApi
from unit_test_api.apis.tags.required_api import RequiredApi
from unit_test_api.apis.tags.unevaluated_items_api import UnevaluatedItemsApi
from unit_test_api.apis.tags.unevaluated_properties_api import UnevaluatedPropertiesApi
from unit_test_api.apis.tags.unique_items_api import UniqueItemsApi
from unit_test_api.apis.tags.response_content_content_type_schema_api import ResponseContentContentTypeSchemaApi

TagToApi = typing.TypedDict(
    'TagToApi',
    {
        "operation.requestBody": typing.Type[OperationRequestBodyApi],
        "path.post": typing.Type[PathPostApi],
        "prefixItems": typing.Type[PrefixItemsApi],
        "contentType_json": typing.Type[ContentTypeJsonApi],
        "additionalProperties": typing.Type[AdditionalPropertiesApi],
        "allOf": typing.Type[AllOfApi],
        "anyOf": typing.Type[AnyOfApi],
        "type": typing.Type[TypeApi],
        "multipleOf": typing.Type[MultipleOfApi],
        "const": typing.Type[ConstApi],
        "contains": typing.Type[ContainsApi],
        "format": typing.Type[FormatApi],
        "dependentSchemas": typing.Type[DependentSchemasApi],
        "dependentRequired": typing.Type[DependentRequiredApi],
        "enum": typing.Type[EnumApi],
        "exclusiveMaximum": typing.Type[ExclusiveMaximumApi],
        "exclusiveMinimum": typing.Type[ExclusiveMinimumApi],
        "not": typing.Type[_NotApi],
        "if-then-else": typing.Type[IfThenElseApi],
        "items": typing.Type[ItemsApi],
        "maxContains": typing.Type[MaxContainsApi],
        "maximum": typing.Type[MaximumApi],
        "maxItems": typing.Type[MaxItemsApi],
        "maxLength": typing.Type[MaxLengthApi],
        "maxProperties": typing.Type[MaxPropertiesApi],
        "minContains": typing.Type[MinContainsApi],
        "minimum": typing.Type[MinimumApi],
        "minItems": typing.Type[MinItemsApi],
        "minLength": typing.Type[MinLengthApi],
        "minProperties": typing.Type[MinPropertiesApi],
        "patternProperties": typing.Type[PatternPropertiesApi],
        "oneOf": typing.Type[OneOfApi],
        "properties": typing.Type[PropertiesApi],
        "pattern": typing.Type[PatternApi],
        "$ref": typing.Type[RefApi],
        "propertyNames": typing.Type[PropertyNamesApi],
        "required": typing.Type[RequiredApi],
        "unevaluatedItems": typing.Type[UnevaluatedItemsApi],
        "unevaluatedProperties": typing.Type[UnevaluatedPropertiesApi],
        "uniqueItems": typing.Type[UniqueItemsApi],
        "response.content.contentType.schema": typing.Type[ResponseContentContentTypeSchemaApi],
    }
)

tag_to_api = TagToApi(
    {
        "operation.requestBody": OperationRequestBodyApi,
        "path.post": PathPostApi,
        "prefixItems": PrefixItemsApi,
        "contentType_json": ContentTypeJsonApi,
        "additionalProperties": AdditionalPropertiesApi,
        "allOf": AllOfApi,
        "anyOf": AnyOfApi,
        "type": TypeApi,
        "multipleOf": MultipleOfApi,
        "const": ConstApi,
        "contains": ContainsApi,
        "format": FormatApi,
        "dependentSchemas": DependentSchemasApi,
        "dependentRequired": DependentRequiredApi,
        "enum": EnumApi,
        "exclusiveMaximum": ExclusiveMaximumApi,
        "exclusiveMinimum": ExclusiveMinimumApi,
        "not": _NotApi,
        "if-then-else": IfThenElseApi,
        "items": ItemsApi,
        "maxContains": MaxContainsApi,
        "maximum": MaximumApi,
        "maxItems": MaxItemsApi,
        "maxLength": MaxLengthApi,
        "maxProperties": MaxPropertiesApi,
        "minContains": MinContainsApi,
        "minimum": MinimumApi,
        "minItems": MinItemsApi,
        "minLength": MinLengthApi,
        "minProperties": MinPropertiesApi,
        "patternProperties": PatternPropertiesApi,
        "oneOf": OneOfApi,
        "properties": PropertiesApi,
        "pattern": PatternApi,
        "$ref": RefApi,
        "propertyNames": PropertyNamesApi,
        "required": RequiredApi,
        "unevaluatedItems": UnevaluatedItemsApi,
        "unevaluatedProperties": UnevaluatedPropertiesApi,
        "uniqueItems": UniqueItemsApi,
        "response.content.contentType.schema": ResponseContentContentTypeSchemaApi,
    }
)

import typing
import typing_extensions

from openapi_client.apis.tags.operation_request_body_api import OperationRequestBodyApi
from openapi_client.apis.tags.path_post_api import PathPostApi
from openapi_client.apis.tags.prefix_items_api import PrefixItemsApi
from openapi_client.apis.tags.content_type_json_api import ContentTypeJsonApi
from openapi_client.apis.tags.additional_properties_api import AdditionalPropertiesApi
from openapi_client.apis.tags.all_of_api import AllOfApi
from openapi_client.apis.tags.any_of_api import AnyOfApi
from openapi_client.apis.tags.type_api import TypeApi
from openapi_client.apis.tags.multiple_of_api import MultipleOfApi
from openapi_client.apis.tags.const_api import ConstApi
from openapi_client.apis.tags.contains_api import ContainsApi
from openapi_client.apis.tags.format_api import FormatApi
from openapi_client.apis.tags.dependent_schemas_api import DependentSchemasApi
from openapi_client.apis.tags.dependent_required_api import DependentRequiredApi
from openapi_client.apis.tags.enum_api import EnumApi
from openapi_client.apis.tags.exclusive_maximum_api import ExclusiveMaximumApi
from openapi_client.apis.tags.exclusive_minimum_api import ExclusiveMinimumApi
from openapi_client.apis.tags.not_api import NotApi
from openapi_client.apis.tags.if_then_else_api import IfThenElseApi
from openapi_client.apis.tags.items_api import ItemsApi
from openapi_client.apis.tags.max_contains_api import MaxContainsApi
from openapi_client.apis.tags.maximum_api import MaximumApi
from openapi_client.apis.tags.max_items_api import MaxItemsApi
from openapi_client.apis.tags.max_length_api import MaxLengthApi
from openapi_client.apis.tags.max_properties_api import MaxPropertiesApi
from openapi_client.apis.tags.min_contains_api import MinContainsApi
from openapi_client.apis.tags.minimum_api import MinimumApi
from openapi_client.apis.tags.min_items_api import MinItemsApi
from openapi_client.apis.tags.min_length_api import MinLengthApi
from openapi_client.apis.tags.min_properties_api import MinPropertiesApi
from openapi_client.apis.tags.pattern_properties_api import PatternPropertiesApi
from openapi_client.apis.tags.one_of_api import OneOfApi
from openapi_client.apis.tags.properties_api import PropertiesApi
from openapi_client.apis.tags.pattern_api import PatternApi
from openapi_client.apis.tags.ref_api import RefApi
from openapi_client.apis.tags.property_names_api import PropertyNamesApi
from openapi_client.apis.tags.required_api import RequiredApi
from openapi_client.apis.tags.unevaluated_items_api import UnevaluatedItemsApi
from openapi_client.apis.tags.unevaluated_properties_api import UnevaluatedPropertiesApi
from openapi_client.apis.tags.unique_items_api import UniqueItemsApi
from openapi_client.apis.tags.response_content_content_type_schema_api import ResponseContentContentTypeSchemaApi

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
        "not": typing.Type[NotApi],
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
        "not": NotApi,
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

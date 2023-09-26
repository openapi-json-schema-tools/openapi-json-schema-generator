# coding: utf-8

"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from unit_test_api.paths.response_body_post_multiple_dependents_required_response_body_for_content_types.post.operation import PostMultipleDependentsRequiredResponseBodyForContentTypes
from unit_test_api.paths.response_body_post_single_dependency_response_body_for_content_types.post.operation import PostSingleDependencyResponseBodyForContentTypes
from unit_test_api.paths.response_body_post_empty_dependents_response_body_for_content_types.post.operation import PostEmptyDependentsResponseBodyForContentTypes
from unit_test_api.paths.request_body_post_single_dependency_request_body.post.operation import PostSingleDependencyRequestBody
from unit_test_api.paths.request_body_post_empty_dependents_request_body.post.operation import PostEmptyDependentsRequestBody
from unit_test_api.paths.request_body_post_multiple_dependents_required_request_body.post.operation import PostMultipleDependentsRequiredRequestBody


class DependentRequiredApi(
    PostMultipleDependentsRequiredResponseBodyForContentTypes,
    PostSingleDependencyResponseBodyForContentTypes,
    PostEmptyDependentsResponseBodyForContentTypes,
    PostSingleDependencyRequestBody,
    PostEmptyDependentsRequestBody,
    PostMultipleDependentsRequiredRequestBody,
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    pass
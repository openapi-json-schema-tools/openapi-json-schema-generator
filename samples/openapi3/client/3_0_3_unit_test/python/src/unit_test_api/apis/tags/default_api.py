# coding: utf-8

"""
    openapi 3.0.3 sample spec

    sample spec for testing openapi functionality, built from json schema tests for draft6  # noqa: E501

    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from unit_test_api.paths.request_body_post_invalid_string_value_for_default_request_body.post import PostInvalidStringValueForDefaultRequestBody
from unit_test_api.paths.response_body_post_invalid_string_value_for_default_response_body_for_content_types.post import PostInvalidStringValueForDefaultResponseBodyForContentTypes
from unit_test_api.paths.request_body_post_the_default_keyword_does_not_do_anything_if_the_property_is_missing_request_body.post import PostTheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingRequestBody
from unit_test_api.paths.response_body_post_the_default_keyword_does_not_do_anything_if_the_property_is_missing_response_body_for_content_types.post import PostTheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingResponseBodyForContentTypes


class DefaultApi(
    PostInvalidStringValueForDefaultRequestBody,
    PostInvalidStringValueForDefaultResponseBodyForContentTypes,
    PostTheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingRequestBody,
    PostTheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingResponseBodyForContentTypes,
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    pass
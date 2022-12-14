# coding: utf-8

"""
    openapi 3.0.3 sample spec

    sample spec for testing openapi functionality, built from json schema tests for draft6  # noqa: E501

    The version of the OpenAPI document: 0.0.1
    Generated by: https://openapi-generator.tech
"""

from unit_test_api.paths.request_body_post_object_properties_validation_request_body.post import PostObjectPropertiesValidationRequestBody
from unit_test_api.paths.response_body_post_object_properties_validation_response_body_for_content_types.post import PostObjectPropertiesValidationResponseBodyForContentTypes
from unit_test_api.paths.request_body_post_properties_with_escaped_characters_request_body.post import PostPropertiesWithEscapedCharactersRequestBody
from unit_test_api.paths.response_body_post_properties_with_escaped_characters_response_body_for_content_types.post import PostPropertiesWithEscapedCharactersResponseBodyForContentTypes


class PropertiesApi(
    PostObjectPropertiesValidationRequestBody,
    PostObjectPropertiesValidationResponseBodyForContentTypes,
    PostPropertiesWithEscapedCharactersRequestBody,
    PostPropertiesWithEscapedCharactersResponseBodyForContentTypes,
):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """
    pass

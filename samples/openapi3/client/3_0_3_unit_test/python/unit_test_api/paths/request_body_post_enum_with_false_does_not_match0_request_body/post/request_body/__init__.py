# coding: utf-8

"""


    Generated by: https://openapi-generator.tech
"""

from unit_test_api import api_client, exceptions

from unit_test_api.components.schema import enum_with_false_does_not_match0

parameter_oapg = api_client.RequestBody(
    content={
        'application/json': api_client.MediaType(
            schema=enum_with_false_does_not_match0.EnumWithFalseDoesNotMatch0,
        ),
    },
    required=True,
)

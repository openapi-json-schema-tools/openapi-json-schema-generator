# coding: utf-8

"""


    Generated by: https://openapi-generator.tech
"""

from unit_test_api import api_client, exceptions

from unit_test_api.components.schema import integer_type_matches_integers

parameter_oapg = api_client.RequestBody(
    content={
        'application/json': api_client.MediaType(
            schema=integer_type_matches_integers.IntegerTypeMatchesIntegers,
        ),
    },
    required=True,
)

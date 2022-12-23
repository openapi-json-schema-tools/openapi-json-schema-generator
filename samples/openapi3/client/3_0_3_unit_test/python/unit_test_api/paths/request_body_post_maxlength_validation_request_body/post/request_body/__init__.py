# coding: utf-8

"""


    Generated by: https://openapi-generator.tech
"""

from unit_test_api import api_client, exceptions

from unit_test_api.components.schema import maxlength_validation

parameter_oapg = api_client.RequestBody(
    content={
        'application/json': api_client.MediaType(
            schema=maxlength_validation.MaxlengthValidation,
        ),
    },
    required=True,
)
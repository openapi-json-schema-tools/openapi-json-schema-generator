# coding: utf-8

"""


    Generated by: https://openapi-generator.tech
"""

from unit_test_api import api_client, exceptions

from unit_test_api.components.schema import not_more_complex_schema

parameter_oapg = api_client.RequestBody(
    content={
        'application/json': api_client.MediaType(
            schema=not_more_complex_schema.NotMoreComplexSchema,
        ),
    },
    required=True,
)

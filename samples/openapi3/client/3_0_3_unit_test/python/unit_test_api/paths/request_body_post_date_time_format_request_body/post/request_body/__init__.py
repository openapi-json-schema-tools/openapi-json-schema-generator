# coding: utf-8

"""


    Generated by: https://openapi-generator.tech
"""

from unit_test_api import api_client, exceptions

from unit_test_api.components.schema import date_time_format

parameter_oapg = api_client.RequestBody(
    content={
        'application/json': api_client.MediaType(
            schema=date_time_format.DateTimeFormat,
        ),
    },
    required=True,
)
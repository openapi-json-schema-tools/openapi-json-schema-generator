# coding: utf-8

"""


    Generated by: https://openapi-generator.tech
"""

from petstore_api import api_client, exceptions

from petstore_api.components.schema import user

parameter_oapg = api_client.RequestBody(
    content={
        'application/json': api_client.MediaType(
            schema=user.User,
        ),
    },
    required=True,
)

# coding: utf-8

"""


    Generated by: https://openapi-generator.tech
"""

from dataclasses import dataclass
import typing_extensions
import urllib3

from petstore_api import api_client, exceptions

from petstore_api.components.schema import array_of_enums

parameter_oapg = api_client.RequestBody(
    content={
        'application/json': api_client.MediaType(
            schema=array_of_enums.ArrayOfEnums,
        ),
    },
)

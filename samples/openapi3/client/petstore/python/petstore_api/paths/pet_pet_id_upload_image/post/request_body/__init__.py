# coding: utf-8

"""


    Generated by: https://openapi-generator.tech
"""

from petstore_api import api_client, exceptions
from . import multipart_form_data

parameter_oapg = api_client.RequestBody(
    content={
        'multipart/form-data': api_client.MediaType(
            schema=multipart_form_data.MultipartFormData,
        ),
    },
)

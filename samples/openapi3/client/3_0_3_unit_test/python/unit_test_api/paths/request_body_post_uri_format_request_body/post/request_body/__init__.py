# coding: utf-8

"""


    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from unit_test_api import api_client, exceptions

from unit_test_api.components.schema import uri_format

class RequestBody(api_client.RequestBody):
    content = {
        'application/json': api_client.MediaType(
            schema=uri_format.UriFormat,
        ),
    }
    required = True

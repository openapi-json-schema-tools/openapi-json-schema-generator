# coding: utf-8

"""


    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from unit_test_api import api_client, exceptions

from unit_test_api.components.schema import string_type_matches_strings

class RequestBody(api_client.RequestBody):
    content = {
        'application/json': api_client.MediaType(
            schema=string_type_matches_strings.StringTypeMatchesStrings,
        ),
    }
    required = True
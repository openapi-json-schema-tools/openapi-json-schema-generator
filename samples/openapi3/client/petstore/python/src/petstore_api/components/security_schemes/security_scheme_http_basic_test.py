# coding: utf-8

"""


    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import typing
import typing_extensions

from petstore_api import security_schemes

class HttpBasicTest(security_schemes.HTTPSecurityScheme):
    '''
    http basic
    '''
    scheme = security_schemes.HTTPSchemeType.BASIC
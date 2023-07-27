# coding: utf-8

"""
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from petstore_api.shared_imports.security_scheme_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

@dataclasses.dataclass
class OpenIdConnectTest(security_schemes.OpenIdConnectSecurityScheme):
    '''
    openIdConnect
    '''
    openid_connect_url = "https://somesite.com/.well-known/openid-configuration"
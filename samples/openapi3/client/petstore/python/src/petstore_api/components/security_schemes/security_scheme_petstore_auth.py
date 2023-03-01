# coding: utf-8

"""


    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import typing
import typing_extensions

from petstore_api import security_schemes

class PetstoreAuth(security_schemes.OAuth2SecurityScheme):
    '''
    oauth2 implicit flow with two scopes
    '''
    flows = security_schemes.OAuthFlows(
        implicit=security_schemes.ImplicitOAuthFlow(
            scopes={
                "write:pets": "modify pets in your account",
                "read:pets": "read your pets",
            },
            authorization_url="http://petstore.swagger.io/api/oauth/dialog"
        )
    )
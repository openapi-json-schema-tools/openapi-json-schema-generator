# coding: utf-8

"""


    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import dataclasses
import typing
import typing_extensions
from urllib import parse

from this_package import security_schemes


@dataclasses.dataclass
class ClientCredentialsOauthFlow(security_schemes.ClientCredentialsOauthFlow):
    token_url: parse.ParseResult = parse.ParseResult(
        scheme="https",
        netloc="petstore.swagger.io",
        path="/api/oauth/token",
        params='',
        query='',
        fragment=''
    )
    scopes: typing.Dict[str, str] = dataclasses.field(default_factory=lambda: {
        "write:pets": "modify pets in your account",
        "read:pets": "read your pets",
    })



class OAuthFlows(security_schemes.OAuthFlows):
    client_credentials: ClientCredentialsOauthFlow = ClientCredentialsOauthFlow()



@dataclasses.dataclass
class OauthClientCredentials(security_schemes.OAuth2SecurityScheme):
    '''
    oauth2 implicit flow with two scopes
    '''
    flows: OAuthFlows = OAuthFlows()

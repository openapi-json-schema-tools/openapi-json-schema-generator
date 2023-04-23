# coding: utf-8
"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import abc
import base64
import dataclasses
import enum
import typing
import typing_extensions
from urllib import parse

from urllib3 import _collections

from petstore_api import exceptions
from petstore_api import signing


@dataclasses.dataclass
class OauthClientInfo:
    client_id: str
    client_secret: typing.Optional[str] = None


# oauth server to client info
OauthServerClientInfo = typing_extensions.TypedDict(
    'OauthServerClientInfo',
    {
        "petstore.swagger.io": OauthClientInfo,
    },
    total=False
)


class SecuritySchemeType(enum.Enum):
    API_KEY = 'apiKey'
    HTTP = 'http'
    MUTUAL_TLS = 'mutualTLS'
    OAUTH_2 = 'oauth2'
    OPENID_CONNECT = 'openIdConnect'


class ApiKeyInLocation(enum.Enum):
    QUERY = 'query'
    HEADER = 'header'
    COOKIE = 'cookie'


class __SecuritySchemeBase(metaclass=abc.ABCMeta):
    @abc.abstractmethod
    def apply_auth(
        self,
        headers: _collections.HTTPHeaderDict,
        resource_path: str,
        method: str,
        body: typing.Optional[typing.Union[str, bytes]],
        scope_names: typing.Tuple[str] = (),
        oath_server_client_info: OauthServerClientInfo = {}
    ) -> None:
        pass


@dataclasses.dataclass
class ApiKeySecurityScheme(__SecuritySchemeBase, abc.ABC):
    api_key: str  # this must be set by the developer
    name: str = ''
    in_location: ApiKeyInLocation = ApiKeyInLocation.QUERY
    type: SecuritySchemeType = SecuritySchemeType.API_KEY

    def apply_auth(
        self,
        headers: _collections.HTTPHeaderDict,
        resource_path: str,
        method: str,
        body: typing.Optional[typing.Union[str, bytes]],
        scope_names: typing.Tuple[str] = (),
        oath_server_client_info: OauthServerClientInfo = {}
    ) -> None:
        if self.in_location is ApiKeyInLocation.COOKIE:
            headers.add('Cookie', self.api_key)
        elif self.in_location is ApiKeyInLocation.HEADER:
            headers.add(self.name, self.api_key)
        elif self.in_location is ApiKeyInLocation.QUERY:
            # todo add query handling
            raise NotImplementedError("ApiKeySecurityScheme in query not yet implemented")
        return


class HTTPSchemeType(enum.Enum):
    BASIC = 'basic'
    BEARER = 'bearer'
    DIGEST = 'digest'
    SIGNATURE = 'signature' # https://datatracker.ietf.org/doc/draft-cavage-http-signatures/


@dataclasses.dataclass
class HTTPBasicSecurityScheme(__SecuritySchemeBase):
    user_id: str  # user name
    password: str
    scheme: HTTPSchemeType = HTTPSchemeType.BASIC
    encoding: str = 'utf-8'
    type: SecuritySchemeType = SecuritySchemeType.HTTP
    """
    https://www.rfc-editor.org/rfc/rfc7617.html
    """

    def apply_auth(
        self,
        headers: _collections.HTTPHeaderDict,
        resource_path: str,
        method: str,
        body: typing.Optional[typing.Union[str, bytes]],
        scope_names: typing.Tuple[str] = (),
        oath_server_client_info: OauthServerClientInfo = {}
    ) -> None:
        user_pass = f"{self.user_id}:{self.password}"
        b64_user_pass = base64.b64encode(user_pass.encode(encoding=self.encoding))
        headers.add('Authorization', f"Basic {b64_user_pass.decode()}")


@dataclasses.dataclass
class HTTPBearerSecurityScheme(__SecuritySchemeBase):
    access_token: str
    bearer_format: typing.Optional[str] = None
    scheme: HTTPSchemeType = HTTPSchemeType.BEARER
    type: SecuritySchemeType = SecuritySchemeType.HTTP

    def apply_auth(
        self,
        headers: _collections.HTTPHeaderDict,
        resource_path: str,
        method: str,
        body: typing.Optional[typing.Union[str, bytes]],
        scope_names: typing.Tuple[str] = (),
        oath_server_client_info: OauthServerClientInfo = {}
    ) -> None:
        headers.add('Authorization', f"Bearer {self.access_token}")


@dataclasses.dataclass
class HTTPSignatureSecurityScheme(__SecuritySchemeBase):
    signing_info: signing.HttpSigningConfiguration
    scheme: HTTPSchemeType = HTTPSchemeType.SIGNATURE
    type: SecuritySchemeType = SecuritySchemeType.HTTP

    def apply_auth(
        self,
        headers: _collections.HTTPHeaderDict,
        resource_path: str,
        method: str,
        body: typing.Optional[typing.Union[str, bytes]],
        scope_names: typing.Tuple[str] = (),
        oath_server_client_info: OauthServerClientInfo = {}
    ) -> None:
        query_params = tuple()
        auth_headers = self.signing_info.get_http_signature_headers(
                            resource_path, method, headers, body, query_params)
        for key, value in auth_headers.items():
            headers.add(key, value)


@dataclasses.dataclass
class HTTPDigestSecurityScheme(__SecuritySchemeBase):
    scheme: HTTPSchemeType = HTTPSchemeType.DIGEST
    type: SecuritySchemeType = SecuritySchemeType.HTTP

    def apply_auth(
        self,
        headers: _collections.HTTPHeaderDict,
        resource_path: str,
        method: str,
        body: typing.Optional[typing.Union[str, bytes]],
        scope_names: typing.Tuple[str] = (),
        oath_server_client_info: OauthServerClientInfo = {}
    ) -> None:
        raise NotImplementedError("HTTPDigestSecurityScheme not yet implemented")


@dataclasses.dataclass
class MutualTLSSecurityScheme(__SecuritySchemeBase):
    type: SecuritySchemeType = SecuritySchemeType.MUTUAL_TLS

    def apply_auth(
        self,
        headers: _collections.HTTPHeaderDict,
        resource_path: str,
        method: str,
        body: typing.Optional[typing.Union[str, bytes]],
        scope_names: typing.Tuple[str] = (),
        oath_server_client_info: OauthServerClientInfo = {}
    ) -> None:
        raise NotImplementedError("MutualTLSSecurityScheme not yet implemented")


@dataclasses.dataclass
class ImplicitOAuthFlow:
    authorization_url: parse.ParseResult
    scopes: typing.Dict[str, str]
    refresh_url: typing.Optional[str] = None

    @property
    def auth_or_token_url(self) -> parse.ParseResult:
        return self.authorization_url


@dataclasses.dataclass
class TokenUrlOauthFlow:
    token_url: parse.ParseResult
    scopes: typing.Dict[str, str]
    refresh_url: typing.Optional[str] = None

    @property
    def auth_or_token_url(self) -> parse.ParseResult:
        return self.token_url


@dataclasses.dataclass
class AuthorizationCodeOauthFlow:
    authorization_url: parse.ParseResult
    token_url: parse.ParseResult
    scopes: typing.Dict[str, str]
    refresh_url: typing.Optional[str] = None

    @property
    def auth_or_token_url(self) -> parse.ParseResult:
        return self.authorization_url


@dataclasses.dataclass
class OAuthFlows:
    implicit: typing.Optional[ImplicitOAuthFlow] = None
    password: typing.Optional[TokenUrlOauthFlow] = None
    client_credentials: typing.Optional[TokenUrlOauthFlow] = None
    authorization_code: typing.Optional[AuthorizationCodeOauthFlow] = None


class OAuth2SecurityScheme(__SecuritySchemeBase, abc.ABC):
    flows: OAuthFlows
    type: SecuritySchemeType = SecuritySchemeType.OAUTH_2

    def apply_auth(
        self,
        headers: _collections.HTTPHeaderDict,
        resource_path: str,
        method: str,
        body: typing.Optional[typing.Union[str, bytes]],
        scope_names: typing.Tuple[str] = (),
        oath_server_client_info: OauthServerClientInfo = {}
    ) -> None:
        if not self.flows:
            raise exceptions.ApiValueError('flows are not defined and are required, define them')
        if not scope_names:
            raise exceptions.ApiValueError('scope_names are not defined and are required, define them')
        if not oath_server_client_info:
            raise exceptions.ApiValueError('oath_server_client_info is not defined and is required, define it')
        chosen_flows = []
        for flow in [self.flows.implicit, self.flows.password, self.flows.client_credentials, self.flows.authorization_code]:
            if flow is None:
                continue
            all_scopes_present = True
            for scope_name in scope_names:
                if scope_name not in flow.scopes:
                    all_scopes_present = False
                    break
            if not all_scopes_present:
                continue
            chosen_flows.append(flow)
        if not chosen_flows:
            raise exceptions.ApiValueError(f"flow not found containing scopes={scope_names}")
        if len(chosen_flows) > 1:
            raise exceptions.ApiValueError(
                f"Greater than 1 flow found containing scopes={scope_names}, only 1 "
                "flow may contain the scopes"
            )
        chosen_flow = chosen_flows[0]
        if chosen_flow.auth_or_token_url.netloc not in oath_server_client_info:
            raise exceptions.ApiValueError(
                f"oath_server_client_info is missing info for oauth server "
                "hostname={chosen_flow.auth_or_token_url.netloc}. Add it to you api_configuration"
            )
        client_info = oath_server_client_info[chosen_flow.auth_or_token_url.netloc]
        # pass in scope + client_info into the flow and get auth for it
        # note: scope input must be sorted tuple


class OpenIdConnectSecurityScheme(__SecuritySchemeBase, abc.ABC):
    openid_connect_url: str
    type: SecuritySchemeType = SecuritySchemeType.OPENID_CONNECT

    def apply_auth(
        self,
        headers: _collections.HTTPHeaderDict,
        resource_path: str,
        method: str,
        body: typing.Optional[typing.Union[str, bytes]],
        scope_names: typing.Tuple[str] = (),
        oath_server_client_info: OauthServerClientInfo = {}
    ) -> None:
        raise NotImplementedError("OpenIdConnectSecurityScheme not yet implemented")

"""
Key is the Security scheme class
Value is the list of scopes
"""
SecurityRequirementObject = typing_extensions.TypedDict(
    'SecurityRequirementObject',
    {
        'api_key': typing.List[str],
        'api_key_query': typing.List[str],
        'bearer_test': typing.List[str],
        'http_basic_test': typing.List[str],
        'http_signature_test': typing.List[str],
        'openIdConnect_test': typing.List[str],
        'petstore_auth': typing.List[str],
    },
    total=False
)
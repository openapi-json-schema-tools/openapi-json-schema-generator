# coding: utf-8
"""
    security-test

    No description provided (generated by Openapi JSON Schema Generator https://github.com/openapi-json-schema-tools/openapi-json-schema-generator)  # noqa: E501

    The version of the OpenAPI document: 1.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

import abc
import base64
import dataclasses
import enum
import typing
import typing_extensions
from urllib import parse

from authlib.integrations import requests_client
from urllib3 import _collections

from this_package import exceptions


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


@dataclasses.dataclass
class OauthTokenRequired(typing_extensions.TypedDict):
    access_token: str
    token_type: str


@dataclasses.dataclass
class OauthTokenOptional(typing_extensions.TypedDict, total=False):
    expires_in: int
    refresh_token: str


class OauthToken(OauthTokenRequired, OauthTokenOptional):
    pass


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


class OAuthFlowBase:
    def apply_auth(
        self,
        headers: _collections.HTTPHeaderDict,
        token: OauthToken
    ) -> None:
        if token['token_type'] == 'Bearer':
            headers.add('Authorization', f"Bearer {token['access_token']}")
        raise NotImplementedError(f"OauthToken token_type={token['token_type']} application not yet implemented")


@dataclasses.dataclass
class ImplicitOAuthFlow(OAuthFlowBase):
    authorization_url: parse.ParseResult
    scopes: typing.Dict[str, str]
    refresh_url: typing.Optional[str] = None

    @property
    def auth_or_token_url(self) -> parse.ParseResult:
        return self.authorization_url

    def apply_auth(
        self,
        headers: _collections.HTTPHeaderDict,
        resource_path: str,
        method: str,
        body: typing.Optional[typing.Union[str, bytes]],
        scope_names: typing.Tuple[str] = (),
        client_info: OauthClientInfo = {}
    ) -> None:
        """
        Not implemented because this flow requires the user to visit a webpage and grant access
        then get a redirection. The code would need to automatically do that.
        """
        raise NotImplementedError("ImplicitOAuthFlow not yet implemented")


@dataclasses.dataclass
class PasswordOauthFlow(OAuthFlowBase):
    token_url: parse.ParseResult
    scopes: typing.Dict[str, str]
    username: str
    password: str
    refresh_url: typing.Optional[str] = None
    _scope_names_to_client: typing.Dict[typing.Tuple[str, ...], requests_client.OAuth2Session] = dataclasses.field(default_factory=dict)
    _scope_names_to_token: typing.Dict[typing.Tuple[str, ...], OauthToken] = dataclasses.field(default_factory=dict)

    @property
    def auth_or_token_url(self) -> parse.ParseResult:
        return self.token_url

    def apply_auth(
        self,
        headers: _collections.HTTPHeaderDict,
        resource_path: str,
        method: str,
        body: typing.Optional[typing.Union[str, bytes]],
        client_info: OauthClientInfo,
        scope_names: typing.Tuple[str] = (),
    ) -> None:
        token = self._scope_names_to_token.get(scope_names)
        if token:
            super().apply_auth(headers, token)
            return
        client = self._scope_names_to_client.get(scope_names)
        if client is None:
            client = requests_client.OAuth2Session(
                client_info.client_id,
                client_info.client_secret,
                scope=scope_names
            )
            self.__scope_names_to_token[scope_names] = client
        token: OauthToken = client.fetch_token(
            token_endpoint=parse.urlunparse(self.token_url),
            username=self.username,
            password=self.password
        )
        self._scope_names_to_token[scope_names] = token
        print(token)
        super().apply_auth(headers, token)


@dataclasses.dataclass
class ClientCredentialsOauthFlow(OAuthFlowBase):
    token_url: parse.ParseResult
    scopes: typing.Dict[str, str]
    refresh_url: typing.Optional[str] = None
    _scope_names_to_client: typing.Dict[typing.Tuple[str, ...], requests_client.OAuth2Session] = dataclasses.field(default_factory=dict)
    _scope_names_to_token: typing.Dict[typing.Tuple[str, ...], OauthToken] = dataclasses.field(default_factory=dict)

    @property
    def auth_or_token_url(self) -> parse.ParseResult:
        return self.token_url

    def apply_auth(
        self,
        headers: _collections.HTTPHeaderDict,
        resource_path: str,
        method: str,
        body: typing.Optional[typing.Union[str, bytes]],
        scope_names: typing.Tuple[str] = (),
        client_info: OauthClientInfo = {}
    ) -> None:
        token = self._scope_names_to_token.get(scope_names)
        if token:
            super().apply_auth(headers, token)
            return
        client = self._scope_names_to_client.get(scope_names)
        if client is None:
            client = requests_client.OAuth2Session(
                client_info.client_id,
                client_info.client_secret,
                scope=scope_names
            )
            self.__scope_names_to_token[scope_names] = client
        token: OauthToken = client.fetch_token(
            token_endpoint=parse.urlunparse(self.token_url),
            grant_type='client_credentials'
        )
        self._scope_names_to_token[scope_names] = token
        print(token)
        super().apply_auth(headers, token)


@dataclasses.dataclass
class AuthorizationCodeOauthFlow(OAuthFlowBase):
    authorization_url: parse.ParseResult
    token_url: parse.ParseResult
    scopes: typing.Dict[str, str]
    refresh_url: typing.Optional[str] = None

    @property
    def auth_or_token_url(self) -> parse.ParseResult:
        return self.authorization_url

    def apply_auth(
        self,
        headers: _collections.HTTPHeaderDict,
        resource_path: str,
        method: str,
        body: typing.Optional[typing.Union[str, bytes]],
        scope_names: typing.Tuple[str] = (),
        client_info: OauthClientInfo = {}
    ) -> None:
        """
        Not implemented because this flow requires the user to visit a webpage and grant access
        then get a redirection. The code would need to automatically do that.
        """
        raise NotImplementedError("AuthorizationCodeOauthFlow not yet implemented")


@dataclasses.dataclass
class OAuthFlows:
    implicit: typing.Optional[ImplicitOAuthFlow] = None
    password: typing.Optional[PasswordOauthFlow] = None
    client_credentials: typing.Optional[ClientCredentialsOauthFlow] = None
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
        # note: scope input must be sorted tuple
        chosen_flow.apply_auth(
            headers=headers,
            resource_path=resource_path,
            method=method,
            body=body,
            scope_names=scope_names,
            client_info=client_info
        )


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
        'bearer_test': typing.List[str],
        'http_basic_test': typing.List[str],
        'oauthClientCredentials': typing.List[str],
        'oauthPassword': typing.List[str],
    },
    total=False
)
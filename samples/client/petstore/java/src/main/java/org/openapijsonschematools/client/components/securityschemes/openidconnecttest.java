package org.openapijsonschematools.client.components.securityschemes;

import org.openapijsonschematools.client.securityschemes.OpenIdConnectSecurityScheme;

@dataclasses.dataclass
class OpenIdConnectTest(security_schemes.OpenIdConnectSecurityScheme):
    /*
    openIdConnect
    */
    openid_connect_url = "https://somesite.com/.well-known/openid-configuration"
}

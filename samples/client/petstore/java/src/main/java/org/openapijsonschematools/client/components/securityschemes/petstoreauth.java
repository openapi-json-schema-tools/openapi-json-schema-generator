package org.openapijsonschematools.client.components.securityschemes;

import org.openapijsonschematools.client.securityschemes.Oauth2SecurityScheme;

public class PetstoreAuth extends OAuth2SecurityScheme {
    /*
    oauth2 implicit flow with two scopes
    */
    flows = security_schemes.OAuthFlows(
        implicit=security_schemes.ImplicitOAuthFlow(
            authorization_url="http://petstore.swagger.io/api/oauth/dialog",
            scopes={
                "write:pets": "modify pets in your account",
                "read:pets": "read your pets",
            },
        )
    )
}

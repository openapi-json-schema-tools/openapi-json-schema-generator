this_package.paths.path_with_o_auth_password_security.operation
# Operation Method Name

| Method Name | Api Class | Notes |
| ----------- | --------- | ----- |
| path_with_o_auth_password_security | [DefaultApi](../../apis/tags/default_api.md) | This api is only for tag=default |
| get | ApiForGet | This api is only for this endpoint |
| get | PathWithOAuthPasswordSecurity | This api is only for path=/pathWithOAuthPasswordSecurity |

## Table of Contents
- [General Info](#general-info)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Security](#security)
- [Servers](#servers)
- [Code Sample](#code-sample)

## General Info
| Field | Value |
| ----- | ----- |
| Summary | path with oauth password security |
| Path | "/pathWithOAuthPasswordSecurity" |
| HTTP Method | get |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
security_index | typing.Optional[int] | default is None | Allows one to select a different [security](#security) definition. If not None, must be one of [0]
server_index | typing.Optional[int] | default is None | Allows one to select a different [server](#servers). If not None, must be one of [0]
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_response.ApiResponseWithoutDeserialization will be returned

## Return Types

HTTP Status Code | Class | Description
------------- | ------------- | -------------
n/a | api_response.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ResponseFor200.ApiResponse](#responsefor200-apiresponse) | OK

## ResponseFor200

### Description
OK

### ResponseFor200 ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## Security

Set auth info by setting ApiConfiguration.security_scheme_info to a dict where the
key is the below security scheme quoted name, and the value is an instance of the linked
component security scheme class.
Select the security index by setting ApiConfiguration.security_index_info or by
passing in security_index into the endpoint method.
See how to do this in the code sample.
- these securities are specific to this to this endpoint

| Security Index | Security Scheme to Scope Names |
| -------------- | ------------------------------ |
| 0       | ["oauth_password_test"](../../components/security_schemes/security_scheme_oauth_password_test.md) [write_test_scope]<br> |

## Servers

Set the available servers by defining your used servers in ApiConfiguration.server_info
Then select your server by setting a server index in ApiConfiguration.server_index_info or by
passing server_index in to the endpoint method.
- these servers are the general api servers
- defaults to server_index=0, server.url = http://localhost:3000

server_index | Class | Description
------------ | ----- | ------------
0 | [Server0](../../servers/server_0.md) |

## Code Sample

```python
import this_package
from this_package.configurations import api_configuration
from this_package.apis.tags import default_api
from pprint import pprint
# security_index 0
from this_package.components.security_schemes import security_scheme_oauth_password_test

# security_scheme_info for security_index 0
security_scheme_info: api_configuration.SecuritySchemeInfo = {
    "oauth_password_test": security_scheme_oauth_password_test.OauthPasswordTest(
        flows = security_scheme_oauth_password_test.OAuthFlows(
            password = security_scheme_oauth_password_test.PasswordOauthFlow(
                username = 'someUsername',
                password = 'somePassword'
            )
        )
    ),
}

# oauth_server_client_info for oauth security schema
oauth_server_client_info = security_schemes.OauthServerClientInfo = {
    "localhost:3000": security_schemes.OauthClientInfo(
        client_id="client_id",
        client_secret="client",
    ),
}
used_configuration = api_configuration.ApiConfiguration(
    security_scheme_info=security_scheme_info,
    oauth_server_client_info=oauth_server_client_info,
)
# Enter a context with an instance of the API client
with this_package.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = default_api.DefaultApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # path with oauth password security
        api_response = api_instance.path_with_o_auth_password_security()
        pprint(api_response)
    except this_package.ApiException as e:
        print("Exception when calling DefaultApi->path_with_o_auth_password_security: %s\n" % e)
```

[[Back to top]](#top)
[[Back to DefaultApi API]](../../apis/tags/default_api.md)
[[Back to Endpoints]](../../../README.md#Endpoints) [[Back to README]](../../../README.md)
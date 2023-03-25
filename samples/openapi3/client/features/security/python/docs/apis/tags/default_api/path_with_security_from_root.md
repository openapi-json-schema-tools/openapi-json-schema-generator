<a name="pathwithsecurityfromroot"></a>
# **path_with_security_from_root**

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
| Summary | path with security from root |
| Path | "/pathWithSecurityFromRoot" |
| HTTP Method | get |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
server_index | typing.Optional[int] | default is None | Allows one to select a different server
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

## Return Types

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ResponseFor200.response_cls](#responsefor200-response_cls) | OK

## ResponseFor200

### Description
OK

### ResponseFor200 response_cls
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## Security

Set auth info by setting ApiConfiguration.auth_info to a dict where the
key is the below security scheme quoted name, and the value is an instance of the linked
component security scheme class. See how to do this in the code sample.
- these securities are the general api securities

| Security Index | Security Scheme to Scope Names |
| -------------- | ------------------------------ |
| 0       | ["api_key"](../../../components/security_schemes/security_scheme_api_key.md) []<br> |
| 1       | ["http_basic_test"](../../../components/security_schemes/security_scheme_http_basic_test.md) []<br> |
| 2       | no security |
| 3       | ["http_basic_test"](../../../components/security_schemes/security_scheme_http_basic_test.md) []<br>["api_key"](../../../components/security_schemes/security_scheme_api_key.md) []<br> |

## Servers

Set the available servers by defining your used servers in ApiConfiguration.server_info
Then select your server by setting a server_index in ApiConfiguration.server_index or by
passing server_index in to the endpoint function.
- these servers are the general api servers
- defaults to server_index=0, server.url = http://localhost:3000

server_index | Class | Description
------------ | ----- | ------------
0 | [Server0](../../../servers/server_0.md) |

## Code Sample

```python
import this_package
from this_package.configurations import api_configuration
from this_package.apis.tags import default_api
from pprint import pprint
# security_index 0
from this_package.components.security_schemes import security_scheme_api_key
# security_index 1
from this_package.components.security_schemes import security_scheme_http_basic_test
# security_index 3
from this_package.components.security_schemes import security_scheme_http_basic_test
from this_package.components.security_schemes import security_scheme_api_key

# auth_info for security_index 0
auth_info: api_configuration.AuthInfo = {
    "api_key": security_scheme_api_key.ApiKey(
        api_key='sampleApiKeyValue'
    ),
}


# auth_info for security_index 1
auth_info: api_configuration.AuthInfo = {
    "http_basic_test": security_scheme_http_basic_test.HttpBasicTest(
        user_id='someUserIdOrName',
        password='somePassword',
    ),
}


# auth_info for security_index 2
# no auth required for this security_index
auth_info: api_configuration.AuthInfo = {}


# auth_info for security_index 3
auth_info: api_configuration.AuthInfo = {
    "http_basic_test": security_scheme_http_basic_test.HttpBasicTest(
        user_id='someUserIdOrName',
        password='somePassword',
    ),
    "api_key": security_scheme_api_key.ApiKey(
        api_key='sampleApiKeyValue'
    ),
}

used_configuration = api_configuration.ApiConfiguration(
    auth_info=auth_info
)
# Enter a context with an instance of the API client
with this_package.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = default_api.DefaultApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # path with security from root
        api_response = api_instance.path_with_security_from_root()
        pprint(api_response)
    except this_package.ApiException as e:
        print("Exception when calling DefaultApi->path_with_security_from_root: %s\n" % e)
```

[[Back to top]](#top) [[Back to API]](../DefaultApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)

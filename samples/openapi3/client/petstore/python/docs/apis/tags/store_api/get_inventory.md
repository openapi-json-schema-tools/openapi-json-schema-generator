<a name="getinventory"></a>
# **get_inventory**

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
| Summary | Returns pet inventories by status |
| Description | Returns a map of status codes to quantities |
| Path | "/store/inventory" |
| HTTP Method | get |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
accept_content_types | typing.Tuple[str] | default is ("application/json", ) | Tells the server the content type(s) that are accepted by the client
server_index | typing.Optional[int] | default is None | Allows one to select a different server
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

## Return Types

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [SuccessInlineContentAndHeader.response_cls](../../../components/responses/response_success_inline_content_and_header.md#response_success_inline_content_and_headerresponse_cls) | successful operation

## Security

Set auth info by setting ApiConfiguration.auth_info to a dict where the
key is the below security schema quoted name, and the value is an instance of the linked
component security scheme class. See how to do this in the code sample.

| Security Index | Security Scheme to Scope Names |
| -------------- | ------------------------------ |
| 0       | ["api_key"](../../../components/security_schemes/security_scheme_api_key.md) []<br> |

## Servers

Set the available servers by defining your used servers in ApiConfiguration.server_info
Then select your server by setting a server_index in ApiConfiguration.server_index or by
passing server_index in to the endpoint function.
- these servers are the general api servers
- defaults to server_index=0, server.url = http://petstore.swagger.io:80/v2

server_index | Class | Description
------------ | ----- | ------------
0 | [Server0](../../../servers/server_0.md) | petstore server
1 | [Server1](../../../servers/server_1.md) | The local server
2 | [Server2](../../../servers/server_2.md) | staging server with no variables

## Code Sample

```python
import petstore_api
from petstore_api.configurations import api_configuration
from petstore_api.apis.tags import store_api
from pprint import pprint
# security_index 0
from petstore_api.components.security_schemes import security_scheme_api_key


# auth_info for security_index 0
auth_info: api_configuration.AuthInfo = {
    "api_key": security_scheme_api_key.ApiKey(
        api_key='sampleApiKeyValue'
    ),
}

used_configuration = api_configuration.ApiConfiguration(
    auth_info=auth_info
)
# Enter a context with an instance of the API client
with petstore_api.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = store_api.StoreApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Returns pet inventories by status
        api_response = api_instance.get_inventory()
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling StoreApi->get_inventory: %s\n" % e)
```

[[Back to top]](#top) [[Back to API]](../StoreApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)

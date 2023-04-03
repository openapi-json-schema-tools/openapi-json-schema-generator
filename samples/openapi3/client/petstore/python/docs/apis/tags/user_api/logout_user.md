<a name="logoutuser"></a>
# **logout_user**

## Table of Contents
- [General Info](#general-info)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Servers](#servers)
- [Code Sample](#code-sample)

## General Info
| Field | Value |
| ----- | ----- |
| Summary | Logs out current logged in user session |
| Path | "/user/logout" |
| HTTP Method | get |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
server_index | typing.Optional[int] | default is None | Allows one to select a different server
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

## Return Types

HTTP Status Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
default | [RefSuccessDescriptionOnly.response_cls](../../../components/responses/ref_success_description_only.md#ref_success_description_onlyresponse_cls) | Success

## Servers

Set the available servers by defining your used servers in ApiConfiguration.server_info
Then select your server by setting a server index in ApiConfiguration.server_index_info or by
passing server_index in to the endpoint method.
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
from petstore_api.apis.tags import user_api
from pprint import pprint
used_configuration = api_configuration.ApiConfiguration(
)
# Enter a context with an instance of the API client
with petstore_api.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = user_api.UserApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Logs out current logged in user session
        api_response = api_instance.logout_user()
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling UserApi->logout_user: %s\n" % e)
```

[[Back to top]](#top) [[Back to API]](../user_api.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)

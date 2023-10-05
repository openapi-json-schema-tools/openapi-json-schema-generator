some_api.paths.health_alive.operation
# Operation Method Name

| Method Name | Api Class | Notes |
| ----------- | --------- | ----- |
| health_alive_get | [DefaultApi](../../apis/tags/default_api.md) | This api is only for tag=default |
| get | ApiForGet | This api is only for this endpoint |
| get | HealthAlive | This api is only for path=/health/alive |

## Table of Contents
- [General Info](#general-info)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Servers](#servers)
- [Code Sample](#code-sample)

## General Info
| Field | Value |
| ----- | ----- |
| Description | Retrieve wether NetHSM is alive (powered up). This corresponds to the state *Locked* or *Unprovisioned*.  |
| Path | "/health/alive" |
| HTTP Method | get |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
server_index | typing.Optional[int] | default is None | Allows one to select a different [server](#servers). If not None, must be one of [0]
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_response.ApiResponseWithoutDeserialization will be returned

## Return Types

HTTP Status Code | Class | Description
------------- | ------------- | -------------
n/a | api_response.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ResponseFor200.ApiResponse](#responsefor200-apiresponse) | Yes, it is alive.
406 | [ResponseFor406.ApiResponse](#responsefor406-apiresponse) | Content type in Accept header not supported.
412 | [ResponseFor412.ApiResponse](#responsefor412-apiresponse) | Not locked or unprovisioned (in operational state).

## ResponseFor200

### Description
Yes, it is alive.

### ResponseFor200 ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## ResponseFor406

### Description
Content type in Accept header not supported.

### ResponseFor406 ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## ResponseFor412

### Description
Not locked or unprovisioned (in operational state).

### ResponseFor412 ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## Servers

Set the available servers by defining your used servers in ApiConfiguration.server_info
Then select your server by setting a server index in ApiConfiguration.server_index_info or by
passing server_index in to the endpoint method.
- these servers are the general api servers
- defaults to server_index=0, server.url = https://nethsmdemo.nitrokey.com/api/v1

server_index | Class | Description
------------ | ----- | ------------
0 | [Server0](../../servers/server_0.md) |

## Code Sample

```python
import some_api
from some_api.configurations import api_configuration
from some_api.apis.tags import default_api
from pprint import pprint
used_configuration = api_configuration.ApiConfiguration(
)
# Enter a context with an instance of the API client
with some_api.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = default_api.DefaultApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.health_alive_get()
        pprint(api_response)
    except some_api.ApiException as e:
        print("Exception when calling DefaultApi->health_alive_get: %s\n" % e)
```

[[Back to top]](#top)
[[Back to DefaultApi API]](../../apis/tags/default_api.md)
[[Back to Endpoints]](../../../README.md#Endpoints) [[Back to README]](../../../README.md)
some_api.paths.unlock.operation
# Operation Method Name

| Method Name | Api Class | Notes |
| ----------- | --------- | ----- |
| unlock_post | [DefaultApi](../../apis/tags/default_api.md) | This api is only for tag=default |
| post | ApiForPost | This api is only for this endpoint |
| post | Unlock | This api is only for path=/unlock |

## Table of Contents
- [General Info](#general-info)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Servers](#servers)
- [Code Sample](#code-sample)

## General Info
| Field | Value |
| ----- | ----- |
| Description | Brings a *Locked* NetHSM into *Operational* state. |
| Path | "/unlock" |
| HTTP Method | post |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#requestbody) | typing.Union[[unlock_request_data.UnlockRequestDataDictInput](../../components/schema/unlock_request_data.md#unlockrequestdatadictinput), [unlock_request_data.UnlockRequestDataDict](../../components/schema/unlock_request_data.md#unlockrequestdatadict)] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body. value must be one of ['application/json']
server_index | typing.Optional[int] | default is None | Allows one to select a different [server](#servers). If not None, must be one of [0]
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_response.ApiResponseWithoutDeserialization will be returned

### RequestBody

#### Content Type To Schema
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema](#requestbody-content-applicationjson-schema)

#### RequestBody content ApplicationJson Schema
some_api.paths.unlock.post.request_body.content.application_json.schema
```
type: schemas.Schema
```

##### Ref Schema Info
Ref Schema | Input Type | Output Type
---------- | ---------- | -----------
[**unlock_request_data.UnlockRequestData**](../../components/schema/unlock_request_data.md) | [unlock_request_data.UnlockRequestDataDictInput](../../components/schema/unlock_request_data.md#unlockrequestdatadictinput), [unlock_request_data.UnlockRequestDataDict](../../components/schema/unlock_request_data.md#unlockrequestdatadict) | [unlock_request_data.UnlockRequestDataDict](../../components/schema/unlock_request_data.md#unlockrequestdatadict)

## Return Types

HTTP Status Code | Class | Description
------------- | ------------- | -------------
n/a | api_response.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
204 | [ResponseFor204.ApiResponse](#responsefor204-apiresponse) | Unlock was successful, NetHSM is *Operational* now.
400 | [ResponseFor400.ApiResponse](#responsefor400-apiresponse) | Bad request (invalid passphrase).
403 | [ResponseFor403.ApiResponse](#responsefor403-apiresponse) | Unlock failed (access denied).
406 | [ResponseFor406.ApiResponse](#responsefor406-apiresponse) | Content type in Accept header not supported.
412 | [ResponseFor412.ApiResponse](#responsefor412-apiresponse) | Precondition failed (NetHSM was not *Locked*).

## ResponseFor204

### Description
Unlock was successful, NetHSM is *Operational* now.

### ResponseFor204 ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## ResponseFor400

### Description
Bad request (invalid passphrase).

### ResponseFor400 ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## ResponseFor403

### Description
Unlock failed (access denied).

### ResponseFor403 ApiResponse
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
Precondition failed (NetHSM was not *Locked*).

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

    # example passing only required values which don't have defaults set
    body = unlock_request_data.UnlockRequestData.validate({
        "passphrase": passphrase.Passphrase.validate("passphrase_example"),
    })
    try:
        api_response = api_instance.unlock_post(
            body=body,
        )
        pprint(api_response)
    except some_api.ApiException as e:
        print("Exception when calling DefaultApi->unlock_post: %s\n" % e)
```

[[Back to top]](#top)
[[Back to DefaultApi API]](../../apis/tags/default_api.md)
[[Back to Endpoints]](../../../README.md#Endpoints) [[Back to README]](../../../README.md)
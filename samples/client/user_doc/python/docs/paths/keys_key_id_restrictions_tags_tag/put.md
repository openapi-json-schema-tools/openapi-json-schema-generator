some_api.paths.keys_key_id_restrictions_tags_tag.operation
# Operation Method Name

| Method Name | Api Class | Notes |
| ----------- | --------- | ----- |
| keys_key_id_restrictions_tags_tag_put | [DefaultApi](../../apis/tags/default_api.md) | This api is only for tag=default |
| put | ApiForPut | This api is only for this endpoint |
| put | KeysKeyIDRestrictionsTagsTag | This api is only for path=/keys/{KeyID}/restrictions/tags/{Tag} |

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
| Description | Add a tag to the authorized set |
| Path | "/keys/{KeyID}/restrictions/tags/{Tag}" |
| HTTP Method | put |

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
204 | [ResponseFor204.ApiResponse](#responsefor204-apiresponse) | Successful addition of the tag.
304 | [ResponseFor304.ApiResponse](#responsefor304-apiresponse) | Tag is already present for this key.
400 | [ResponseFor400.ApiResponse](#responsefor400-apiresponse) | Bad request, tag format is invalid.
401 | [ResponseFor401.ApiResponse](#responsefor401-apiresponse) | Authentication required but none provided.
403 | [ResponseFor403.ApiResponse](#responsefor403-apiresponse) | Access denied.
404 | [ResponseFor404.ApiResponse](#responsefor404-apiresponse) | KeyID not found.
406 | [ResponseFor406.ApiResponse](#responsefor406-apiresponse) | Content type in Accept header not supported.
412 | [ResponseFor412.ApiResponse](#responsefor412-apiresponse) | Precondition failed (NetHSM was not *Operational*).

## ResponseFor204

### Description
Successful addition of the tag.

### ResponseFor204 ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## ResponseFor304

### Description
Tag is already present for this key.

### ResponseFor304 ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## ResponseFor400

### Description
Bad request, tag format is invalid.

### ResponseFor400 ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## ResponseFor401

### Description
Authentication required but none provided.

### ResponseFor401 ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## ResponseFor403

### Description
Access denied.

### ResponseFor403 ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## ResponseFor404

### Description
KeyID not found.

### ResponseFor404 ApiResponse
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
Precondition failed (NetHSM was not *Operational*).

### ResponseFor412 ApiResponse
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
| 0       | ["basic"](../../components/security_schemes/security_scheme_basic.md) []<br> |

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
# security_index 0
from some_api.components.security_schemes import security_scheme_basic

# security_scheme_info for security_index 0
security_scheme_info: api_configuration.SecuritySchemeInfo = {
    "basic": security_scheme_basic.Basic(
        user_id='someUserIdOrName',
        password='somePassword',
    ),
}

used_configuration = api_configuration.ApiConfiguration(
    security_scheme_info=security_scheme_info,
)
# Enter a context with an instance of the API client
with some_api.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = default_api.DefaultApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.keys_key_id_restrictions_tags_tag_put()
        pprint(api_response)
    except some_api.ApiException as e:
        print("Exception when calling DefaultApi->keys_key_id_restrictions_tags_tag_put: %s\n" % e)
```

[[Back to top]](#top)
[[Back to DefaultApi API]](../../apis/tags/default_api.md)
[[Back to Endpoints]](../../../README.md#Endpoints) [[Back to README]](../../../README.md)
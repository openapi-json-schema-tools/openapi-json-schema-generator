some_api.paths.keys_key_id_decrypt.operation
# Operation Method Name

| Method Name | Api Class | Notes |
| ----------- | --------- | ----- |
| keys_key_id_decrypt_post | [DefaultApi](../../apis/tags/default_api.md) | This api is only for tag=default |
| post | ApiForPost | This api is only for this endpoint |
| post | KeysKeyIDDecrypt | This api is only for path=/keys/{KeyID}/decrypt |

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
| Description | Decrypt an encrypted message with the secret key. |
| Path | "/keys/{KeyID}/decrypt" |
| HTTP Method | post |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#requestbody) | typing.Union[[decrypt_request_data.DecryptRequestDataDictInput](../../components/schema/decrypt_request_data.md#decryptrequestdatadictinput), [decrypt_request_data.DecryptRequestDataDict](../../components/schema/decrypt_request_data.md#decryptrequestdatadict)] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body. value must be one of ['application/json']
accept_content_types | typing.Tuple[str] | default is ("application/json", ) | Tells the server the content type(s) that are accepted by the client
security_index | typing.Optional[int] | default is None | Allows one to select a different [security](#security) definition. If not None, must be one of [0]
server_index | typing.Optional[int] | default is None | Allows one to select a different [server](#servers). If not None, must be one of [0]
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_response.ApiResponseWithoutDeserialization will be returned

### RequestBody

#### Description
For request body with content type &#x60;application/json&#x60;: * Mode &#x60;RAW&#x60; expects raw binary data. * Mode &#x60;PKCS1&#x60; expects PKCS1-encoded and padded binary data. * Mode &#x60;OAEP_*&#x60; expects EME-OAEP-encoded and padded binary data. 

#### Content Type To Schema
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema](#requestbody-content-applicationjson-schema)

#### RequestBody content ApplicationJson Schema
some_api.paths.keys_key_id_decrypt.post.request_body.content.application_json.schema
```
type: schemas.Schema
```

##### Ref Schema Info
Ref Schema | Input Type | Output Type
---------- | ---------- | -----------
[**decrypt_request_data.DecryptRequestData**](../../components/schema/decrypt_request_data.md) | [decrypt_request_data.DecryptRequestDataDictInput](../../components/schema/decrypt_request_data.md#decryptrequestdatadictinput), [decrypt_request_data.DecryptRequestDataDict](../../components/schema/decrypt_request_data.md#decryptrequestdatadict) | [decrypt_request_data.DecryptRequestDataDict](../../components/schema/decrypt_request_data.md#decryptrequestdatadict)

## Return Types

HTTP Status Code | Class | Description
------------- | ------------- | -------------
n/a | api_response.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ResponseFor200.ApiResponse](#responsefor200-apiresponse) | For response body with content type &#x60;application/json&#x60;: * Mode &#x60;RAW&#x60; returns the raw binary data. * Mode &#x60;PKCS1&#x60; returns the raw binary data. * Mode &#x60;OAEP_*&#x60; returns the raw binary data. 
400 | [ResponseFor400.ApiResponse](#responsefor400-apiresponse) | Bad Request, e.g. invalid encryption mode. * Mode &#x60;RAW&#x60; returns failure if input is bigger than key size. * Mode &#x60;PKCS1&#x60; returns failure if input is bigger than key size. * Mode &#x60;OAEP_*&#x60; returns failure is input is bigger than key size. 
401 | [ResponseFor401.ApiResponse](#responsefor401-apiresponse) | Authentication required but none provided.
403 | [ResponseFor403.ApiResponse](#responsefor403-apiresponse) | Access denied.
404 | [ResponseFor404.ApiResponse](#responsefor404-apiresponse) | Key for KeyID not found.
406 | [ResponseFor406.ApiResponse](#responsefor406-apiresponse) | Content type in Accept header not supported.
412 | [ResponseFor412.ApiResponse](#responsefor412-apiresponse) | Precondition failed (NetHSM was not *Operational*).

## ResponseFor200

### Description
For response body with content type &#x60;application/json&#x60;: * Mode &#x60;RAW&#x60; returns the raw binary data. * Mode &#x60;PKCS1&#x60; returns the raw binary data. * Mode &#x60;OAEP_*&#x60; returns the raw binary data. 

### ResponseFor200 ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#responsefor200-body) | [decrypt_data.DecryptDataDict](../../components/schema/decrypt_data.md#decryptdatadict) |  |
headers | Unset | headers were not defined |

### ResponseFor200 Body
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema](#responsefor200-content-applicationjson-schema)

### Body Details
#### ResponseFor200 content ApplicationJson Schema
some_api.paths.keys_key_id_decrypt.post.responses.response_200.content.application_json.schema
```
type: schemas.Schema
```

##### Ref Schema Info
Ref Schema | Input Type | Output Type
---------- | ---------- | -----------
[**decrypt_data.DecryptData**](../../components/schema/decrypt_data.md) | [decrypt_data.DecryptDataDictInput](../../components/schema/decrypt_data.md#decryptdatadictinput), [decrypt_data.DecryptDataDict](../../components/schema/decrypt_data.md#decryptdatadict) | [decrypt_data.DecryptDataDict](../../components/schema/decrypt_data.md#decryptdatadict)

## ResponseFor400

### Description
Bad Request, e.g. invalid encryption mode. * Mode &#x60;RAW&#x60; returns failure if input is bigger than key size. * Mode &#x60;PKCS1&#x60; returns failure if input is bigger than key size. * Mode &#x60;OAEP_*&#x60; returns failure is input is bigger than key size. 

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
Key for KeyID not found.

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

    # example passing only required values which don't have defaults set
    body = decrypt_request_data.DecryptRequestData.validate({
        "mode": decrypt_mode.DecryptMode.validate("RAW"),
        "encrypted": base64.Base64.validate("z"),
        "iv": base64.Base64.validate("z"),
    })
    try:
        api_response = api_instance.keys_key_id_decrypt_post(
            body=body,
        )
        pprint(api_response)
    except some_api.ApiException as e:
        print("Exception when calling DefaultApi->keys_key_id_decrypt_post: %s\n" % e)
```

[[Back to top]](#top)
[[Back to DefaultApi API]](../../apis/tags/default_api.md)
[[Back to Endpoints]](../../../README.md#Endpoints) [[Back to README]](../../../README.md)
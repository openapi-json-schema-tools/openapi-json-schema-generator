some_api.paths.keys_key_id_sign.operation
# Operation Method Name

| Method Name | Api Class | Notes |
| ----------- | --------- | ----- |
| keys_key_id_sign_post | [DefaultApi](../../apis/tags/default_api.md) | This api is only for tag=default |
| post | ApiForPost | This api is only for this endpoint |
| post | KeysKeyIDSign | This api is only for path=/keys/{KeyID}/sign |

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
| Description | Sign a message with the secret key. |
| Path | "/keys/{KeyID}/sign" |
| HTTP Method | post |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#requestbody) | typing.Union[[sign_request_data.SignRequestDataDictInput](../../components/schema/sign_request_data.md#signrequestdatadictinput), [sign_request_data.SignRequestDataDict](../../components/schema/sign_request_data.md#signrequestdatadict)] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body. value must be one of ['application/json']
accept_content_types | typing.Tuple[str] | default is ("application/json", ) | Tells the server the content type(s) that are accepted by the client
security_index | typing.Optional[int] | default is None | Allows one to select a different [security](#security) definition. If not None, must be one of [0]
server_index | typing.Optional[int] | default is None | Allows one to select a different [server](#servers). If not None, must be one of [0]
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_response.ApiResponseWithoutDeserialization will be returned

### RequestBody

#### Description
For request body with content type &#x60;application/json&#x60;: * Mode &#x60;PKCS1&#x60; expects the already hashed data. * Mode &#x60;PSS_*&#x60; expects the already hashed data. * Mode &#x60;EdDSA&#x60; expects the raw message   (ED25519 applies the SHA512 hash internally,   also to derive the nonce). * Mode &#x60;ECDSA&#x60; expects the hashed data   (using SHA224 for P224, SHA256 for P256,   SHA384 for P384 and SHA512 for P521). 

#### Content Type To Schema
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema](#requestbody-content-applicationjson-schema)

#### RequestBody content ApplicationJson Schema
some_api.paths.keys_key_id_sign.post.request_body.content.application_json.schema
```
type: schemas.Schema
```

##### Ref Schema Info
Ref Schema | Input Type | Output Type
---------- | ---------- | -----------
[**sign_request_data.SignRequestData**](../../components/schema/sign_request_data.md) | [sign_request_data.SignRequestDataDictInput](../../components/schema/sign_request_data.md#signrequestdatadictinput), [sign_request_data.SignRequestDataDict](../../components/schema/sign_request_data.md#signrequestdatadict) | [sign_request_data.SignRequestDataDict](../../components/schema/sign_request_data.md#signrequestdatadict)

## Return Types

HTTP Status Code | Class | Description
------------- | ------------- | -------------
n/a | api_response.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ResponseFor200.ApiResponse](#responsefor200-apiresponse) | For response body with content type &#x60;application/json&#x60;: * Mode &#x60;PKCS1&#x60; returns the PKCS1 padded signature   (no signatureAlgorithm OID prepended, since the used hash is not known). * Mode &#x60;PSS_*&#x60; returns the EMSA-PSS encoded signature. * Mode &#x60;EdDSA&#x60; returns the RFC 8032 (5.1.6) encoding:   r appened with s, in total 64 bytes (each 32 bytes). * Mode &#x60;ECDSA&#x60; returns the ASN.1 DER encoded signature   (a SEQUENCE of INTEGER r INTEGER s). 
400 | [ResponseFor400.ApiResponse](#responsefor400-apiresponse) | Bad Request, e.g. invalid signing mode. * Mode &#x60;PKCS1&#x60; returns failure if input is bigger than key size * Mode &#x60;PSS_*&#x60; returns failure if the input is not the hash length,   or the private key is smaller than hash length. * Mode &#x60;ECDSA&#x60; returns failure if the input exceeds the group size in bits.   The hash algorithm is not part of the encoding. 
401 | [ResponseFor401.ApiResponse](#responsefor401-apiresponse) | Authentication required but none provided.
403 | [ResponseFor403.ApiResponse](#responsefor403-apiresponse) | Access denied.
404 | [ResponseFor404.ApiResponse](#responsefor404-apiresponse) | Key for KeyID not found.
406 | [ResponseFor406.ApiResponse](#responsefor406-apiresponse) | Content type in Accept header not supported.
412 | [ResponseFor412.ApiResponse](#responsefor412-apiresponse) | Precondition failed (NetHSM was not *Operational*).

## ResponseFor200

### Description
For response body with content type &#x60;application/json&#x60;: * Mode &#x60;PKCS1&#x60; returns the PKCS1 padded signature   (no signatureAlgorithm OID prepended, since the used hash is not known). * Mode &#x60;PSS_*&#x60; returns the EMSA-PSS encoded signature. * Mode &#x60;EdDSA&#x60; returns the RFC 8032 (5.1.6) encoding:   r appened with s, in total 64 bytes (each 32 bytes). * Mode &#x60;ECDSA&#x60; returns the ASN.1 DER encoded signature   (a SEQUENCE of INTEGER r INTEGER s). 

### ResponseFor200 ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#responsefor200-body) | [sign_data.SignDataDict](../../components/schema/sign_data.md#signdatadict) |  |
headers | Unset | headers were not defined |

### ResponseFor200 Body
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema](#responsefor200-content-applicationjson-schema)

### Body Details
#### ResponseFor200 content ApplicationJson Schema
some_api.paths.keys_key_id_sign.post.responses.response_200.content.application_json.schema
```
type: schemas.Schema
```

##### Ref Schema Info
Ref Schema | Input Type | Output Type
---------- | ---------- | -----------
[**sign_data.SignData**](../../components/schema/sign_data.md) | [sign_data.SignDataDictInput](../../components/schema/sign_data.md#signdatadictinput), [sign_data.SignDataDict](../../components/schema/sign_data.md#signdatadict) | [sign_data.SignDataDict](../../components/schema/sign_data.md#signdatadict)

## ResponseFor400

### Description
Bad Request, e.g. invalid signing mode. * Mode &#x60;PKCS1&#x60; returns failure if input is bigger than key size * Mode &#x60;PSS_*&#x60; returns failure if the input is not the hash length,   or the private key is smaller than hash length. * Mode &#x60;ECDSA&#x60; returns failure if the input exceeds the group size in bits.   The hash algorithm is not part of the encoding. 

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
    body = sign_request_data.SignRequestData.validate({
        "mode": sign_mode.SignMode.validate("PKCS1"),
        "message": base64.Base64.validate("z"),
    })
    try:
        api_response = api_instance.keys_key_id_sign_post(
            body=body,
        )
        pprint(api_response)
    except some_api.ApiException as e:
        print("Exception when calling DefaultApi->keys_key_id_sign_post: %s\n" % e)
```

[[Back to top]](#top)
[[Back to DefaultApi API]](../../apis/tags/default_api.md)
[[Back to Endpoints]](../../../README.md#Endpoints) [[Back to README]](../../../README.md)
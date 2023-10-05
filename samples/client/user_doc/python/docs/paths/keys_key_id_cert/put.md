some_api.paths.keys_key_id_cert.operation
# Operation Method Name

| Method Name | Api Class | Notes |
| ----------- | --------- | ----- |
| keys_key_id_cert_put | [DefaultApi](../../apis/tags/default_api.md) | This api is only for tag=default |
| put | ApiForPut | This api is only for this endpoint |
| put | KeysKeyIDCert | This api is only for path=/keys/{KeyID}/cert |

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
| Description | Store a certificate. Maximum size 1MB. The content-type header provides the media type. Only application/json, application/x-pem-file, application/x-x509-ca-cert, application/octet-stream, text/plain and application/pgp-keys is allowed.  |
| Path | "/keys/{KeyID}/cert" |
| HTTP Method | put |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#requestbody) | typing.Union[str, str, str] | required |
content_type | str | optional, default is 'application/x-pem-file' | Selects the schema and serialization of the request body. value must be one of ['application/x-pem-file', 'application/x-x509-ca-cert', 'application/pgp-keys']
security_index | typing.Optional[int] | default is None | Allows one to select a different [security](#security) definition. If not None, must be one of [0]
server_index | typing.Optional[int] | default is None | Allows one to select a different [server](#servers). If not None, must be one of [0]
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_response.ApiResponseWithoutDeserialization will be returned

### RequestBody

#### Content Type To Schema
Content-Type | Schema
------------ | -------
"application/x-pem-file" | [content.application_x_pem_file.Schema](#requestbody-content-applicationxpemfile-schema)
"application/x-x509-ca-cert" | [content.application_xx509_ca_cert.Schema](#requestbody-content-applicationxx509cacert-schema)
"application/pgp-keys" | [content.application_pgp_keys.Schema](#requestbody-content-applicationpgpkeys-schema)

#### RequestBody content ApplicationXPemFile Schema
some_api.paths.keys_key_id_cert.put.request_body.content.application_x_pem_file.schema
```
type: schemas.Schema
```

##### Ref Schema Info
Ref Schema | Input Type | Output Type
---------- | ---------- | -----------
[**pem_cert.PemCert**](../../components/schema/pem_cert.md) | str | str
#### RequestBody content ApplicationXX509CaCert Schema
some_api.paths.keys_key_id_cert.put.request_body.content.application_xx509_ca_cert.schema
```
type: schemas.Schema
```

##### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
str | str |
#### RequestBody content ApplicationPgpKeys Schema
some_api.paths.keys_key_id_cert.put.request_body.content.application_pgp_keys.schema
```
type: schemas.Schema
```

##### Ref Schema Info
Ref Schema | Input Type | Output Type
---------- | ---------- | -----------
[**pgp_private_key.PGPPrivateKey**](../../components/schema/pgp_private_key.md) | str | str

## Return Types

HTTP Status Code | Class | Description
------------- | ------------- | -------------
n/a | api_response.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
201 | [ResponseFor201.ApiResponse](#responsefor201-apiresponse) | Successful import of a certificate.
401 | [ResponseFor401.ApiResponse](#responsefor401-apiresponse) | Authentication required but none provided.
403 | [ResponseFor403.ApiResponse](#responsefor403-apiresponse) | Access denied.
406 | [ResponseFor406.ApiResponse](#responsefor406-apiresponse) | Content type in Accept header not supported.
409 | [ResponseFor409.ApiResponse](#responsefor409-apiresponse) | Conflict, certificate already exists for this KeyID.
412 | [ResponseFor412.ApiResponse](#responsefor412-apiresponse) | Precondition failed (NetHSM was not *Operational*).

## ResponseFor201

### Description
Successful import of a certificate.

### ResponseFor201 ApiResponse
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

## ResponseFor406

### Description
Content type in Accept header not supported.

### ResponseFor406 ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## ResponseFor409

### Description
Conflict, certificate already exists for this KeyID.

### ResponseFor409 ApiResponse
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
    body = pem_cert.PemCert.validate("-----BEGIN CERTIFICATE-----\nMIIEvDCCAqQCCQCZ9VKHZSKydDANBgkqhkiG9w0BAQsFADAgMQ4wDAYDVQQIDAVo\nZWxsbzEOMAwGA1UEBwwFaGVsbG8wHhcNMTgxMDMwMTI0MDQ3WhcNMTkxMDMwMTI0\nMDQ3WjAgMQ4wDAYDVQQIDAVoZWxsbzEOMAwGA1UEBwwFaGVsbG8wggIiMA0GCSqG\nSIb3DQEBAQUAA4ICDwAwggIKAoICAQC8WRImgeu4U6Yg5q0/SvoieQL5JwPHaCrN\n6Cc0mj8pnzTBu/f0QYNentcnu0EclD99kla6/gdiJnt0b/IT23o37+t2n0BvEgVQ\nMJxJ/BjIqSZCykq4SWHKia1OS7tJKE2Q/hgGq/RQJ0zecWKA9SuafXDt0plw0saz\nP8ZosFyToMYnPB54SzXj4qeD5t2L2dOamTTyziw/GJDGdwssImEDfeWyMRRyHcIa\nu9HNGaTxjCdBGzCR+PEX3ZHhGzl5iMlgtZUICgXMgAvFZHHEYNtyCW9ZzUB2ZKE2\nnMbu8hbl7GXRCdJaAqlJfKiGp/WvbmrLhCzcwqhu4UnqGXOxeEQryrkPAbiLafqb\nfPLHB7dr8OEGlUzp1SCHR1JxwdBVohuO2lL+O5nMD3ZVdVnh2F5Et6I9lO4w9+5n\naI6pmO4oy9PsqKvUjxVnEeo1Ee1n9o/4T6fe6XBIQLPqEmy2IXynZP0eJn1Yu9SF\nTkTSmJ+jRiU7EMaagQrM4Ds5seVNVWKOvUjDQCV+QRZaaPcrkMoFtjLCVMhLgy7M\n/Dfl63qCcdVkPwdbI/apjfG8qMrez4k3qAZDYgS3fujyuq9wv7xbq2+o0Ck4Ono2\nmMAA6JDSZr8XwR3ac/UK1KGv+weh1fOVO+c6mSN9M+W1MtkJS+i4/Aj2yDCJzVk3\nGZpd5/E6WwIDAQABMA0GCSqGSIb3DQEBCwUAA4ICAQAB+8+1dk20P6R+RvDRs1mo\ne1CegaPH2bl9t1WVuXJIUkrIGDceVr5f19pcaNQRYwZuoQd8VQXCZUpWbo//TWxl\nItS3prQgcrfcTi7gCzp1+q1bZk6H21tzESDJTXPFp019/ypdUB4Jsty7qQL73sE3\nnj67DH+srPCknAhfFag0dPOOjAY19IrIomtBMlvYNpb5XupEUAQFCjk6VdLVAzzl\nM5Swj+kmLA0OUHTF2zAwj2k+B9RAkbetu/lXLwUiiQNG00j8YP03lErxDd29m2jl\nNFlSn8YYsgzmihF5fUFTJXP5tS7lF4FnLNbw9pfdeVZBT1uTOcckmFv6n6edttZS\nFhC70hBB8tFFtemGFquZ0N7w8O7DmIYI936n283rzxyuWdi+JqOUQ0KzpGbFOP3t\nAOdVcx/JW8kjDdWRcRDr85M4MnkG6HEzW4uzGBtxBplL7KH0L8LX+lx6ySjIrbRD\nQtwBxwZGtHZJAqskO6vobzzybCKuVUaQwkPrQsK5iLA6Nn1Yxu6XmtlvoPeNIc63\nPa3ix8vNFbBTtS6iBdbOPse5qgRV0DC94ocedzKw4QzQRa5REIniJ2X8hVoVAcBh\n3nQKyZApl2I/pZMlbZ0Cg5yxjhBaxKwci7jyoMerMMo2EdbZN87gP+2x6tKuY1MO\n35mqzHn+FjWq0eAtpzhO5Q==\n-----END CERTIFICATE-----\n")
    try:
        api_response = api_instance.keys_key_id_cert_put(
            body=body,
        )
        pprint(api_response)
    except some_api.ApiException as e:
        print("Exception when calling DefaultApi->keys_key_id_cert_put: %s\n" % e)
```

[[Back to top]](#top)
[[Back to DefaultApi API]](../../apis/tags/default_api.md)
[[Back to Endpoints]](../../../README.md#Endpoints) [[Back to README]](../../../README.md)
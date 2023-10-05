some_api.paths.keys_key_id.operation
# Operation Method Name

| Method Name | Api Class | Notes |
| ----------- | --------- | ----- |
| keys_key_id_put | [DefaultApi](../../apis/tags/default_api.md) | This api is only for tag=default |
| put | ApiForPut | This api is only for this endpoint |
| put | KeysKeyID | This api is only for path=/keys/{KeyID} |

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
| Description | Import a private key into NetHSM and store it under the *KeyID* path. The public key will be automatically derived. The parameters of the key can be passed as a PEM file or a JSON object.  |
| Path | "/keys/{KeyID}" |
| HTTP Method | put |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#requestbody) | typing.Union[[private_key.PrivateKeyDictInput](../../components/schema/private_key.md#privatekeydictinput), [private_key.PrivateKeyDict](../../components/schema/private_key.md#privatekeydict), str] | required |
[query_params](#query_params) | [QueryParametersDictInput](#queryparameters-queryparametersdictinput), [QueryParametersDict](#queryparameters-queryparametersdict) | |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body. value must be one of ['application/json', 'application/x-pem-file']
security_index | typing.Optional[int] | default is None | Allows one to select a different [security](#security) definition. If not None, must be one of [0]
server_index | typing.Optional[int] | default is None | Allows one to select a different [server](#servers). If not None, must be one of [0]
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_response.ApiResponseWithoutDeserialization will be returned

### RequestBody

#### Description
For request body with content type &#x60;application/json&#x60;: * *RSA* includes &#x60;primeP&#x60;, &#x60;primeQ&#x60;, and &#x60;publicExponent&#x60; properties.   The remaining properties &#x60;privateExponent&#x60;, &#x60;modulus&#x60;, ..) are computed. * *EC_P224*, *EC_P256*, *EC_P384*, *EC_P521* uses the &#x60;data&#x60; property.   Keys are the raw (big endian) scalar. * *Curve25519* uses the &#x60;data&#x60; property.   Keys are the raw (little endian) key. 

#### Content Type To Schema
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema](#requestbody-content-applicationjson-schema)
"application/x-pem-file" | [content.application_x_pem_file.Schema](#requestbody-content-applicationxpemfile-schema)

#### RequestBody content ApplicationJson Schema
some_api.paths.keys_key_id.put.request_body.content.application_json.schema
```
type: schemas.Schema
```

##### Ref Schema Info
Ref Schema | Input Type | Output Type
---------- | ---------- | -----------
[**private_key.PrivateKey**](../../components/schema/private_key.md) | [private_key.PrivateKeyDictInput](../../components/schema/private_key.md#privatekeydictinput), [private_key.PrivateKeyDict](../../components/schema/private_key.md#privatekeydict) | [private_key.PrivateKeyDict](../../components/schema/private_key.md#privatekeydict)
#### RequestBody content ApplicationXPemFile Schema
some_api.paths.keys_key_id.put.request_body.content.application_x_pem_file.schema
```
type: schemas.Schema
```

##### Ref Schema Info
Ref Schema | Input Type | Output Type
---------- | ---------- | -----------
[**pem_private_key.PemPrivateKey**](../../components/schema/pem_private_key.md) | str | str
### query_params
### QueryParameters
```
type: schemas.Schema
```

#### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[QueryParametersDictInput](#queryparameters-queryparametersdictinput), [QueryParametersDict](#queryparameters-queryparametersdict) | [QueryParametersDict](#queryparameters-queryparametersdict) |

#### QueryParameters QueryParametersDictInput
```
type: typing.TypedDict
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**mechanisms** | [schema.SchemaTupleInput](../../paths/keys_key_id/put/parameters/parameter_0/schema.md#schematupleinput), [schema.SchemaTuple](../../paths/keys_key_id/put/parameters/parameter_0/schema.md#schematuple) |  | [optional]
**tags** | [schema.SchemaTupleInput](../../paths/keys_key_id/put/parameters/parameter_1/schema.md#schematupleinput), [schema_2.SchemaTuple](../../paths/keys_key_id/put/parameters/parameter_1/schema.md#schematuple) |  | [optional]

#### QueryParameters QueryParametersDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]
```
##### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**mechanisms** | [schema.SchemaTupleInput](../../paths/keys_key_id/put/parameters/parameter_0/schema.md#schematupleinput), [schema.SchemaTuple](../../paths/keys_key_id/put/parameters/parameter_0/schema.md#schematuple), schemas.Unset |  | [optional]
**tags** | [schema.SchemaTupleInput](../../paths/keys_key_id/put/parameters/parameter_1/schema.md#schematupleinput), [schema_2.SchemaTuple](../../paths/keys_key_id/put/parameters/parameter_1/schema.md#schematuple), schemas.Unset |  | [optional]

##### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**mechanisms** | [schema.SchemaTuple](../../paths/keys_key_id/put/parameters/parameter_0/schema.md#schematuple), schemas.Unset |  | [optional]
**tags** | [schema.SchemaTuple](../../paths/keys_key_id/put/parameters/parameter_1/schema.md#schematuple), schemas.Unset |  | [optional]

##### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [QueryParametersDictInput](#queryparameters-queryparametersdictinput), [QueryParametersDict](#queryparameters-queryparametersdict) | [QueryParametersDict](#queryparameters-queryparametersdict) | a constructor

## Return Types

HTTP Status Code | Class | Description
------------- | ------------- | -------------
n/a | api_response.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
204 | [ResponseFor204.ApiResponse](#responsefor204-apiresponse) | Successful import of a private key.
400 | [ResponseFor400.ApiResponse](#responsefor400-apiresponse) | Bad request (specified properties are invalid).
401 | [ResponseFor401.ApiResponse](#responsefor401-apiresponse) | Authentication required but none provided.
403 | [ResponseFor403.ApiResponse](#responsefor403-apiresponse) | Access denied.
406 | [ResponseFor406.ApiResponse](#responsefor406-apiresponse) | Content type in Accept header not supported.
409 | [ResponseFor409.ApiResponse](#responsefor409-apiresponse) | Conflict, key already exists for this keyID.
412 | [ResponseFor412.ApiResponse](#responsefor412-apiresponse) | Precondition failed (NetHSM was not *Operational*).

## ResponseFor204

### Description
Successful import of a private key.

### ResponseFor204 ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## ResponseFor400

### Description
Bad request (specified properties are invalid).

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
Conflict, key already exists for this keyID.

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
from some_api.paths.keys_key_id.put import operation
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
    query_params: operation.QueryParametersDictInput = {
    }
    body = private_key.PrivateKey.validate({
        "mechanisms": key_mechanisms.KeyMechanisms.validate([
            key_mechanism.KeyMechanism.validate("RSA_Decryption_RAW")
        ]),
        "type": key_type.KeyType.validate("RSA"),
        "key": key_private_data.KeyPrivateData.validate({
            "prime_p": base64.Base64.validate("z"),
            "prime_q": base64.Base64.validate("z"),
            "public_exponent": base64.Base64.validate("z"),
            "data": base64.Base64.validate("z"),
        }),
        "restrictions": key_restrictions.KeyRestrictions.validate({
            "tags": tag_list.TagList.validate(["berlin","frankfurt"]),
        }),
    })
    try:
        api_response = api_instance.keys_key_id_put(
            query_params=query_params,
            body=body,
        )
        pprint(api_response)
    except some_api.ApiException as e:
        print("Exception when calling DefaultApi->keys_key_id_put: %s\n" % e)

    # example passing only optional values
    query_params: operation.QueryParametersDictInput = {
        'mechanisms': [
        key_mechanism.KeyMechanism.validate("RSA_Decryption_RAW")
    ],
        'tags': [
        id.ID.validate("tags_example")
    ],
    }
    body = private_key.PrivateKey.validate({
        "mechanisms": key_mechanisms.KeyMechanisms.validate([
            key_mechanism.KeyMechanism.validate("RSA_Decryption_RAW")
        ]),
        "type": key_type.KeyType.validate("RSA"),
        "key": key_private_data.KeyPrivateData.validate({
            "prime_p": base64.Base64.validate("z"),
            "prime_q": base64.Base64.validate("z"),
            "public_exponent": base64.Base64.validate("z"),
            "data": base64.Base64.validate("z"),
        }),
        "restrictions": key_restrictions.KeyRestrictions.validate({
            "tags": tag_list.TagList.validate(["berlin","frankfurt"]),
        }),
    })
    try:
        api_response = api_instance.keys_key_id_put(
            query_params=query_params,
            body=body,
        )
        pprint(api_response)
    except some_api.ApiException as e:
        print("Exception when calling DefaultApi->keys_key_id_put: %s\n" % e)
```

[[Back to top]](#top)
[[Back to DefaultApi API]](../../apis/tags/default_api.md)
[[Back to Endpoints]](../../../README.md#Endpoints) [[Back to README]](../../../README.md)
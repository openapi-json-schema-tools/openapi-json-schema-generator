<a name="updatepet"></a>
# **update_pet**

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
| Summary | Update an existing pet |
| Path | "/pet" |
| HTTP Method | put |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[**body**](../../../components/request_bodies/request_body_pet.md) | typing.Union[[Pet.content.application_json.schema](../../../components/request_bodies/request_body_pet.md#request_body_petcontentapplication_jsonschema), [Pet.content.application_xml.schema](../../../components/request_bodies/request_body_pet.md#request_body_petcontentapplication_xmlschema)] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
server_index | typing.Optional[int] | default is None | Allows one to select a different server
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

## Return Types

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
400 | [ResponseFor400.response_cls](#response_400response_cls) | Invalid ID supplied
404 | [ResponseFor404.response_cls](#response_404response_cls) | Pet not found
405 | [ResponseFor405.response_cls](#response_405response_cls) | Validation exception

## responses ResponseFor400

### Description
Invalid ID supplied

### response_cls
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## responses ResponseFor404

### Description
Pet not found

### response_cls
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## responses ResponseFor405

### Description
Validation exception

### response_cls
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## Security

Set auth info by setting Configuration.auth_info to a dict where the
key is the below security schema quoted name, and the value is an instance of the linked
component security scheme class. See how to do this in the code sample.

| Security Index | Security Scheme to Scope Names |
| -------------- | ------------------------------ |
| 0       | ["http_signature_test"](../../../components/security_schemes/security_scheme_http_signature_test.md) []<br> |
| 1       | ["petstore_auth"](../../../components/security_schemes/security_scheme_petstore_auth.md) [write:pets, read:pets]<br> |

## Servers
server_index | Class | Description
------------ | ----- | ------------
0 | [Server0](../../../servers/server_0.md) | petstore server
1 | [Server1](../../../servers/server_1.md) | The local server
2 | [Server2](../../../servers/server_2.md) | staging server with no variables

## Code Sample

```python
import petstore_api
from petstore_api.configurations import api_configuration
from petstore_api.apis.tags import pet_api
from pprint import pprint
# security_index 0
from petstore_api.components.security_schemes import security_scheme_http_signature_test
# security_index 1
from petstore_api.components.security_schemes import security_scheme_petstore_auth


# auth_info for security_index 0
auth_info: configuration.AuthInfo = {
    "http_signature_test": security_scheme_http_signature_test.HttpSignatureTest(
        signing_info=petstore_api.signing.HttpSigningConfiguration(
            key_id =                 'my-key-id',
            private_key_path =       'rsa.pem',
            signing_scheme =         petstore_api.signing.SCHEME_HS2019,
            signing_algorithm =      petstore_api.signing.ALGORITHM_RSASSA_PSS,
            signed_headers =         [petstore_api.signing.HEADER_REQUEST_TARGET,
                                        petstore_api.signing.HEADER_CREATED,
                                        petstore_api.signing.HEADER_EXPIRES,
                                        petstore_api.signing.HEADER_HOST,
                                        petstore_api.signing.HEADER_DATE,
                                        petstore_api.signing.HEADER_DIGEST,
                                        'Content-Type',
                                        'User-Agent'
                                        ],
            signature_max_validity = datetime.timedelta(minutes=5)
        )

    ),
}

# auth_info for security_index 1
auth_info: configuration.AuthInfo = {
    "petstore_auth": security_scheme_petstore_auth.PetstoreAuth(
    ),
}

# See api_configuration.py for a list of all supported api configuration parameters
used_configuration = api_configuration.ApiConfiguration(
    auth_info = auth_info
)
# Enter a context with an instance of the API client
with petstore_api.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = pet_api.PetApi(api_client)

    # example passing only required values which don't have defaults set
    body = pet.Pet(
        id=1,
        category=category.Category(
            id=1,
            name="default-name",
        ),
        name="doggie",
        photo_urls=[
            "photo_urls_example"
        ],
        tags=[
            tag.Tag(
                id=1,
                name="name_example",
            )
        ],
        status="available",
    )
    try:
        # Update an existing pet
        api_response = api_instance.update_pet(
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling PetApi->update_pet: %s\n" % e)
```

[[Back to top]](#top) [[Back to API]](../PetApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)

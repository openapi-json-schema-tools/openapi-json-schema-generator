<a name="findpetsbystatus"></a>
# **find_pets_by_status**

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
| Summary | Finds Pets by status |
| Description | Multiple status values can be provided with comma separated strings |
| Path | "/pet/findByStatus" |
| HTTP Method | get |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[query_params](#query_params) | [RequestQueryParameters.Params](#requestqueryparametersparams) | |
accept_content_types | typing.Tuple[str] | default is ("application/xml", "application/json", ) | Tells the server the content type(s) that are accepted by the client
server_index | typing.Optional[int] | default is None | Allows one to select a different server
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### query_params
#### RequestQueryParameters.Params

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
status | [Parameter0.schema](#parameter0-schema) | | 


#### Parameter0

##### Description
Status values that need to be considered for filter

##### Parameter0 Schema

###### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  |

###### List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | must be one of ["available", "pending", "sold", ] if omitted the server will use the default value of available

## Return Types

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [SuccessfulXmlAndJsonArrayOfPet.response_cls](../../../components/responses/response_successful_xml_and_json_array_of_pet.md#response_successful_xml_and_json_array_of_petresponse_cls) | successful operation, multiple content types
400 | [ResponseFor400.response_cls](#response_400response_cls) | Invalid status value

## responses ResponseFor400

### Description
Invalid status value

### response_cls
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## Security

Set auth info by setting ApiConfiguration.auth_info to a dict where the
key is the below security schema quoted name, and the value is an instance of the linked
component security scheme class. See how to do this in the code sample.

| Security Index | Security Scheme to Scope Names |
| -------------- | ------------------------------ |
| 0       | ["api_key"](../../../components/security_schemes/security_scheme_api_key.md) []<br> |
| 1       | ["http_signature_test"](../../../components/security_schemes/security_scheme_http_signature_test.md) []<br> |
| 2       | ["petstore_auth"](../../../components/security_schemes/security_scheme_petstore_auth.md) [write:pets, read:pets]<br> |

## Servers

Set the available servers by defining your used servers in ApiConfiguration.server_info
Then select your server by setting a server_index in ApiConfiguration.server_index or by
passing server_index in to the endpoint function.
- these servers are specific to this "/pet/findByStatus" path
- defaults to server_index=0, server.url = https://path-server-test.petstore.local/v2

server_index | Class | Description
------------ | ----- | ------------
0 | [Server0](#server0) |
1 | [Server1](#server1) |

### Server0

#### Url
https://path-server-test.petstore.local/v2
### Server1

#### Url
https://petstore.swagger.io/{version}

#### Variables
Key | Type | Description | Notes
--- | ---- | ----------- | ------
**version** | str,  |  |  must be one of ["v1", "v2", ] if omitted the client will use the default value of v1

## Code Sample

```python
import petstore_api
from petstore_api.configurations import api_configuration
from petstore_api.apis.tags import pet_api
from pprint import pprint
# security_index 0
from petstore_api.components.security_schemes import security_scheme_api_key
# security_index 1
from petstore_api.components.security_schemes import security_scheme_http_signature_test
# security_index 2
from petstore_api.components.security_schemes import security_scheme_petstore_auth


# auth_info for security_index 0
auth_info: api_configuration.AuthInfo = {
    "api_key": security_scheme_api_key.ApiKey(
        api_key='sampleApiKeyValue'
    ),
}

# auth_info for security_index 1
auth_info: api_configuration.AuthInfo = {
    "http_signature_test": security_scheme_http_signature_test.HttpSignatureTest(
        signing_info=petstore_api.signing.HttpSigningConfiguration(
            key_id='my-key-id',
            private_key_path='rsa.pem',
            signing_scheme=petstore_api.signing.SCHEME_HS2019,
            signing_algorithm=petstore_api.signing.ALGORITHM_RSASSA_PSS,
            signed_headers=[
                petstore_api.signing.HEADER_REQUEST_TARGET,
                petstore_api.signing.HEADER_CREATED,
                petstore_api.signing.HEADER_EXPIRES,
                petstore_api.signing.HEADER_HOST,
                petstore_api.signing.HEADER_DATE,
                petstore_api.signing.HEADER_DIGEST,
                'Content-Type',
                'User-Agent'
            ],
            signature_max_validity=datetime.timedelta(minutes=5)
        )

    ),
}

# auth_info for security_index 2
auth_info: api_configuration.AuthInfo = {
    "petstore_auth": security_scheme_petstore_auth.PetstoreAuth(
    ),
}

used_configuration = api_configuration.ApiConfiguration(
    auth_info=auth_info
)
# Enter a context with an instance of the API client
with petstore_api.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = pet_api.PetApi(api_client)

    # example passing only required values which don't have defaults set
    query_params = {
        'status': [
        "available"
    ],
    }
    try:
        # Finds Pets by status
        api_response = api_instance.find_pets_by_status(
            query_params=query_params,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling PetApi->find_pets_by_status: %s\n" % e)
```

[[Back to top]](#top) [[Back to API]](../PetApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)

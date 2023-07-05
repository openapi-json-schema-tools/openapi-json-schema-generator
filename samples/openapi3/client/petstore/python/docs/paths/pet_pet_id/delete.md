petstore_api.paths.pet_pet_id.operation
# Operation Method Name

| Method Name | Api Class | Notes |
| ----------- | --------- | ----- |
| delete_pet | [PetApi](../../apis/tags/pet_api.md) | This api is only for tag=pet |
| delete | ApiForDelete | This api is only for this endpoint |
| delete | PetPetId | This api is only for path=/pet/{petId} |

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
| Summary | Deletes a pet |
| Path | "/pet/{petId}" |
| HTTP Method | delete |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[header_params](#header_params) | [RequestHeaderParameters.Params](#requestheaderparametersparams), dict | |
[path_params](#path_params) | [RequestPathParameters.Params](#requestpathparametersparams), dict | |
security_index | typing.Optional[int] | default is None | Allows one to select a different [security](#security) definition. If not None, must be one of [0, 1]
server_index | typing.Optional[int] | default is None | Allows one to select a different [server](#servers). If not None, must be one of [0, 1, 2]
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_response.ApiResponseWithoutDeserialization will be returned

### header_params
#### RequestHeaderParameters.Params
This is a TypedDict

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
api_key | [Parameter0.schema](#parameter0-schema), str | | optional


#### Parameter0

##### Parameter0 Schema

###### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str | str |  |

### path_params
#### RequestPathParameters.Params
This is a TypedDict

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
petId | [Parameter1.schema](#parameter1-schema), int | | 


#### Parameter1

##### Description
Pet id to delete

##### Parameter1 Schema

###### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
int | int |  | value must be a 64 bit integer

## Return Types

HTTP Status Code | Class | Description
------------- | ------------- | -------------
n/a | api_response.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
400 | [ResponseFor400.response_cls](#responsefor400-response_cls) | Invalid pet value

## ResponseFor400

### Description
Invalid pet value

### ResponseFor400 response_cls
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
| 0       | ["api_key"](../../components/security_schemes/security_scheme_api_key.md) []<br> |
| 1       | ["petstore_auth"](../../components/security_schemes/security_scheme_petstore_auth.md) [write:pets, read:pets]<br> |

## Servers

Set the available servers by defining your used servers in ApiConfiguration.server_info
Then select your server by setting a server index in ApiConfiguration.server_index_info or by
passing server_index in to the endpoint method.
- these servers are the general api servers
- defaults to server_index=0, server.url = http://petstore.swagger.io:80/v2

server_index | Class | Description
------------ | ----- | ------------
0 | [Server0](../../servers/server_0.md) | petstore server
1 | [Server1](../../servers/server_1.md) | The local server
2 | [Server2](../../servers/server_2.md) | staging server with no variables

## Code Sample

```python
import petstore_api
from petstore_api.configurations import api_configuration
from petstore_api.apis.tags import pet_api
from petstore_api.paths.pet_pet_id.delete import operation
from pprint import pprint
# security_index 0
from petstore_api.components.security_schemes import security_scheme_api_key
# security_index 1
from petstore_api.components.security_schemes import security_scheme_petstore_auth

# security_scheme_info for security_index 0
security_scheme_info: api_configuration.SecuritySchemeInfo = {
    "api_key": security_scheme_api_key.ApiKey(
        api_key='sampleApiKeyValue'
    ),
}


# security_scheme_info for security_index 1
security_scheme_info: api_configuration.SecuritySchemeInfo = {
    "petstore_auth": security_scheme_petstore_auth.PetstoreAuth(
    ),
}

security_index_info: api_configuration.SecurityIndexInfo = {
    "security": 0,  # default value
    "paths//pet/{petId}/delete/security": 0,
    # only set one "paths//pet/{petId}/delete/security": 1,
}
used_configuration = api_configuration.ApiConfiguration(
    security_scheme_info=security_scheme_info,
    security_index_info=security_index_info
)
# Enter a context with an instance of the API client
with petstore_api.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = pet_api.PetApi(api_client)

    # example passing only required values which don't have defaults set
    path_params: operation.PathParametersDictInput = {
        'petId': 1,
    }
    header_params: operation.HeaderParametersDictInput = {
    }
    try:
        # Deletes a pet
        api_response = api_instance.delete_pet(
            path_params=path_params,
            header_params=header_params,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling PetApi->delete_pet: %s\n" % e)

    # example passing only optional values
    path_params = {
        'petId': 1,
    }
    header_params: operation.HeaderParametersDictInput = {
        'api_key': "api_key_example",
    }
    try:
        # Deletes a pet
        api_response = api_instance.delete_pet(
            path_params=path_params,
            header_params=header_params,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling PetApi->delete_pet: %s\n" % e)
```

[[Back to top]](#top)
[[Back to PetApi API]](../../apis/tags/pet_api.md)
[[Back to Endpoints]](../../../README.md#Endpoints) [[Back to README]](../../../README.md)
<a name="deletepet"></a>
# **delete_pet**

## Table of Contents
- [Summary](#summary)
- [Path](#path)
- [HTTP Method](#http-method)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Code Sample](#code-sample)

## Summary
Deletes a pet

## Path
"/pet/{petId}"

## HTTP Method
delete

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[header_params](#header_params) | [RequestHeaderParameters.Params](#requestheaderparametersparams) | |
[path_params](#path_params) | [RequestPathParameters.Params](#requestpathparametersparams) | |
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### header_params
#### RequestHeaderParameters.Params

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
api_key | [Parameter0.schema](#parameter_0schema) | | optional


#### Parameter Parameter0

##### Schema

###### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

### path_params
#### RequestPathParameters.Params

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
petId | [Parameter1.schema](#parameter_1schema) | | 


#### Parameter Parameter1

##### Description
Pet id to delete

##### Schema

###### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 64 bit integer

## Return Types

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
400 | [ResponseFor400.response_cls](#response_400response_cls) | Invalid pet value

## responses ResponseFor400

### Description
Invalid pet value

### response_cls
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## Code Sample

```python
import petstore_api
from petstore_api.apis.tags import pet_api
from pprint import pprint
# Defining the host is optional and defaults to http://petstore.swagger.io:80/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = petstore_api.Configuration(
    host = "http://petstore.swagger.io:80/v2"
)

# Enter a context with an instance of the API client
with petstore_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pet_api.PetApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'petId': 1,
    }
    header_params = {
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
    header_params = {
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

[[Back to top]](#top) [[Back to API]](../PetApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)

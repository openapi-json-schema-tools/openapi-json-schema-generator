<a name="top"></a>
# **delete_pet**
<a name="delete_pet"></a>

Deletes a pet

### Example

* OAuth Authentication (petstore_auth):
```python
import petstore_api
from petstore_api.apis.tags import pet_api
from pprint import pprint
# Defining the host is optional and defaults to http://petstore.swagger.io:80/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = petstore_api.Configuration(
    host = "http://petstore.swagger.io:80/v2"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure OAuth2 access token for authorization: petstore_auth
configuration = petstore_api.Configuration(
    host = "http://petstore.swagger.io:80/v2",
    access_token = 'YOUR_ACCESS_TOKEN'
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
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[header_params](#RequestHeaderParameters) | [RequestHeaderParameters.Params](#RequestHeaderParameters.Params) | |
[path_params](#RequestPathParameters) | [RequestPathParameters.Params](#RequestPathParameters.Params) | |
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="RequestHeaderParameters" >header_params</a>
#### <a id="RequestHeaderParameters.Params" >RequestHeaderParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
api_key | [parameter_0.schema](#parameter_0.schema) | | optional

# parameter_0.schema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

### <a id="RequestPathParameters" >path_params</a>
#### <a id="RequestPathParameters.Params" >RequestPathParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
petId | [parameter_1.schema](#parameter_1.schema) | | 

# parameter_1.schema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 64 bit integer

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
400 | [response_for_400.ApiResponse](#response_for_400ApiResponse) | Invalid pet value

#### <a id="response_for_400ApiResponse" >response_for_400.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

[petstore_auth](../../../../README.md#petstore_auth)

[[Back to top]](#top) [[Back to API]](../PetApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)

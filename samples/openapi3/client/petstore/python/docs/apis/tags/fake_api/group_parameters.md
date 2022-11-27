# **group_parameters**
<a name="group_parameters"></a>

Fake endpoint to test group parameters (optional)

Fake endpoint to test group parameters (optional)

### Example

* Bearer (JWT) Authentication (bearer_test):
```python
import petstore_api
from petstore_api.apis.tags import fake_api
from pprint import pprint
# Defining the host is optional and defaults to 
# See configuration.py for a list of all supported configuration parameters.
configuration = petstore_api.Configuration(
    host = ""
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): bearer_test
configuration = petstore_api.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with petstore_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fake_api.SomeApi(api_client)

    # example passing only required values which don't have defaults set
    query_params = {
        'required_string_group': "required_string_group_example",
        'required_int64_group': 1,
    }
    header_params = {
        'required_boolean_group': "true",
    }
    try:
        # Fake endpoint to test group parameters (optional)
        api_response = api_instance.group_parameters(
            query_params=query_params,
            header_params=header_params,
        )
    except petstore_api.ApiException as e:
        print("Exception when calling SomeApi->group_parameters: %s\n" % e)

    # example passing only optional values
    query_params = {
        'required_string_group': "required_string_group_example",
        'required_int64_group': 1,
        'string_group': "string_group_example",
        'int64_group': 1,
    }
    header_params = {
        'required_boolean_group': "true",
        'boolean_group': "true",
    }
    try:
        # Fake endpoint to test group parameters (optional)
        api_response = api_instance.group_parameters(
            query_params=query_params,
            header_params=header_params,
        )
    except petstore_api.ApiException as e:
        print("Exception when calling SomeApi->group_parameters: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[query_params](#group_parameters.RequestQueryParameters) | [RequestQueryParameters.Params](#group_parameters.RequestQueryParameters.Params) | |
[header_params](#group_parameters.RequestHeaderParameters) | [RequestHeaderParameters.Params](#group_parameters.RequestHeaderParameters.Params) | |
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="group_parameters.RequestQueryParameters" >query_params</a>
#### <a id="group_parameters.RequestQueryParameters.Params" >RequestQueryParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
required_string_group | [parameter_0.schema](#group_parameters.parameter_0.schema) | | 
required_int64_group | [parameter_2.schema](#group_parameters.parameter_2.schema) | | 
string_group | [parameter_3.schema](#group_parameters.parameter_3.schema) | | optional
int64_group | [parameter_5.schema](#group_parameters.parameter_5.schema) | | optional


# <a id="group_parameters.parameter_0.schema" >parameter_0.schema</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# <a id="group_parameters.parameter_2.schema" >parameter_2.schema</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 64 bit integer

# <a id="group_parameters.parameter_3.schema" >parameter_3.schema</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# <a id="group_parameters.parameter_5.schema" >parameter_5.schema</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 64 bit integer

### <a id="group_parameters.RequestHeaderParameters" >header_params</a>
#### <a id="group_parameters.RequestHeaderParameters.Params" >RequestHeaderParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
required_boolean_group | [parameter_1.schema](#group_parameters.parameter_1.schema) | | 
boolean_group | [parameter_4.schema](#group_parameters.parameter_4.schema) | | optional

# <a id="group_parameters.parameter_1.schema" >parameter_1.schema</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | must be one of ["true", "false", ] 

# <a id="group_parameters.parameter_4.schema" >parameter_4.schema</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | must be one of ["true", "false", ] 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#group_parameters.response_for_200.ApiResponse) | succeeded

#### <a id="group_parameters.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

[bearer_test](../../../README.md#bearer_test)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)


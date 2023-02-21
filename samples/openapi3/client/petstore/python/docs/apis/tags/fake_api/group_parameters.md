<a name="top"></a>
# **group_parameters**
<a name="group_parameters"></a>

## Table of Contents
- [Summary](#summary)
- [Description](#description)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Authorization](#authorization)
- [Code Sample](#code-sample)

## Summary
Fake endpoint to test group parameters (optional)

## Description
Fake endpoint to test group parameters (optional)

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[query_params](#requestqueryparameters) | [RequestQueryParameters.Params](#RequestQueryParametersParams) | |
[header_params](#requestheaderparameters) | [RequestHeaderParameters.Params](#RequestHeaderParametersParams) | |
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="requestqueryparameters" >query_params</a>
#### <a id="RequestQueryParametersParams" >RequestQueryParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
required_string_group | [Parameter0.schema](#parameter_0schema) | | 
required_int64_group | [Parameter2.schema](#parameter_2schema) | | 
string_group | [Parameter3.schema](#parameter_3schema) | | optional
int64_group | [Parameter5.schema](#parameter_5schema) | | optional


#### Parameter0

##### Description
Required String in group parameters
##### <a id="parameter_0org.openapijsonschematools.codegen.model.CodegenKey@be540734schema" >Parameter0.schema</a>
##### 
###### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

#### Parameter2

##### Description
Required Integer in group parameters
##### <a id="parameter_2org.openapijsonschematools.codegen.model.CodegenKey@be703df8schema" >Parameter2.schema</a>
##### 
###### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 64 bit integer

#### Parameter3

##### Description
String in group parameters
##### <a id="parameter_3org.openapijsonschematools.codegen.model.CodegenKey@be7e595aschema" >Parameter3.schema</a>
##### 
###### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

#### Parameter5

##### Description
Integer in group parameters
##### <a id="parameter_5org.openapijsonschematools.codegen.model.CodegenKey@be9a901eschema" >Parameter5.schema</a>
##### 
###### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 64 bit integer

### <a id="requestheaderparameters" >header_params</a>
#### <a id="RequestHeaderParametersParams" >RequestHeaderParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
required_boolean_group | [Parameter1.schema](#parameter_1schema) | | 
boolean_group | [Parameter4.schema](#parameter_4schema) | | optional

#### Parameter1

##### Description
Required Boolean in group parameters
##### <a id="parameter_1org.openapijsonschematools.codegen.model.CodegenKey@be622296schema" >Parameter1.schema</a>
##### 
###### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | must be one of ["true", "false", ]

#### Parameter4

##### Description
Boolean in group parameters
##### <a id="parameter_4org.openapijsonschematools.codegen.model.CodegenKey@be8c74bcschema" >Parameter4.schema</a>
##### 
###### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | must be one of ["true", "false", ]

## Return Types

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [SuccessDescriptionOnly.response_cls](../../../components/responses/response_success_description_only.md#response_success_description_onlyresponse_cls) | Success

## Authorization

[bearer_test](../../../../README.md#bearer_test)

## Code Sample

* Bearer (JWT) Authentication (bearer_test):
```python
import petstore_api
from petstore_api.apis.tags import fake_api
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

# Configure Bearer authorization (JWT): bearer_test
configuration = petstore_api.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with petstore_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fake_api.FakeApi(api_client)

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
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->group_parameters: %s\n" % e)

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
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->group_parameters: %s\n" % e)
```

[[Back to top]](#top) [[Back to API]](../FakeApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)

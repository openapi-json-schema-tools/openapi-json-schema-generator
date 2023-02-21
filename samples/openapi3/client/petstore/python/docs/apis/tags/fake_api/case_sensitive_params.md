<a name="top"></a>
# **case_sensitive_params**
<a name="case_sensitive_params"></a>

## Table of Contents
- [Description](#description)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Code Sample](#code-sample)

## Description
Ensures that original naming is used in endpoint params, that way we on't have collisions

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[query_params](#requestqueryparameters) | [RequestQueryParameters.Params](#RequestQueryParametersParams) | |
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="requestqueryparameters" >query_params</a>
#### <a id="RequestQueryParametersParams" >RequestQueryParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
someVar | [Parameter0.schema](#parameter_0schema) | | 
SomeVar | [Parameter1.schema](#parameter_1schema) | | 
some_var | [Parameter2.schema](#parameter_2schema) | | 


#### Parameter0
##### <a id="parameter_0org.openapijsonschematools.codegen.model.CodegenKey@be540734schema" >Parameter0.schema</a>
<a id=""></a>
##### 

###### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

#### Parameter1
##### <a id="parameter_1org.openapijsonschematools.codegen.model.CodegenKey@be622296schema" >Parameter1.schema</a>
<a id=""></a>
##### 

###### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

#### Parameter2
##### <a id="parameter_2org.openapijsonschematools.codegen.model.CodegenKey@be703df8schema" >Parameter2.schema</a>
<a id=""></a>
##### 

###### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

## Return Types

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [SuccessDescriptionOnly.response_cls](../../../components/responses/response_success_description_only.md#response_success_description_onlyresponse_cls) | Success

## Code Sample

```python
import petstore_api
from petstore_api.apis.tags import fake_api
from pprint import pprint
# Defining the host is optional and defaults to http://petstore.swagger.io:80/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = petstore_api.Configuration(
    host = "http://petstore.swagger.io:80/v2"
)

# Enter a context with an instance of the API client
with petstore_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fake_api.FakeApi(api_client)

    # example passing only required values which don't have defaults set
    query_params = {
        'someVar': "someVar_example",
        'SomeVar': "SomeVar_example",
        'some_var': "some_var_example",
    }
    try:
        api_response = api_instance.case_sensitive_params(
            query_params=query_params,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->case_sensitive_params: %s\n" % e)
```

[[Back to top]](#top) [[Back to API]](../FakeApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)

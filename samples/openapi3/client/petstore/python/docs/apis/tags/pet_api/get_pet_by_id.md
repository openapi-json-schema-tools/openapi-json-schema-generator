<a name="top"></a>
# **get_pet_by_id**
<a name="get_pet_by_id"></a>

## Table of Contents
- [Summary](#summary)
- [Description](#description)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Authorization](#authorization)
- [Code Sample](#code-sample)

## Summary
Find pet by ID

## Description
Returns a single pet

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[path_params](#requestpathparameters) | [RequestPathParameters.Params](#RequestPathParametersParams) | |
accept_content_types | typing.Tuple[str] | default is ("application/xml", "application/json", ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="requestpathparameters" >path_params</a>
#### <a id="RequestPathParametersParams" >RequestPathParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
petId | [Parameter0.schema](#parameter_0schema) | | 

#### Parameter0

##### Description
ID of pet to return
##### <a id="parameter_0org.openapijsonschematools.codegen.model.CodegenKey@36ce54d3schema" >Parameter0.schema</a>
##### 

###### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 64 bit integer

## Return Types

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ResponseFor200.response_cls](#response_200response_cls) | successful operation
400 | [ResponseFor400.response_cls](#response_400response_cls) | Invalid ID supplied
404 | [ResponseFor404.response_cls](#response_404response_cls) | Pet not found

## <a id="response_200" >ResponseFor200</a>

### <a id="response_200description" >Description</a>
successful operation

### <a id="response_200response_cls" >response_cls</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#response_200content) | typing.Union[[content.application_xml.schema](#response_200contentapplication_xmlschema), [content.application_json.schema](#response_200contentapplication_jsonschema), ] |  |
headers | Unset | headers were not defined |

### <a id="response_200content" >content</a>

#### <a id="response_200org.openapijsonschematools.codegen.model.CodegenKey@6f9749facontentapplication_xmlschema" >ResponseFor200.content.application_xml.schema</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**Pet**](../../../components/schema/pet.Pet.md) |  | 


#### <a id="response_200org.openapijsonschematools.codegen.model.CodegenKey@6f9749facontentapplication_jsonschema" >ResponseFor200.content.application_json.schema</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**RefPet**](../../../components/schema/ref_pet.RefPet.md) |  | 


## <a id="response_400" >ResponseFor400</a>

### <a id="response_400description" >Description</a>
Invalid ID supplied

### <a id="response_400response_cls" >response_cls</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## <a id="response_404" >ResponseFor404</a>

### <a id="response_404description" >Description</a>
Pet not found

### <a id="response_404response_cls" >response_cls</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## Authorization

[api_key](../../../../README.md#api_key)

## Code Sample

* Api Key Authentication (api_key):
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

# Configure API key authorization: api_key
configuration.api_key['api_key'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api_key'] = 'Bearer'
# Enter a context with an instance of the API client
with petstore_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pet_api.PetApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'petId': 1,
    }
    try:
        # Find pet by ID
        api_response = api_instance.get_pet_by_id(
            path_params=path_params,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling PetApi->get_pet_by_id: %s\n" % e)
```

[[Back to top]](#top) [[Back to API]](../PetApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)

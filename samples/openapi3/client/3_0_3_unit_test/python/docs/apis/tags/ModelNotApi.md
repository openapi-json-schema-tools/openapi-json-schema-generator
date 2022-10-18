<a name="__pageTop"></a>
# unit_test_api.apis.tags.model_not_api.ModelNotApi

All URIs are relative to *https://someserver.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**post_forbidden_property_request_body**](#post_forbidden_property_request_body) | **post** /requestBody/postForbiddenPropertyRequestBody | 
[**post_forbidden_property_response_body_for_content_types**](#post_forbidden_property_response_body_for_content_types) | **post** /responseBody/postForbiddenPropertyResponseBodyForContentTypes | 
[**post_not_more_complex_schema_request_body**](#post_not_more_complex_schema_request_body) | **post** /requestBody/postNotMoreComplexSchemaRequestBody | 
[**post_not_more_complex_schema_response_body_for_content_types**](#post_not_more_complex_schema_response_body_for_content_types) | **post** /responseBody/postNotMoreComplexSchemaResponseBodyForContentTypes | 
[**post_not_request_body**](#post_not_request_body) | **post** /requestBody/postNotRequestBody | 
[**post_not_response_body_for_content_types**](#post_not_response_body_for_content_types) | **post** /responseBody/postNotResponseBodyForContentTypes | 

# **post_forbidden_property_request_body**
<a name="post_forbidden_property_request_body"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import model_not_api
from unit_test_api.model.forbidden_property import ForbiddenProperty
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = model_not_api.ModelNotApi(api_client)

    # example passing only required values which don't have defaults set
    body = ForbiddenProperty(None)
    try:
        api_response = api_instance.post_forbidden_property_request_body(
            body=body,
        )
    except unit_test_api.ApiException as e:
        print("Exception when calling ModelNotApi->post_forbidden_property_request_body: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#post_forbidden_property_request_body.request_body) | typing.Union[[request_body.application_json](#post_forbidden_property_request_body.request_body.application_json)] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="post_forbidden_property_request_body.request_body" >body</a>

# <a id="post_forbidden_property_request_body.request_body.application_json" >request_body.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**ForbiddenProperty**](../../models/ForbiddenProperty.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_forbidden_property_request_body.response_for_200.ApiResponse) | success

#### <a id="post_forbidden_property_request_body.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_forbidden_property_response_body_for_content_types**
<a name="post_forbidden_property_response_body_for_content_types"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import model_not_api
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = model_not_api.ModelNotApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.post_forbidden_property_response_body_for_content_types()
        pprint(api_response)
    except unit_test_api.ApiException as e:
        print("Exception when calling ModelNotApi->post_forbidden_property_response_body_for_content_types: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_forbidden_property_response_body_for_content_types.response_for_200.ApiResponse) | success

#### <a id="post_forbidden_property_response_body_for_content_types.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.BodySchemas.application_json](#post_forbidden_property_response_body_for_content_types.response_for_200.BodySchemas.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="post_forbidden_property_response_body_for_content_types.response_for_200.BodySchemas.application_json" >response_for_200.BodySchemas.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**ForbiddenProperty**](../../models/ForbiddenProperty.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_not_more_complex_schema_request_body**
<a name="post_not_more_complex_schema_request_body"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import model_not_api
from unit_test_api.model.not_more_complex_schema import NotMoreComplexSchema
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = model_not_api.ModelNotApi(api_client)

    # example passing only required values which don't have defaults set
    body = NotMoreComplexSchema(None)
    try:
        api_response = api_instance.post_not_more_complex_schema_request_body(
            body=body,
        )
    except unit_test_api.ApiException as e:
        print("Exception when calling ModelNotApi->post_not_more_complex_schema_request_body: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#post_not_more_complex_schema_request_body.request_body) | typing.Union[[request_body.application_json](#post_not_more_complex_schema_request_body.request_body.application_json)] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="post_not_more_complex_schema_request_body.request_body" >body</a>

# <a id="post_not_more_complex_schema_request_body.request_body.application_json" >request_body.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**NotMoreComplexSchema**](../../models/NotMoreComplexSchema.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_not_more_complex_schema_request_body.response_for_200.ApiResponse) | success

#### <a id="post_not_more_complex_schema_request_body.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_not_more_complex_schema_response_body_for_content_types**
<a name="post_not_more_complex_schema_response_body_for_content_types"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import model_not_api
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = model_not_api.ModelNotApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.post_not_more_complex_schema_response_body_for_content_types()
        pprint(api_response)
    except unit_test_api.ApiException as e:
        print("Exception when calling ModelNotApi->post_not_more_complex_schema_response_body_for_content_types: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_not_more_complex_schema_response_body_for_content_types.response_for_200.ApiResponse) | success

#### <a id="post_not_more_complex_schema_response_body_for_content_types.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.BodySchemas.application_json](#post_not_more_complex_schema_response_body_for_content_types.response_for_200.BodySchemas.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="post_not_more_complex_schema_response_body_for_content_types.response_for_200.BodySchemas.application_json" >response_for_200.BodySchemas.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**NotMoreComplexSchema**](../../models/NotMoreComplexSchema.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_not_request_body**
<a name="post_not_request_body"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import model_not_api
from unit_test_api.model.model_not import ModelNot
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = model_not_api.ModelNotApi(api_client)

    # example passing only required values which don't have defaults set
    body = ModelNot(None)
    try:
        api_response = api_instance.post_not_request_body(
            body=body,
        )
    except unit_test_api.ApiException as e:
        print("Exception when calling ModelNotApi->post_not_request_body: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#post_not_request_body.request_body) | typing.Union[[request_body.application_json](#post_not_request_body.request_body.application_json)] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="post_not_request_body.request_body" >body</a>

# <a id="post_not_request_body.request_body.application_json" >request_body.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**ModelNot**](../../models/ModelNot.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_not_request_body.response_for_200.ApiResponse) | success

#### <a id="post_not_request_body.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_not_response_body_for_content_types**
<a name="post_not_response_body_for_content_types"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import model_not_api
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = model_not_api.ModelNotApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.post_not_response_body_for_content_types()
        pprint(api_response)
    except unit_test_api.ApiException as e:
        print("Exception when calling ModelNotApi->post_not_response_body_for_content_types: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_not_response_body_for_content_types.response_for_200.ApiResponse) | success

#### <a id="post_not_response_body_for_content_types.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.BodySchemas.application_json](#post_not_response_body_for_content_types.response_for_200.BodySchemas.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="post_not_response_body_for_content_types.response_for_200.BodySchemas.application_json" >response_for_200.BodySchemas.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**ModelNot**](../../models/ModelNot.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)


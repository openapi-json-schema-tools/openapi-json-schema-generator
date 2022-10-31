<a name="__pageTop"></a>
# unit_test_api.apis.tags.type_api.TypeApi

All URIs are relative to *https://someserver.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**post_array_type_matches_arrays_request_body**](#post_array_type_matches_arrays_request_body) | **post** /requestBody/postArrayTypeMatchesArraysRequestBody | 
[**post_array_type_matches_arrays_response_body_for_content_types**](#post_array_type_matches_arrays_response_body_for_content_types) | **post** /responseBody/postArrayTypeMatchesArraysResponseBodyForContentTypes | 
[**post_boolean_type_matches_booleans_request_body**](#post_boolean_type_matches_booleans_request_body) | **post** /requestBody/postBooleanTypeMatchesBooleansRequestBody | 
[**post_boolean_type_matches_booleans_response_body_for_content_types**](#post_boolean_type_matches_booleans_response_body_for_content_types) | **post** /responseBody/postBooleanTypeMatchesBooleansResponseBodyForContentTypes | 
[**post_integer_type_matches_integers_request_body**](#post_integer_type_matches_integers_request_body) | **post** /requestBody/postIntegerTypeMatchesIntegersRequestBody | 
[**post_integer_type_matches_integers_response_body_for_content_types**](#post_integer_type_matches_integers_response_body_for_content_types) | **post** /responseBody/postIntegerTypeMatchesIntegersResponseBodyForContentTypes | 
[**post_null_type_matches_only_the_null_object_request_body**](#post_null_type_matches_only_the_null_object_request_body) | **post** /requestBody/postNullTypeMatchesOnlyTheNullObjectRequestBody | 
[**post_null_type_matches_only_the_null_object_response_body_for_content_types**](#post_null_type_matches_only_the_null_object_response_body_for_content_types) | **post** /responseBody/postNullTypeMatchesOnlyTheNullObjectResponseBodyForContentTypes | 
[**post_number_type_matches_numbers_request_body**](#post_number_type_matches_numbers_request_body) | **post** /requestBody/postNumberTypeMatchesNumbersRequestBody | 
[**post_number_type_matches_numbers_response_body_for_content_types**](#post_number_type_matches_numbers_response_body_for_content_types) | **post** /responseBody/postNumberTypeMatchesNumbersResponseBodyForContentTypes | 
[**post_object_type_matches_objects_request_body**](#post_object_type_matches_objects_request_body) | **post** /requestBody/postObjectTypeMatchesObjectsRequestBody | 
[**post_object_type_matches_objects_response_body_for_content_types**](#post_object_type_matches_objects_response_body_for_content_types) | **post** /responseBody/postObjectTypeMatchesObjectsResponseBodyForContentTypes | 
[**post_string_type_matches_strings_request_body**](#post_string_type_matches_strings_request_body) | **post** /requestBody/postStringTypeMatchesStringsRequestBody | 
[**post_string_type_matches_strings_response_body_for_content_types**](#post_string_type_matches_strings_response_body_for_content_types) | **post** /responseBody/postStringTypeMatchesStringsResponseBodyForContentTypes | 

# **post_array_type_matches_arrays_request_body**
<a name="post_array_type_matches_arrays_request_body"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import type_api
from unit_test_api.components.schema import array_type_matches_arrays
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = type_api.TypeApi(api_client)

    # example passing only required values which don't have defaults set
    body = array_type_matches_arrays.ArrayTypeMatchesArrays([
        None
    ])
    try:
        api_response = api_instance.post_array_type_matches_arrays_request_body(
            body=body,
        )
    except unit_test_api.ApiException as e:
        print("Exception when calling TypeApi->post_array_type_matches_arrays_request_body: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#post_array_type_matches_arrays_request_body.request_body) | typing.Union[[request_body.application_json](#post_array_type_matches_arrays_request_body.request_body.application_json)] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="post_array_type_matches_arrays_request_body.request_body" >body</a>

# <a id="post_array_type_matches_arrays_request_body.request_body.application_json" >request_body.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**ArrayTypeMatchesArrays**](../../components/schema/array_type_matches_arrays.ArrayTypeMatchesArrays.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_array_type_matches_arrays_request_body.response_for_200.ApiResponse) | success

#### <a id="post_array_type_matches_arrays_request_body.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_array_type_matches_arrays_response_body_for_content_types**
<a name="post_array_type_matches_arrays_response_body_for_content_types"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import type_api
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = type_api.TypeApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.post_array_type_matches_arrays_response_body_for_content_types()
        pprint(api_response)
    except unit_test_api.ApiException as e:
        print("Exception when calling TypeApi->post_array_type_matches_arrays_response_body_for_content_types: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_array_type_matches_arrays_response_body_for_content_types.response_for_200.ApiResponse) | success

#### <a id="post_array_type_matches_arrays_response_body_for_content_types.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.application_json](#post_array_type_matches_arrays_response_body_for_content_types.response_for_200.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="post_array_type_matches_arrays_response_body_for_content_types.response_for_200.application_json" >response_for_200.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**ArrayTypeMatchesArrays**](../../components/schema/array_type_matches_arrays.ArrayTypeMatchesArrays.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_boolean_type_matches_booleans_request_body**
<a name="post_boolean_type_matches_booleans_request_body"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import type_api
from unit_test_api.components.schema import boolean_type_matches_booleans
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = type_api.TypeApi(api_client)

    # example passing only required values which don't have defaults set
    body = boolean_type_matches_booleans.BooleanTypeMatchesBooleans(True)
    try:
        api_response = api_instance.post_boolean_type_matches_booleans_request_body(
            body=body,
        )
    except unit_test_api.ApiException as e:
        print("Exception when calling TypeApi->post_boolean_type_matches_booleans_request_body: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#post_boolean_type_matches_booleans_request_body.request_body) | typing.Union[[request_body.application_json](#post_boolean_type_matches_booleans_request_body.request_body.application_json)] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="post_boolean_type_matches_booleans_request_body.request_body" >body</a>

# <a id="post_boolean_type_matches_booleans_request_body.request_body.application_json" >request_body.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**BooleanTypeMatchesBooleans**](../../components/schema/boolean_type_matches_booleans.BooleanTypeMatchesBooleans.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_boolean_type_matches_booleans_request_body.response_for_200.ApiResponse) | success

#### <a id="post_boolean_type_matches_booleans_request_body.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_boolean_type_matches_booleans_response_body_for_content_types**
<a name="post_boolean_type_matches_booleans_response_body_for_content_types"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import type_api
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = type_api.TypeApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.post_boolean_type_matches_booleans_response_body_for_content_types()
        pprint(api_response)
    except unit_test_api.ApiException as e:
        print("Exception when calling TypeApi->post_boolean_type_matches_booleans_response_body_for_content_types: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_boolean_type_matches_booleans_response_body_for_content_types.response_for_200.ApiResponse) | success

#### <a id="post_boolean_type_matches_booleans_response_body_for_content_types.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.application_json](#post_boolean_type_matches_booleans_response_body_for_content_types.response_for_200.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="post_boolean_type_matches_booleans_response_body_for_content_types.response_for_200.application_json" >response_for_200.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**BooleanTypeMatchesBooleans**](../../components/schema/boolean_type_matches_booleans.BooleanTypeMatchesBooleans.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_integer_type_matches_integers_request_body**
<a name="post_integer_type_matches_integers_request_body"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import type_api
from unit_test_api.components.schema import integer_type_matches_integers
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = type_api.TypeApi(api_client)

    # example passing only required values which don't have defaults set
    body = integer_type_matches_integers.IntegerTypeMatchesIntegers(1)
    try:
        api_response = api_instance.post_integer_type_matches_integers_request_body(
            body=body,
        )
    except unit_test_api.ApiException as e:
        print("Exception when calling TypeApi->post_integer_type_matches_integers_request_body: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#post_integer_type_matches_integers_request_body.request_body) | typing.Union[[request_body.application_json](#post_integer_type_matches_integers_request_body.request_body.application_json)] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="post_integer_type_matches_integers_request_body.request_body" >body</a>

# <a id="post_integer_type_matches_integers_request_body.request_body.application_json" >request_body.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**IntegerTypeMatchesIntegers**](../../components/schema/integer_type_matches_integers.IntegerTypeMatchesIntegers.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_integer_type_matches_integers_request_body.response_for_200.ApiResponse) | success

#### <a id="post_integer_type_matches_integers_request_body.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_integer_type_matches_integers_response_body_for_content_types**
<a name="post_integer_type_matches_integers_response_body_for_content_types"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import type_api
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = type_api.TypeApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.post_integer_type_matches_integers_response_body_for_content_types()
        pprint(api_response)
    except unit_test_api.ApiException as e:
        print("Exception when calling TypeApi->post_integer_type_matches_integers_response_body_for_content_types: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_integer_type_matches_integers_response_body_for_content_types.response_for_200.ApiResponse) | success

#### <a id="post_integer_type_matches_integers_response_body_for_content_types.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.application_json](#post_integer_type_matches_integers_response_body_for_content_types.response_for_200.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="post_integer_type_matches_integers_response_body_for_content_types.response_for_200.application_json" >response_for_200.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**IntegerTypeMatchesIntegers**](../../components/schema/integer_type_matches_integers.IntegerTypeMatchesIntegers.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_null_type_matches_only_the_null_object_request_body**
<a name="post_null_type_matches_only_the_null_object_request_body"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import type_api
from unit_test_api.components.schema import null_type_matches_only_the_null_object
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = type_api.TypeApi(api_client)

    # example passing only required values which don't have defaults set
    body = null_type_matches_only_the_null_object.NullTypeMatchesOnlyTheNullObject(None)
    try:
        api_response = api_instance.post_null_type_matches_only_the_null_object_request_body(
            body=body,
        )
    except unit_test_api.ApiException as e:
        print("Exception when calling TypeApi->post_null_type_matches_only_the_null_object_request_body: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#post_null_type_matches_only_the_null_object_request_body.request_body) | typing.Union[[request_body.application_json](#post_null_type_matches_only_the_null_object_request_body.request_body.application_json)] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="post_null_type_matches_only_the_null_object_request_body.request_body" >body</a>

# <a id="post_null_type_matches_only_the_null_object_request_body.request_body.application_json" >request_body.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**NullTypeMatchesOnlyTheNullObject**](../../components/schema/null_type_matches_only_the_null_object.NullTypeMatchesOnlyTheNullObject.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_null_type_matches_only_the_null_object_request_body.response_for_200.ApiResponse) | success

#### <a id="post_null_type_matches_only_the_null_object_request_body.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_null_type_matches_only_the_null_object_response_body_for_content_types**
<a name="post_null_type_matches_only_the_null_object_response_body_for_content_types"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import type_api
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = type_api.TypeApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.post_null_type_matches_only_the_null_object_response_body_for_content_types()
        pprint(api_response)
    except unit_test_api.ApiException as e:
        print("Exception when calling TypeApi->post_null_type_matches_only_the_null_object_response_body_for_content_types: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_null_type_matches_only_the_null_object_response_body_for_content_types.response_for_200.ApiResponse) | success

#### <a id="post_null_type_matches_only_the_null_object_response_body_for_content_types.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.application_json](#post_null_type_matches_only_the_null_object_response_body_for_content_types.response_for_200.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="post_null_type_matches_only_the_null_object_response_body_for_content_types.response_for_200.application_json" >response_for_200.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**NullTypeMatchesOnlyTheNullObject**](../../components/schema/null_type_matches_only_the_null_object.NullTypeMatchesOnlyTheNullObject.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_number_type_matches_numbers_request_body**
<a name="post_number_type_matches_numbers_request_body"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import type_api
from unit_test_api.components.schema import number_type_matches_numbers
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = type_api.TypeApi(api_client)

    # example passing only required values which don't have defaults set
    body = number_type_matches_numbers.NumberTypeMatchesNumbers(3.14)
    try:
        api_response = api_instance.post_number_type_matches_numbers_request_body(
            body=body,
        )
    except unit_test_api.ApiException as e:
        print("Exception when calling TypeApi->post_number_type_matches_numbers_request_body: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#post_number_type_matches_numbers_request_body.request_body) | typing.Union[[request_body.application_json](#post_number_type_matches_numbers_request_body.request_body.application_json)] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="post_number_type_matches_numbers_request_body.request_body" >body</a>

# <a id="post_number_type_matches_numbers_request_body.request_body.application_json" >request_body.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**NumberTypeMatchesNumbers**](../../components/schema/number_type_matches_numbers.NumberTypeMatchesNumbers.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_number_type_matches_numbers_request_body.response_for_200.ApiResponse) | success

#### <a id="post_number_type_matches_numbers_request_body.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_number_type_matches_numbers_response_body_for_content_types**
<a name="post_number_type_matches_numbers_response_body_for_content_types"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import type_api
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = type_api.TypeApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.post_number_type_matches_numbers_response_body_for_content_types()
        pprint(api_response)
    except unit_test_api.ApiException as e:
        print("Exception when calling TypeApi->post_number_type_matches_numbers_response_body_for_content_types: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_number_type_matches_numbers_response_body_for_content_types.response_for_200.ApiResponse) | success

#### <a id="post_number_type_matches_numbers_response_body_for_content_types.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.application_json](#post_number_type_matches_numbers_response_body_for_content_types.response_for_200.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="post_number_type_matches_numbers_response_body_for_content_types.response_for_200.application_json" >response_for_200.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**NumberTypeMatchesNumbers**](../../components/schema/number_type_matches_numbers.NumberTypeMatchesNumbers.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_object_type_matches_objects_request_body**
<a name="post_object_type_matches_objects_request_body"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import type_api
from unit_test_api.components.schema import object_type_matches_objects
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = type_api.TypeApi(api_client)

    # example passing only required values which don't have defaults set
    body = object_type_matches_objects.ObjectTypeMatchesObjects()
    try:
        api_response = api_instance.post_object_type_matches_objects_request_body(
            body=body,
        )
    except unit_test_api.ApiException as e:
        print("Exception when calling TypeApi->post_object_type_matches_objects_request_body: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#post_object_type_matches_objects_request_body.request_body) | typing.Union[[request_body.application_json](#post_object_type_matches_objects_request_body.request_body.application_json)] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="post_object_type_matches_objects_request_body.request_body" >body</a>

# <a id="post_object_type_matches_objects_request_body.request_body.application_json" >request_body.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**ObjectTypeMatchesObjects**](../../components/schema/object_type_matches_objects.ObjectTypeMatchesObjects.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_object_type_matches_objects_request_body.response_for_200.ApiResponse) | success

#### <a id="post_object_type_matches_objects_request_body.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_object_type_matches_objects_response_body_for_content_types**
<a name="post_object_type_matches_objects_response_body_for_content_types"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import type_api
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = type_api.TypeApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.post_object_type_matches_objects_response_body_for_content_types()
        pprint(api_response)
    except unit_test_api.ApiException as e:
        print("Exception when calling TypeApi->post_object_type_matches_objects_response_body_for_content_types: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_object_type_matches_objects_response_body_for_content_types.response_for_200.ApiResponse) | success

#### <a id="post_object_type_matches_objects_response_body_for_content_types.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.application_json](#post_object_type_matches_objects_response_body_for_content_types.response_for_200.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="post_object_type_matches_objects_response_body_for_content_types.response_for_200.application_json" >response_for_200.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**ObjectTypeMatchesObjects**](../../components/schema/object_type_matches_objects.ObjectTypeMatchesObjects.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_string_type_matches_strings_request_body**
<a name="post_string_type_matches_strings_request_body"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import type_api
from unit_test_api.components.schema import string_type_matches_strings
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = type_api.TypeApi(api_client)

    # example passing only required values which don't have defaults set
    body = string_type_matches_strings.StringTypeMatchesStrings("parameter_body_example")
    try:
        api_response = api_instance.post_string_type_matches_strings_request_body(
            body=body,
        )
    except unit_test_api.ApiException as e:
        print("Exception when calling TypeApi->post_string_type_matches_strings_request_body: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#post_string_type_matches_strings_request_body.request_body) | typing.Union[[request_body.application_json](#post_string_type_matches_strings_request_body.request_body.application_json)] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="post_string_type_matches_strings_request_body.request_body" >body</a>

# <a id="post_string_type_matches_strings_request_body.request_body.application_json" >request_body.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**StringTypeMatchesStrings**](../../components/schema/string_type_matches_strings.StringTypeMatchesStrings.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_string_type_matches_strings_request_body.response_for_200.ApiResponse) | success

#### <a id="post_string_type_matches_strings_request_body.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_string_type_matches_strings_response_body_for_content_types**
<a name="post_string_type_matches_strings_response_body_for_content_types"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import type_api
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = type_api.TypeApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.post_string_type_matches_strings_response_body_for_content_types()
        pprint(api_response)
    except unit_test_api.ApiException as e:
        print("Exception when calling TypeApi->post_string_type_matches_strings_response_body_for_content_types: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_string_type_matches_strings_response_body_for_content_types.response_for_200.ApiResponse) | success

#### <a id="post_string_type_matches_strings_response_body_for_content_types.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.application_json](#post_string_type_matches_strings_response_body_for_content_types.response_for_200.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="post_string_type_matches_strings_response_body_for_content_types.response_for_200.application_json" >response_for_200.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**StringTypeMatchesStrings**](../../components/schema/string_type_matches_strings.StringTypeMatchesStrings.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)


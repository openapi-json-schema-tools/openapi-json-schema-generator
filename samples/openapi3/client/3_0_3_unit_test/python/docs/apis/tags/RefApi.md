<a name="__pageTop"></a>
# unit_test_api.apis.tags.ref_api.RefApi

All URIs are relative to *https://someserver.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**post_property_named_ref_that_is_not_a_reference_request_body**](#post_property_named_ref_that_is_not_a_reference_request_body) | **post** /requestBody/postPropertyNamedRefThatIsNotAReferenceRequestBody | 
[**post_property_named_ref_that_is_not_a_reference_response_body_for_content_types**](#post_property_named_ref_that_is_not_a_reference_response_body_for_content_types) | **post** /responseBody/postPropertyNamedRefThatIsNotAReferenceResponseBodyForContentTypes | 
[**post_ref_in_additionalproperties_request_body**](#post_ref_in_additionalproperties_request_body) | **post** /requestBody/postRefInAdditionalpropertiesRequestBody | 
[**post_ref_in_additionalproperties_response_body_for_content_types**](#post_ref_in_additionalproperties_response_body_for_content_types) | **post** /responseBody/postRefInAdditionalpropertiesResponseBodyForContentTypes | 
[**post_ref_in_allof_request_body**](#post_ref_in_allof_request_body) | **post** /requestBody/postRefInAllofRequestBody | 
[**post_ref_in_allof_response_body_for_content_types**](#post_ref_in_allof_response_body_for_content_types) | **post** /responseBody/postRefInAllofResponseBodyForContentTypes | 
[**post_ref_in_anyof_request_body**](#post_ref_in_anyof_request_body) | **post** /requestBody/postRefInAnyofRequestBody | 
[**post_ref_in_anyof_response_body_for_content_types**](#post_ref_in_anyof_response_body_for_content_types) | **post** /responseBody/postRefInAnyofResponseBodyForContentTypes | 
[**post_ref_in_items_request_body**](#post_ref_in_items_request_body) | **post** /requestBody/postRefInItemsRequestBody | 
[**post_ref_in_items_response_body_for_content_types**](#post_ref_in_items_response_body_for_content_types) | **post** /responseBody/postRefInItemsResponseBodyForContentTypes | 
[**post_ref_in_not_request_body**](#post_ref_in_not_request_body) | **post** /requestBody/postRefInNotRequestBody | 
[**post_ref_in_not_response_body_for_content_types**](#post_ref_in_not_response_body_for_content_types) | **post** /responseBody/postRefInNotResponseBodyForContentTypes | 
[**post_ref_in_oneof_request_body**](#post_ref_in_oneof_request_body) | **post** /requestBody/postRefInOneofRequestBody | 
[**post_ref_in_oneof_response_body_for_content_types**](#post_ref_in_oneof_response_body_for_content_types) | **post** /responseBody/postRefInOneofResponseBodyForContentTypes | 
[**post_ref_in_property_request_body**](#post_ref_in_property_request_body) | **post** /requestBody/postRefInPropertyRequestBody | 
[**post_ref_in_property_response_body_for_content_types**](#post_ref_in_property_response_body_for_content_types) | **post** /responseBody/postRefInPropertyResponseBodyForContentTypes | 

# **post_property_named_ref_that_is_not_a_reference_request_body**
<a name="post_property_named_ref_that_is_not_a_reference_request_body"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import ref_api
from unit_test_api.components.schema import property_named_ref_that_is_not_a_reference
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ref_api.RefApi(api_client)

    # example passing only required values which don't have defaults set
    body = property_named_ref_that_is_not_a_reference.PropertyNamedRefThatIsNotAReference(None)
    try:
        api_response = api_instance.post_property_named_ref_that_is_not_a_reference_request_body(
            body=body,
        )
    except unit_test_api.ApiException as e:
        print("Exception when calling RefApi->post_property_named_ref_that_is_not_a_reference_request_body: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#post_property_named_ref_that_is_not_a_reference_request_body.request_body) | typing.Union[[request_body.application_json](#post_property_named_ref_that_is_not_a_reference_request_body.request_body.application_json)] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="post_property_named_ref_that_is_not_a_reference_request_body.request_body" >body</a>

# <a id="post_property_named_ref_that_is_not_a_reference_request_body.request_body.application_json" >request_body.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**PropertyNamedRefThatIsNotAReference**](../../components/schema/property_named_ref_that_is_not_a_reference.PropertyNamedRefThatIsNotAReference.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_property_named_ref_that_is_not_a_reference_request_body.response_for_200.ApiResponse) | success

#### <a id="post_property_named_ref_that_is_not_a_reference_request_body.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_property_named_ref_that_is_not_a_reference_response_body_for_content_types**
<a name="post_property_named_ref_that_is_not_a_reference_response_body_for_content_types"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import ref_api
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ref_api.RefApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.post_property_named_ref_that_is_not_a_reference_response_body_for_content_types()
        pprint(api_response)
    except unit_test_api.ApiException as e:
        print("Exception when calling RefApi->post_property_named_ref_that_is_not_a_reference_response_body_for_content_types: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_property_named_ref_that_is_not_a_reference_response_body_for_content_types.response_for_200.ApiResponse) | success

#### <a id="post_property_named_ref_that_is_not_a_reference_response_body_for_content_types.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.application_json](#post_property_named_ref_that_is_not_a_reference_response_body_for_content_types.response_for_200.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="post_property_named_ref_that_is_not_a_reference_response_body_for_content_types.response_for_200.application_json" >response_for_200.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**PropertyNamedRefThatIsNotAReference**](../../components/schema/property_named_ref_that_is_not_a_reference.PropertyNamedRefThatIsNotAReference.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_ref_in_additionalproperties_request_body**
<a name="post_ref_in_additionalproperties_request_body"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import ref_api
from unit_test_api.components.schema import ref_in_additionalproperties
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ref_api.RefApi(api_client)

    # example passing only required values which don't have defaults set
    body = ref_in_additionalproperties.RefInAdditionalproperties(
        key=property_named_ref_that_is_not_a_reference.PropertyNamedRefThatIsNotAReference(None),
    )
    try:
        api_response = api_instance.post_ref_in_additionalproperties_request_body(
            body=body,
        )
    except unit_test_api.ApiException as e:
        print("Exception when calling RefApi->post_ref_in_additionalproperties_request_body: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#post_ref_in_additionalproperties_request_body.request_body) | typing.Union[[request_body.application_json](#post_ref_in_additionalproperties_request_body.request_body.application_json)] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="post_ref_in_additionalproperties_request_body.request_body" >body</a>

# <a id="post_ref_in_additionalproperties_request_body.request_body.application_json" >request_body.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**RefInAdditionalproperties**](../../components/schema/ref_in_additionalproperties.RefInAdditionalproperties.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_ref_in_additionalproperties_request_body.response_for_200.ApiResponse) | success

#### <a id="post_ref_in_additionalproperties_request_body.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_ref_in_additionalproperties_response_body_for_content_types**
<a name="post_ref_in_additionalproperties_response_body_for_content_types"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import ref_api
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ref_api.RefApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.post_ref_in_additionalproperties_response_body_for_content_types()
        pprint(api_response)
    except unit_test_api.ApiException as e:
        print("Exception when calling RefApi->post_ref_in_additionalproperties_response_body_for_content_types: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_ref_in_additionalproperties_response_body_for_content_types.response_for_200.ApiResponse) | success

#### <a id="post_ref_in_additionalproperties_response_body_for_content_types.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.application_json](#post_ref_in_additionalproperties_response_body_for_content_types.response_for_200.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="post_ref_in_additionalproperties_response_body_for_content_types.response_for_200.application_json" >response_for_200.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**RefInAdditionalproperties**](../../components/schema/ref_in_additionalproperties.RefInAdditionalproperties.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_ref_in_allof_request_body**
<a name="post_ref_in_allof_request_body"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import ref_api
from unit_test_api.components.schema import ref_in_allof
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ref_api.RefApi(api_client)

    # example passing only required values which don't have defaults set
    body = ref_in_allof.RefInAllof(None)
    try:
        api_response = api_instance.post_ref_in_allof_request_body(
            body=body,
        )
    except unit_test_api.ApiException as e:
        print("Exception when calling RefApi->post_ref_in_allof_request_body: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#post_ref_in_allof_request_body.request_body) | typing.Union[[request_body.application_json](#post_ref_in_allof_request_body.request_body.application_json)] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="post_ref_in_allof_request_body.request_body" >body</a>

# <a id="post_ref_in_allof_request_body.request_body.application_json" >request_body.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**RefInAllof**](../../components/schema/ref_in_allof.RefInAllof.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_ref_in_allof_request_body.response_for_200.ApiResponse) | success

#### <a id="post_ref_in_allof_request_body.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_ref_in_allof_response_body_for_content_types**
<a name="post_ref_in_allof_response_body_for_content_types"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import ref_api
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ref_api.RefApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.post_ref_in_allof_response_body_for_content_types()
        pprint(api_response)
    except unit_test_api.ApiException as e:
        print("Exception when calling RefApi->post_ref_in_allof_response_body_for_content_types: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_ref_in_allof_response_body_for_content_types.response_for_200.ApiResponse) | success

#### <a id="post_ref_in_allof_response_body_for_content_types.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.application_json](#post_ref_in_allof_response_body_for_content_types.response_for_200.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="post_ref_in_allof_response_body_for_content_types.response_for_200.application_json" >response_for_200.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**RefInAllof**](../../components/schema/ref_in_allof.RefInAllof.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_ref_in_anyof_request_body**
<a name="post_ref_in_anyof_request_body"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import ref_api
from unit_test_api.components.schema import ref_in_anyof
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ref_api.RefApi(api_client)

    # example passing only required values which don't have defaults set
    body = ref_in_anyof.RefInAnyof(None)
    try:
        api_response = api_instance.post_ref_in_anyof_request_body(
            body=body,
        )
    except unit_test_api.ApiException as e:
        print("Exception when calling RefApi->post_ref_in_anyof_request_body: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#post_ref_in_anyof_request_body.request_body) | typing.Union[[request_body.application_json](#post_ref_in_anyof_request_body.request_body.application_json)] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="post_ref_in_anyof_request_body.request_body" >body</a>

# <a id="post_ref_in_anyof_request_body.request_body.application_json" >request_body.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**RefInAnyof**](../../components/schema/ref_in_anyof.RefInAnyof.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_ref_in_anyof_request_body.response_for_200.ApiResponse) | success

#### <a id="post_ref_in_anyof_request_body.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_ref_in_anyof_response_body_for_content_types**
<a name="post_ref_in_anyof_response_body_for_content_types"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import ref_api
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ref_api.RefApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.post_ref_in_anyof_response_body_for_content_types()
        pprint(api_response)
    except unit_test_api.ApiException as e:
        print("Exception when calling RefApi->post_ref_in_anyof_response_body_for_content_types: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_ref_in_anyof_response_body_for_content_types.response_for_200.ApiResponse) | success

#### <a id="post_ref_in_anyof_response_body_for_content_types.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.application_json](#post_ref_in_anyof_response_body_for_content_types.response_for_200.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="post_ref_in_anyof_response_body_for_content_types.response_for_200.application_json" >response_for_200.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**RefInAnyof**](../../components/schema/ref_in_anyof.RefInAnyof.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_ref_in_items_request_body**
<a name="post_ref_in_items_request_body"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import ref_api
from unit_test_api.components.schema import ref_in_items
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ref_api.RefApi(api_client)

    # example passing only required values which don't have defaults set
    body = ref_in_items.RefInItems([
        property_named_ref_that_is_not_a_reference.PropertyNamedRefThatIsNotAReference(None)
    ])
    try:
        api_response = api_instance.post_ref_in_items_request_body(
            body=body,
        )
    except unit_test_api.ApiException as e:
        print("Exception when calling RefApi->post_ref_in_items_request_body: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#post_ref_in_items_request_body.request_body) | typing.Union[[request_body.application_json](#post_ref_in_items_request_body.request_body.application_json)] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="post_ref_in_items_request_body.request_body" >body</a>

# <a id="post_ref_in_items_request_body.request_body.application_json" >request_body.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**RefInItems**](../../components/schema/ref_in_items.RefInItems.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_ref_in_items_request_body.response_for_200.ApiResponse) | success

#### <a id="post_ref_in_items_request_body.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_ref_in_items_response_body_for_content_types**
<a name="post_ref_in_items_response_body_for_content_types"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import ref_api
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ref_api.RefApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.post_ref_in_items_response_body_for_content_types()
        pprint(api_response)
    except unit_test_api.ApiException as e:
        print("Exception when calling RefApi->post_ref_in_items_response_body_for_content_types: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_ref_in_items_response_body_for_content_types.response_for_200.ApiResponse) | success

#### <a id="post_ref_in_items_response_body_for_content_types.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.application_json](#post_ref_in_items_response_body_for_content_types.response_for_200.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="post_ref_in_items_response_body_for_content_types.response_for_200.application_json" >response_for_200.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**RefInItems**](../../components/schema/ref_in_items.RefInItems.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_ref_in_not_request_body**
<a name="post_ref_in_not_request_body"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import ref_api
from unit_test_api.components.schema import ref_in_not
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ref_api.RefApi(api_client)

    # example passing only required values which don't have defaults set
    body = ref_in_not.RefInNot(None)
    try:
        api_response = api_instance.post_ref_in_not_request_body(
            body=body,
        )
    except unit_test_api.ApiException as e:
        print("Exception when calling RefApi->post_ref_in_not_request_body: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#post_ref_in_not_request_body.request_body) | typing.Union[[request_body.application_json](#post_ref_in_not_request_body.request_body.application_json)] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="post_ref_in_not_request_body.request_body" >body</a>

# <a id="post_ref_in_not_request_body.request_body.application_json" >request_body.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**RefInNot**](../../components/schema/ref_in_not.RefInNot.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_ref_in_not_request_body.response_for_200.ApiResponse) | success

#### <a id="post_ref_in_not_request_body.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_ref_in_not_response_body_for_content_types**
<a name="post_ref_in_not_response_body_for_content_types"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import ref_api
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ref_api.RefApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.post_ref_in_not_response_body_for_content_types()
        pprint(api_response)
    except unit_test_api.ApiException as e:
        print("Exception when calling RefApi->post_ref_in_not_response_body_for_content_types: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_ref_in_not_response_body_for_content_types.response_for_200.ApiResponse) | success

#### <a id="post_ref_in_not_response_body_for_content_types.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.application_json](#post_ref_in_not_response_body_for_content_types.response_for_200.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="post_ref_in_not_response_body_for_content_types.response_for_200.application_json" >response_for_200.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**RefInNot**](../../components/schema/ref_in_not.RefInNot.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_ref_in_oneof_request_body**
<a name="post_ref_in_oneof_request_body"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import ref_api
from unit_test_api.components.schema import ref_in_oneof
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ref_api.RefApi(api_client)

    # example passing only required values which don't have defaults set
    body = ref_in_oneof.RefInOneof(None)
    try:
        api_response = api_instance.post_ref_in_oneof_request_body(
            body=body,
        )
    except unit_test_api.ApiException as e:
        print("Exception when calling RefApi->post_ref_in_oneof_request_body: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#post_ref_in_oneof_request_body.request_body) | typing.Union[[request_body.application_json](#post_ref_in_oneof_request_body.request_body.application_json)] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="post_ref_in_oneof_request_body.request_body" >body</a>

# <a id="post_ref_in_oneof_request_body.request_body.application_json" >request_body.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**RefInOneof**](../../components/schema/ref_in_oneof.RefInOneof.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_ref_in_oneof_request_body.response_for_200.ApiResponse) | success

#### <a id="post_ref_in_oneof_request_body.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_ref_in_oneof_response_body_for_content_types**
<a name="post_ref_in_oneof_response_body_for_content_types"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import ref_api
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ref_api.RefApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.post_ref_in_oneof_response_body_for_content_types()
        pprint(api_response)
    except unit_test_api.ApiException as e:
        print("Exception when calling RefApi->post_ref_in_oneof_response_body_for_content_types: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_ref_in_oneof_response_body_for_content_types.response_for_200.ApiResponse) | success

#### <a id="post_ref_in_oneof_response_body_for_content_types.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.application_json](#post_ref_in_oneof_response_body_for_content_types.response_for_200.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="post_ref_in_oneof_response_body_for_content_types.response_for_200.application_json" >response_for_200.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**RefInOneof**](../../components/schema/ref_in_oneof.RefInOneof.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_ref_in_property_request_body**
<a name="post_ref_in_property_request_body"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import ref_api
from unit_test_api.components.schema import ref_in_property
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ref_api.RefApi(api_client)

    # example passing only required values which don't have defaults set
    body = ref_in_property.RefInProperty(None)
    try:
        api_response = api_instance.post_ref_in_property_request_body(
            body=body,
        )
    except unit_test_api.ApiException as e:
        print("Exception when calling RefApi->post_ref_in_property_request_body: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#post_ref_in_property_request_body.request_body) | typing.Union[[request_body.application_json](#post_ref_in_property_request_body.request_body.application_json)] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="post_ref_in_property_request_body.request_body" >body</a>

# <a id="post_ref_in_property_request_body.request_body.application_json" >request_body.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**RefInProperty**](../../components/schema/ref_in_property.RefInProperty.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_ref_in_property_request_body.response_for_200.ApiResponse) | success

#### <a id="post_ref_in_property_request_body.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_ref_in_property_response_body_for_content_types**
<a name="post_ref_in_property_response_body_for_content_types"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import ref_api
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ref_api.RefApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.post_ref_in_property_response_body_for_content_types()
        pprint(api_response)
    except unit_test_api.ApiException as e:
        print("Exception when calling RefApi->post_ref_in_property_response_body_for_content_types: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_ref_in_property_response_body_for_content_types.response_for_200.ApiResponse) | success

#### <a id="post_ref_in_property_response_body_for_content_types.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.application_json](#post_ref_in_property_response_body_for_content_types.response_for_200.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="post_ref_in_property_response_body_for_content_types.response_for_200.application_json" >response_for_200.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**RefInProperty**](../../components/schema/ref_in_property.RefInProperty.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)


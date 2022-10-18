<a name="__pageTop"></a>
# unit_test_api.apis.tags.default_api.DefaultApi

All URIs are relative to *https://someserver.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**post_invalid_string_value_for_default_request_body**](#post_invalid_string_value_for_default_request_body) | **post** /requestBody/postInvalidStringValueForDefaultRequestBody | 
[**post_invalid_string_value_for_default_response_body_for_content_types**](#post_invalid_string_value_for_default_response_body_for_content_types) | **post** /responseBody/postInvalidStringValueForDefaultResponseBodyForContentTypes | 
[**post_the_default_keyword_does_not_do_anything_if_the_property_is_missing_request_body**](#post_the_default_keyword_does_not_do_anything_if_the_property_is_missing_request_body) | **post** /requestBody/postTheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingRequestBody | 
[**post_the_default_keyword_does_not_do_anything_if_the_property_is_missing_response_body_for_content_types**](#post_the_default_keyword_does_not_do_anything_if_the_property_is_missing_response_body_for_content_types) | **post** /responseBody/postTheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingResponseBodyForContentTypes | 

# **post_invalid_string_value_for_default_request_body**
<a name="post_invalid_string_value_for_default_request_body"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import default_api
from unit_test_api.model.invalid_string_value_for_default import InvalidStringValueForDefault
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = default_api.DefaultApi(api_client)

    # example passing only required values which don't have defaults set
    body = InvalidStringValueForDefault(None)
    try:
        api_response = api_instance.post_invalid_string_value_for_default_request_body(
            body=body,
        )
    except unit_test_api.ApiException as e:
        print("Exception when calling DefaultApi->post_invalid_string_value_for_default_request_body: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#post_invalid_string_value_for_default_request_body.request_body) | typing.Union[[request_body.application_json](#post_invalid_string_value_for_default_request_body.request_body.application_json)] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="post_invalid_string_value_for_default_request_body.request_body" >body</a>

# <a id="post_invalid_string_value_for_default_request_body.request_body.application_json" >request_body.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**InvalidStringValueForDefault**](../../models/InvalidStringValueForDefault.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_invalid_string_value_for_default_request_body.response_for_200.ApiResponse) | success

#### <a id="post_invalid_string_value_for_default_request_body.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_invalid_string_value_for_default_response_body_for_content_types**
<a name="post_invalid_string_value_for_default_response_body_for_content_types"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import default_api
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = default_api.DefaultApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.post_invalid_string_value_for_default_response_body_for_content_types()
        pprint(api_response)
    except unit_test_api.ApiException as e:
        print("Exception when calling DefaultApi->post_invalid_string_value_for_default_response_body_for_content_types: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_invalid_string_value_for_default_response_body_for_content_types.response_for_200.ApiResponse) | success

#### <a id="post_invalid_string_value_for_default_response_body_for_content_types.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.BodySchemas.application_json](#post_invalid_string_value_for_default_response_body_for_content_types.response_for_200.BodySchemas.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="post_invalid_string_value_for_default_response_body_for_content_types.response_for_200.BodySchemas.application_json" >response_for_200.BodySchemas.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**InvalidStringValueForDefault**](../../models/InvalidStringValueForDefault.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_the_default_keyword_does_not_do_anything_if_the_property_is_missing_request_body**
<a name="post_the_default_keyword_does_not_do_anything_if_the_property_is_missing_request_body"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import default_api
from unit_test_api.model.the_default_keyword_does_not_do_anything_if_the_property_is_missing import TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = default_api.DefaultApi(api_client)

    # example passing only required values which don't have defaults set
    body = TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing(
        alpha=5,
    )
    try:
        api_response = api_instance.post_the_default_keyword_does_not_do_anything_if_the_property_is_missing_request_body(
            body=body,
        )
    except unit_test_api.ApiException as e:
        print("Exception when calling DefaultApi->post_the_default_keyword_does_not_do_anything_if_the_property_is_missing_request_body: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#post_the_default_keyword_does_not_do_anything_if_the_property_is_missing_request_body.request_body) | typing.Union[[request_body.application_json](#post_the_default_keyword_does_not_do_anything_if_the_property_is_missing_request_body.request_body.application_json)] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="post_the_default_keyword_does_not_do_anything_if_the_property_is_missing_request_body.request_body" >body</a>

# <a id="post_the_default_keyword_does_not_do_anything_if_the_property_is_missing_request_body.request_body.application_json" >request_body.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing**](../../models/TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_the_default_keyword_does_not_do_anything_if_the_property_is_missing_request_body.response_for_200.ApiResponse) | success

#### <a id="post_the_default_keyword_does_not_do_anything_if_the_property_is_missing_request_body.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_the_default_keyword_does_not_do_anything_if_the_property_is_missing_response_body_for_content_types**
<a name="post_the_default_keyword_does_not_do_anything_if_the_property_is_missing_response_body_for_content_types"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import default_api
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = default_api.DefaultApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.post_the_default_keyword_does_not_do_anything_if_the_property_is_missing_response_body_for_content_types()
        pprint(api_response)
    except unit_test_api.ApiException as e:
        print("Exception when calling DefaultApi->post_the_default_keyword_does_not_do_anything_if_the_property_is_missing_response_body_for_content_types: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_the_default_keyword_does_not_do_anything_if_the_property_is_missing_response_body_for_content_types.response_for_200.ApiResponse) | success

#### <a id="post_the_default_keyword_does_not_do_anything_if_the_property_is_missing_response_body_for_content_types.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.BodySchemas.application_json](#post_the_default_keyword_does_not_do_anything_if_the_property_is_missing_response_body_for_content_types.response_for_200.BodySchemas.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="post_the_default_keyword_does_not_do_anything_if_the_property_is_missing_response_body_for_content_types.response_for_200.BodySchemas.application_json" >response_for_200.BodySchemas.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing**](../../models/TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)


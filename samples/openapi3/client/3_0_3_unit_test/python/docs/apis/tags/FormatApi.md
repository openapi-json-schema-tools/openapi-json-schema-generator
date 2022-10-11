<a name="__pageTop"></a>
# unit_test_api.apis.tags.format_api.FormatApi

All URIs are relative to *https://someserver.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**post_date_time_format_request_body**](#post_date_time_format_request_body) | **post** /requestBody/postDateTimeFormatRequestBody | 
[**post_date_time_format_response_body_for_content_types**](#post_date_time_format_response_body_for_content_types) | **post** /responseBody/postDateTimeFormatResponseBodyForContentTypes | 
[**post_email_format_request_body**](#post_email_format_request_body) | **post** /requestBody/postEmailFormatRequestBody | 
[**post_email_format_response_body_for_content_types**](#post_email_format_response_body_for_content_types) | **post** /responseBody/postEmailFormatResponseBodyForContentTypes | 
[**post_hostname_format_request_body**](#post_hostname_format_request_body) | **post** /requestBody/postHostnameFormatRequestBody | 
[**post_hostname_format_response_body_for_content_types**](#post_hostname_format_response_body_for_content_types) | **post** /responseBody/postHostnameFormatResponseBodyForContentTypes | 
[**post_ipv4_format_request_body**](#post_ipv4_format_request_body) | **post** /requestBody/postIpv4FormatRequestBody | 
[**post_ipv4_format_response_body_for_content_types**](#post_ipv4_format_response_body_for_content_types) | **post** /responseBody/postIpv4FormatResponseBodyForContentTypes | 
[**post_ipv6_format_request_body**](#post_ipv6_format_request_body) | **post** /requestBody/postIpv6FormatRequestBody | 
[**post_ipv6_format_response_body_for_content_types**](#post_ipv6_format_response_body_for_content_types) | **post** /responseBody/postIpv6FormatResponseBodyForContentTypes | 
[**post_json_pointer_format_request_body**](#post_json_pointer_format_request_body) | **post** /requestBody/postJsonPointerFormatRequestBody | 
[**post_json_pointer_format_response_body_for_content_types**](#post_json_pointer_format_response_body_for_content_types) | **post** /responseBody/postJsonPointerFormatResponseBodyForContentTypes | 
[**post_uri_format_request_body**](#post_uri_format_request_body) | **post** /requestBody/postUriFormatRequestBody | 
[**post_uri_format_response_body_for_content_types**](#post_uri_format_response_body_for_content_types) | **post** /responseBody/postUriFormatResponseBodyForContentTypes | 
[**post_uri_reference_format_request_body**](#post_uri_reference_format_request_body) | **post** /requestBody/postUriReferenceFormatRequestBody | 
[**post_uri_reference_format_response_body_for_content_types**](#post_uri_reference_format_response_body_for_content_types) | **post** /responseBody/postUriReferenceFormatResponseBodyForContentTypes | 
[**post_uri_template_format_request_body**](#post_uri_template_format_request_body) | **post** /requestBody/postUriTemplateFormatRequestBody | 
[**post_uri_template_format_response_body_for_content_types**](#post_uri_template_format_response_body_for_content_types) | **post** /responseBody/postUriTemplateFormatResponseBodyForContentTypes | 

# **post_date_time_format_request_body**
<a name="post_date_time_format_request_body"></a>
> post_date_time_format_request_body(body)



### Example

```python
import unit_test_api
from unit_test_api.apis.tags import format_api
from unit_test_api.model.date_time_format import DateTimeFormat
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = format_api.FormatApi(api_client)

    # example passing only required values which don't have defaults set
    body = DateTimeFormat(None)
    try:
        api_response = api_instance.post_date_time_format_request_body(
            body=body,
        )
    except unit_test_api.ApiException as e:
        print("Exception when calling FormatApi->post_date_time_format_request_body: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[application/json] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# application/json
Type | Description  | Notes
------------- | ------------- | -------------
[**DateTimeFormat**](../../models/DateTimeFormat.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#post_date_time_format_request_body.ApiResponseFor200) | success

#### post_date_time_format_request_body.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_date_time_format_response_body_for_content_types**
<a name="post_date_time_format_response_body_for_content_types"></a>
> DateTimeFormat post_date_time_format_response_body_for_content_types()



### Example

```python
import unit_test_api
from unit_test_api.apis.tags import format_api
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = format_api.FormatApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.post_date_time_format_response_body_for_content_types()
        pprint(api_response)
    except unit_test_api.ApiException as e:
        print("Exception when calling FormatApi->post_date_time_format_response_body_for_content_types: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#post_date_time_format_response_body_for_content_types.ApiResponseFor200) | success

#### post_date_time_format_response_body_for_content_types.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[application/json, ] |  |
headers | Unset | headers were not defined |

# application/json
Type | Description  | Notes
------------- | ------------- | -------------
[**DateTimeFormat**](../../models/DateTimeFormat.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_email_format_request_body**
<a name="post_email_format_request_body"></a>
> post_email_format_request_body(body)



### Example

```python
import unit_test_api
from unit_test_api.apis.tags import format_api
from unit_test_api.model.email_format import EmailFormat
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = format_api.FormatApi(api_client)

    # example passing only required values which don't have defaults set
    body = EmailFormat(None)
    try:
        api_response = api_instance.post_email_format_request_body(
            body=body,
        )
    except unit_test_api.ApiException as e:
        print("Exception when calling FormatApi->post_email_format_request_body: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[application/json] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# application/json
Type | Description  | Notes
------------- | ------------- | -------------
[**EmailFormat**](../../models/EmailFormat.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#post_email_format_request_body.ApiResponseFor200) | success

#### post_email_format_request_body.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_email_format_response_body_for_content_types**
<a name="post_email_format_response_body_for_content_types"></a>
> EmailFormat post_email_format_response_body_for_content_types()



### Example

```python
import unit_test_api
from unit_test_api.apis.tags import format_api
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = format_api.FormatApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.post_email_format_response_body_for_content_types()
        pprint(api_response)
    except unit_test_api.ApiException as e:
        print("Exception when calling FormatApi->post_email_format_response_body_for_content_types: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#post_email_format_response_body_for_content_types.ApiResponseFor200) | success

#### post_email_format_response_body_for_content_types.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[application/json, ] |  |
headers | Unset | headers were not defined |

# application/json
Type | Description  | Notes
------------- | ------------- | -------------
[**EmailFormat**](../../models/EmailFormat.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_hostname_format_request_body**
<a name="post_hostname_format_request_body"></a>
> post_hostname_format_request_body(body)



### Example

```python
import unit_test_api
from unit_test_api.apis.tags import format_api
from unit_test_api.model.hostname_format import HostnameFormat
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = format_api.FormatApi(api_client)

    # example passing only required values which don't have defaults set
    body = HostnameFormat(None)
    try:
        api_response = api_instance.post_hostname_format_request_body(
            body=body,
        )
    except unit_test_api.ApiException as e:
        print("Exception when calling FormatApi->post_hostname_format_request_body: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[application/json] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# application/json
Type | Description  | Notes
------------- | ------------- | -------------
[**HostnameFormat**](../../models/HostnameFormat.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#post_hostname_format_request_body.ApiResponseFor200) | success

#### post_hostname_format_request_body.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_hostname_format_response_body_for_content_types**
<a name="post_hostname_format_response_body_for_content_types"></a>
> HostnameFormat post_hostname_format_response_body_for_content_types()



### Example

```python
import unit_test_api
from unit_test_api.apis.tags import format_api
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = format_api.FormatApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.post_hostname_format_response_body_for_content_types()
        pprint(api_response)
    except unit_test_api.ApiException as e:
        print("Exception when calling FormatApi->post_hostname_format_response_body_for_content_types: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#post_hostname_format_response_body_for_content_types.ApiResponseFor200) | success

#### post_hostname_format_response_body_for_content_types.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[application/json, ] |  |
headers | Unset | headers were not defined |

# application/json
Type | Description  | Notes
------------- | ------------- | -------------
[**HostnameFormat**](../../models/HostnameFormat.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_ipv4_format_request_body**
<a name="post_ipv4_format_request_body"></a>
> post_ipv4_format_request_body(body)



### Example

```python
import unit_test_api
from unit_test_api.apis.tags import format_api
from unit_test_api.model.ipv4_format import Ipv4Format
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = format_api.FormatApi(api_client)

    # example passing only required values which don't have defaults set
    body = Ipv4Format(None)
    try:
        api_response = api_instance.post_ipv4_format_request_body(
            body=body,
        )
    except unit_test_api.ApiException as e:
        print("Exception when calling FormatApi->post_ipv4_format_request_body: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[application/json] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# application/json
Type | Description  | Notes
------------- | ------------- | -------------
[**Ipv4Format**](../../models/Ipv4Format.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#post_ipv4_format_request_body.ApiResponseFor200) | success

#### post_ipv4_format_request_body.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_ipv4_format_response_body_for_content_types**
<a name="post_ipv4_format_response_body_for_content_types"></a>
> Ipv4Format post_ipv4_format_response_body_for_content_types()



### Example

```python
import unit_test_api
from unit_test_api.apis.tags import format_api
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = format_api.FormatApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.post_ipv4_format_response_body_for_content_types()
        pprint(api_response)
    except unit_test_api.ApiException as e:
        print("Exception when calling FormatApi->post_ipv4_format_response_body_for_content_types: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#post_ipv4_format_response_body_for_content_types.ApiResponseFor200) | success

#### post_ipv4_format_response_body_for_content_types.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[application/json, ] |  |
headers | Unset | headers were not defined |

# application/json
Type | Description  | Notes
------------- | ------------- | -------------
[**Ipv4Format**](../../models/Ipv4Format.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_ipv6_format_request_body**
<a name="post_ipv6_format_request_body"></a>
> post_ipv6_format_request_body(body)



### Example

```python
import unit_test_api
from unit_test_api.apis.tags import format_api
from unit_test_api.model.ipv6_format import Ipv6Format
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = format_api.FormatApi(api_client)

    # example passing only required values which don't have defaults set
    body = Ipv6Format(None)
    try:
        api_response = api_instance.post_ipv6_format_request_body(
            body=body,
        )
    except unit_test_api.ApiException as e:
        print("Exception when calling FormatApi->post_ipv6_format_request_body: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[application/json] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# application/json
Type | Description  | Notes
------------- | ------------- | -------------
[**Ipv6Format**](../../models/Ipv6Format.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#post_ipv6_format_request_body.ApiResponseFor200) | success

#### post_ipv6_format_request_body.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_ipv6_format_response_body_for_content_types**
<a name="post_ipv6_format_response_body_for_content_types"></a>
> Ipv6Format post_ipv6_format_response_body_for_content_types()



### Example

```python
import unit_test_api
from unit_test_api.apis.tags import format_api
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = format_api.FormatApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.post_ipv6_format_response_body_for_content_types()
        pprint(api_response)
    except unit_test_api.ApiException as e:
        print("Exception when calling FormatApi->post_ipv6_format_response_body_for_content_types: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#post_ipv6_format_response_body_for_content_types.ApiResponseFor200) | success

#### post_ipv6_format_response_body_for_content_types.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[application/json, ] |  |
headers | Unset | headers were not defined |

# application/json
Type | Description  | Notes
------------- | ------------- | -------------
[**Ipv6Format**](../../models/Ipv6Format.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_json_pointer_format_request_body**
<a name="post_json_pointer_format_request_body"></a>
> post_json_pointer_format_request_body(body)



### Example

```python
import unit_test_api
from unit_test_api.apis.tags import format_api
from unit_test_api.model.json_pointer_format import JsonPointerFormat
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = format_api.FormatApi(api_client)

    # example passing only required values which don't have defaults set
    body = JsonPointerFormat(None)
    try:
        api_response = api_instance.post_json_pointer_format_request_body(
            body=body,
        )
    except unit_test_api.ApiException as e:
        print("Exception when calling FormatApi->post_json_pointer_format_request_body: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[application/json] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# application/json
Type | Description  | Notes
------------- | ------------- | -------------
[**JsonPointerFormat**](../../models/JsonPointerFormat.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#post_json_pointer_format_request_body.ApiResponseFor200) | success

#### post_json_pointer_format_request_body.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_json_pointer_format_response_body_for_content_types**
<a name="post_json_pointer_format_response_body_for_content_types"></a>
> JsonPointerFormat post_json_pointer_format_response_body_for_content_types()



### Example

```python
import unit_test_api
from unit_test_api.apis.tags import format_api
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = format_api.FormatApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.post_json_pointer_format_response_body_for_content_types()
        pprint(api_response)
    except unit_test_api.ApiException as e:
        print("Exception when calling FormatApi->post_json_pointer_format_response_body_for_content_types: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#post_json_pointer_format_response_body_for_content_types.ApiResponseFor200) | success

#### post_json_pointer_format_response_body_for_content_types.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[application/json, ] |  |
headers | Unset | headers were not defined |

# application/json
Type | Description  | Notes
------------- | ------------- | -------------
[**JsonPointerFormat**](../../models/JsonPointerFormat.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_uri_format_request_body**
<a name="post_uri_format_request_body"></a>
> post_uri_format_request_body(body)



### Example

```python
import unit_test_api
from unit_test_api.apis.tags import format_api
from unit_test_api.model.uri_format import UriFormat
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = format_api.FormatApi(api_client)

    # example passing only required values which don't have defaults set
    body = UriFormat(None)
    try:
        api_response = api_instance.post_uri_format_request_body(
            body=body,
        )
    except unit_test_api.ApiException as e:
        print("Exception when calling FormatApi->post_uri_format_request_body: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[application/json] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# application/json
Type | Description  | Notes
------------- | ------------- | -------------
[**UriFormat**](../../models/UriFormat.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#post_uri_format_request_body.ApiResponseFor200) | success

#### post_uri_format_request_body.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_uri_format_response_body_for_content_types**
<a name="post_uri_format_response_body_for_content_types"></a>
> UriFormat post_uri_format_response_body_for_content_types()



### Example

```python
import unit_test_api
from unit_test_api.apis.tags import format_api
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = format_api.FormatApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.post_uri_format_response_body_for_content_types()
        pprint(api_response)
    except unit_test_api.ApiException as e:
        print("Exception when calling FormatApi->post_uri_format_response_body_for_content_types: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#post_uri_format_response_body_for_content_types.ApiResponseFor200) | success

#### post_uri_format_response_body_for_content_types.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[application/json, ] |  |
headers | Unset | headers were not defined |

# application/json
Type | Description  | Notes
------------- | ------------- | -------------
[**UriFormat**](../../models/UriFormat.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_uri_reference_format_request_body**
<a name="post_uri_reference_format_request_body"></a>
> post_uri_reference_format_request_body(body)



### Example

```python
import unit_test_api
from unit_test_api.apis.tags import format_api
from unit_test_api.model.uri_reference_format import UriReferenceFormat
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = format_api.FormatApi(api_client)

    # example passing only required values which don't have defaults set
    body = UriReferenceFormat(None)
    try:
        api_response = api_instance.post_uri_reference_format_request_body(
            body=body,
        )
    except unit_test_api.ApiException as e:
        print("Exception when calling FormatApi->post_uri_reference_format_request_body: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[application/json] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# application/json
Type | Description  | Notes
------------- | ------------- | -------------
[**UriReferenceFormat**](../../models/UriReferenceFormat.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#post_uri_reference_format_request_body.ApiResponseFor200) | success

#### post_uri_reference_format_request_body.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_uri_reference_format_response_body_for_content_types**
<a name="post_uri_reference_format_response_body_for_content_types"></a>
> UriReferenceFormat post_uri_reference_format_response_body_for_content_types()



### Example

```python
import unit_test_api
from unit_test_api.apis.tags import format_api
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = format_api.FormatApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.post_uri_reference_format_response_body_for_content_types()
        pprint(api_response)
    except unit_test_api.ApiException as e:
        print("Exception when calling FormatApi->post_uri_reference_format_response_body_for_content_types: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#post_uri_reference_format_response_body_for_content_types.ApiResponseFor200) | success

#### post_uri_reference_format_response_body_for_content_types.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[application/json, ] |  |
headers | Unset | headers were not defined |

# application/json
Type | Description  | Notes
------------- | ------------- | -------------
[**UriReferenceFormat**](../../models/UriReferenceFormat.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_uri_template_format_request_body**
<a name="post_uri_template_format_request_body"></a>
> post_uri_template_format_request_body(body)



### Example

```python
import unit_test_api
from unit_test_api.apis.tags import format_api
from unit_test_api.model.uri_template_format import UriTemplateFormat
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = format_api.FormatApi(api_client)

    # example passing only required values which don't have defaults set
    body = UriTemplateFormat(None)
    try:
        api_response = api_instance.post_uri_template_format_request_body(
            body=body,
        )
    except unit_test_api.ApiException as e:
        print("Exception when calling FormatApi->post_uri_template_format_request_body: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[application/json] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# application/json
Type | Description  | Notes
------------- | ------------- | -------------
[**UriTemplateFormat**](../../models/UriTemplateFormat.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#post_uri_template_format_request_body.ApiResponseFor200) | success

#### post_uri_template_format_request_body.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **post_uri_template_format_response_body_for_content_types**
<a name="post_uri_template_format_response_body_for_content_types"></a>
> UriTemplateFormat post_uri_template_format_response_body_for_content_types()



### Example

```python
import unit_test_api
from unit_test_api.apis.tags import format_api
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = format_api.FormatApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.post_uri_template_format_response_body_for_content_types()
        pprint(api_response)
    except unit_test_api.ApiException as e:
        print("Exception when calling FormatApi->post_uri_template_format_response_body_for_content_types: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#post_uri_template_format_response_body_for_content_types.ApiResponseFor200) | success

#### post_uri_template_format_response_body_for_content_types.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[application/json, ] |  |
headers | Unset | headers were not defined |

# application/json
Type | Description  | Notes
------------- | ------------- | -------------
[**UriTemplateFormat**](../../models/UriTemplateFormat.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)


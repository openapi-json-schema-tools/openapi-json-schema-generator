<a name="__pageTop"></a>
# this_package.apis.tags.default_api.DefaultApi

All URIs are relative to *http://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**post_operators**](#post_operators) | **post** /operators | 

# **post_operators**
<a name="post_operators"></a>


### Example

```python
import this_package
from this_package.apis.tags import default_api
from this_package.components.schema import operator
from pprint import pprint
# Defining the host is optional and defaults to http://localhost:3000
# See configuration.py for a list of all supported configuration parameters.
configuration = this_package.Configuration(
    host = "http://localhost:3000"
)

# Enter a context with an instance of the API client
with this_package.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = default_api.DefaultApi(api_client)

    # example passing only optional values
    body = operator.Operator(
        a=3.14,
        b=3.14,
        operator_id="ADD",
    )
    try:
        api_response = api_instance.post_operators(
            body=body,
        )
    except this_package.ApiException as e:
        print("Exception when calling DefaultApi->post_operators: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#post_operators.request_body) | typing.Union[[request_body.application_json](#post_operators.request_body.application_json), Unset] | optional, default is unset |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="post_operators.request_body" >body</a>

# <a id="post_operators.request_body.application_json" >request_body.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**Operator**](../../components/schema/operator.Operator.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#post_operators.response_for_200.ApiResponse) | OK

#### <a id="post_operators.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)


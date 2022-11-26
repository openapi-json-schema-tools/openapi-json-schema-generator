# **ref_object_in_query**
<a name="ref_object_in_query"></a>

user list

### Example

```python
import petstore_api
from petstore_api..tags import 
from pprint import pprint
# Defining the host is optional and defaults to 
# See configuration.py for a list of all supported configuration parameters.
configuration = petstore_api.Configuration(
    host = ""
)

# Enter a context with an instance of the API client
with petstore_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = .(api_client)

    # example passing only optional values
    query_params = {
        'mapBean': foo.Foo(
        bar=bar.Bar("bar"),
    ),
    }
    try:
        # user list
        api_response = api_instance.ref_object_in_query(
            query_params=query_params,
        )
    except petstore_api.ApiException as e:
        print("Exception when calling ->ref_object_in_query: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[query_params](#ref_object_in_query.RequestQueryParameters) | [RequestQueryParameters.Params](#ref_object_in_query.RequestQueryParameters.Params) | |
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="ref_object_in_query.RequestQueryParameters" >query_params</a>
#### <a id="ref_object_in_query.RequestQueryParameters.Params" >RequestQueryParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
mapBean | [parameter_0.schema](#ref_object_in_query.parameter_0.schema) | | optional


# <a id="ref_object_in_query.parameter_0.schema" >parameter_0.schema</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**Foo**](../../components/schema/foo.Foo.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#ref_object_in_query.response_for_200.ApiResponse) | ok

#### <a id="ref_object_in_query.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)


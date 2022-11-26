# **boolean**
<a name="boolean"></a>


Test serialization of outer boolean types

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
    body = boolean.Boolean(True)
    try:
        api_response = api_instance.boolean(
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling ->boolean: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#boolean.request_body) | typing.Union[[request_body.application_json](#boolean.request_body.application_json), Unset] | optional, default is unset |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="boolean.request_body" >body</a>
# <a id="boolean.request_body.application_json" >request_body.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**Boolean**](../../components/schema/boolean.Boolean.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#boolean.response_for_200.ApiResponse) | Output boolean

#### <a id="boolean.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.application_json](#boolean.response_for_200.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="boolean.response_for_200.application_json" >response_for_200.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**Boolean**](../../components/schema/boolean.Boolean.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)


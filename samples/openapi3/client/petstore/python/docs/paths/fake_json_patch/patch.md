# **json_patch**
<a name="json_patch"></a>

json patch

json patch route with a requestBody

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
    body = json_patch_request.JSONPatchRequest([
        None
    ])
    try:
        # json patch
        api_response = api_instance.json_patch(
            body=body,
        )
    except petstore_api.ApiException as e:
        print("Exception when calling ->json_patch: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#json_patch.request_body) | typing.Union[[request_body.application_json_patchjson](#json_patch.request_body.application_json_patchjson), Unset] | optional, default is unset |
content_type | str | optional, default is 'application/json-patch+json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="json_patch.request_body" >body</a>
# <a id="json_patch.request_body.application_json_patchjson" >request_body.application_json_patchjson</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**JSONPatchRequest**](../../components/schema/json_patch_request.JSONPatchRequest.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#json_patch.response_for_200.ApiResponse) | OK

#### <a id="json_patch.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)


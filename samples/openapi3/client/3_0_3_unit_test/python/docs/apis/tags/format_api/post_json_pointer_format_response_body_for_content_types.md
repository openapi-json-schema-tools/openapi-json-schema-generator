<a name="top"></a>
# **post_json_pointer_format_response_body_for_content_types**
<a name="post_json_pointer_format_response_body_for_content_types"></a>


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
200 | [response_for_200.ApiResponse](#response_for_200.ApiResponse) | success

#### <a id="response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.application_json](#response_for_200.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="response_for_200.application_json" >response_for_200.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**JsonPointerFormat**](../../../components/schema/json_pointer_format.JsonPointerFormat.md) |  | 


### Authorization

No authorization required

[[Back to top]](#top) [[Back to API]](../FormatApi.md) [[Back to API list]](../../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../../README.md#documentation-for-models) [[Back to README]](../../../../README.md)


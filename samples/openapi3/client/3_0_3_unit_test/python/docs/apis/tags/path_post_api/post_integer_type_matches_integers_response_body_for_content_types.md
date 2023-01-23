<a name="top"></a>
# **post_integer_type_matches_integers_response_body_for_content_types**
<a name="post_integer_type_matches_integers_response_body_for_content_types"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import path_post_api
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = path_post_api.PathPostApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.post_integer_type_matches_integers_response_body_for_content_types()
        pprint(api_response)
    except unit_test_api.ApiException as e:
        print("Exception when calling PathPostApi->post_integer_type_matches_integers_response_body_for_content_types: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [_200.response_cls](#response_200response_cls) | success

#### <a id="response_200response_cls" >_200.response_cls</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[_200.content.application_json.schema](#response_200contentapplication_jsonschema), ] |  |
headers | Unset | headers were not defined |

# <a id="response_200contentapplication_jsonschema" >_200.content.application_json.schema</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**IntegerTypeMatchesIntegers**](../../../components/schema/integer_type_matches_integers.IntegerTypeMatchesIntegers.md) |  | 


### Authorization

No authorization required

[[Back to top]](#top) [[Back to API]](../PathPostApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)

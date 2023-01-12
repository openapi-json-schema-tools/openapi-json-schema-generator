<a name="top"></a>
# **post_allof_with_the_first_empty_schema_response_body_for_content_types**
<a name="post_allof_with_the_first_empty_schema_response_body_for_content_types"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import response_content_content_type_schema_api
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = response_content_content_type_schema_api.ResponseContentContentTypeSchemaApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.post_allof_with_the_first_empty_schema_response_body_for_content_types()
        pprint(api_response)
    except unit_test_api.ApiException as e:
        print("Exception when calling ResponseContentContentTypeSchemaApi->post_allof_with_the_first_empty_schema_response_body_for_content_types: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_200.ApiResponse](#response_200ApiResponse) | success

#### <a id="response_200ApiResponse" >response_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[_200.content.application_json.schema](#response_200contentapplication_jsonschema), ] |  |
headers | Unset | headers were not defined |

# <a id="response_200contentapplication_jsonschema" >_200.content.application_json.schema</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**AllofWithTheFirstEmptySchema**](../../../components/schema/allof_with_the_first_empty_schema.AllofWithTheFirstEmptySchema.md) |  | 


### Authorization

No authorization required

[[Back to top]](#top) [[Back to API]](../ResponseContentContentTypeSchemaApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)

<a name="top"></a>
# **body_with_file_schema**
<a name="body_with_file_schema"></a>


For this test, the body for this request much reference a schema named `File`.

### Example

```python
import petstore_api
from petstore_api.apis.tags import fake_api
from pprint import pprint
# Defining the host is optional and defaults to http://petstore.swagger.io:80/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = petstore_api.Configuration(
    host = "http://petstore.swagger.io:80/v2"
)

# Enter a context with an instance of the API client
with petstore_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fake_api.FakeApi(api_client)

    # example passing only required values which don't have defaults set
    body = file_schema_test_class.FileSchemaTestClass(
        file=file.File(
            source_uri="source_uri_example",
        ),
        files=[
            file.File()
        ],
    )
    try:
        api_response = api_instance.body_with_file_schema(
            body=body,
        )
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->body_with_file_schema: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#request_body) | typing.Union[[request_body.application_json](#request_body.application_json)] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="request_body" >body</a>
# <a id="request_body.application_json" >request_body.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**FileSchemaTestClass**](../../components/schema/file_schema_test_class.FileSchemaTestClass.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
 | [response_for_.ApiResponse](#response_for_.ApiResponse) | Success

#### <a id="response_for_.ApiResponse" >response_for_.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#top) [[Back to API]](../FakeApi.md) [[Back to API list]](../../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../../README.md#documentation-for-models) [[Back to README]](../../../../README.md)


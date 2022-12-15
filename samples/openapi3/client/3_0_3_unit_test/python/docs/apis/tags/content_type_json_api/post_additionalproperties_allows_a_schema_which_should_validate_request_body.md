<a name="top"></a>
# **post_additionalproperties_allows_a_schema_which_should_validate_request_body**
<a name="post_additionalproperties_allows_a_schema_which_should_validate_request_body"></a>


### Example

```python
import unit_test_api
from unit_test_api.apis.tags import content_type_json_api
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = content_type_json_api.ContentTypeJsonApi(api_client)

    # example passing only required values which don't have defaults set
    body = additionalproperties_allows_a_schema_which_should_validate.AdditionalpropertiesAllowsASchemaWhichShouldValidate(
        foo=None,
        bar=None,
    )
    try:
        api_response = api_instance.post_additionalproperties_allows_a_schema_which_should_validate_request_body(
            body=body,
        )
        pprint(api_response)
    except unit_test_api.ApiException as e:
        print("Exception when calling ContentTypeJsonApi->post_additionalproperties_allows_a_schema_which_should_validate_request_body: %s\n" % e)
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
[**additionalproperties_allows_a_schema_which_should_validate.AdditionalpropertiesAllowsASchemaWhichShouldValidate**](../../../components/schema/additionalproperties_allows_a_schema_which_should_validate.AdditionalpropertiesAllowsASchemaWhichShouldValidate.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#response_for_200.ApiResponse) | success

#### <a id="response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#top) [[Back to API]](../ContentTypeJsonApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)

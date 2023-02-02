<a name="top"></a>
# **post_enum_with0_does_not_match_false_request_body**
<a name="post_enum_with0_does_not_match_false_request_body"></a>


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
    body = enum_with0_does_not_match_false.EnumWith0DoesNotMatchFalse(0)
    try:
        api_response = api_instance.post_enum_with0_does_not_match_false_request_body(
            body=body,
        )
        pprint(api_response)
    except unit_test_api.ApiException as e:
        print("Exception when calling ContentTypeJsonApi->post_enum_with0_does_not_match_false_request_body: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#request_body) | typing.Union[[RequestBody.content.application_json.schema](#request_bodycontentapplication_jsonschema)] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="request_body" >body</a>
# <a id="request_body_request_bodycontentapplication_jsonschema" >RequestBody.content.application_json.schema</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**EnumWith0DoesNotMatchFalse**](../../../components/schema/enum_with0_does_not_match_false.EnumWith0DoesNotMatchFalse.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [_200.response_cls](#response_200response_cls) | success

#### <a id="response_200response_cls" >_200.response_cls</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#top) [[Back to API]](../ContentTypeJsonApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)

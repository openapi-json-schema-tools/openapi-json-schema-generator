<a name="top"></a>
# **classname**
<a name="classname"></a>

To test class name in snake case

To test class name in snake case

### Example

* Api Key Authentication (api_key_query):
```python
import petstore_api
from petstore_api.apis.tags import fake_classname_tags123_api
from pprint import pprint
# Defining the host is optional and defaults to http://petstore.swagger.io:80/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = petstore_api.Configuration(
    host = "http://petstore.swagger.io:80/v2"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: api_key_query
configuration.api_key['api_key_query'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api_key_query'] = 'Bearer'
# Enter a context with an instance of the API client
with petstore_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fake_classname_tags123_api.FakeClassnameTags123Api(api_client)

    # example passing only required values which don't have defaults set
    body = client.Client(
        client="client_example",
    )
    try:
        # To test class name in snake case
        api_response = api_instance.classname(
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeClassnameTags123Api->classname: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[**body**](../../../components/request_bodies/request_body_client.md) | typing.Union[[request_body.content.application_json.schema](../../../components/request_bodies/request_body_client.md#content.application_json.schema)] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#response_for_200.ApiResponse) | successful operation

#### <a id="response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.content.schema](#response_for_200.content.schema), ] |  |
headers | Unset | headers were not defined |

# <a id="response_for_200.content.schema" >response_for_200.content.schema</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**Client**](../../../components/schema/client.Client.md) |  | 


### Authorization

[api_key_query](../../../../README.md#api_key_query)

[[Back to top]](#top) [[Back to API]](../FakeClassnameTags123Api.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)

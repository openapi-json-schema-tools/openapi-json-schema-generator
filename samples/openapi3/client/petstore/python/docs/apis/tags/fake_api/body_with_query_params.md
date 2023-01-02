<a name="top"></a>
# **body_with_query_params**
<a name="body_with_query_params"></a>


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
    query_params = {
        'query': "query_example",
    }
    body = user.User(
        id=1,
        username="username_example",
        first_name="first_name_example",
        last_name="last_name_example",
        email="email_example",
        password="password_example",
        phone="phone_example",
        user_status=1,
        object_with_no_declared_props=dict(),
        object_with_no_declared_props_nullable=dict(),
        any_type_prop=None,
        any_type_except_null_prop=None,
        any_type_prop_nullable=None,
    )
    try:
        api_response = api_instance.body_with_query_params(
            query_params=query_params,
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->body_with_query_params: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#request_body) | typing.Union[[request_body.application_json](#request_body.application_json)] | required |
[query_params](#.RequestQueryParameters) | [RequestQueryParameters.Params](#RequestQueryParameters.Params) | |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="request_body" >body</a>
# <a id="request_body.application_json" >request_body.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**User**](../../../components/schema/user.User.md) |  | 


### <a id="RequestQueryParameters" >query_params</a>
#### <a id="RequestQueryParameters.Params" >RequestQueryParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
query | [parameter_0.schema](#parameter_0.schema) | | 


# parameter_0.schema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_success_description_only.ApiResponse](../../../components/responses/response_success_description_only.md) | 

### Authorization

No authorization required

[[Back to top]](#top) [[Back to API]](../FakeApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)

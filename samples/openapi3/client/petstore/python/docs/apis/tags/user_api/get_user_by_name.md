<a name="top"></a>
# **get_user_by_name**
<a name="get_user_by_name"></a>

Get user by user name

### Example

```python
import petstore_api
from petstore_api.apis.tags import user_api
from pprint import pprint
# Defining the host is optional and defaults to http://petstore.swagger.io:80/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = petstore_api.Configuration(
    host = "http://petstore.swagger.io:80/v2"
)

# Enter a context with an instance of the API client
with petstore_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = user_api.UserApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'username': "username_example",
    }
    try:
        # Get user by user name
        api_response = api_instance.get_user_by_name(
            path_params=path_params,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling UserApi->get_user_by_name: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[path_params](#requestpathparameters) | [RequestPathParameters.Params](#RequestPathParametersParams) | |
accept_content_types | typing.Tuple[str] | default is ("application/json", "application/xml", ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="requestpathparameters" >path_params</a>
#### <a id="RequestPathParametersParams" >RequestPathParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
username | [PathUserName](../../../components/parameters/parameter_path_user_name.md) | | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [_200.response_cls](#response_200response_cls) | successful operation
400 | [_400.response_cls](#response_400response_cls) | Invalid username supplied
404 | [_404.response_cls](#response_404response_cls) | User not found

#### <a id="response_200response_cls" >_200.response_cls</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[_200.content.application_xml.schema](#response_200contentapplication_xmlschema), [_200.content.application_json.schema](#response_200contentapplication_jsonschema), ] |  |
headers | Unset | headers were not defined |

# <a id="response_200contentapplication_xmlschema" >_200.content.application_xml.schema</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**User**](../../../components/schema/user.User.md) |  | 


# <a id="response_200contentapplication_jsonschema" >_200.content.application_json.schema</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**User**](../../../components/schema/user.User.md) |  | 


#### <a id="response_400response_cls" >_400.response_cls</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

#### <a id="response_404response_cls" >_404.response_cls</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#top) [[Back to API]](../UserApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)

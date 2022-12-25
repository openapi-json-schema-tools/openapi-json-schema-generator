<a name="top"></a>
# **upload_file_with_required_file**
<a name="upload_file_with_required_file"></a>

uploads an image (required)

### Example

* OAuth Authentication (petstore_auth):
```python
import petstore_api
from petstore_api.apis.tags import pet_api
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

# Configure OAuth2 access token for authorization: petstore_auth
configuration = petstore_api.Configuration(
    host = "http://petstore.swagger.io:80/v2",
    access_token = 'YOUR_ACCESS_TOKEN'
)
# Enter a context with an instance of the API client
with petstore_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pet_api.PetApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'petId': 1,
    }
    try:
        # uploads an image (required)
        api_response = api_instance.upload_file_with_required_file(
            path_params=path_params,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling PetApi->upload_file_with_required_file: %s\n" % e)

    # example passing only optional values
    path_params = {
        'petId': 1,
    }
    body = dict(
        additional_metadata="additional_metadata_example",
        required_file=open('/path/to/file', 'rb'),
    )
    try:
        # uploads an image (required)
        api_response = api_instance.upload_file_with_required_file(
            path_params=path_params,
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling PetApi->upload_file_with_required_file: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#request_body) | typing.Union[[request_body.multipart_form_data](#request_body.multipart_form_data), Unset] | optional, default is unset |
[path_params](#RequestPathParameters) | [RequestPathParameters.Params](#RequestPathParameters.Params) | |
content_type | str | optional, default is 'multipart/form-data' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="request_body" >body</a>
# <a id="request_body.multipart_form_data" >request_body.multipart_form_data</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**requiredFile** | bytes, io.FileIO, io.BufferedReader,  | bytes, FileIO,  | file to upload |
**additionalMetadata** | str,  | str,  | Additional data to pass to server | [optional]
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

### <a id="RequestPathParameters" >path_params</a>
#### <a id="RequestPathParameters.Params" >RequestPathParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
petId | [parameter_0.schema](#parameter_0.schema) | | 

# parameter_0.schema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 64 bit integer

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#response_for_200.ApiResponse) | successful operation

#### <a id="response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.application_json](#response_for_200.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="response_for_200.application_json" >response_for_200.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponse**](../../../components/schema/api_response.ApiResponse.md) |  | 


### Authorization

[petstore_auth](../../../../README.md#petstore_auth)

[[Back to top]](#top) [[Back to API]](../PetApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)
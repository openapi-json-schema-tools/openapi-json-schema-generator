# **endpoint_parameters**
<a name="endpoint_parameters"></a>

Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 

Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 

### Example

* Basic Authentication (http_basic_test):
```python
import petstore_api
from petstore_api..tags import 
from pprint import pprint
# Defining the host is optional and defaults to 
# See configuration.py for a list of all supported configuration parameters.
configuration = petstore_api.Configuration(
    host = ""
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: http_basic_test
configuration = petstore_api.Configuration(
    username = 'YOUR_USERNAME',
    password = 'YOUR_PASSWORD'
)
# Enter a context with an instance of the API client
with petstore_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = .(api_client)

    # example passing only optional values
    body = dict(
        integer=10,
        int32=20,
        int64=1,
        number=32.1,
        _float=3.14,
        double=67.8,
        string="a",
        pattern_without_delimiter="AUR,rZ#UM/?R,Fp^l6$ARjbhJk C>",
        byte='YQ==',
        binary=open('/path/to/file', 'rb'),
        date="1970-01-01",
        date_time="2020-02-02T20:20:20.222220Z",
        password="password_example",
        callback="callback_example",
    )
    try:
        # Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
        api_response = api_instance.endpoint_parameters(
            body=body,
        )
    except petstore_api.ApiException as e:
        print("Exception when calling ->endpoint_parameters: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#endpoint_parameters.request_body) | typing.Union[[request_body.application_x_www_form_urlencoded](#endpoint_parameters.request_body.application_x_www_form_urlencoded), Unset] | optional, default is unset |
content_type | str | optional, default is 'application/x-www-form-urlencoded' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="endpoint_parameters.request_body" >body</a>
# <a id="endpoint_parameters.request_body.application_x_www_form_urlencoded" >request_body.application_x_www_form_urlencoded</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**number** | decimal.Decimal, int, float,  | decimal.Decimal,  | None | 
**pattern_without_delimiter** | str,  | str,  | None | 
**byte** | str,  | str,  | None | 
**double** | decimal.Decimal, int, float,  | decimal.Decimal,  | None | value must be a 64 bit float
**integer** | decimal.Decimal, int,  | decimal.Decimal,  | None | [optional] 
**int32** | decimal.Decimal, int,  | decimal.Decimal,  | None | [optional] value must be a 32 bit integer
**int64** | decimal.Decimal, int,  | decimal.Decimal,  | None | [optional] value must be a 64 bit integer
**float** | decimal.Decimal, int, float,  | decimal.Decimal,  | None | [optional] value must be a 32 bit float
**string** | str,  | str,  | None | [optional] 
**binary** | bytes, io.FileIO, io.BufferedReader,  | bytes, FileIO,  | None | [optional] 
**date** | str, date,  | str,  | None | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD
**dateTime** | str, datetime,  | str,  | None | [optional] if omitted the server will use the default value of 2010-02-01T10:20:10.11111+01:00value must conform to RFC-3339 date-time
**password** | str,  | str,  | None | [optional] 
**callback** | str,  | str,  | None | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#endpoint_parameters.response_for_200.ApiResponse) | Success
404 | [response_for_404.ApiResponse](#endpoint_parameters.response_for_404.ApiResponse) | User not found

#### <a id="endpoint_parameters.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

#### <a id="endpoint_parameters.response_for_404.ApiResponse" >response_for_404.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

[http_basic_test](../../../README.md#http_basic_test)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)


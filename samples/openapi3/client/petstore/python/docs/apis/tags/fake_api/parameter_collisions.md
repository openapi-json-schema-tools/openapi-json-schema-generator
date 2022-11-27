# **parameter_collisions**
<a name="parameter_collisions"></a>

parameter collision case

### Example

```python
import petstore_api
from petstore_api.apis.tags import fake_api
from pprint import pprint
# Defining the host is optional and defaults to 
# See configuration.py for a list of all supported configuration parameters.
configuration = petstore_api.Configuration(
    host = ""
)

# Enter a context with an instance of the API client
with petstore_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fake_api.SomeApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        '1': "1_example",
        'aB': "aB_example",
        'Ab': "Ab_example",
        'self': "self_example",
        'A-B': "A-B_example",
    }
    query_params = {
    }
    cookie_params = {
    }
    header_params = {
    }
    try:
        # parameter collision case
        api_response = api_instance.parameter_collisions(
            path_params=path_params,
            query_params=query_params,
            header_params=header_params,
            cookie_params=cookie_params,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling SomeApi->parameter_collisions: %s\n" % e)

    # example passing only optional values
    path_params = {
        '1': "1_example",
        'aB': "aB_example",
        'Ab': "Ab_example",
        'self': "self_example",
        'A-B': "A-B_example",
    }
    query_params = {
        '1': "1_example",
        'aB': "aB_example",
        'Ab': "Ab_example",
        'self': "self_example",
        'A-B': "A-B_example",
    }
    cookie_params = {
        '1': "1_example",
        'aB': "aB_example",
        'Ab': "Ab_example",
        'self': "self_example",
        'A-B': "A-B_example",
    }
    header_params = {
        '1': "1_example",
        'aB': "aB_example",
        'self': "self_example",
        'A-B': "A-B_example",
    }
    body = None
    try:
        # parameter collision case
        api_response = api_instance.parameter_collisions(
            path_params=path_params,
            query_params=query_params,
            header_params=header_params,
            cookie_params=cookie_params,
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling SomeApi->parameter_collisions: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#parameter_collisions.request_body) | typing.Union[[request_body.application_json](#parameter_collisions.request_body.application_json), Unset] | optional, default is unset |
[query_params](#parameter_collisions.RequestQueryParameters) | [RequestQueryParameters.Params](#parameter_collisions.RequestQueryParameters.Params) | |
[header_params](#parameter_collisions.RequestHeaderParameters) | [RequestHeaderParameters.Params](#parameter_collisions.RequestHeaderParameters.Params) | |
[path_params](#parameter_collisions.RequestPathParameters) | [RequestPathParameters.Params](#parameter_collisions.RequestPathParameters.Params) | |
[cookie_params](#parameter_collisions.RequestCookieParameters) | [RequestCookieParameters.Params](#parameter_collisions.RequestCookieParameters.Params) | |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="parameter_collisions.request_body" >body</a>
# <a id="parameter_collisions.request_body.application_json" >request_body.application_json</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

### <a id="parameter_collisions.RequestQueryParameters" >query_params</a>
#### <a id="parameter_collisions.RequestQueryParameters.Params" >RequestQueryParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
1 | [parameter_0.schema](#parameter_collisions.parameter_0.schema) | | optional
aB | [parameter_1.schema](#parameter_collisions.parameter_1.schema) | | optional
Ab | [parameter_2.schema](#parameter_collisions.parameter_2.schema) | | optional
self | [parameter_3.schema](#parameter_collisions.parameter_3.schema) | | optional
A-B | [parameter_4.schema](#parameter_collisions.parameter_4.schema) | | optional


# <a id="parameter_collisions.parameter_0.schema" >parameter_0.schema</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# <a id="parameter_collisions.parameter_1.schema" >parameter_1.schema</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# <a id="parameter_collisions.parameter_2.schema" >parameter_2.schema</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# <a id="parameter_collisions.parameter_3.schema" >parameter_3.schema</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# <a id="parameter_collisions.parameter_4.schema" >parameter_4.schema</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### <a id="parameter_collisions.RequestHeaderParameters" >header_params</a>
#### <a id="parameter_collisions.RequestHeaderParameters.Params" >RequestHeaderParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
1 | [parameter_5.schema](#parameter_collisions.parameter_5.schema) | | optional
aB | [parameter_6.schema](#parameter_collisions.parameter_6.schema) | | optional
self | [parameter_7.schema](#parameter_collisions.parameter_7.schema) | | optional
A-B | [parameter_8.schema](#parameter_collisions.parameter_8.schema) | | optional

# <a id="parameter_collisions.parameter_5.schema" >parameter_5.schema</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# <a id="parameter_collisions.parameter_6.schema" >parameter_6.schema</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# <a id="parameter_collisions.parameter_7.schema" >parameter_7.schema</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# <a id="parameter_collisions.parameter_8.schema" >parameter_8.schema</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### <a id="parameter_collisions.RequestPathParameters" >path_params</a>
#### <a id="parameter_collisions.RequestPathParameters.Params" >RequestPathParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
1 | [parameter_9.schema](#parameter_collisions.parameter_9.schema) | | 
aB | [parameter_10.schema](#parameter_collisions.parameter_10.schema) | | 
Ab | [parameter_11.schema](#parameter_collisions.parameter_11.schema) | | 
self | [parameter_12.schema](#parameter_collisions.parameter_12.schema) | | 
A-B | [parameter_13.schema](#parameter_collisions.parameter_13.schema) | | 

# <a id="parameter_collisions.parameter_9.schema" >parameter_9.schema</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# <a id="parameter_collisions.parameter_10.schema" >parameter_10.schema</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# <a id="parameter_collisions.parameter_11.schema" >parameter_11.schema</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# <a id="parameter_collisions.parameter_12.schema" >parameter_12.schema</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# <a id="parameter_collisions.parameter_13.schema" >parameter_13.schema</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### <a id="parameter_collisions.RequestCookieParameters" >cookie_params</a>
#### <a id="parameter_collisions.RequestCookieParameters.Params" >RequestCookieParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
1 | [parameter_14.schema](#parameter_collisions.parameter_14.schema) | | optional
aB | [parameter_15.schema](#parameter_collisions.parameter_15.schema) | | optional
Ab | [parameter_16.schema](#parameter_collisions.parameter_16.schema) | | optional
self | [parameter_17.schema](#parameter_collisions.parameter_17.schema) | | optional
A-B | [parameter_18.schema](#parameter_collisions.parameter_18.schema) | | optional

# <a id="parameter_collisions.parameter_14.schema" >parameter_14.schema</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# <a id="parameter_collisions.parameter_15.schema" >parameter_15.schema</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# <a id="parameter_collisions.parameter_16.schema" >parameter_16.schema</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# <a id="parameter_collisions.parameter_17.schema" >parameter_17.schema</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# <a id="parameter_collisions.parameter_18.schema" >parameter_18.schema</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#parameter_collisions.response_for_200.ApiResponse) | success

#### <a id="parameter_collisions.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.application_json](#parameter_collisions.response_for_200.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="parameter_collisions.response_for_200.application_json" >response_for_200.application_json</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)


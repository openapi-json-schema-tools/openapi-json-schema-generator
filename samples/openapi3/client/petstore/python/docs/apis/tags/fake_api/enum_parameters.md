<a name="top"></a>
# **enum_parameters**
<a name="enum_parameters"></a>

To test enum parameters

To test enum parameters

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

    # example passing only optional values
    query_params = {
        'enum_query_string_array': [
        "$"
    ],
        'enum_query_string': "-efg",
        'enum_query_integer': 1,
        'enum_query_double': 1.1,
    }
    header_params = {
        'enum_header_string_array': [
        "$"
    ],
        'enum_header_string': "-efg",
    }
    body = dict(
        enum_form_string_array=[
            "$"
        ],
        enum_form_string="-efg",
    )
    try:
        # To test enum parameters
        api_response = api_instance.enum_parameters(
            query_params=query_params,
            header_params=header_params,
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->enum_parameters: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#request_body) | typing.Union[[RequestBody.content.application_x_www_form_urlencoded.schema](#request_bodycontentapplication_x_www_form_urlencodedschema), Unset] | optional, default is unset |
[query_params](#requestqueryparameters) | [RequestQueryParameters.Params](#RequestQueryParametersParams) | |
[header_params](#requestheaderparameters) | [RequestHeaderParameters.Params](#RequestHeaderParametersParams) | |
content_type | str | optional, default is 'application/x-www-form-urlencoded' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="request_body" >body</a>
## RequestBody
# <a id="request_body_request_bodycontentapplication_x_www_form_urlencodedschema" >RequestBody.content.application_x_www_form_urlencoded.schema</a>

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**enum_form_string_array** | [list, tuple, ](#enum_form_string_array) | [tuple, ](#enum_form_string_array) | Form parameter enum test (string array) | [optional]
**enum_form_string** | str,  | str,  | Form parameter enum test (string) | [optional] must be one of ["_abc", "-efg", "(xyz)", ] if omitted the server will use the default value of "-efg"
**any_string_name** | dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | frozendict.frozendict, tuple, decimal.Decimal, str, bytes, BoolClass, NoneClass, FileIO | any string name can be used but the value must be the correct type | [optional]

# enum_form_string_array

Form parameter enum test (string array)

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | Form parameter enum test (string array) |

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | must be one of [">", "$", ] if omitted the server will use the default value of "$"

### <a id="requestqueryparameters" >query_params</a>
#### <a id="RequestQueryParametersParams" >RequestQueryParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
enum_query_string_array | [parameter_2.schema](#parameter_2schema) | | optional
enum_query_string | [parameter_3.schema](#parameter_3schema) | | optional
enum_query_integer | [parameter_4.schema](#parameter_4schema) | | optional
enum_query_double | [parameter_5.schema](#parameter_5schema) | | optional


# <a id="parameter_2schema" >_2.schema</a>

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  |

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | must be one of [">", "$", ] if omitted the server will use the default value of "$"

# <a id="parameter_3schema" >_3.schema</a>

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | must be one of ["_abc", "-efg", "(xyz)", ] if omitted the server will use the default value of "-efg"

# <a id="parameter_4schema" >_4.schema</a>

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | must be one of [1, -2, ] value must be a 32 bit integer

# <a id="parameter_5schema" >_5.schema</a>

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int, float,  | decimal.Decimal,  |  | must be one of [1.1, -1.2, ] value must be a 64 bit float

### <a id="requestheaderparameters" >header_params</a>
#### <a id="RequestHeaderParametersParams" >RequestHeaderParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
enum_header_string_array | [parameter_0.schema](#parameter_0schema) | | optional
enum_header_string | [parameter_1.schema](#parameter_1schema) | | optional

# <a id="parameter_0schema" >_0.schema</a>

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  |

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | must be one of [">", "$", ] if omitted the server will use the default value of "$"

# <a id="parameter_1schema" >_1.schema</a>

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | must be one of ["_abc", "-efg", "(xyz)", ] if omitted the server will use the default value of "-efg"

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [SuccessDescriptionOnly.response_cls](../../../components/responses/response_success_description_only.md#response_success_description_onlyresponse_cls) | Success
404 | [_404.response_cls](#response_404response_cls) | Not found

#### <a id="response_404response_cls" >_404.response_cls</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[_404.content.application_json.schema](#response_404contentapplication_jsonschema), ] |  |
headers | Unset | headers were not defined |

# <a id="response_404contentapplication_jsonschema" >_404.content.application_json.schema</a>

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

### Authorization

No authorization required

[[Back to top]](#top) [[Back to API]](../FakeApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)

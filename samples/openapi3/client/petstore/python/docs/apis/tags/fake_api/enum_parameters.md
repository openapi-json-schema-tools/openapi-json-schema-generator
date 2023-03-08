<a name="enumparameters"></a>
# **enum_parameters**

## Table of Contents
- [General Info](#general-info)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Code Sample](#code-sample)

## General Info
| Field | Value |
| ----- | ----- |
| Summary | To test enum parameters |
| Description | To test enum parameters |
| Path | "/fake" |
| HTTP Method | get |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#requestbody) | typing.Union[[RequestBody.content.application_x_www_form_urlencoded.schema](#request_body_request_bodycontentapplication_x_www_form_urlencodedschema), Unset] | optional, default is unset |
[query_params](#query_params) | [RequestQueryParameters.Params](#requestqueryparametersparams) | |
[header_params](#header_params) | [RequestHeaderParameters.Params](#requestheaderparametersparams) | |
content_type | str | optional, default is 'application/x-www-form-urlencoded' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ("application/json", ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### RequestBody

#### Content Type To Schema
Content-Type | Schema
------------ | -------
"application/x-www-form-urlencoded" | [content.application_x_www_form_urlencoded.Schema](#requestbody-content-applicationxwwwformurlencoded-schema)

#### RequestBody content ApplicationXWwwFormUrlencoded Schema

##### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

##### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**enum_form_string_array** | list, tuple,  | tuple, [properties.EnumFormStringArray](#requestbody-content-applicationxwwwformurlencoded-schema-properties-enumformstringarray) | Form parameter enum test (string array) | [optional]
**enum_form_string** | str,  | str,  | Form parameter enum test (string) | [optional] must be one of ["_abc", "-efg", "(xyz)", ] if omitted the server will use the default value of -efg
**any_string_name** | dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | frozendict.frozendict, tuple, decimal.Decimal, str, bytes, BoolClass, NoneClass, FileIO | any string name can be used but the value must be the correct type | [optional]

#### RequestBody content ApplicationXWwwFormUrlencoded Schema properties EnumFormStringArray

##### Description
Form parameter enum test (string array)

##### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | Form parameter enum test (string array) |

##### List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | must be one of [">", "$", ] if omitted the server will use the default value of $

### query_params
#### RequestQueryParameters.Params

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
enum_query_string_array | [Parameter2.schema](#parameter_2schema) | | optional
enum_query_string | [Parameter3.schema](#parameter_3schema) | | optional
enum_query_integer | [Parameter4.schema](#parameter_4schema) | | optional
enum_query_double | [Parameter5.schema](#parameter_5schema) | | optional


#### Parameter Parameter2

##### Description
Query parameter enum test (string array)

##### Schema

###### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  |

###### List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | must be one of [">", "$", ] if omitted the server will use the default value of $

#### Parameter Parameter3

##### Description
Query parameter enum test (string)

##### Schema

###### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | must be one of ["_abc", "-efg", "(xyz)", ] if omitted the server will use the default value of -efg

#### Parameter Parameter4

##### Description
Query parameter enum test (double)

##### Schema

###### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | must be one of [1, -2, ] value must be a 32 bit integer

#### Parameter Parameter5

##### Description
Query parameter enum test (double)

##### Schema

###### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int, float,  | decimal.Decimal,  |  | must be one of [1.1, -1.2, ] value must be a 64 bit float

### header_params
#### RequestHeaderParameters.Params

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
enum_header_string_array | [Parameter0.schema](#parameter_0schema) | | optional
enum_header_string | [Parameter1.schema](#parameter_1schema) | | optional


#### Parameter Parameter0

##### Description
Header parameter enum test (string array)

##### Schema

###### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  |

###### List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | must be one of [">", "$", ] if omitted the server will use the default value of $

#### Parameter Parameter1

##### Description
Header parameter enum test (string)

##### Schema

###### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | must be one of ["_abc", "-efg", "(xyz)", ] if omitted the server will use the default value of -efg

## Return Types

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [SuccessDescriptionOnly.response_cls](../../../components/responses/response_success_description_only.md#response_success_description_onlyresponse_cls) | Success
404 | [ResponseFor404.response_cls](#response_404response_cls) | Not found

## responses ResponseFor404

### Description
Not found

### response_cls
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#body) | typing.Union[[content.application_json.schema](#responses-responsefor404-content-applicationjson-schema), ] |  |
headers | Unset | headers were not defined |

### Body
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema](#responses-responsefor404-content-applicationjson-schema)

### Body Details
#### responses ResponseFor404 content ApplicationJson Schema

##### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

## Code Sample

```python
import petstore_api
from petstore_api import configuration
from petstore_api.apis.tags import fake_api
from pprint import pprint
# Defining the host is optional and defaults to http://petstore.swagger.io:80/v2
# See configuration.py for a list of all supported configuration parameters.
used_configuration = configuration.Configuration(
    host = "http://petstore.swagger.io:80/v2"
)
# Enter a context with an instance of the API client
with petstore_api.ApiClient(used_configuration) as api_client:
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

[[Back to top]](#top) [[Back to API]](../FakeApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)

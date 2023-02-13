<a name="top"></a>
# **parameter_collisions**
<a name="parameter_collisions"></a>

## Table of Contents
- [Summary](#summary)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Code Sample](#code-sample)

## Summary
parameter collision case

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#request_body) | typing.Union[[RequestBody.content.application_json.schema](#request_bodycontentapplication_jsonschema), Unset] | optional, default is unset |
[query_params](#requestqueryparameters) | [RequestQueryParameters.Params](#RequestQueryParametersParams) | |
[header_params](#requestheaderparameters) | [RequestHeaderParameters.Params](#RequestHeaderParametersParams) | |
[path_params](#requestpathparameters) | [RequestPathParameters.Params](#RequestPathParametersParams) | |
[cookie_params](#requestcookieparameters) | [RequestCookieParameters.Params](#RequestCookieParametersParams) | |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ("application/json", ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="request_body" >body</a>
#### <a id="request_body_request_bodycontentapplication_jsonschema" >RequestBody.content.application_json.schema</a>

#### Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO |  |

### <a id="requestqueryparameters" >query_params</a>
#### <a id="RequestQueryParametersParams" >RequestQueryParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
1 | [Parameter0.schema](#parameter_0schema) | | optional
aB | [Parameter1.schema](#parameter_1schema) | | optional
Ab | [Parameter2.schema](#parameter_2schema) | | optional
self | [Parameter3.schema](#parameter_3schema) | | optional
A-B | [Parameter4.schema](#parameter_4schema) | | optional


#### <a id="parameter_0schema" >Parameter0.schema</a>

#### Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

#### <a id="parameter_1schema" >Parameter1.schema</a>

#### Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

#### <a id="parameter_2schema" >Parameter2.schema</a>

#### Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

#### <a id="parameter_3schema" >Parameter3.schema</a>

#### Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

#### <a id="parameter_4schema" >Parameter4.schema</a>

#### Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

### <a id="requestheaderparameters" >header_params</a>
#### <a id="RequestHeaderParametersParams" >RequestHeaderParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
1 | [Parameter5.schema](#parameter_5schema) | | optional
aB | [Parameter6.schema](#parameter_6schema) | | optional
self | [Parameter7.schema](#parameter_7schema) | | optional
A-B | [Parameter8.schema](#parameter_8schema) | | optional

#### <a id="parameter_5schema" >Parameter5.schema</a>

#### Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

#### <a id="parameter_6schema" >Parameter6.schema</a>

#### Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

#### <a id="parameter_7schema" >Parameter7.schema</a>

#### Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

#### <a id="parameter_8schema" >Parameter8.schema</a>

#### Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

### <a id="requestpathparameters" >path_params</a>
#### <a id="RequestPathParametersParams" >RequestPathParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
1 | [Parameter9.schema](#parameter_9schema) | | 
aB | [Parameter10.schema](#parameter_10schema) | | 
Ab | [Parameter11.schema](#parameter_11schema) | | 
self | [Parameter12.schema](#parameter_12schema) | | 
A-B | [Parameter13.schema](#parameter_13schema) | | 

#### <a id="parameter_9schema" >Parameter9.schema</a>

#### Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

#### <a id="parameter_10schema" >Parameter10.schema</a>

#### Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

#### <a id="parameter_11schema" >Parameter11.schema</a>

#### Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

#### <a id="parameter_12schema" >Parameter12.schema</a>

#### Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

#### <a id="parameter_13schema" >Parameter13.schema</a>

#### Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

### <a id="requestcookieparameters" >cookie_params</a>
#### <a id="RequestCookieParametersParams" >RequestCookieParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
1 | [Parameter14.schema](#parameter_14schema) | | optional
aB | [Parameter15.schema](#parameter_15schema) | | optional
Ab | [Parameter16.schema](#parameter_16schema) | | optional
self | [Parameter17.schema](#parameter_17schema) | | optional
A-B | [Parameter18.schema](#parameter_18schema) | | optional

#### <a id="parameter_14schema" >Parameter14.schema</a>

#### Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

#### <a id="parameter_15schema" >Parameter15.schema</a>

#### Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

#### <a id="parameter_16schema" >Parameter16.schema</a>

#### Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

#### <a id="parameter_17schema" >Parameter17.schema</a>

#### Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

#### <a id="parameter_18schema" >Parameter18.schema</a>

#### Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

## Return Types

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ResponseFor200.response_cls](#response_200response_cls) | success

### <a id="response_200response_cls" >ResponseFor200.response_cls</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[ResponseFor200.content.application_json.schema](#response_200contentapplication_jsonschema), ] |  |
headers | Unset | headers were not defined |

#### <a id="response_200contentapplication_jsonschema" >ResponseFor200.content.application_json.schema</a>

#### Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO |  |

## Code Sample

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
        print("Exception when calling FakeApi->parameter_collisions: %s\n" % e)

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
        print("Exception when calling FakeApi->parameter_collisions: %s\n" % e)
```

[[Back to top]](#top) [[Back to API]](../FakeApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)

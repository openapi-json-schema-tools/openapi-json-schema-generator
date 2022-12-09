<a name="top"></a>
# **parameter_collisions**
<a name="parameter_collisions"></a>

parameter collision case

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
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#request_body) | typing.Union[[request_body.application_json](#request_body.application_json), Unset] | optional, default is unset |
[query_params](#.RequestQueryParameters) | [RequestQueryParameters.Params](#RequestQueryParameters.Params) | |
[header_params](#RequestHeaderParameters) | [RequestHeaderParameters.Params](#RequestHeaderParameters.Params) | |
[path_params](#RequestPathParameters) | [RequestPathParameters.Params](#RequestPathParameters.Params) | |
[cookie_params](#RequestCookieParameters) | [RequestCookieParameters.Params](#RequestCookieParameters.Params) | |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="request_body" >body</a>
# <a id="request_body.application_json" >request_body.application_json</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  |

### <a id="RequestQueryParameters" >query_params</a>
#### <a id="RequestQueryParameters.Params" >RequestQueryParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
1 | [parameter_0.schema](#parameter_0.schema) | | optional
aB | [parameter_1.schema](#parameter_1.schema) | | optional
Ab | [parameter_2.schema](#parameter_2.schema) | | optional
self | [parameter_3.schema](#parameter_3.schema) | | optional
A-B | [parameter_4.schema](#parameter_4.schema) | | optional


# parameter_0.schema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

# parameter_1.schema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

# parameter_2.schema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

# parameter_3.schema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

# parameter_4.schema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

### <a id="RequestHeaderParameters" >header_params</a>
#### <a id="RequestHeaderParameters.Params" >RequestHeaderParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
1 | [parameter_5.schema](#parameter_5.schema) | | optional
aB | [parameter_6.schema](#parameter_6.schema) | | optional
self | [parameter_7.schema](#parameter_7.schema) | | optional
A-B | [parameter_8.schema](#parameter_8.schema) | | optional

# parameter_5.schema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

# parameter_6.schema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

# parameter_7.schema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

# parameter_8.schema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

### <a id="RequestPathParameters" >path_params</a>
#### <a id="RequestPathParameters.Params" >RequestPathParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
1 | [parameter_9.schema](#parameter_9.schema) | | 
aB | [parameter_10.schema](#parameter_10.schema) | | 
Ab | [parameter_11.schema](#parameter_11.schema) | | 
self | [parameter_12.schema](#parameter_12.schema) | | 
A-B | [parameter_13.schema](#parameter_13.schema) | | 

# parameter_9.schema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

# parameter_10.schema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

# parameter_11.schema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

# parameter_12.schema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

# parameter_13.schema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

### <a id="RequestCookieParameters" >cookie_params</a>
#### <a id="RequestCookieParameters.Params" >RequestCookieParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
1 | [parameter_14.schema](#parameter_14.schema) | | optional
aB | [parameter_15.schema](#parameter_15.schema) | | optional
Ab | [parameter_16.schema](#parameter_16.schema) | | optional
self | [parameter_17.schema](#parameter_17.schema) | | optional
A-B | [parameter_18.schema](#parameter_18.schema) | | optional

# parameter_14.schema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

# parameter_15.schema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

# parameter_16.schema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

# parameter_17.schema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

# parameter_18.schema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#response_for_200.ApiResponse) | success

#### <a id="response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.application_json](#response_for_200.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="response_for_200.application_json" >response_for_200.application_json</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  |

### Authorization

No authorization required

[[Back to top]](#top) [[Back to API]](../FakeApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)

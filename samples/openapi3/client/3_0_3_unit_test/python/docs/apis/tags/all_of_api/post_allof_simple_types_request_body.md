<a name="postallofsimpletypesrequestbody"></a>
# **post_allof_simple_types_request_body**

## Table of Contents
- [Path](#path)
- [HTTP Method](#http-method)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Code Sample](#code-sample)

## Path
"/requestBody/postAllofSimpleTypesRequestBody"

## HTTP Method
post

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#requestbody) | typing.Union[[RequestBody.content.application_json.schema](#request_body_request_bodycontentapplication_jsonschema)] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### RequestBody

#### Content Type To Schema
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema](#requestbody-content-applicationjson-schema)

#### RequestBody content ApplicationJson Schema

##### Type Info
Ref Class | Input Type | Accessed Type | Description
--------- | ---------- | ------------- | ------------
[AllofSimpleTypes](../../components/schemas/allof_simple_types.md#allof_simple_types) | dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO,  |

## Return Types

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ResponseFor200.response_cls](#response_200response_cls) | success

## responses ResponseFor200

### Description
success

### response_cls
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## Code Sample

```python
import unit_test_api
from unit_test_api.apis.tags import all_of_api
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = all_of_api.AllOfApi(api_client)

    # example passing only required values which don't have defaults set
    body = allof_simple_types.AllofSimpleTypes(None)
    try:
        api_response = api_instance.post_allof_simple_types_request_body(
            body=body,
        )
        pprint(api_response)
    except unit_test_api.ApiException as e:
        print("Exception when calling AllOfApi->post_allof_simple_types_request_body: %s\n" % e)
```

[[Back to top]](#top) [[Back to API]](../AllOfApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)

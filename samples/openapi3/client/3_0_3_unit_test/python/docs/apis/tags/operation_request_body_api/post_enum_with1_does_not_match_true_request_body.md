<a name="postenumwith1doesnotmatchtruerequestbody"></a>
# **post_enum_with1_does_not_match_true_request_body**

## Table of Contents
- [Path](#path)
- [HTTP Method](#http-method)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Code Sample](#code-sample)

## Path
"/requestBody/postEnumWith1DoesNotMatchTrueRequestBody"

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
[EnumWith1DoesNotMatchTrue](../../components/schemas/enum_with1_does_not_match_true.md#enum_with1_does_not_match_true) | decimal.Decimal, int, float,  | decimal.Decimal,  |

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
from unit_test_api.apis.tags import operation_request_body_api
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = unit_test_api.Configuration(
    host = "https://someserver.com/v1"
)

# Enter a context with an instance of the API client
with unit_test_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = operation_request_body_api.OperationRequestBodyApi(api_client)

    # example passing only required values which don't have defaults set
    body = enum_with1_does_not_match_true.EnumWith1DoesNotMatchTrue(1)
    try:
        api_response = api_instance.post_enum_with1_does_not_match_true_request_body(
            body=body,
        )
        pprint(api_response)
    except unit_test_api.ApiException as e:
        print("Exception when calling OperationRequestBodyApi->post_enum_with1_does_not_match_true_request_body: %s\n" % e)
```

[[Back to top]](#top) [[Back to API]](../OperationRequestBodyApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)

<a name="top"></a>
# **json_with_charset**
<a name="json_with_charset"></a>

## Table of Contents
- [Summary](#summary)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Code Sample](#code-sample)

## Summary
json with charset tx and rx

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#request_body) | typing.Union[[RequestBody.content.application_json_charsetutf8.schema](#request_body_request_bodycontentapplication_json_charsetutf8schema), Unset] | optional, default is unset |
content_type | str | optional, default is 'application/json; charset&#x3D;utf-8' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ("application/json; charset=utf-8", ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="request_body" >body</a>

#### Content Type To Schema
Content-Type | Schema
------------ | -------
"application/json; charset&#x3D;utf-8" | [content.application_json_charsetutf8.Schema](#contentapplication_json_charsetutf8schema)

#### <a id="application_json_charsetutf8schema" >content.application_json_charsetutf8.schema</a>
[]

#### Schema

##### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO |  |

## Return Types

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ResponseFor200.response_cls](#response_200response_cls) | success

## <a id="response_200" >ResponseFor200</a>

### <a id="response_200description" >Description</a>
success

### <a id="response_200response_cls" >response_cls</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#response_200content) | typing.Union[[content.application_json_charsetutf8.schema](#response_200contentapplication_json_charsetutf8schema), ] |  |
headers | Unset | headers were not defined |

### <a id="response_200content" >content</a>

#### <a id="response_200org.openapijsonschematools.codegen.model.CodegenKey@6f9749facontentapplication_json_charsetutf8schema" >ResponseFor200.content.application_json_charsetutf8.schema</a>
[]

#### Schema

##### Type Info
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

    # example passing only optional values
    body = None
    try:
        # json with charset tx and rx
        api_response = api_instance.json_with_charset(
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->json_with_charset: %s\n" % e)
```

[[Back to top]](#top) [[Back to API]](../FakeApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)

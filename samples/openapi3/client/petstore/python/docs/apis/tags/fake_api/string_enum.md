<a name="top"></a>
# **string_enum**
<a name="string_enum"></a>

## Table of Contents
- [Description](#description)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Code Sample](#code-sample)

## Description
Test serialization of outer enum

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#request_body) | typing.Union[[RequestBody.content.application_json.schema](#request_body_request_bodycontentapplication_jsonschema), Unset] | optional, default is unset |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ("application/json", ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="request_body" >body</a>

#### Description
Input enum

#### Content Type To Schema
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema](#)

#### 

##### Type Info
Ref Class | Input Type | Accessed Type | Description
--------- | ---------- | ------------- | ------------
[StringEnum](../../components/schemas/string_enum.StringEnum.md#string_enum) | None, str,  | NoneClass, str,  |

## Return Types

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ResponseFor200.response_cls](#response_200response_cls) | Output enum

## <a id="response_200" >ResponseFor200</a>

### <a id="response_200description" >Description</a>
Output enum

### <a id="response_200response_cls" >response_cls</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#response_200content) | typing.Union[[content.application_json.schema](#response_200contentapplication_jsonschema), ] |  |
headers | Unset | headers were not defined |

### <a id="response_200content" >content</a>

#### <a id="response_200org.openapijsonschematools.codegen.model.CodegenKey@a93e2910contentapplication_jsonschema" >ResponseFor200.content.application_json.schema</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**StringEnum**](../../../components/schema/string_enum.StringEnum.md) |  | 


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
    body = string_enum.StringEnum("placed")
    try:
        api_response = api_instance.string_enum(
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->string_enum: %s\n" % e)
```

[[Back to top]](#top) [[Back to API]](../FakeApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)

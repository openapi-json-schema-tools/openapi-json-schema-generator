<a name="top"></a>
# **additional_properties_with_array_of_enums**
<a name="additional_properties_with_array_of_enums"></a>

## Table of Contents
- [Summary](#summary)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Code Sample](#code-sample)

## Summary
Additional Properties with Array of Enums

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
[AdditionalPropertiesWithArrayOfEnums](../../components/schemas/additional_properties_with_array_of_enums.AdditionalPropertiesWithArrayOfEnums.md#additional_properties_with_array_of_enums) | dict, frozendict.frozendict,  | frozendict.frozendict,  |

## Return Types

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ResponseFor200.response_cls](#response_200response_cls) | Got object with additional properties with array of enums

## 

### <a id="response_200description" >Description</a>
Got object with additional properties with array of enums

### <a id="response_200response_cls" >response_cls</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#body) | typing.Union[[content.application_json.schema](#), ] |  |
headers | Unset | headers were not defined |
### body

#### Content Type To Schema
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema](#)
#### 

##### Type Info
Ref Class | Input Type | Accessed Type | Description
--------- | ---------- | ------------- | ------------
[AdditionalPropertiesWithArrayOfEnums](../../components/schemas/additional_properties_with_array_of_enums.AdditionalPropertiesWithArrayOfEnums.md#additional_properties_with_array_of_enums) | dict, frozendict.frozendict,  | frozendict.frozendict,  |

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
    body = additional_properties_with_array_of_enums.AdditionalPropertiesWithArrayOfEnums(
        key=[
            enum_class.EnumClass("-efg")
        ],
    )
    try:
        # Additional Properties with Array of Enums
        api_response = api_instance.additional_properties_with_array_of_enums(
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->additional_properties_with_array_of_enums: %s\n" % e)
```

[[Back to top]](#top) [[Back to API]](../FakeApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)

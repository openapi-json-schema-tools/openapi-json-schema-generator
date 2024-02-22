petstore_api.paths.fake_additional_properties_with_array_of_enums.operation
# Operation Method Name

| Method Name | Api Class | Notes |
| ----------- | --------- | ----- |
| additional_properties_with_array_of_enums | [FakeApi](../../apis/tags/fake_api.md) | This api is only for tag=fake |
| get | ApiForGet | This api is only for this endpoint |
| get | FakeAdditionalPropertiesWithArrayOfEnums | This api is only for path=/fake/additional-properties-with-array-of-enums |

## Table of Contents
- [General Info](#general-info)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Servers](#servers)
- [Code Sample](#code-sample)

## General Info
| Field | Value |
| ----- | ----- |
| Summary | Additional Properties with Array of Enums |
| Path | "/fake/additional-properties-with-array-of-enums" |
| HTTP Method | get |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#requestbody) | typing.Union[[additional_properties_with_array_of_enums.AdditionalPropertiesWithArrayOfEnumsDictInput](../../components/schema/additional_properties_with_array_of_enums.md#additionalpropertieswitharrayofenumsdictinput), [additional_properties_with_array_of_enums.AdditionalPropertiesWithArrayOfEnumsDict](../../components/schema/additional_properties_with_array_of_enums.md#additionalpropertieswitharrayofenumsdict), schemas.Unset] | optional, default is unset |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body. value must be one of ['application/json']
accept_content_types | typing.Tuple[str] | default is ("application/json", ) | Tells the server the content type(s) that are accepted by the client
server_index | typing.Optional[int] | default is None | Allows one to select a different [server](#servers). If not None, must be one of [0, 1, 2]
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_response.ApiResponseWithoutDeserialization will be returned

### RequestBody

#### Description
Input enum

#### Content Type To Schema
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema](#requestbody-content-applicationjson-schema)

#### RequestBody content ApplicationJson Schema
```
type: schemas.Schema
```

##### Ref Schema Info
Ref Schema | Input Type | Output Type
---------- | ---------- | -----------
[**additional_properties_with_array_of_enums.AdditionalPropertiesWithArrayOfEnums**](../../components/schema/additional_properties_with_array_of_enums.md) | [additional_properties_with_array_of_enums.AdditionalPropertiesWithArrayOfEnumsDictInput](../../components/schema/additional_properties_with_array_of_enums.md#additionalpropertieswitharrayofenumsdictinput), [additional_properties_with_array_of_enums.AdditionalPropertiesWithArrayOfEnumsDict](../../components/schema/additional_properties_with_array_of_enums.md#additionalpropertieswitharrayofenumsdict) | [additional_properties_with_array_of_enums.AdditionalPropertiesWithArrayOfEnumsDict](../../components/schema/additional_properties_with_array_of_enums.md#additionalpropertieswitharrayofenumsdict)

## Return Types

HTTP Status Code | Class | Description
------------- | ------------- | -------------
n/a | api_response.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [_200.ApiResponse](#_200-apiresponse) | Got object with additional properties with array of enums

## _200

### Description
Got object with additional properties with array of enums

### _200 ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#_200-body) | [additional_properties_with_array_of_enums.AdditionalPropertiesWithArrayOfEnumsDict](../../components/schema/additional_properties_with_array_of_enums.md#additionalpropertieswitharrayofenumsdict) |  |
headers | Unset | headers were not defined |

### _200 Body
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema](#_200-content-applicationjson-schema)

### Body Details
#### _200 content ApplicationJson Schema
```
type: schemas.Schema
```

##### Ref Schema Info
Ref Schema | Input Type | Output Type
---------- | ---------- | -----------
[**additional_properties_with_array_of_enums.AdditionalPropertiesWithArrayOfEnums**](../../components/schema/additional_properties_with_array_of_enums.md) | [additional_properties_with_array_of_enums.AdditionalPropertiesWithArrayOfEnumsDictInput](../../components/schema/additional_properties_with_array_of_enums.md#additionalpropertieswitharrayofenumsdictinput), [additional_properties_with_array_of_enums.AdditionalPropertiesWithArrayOfEnumsDict](../../components/schema/additional_properties_with_array_of_enums.md#additionalpropertieswitharrayofenumsdict) | [additional_properties_with_array_of_enums.AdditionalPropertiesWithArrayOfEnumsDict](../../components/schema/additional_properties_with_array_of_enums.md#additionalpropertieswitharrayofenumsdict)

## Servers

Set the available servers by defining your used servers in ApiConfiguration.server_info
Then select your server by setting a server index in ApiConfiguration.server_index_info or by
passing server_index in to the endpoint method.
- these servers are the general api servers
- defaults to server_index=0, server.url = http://petstore.swagger.io:80/v2

server_index | Class | Description
------------ | ----- | ------------
0 | [Server0](../../servers/server_0.md) | petstore server
1 | [Server1](../../servers/server_1.md) | The local server
2 | [Server2](../../servers/server_2.md) | staging server with no variables

## Code Sample

```python
import petstore_api
from petstore_api.configurations import api_configuration
from petstore_api.apis.tags import fake_api
from pprint import pprint
used_configuration = api_configuration.ApiConfiguration(
)
# Enter a context with an instance of the API client
with petstore_api.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = fake_api.FakeApi(api_client)

    # example passing only optional values
    body = additional_properties_with_array_of_enums.AdditionalPropertiesWithArrayOfEnums.validate({
        "key": [
            enum_class.EnumClass.validate("-efg")
        ],
    })
    try:
        # Additional Properties with Array of Enums
        api_response = api_instance.additional_properties_with_array_of_enums(
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->additional_properties_with_array_of_enums: %s\n" % e)
```

[[Back to top]](#top)
[[Back to FakeApi API]](../../apis/tags/fake_api.md)
[[Back to Endpoints]](../../../README.md#Endpoints) [[Back to README]](../../../README.md)
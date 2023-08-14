petstore_api.paths.foo.operation
# Operation Method Name

| Method Name | Api Class | Notes |
| ----------- | --------- | ----- |
| foo_get | [DefaultApi](../../apis/tags/default_api.md) | This api is only for tag=default |
| get | ApiForGet | This api is only for this endpoint |
| get | Foo | This api is only for path=/foo |

## Table of Contents
- [General Info](#general-info)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Servers](#servers)
- [Code Sample](#code-sample)

## General Info
| Field | Value |
| ----- | ----- |
| Path | "/foo" |
| HTTP Method | get |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
accept_content_types | typing.Tuple[str] | default is ("application/json", ) | Tells the server the content type(s) that are accepted by the client
server_index | typing.Optional[int] | default is None | Allows one to select a different [server](#servers). If not None, must be one of [0, 1]
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_response.ApiResponseWithoutDeserialization will be returned

## Return Types

HTTP Status Code | Class | Description
------------- | ------------- | -------------
n/a | api_response.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
default | [Default.ApiResponse](#default-apiresponse) | response

## Default

### Description
response

### Default ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#default-body) | [content.application_json.schema](#default-content-applicationjson-schema) |  |
headers | Unset | headers were not defined |

### Default Body
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema](#default-content-applicationjson-schema)

### Body Details
#### Default content ApplicationJson Schema
petstore_api.paths.foo.get.responses.response_default.content.application_json.schema
```
type: schemas.Schema
```

##### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[SchemaDictInput](#default-content-applicationjson-schema-schemadictinput), [SchemaDict](#default-content-applicationjson-schema-schemadict) | [SchemaDict](#default-content-applicationjson-schema-schemadict) |

##### Default content ApplicationJson Schema SchemaDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**string** | [foo.FooDictInput](../../components/schema/foo.md#foodictinput), [foo.FooDict](../../components/schema/foo.md#foodict) |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

##### Default content ApplicationJson Schema SchemaDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]
```
###### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**string** | [foo.FooDictInput](../../components/schema/foo.md#foodictinput), [foo.FooDict](../../components/schema/foo.md#foodict), schemas.Unset |  | [optional]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

###### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**string** | [foo.FooDict](../../components/schema/foo.md#foodict), schemas.Unset |  | [optional]

###### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [SchemaDictInput](#default-content-applicationjson-schema-schemadictinput), [SchemaDict](#default-content-applicationjson-schema-schemadict) | [SchemaDict](#default-content-applicationjson-schema-schemadict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | provides type safety for additional properties

## Servers

Set the available servers by defining your used servers in ApiConfiguration.server_info
Then select your server by setting a server index in ApiConfiguration.server_index_info or by
passing server_index in to the endpoint method.
- these servers are specific to this endpoint
- defaults to server_index=0, server.url = https://path-server-test.petstore.local/v2

server_index | Class | Description
------------ | ----- | ------------
0 | [Server0](#server0) |
1 | [Server1](#server1) |

### Server0

#### Url
https://path-server-test.petstore.local/v2

### Server1

#### Url
https://petstore.swagger.io/{version}

#### Variables
Key | Type | Description | Notes
--- | ---- | ----------- | ------
**version** | str |  |  must be one of ["v1", "v2"] if omitted the client will use the default value of v1

## Code Sample

```python
import petstore_api
from petstore_api.configurations import api_configuration
from petstore_api.apis.tags import default_api
from pprint import pprint
used_configuration = api_configuration.ApiConfiguration(
)
# Enter a context with an instance of the API client
with petstore_api.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = default_api.DefaultApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.foo_get()
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling DefaultApi->foo_get: %s\n" % e)
```

[[Back to top]](#top)
[[Back to DefaultApi API]](../../apis/tags/default_api.md)
[[Back to Endpoints]](../../../README.md#Endpoints) [[Back to README]](../../../README.md)
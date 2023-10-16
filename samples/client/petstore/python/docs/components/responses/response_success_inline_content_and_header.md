petstore_api.components.responses.response_success_inline_content_and_header
# Response SuccessInlineContentAndHeader

## Description
successful operation

## ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#body) | [SchemaDict](#content-applicationjson-schema-schemadict) |  |
[headers](#headers) | [HeadersDict](#headers-headersdict) | |

## Body
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema](#content-applicationjson-schema)

## Body Details
### content ApplicationJson Schema
petstore_api.components.responses.response_success_inline_content_and_header.content.application_json.schema
```
type: schemas.Schema
```

#### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[SchemaDictInput](#content-applicationjson-schema-schemadictinput), [SchemaDict](#content-applicationjson-schema-schemadict) | [SchemaDict](#content-applicationjson-schema-schemadict) |

#### content ApplicationJson Schema SchemaDictInput
```
type: typing.Mapping[
    str,
    int,
]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | int | any string name can be used but the value must be the correct type | [optional] value must be a 32 bit integer

#### content ApplicationJson Schema SchemaDict
```
base class: schemas.immutabledict[str, int]

```
##### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**kwargs** | int | any string name can be used but the value must be the correct type | [optional] value must be a 32 bit integer typed value is accessed with the get_additional_property_ method

##### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [SchemaDictInput](#content-applicationjson-schema-schemadictinput), [SchemaDict](#content-applicationjson-schema-schemadict) | [SchemaDict](#content-applicationjson-schema-schemadict) | a constructor
get_additional_property_ | str | int, schemas.Unset | provides type safety for additional properties

## Headers
### Headers
```
type: schemas.Schema
```

#### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[HeadersDictInput](#headers-headersdictinput), [HeadersDict](#headers-headersdict) | [HeadersDict](#headers-headersdict) |

#### Headers HeadersDictInput
```
type: typing.TypedDict
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**someHeader** | str |  | [optional]

#### Headers HeadersDict
```
base class: schemas.immutabledict[str, str]

```
##### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**someHeader** | str, schemas.Unset |  | [optional]

##### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**someHeader** | str, schemas.Unset |  | [optional]

##### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [HeadersDictInput](#headers-headersdictinput), [HeadersDict](#headers-headersdict) | [HeadersDict](#headers-headersdict) | a constructor

## Header Details
### headers SomeHeader

#### headers SomeHeader Schema
petstore_api.components.responses.response_success_inline_content_and_header.headers.header_some_header.schema
```
type: schemas.Schema
```

##### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
str | str |

[[Back to top]](#top) [[Back to Component Responses]](../../../README.md#Component-Responses) [[Back to README]](../../../README.md)

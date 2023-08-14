petstore_api.paths.fake_inline_composition.operation
# Operation Method Name

| Method Name | Api Class | Notes |
| ----------- | --------- | ----- |
| inline_composition | [FakeApi](../../apis/tags/fake_api.md) | This api is only for tag=fake |
| post | ApiForPost | This api is only for this endpoint |
| post | FakeInlineComposition | This api is only for path=/fake/inlineComposition/ |

## Table of Contents
- [General Info](#general-info)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Servers](#servers)
- [Code Sample](#code-sample)

## General Info
| Field | Value |
| ----- | ----- |
| Summary | testing composed schemas at inline locations |
| Description | composed schemas at inline locations + multiple requestBody content types |
| Path | "/fake/inlineComposition/" |
| HTTP Method | post |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#requestbody) | typing.Union[dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, [schema_2.SchemaDictInput](../../paths/fake_inline_composition/post/request_body/content/multipart_form_data/schema.md#schemadictinput), [schema_2.SchemaDict](../../paths/fake_inline_composition/post/request_body/content/multipart_form_data/schema.md#schemadict), schemas.Unset] | optional, default is unset |
[query_params](#query_params) | [QueryParametersDictInput](#queryparameters-queryparametersdictinput), [QueryParametersDict](#queryparameters-queryparametersdict) | |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body. value must be one of ['application/json', 'multipart/form-data']
accept_content_types | typing.Tuple[str] | default is ("application/json", "multipart/form-data", ) | Tells the server the content type(s) that are accepted by the client
server_index | typing.Optional[int] | default is None | Allows one to select a different [server](#servers). If not None, must be one of [0, 1, 2]
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_response.ApiResponseWithoutDeserialization will be returned

### RequestBody

#### Description
multiple content types

#### Content Type To Schema
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema](#requestbody-content-applicationjson-schema)
"multipart/form-data" | [content.multipart_form_data.Schema](#requestbody-content-multipartformdata-schema)

#### RequestBody content ApplicationJson Schema
petstore_api.paths.fake_inline_composition.post.request_body.content.application_json.schema
```
type: schemas.Schema
```

##### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO |

##### Composed Schemas (allOf/anyOf/oneOf/not)
##### allOf
Schema Class | Input Type | Return Type
------------ | ---------- | -----------
[_0](#requestbody-content-applicationjson-schema-_0) | str | str

#### RequestBody content ApplicationJson Schema
```
type: schemas.Schema
```

##### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
str | str |
#### RequestBody content MultipartFormData Schema
petstore_api.paths.fake_inline_composition.post.request_body.content.multipart_form_data.schema
```
type: schemas.Schema
```

##### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[SchemaDictInput](#requestbody-content-multipartformdata-schema-schemadictinput), [SchemaDict](#requestbody-content-multipartformdata-schema-schemadict) | [SchemaDict](#requestbody-content-multipartformdata-schema-schemadict) |

##### RequestBody content MultipartFormData Schema SchemaDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**someProp** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

##### RequestBody content MultipartFormData Schema SchemaDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]
```
###### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**someProp** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset |  | [optional]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

###### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**someProp** | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO, schemas.Unset |  | [optional]

###### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [SchemaDictInput](#requestbody-content-multipartformdata-schema-schemadictinput), [SchemaDict](#requestbody-content-multipartformdata-schema-schemadict) | [SchemaDict](#requestbody-content-multipartformdata-schema-schemadict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | provides type safety for additional properties

#### RequestBody content MultipartFormData Schema
```
type: schemas.Schema
```

##### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO |

##### Composed Schemas (allOf/anyOf/oneOf/not)
##### allOf
Schema Class | Input Type | Return Type
------------ | ---------- | -----------
[_0](#requestbody-content-multipartformdata-schema-_0) | str | str

#### RequestBody content MultipartFormData Schema
```
type: schemas.Schema
```

##### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
str | str |
### query_params
### QueryParameters
```
type: schemas.Schema
```

#### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[QueryParametersDictInput](#queryparameters-queryparametersdictinput), [QueryParametersDict](#queryparameters-queryparametersdict) | [QueryParametersDict](#queryparameters-queryparametersdict) |

#### QueryParameters QueryParametersDictInput
```
type: typing.TypedDict
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**compositionAtRoot** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader |  | [optional]
**compositionInProperty** | [schema_2.SchemaDictInput](../../paths/fake_inline_composition/post/parameters/parameter_1/schema.md#schemadictinput), [schema_2.SchemaDict](../../paths/fake_inline_composition/post/parameters/parameter_1/schema.md#schemadict) |  | [optional]

#### QueryParameters QueryParametersDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]
```
##### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**compositionAtRoot** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset |  | [optional]
**compositionInProperty** | [schema_2.SchemaDictInput](../../paths/fake_inline_composition/post/parameters/parameter_1/schema.md#schemadictinput), [schema_2.SchemaDict](../../paths/fake_inline_composition/post/parameters/parameter_1/schema.md#schemadict), schemas.Unset |  | [optional]

##### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**compositionAtRoot** | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO, schemas.Unset |  | [optional]
**compositionInProperty** | [schema.SchemaDict](../../paths/fake_inline_composition/post/parameters/parameter_1/schema.md#schemadict), schemas.Unset |  | [optional]

##### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [QueryParametersDictInput](#queryparameters-queryparametersdictinput), [QueryParametersDict](#queryparameters-queryparametersdict) | [QueryParametersDict](#queryparameters-queryparametersdict) | a constructor

## Return Types

HTTP Status Code | Class | Description
------------- | ------------- | -------------
n/a | api_response.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ResponseFor200.ApiResponse](#responsefor200-apiresponse) | success, multiple content types

## ResponseFor200

### Description
success, multiple content types

### ResponseFor200 ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#responsefor200-body) | typing.Union[[content.application_json.schema](#responsefor200-content-applicationjson-schema), [content.multipart_form_data.schema](#responsefor200-content-multipartformdata-schema)] |  |
headers | Unset | headers were not defined |

### ResponseFor200 Body
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema](#responsefor200-content-applicationjson-schema)
"multipart/form-data" | [content.multipart_form_data.Schema](#responsefor200-content-multipartformdata-schema)

### Body Details
#### ResponseFor200 content ApplicationJson Schema
petstore_api.paths.fake_inline_composition.post.responses.response_200.content.application_json.schema
```
type: schemas.Schema
```

##### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO |

##### Composed Schemas (allOf/anyOf/oneOf/not)
##### allOf
Schema Class | Input Type | Return Type
------------ | ---------- | -----------
[_0](#responsefor200-content-applicationjson-schema-_0) | str | str

#### ResponseFor200 content ApplicationJson Schema
```
type: schemas.Schema
```

##### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
str | str |
#### ResponseFor200 content MultipartFormData Schema
petstore_api.paths.fake_inline_composition.post.responses.response_200.content.multipart_form_data.schema
```
type: schemas.Schema
```

##### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[SchemaDictInput](#responsefor200-content-multipartformdata-schema-schemadictinput), [SchemaDict](#responsefor200-content-multipartformdata-schema-schemadict) | [SchemaDict](#responsefor200-content-multipartformdata-schema-schemadict) |

##### ResponseFor200 content MultipartFormData Schema SchemaDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**someProp** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

##### ResponseFor200 content MultipartFormData Schema SchemaDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]
```
###### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**someProp** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset |  | [optional]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

###### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**someProp** | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO, schemas.Unset |  | [optional]

###### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [SchemaDictInput](#responsefor200-content-multipartformdata-schema-schemadictinput), [SchemaDict](#responsefor200-content-multipartformdata-schema-schemadict) | [SchemaDict](#responsefor200-content-multipartformdata-schema-schemadict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | provides type safety for additional properties

#### ResponseFor200 content MultipartFormData Schema
```
type: schemas.Schema
```

##### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO |

##### Composed Schemas (allOf/anyOf/oneOf/not)
##### allOf
Schema Class | Input Type | Return Type
------------ | ---------- | -----------
[_0](#responsefor200-content-multipartformdata-schema-_0) | str | str

#### ResponseFor200 content MultipartFormData Schema
```
type: schemas.Schema
```

##### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
str | str |

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
from petstore_api.paths.fake_inline_composition.post import operation
from pprint import pprint
used_configuration = api_configuration.ApiConfiguration(
)
# Enter a context with an instance of the API client
with petstore_api.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = fake_api.FakeApi(api_client)

    # example passing only optional values
    query_params: operation.QueryParametersDictInput = {
        'compositionAtRoot': None,
        'compositionInProperty': {
        "some_prop": None,
    },
    }
    body = None
    try:
        # testing composed schemas at inline locations
        api_response = api_instance.inline_composition(
            query_params=query_params,
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->inline_composition: %s\n" % e)
```

[[Back to top]](#top)
[[Back to FakeApi API]](../../apis/tags/fake_api.md)
[[Back to Endpoints]](../../../README.md#Endpoints) [[Back to README]](../../../README.md)
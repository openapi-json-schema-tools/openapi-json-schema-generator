petstore_api.paths.fake_upload_files.operation
# Operation Method Name

| Method Name | Api Class | Notes |
| ----------- | --------- | ----- |
| upload_files | [FakeApi](../../apis/tags/fake_api.md) | This api is only for tag=fake |
| post | ApiForPost | This api is only for this endpoint |
| post | FakeUploadFiles | This api is only for path=/fake/uploadFiles |

## Table of Contents
- [General Info](#general-info)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Servers](#servers)
- [Code Sample](#code-sample)

## General Info
| Field | Value |
| ----- | ----- |
| Summary | uploads files using multipart/form-data |
| Path | "/fake/uploadFiles" |
| HTTP Method | post |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#requestbody) | typing.Union[[RequestBody.content.multipart_form_data.schema](#RequestBody-content-multipartformdata-schema), Unset, dict, schemas.immutabledict] | optional, default is unset |
content_type | str | optional, default is 'multipart/form-data' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ("application/json", ) | Tells the server the content type(s) that are accepted by the client
server_index | typing.Optional[int] | default is None | Allows one to select a different [server](#servers). If not None, must be one of [0, 1, 2]
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_response.ApiResponseWithoutDeserialization will be returned

### RequestBody

#### Content Type To Schema
Content-Type | Schema
------------ | -------
"multipart/form-data" | [content.multipart_form_data.Schema](#requestbody-content-multipartformdata-schema)

#### RequestBody content MultipartFormData Schema
petstore_api.paths.fake_upload_files.post.request_body.content.multipart_form_data.schema
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
**files** | [FilesTupleInput](#requestbody-content-multipartformdata-schema-filestupleinput), [FilesTuple](#requestbody-content-multipartformdata-schema-filestuple) |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

##### RequestBody content MultipartFormData Schema SchemaDict
```
base class: schemas.immutabledict[str, typing.Tuple[schemas.OUTPUT_BASE_TYPES]]

```
###### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**files** | [FilesTupleInput](#requestbody-content-multipartformdata-schema-filestupleinput), [FilesTuple](#requestbody-content-multipartformdata-schema-filestuple), schemas.Unset |  | [optional]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

###### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**files** | [FilesTuple](#requestbody-content-multipartformdata-schema-filestuple), schemas.Unset |  | [optional]

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
[FilesTupleInput](#requestbody-content-multipartformdata-schema-filestupleinput), [FilesTuple](#requestbody-content-multipartformdata-schema-filestuple) | [FilesTuple](#requestbody-content-multipartformdata-schema-filestuple) |

##### RequestBody content MultipartFormData Schema FilesTupleInput
```
type: typing.Union[
    typing.List[
        typing.Union[
            bytes,
            io.FileIO,
            io.BufferedReader,
            schemas.FileIO
        ],
    ],
    typing.Tuple[
        typing.Union[
            bytes,
            io.FileIO,
            io.BufferedReader,
            schemas.FileIO
        ],
        ...
    ]
]
```
Index | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
≥ 0 | bytes, io.FileIO, io.BufferedReader |  |

##### RequestBody content MultipartFormData Schema FilesTuple
```
base class: typing.Tuple[
    typing.Union[bytes, schemas.FileIO],
    ...
]
```
###### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [FilesTupleInput](#requestbody-content-multipartformdata-schema-filestupleinput), [FilesTuple](#requestbody-content-multipartformdata-schema-filestuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

###### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | typing.Union[bytes, schemas.FileIO] | This method is used under the hood when instance[0] is called

## Return Types

HTTP Status Code | Class | Description
------------- | ------------- | -------------
n/a | api_response.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ResponseFor200.response_cls](#responsefor200-response_cls) | successful operation

## ResponseFor200

### Description
successful operation

### ResponseFor200 response_cls
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#responsefor200-body) | [content.application_json.schema](#responsefor200-content-applicationjson-schema) |  |
headers | Unset | headers were not defined |

### ResponseFor200 Body
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema](#responsefor200-content-applicationjson-schema)

### Body Details
#### ResponseFor200 content ApplicationJson Schema
petstore_api.paths.fake_upload_files.post.responses.response_200.content.application_json.schema
```
type: schemas.Schema
```

##### Ref Schema Info
Ref Schema | Input Type | Output Type | Description
---------- | ---------- | ----------- | ------------
[ApiResponse](../../components/schema/api_response.md) | [api_response.ApiResponseDictInput](../../../components/schema/api_response.md#apiresponsedictinput), [api_response.ApiResponseDict](../../../components/schema/api_response.md#apiresponsedict) | [api_response.ApiResponseDict](../../../components/schema/api_response.md#apiresponsedict) |

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
    body = {
        "files": [
            open('/path/to/file', 'rb')
        ],
    }
    try:
        # uploads files using multipart/form-data
        api_response = api_instance.upload_files(
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->upload_files: %s\n" % e)
```

[[Back to top]](#top)
[[Back to FakeApi API]](../../apis/tags/fake_api.md)
[[Back to Endpoints]](../../../README.md#Endpoints) [[Back to README]](../../../README.md)
petstore_api.paths.fake_upload_file.operation
# Operation Method Name

| Method Name | Api Class | Notes |
| ----------- | --------- | ----- |
| upload_file | [FakeApi](../../apis/tags/fake_api.md) | This api is only for tag=fake |
| post | ApiForPost | This api is only for this endpoint |
| post | FakeUploadFile | This api is only for path=/fake/uploadFile |

## Table of Contents
- [General Info](#general-info)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Servers](#servers)
- [Code Sample](#code-sample)

## General Info
| Field | Value |
| ----- | ----- |
| Summary | uploads a file using multipart/form-data |
| Path | "/fake/uploadFile" |
| HTTP Method | post |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#requestbody) | typing.Union[[schema.SchemaDictInput](../../paths/fake_upload_file/post/request_body/content/multipart_form_data/schema.md#schemadictinput), [schema.SchemaDict](../../paths/fake_upload_file/post/request_body/content/multipart_form_data/schema.md#schemadict), schemas.Unset] | optional, default is unset |
content_type | str | optional, default is 'multipart/form-data' | Selects the schema and serialization of the request body. value must be one of ['multipart/form-data']
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
petstore_api.paths.fake_upload_file.post.request_body.content.multipart_form_data.schema
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
**file** | bytes, io.FileIO, io.BufferedReader | file to upload |
**additionalMetadata** | str | Additional data to pass to server | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

##### RequestBody content MultipartFormData Schema SchemaDict
```
base class: schemas.immutabledict[str, str]

```
###### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**file** | bytes, io.FileIO, io.BufferedReader | file to upload |
**additionalMetadata** | str, schemas.Unset | Additional data to pass to server | [optional]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

###### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**file** | bytes, io.FileIO | file to upload |
**additionalMetadata** | str, schemas.Unset | Additional data to pass to server | [optional]

###### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [SchemaDictInput](#requestbody-content-multipartformdata-schema-schemadictinput), [SchemaDict](#requestbody-content-multipartformdata-schema-schemadict) | [SchemaDict](#requestbody-content-multipartformdata-schema-schemadict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | provides type safety for additional properties

## Return Types

HTTP Status Code | Class | Description
------------- | ------------- | -------------
n/a | api_response.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ResponseFor200.ApiResponse](#responsefor200-apiresponse) | successful operation

## ResponseFor200

### Description
successful operation

### ResponseFor200 ApiResponse
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
petstore_api.paths.fake_upload_file.post.responses.response_200.content.application_json.schema
```
type: schemas.Schema
```

##### Ref Schema Info
Ref Schema | Input Type | Output Type
---------- | ---------- | -----------
[**api_response.ApiResponse**](../../components/schema/api_response.md) | [api_response.ApiResponseDictInput](../../components/schema/api_response.md#apiresponsedictinput), [api_response.ApiResponseDict](../../components/schema/api_response.md#apiresponsedict) | [api_response.ApiResponseDict](../../components/schema/api_response.md#apiresponsedict)

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
        "additional_metadata": "additional_metadata_example",
        "file": open('/path/to/file', 'rb'),
    }
    try:
        # uploads a file using multipart/form-data
        api_response = api_instance.upload_file(
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->upload_file: %s\n" % e)
```

[[Back to top]](#top)
[[Back to FakeApi API]](../../apis/tags/fake_api.md)
[[Back to Endpoints]](../../../README.md#Endpoints) [[Back to README]](../../../README.md)
petstore_api.paths.fake_pet_id_upload_image_with_required_file.operation
# Operation Method Name

| Method Name | Api Class | Notes |
| ----------- | --------- | ----- |
| upload_file_with_required_file | [PetApi](../../apis/tags/pet_api.md) | This api is only for tag=pet |
| post | ApiForPost | This api is only for this endpoint |
| post | FakePetIdUploadImageWithRequiredFile | This api is only for path=/fake/{petId}/uploadImageWithRequiredFile |

## Table of Contents
- [General Info](#general-info)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Security](#security)
- [Servers](#servers)
- [Code Sample](#code-sample)

## General Info
| Field | Value |
| ----- | ----- |
| Summary | uploads an image (required) |
| Path | "/fake/{petId}/uploadImageWithRequiredFile" |
| HTTP Method | post |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#requestbody) | typing.Union[[RequestBody.content.multipart_form_data.schema](#RequestBody-content-multipartformdata-schema), Unset, dict, frozendict.frozendict] | optional, default is unset |
[path_params](#path_params) | [RequestPathParameters.Params](#requestpathparametersparams), dict | |
content_type | str | optional, default is 'multipart/form-data' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ("application/json", ) | Tells the server the content type(s) that are accepted by the client
security_index | typing.Optional[int] | default is None | Allows one to select a different [security](#security) definition. If not None, must be one of [0]
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

##### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict | frozendict.frozendict |  |

##### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**requiredFile** | bytes, io.FileIO, io.BufferedReader | bytes, io.FileIO | file to upload |
**additionalMetadata** | str | str | Additional data to pass to server | [optional]
**any_string_name** | dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | frozendict.frozendict, tuple, decimal.Decimal, str, bytes, BoolClass, NoneClass, FileIO | any string name can be used but the value must be the correct type | [optional]

### path_params
#### RequestPathParameters.Params
This is a TypedDict

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
petId | [Parameter0.schema](#parameter0-schema), decimal.Decimal, int | | 


#### Parameter0

##### Description
ID of pet to update

##### Parameter0 Schema

###### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int | decimal.Decimal |  | value must be a 64 bit integer

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

##### Type Info
Ref Class | Input Type | Accessed Type | Description
--------- | ---------- | ------------- | ------------
[ApiResponse](../../components/schema/api_response.md) | dict, frozendict.frozendict | frozendict.frozendict |

## Security

Set auth info by setting ApiConfiguration.security_scheme_info to a dict where the
key is the below security scheme quoted name, and the value is an instance of the linked
component security scheme class.
Select the security index by setting ApiConfiguration.security_index_info or by
passing in security_index into the endpoint method.
See how to do this in the code sample.
- these securities are specific to this to this endpoint

| Security Index | Security Scheme to Scope Names |
| -------------- | ------------------------------ |
| 0       | ["petstore_auth"](../../components/security_schemes/security_scheme_petstore_auth.md) [write:pets, read:pets]<br> |

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
from petstore_api.apis.tags import pet_api
from petstore_api.paths.fake_pet_id_upload_image_with_required_file.post import operation
from pprint import pprint
# security_index 0
from petstore_api.components.security_schemes import security_scheme_petstore_auth

# security_scheme_info for security_index 0
security_scheme_info: api_configuration.SecuritySchemeInfo = {
    "petstore_auth": security_scheme_petstore_auth.PetstoreAuth(
    ),
}

used_configuration = api_configuration.ApiConfiguration(
    security_scheme_info=security_scheme_info,
)
# Enter a context with an instance of the API client
with petstore_api.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = pet_api.PetApi(api_client)

    # example passing only required values which don't have defaults set
    path_params: operation.RequestPathParameters.Params = {
        'petId': 1,
    }
    try:
        # uploads an image (required)
        api_response = api_instance.upload_file_with_required_file(
            path_params=path_params,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling PetApi->upload_file_with_required_file: %s\n" % e)

    # example passing only optional values
    path_params = {
        'petId': 1,
    }
    body = dict(
        additional_metadata="additional_metadata_example",
        required_file=open('/path/to/file', 'rb'),
    )
    try:
        # uploads an image (required)
        api_response = api_instance.upload_file_with_required_file(
            path_params=path_params,
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling PetApi->upload_file_with_required_file: %s\n" % e)
```

[[Back to top]](#top)
[[Back to PetApi API]](../../apis/tags/pet_api.md)
[[Back to Endpoints]](../../../README.md#Endpoints) [[Back to README]](../../../README.md)
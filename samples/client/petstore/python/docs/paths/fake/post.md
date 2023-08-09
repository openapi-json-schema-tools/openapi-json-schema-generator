petstore_api.paths.fake.operation
# Operation Method Name

| Method Name | Api Class | Notes |
| ----------- | --------- | ----- |
| endpoint_parameters | [FakeApi](../../apis/tags/fake_api.md) | This api is only for tag=fake |
| post | ApiForPost | This api is only for this endpoint |
| post | Fake | This api is only for path=/fake |

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
| Summary | Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트  |
| Description | Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트  |
| Path | "/fake" |
| HTTP Method | post |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#requestbody) | typing.Union[[RequestBody.content.application_x_www_form_urlencoded.schema](#RequestBody-content-applicationxwwwformurlencoded-schema), Unset, dict, schemas.immutabledict] | optional, default is unset |
content_type | str | optional, default is 'application/x-www-form-urlencoded' | Selects the schema and serialization of the request body
security_index | typing.Optional[int] | default is None | Allows one to select a different [security](#security) definition. If not None, must be one of [0]
server_index | typing.Optional[int] | default is None | Allows one to select a different [server](#servers). If not None, must be one of [0, 1, 2]
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_response.ApiResponseWithoutDeserialization will be returned

### RequestBody

#### Content Type To Schema
Content-Type | Schema
------------ | -------
"application/x-www-form-urlencoded" | [content.application_x_www_form_urlencoded.Schema](#requestbody-content-applicationxwwwformurlencoded-schema)

#### RequestBody content ApplicationXWwwFormUrlencoded Schema
petstore_api.paths.fake.post.request_body.content.application_x_www_form_urlencoded.schema

##### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[SchemaDictInput](#requestbody-content-applicationxwwwformurlencoded-schema-schemadictinput), [SchemaDict](#requestbody-content-applicationxwwwformurlencoded-schema-schemadict) | [SchemaDict](#requestbody-content-applicationxwwwformurlencoded-schema-schemadict) |

##### RequestBody content ApplicationXWwwFormUrlencoded Schema SchemaDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**byte** | str | None |
**double** | float, int | None | value must be a 64 bit float
**number** | float, int | None |
**pattern_without_delimiter** | str | None |
**integer** | int | None | [optional]
**int32** | int | None | [optional] value must be a 32 bit integer
**int64** | int | None | [optional] value must be a 64 bit integer
**float** | float, int | None | [optional] value must be a 32 bit float
**string** | str | None | [optional]
**binary** | bytes, io.FileIO, io.BufferedReader | None | [optional]
**date** | str, datetime.date | None | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD
**dateTime** | str, datetime.datetime | None | [optional] if omitted the server will use the default value of 2010-02-01T10:20:10.111110+01:00 value must conform to RFC-3339 date-time
**password** | str | None | [optional]
**callback** | str | None | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

##### RequestBody content ApplicationXWwwFormUrlencoded Schema SchemaDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
###### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**byte** | str | None |
**double** | float, int | None | value must be a 64 bit float
**number** | float, int | None |
**pattern_without_delimiter** | str | None |
**integer** | int, schemas.Unset | None | [optional]
**int32** | int, schemas.Unset | None | [optional] value must be a 32 bit integer
**int64** | int, schemas.Unset | None | [optional] value must be a 64 bit integer
**string** | str, schemas.Unset | None | [optional]
**binary** | bytes, io.FileIO, io.BufferedReader, schemas.Unset | None | [optional]
**date** | str, datetime.date, schemas.Unset | None | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD
**dateTime** | str, datetime.datetime, schemas.Unset | None | [optional] if omitted the server will use the default value of 2010-02-01T10:20:10.111110+01:00 value must conform to RFC-3339 date-time
**password** | str, schemas.Unset | None | [optional]
**callback** | str, schemas.Unset | None | [optional]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

###### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**byte** | str | None |
**double** | float, int | None | value must be a 64 bit float
**number** | float, int | None |
**pattern_without_delimiter** | str | None |
**integer** | int, schemas.Unset | None | [optional]
**int32** | int, schemas.Unset | None | [optional] value must be a 32 bit integer
**int64** | int, schemas.Unset | None | [optional] value must be a 64 bit integer
**string** | str, schemas.Unset | None | [optional]
**binary** | bytes, io.FileIO, schemas.Unset | None | [optional]
**date** | str, schemas.Unset | None | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD
**dateTime** | str, schemas.Unset | None | [optional] if omitted the server will use the default value of 2010-02-01T10:20:10.111110+01:00 value must conform to RFC-3339 date-time
**password** | str, schemas.Unset | None | [optional]
**callback** | str, schemas.Unset | None | [optional]

###### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [SchemaDictInput](#requestbody-content-applicationxwwwformurlencoded-schema-schemadictinput), [SchemaDict](#requestbody-content-applicationxwwwformurlencoded-schema-schemadict) | [SchemaDict](#requestbody-content-applicationxwwwformurlencoded-schema-schemadict) | a constructor
&lowbar;&lowbar;getitem&lowbar;&lowbar; | str | schemas.OUTPUT_BASE_TYPES | This model has invalid python names so this method is used under the hood when you access instance["float"], 
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | provides type safety for additional properties

## Return Types

HTTP Status Code | Class | Description
------------- | ------------- | -------------
n/a | api_response.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [SuccessDescriptionOnly.response_cls](../../components/responses/response_success_description_only.md#response_success_description_onlyresponse_cls) | Success
404 | [ResponseFor404.response_cls](#responsefor404-response_cls) | User not found

## ResponseFor404

### Description
User not found

### ResponseFor404 response_cls
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

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
| 0       | ["http_basic_test"](../../components/security_schemes/security_scheme_http_basic_test.md) []<br> |

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
# security_index 0
from petstore_api.components.security_schemes import security_scheme_http_basic_test

# security_scheme_info for security_index 0
security_scheme_info: api_configuration.SecuritySchemeInfo = {
    "http_basic_test": security_scheme_http_basic_test.HttpBasicTest(
        user_id='someUserIdOrName',
        password='somePassword',
    ),
}

used_configuration = api_configuration.ApiConfiguration(
    security_scheme_info=security_scheme_info,
)
# Enter a context with an instance of the API client
with petstore_api.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = fake_api.FakeApi(api_client)

    # example passing only optional values
    body = {
        "integer": 10,
        "int32": 20,
        "int64": 1,
        "number": 32.1,
        "_float": 3.14,
        "double": 67.8,
        "string": "A",
        "pattern_without_delimiter": "AUR,rZ#UM/?R,Fp^l6$ARjbhJk C>",
        "byte": 'YQ==',
        "binary": open('/path/to/file', 'rb'),
        "date": "1970-01-01",
        "date_time": "2020-02-02T20:20:20.222220Z",
        "password": "password_example",
        "callback": "callback_example",
    }
    try:
        # Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
        api_response = api_instance.endpoint_parameters(
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->endpoint_parameters: %s\n" % e)
```

[[Back to top]](#top)
[[Back to FakeApi API]](../../apis/tags/fake_api.md)
[[Back to Endpoints]](../../../README.md#Endpoints) [[Back to README]](../../../README.md)
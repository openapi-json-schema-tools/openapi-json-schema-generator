petstore_api.paths.user_login.operation
# Operation Method Name

| Method Name | Api Class | Notes |
| ----------- | --------- | ----- |
| login_user | [UserApi](../../apis/tags/user_api.md) | This api is only for tag=user |
| get | ApiForGet | This api is only for this endpoint |
| get | UserLogin | This api is only for path=/user/login |

## Table of Contents
- [General Info](#general-info)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Servers](#servers)
- [Code Sample](#code-sample)

## General Info
| Field | Value |
| ----- | ----- |
| Summary | Logs user into the system |
| Path | "/user/login" |
| HTTP Method | get |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[query_params](#query_params) | [QueryParametersDictInput](#queryparameters-queryparametersdictinput), [QueryParametersDict](#queryparameters-queryparametersdict) | |
accept_content_types | typing.Tuple[str] | default is ("application/xml", "application/json", ) | Tells the server the content type(s) that are accepted by the client
server_index | typing.Optional[int] | default is None | Allows one to select a different [server](#servers). If not None, must be one of [0, 1, 2]
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_response.ApiResponseWithoutDeserialization will be returned
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
**password** | str |  |
**username** | str |  |

#### QueryParameters QueryParametersDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]
```
##### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**password** | str |  |
**username** | str |  |

##### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**password** | str |  |
**username** | str |  |

##### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [QueryParametersDictInput](#queryparameters-queryparametersdictinput), [QueryParametersDict](#queryparameters-queryparametersdict) | [QueryParametersDict](#queryparameters-queryparametersdict) | a constructor

## Return Types

HTTP Status Code | Class | Description
------------- | ------------- | -------------
n/a | api_response.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ResponseFor200.ApiResponse](#responsefor200-apiresponse) | successful operation
400 | [ResponseFor400.ApiResponse](#responsefor400-apiresponse) | Invalid username/password supplied

## ResponseFor200

### Description
successful operation

### ResponseFor200 ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#responsefor200-body) | typing.Union[[content.application_xml.schema](#responsefor200-content-applicationxml-schema), [content.application_json.schema](#responsefor200-content-applicationjson-schema)] |  |
[headers](#headers) | [Headers](#headers) |  |

### ResponseFor200 Body
Content-Type | Schema
------------ | -------
"application/xml" | [content.application_xml.Schema](#responsefor200-content-applicationxml-schema)
"application/json" | [content.application_json.Schema](#responsefor200-content-applicationjson-schema)

### Headers
Key | Accessed Type | Description  | Notes
------------- | ------------- | ------------- | -------------
X-Rate-Limit | [headers.header_x_rate_limit.content.application_json.schema](#responsefor200-headers-xratelimit-content-applicationjson-schema) | | 
int32 | [Int32JsonContentTypeHeader.content.application_json.schema](../../../components/headers/header_int32_json_content_type_header.md#content-applicationjson-schema) | | 
X-Expires-After | [headers.header_x_expires_after.schema](#responsefor200-headers-xexpiresafter-schema) | | optional
ref-content-schema-header | [RefContentSchemaHeader.content.application_json.schema](../../../components/headers/header_ref_content_schema_header.md#content-applicationjson-schema) | | 
numberHeader | [NumberHeader.schema](../../../components/headers/header_number_header.md#schema) | | optional

### Body Details
#### ResponseFor200 content ApplicationXml Schema
petstore_api.paths.user_login.get.responses.response_200.content.application_xml.schema
```
type: schemas.Schema
```

##### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
str | str |
#### ResponseFor200 content ApplicationJson Schema
petstore_api.paths.user_login.get.responses.response_200.content.application_json.schema
```
type: schemas.Schema
```

##### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
str | str |

### Header Details
#### ResponseFor200 headers XRateLimit

##### Description
calls per hour allowed by the user

##### Content Type To Schema
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema](#responsefor200-headers-xratelimit-content-applicationjson-schema)

##### ResponseFor200 headers XRateLimit content ApplicationJson Schema
petstore_api.paths.user_login.get.responses.response_200.headers.header_x_rate_limit.content.application_json.schema
```
type: schemas.Schema
```

###### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
int | int | value must be a 32 bit integer
#### ResponseFor200 headers XExpiresAfter

##### Description
date in UTC when token expires

##### ResponseFor200 headers XExpiresAfter Schema
petstore_api.paths.user_login.get.responses.response_200.headers.header_x_expires_after.schema
```
type: schemas.Schema
```

###### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
str, datetime.datetime | str | value must conform to RFC-3339 date-time

## ResponseFor400

### Description
Invalid username/password supplied

### ResponseFor400 ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

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
from petstore_api.apis.tags import user_api
from petstore_api.paths.user_login.get import operation
from pprint import pprint
used_configuration = api_configuration.ApiConfiguration(
)
# Enter a context with an instance of the API client
with petstore_api.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = user_api.UserApi(api_client)

    # example passing only required values which don't have defaults set
    query_params: operation.QueryParametersDictInput = {
        'username': "username_example",
        'password': "password_example",
    }
    try:
        # Logs user into the system
        api_response = api_instance.login_user(
            query_params=query_params,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling UserApi->login_user: %s\n" % e)
```

[[Back to top]](#top)
[[Back to UserApi API]](../../apis/tags/user_api.md)
[[Back to Endpoints]](../../../README.md#Endpoints) [[Back to README]](../../../README.md)
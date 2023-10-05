some_api.paths.system_restore.operation
# Operation Method Name

| Method Name | Api Class | Notes |
| ----------- | --------- | ----- |
| system_restore_post | [DefaultApi](../../apis/tags/default_api.md) | This api is only for tag=default |
| post | ApiForPost | This api is only for this endpoint |
| post | SystemRestore | This api is only for path=/system/restore |

## Table of Contents
- [General Info](#general-info)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Servers](#servers)
- [Code Sample](#code-sample)

## General Info
| Field | Value |
| ----- | ----- |
| Description | Restore the key store and user store from a backup file. If NetHSM is *Unprovisioned*, then the configuration is restored.  |
| Path | "/system/restore" |
| HTTP Method | post |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#requestbody) | typing.Union[bytes, io.FileIO, io.BufferedReader] | required |
[query_params](#query_params) | [QueryParametersDictInput](#queryparameters-queryparametersdictinput), [QueryParametersDict](#queryparameters-queryparametersdict) | |
content_type | str | optional, default is 'application/octet-stream' | Selects the schema and serialization of the request body. value must be one of ['application/octet-stream']
server_index | typing.Optional[int] | default is None | Allows one to select a different [server](#servers). If not None, must be one of [0]
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_response.ApiResponseWithoutDeserialization will be returned

### RequestBody

#### Content Type To Schema
Content-Type | Schema
------------ | -------
"application/octet-stream" | [content.application_octet_stream.Schema](#requestbody-content-applicationoctetstream-schema)

#### RequestBody content ApplicationOctetStream Schema
some_api.paths.system_restore.post.request_body.content.application_octet_stream.schema
```
type: schemas.Schema
```

##### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
bytes, io.FileIO, io.BufferedReader | bytes, io.FileIO |
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
**backupPassphrase** | str |  |
**systemTime** | str, datetime.datetime |  | [optional]

#### QueryParameters QueryParametersDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]
```
##### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**backupPassphrase** | str |  |
**systemTime** | str, datetime.datetime, schemas.Unset |  | [optional]

##### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**backupPassphrase** | str |  |
**systemTime** | str, schemas.Unset |  | [optional]

##### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [QueryParametersDictInput](#queryparameters-queryparametersdictinput), [QueryParametersDict](#queryparameters-queryparametersdict) | [QueryParametersDict](#queryparameters-queryparametersdict) | a constructor

## Return Types

HTTP Status Code | Class | Description
------------- | ------------- | -------------
n/a | api_response.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
204 | [ResponseFor204.ApiResponse](#responsefor204-apiresponse) | Successful restore from backup data.
400 | [ResponseFor400.ApiResponse](#responsefor400-apiresponse) | Bad request - restore did not apply.
406 | [ResponseFor406.ApiResponse](#responsefor406-apiresponse) | Content type in Accept header not supported.
412 | [ResponseFor412.ApiResponse](#responsefor412-apiresponse) | Precondition failed (NetHSM was not *Unprovisioned* or *Operational*). 

## ResponseFor204

### Description
Successful restore from backup data.

### ResponseFor204 ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## ResponseFor400

### Description
Bad request - restore did not apply.

### ResponseFor400 ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## ResponseFor406

### Description
Content type in Accept header not supported.

### ResponseFor406 ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## ResponseFor412

### Description
Precondition failed (NetHSM was not *Unprovisioned* or *Operational*). 

### ResponseFor412 ApiResponse
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
- defaults to server_index=0, server.url = https://nethsmdemo.nitrokey.com/api/v1

server_index | Class | Description
------------ | ----- | ------------
0 | [Server0](../../servers/server_0.md) |

## Code Sample

```python
import some_api
from some_api.configurations import api_configuration
from some_api.apis.tags import default_api
from some_api.paths.system_restore.post import operation
from pprint import pprint
used_configuration = api_configuration.ApiConfiguration(
)
# Enter a context with an instance of the API client
with some_api.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = default_api.DefaultApi(api_client)

    # example passing only required values which don't have defaults set
    query_params: operation.QueryParametersDictInput = {
        'backupPassphrase': passphrase.Passphrase.validate("backupPassphrase_example"),
    }
    body = open('/path/to/file', 'rb')
    try:
        api_response = api_instance.system_restore_post(
            query_params=query_params,
            body=body,
        )
        pprint(api_response)
    except some_api.ApiException as e:
        print("Exception when calling DefaultApi->system_restore_post: %s\n" % e)

    # example passing only optional values
    query_params: operation.QueryParametersDictInput = {
        'backupPassphrase': passphrase.Passphrase.validate("backupPassphrase_example"),
        'systemTime': "1970-01-01T00:00:00.00Z",
    }
    body = open('/path/to/file', 'rb')
    try:
        api_response = api_instance.system_restore_post(
            query_params=query_params,
            body=body,
        )
        pprint(api_response)
    except some_api.ApiException as e:
        print("Exception when calling DefaultApi->system_restore_post: %s\n" % e)
```

[[Back to top]](#top)
[[Back to DefaultApi API]](../../apis/tags/default_api.md)
[[Back to Endpoints]](../../../README.md#Endpoints) [[Back to README]](../../../README.md)
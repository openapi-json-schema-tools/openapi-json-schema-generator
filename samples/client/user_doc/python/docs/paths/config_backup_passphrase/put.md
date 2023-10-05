some_api.paths.config_backup_passphrase.operation
# Operation Method Name

| Method Name | Api Class | Notes |
| ----------- | --------- | ----- |
| config_backup_passphrase_put | [DefaultApi](../../apis/tags/default_api.md) | This api is only for tag=default |
| put | ApiForPut | This api is only for this endpoint |
| put | ConfigBackupPassphrase | This api is only for path=/config/backup-passphrase |

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
| Description | Update the backup passphrase. |
| Path | "/config/backup-passphrase" |
| HTTP Method | put |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#requestbody) | typing.Union[[backup_passphrase_config.BackupPassphraseConfigDictInput](../../components/schema/backup_passphrase_config.md#backuppassphraseconfigdictinput), [backup_passphrase_config.BackupPassphraseConfigDict](../../components/schema/backup_passphrase_config.md#backuppassphraseconfigdict)] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body. value must be one of ['application/json']
security_index | typing.Optional[int] | default is None | Allows one to select a different [security](#security) definition. If not None, must be one of [0]
server_index | typing.Optional[int] | default is None | Allows one to select a different [server](#servers). If not None, must be one of [0]
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_response.ApiResponseWithoutDeserialization will be returned

### RequestBody

#### Content Type To Schema
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema](#requestbody-content-applicationjson-schema)

#### RequestBody content ApplicationJson Schema
some_api.paths.config_backup_passphrase.put.request_body.content.application_json.schema
```
type: schemas.Schema
```

##### Ref Schema Info
Ref Schema | Input Type | Output Type
---------- | ---------- | -----------
[**backup_passphrase_config.BackupPassphraseConfig**](../../components/schema/backup_passphrase_config.md) | [backup_passphrase_config.BackupPassphraseConfigDictInput](../../components/schema/backup_passphrase_config.md#backuppassphraseconfigdictinput), [backup_passphrase_config.BackupPassphraseConfigDict](../../components/schema/backup_passphrase_config.md#backuppassphraseconfigdict) | [backup_passphrase_config.BackupPassphraseConfigDict](../../components/schema/backup_passphrase_config.md#backuppassphraseconfigdict)

## Return Types

HTTP Status Code | Class | Description
------------- | ------------- | -------------
n/a | api_response.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
204 | [ResponseFor204.ApiResponse](#responsefor204-apiresponse) | Successful change of passphrase.
400 | [ResponseFor400.ApiResponse](#responsefor400-apiresponse) | Bad request - weak passphrase.
401 | [ResponseFor401.ApiResponse](#responsefor401-apiresponse) | Authentication required but none provided.
403 | [ResponseFor403.ApiResponse](#responsefor403-apiresponse) | Access denied.
406 | [ResponseFor406.ApiResponse](#responsefor406-apiresponse) | Content type in Accept header not supported.
412 | [ResponseFor412.ApiResponse](#responsefor412-apiresponse) | Precondition failed (NetHSM was not *Operational*).

## ResponseFor204

### Description
Successful change of passphrase.

### ResponseFor204 ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## ResponseFor400

### Description
Bad request - weak passphrase.

### ResponseFor400 ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## ResponseFor401

### Description
Authentication required but none provided.

### ResponseFor401 ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## ResponseFor403

### Description
Access denied.

### ResponseFor403 ApiResponse
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
Precondition failed (NetHSM was not *Operational*).

### ResponseFor412 ApiResponse
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
| 0       | ["basic"](../../components/security_schemes/security_scheme_basic.md) []<br> |

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
from pprint import pprint
# security_index 0
from some_api.components.security_schemes import security_scheme_basic

# security_scheme_info for security_index 0
security_scheme_info: api_configuration.SecuritySchemeInfo = {
    "basic": security_scheme_basic.Basic(
        user_id='someUserIdOrName',
        password='somePassword',
    ),
}

used_configuration = api_configuration.ApiConfiguration(
    security_scheme_info=security_scheme_info,
)
# Enter a context with an instance of the API client
with some_api.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = default_api.DefaultApi(api_client)

    # example passing only required values which don't have defaults set
    body = backup_passphrase_config.BackupPassphraseConfig.validate({
        "passphrase": passphrase.Passphrase.validate("passphrase_example"),
    })
    try:
        api_response = api_instance.config_backup_passphrase_put(
            body=body,
        )
        pprint(api_response)
    except some_api.ApiException as e:
        print("Exception when calling DefaultApi->config_backup_passphrase_put: %s\n" % e)
```

[[Back to top]](#top)
[[Back to DefaultApi API]](../../apis/tags/default_api.md)
[[Back to Endpoints]](../../../README.md#Endpoints) [[Back to README]](../../../README.md)
petstore_api.paths.pet_pet_id.operation
# Operation Method Name

| Method Name | Api Class | Notes |
| ----------- | --------- | ----- |
| update_pet_with_form | [PetApi](../../apis/tags/pet_api.md) | This api is only for tag=pet |
| post | ApiForPost | This api is only for this endpoint |
| post | PetPetId | This api is only for path=/pet/{petId} |

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
| Summary | Updates a pet in the store with form data |
| Description |  |
| Path | "/pet/{petId}" |
| HTTP Method | post |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#requestbody) | typing.Union[[schema.SchemaDictInput](../../paths/pet_pet_id/post/request_body/content/application_x_www_form_urlencoded/schema.md#schemadictinput), [schema.SchemaDict](../../paths/pet_pet_id/post/request_body/content/application_x_www_form_urlencoded/schema.md#schemadict), schemas.Unset] | optional, default is unset |
[path_params](#path_params) | [PathParametersDictInput](#pathparameters-pathparametersdictinput), [PathParametersDict](#pathparameters-pathparametersdict) | |
content_type | str | optional, default is 'application/x-www-form-urlencoded' | Selects the schema and serialization of the request body. value must be one of ['application/x-www-form-urlencoded']
security_index | typing.Optional[int] | default is None | Allows one to select a different [security](#security) definition. If not None, must be one of [0, 1]
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
```
type: schemas.Schema
```

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
**name** | str | Updated name of the pet | [optional]
**status** | str | Updated status of the pet | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.FileIO | any string name can be used but the value must be the correct type | [optional]

##### RequestBody content ApplicationXWwwFormUrlencoded Schema SchemaDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
###### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**name** | str, schemas.Unset | Updated name of the pet | [optional]
**status** | str, schemas.Unset | Updated status of the pet | [optional]
**kwargs** | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

###### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**name** | str, schemas.Unset | Updated name of the pet | [optional]
**status** | str, schemas.Unset | Updated status of the pet | [optional]

###### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [SchemaDictInput](#requestbody-content-applicationxwwwformurlencoded-schema-schemadictinput), [SchemaDict](#requestbody-content-applicationxwwwformurlencoded-schema-schemadict) | [SchemaDict](#requestbody-content-applicationxwwwformurlencoded-schema-schemadict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO, schemas.Unset | provides type safety for additional properties
### path_params
### PathParameters
```
type: schemas.Schema
```

#### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[PathParametersDictInput](#pathparameters-pathparametersdictinput), [PathParametersDict](#pathparameters-pathparametersdict) | [PathParametersDict](#pathparameters-pathparametersdict) |

#### PathParameters PathParametersDictInput
```
type: typing.TypedDict
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**petId** | int |  |

#### PathParameters PathParametersDict
```
base class: schemas.immutabledict[str, int]

```
##### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**petId** | int |  |

##### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**petId** | int |  |

##### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [PathParametersDictInput](#pathparameters-pathparametersdictinput), [PathParametersDict](#pathparameters-pathparametersdict) | [PathParametersDict](#pathparameters-pathparametersdict) | a constructor

## Return Types

HTTP Status Code | Class | Description
------------- | ------------- | -------------
n/a | api_response.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
405 | [ResponseFor405.ApiResponse](#responsefor405-apiresponse) | Invalid input

## ResponseFor405

### Description
Invalid input

### ResponseFor405 ApiResponse
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
| 0       | ["api_key"](../../components/security_schemes/security_scheme_api_key.md) []<br> |
| 1       | ["petstore_auth"](../../components/security_schemes/security_scheme_petstore_auth.md) [write:pets, read:pets]<br> |

## Servers

Set the available servers by defining your used servers in ApiConfiguration.server_info
Then select your server by setting a server index in ApiConfiguration.server_index_info or by
passing server_index in to the endpoint method.
- these servers are specific to this endpoint
- defaults to server_index=0, server.url = http://petstore.swagger.io:80/v2

server_index | Class | Description
------------ | ----- | ------------
0 | [Server0](#server0) | petstore server
1 | [Server1](#server1) | The local server
2 | [Server2](#server2) | staging server with no variables

petstore_api.servers.server_0
### Server0

#### Description
petstore server

#### Url
http://{server}.swagger.io:{port}/v2

#### Variables
Key | Type | Description | Notes
--- | ---- | ----------- | ------
**server** | str | server host prefix |  must be one of ["petstore", "qa-petstore", "dev-petstore"] if omitted the client will use the default value of petstore
**port** | str | the port |  must be one of ["80", "8080"] if omitted the client will use the default value of 80

[[Back to top]](#top) [[Back to Servers]](../../README.md#Servers) [[Back to README]](../../README.md)

petstore_api.servers.server_1
### Server1

#### Description
The local server

#### Url
https://localhost:8080/{version}

#### Variables
Key | Type | Description | Notes
--- | ---- | ----------- | ------
**version** | str |  |  must be one of ["v1", "v2"] if omitted the client will use the default value of v2

[[Back to top]](#top) [[Back to Servers]](../../README.md#Servers) [[Back to README]](../../README.md)

petstore_api.servers.server_2
### Server2

#### Description
staging server with no variables

#### Url
https://localhost:8080

[[Back to top]](#top) [[Back to Servers]](../../README.md#Servers) [[Back to README]](../../README.md)

## Code Sample

```python
import petstore_api
from petstore_api.configurations import api_configuration
from petstore_api.apis.tags import pet_api
from petstore_api.paths.pet_pet_id.post import operation
from pprint import pprint
# security_index 0
from petstore_api.components.security_schemes import security_scheme_api_key
# security_index 1
from petstore_api.components.security_schemes import security_scheme_petstore_auth

# security_scheme_info for security_index 0
security_scheme_info: api_configuration.SecuritySchemeInfo = {
    "api_key": security_scheme_api_key.ApiKey(
        api_key='sampleApiKeyValue'
    ),
}


# security_scheme_info for security_index 1
security_scheme_info: api_configuration.SecuritySchemeInfo = {
    "petstore_auth": security_scheme_petstore_auth.PetstoreAuth(
    ),
}

security_index_info: api_configuration.SecurityIndexInfo = {
    "security": 0,  # default value
    "paths//pet/{petId}/post/security": 0,
    # only set one "paths//pet/{petId}/post/security": 1,
}
used_configuration = api_configuration.ApiConfiguration(
    security_scheme_info=security_scheme_info,
    security_index_info=security_index_info
)
# Enter a context with an instance of the API client
with petstore_api.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = pet_api.PetApi(api_client)

    # example passing only required values which don't have defaults set
    path_params: operation.PathParametersDictInput = {
        'petId': 1,
    }
    try:
        # Updates a pet in the store with form data
        api_response = api_instance.update_pet_with_form(
            path_params=path_params,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling PetApi->update_pet_with_form: %s\n" % e)

    # example passing only optional values
    path_params = {
        'petId': 1,
    }
    body = {
        "name": "name_example",
        "status": "status_example",
    }
    try:
        # Updates a pet in the store with form data
        api_response = api_instance.update_pet_with_form(
            path_params=path_params,
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling PetApi->update_pet_with_form: %s\n" % e)
```

[[Back to top]](#top)
[[Back to PetApi API]](../../apis/tags/pet_api.md)
[[Back to Endpoints]](../../../README.md#Endpoints) [[Back to README]](../../../README.md)
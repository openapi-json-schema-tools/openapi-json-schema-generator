<a name="getpetbyid"></a>
# **get_pet_by_id**

## Table of Contents
- [General Info](#general-info)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Security](#security)
- [Code Sample](#code-sample)

## General Info
| Field | Value |
| ----- | ----- |
| Summary | Find pet by ID |
| Description | Returns a single pet |
| Path | "/pet/{petId}" |
| HTTP Method | get |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[path_params](#path_params) | [RequestPathParameters.Params](#requestpathparametersparams) | |
accept_content_types | typing.Tuple[str] | default is ("application/xml", "application/json", ) | Tells the server the content type(s) that are accepted by the client
server_index | typing.Optional[int] | default is None | Allows one to select a different server
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### path_params
#### RequestPathParameters.Params

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
petId | [Parameter0.schema](#parameter0-schema) | | 


#### Parameter0

##### Description
ID of pet to return

##### Parameter0 Schema

###### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 64 bit integer

## Return Types

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ResponseFor200.response_cls](#response_200response_cls) | successful operation
400 | [ResponseFor400.response_cls](#response_400response_cls) | Invalid ID supplied
404 | [ResponseFor404.response_cls](#response_404response_cls) | Pet not found

## responses ResponseFor200

### Description
successful operation

### response_cls
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#body) | typing.Union[[content.application_xml.schema](#responses-responsefor200-content-applicationxml-schema), [content.application_json.schema](#responses-responsefor200-content-applicationjson-schema), ] |  |
headers | Unset | headers were not defined |

### Body
Content-Type | Schema
------------ | -------
"application/xml" | [content.application_xml.Schema](#responses-responsefor200-content-applicationxml-schema)
"application/json" | [content.application_json.Schema](#responses-responsefor200-content-applicationjson-schema)

### Body Details
#### responses ResponseFor200 content ApplicationXml Schema

##### Type Info
Ref Class | Input Type | Accessed Type | Description
--------- | ---------- | ------------- | ------------
[Pet](../../../components/schema/pet.md) | dict, frozendict.frozendict,  | frozendict.frozendict,  |
#### responses ResponseFor200 content ApplicationJson Schema

##### Type Info
Ref Class | Input Type | Accessed Type | Description
--------- | ---------- | ------------- | ------------
[RefPet](../../../components/schema/ref_pet.md) | dict, frozendict.frozendict,  | frozendict.frozendict,  |

## responses ResponseFor400

### Description
Invalid ID supplied

### response_cls
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## responses ResponseFor404

### Description
Pet not found

### response_cls
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## Security

Set auth info by setting Configuration.auth_info to a dict where the
key is the below security schema quoted name, and the value is an instance of the linked
component security scheme class. See how to do this in the code sample.

| Security Index | Security Scheme to Scope Names |
| -------------- | ------------------------------ |
| 0       | ["api_key"](../../../components/security_schemes/security_scheme_api_key.md) []<br> |

## Code Sample

```python
import petstore_api
from petstore_api.configurations import api_configuration
from petstore_api.apis.tags import pet_api
from pprint import pprint
# security_index 0
from petstore_api.components.security_schemes import security_scheme_api_key


# auth_info for security_index 0
auth_info: configuration.AuthInfo = {
    "api_key": security_scheme_api_key.ApiKey(
        api_key='sampleApiKeyValue'
    ),
}

# See api_configuration.py for a list of all supported api configuration parameters
used_configuration = api_configuration.ApiConfiguration(
    auth_info = auth_info
)
# Enter a context with an instance of the API client
with petstore_api.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = pet_api.PetApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'petId': 1,
    }
    try:
        # Find pet by ID
        api_response = api_instance.get_pet_by_id(
            path_params=path_params,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling PetApi->get_pet_by_id: %s\n" % e)
```

[[Back to top]](#top) [[Back to API]](../PetApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)

petstore_api.paths.pet_find_by_tags.operation
# Operation Method Name

| Method Name | Api Class | Notes |
| ----------- | --------- | ----- |
| find_pets_by_tags | [PetApi](../../apis/tags/pet_api.md) | This api is only for tag=pet |
| get | ApiForGet | This api is only for this endpoint |
| get | PetFindByTags | This api is only for path=/pet/findByTags |

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
| Summary | Finds Pets by tags |
| Description | Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing. |
| Path | "/pet/findByTags" |
| HTTP Method | get |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[query_params](#query_params) | [RequestQueryParameters.Params](#requestqueryparametersparams), dict | |
security_index | typing.Optional[int] | default is None | int values: 0, 1 Allows one to select a different [security](#security) definition
- [Security](#security)
server_index | typing.Optional[int] | default is None | Allows one to select a different [server](#server)
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### query_params
#### RequestQueryParameters.Params
This is a TypedDict

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
tags | [Parameter0.schema](#parameter0-schema), list, tuple | | 


#### Parameter0

##### Description
Tags to filter by

##### Parameter0 Schema

###### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple | tuple |  |

###### List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str | str |  |

## Return Types

HTTP Status Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [RefSuccessfulXmlAndJsonArrayOfPet.response_cls](../../components/responses/response_ref_successful_xml_and_json_array_of_pet.md#response_ref_successful_xml_and_json_array_of_petresponse_cls) | successful operation, multiple content types
400 | [ResponseFor400.response_cls](#responsefor400-response_cls) | Invalid tag value

## ResponseFor400

### Description
Invalid tag value

### ResponseFor400 response_cls
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
| 0       | ["http_signature_test"](../../components/security_schemes/security_scheme_http_signature_test.md) []<br> |
| 1       | ["petstore_auth"](../../components/security_schemes/security_scheme_petstore_auth.md) [write:pets, read:pets]<br> |

## Servers

Set the available servers by defining your used servers in ApiConfiguration.server_info
Then select your server by setting a server index in ApiConfiguration.server_index_info or by
passing server_index in to the endpoint method.
- these servers are the general api servers
- defaults to server_index=0, server.url = http://petstore.swagger.io:80/v2

server_index | Class | Description
------------ | ----- | ------------
0 | [Server0](../../../servers/server_0.md) | petstore server
1 | [Server1](../../../servers/server_1.md) | The local server
2 | [Server2](../../../servers/server_2.md) | staging server with no variables

## Code Sample

```python
import petstore_api
from petstore_api.configurations import api_configuration
from petstore_api.apis.tags import pet_api
from petstore_api.paths.pet_find_by_tags.get import operation
from pprint import pprint
# security_index 0
from petstore_api.components.security_schemes import security_scheme_http_signature_test
# security_index 1
from petstore_api.components.security_schemes import security_scheme_petstore_auth

# security_scheme_info for security_index 0
security_scheme_info: api_configuration.SecuritySchemeInfo = {
    "http_signature_test": security_scheme_http_signature_test.HttpSignatureTest(
        signing_info=petstore_api.signing.HttpSigningConfiguration(
            key_id='my-key-id',
            private_key_path='rsa.pem',
            signing_scheme=petstore_api.signing.SCHEME_HS2019,
            signing_algorithm=petstore_api.signing.ALGORITHM_RSASSA_PSS,
            signed_headers=[
                petstore_api.signing.HEADER_REQUEST_TARGET,
                petstore_api.signing.HEADER_CREATED,
                petstore_api.signing.HEADER_EXPIRES,
                petstore_api.signing.HEADER_HOST,
                petstore_api.signing.HEADER_DATE,
                petstore_api.signing.HEADER_DIGEST,
                'Content-Type',
                'User-Agent'
            ],
            signature_max_validity=datetime.timedelta(minutes=5)
        )

    ),
}


# security_scheme_info for security_index 1
security_scheme_info: api_configuration.SecuritySchemeInfo = {
    "petstore_auth": security_scheme_petstore_auth.PetstoreAuth(
    ),
}

used_configuration = api_configuration.ApiConfiguration(
    security_scheme_info=security_scheme_info
)
# Enter a context with an instance of the API client
with petstore_api.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = pet_api.PetApi(api_client)

    # example passing only required values which don't have defaults set
    query_params: operation.RequestQueryParameters.Params = {
        'tags': [
        "tags_example"
    ],
    }
    try:
        # Finds Pets by tags
        api_response = api_instance.find_pets_by_tags(
            query_params=query_params,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling PetApi->find_pets_by_tags: %s\n" % e)
```

[[Back to top]](#top)
[[Back to PetApi API]](../../apis/tags/pet_api.md)
[[Back to Endpoints]](../../../README.md#Endpoints) [[Back to README]](../../../README.md)
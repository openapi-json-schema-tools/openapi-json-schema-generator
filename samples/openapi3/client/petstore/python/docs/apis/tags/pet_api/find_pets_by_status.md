<a name="findpetsbystatus"></a>
# **find_pets_by_status**

## Table of Contents
- [General Info](#general-info)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Security](#security)
- [Code Sample](#code-sample)

## General Info
| Field | Value |
| ----- | ----- |
| Summary | Finds Pets by status |
| Description | Multiple status values can be provided with comma separated strings |
| Path | "/pet/findByStatus" |
| HTTP Method | get |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[query_params](#query_params) | [RequestQueryParameters.Params](#requestqueryparametersparams) | |
accept_content_types | typing.Tuple[str] | default is ("application/xml", "application/json", ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### query_params
#### RequestQueryParameters.Params

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
status | [Parameter0.schema](#parameter_0schema) | | 


#### Parameter Parameter0

##### Description
Status values that need to be considered for filter

##### Schema

###### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  |

###### List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | must be one of ["available", "pending", "sold", ] if omitted the server will use the default value of "available"

## Return Types

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [SuccessfulXmlAndJsonArrayOfPet.response_cls](../../../components/responses/response_successful_xml_and_json_array_of_pet.md#response_successful_xml_and_json_array_of_petresponse_cls) | successful operation, multiple content types
400 | [ResponseFor400.response_cls](#response_400response_cls) | Invalid status value

## responses ResponseFor400

### Description
Invalid status value

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
| 0       | ["http_signature_test"](../../../components/security_schemes/security_scheme_http_signature_test.md) []<br> |
| 1       | ["petstore_auth"](../../../components/security_schemes/security_scheme_petstore_auth.md) [write:pets, read:pets]<br> |

## Code Sample

```python
import petstore_api
from petstore_api import configuration
from petstore_api.apis.tags import pet_api
from pprint import pprint
# security_index 0
from petstore_api.components.security_schemes import security_scheme_http_signature_test
# security_index 1
from petstore_api.components.security_schemes import security_scheme_petstore_auth


# auth_info for security_index 0
auth_info: configuration.AuthInfo = {
    "http_signature_test": security_scheme_http_signature_test.HttpSignatureTest(
        signing_info=petstore_api.signing.HttpSigningConfiguration(
            key_id =                 'my-key-id',
            private_key_path =       'rsa.pem',
            signing_scheme =         petstore_api.signing.SCHEME_HS2019,
            signing_algorithm =      petstore_api.signing.ALGORITHM_RSASSA_PSS,
            signed_headers =         [petstore_api.signing.HEADER_REQUEST_TARGET,
                                        petstore_api.signing.HEADER_CREATED,
                                        petstore_api.signing.HEADER_EXPIRES,
                                        petstore_api.signing.HEADER_HOST,
                                        petstore_api.signing.HEADER_DATE,
                                        petstore_api.signing.HEADER_DIGEST,
                                        'Content-Type',
                                        'User-Agent'
                                        ],
            signature_max_validity = datetime.timedelta(minutes=5)
        )

    ),
}

# auth_info for security_index 1
auth_info: configuration.AuthInfo = {
    "petstore_auth": security_scheme_petstore_auth.PetstoreAuth(
    ),
}

# Defining the host is optional and defaults to http://petstore.swagger.io:80/v2
# See configuration.py for a list of all supported configuration parameters.
used_configuration = configuration.Configuration(
    host = "http://petstore.swagger.io:80/v2"
    auth_info = auth_info
)
# Enter a context with an instance of the API client
with petstore_api.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = pet_api.PetApi(api_client)

    # example passing only required values which don't have defaults set
    query_params = {
        'status': [
        "available"
    ],
    }
    try:
        # Finds Pets by status
        api_response = api_instance.find_pets_by_status(
            query_params=query_params,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling PetApi->find_pets_by_status: %s\n" % e)
```

[[Back to top]](#top) [[Back to API]](../PetApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)

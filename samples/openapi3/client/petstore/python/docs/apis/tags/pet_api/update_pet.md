<a name="updatepet"></a>
# **update_pet**

## Table of Contents
- [Summary](#summary)
- [Path](#path)
- [HTTP Method](#http-method)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Code Sample](#code-sample)

## Summary
Update an existing pet

## Path
"/pet"

## HTTP Method
put

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[**body**](../../../components/request_bodies/request_body_pet.md) | typing.Union[[Pet.content.application_json.schema](../../../components/request_bodies/request_body_pet.md#request_body_petcontentapplication_jsonschema), [Pet.content.application_xml.schema](../../../components/request_bodies/request_body_pet.md#request_body_petcontentapplication_xmlschema)] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
host_index | typing.Optional[int] | default is None | Allows one to select a different host
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

## Return Types

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
400 | [ResponseFor400.response_cls](#response_400response_cls) | Invalid ID supplied
404 | [ResponseFor404.response_cls](#response_404response_cls) | Pet not found
405 | [ResponseFor405.response_cls](#response_405response_cls) | Validation exception

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

## responses ResponseFor405

### Description
Validation exception

### response_cls
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## Code Sample

```python
import petstore_api
from petstore_api.apis.tags import pet_api
from pprint import pprint
# Defining the host is optional and defaults to http://petstore.swagger.io:80/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = petstore_api.Configuration(
    host = "http://petstore.swagger.io:80/v2"
)

# Enter a context with an instance of the API client
with petstore_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pet_api.PetApi(api_client)

    # example passing only required values which don't have defaults set
    body = pet.Pet(
        id=1,
        category=category.Category(
            id=1,
            name="default-name",
        ),
        name="doggie",
        photo_urls=[
            "photo_urls_example"
        ],
        tags=[
            tag.Tag(
                id=1,
                name="name_example",
            )
        ],
        status="available",
    )
    try:
        # Update an existing pet
        api_response = api_instance.update_pet(
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling PetApi->update_pet: %s\n" % e)
```

[[Back to top]](#top) [[Back to API]](../PetApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)

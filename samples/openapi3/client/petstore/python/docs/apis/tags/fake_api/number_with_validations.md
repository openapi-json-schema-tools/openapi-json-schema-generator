<a name="top"></a>
# **number_with_validations**
<a name="number_with_validations"></a>

## Table of Contents
- [Description](#description)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Code Sample](#code-sample)

## Description
Test serialization of outer number types

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#request_body) | typing.Union[[RequestBody.content.application_json.schema](#request_body_request_bodycontentapplication_jsonschema), Unset] | optional, default is unset |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ("application/json", ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="request_body" >body</a>

#### Description
Input number as post body

#### Content Type To Schema
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema](#)

#### 

##### Type Info
Ref Class | Input Type | Accessed Type | Description
--------- | ---------- | ------------- | ------------
[NumberWithValidations](../../components/schemas/number_with_validations.NumberWithValidations.md#number_with_validations) | decimal.Decimal, int, float,  | decimal.Decimal,  |

## Return Types

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ResponseFor200.response_cls](#response_200response_cls) | Output number

## 

### <a id="response_200description" >Description</a>
Output number

### <a id="response_200response_cls" >response_cls</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#body) | typing.Union[[content.application_json.schema](#), ] |  |
headers | Unset | headers were not defined |

### Body
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema](#)

### Body Details
#### 

##### Type Info
Ref Class | Input Type | Accessed Type | Description
--------- | ---------- | ------------- | ------------
[NumberWithValidations](../../components/schemas/number_with_validations.NumberWithValidations.md#number_with_validations) | decimal.Decimal, int, float,  | decimal.Decimal,  |

## Code Sample

```python
import petstore_api
from petstore_api.apis.tags import fake_api
from pprint import pprint
# Defining the host is optional and defaults to http://petstore.swagger.io:80/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = petstore_api.Configuration(
    host = "http://petstore.swagger.io:80/v2"
)

# Enter a context with an instance of the API client
with petstore_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fake_api.FakeApi(api_client)

    # example passing only optional values
    body = number_with_validations.NumberWithValidations(10)
    try:
        api_response = api_instance.number_with_validations(
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->number_with_validations: %s\n" % e)
```

[[Back to top]](#top) [[Back to API]](../FakeApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)

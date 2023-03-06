<a name="postadditionalpropertiesallowsaschemawhichshouldvalidaterequestbody"></a>
# **post_additionalproperties_allows_a_schema_which_should_validate_request_body**

## Table of Contents
- [General Info](#general-info)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Code Sample](#code-sample)

## General Info
| Field | Value |
| ----- | ----- |
| Path | "/requestBody/postAdditionalpropertiesAllowsASchemaWhichShouldValidateRequestBody" |
| HTTP Method | post |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#requestbody) | typing.Union[[RequestBody.content.application_json.schema](#request_body_request_bodycontentapplication_jsonschema)] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### RequestBody

#### Content Type To Schema
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema](#requestbody-content-applicationjson-schema)

#### RequestBody content ApplicationJson Schema

##### Type Info
Ref Class | Input Type | Accessed Type | Description
--------- | ---------- | ------------- | ------------
[AdditionalpropertiesAllowsASchemaWhichShouldValidate](../../components/schemas/additionalproperties_allows_a_schema_which_should_validate.md#additionalproperties_allows_a_schema_which_should_validate) | dict, frozendict.frozendict,  | frozendict.frozendict,  |

## Return Types

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ResponseFor200.response_cls](#response_200response_cls) | success

## responses ResponseFor200

### Description
success

### response_cls
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## Code Sample

```python
import unit_test_api
from unit_test_api import configuration
from unit_test_api.apis.tags import operation_request_body_api
from pprint import pprint
# Defining the host is optional and defaults to https://someserver.com/v1
# See configuration.py for a list of all supported configuration parameters.
used_configuration = configuration.Configuration(
    host = "https://someserver.com/v1"
)
# Enter a context with an instance of the API client
with unit_test_api.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = operation_request_body_api.OperationRequestBodyApi(api_client)

    # example passing only required values which don't have defaults set
    body = additionalproperties_allows_a_schema_which_should_validate.AdditionalpropertiesAllowsASchemaWhichShouldValidate(
        foo=None,
        bar=None,
    )
    try:
        api_response = api_instance.post_additionalproperties_allows_a_schema_which_should_validate_request_body(
            body=body,
        )
        pprint(api_response)
    except unit_test_api.ApiException as e:
        print("Exception when calling OperationRequestBodyApi->post_additionalproperties_allows_a_schema_which_should_validate_request_body: %s\n" % e)
```

[[Back to top]](#top) [[Back to API]](../OperationRequestBodyApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)

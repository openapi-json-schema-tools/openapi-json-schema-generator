<a name="bodywithfileschema"></a>
# **body_with_file_schema**

## Table of Contents
- [General Info](#general-info)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Code Sample](#code-sample)

## General Info
| Field | Value |
| ----- | ----- |
| Description | For this test, the body for this request much reference a schema named `File`. |
| Path | "/fake/body-with-file-schema" |
| HTTP Method | put |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#requestbody) | typing.Union[[RequestBody.content.application_json.schema](#request_body_request_bodycontentapplication_jsonschema)] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
server_index | typing.Optional[int] | default is None | Allows one to select a different server
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
[FileSchemaTestClass](../../../components/schema/file_schema_test_class.md) | dict, frozendict.frozendict,  | frozendict.frozendict,  |

## Return Types

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [SuccessDescriptionOnly.response_cls](../../../components/responses/response_success_description_only.md#response_success_description_onlyresponse_cls) | Success

## Code Sample

```python
import petstore_api
from petstore_api.configurations import api_configuration
from petstore_api.apis.tags import fake_api
from pprint import pprint
# See api_configuration.py for a list of all supported api configuration parameters
used_configuration = api_configuration.ApiConfiguration(
)
# Enter a context with an instance of the API client
with petstore_api.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = fake_api.FakeApi(api_client)

    # example passing only required values which don't have defaults set
    body = file_schema_test_class.FileSchemaTestClass(
        file=file.File(
            source_uri="source_uri_example",
        ),
        files=[
            file.File()
        ],
    )
    try:
        api_response = api_instance.body_with_file_schema(
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->body_with_file_schema: %s\n" % e)
```

[[Back to top]](#top) [[Back to API]](../FakeApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)

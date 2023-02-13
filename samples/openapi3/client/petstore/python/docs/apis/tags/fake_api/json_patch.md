<a name="top"></a>
# **json_patch**
<a name="json_patch"></a>

json patch

json patch route with a requestBody
## Table of Contents
- [Arguments](#Arguments)
- [Return Types](#return-types)

### Code Example

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
    body = json_patch_request.JSONPatchRequest([
        None
    ])
    try:
        # json patch
        api_response = api_instance.json_patch(
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->json_patch: %s\n" % e)
```
## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#request_body) | typing.Union[[RequestBody.content.application_json_patchjson.schema](#request_bodycontentapplication_json_patchjsonschema), Unset] | optional, default is unset |
content_type | str | optional, default is 'application/json-patch+json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="request_body" >body</a>
# <a id="request_body_request_bodycontentapplication_json_patchjsonschema" >RequestBody.content.application_json_patchjson.schema</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**JSONPatchRequest**](../../../components/schema/json_patch_request.JSONPatchRequest.md) |  | 


## Return Types

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [SuccessDescriptionOnly.response_cls](../../../components/responses/response_success_description_only.md#response_success_description_onlyresponse_cls) | Success

### Authorization

No authorization required

[[Back to top]](#top) [[Back to API]](../FakeApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)

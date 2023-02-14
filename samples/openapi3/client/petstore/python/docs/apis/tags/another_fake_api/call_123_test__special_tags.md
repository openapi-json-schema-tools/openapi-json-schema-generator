<a name="top"></a>
# **call_123_test__special_tags**
<a name="call_123_test__special_tags"></a>

## Table of Contents
- [Summary](#summary)
- [Description](#description)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Code Sample](#code-sample)

## Summary
To test special tags

## Description
To test special tags and operation ID starting with number

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[**body**](../../../components/request_bodies/request_body_client.md) | typing.Union[[Client.content.application_json.schema](../../../components/request_bodies/request_body_client.md#request_body_clientcontentapplication_jsonschema)] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ("application/json", ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

## Return Types

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ResponseFor200.response_cls](#response_200response_cls) | successful operation


### <a id="response_200description" >ResponseFor200.description</a>
successful operation

### <a id="response_200response_cls" >ResponseFor200.response_cls</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#response_200content) | typing.Union[[ResponseFor200.content.application_json.schema](#response_200contentapplication_jsonschema), ] |  |
headers | Unset | headers were not defined |

#### <a id="response_200content" >ResponseFor200.content</a>

##### <a id="response_200contentapplication_jsonschema" >ResponseFor200.content.application_json.schema</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**Client**](../../../components/schema/client.Client.md) |  | 


## Code Sample

```python
import petstore_api
from petstore_api.apis.tags import another_fake_api
from pprint import pprint
# Defining the host is optional and defaults to http://petstore.swagger.io:80/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = petstore_api.Configuration(
    host = "http://petstore.swagger.io:80/v2"
)

# Enter a context with an instance of the API client
with petstore_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = another_fake_api.AnotherFakeApi(api_client)

    # example passing only required values which don't have defaults set
    body = client.Client(
        client="client_example",
    )
    try:
        # To test special tags
        api_response = api_instance.call_123_test__special_tags(
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling AnotherFakeApi->call_123_test__special_tags: %s\n" % e)
```

[[Back to top]](#top) [[Back to API]](../AnotherFakeApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)

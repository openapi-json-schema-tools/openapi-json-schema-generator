<a name="top"></a>
# **create_users_with_list_input**
<a name="create_users_with_list_input"></a>

## Table of Contents
- [Summary](#summary)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Code Sample](#code-sample)

## Summary
Creates list of users with given input array

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[**body**](../../../components/request_bodies/request_body_ref_user_array.md) | typing.Union[[RefUserArray.content.application_json.schema](../../../components/request_bodies/request_body_ref_user_array.md#request_body_ref_user_arraycontentapplication_jsonschema)] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

## Return Types

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
default | [Default.response_cls](#response_defaultresponse_cls) | successful operation

## Default

### <a id="response_defaultdescription" >Description</a>
successful operation

### <a id="response_defaultresponse_cls" >response_cls</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## Code Sample

```python
import petstore_api
from petstore_api.apis.tags import user_api
from pprint import pprint
# Defining the host is optional and defaults to http://petstore.swagger.io:80/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = petstore_api.Configuration(
    host = "http://petstore.swagger.io:80/v2"
)

# Enter a context with an instance of the API client
with petstore_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = user_api.UserApi(api_client)

    # example passing only required values which don't have defaults set
    body = [
        user.User(
            id=1,
            username="username_example",
            first_name="first_name_example",
            last_name="last_name_example",
            email="email_example",
            password="password_example",
            phone="phone_example",
            user_status=1,
            object_with_no_declared_props=dict(),
            object_with_no_declared_props_nullable=dict(),
            any_type_prop=None,
            any_type_except_null_prop=None,
            any_type_prop_nullable=None,
        )
    ]
    try:
        # Creates list of users with given input array
        api_response = api_instance.create_users_with_list_input(
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling UserApi->create_users_with_list_input: %s\n" % e)
```

[[Back to top]](#top) [[Back to API]](../UserApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)

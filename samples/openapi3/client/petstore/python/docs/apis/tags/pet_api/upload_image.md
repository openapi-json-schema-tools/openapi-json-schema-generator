<a name="top"></a>
# **upload_image**
<a name="upload_image"></a>

## Table of Contents
- [Summary](#summary)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Authorization](#authorization)
- [Code Sample](#code-sample)

## Summary
uploads an image

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#request_body) | typing.Union[[RequestBody.content.multipart_form_data.schema](#request_body_request_bodycontentmultipart_form_dataschema), Unset] | optional, default is unset |
[path_params](#requestpathparameters) | [RequestPathParameters.Params](#RequestPathParametersParams) | |
content_type | str | optional, default is 'multipart/form-data' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ("application/json", ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="request_body" >body</a>

#### Content Type To Schema
Content-Type | Schema
------------ | -------
"multipart/form-data" | [content.multipart_form_data.Schema](#contentmultipart_form_dataschema)

#### <a id="multipart_form_dataschema" >content.multipart_form_data.schema</a>
[]

#### Schema

##### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

##### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**additionalMetadata** | str,  | str,  | Additional data to pass to server | [optional]
**file** | bytes, io.FileIO, io.BufferedReader,  | bytes, io.FileIO,  | file to upload | [optional]
**any_string_name** | dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | frozendict.frozendict, tuple, decimal.Decimal, str, bytes, BoolClass, NoneClass, FileIO | any string name can be used but the value must be the correct type | [optional]

### <a id="requestpathparameters" >path_params</a>
#### <a id="RequestPathParametersParams" >RequestPathParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
petId | [Parameter0.schema](#parameter_0schema) | | 

#### Parameter0

##### Description
ID of pet to update
##### <a id="parameter_0org.openapijsonschematools.codegen.model.CodegenKey@36ce54d3schema" >Parameter0.schema</a>
[]

##### Schema

###### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 64 bit integer

## Return Types

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [SuccessWithJsonApiResponse.response_cls](../../../components/responses/response_success_with_json_api_response.md#response_success_with_json_api_responseresponse_cls) | successful operation

## Authorization

[petstore_auth](../../../../README.md#petstore_auth)

## Code Sample

* OAuth Authentication (petstore_auth):
```python
import petstore_api
from petstore_api.apis.tags import pet_api
from pprint import pprint
# Defining the host is optional and defaults to http://petstore.swagger.io:80/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = petstore_api.Configuration(
    host = "http://petstore.swagger.io:80/v2"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure OAuth2 access token for authorization: petstore_auth
configuration = petstore_api.Configuration(
    host = "http://petstore.swagger.io:80/v2",
    access_token = 'YOUR_ACCESS_TOKEN'
)
# Enter a context with an instance of the API client
with petstore_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pet_api.PetApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'petId': 1,
    }
    try:
        # uploads an image
        api_response = api_instance.upload_image(
            path_params=path_params,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling PetApi->upload_image: %s\n" % e)

    # example passing only optional values
    path_params = {
        'petId': 1,
    }
    body = dict(
        additional_metadata="additional_metadata_example",
        file=open('/path/to/file', 'rb'),
    )
    try:
        # uploads an image
        api_response = api_instance.upload_image(
            path_params=path_params,
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling PetApi->upload_image: %s\n" % e)
```

[[Back to top]](#top) [[Back to API]](../PetApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)

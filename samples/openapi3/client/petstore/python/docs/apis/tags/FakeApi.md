<a name="__pageTop"></a>
# petstore_api.apis.tags.fake_api.FakeApi

All URIs are relative to *http://petstore.swagger.io:80/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**additional_properties_with_array_of_enums**](#additional_properties_with_array_of_enums) | **get** /fake/additional-properties-with-array-of-enums | Additional Properties with Array of Enums
[**array_model**](#array_model) | **post** /fake/refs/arraymodel | 
[**array_of_enums**](#array_of_enums) | **post** /fake/refs/array-of-enums | Array of Enums
[**body_with_file_schema**](#body_with_file_schema) | **put** /fake/body-with-file-schema | 
[**body_with_query_params**](#body_with_query_params) | **put** /fake/body-with-query-params | 
[**boolean**](#boolean) | **post** /fake/refs/boolean | 
[**case_sensitive_params**](#case_sensitive_params) | **put** /fake/case-sensitive-params | 
[**client_model**](#client_model) | **patch** /fake | To test \&quot;client\&quot; model
[**composed_one_of_different_types**](#composed_one_of_different_types) | **post** /fake/refs/composed_one_of_number_with_validations | 
[**delete_coffee**](#delete_coffee) | **delete** /fake/deleteCoffee/{id} | Delete coffee
[**endpoint_parameters**](#endpoint_parameters) | **post** /fake | Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
[**enum_parameters**](#enum_parameters) | **get** /fake | To test enum parameters
[**fake_health_get**](#fake_health_get) | **get** /fake/health | Health check endpoint
[**group_parameters**](#group_parameters) | **delete** /fake | Fake endpoint to test group parameters (optional)
[**inline_additional_properties**](#inline_additional_properties) | **post** /fake/inline-additionalProperties | test inline additionalProperties
[**inline_composition**](#inline_composition) | **post** /fake/inlineComposition/ | testing composed schemas at inline locations
[**json_form_data**](#json_form_data) | **get** /fake/jsonFormData | test json serialization of form data
[**json_patch**](#json_patch) | **patch** /fake/jsonPatch | json patch
[**json_with_charset**](#json_with_charset) | **post** /fake/jsonWithCharset | json with charset tx and rx
[**mammal**](#mammal) | **post** /fake/refs/mammal | 
[**number_with_validations**](#number_with_validations) | **post** /fake/refs/number | 
[**object_in_query**](#object_in_query) | **get** /fake/objInQuery | user list
[**object_model_with_ref_props**](#object_model_with_ref_props) | **post** /fake/refs/object_model_with_ref_props | 
[**parameter_collisions**](#parameter_collisions) | **post** /fake/parameterCollisions/{1}/{aB}/{Ab}/{self}/{A-B}/ | parameter collision case
[**query_param_with_json_content_type**](#query_param_with_json_content_type) | **get** /fake/queryParamWithJsonContentType | query param with json content-type
[**query_parameter_collection_format**](#query_parameter_collection_format) | **put** /fake/test-query-paramters | 
[**ref_object_in_query**](#ref_object_in_query) | **get** /fake/refObjInQuery | user list
[**response_without_schema**](#response_without_schema) | **get** /fake/responseWithoutSchema | receives a response without schema
[**string**](#string) | **post** /fake/refs/string | 
[**string_enum**](#string_enum) | **post** /fake/refs/enum | 
[**upload_download_file**](#upload_download_file) | **post** /fake/uploadDownloadFile | uploads a file and downloads a file using application/octet-stream
[**upload_file**](#upload_file) | **post** /fake/uploadFile | uploads a file using multipart/form-data
[**upload_files**](#upload_files) | **post** /fake/uploadFiles | uploads files using multipart/form-data

# **additional_properties_with_array_of_enums**
<a name="additional_properties_with_array_of_enums"></a>

Additional Properties with Array of Enums

### Example

```python
import petstore_api
from petstore_api.apis.tags import fake_api
from petstore_api.model.additional_properties_with_array_of_enums import AdditionalPropertiesWithArrayOfEnums
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
    body = AdditionalPropertiesWithArrayOfEnums(
        key=[
            EnumClass("-efg")
        ],
    )
    try:
        # Additional Properties with Array of Enums
        api_response = api_instance.additional_properties_with_array_of_enums(
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->additional_properties_with_array_of_enums: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#additional_properties_with_array_of_enums.RequestBody) | typing.Union[[RequestBody.Schemas.application_json](#additional_properties_with_array_of_enums.RequestBody.Schemas.application_json), Unset] | optional, default is unset |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="additional_properties_with_array_of_enums.RequestBody" >body</a>

# <a id="additional_properties_with_array_of_enums.RequestBody.Schemas.application_json" >RequestBody.Schemas.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**AdditionalPropertiesWithArrayOfEnums**](../../models/AdditionalPropertiesWithArrayOfEnums.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#additional_properties_with_array_of_enums.response_for_200.ApiResponse) | Got object with additional properties with array of enums

#### <a id="additional_properties_with_array_of_enums.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.BodySchemas.application_json](#additional_properties_with_array_of_enums.response_for_200.BodySchemas.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="additional_properties_with_array_of_enums.response_for_200.BodySchemas.application_json" >response_for_200.BodySchemas.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**AdditionalPropertiesWithArrayOfEnums**](../../models/AdditionalPropertiesWithArrayOfEnums.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **array_model**
<a name="array_model"></a>


Test serialization of ArrayModel

### Example

```python
import petstore_api
from petstore_api.apis.tags import fake_api
from petstore_api.model.animal_farm import AnimalFarm
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
    body = AnimalFarm([
        Animal()
    ])
    try:
        api_response = api_instance.array_model(
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->array_model: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#array_model.RequestBody) | typing.Union[[RequestBody.Schemas.application_json](#array_model.RequestBody.Schemas.application_json), Unset] | optional, default is unset |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="array_model.RequestBody" >body</a>

# <a id="array_model.RequestBody.Schemas.application_json" >RequestBody.Schemas.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**AnimalFarm**](../../models/AnimalFarm.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#array_model.response_for_200.ApiResponse) | Output model

#### <a id="array_model.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.BodySchemas.application_json](#array_model.response_for_200.BodySchemas.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="array_model.response_for_200.BodySchemas.application_json" >response_for_200.BodySchemas.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**AnimalFarm**](../../models/AnimalFarm.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **array_of_enums**
<a name="array_of_enums"></a>

Array of Enums

### Example

```python
import petstore_api
from petstore_api.apis.tags import fake_api
from petstore_api.model.array_of_enums import ArrayOfEnums
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
    body = ArrayOfEnums([
        StringEnum("placed")
    ])
    try:
        # Array of Enums
        api_response = api_instance.array_of_enums(
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->array_of_enums: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#array_of_enums.RequestBody) | typing.Union[[RequestBody.Schemas.application_json](#array_of_enums.RequestBody.Schemas.application_json), Unset] | optional, default is unset |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="array_of_enums.RequestBody" >body</a>

# <a id="array_of_enums.RequestBody.Schemas.application_json" >RequestBody.Schemas.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**ArrayOfEnums**](../../models/ArrayOfEnums.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#array_of_enums.response_for_200.ApiResponse) | Got named array of enums

#### <a id="array_of_enums.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.BodySchemas.application_json](#array_of_enums.response_for_200.BodySchemas.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="array_of_enums.response_for_200.BodySchemas.application_json" >response_for_200.BodySchemas.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**ArrayOfEnums**](../../models/ArrayOfEnums.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **body_with_file_schema**
<a name="body_with_file_schema"></a>


For this test, the body for this request much reference a schema named `File`.

### Example

```python
import petstore_api
from petstore_api.apis.tags import fake_api
from petstore_api.model.file_schema_test_class import FileSchemaTestClass
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

    # example passing only required values which don't have defaults set
    body = FileSchemaTestClass(
        file=File(
            source_uri="source_uri_example",
        ),
        files=[
            File()
        ],
    )
    try:
        api_response = api_instance.body_with_file_schema(
            body=body,
        )
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->body_with_file_schema: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#body_with_file_schema.RequestBody) | typing.Union[[RequestBody.Schemas.application_json](#body_with_file_schema.RequestBody.Schemas.application_json)] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="body_with_file_schema.RequestBody" >body</a>

# <a id="body_with_file_schema.RequestBody.Schemas.application_json" >RequestBody.Schemas.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**FileSchemaTestClass**](../../models/FileSchemaTestClass.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#body_with_file_schema.response_for_200.ApiResponse) | Success

#### <a id="body_with_file_schema.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **body_with_query_params**
<a name="body_with_query_params"></a>


### Example

```python
import petstore_api
from petstore_api.apis.tags import fake_api
from petstore_api.model.user import User
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

    # example passing only required values which don't have defaults set
    query_params = {
        'query': "query_example",
    }
    body = User(
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
    try:
        api_response = api_instance.body_with_query_params(
            query_params=query_params,
            body=body,
        )
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->body_with_query_params: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#body_with_query_params.RequestBody) | typing.Union[[RequestBody.Schemas.application_json](#body_with_query_params.RequestBody.Schemas.application_json)] | required |
[query_params](#body_with_query_params.RequestQueryParameters) | [RequestQueryParameters.Params](#body_with_query_params.RequestQueryParameters.Params) | |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="body_with_query_params.RequestBody" >body</a>

# <a id="body_with_query_params.RequestBody.Schemas.application_json" >RequestBody.Schemas.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**User**](../../models/User.md) |  | 


### <a id="body_with_query_params.RequestQueryParameters" >query_params</a>
#### <a id="body_with_query_params.RequestQueryParameters.Params" >RequestQueryParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
query | [RequestQueryParameters.Schemas.query](#body_with_query_params.RequestQueryParameters.Schemas.query) | | 


# <a id="body_with_query_params.RequestQueryParameters.Schemas.query" >RequestQueryParameters.Schemas.query</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#body_with_query_params.response_for_200.ApiResponse) | Success

#### <a id="body_with_query_params.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **boolean**
<a name="boolean"></a>


Test serialization of outer boolean types

### Example

```python
import petstore_api
from petstore_api.apis.tags import fake_api
from petstore_api.model.boolean import Boolean
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
    body = Boolean(True)
    try:
        api_response = api_instance.boolean(
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->boolean: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#boolean.RequestBody) | typing.Union[[RequestBody.Schemas.application_json](#boolean.RequestBody.Schemas.application_json), Unset] | optional, default is unset |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="boolean.RequestBody" >body</a>

# <a id="boolean.RequestBody.Schemas.application_json" >RequestBody.Schemas.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**Boolean**](../../models/Boolean.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#boolean.response_for_200.ApiResponse) | Output boolean

#### <a id="boolean.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.BodySchemas.application_json](#boolean.response_for_200.BodySchemas.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="boolean.response_for_200.BodySchemas.application_json" >response_for_200.BodySchemas.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**Boolean**](../../models/Boolean.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **case_sensitive_params**
<a name="case_sensitive_params"></a>


Ensures that original naming is used in endpoint params, that way we on't have collisions

### Example

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

    # example passing only required values which don't have defaults set
    query_params = {
        'someVar': "someVar_example",
        'SomeVar': "SomeVar_example",
        'some_var': "some_var_example",
    }
    try:
        api_response = api_instance.case_sensitive_params(
            query_params=query_params,
        )
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->case_sensitive_params: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[query_params](#case_sensitive_params.RequestQueryParameters) | [RequestQueryParameters.Params](#case_sensitive_params.RequestQueryParameters.Params) | |
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="case_sensitive_params.RequestQueryParameters" >query_params</a>
#### <a id="case_sensitive_params.RequestQueryParameters.Params" >RequestQueryParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
someVar | [RequestQueryParameters.Schemas.someVar](#case_sensitive_params.RequestQueryParameters.Schemas.someVar) | | 
SomeVar | [RequestQueryParameters.Schemas.SomeVar](#case_sensitive_params.RequestQueryParameters.Schemas.SomeVar) | | 
some_var | [RequestQueryParameters.Schemas.some_var](#case_sensitive_params.RequestQueryParameters.Schemas.some_var) | | 


# <a id="case_sensitive_params.RequestQueryParameters.Schemas.someVar" >RequestQueryParameters.Schemas.someVar</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# <a id="case_sensitive_params.RequestQueryParameters.Schemas.SomeVar" >RequestQueryParameters.Schemas.SomeVar</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# <a id="case_sensitive_params.RequestQueryParameters.Schemas.some_var" >RequestQueryParameters.Schemas.some_var</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#case_sensitive_params.response_for_200.ApiResponse) | Success

#### <a id="case_sensitive_params.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **client_model**
<a name="client_model"></a>

To test \"client\" model

To test \"client\" model

### Example

```python
import petstore_api
from petstore_api.apis.tags import fake_api
from petstore_api.model.client import Client
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

    # example passing only required values which don't have defaults set
    body = Client(
        client="client_example",
    )
    try:
        # To test \"client\" model
        api_response = api_instance.client_model(
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->client_model: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#client_model.RequestBody) | typing.Union[[RequestBody.Schemas.application_json](#client_model.RequestBody.Schemas.application_json)] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="client_model.RequestBody" >body</a>

# <a id="client_model.RequestBody.Schemas.application_json" >RequestBody.Schemas.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**Client**](../../models/Client.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#client_model.response_for_200.ApiResponse) | successful operation

#### <a id="client_model.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.BodySchemas.application_json](#client_model.response_for_200.BodySchemas.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="client_model.response_for_200.BodySchemas.application_json" >response_for_200.BodySchemas.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**Client**](../../models/Client.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **composed_one_of_different_types**
<a name="composed_one_of_different_types"></a>


Test serialization of object with $refed properties

### Example

```python
import petstore_api
from petstore_api.apis.tags import fake_api
from petstore_api.model.composed_one_of_different_types import ComposedOneOfDifferentTypes
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
    body = ComposedOneOfDifferentTypes(None)
    try:
        api_response = api_instance.composed_one_of_different_types(
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->composed_one_of_different_types: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#composed_one_of_different_types.RequestBody) | typing.Union[[RequestBody.Schemas.application_json](#composed_one_of_different_types.RequestBody.Schemas.application_json), Unset] | optional, default is unset |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="composed_one_of_different_types.RequestBody" >body</a>

# <a id="composed_one_of_different_types.RequestBody.Schemas.application_json" >RequestBody.Schemas.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**ComposedOneOfDifferentTypes**](../../models/ComposedOneOfDifferentTypes.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#composed_one_of_different_types.response_for_200.ApiResponse) | Output model

#### <a id="composed_one_of_different_types.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.BodySchemas.application_json](#composed_one_of_different_types.response_for_200.BodySchemas.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="composed_one_of_different_types.response_for_200.BodySchemas.application_json" >response_for_200.BodySchemas.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**ComposedOneOfDifferentTypes**](../../models/ComposedOneOfDifferentTypes.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **delete_coffee**
<a name="delete_coffee"></a>

Delete coffee

Delete the coffee identified by the given id, (delete without request body)

### Example

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

    # example passing only required values which don't have defaults set
    path_params = {
        'id': "id_example",
    }
    try:
        # Delete coffee
        api_response = api_instance.delete_coffee(
            path_params=path_params,
        )
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->delete_coffee: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[path_params](#delete_coffee.RequestPathParameters) | [RequestPathParameters.Params](#delete_coffee.RequestPathParameters.Params) | |
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="delete_coffee.RequestPathParameters" >path_params</a>
#### <a id="delete_coffee.RequestPathParameters.Params" >RequestPathParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
id | [RequestPathParameters.Schemas.id](#delete_coffee.RequestPathParameters.Schemas.id) | | 

# <a id="delete_coffee.RequestPathParameters.Schemas.id" >RequestPathParameters.Schemas.id</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#delete_coffee.response_for_200.ApiResponse) | OK
default | [response_for_default.ApiResponse](#delete_coffee.response_for_default.ApiResponse) | Unexpected error

#### <a id="delete_coffee.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

#### <a id="delete_coffee.response_for_default.ApiResponse" >response_for_default.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **endpoint_parameters**
<a name="endpoint_parameters"></a>

Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 

Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 

### Example

* Basic Authentication (http_basic_test):
```python
import petstore_api
from petstore_api.apis.tags import fake_api
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

# Configure HTTP basic authorization: http_basic_test
configuration = petstore_api.Configuration(
    username = 'YOUR_USERNAME',
    password = 'YOUR_PASSWORD'
)
# Enter a context with an instance of the API client
with petstore_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fake_api.FakeApi(api_client)

    # example passing only optional values
    body = dict(
        integer=10,
        int32=20,
        int64=1,
        number=32.1,
        _float=3.14,
        double=67.8,
        string="a",
        pattern_without_delimiter="AUR,rZ#UM/?R,Fp^l6$ARjbhJk C>",
        byte='YQ==',
        binary=open('/path/to/file', 'rb'),
        date="1970-01-01",
        date_time="2020-02-02T20:20:20.222220Z",
        password="password_example",
        callback="callback_example",
    )
    try:
        # Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
        api_response = api_instance.endpoint_parameters(
            body=body,
        )
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->endpoint_parameters: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#endpoint_parameters.RequestBody) | typing.Union[[RequestBody.Schemas.application_x_www_form_urlencoded](#endpoint_parameters.RequestBody.Schemas.application_x_www_form_urlencoded), Unset] | optional, default is unset |
content_type | str | optional, default is 'application/x-www-form-urlencoded' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="endpoint_parameters.RequestBody" >body</a>

# <a id="endpoint_parameters.RequestBody.Schemas.application_x_www_form_urlencoded" >RequestBody.Schemas.application_x_www_form_urlencoded</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**number** | decimal.Decimal, int, float,  | decimal.Decimal,  | None | 
**pattern_without_delimiter** | str,  | str,  | None | 
**byte** | str,  | str,  | None | 
**double** | decimal.Decimal, int, float,  | decimal.Decimal,  | None | value must be a 64 bit float
**integer** | decimal.Decimal, int,  | decimal.Decimal,  | None | [optional] 
**int32** | decimal.Decimal, int,  | decimal.Decimal,  | None | [optional] value must be a 32 bit integer
**int64** | decimal.Decimal, int,  | decimal.Decimal,  | None | [optional] value must be a 64 bit integer
**float** | decimal.Decimal, int, float,  | decimal.Decimal,  | None | [optional] value must be a 32 bit float
**string** | str,  | str,  | None | [optional] 
**binary** | bytes, io.FileIO, io.BufferedReader,  | bytes, FileIO,  | None | [optional] 
**date** | str, date,  | str,  | None | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD
**dateTime** | str, datetime,  | str,  | None | [optional] if omitted the server will use the default value of 2010-02-01T10:20:10.11111+01:00value must conform to RFC-3339 date-time
**password** | str,  | str,  | None | [optional] 
**callback** | str,  | str,  | None | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#endpoint_parameters.response_for_200.ApiResponse) | Success
404 | [response_for_404.ApiResponse](#endpoint_parameters.response_for_404.ApiResponse) | User not found

#### <a id="endpoint_parameters.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

#### <a id="endpoint_parameters.response_for_404.ApiResponse" >response_for_404.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

[http_basic_test](../../../README.md#http_basic_test)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **enum_parameters**
<a name="enum_parameters"></a>

To test enum parameters

To test enum parameters

### Example

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
    query_params = {
        'enum_query_string_array': [
        "$"
    ],
        'enum_query_string': "-efg",
        'enum_query_integer': 1,
        'enum_query_double': 1.1,
    }
    header_params = {
        'enum_header_string_array': [
        "$"
    ],
        'enum_header_string': "-efg",
    }
    body = dict(
        enum_form_string_array=[
            "$"
        ],
        enum_form_string="-efg",
    )
    try:
        # To test enum parameters
        api_response = api_instance.enum_parameters(
            query_params=query_params,
            header_params=header_params,
            body=body,
        )
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->enum_parameters: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#enum_parameters.RequestBody) | typing.Union[[RequestBody.Schemas.application_x_www_form_urlencoded](#enum_parameters.RequestBody.Schemas.application_x_www_form_urlencoded), Unset] | optional, default is unset |
[query_params](#enum_parameters.RequestQueryParameters) | [RequestQueryParameters.Params](#enum_parameters.RequestQueryParameters.Params) | |
[header_params](#enum_parameters.RequestHeaderParameters) | [RequestHeaderParameters.Params](#enum_parameters.RequestHeaderParameters.Params) | |
content_type | str | optional, default is 'application/x-www-form-urlencoded' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="enum_parameters.RequestBody" >body</a>

# <a id="enum_parameters.RequestBody.Schemas.application_x_www_form_urlencoded" >RequestBody.Schemas.application_x_www_form_urlencoded</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**[enum_form_string_array](#enum_form_string_array)** | list, tuple,  | tuple,  | Form parameter enum test (string array) | [optional] 
**enum_form_string** | str,  | str,  | Form parameter enum test (string) | [optional] must be one of ["_abc", "-efg", "(xyz)", ] if omitted the server will use the default value of "-efg"
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# enum_form_string_array

Form parameter enum test (string array)

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | Form parameter enum test (string array) | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | must be one of [">", "$", ] if omitted the server will use the default value of "$"

### <a id="enum_parameters.RequestQueryParameters" >query_params</a>
#### <a id="enum_parameters.RequestQueryParameters.Params" >RequestQueryParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
enum_query_string_array | [RequestQueryParameters.Schemas.enum_query_string_array](#enum_parameters.RequestQueryParameters.Schemas.enum_query_string_array) | | optional
enum_query_string | [RequestQueryParameters.Schemas.enum_query_string](#enum_parameters.RequestQueryParameters.Schemas.enum_query_string) | | optional
enum_query_integer | [RequestQueryParameters.Schemas.enum_query_integer](#enum_parameters.RequestQueryParameters.Schemas.enum_query_integer) | | optional
enum_query_double | [RequestQueryParameters.Schemas.enum_query_double](#enum_parameters.RequestQueryParameters.Schemas.enum_query_double) | | optional


# <a id="enum_parameters.RequestQueryParameters.Schemas.enum_query_string_array" >RequestQueryParameters.Schemas.enum_query_string_array</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | must be one of [">", "$", ] if omitted the server will use the default value of "$"

# <a id="enum_parameters.RequestQueryParameters.Schemas.enum_query_string" >RequestQueryParameters.Schemas.enum_query_string</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | must be one of ["_abc", "-efg", "(xyz)", ] if omitted the server will use the default value of "-efg"

# <a id="enum_parameters.RequestQueryParameters.Schemas.enum_query_integer" >RequestQueryParameters.Schemas.enum_query_integer</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | must be one of [1, -2, ] value must be a 32 bit integer

# <a id="enum_parameters.RequestQueryParameters.Schemas.enum_query_double" >RequestQueryParameters.Schemas.enum_query_double</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int, float,  | decimal.Decimal,  |  | must be one of [1.1, -1.2, ] value must be a 64 bit float

### <a id="enum_parameters.RequestHeaderParameters" >header_params</a>
#### <a id="enum_parameters.RequestHeaderParameters.Params" >RequestHeaderParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
enum_header_string_array | [RequestHeaderParameters.Schemas.enum_header_string_array](#enum_parameters.RequestHeaderParameters.Schemas.enum_header_string_array) | | optional
enum_header_string | [RequestHeaderParameters.Schemas.enum_header_string](#enum_parameters.RequestHeaderParameters.Schemas.enum_header_string) | | optional

# <a id="enum_parameters.RequestHeaderParameters.Schemas.enum_header_string_array" >RequestHeaderParameters.Schemas.enum_header_string_array</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | must be one of [">", "$", ] if omitted the server will use the default value of "$"

# <a id="enum_parameters.RequestHeaderParameters.Schemas.enum_header_string" >RequestHeaderParameters.Schemas.enum_header_string</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | must be one of ["_abc", "-efg", "(xyz)", ] if omitted the server will use the default value of "-efg"

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#enum_parameters.response_for_200.ApiResponse) | Success
404 | [response_for_404.ApiResponse](#enum_parameters.response_for_404.ApiResponse) | Not found

#### <a id="enum_parameters.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

#### <a id="enum_parameters.response_for_404.ApiResponse" >response_for_404.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **fake_health_get**
<a name="fake_health_get"></a>

Health check endpoint

### Example

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

    # example, this endpoint has no required or optional parameters
    try:
        # Health check endpoint
        api_response = api_instance.fake_health_get()
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->fake_health_get: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#fake_health_get.response_for_200.ApiResponse) | The instance started successfully

#### <a id="fake_health_get.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.BodySchemas.application_json](#fake_health_get.response_for_200.BodySchemas.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="fake_health_get.response_for_200.BodySchemas.application_json" >response_for_200.BodySchemas.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**HealthCheckResult**](../../models/HealthCheckResult.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **group_parameters**
<a name="group_parameters"></a>

Fake endpoint to test group parameters (optional)

Fake endpoint to test group parameters (optional)

### Example

* Bearer (JWT) Authentication (bearer_test):
```python
import petstore_api
from petstore_api.apis.tags import fake_api
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

# Configure Bearer authorization (JWT): bearer_test
configuration = petstore_api.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with petstore_api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fake_api.FakeApi(api_client)

    # example passing only required values which don't have defaults set
    query_params = {
        'required_string_group': "required_string_group_example",
        'required_int64_group': 1,
    }
    header_params = {
        'required_boolean_group': "true",
    }
    try:
        # Fake endpoint to test group parameters (optional)
        api_response = api_instance.group_parameters(
            query_params=query_params,
            header_params=header_params,
        )
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->group_parameters: %s\n" % e)

    # example passing only optional values
    query_params = {
        'required_string_group': "required_string_group_example",
        'required_int64_group': 1,
        'string_group': "string_group_example",
        'int64_group': 1,
    }
    header_params = {
        'required_boolean_group': "true",
        'boolean_group': "true",
    }
    try:
        # Fake endpoint to test group parameters (optional)
        api_response = api_instance.group_parameters(
            query_params=query_params,
            header_params=header_params,
        )
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->group_parameters: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[query_params](#group_parameters.RequestQueryParameters) | [RequestQueryParameters.Params](#group_parameters.RequestQueryParameters.Params) | |
[header_params](#group_parameters.RequestHeaderParameters) | [RequestHeaderParameters.Params](#group_parameters.RequestHeaderParameters.Params) | |
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="group_parameters.RequestQueryParameters" >query_params</a>
#### <a id="group_parameters.RequestQueryParameters.Params" >RequestQueryParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
required_string_group | [RequestQueryParameters.Schemas.required_string_group](#group_parameters.RequestQueryParameters.Schemas.required_string_group) | | 
required_int64_group | [RequestQueryParameters.Schemas.required_int64_group](#group_parameters.RequestQueryParameters.Schemas.required_int64_group) | | 
string_group | [RequestQueryParameters.Schemas.string_group](#group_parameters.RequestQueryParameters.Schemas.string_group) | | optional
int64_group | [RequestQueryParameters.Schemas.int64_group](#group_parameters.RequestQueryParameters.Schemas.int64_group) | | optional


# <a id="group_parameters.RequestQueryParameters.Schemas.required_string_group" >RequestQueryParameters.Schemas.required_string_group</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# <a id="group_parameters.RequestQueryParameters.Schemas.required_int64_group" >RequestQueryParameters.Schemas.required_int64_group</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 64 bit integer

# <a id="group_parameters.RequestQueryParameters.Schemas.string_group" >RequestQueryParameters.Schemas.string_group</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# <a id="group_parameters.RequestQueryParameters.Schemas.int64_group" >RequestQueryParameters.Schemas.int64_group</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 64 bit integer

### <a id="group_parameters.RequestHeaderParameters" >header_params</a>
#### <a id="group_parameters.RequestHeaderParameters.Params" >RequestHeaderParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
required_boolean_group | [RequestHeaderParameters.Schemas.required_boolean_group](#group_parameters.RequestHeaderParameters.Schemas.required_boolean_group) | | 
boolean_group | [RequestHeaderParameters.Schemas.boolean_group](#group_parameters.RequestHeaderParameters.Schemas.boolean_group) | | optional

# <a id="group_parameters.RequestHeaderParameters.Schemas.required_boolean_group" >RequestHeaderParameters.Schemas.required_boolean_group</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | must be one of ["true", "false", ] 

# <a id="group_parameters.RequestHeaderParameters.Schemas.boolean_group" >RequestHeaderParameters.Schemas.boolean_group</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | must be one of ["true", "false", ] 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#group_parameters.response_for_200.ApiResponse) | succeeded

#### <a id="group_parameters.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

[bearer_test](../../../README.md#bearer_test)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **inline_additional_properties**
<a name="inline_additional_properties"></a>

test inline additionalProperties

### Example

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

    # example passing only required values which don't have defaults set
    body = dict(
        "key": "key_example",
    )
    try:
        # test inline additionalProperties
        api_response = api_instance.inline_additional_properties(
            body=body,
        )
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->inline_additional_properties: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#inline_additional_properties.RequestBody) | typing.Union[[RequestBody.Schemas.application_json](#inline_additional_properties.RequestBody.Schemas.application_json)] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="inline_additional_properties.RequestBody" >body</a>

# <a id="inline_additional_properties.RequestBody.Schemas.application_json" >RequestBody.Schemas.application_json</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | str,  | str,  | any string name can be used but the value must be the correct type | [optional] 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#inline_additional_properties.response_for_200.ApiResponse) | successful operation

#### <a id="inline_additional_properties.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **inline_composition**
<a name="inline_composition"></a>

testing composed schemas at inline locations

### Example

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
    query_params = {
        'compositionAtRoot': None,
        'compositionInProperty': dict(
        some_prop=None,
    ),
    }
    body = None
    try:
        # testing composed schemas at inline locations
        api_response = api_instance.inline_composition(
            query_params=query_params,
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->inline_composition: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#inline_composition.RequestBody) | typing.Union[[RequestBody.Schemas.application_json](#inline_composition.RequestBody.Schemas.application_json), [RequestBody.Schemas.multipart_form_data](#inline_composition.RequestBody.Schemas.multipart_form_data), Unset] | optional, default is unset |
[query_params](#inline_composition.RequestQueryParameters) | [RequestQueryParameters.Params](#inline_composition.RequestQueryParameters.Params) | |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', 'multipart/form-data', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="inline_composition.RequestBody" >body</a>

# <a id="inline_composition.RequestBody.Schemas.application_json" >RequestBody.Schemas.application_json</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[all_of_0](#all_of_0) | str,  | str,  |  | 

# all_of_0

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# <a id="inline_composition.RequestBody.Schemas.multipart_form_data" >RequestBody.Schemas.multipart_form_data</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**[someProp](#someProp)** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# someProp

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[all_of_0](#all_of_0) | str,  | str,  |  | 

# all_of_0

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### <a id="inline_composition.RequestQueryParameters" >query_params</a>
#### <a id="inline_composition.RequestQueryParameters.Params" >RequestQueryParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
compositionAtRoot | [RequestQueryParameters.Schemas.compositionAtRoot](#inline_composition.RequestQueryParameters.Schemas.compositionAtRoot) | | optional
compositionInProperty | [RequestQueryParameters.Schemas.compositionInProperty](#inline_composition.RequestQueryParameters.Schemas.compositionInProperty) | | optional


# <a id="inline_composition.RequestQueryParameters.Schemas.compositionAtRoot" >RequestQueryParameters.Schemas.compositionAtRoot</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[all_of_0](#all_of_0) | str,  | str,  |  | 

# all_of_0

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# <a id="inline_composition.RequestQueryParameters.Schemas.compositionInProperty" >RequestQueryParameters.Schemas.compositionInProperty</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**[someProp](#someProp)** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# someProp

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[all_of_0](#all_of_0) | str,  | str,  |  | 

# all_of_0

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#inline_composition.response_for_200.ApiResponse) | success

#### <a id="inline_composition.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.BodySchemas.application_json](#inline_composition.response_for_200.BodySchemas.application_json), [response_for_200.BodySchemas.multipart_form_data](#inline_composition.response_for_200.BodySchemas.multipart_form_data), ] |  |
headers | Unset | headers were not defined |

# <a id="inline_composition.response_for_200.BodySchemas.application_json" >response_for_200.BodySchemas.application_json</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[all_of_0](#all_of_0) | str,  | str,  |  | 

# all_of_0

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# <a id="inline_composition.response_for_200.BodySchemas.multipart_form_data" >response_for_200.BodySchemas.multipart_form_data</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**[someProp](#someProp)** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# someProp

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[all_of_0](#all_of_0) | str,  | str,  |  | 

# all_of_0

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **json_form_data**
<a name="json_form_data"></a>

test json serialization of form data

### Example

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
    body = dict(
        param="param_example",
        param2="param2_example",
    )
    try:
        # test json serialization of form data
        api_response = api_instance.json_form_data(
            body=body,
        )
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->json_form_data: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#json_form_data.RequestBody) | typing.Union[[RequestBody.Schemas.application_x_www_form_urlencoded](#json_form_data.RequestBody.Schemas.application_x_www_form_urlencoded), Unset] | optional, default is unset |
content_type | str | optional, default is 'application/x-www-form-urlencoded' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="json_form_data.RequestBody" >body</a>

# <a id="json_form_data.RequestBody.Schemas.application_x_www_form_urlencoded" >RequestBody.Schemas.application_x_www_form_urlencoded</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**param** | str,  | str,  | field1 | 
**param2** | str,  | str,  | field2 | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#json_form_data.response_for_200.ApiResponse) | successful operation

#### <a id="json_form_data.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **json_patch**
<a name="json_patch"></a>

json patch

json patch route with a requestBody

### Example

```python
import petstore_api
from petstore_api.apis.tags import fake_api
from petstore_api.model.json_patch_request import JSONPatchRequest
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
    body = JSONPatchRequest([
        None
    ])
    try:
        # json patch
        api_response = api_instance.json_patch(
            body=body,
        )
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->json_patch: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#json_patch.RequestBody) | typing.Union[[RequestBody.Schemas.application_json_patchjson](#json_patch.RequestBody.Schemas.application_json_patchjson), Unset] | optional, default is unset |
content_type | str | optional, default is 'application/json-patch+json' | Selects the schema and serialization of the request body
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="json_patch.RequestBody" >body</a>

# <a id="json_patch.RequestBody.Schemas.application_json_patchjson" >RequestBody.Schemas.application_json_patchjson</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**JSONPatchRequest**](../../models/JSONPatchRequest.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#json_patch.response_for_200.ApiResponse) | OK

#### <a id="json_patch.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **json_with_charset**
<a name="json_with_charset"></a>

json with charset tx and rx

### Example

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
    body = None
    try:
        # json with charset tx and rx
        api_response = api_instance.json_with_charset(
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->json_with_charset: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#json_with_charset.RequestBody) | typing.Union[[RequestBody.Schemas.application_json_charsetutf_8](#json_with_charset.RequestBody.Schemas.application_json_charsetutf_8), Unset] | optional, default is unset |
content_type | str | optional, default is 'application/json; charset&#x3D;utf-8' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json; charset&#x3D;utf-8', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="json_with_charset.RequestBody" >body</a>

# <a id="json_with_charset.RequestBody.Schemas.application_json_charsetutf_8" >RequestBody.Schemas.application_json_charsetutf_8</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#json_with_charset.response_for_200.ApiResponse) | success

#### <a id="json_with_charset.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.BodySchemas.application_json_charsetutf_8](#json_with_charset.response_for_200.BodySchemas.application_json_charsetutf_8), ] |  |
headers | Unset | headers were not defined |

# <a id="json_with_charset.response_for_200.BodySchemas.application_json_charsetutf_8" >response_for_200.BodySchemas.application_json_charsetutf_8</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **mammal**
<a name="mammal"></a>


Test serialization of mammals

### Example

```python
import petstore_api
from petstore_api.apis.tags import fake_api
from petstore_api.model.mammal import Mammal
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

    # example passing only required values which don't have defaults set
    body = Mammal(
        has_baleen=True,
        has_teeth=True,
        class_name="whale",
    )
    try:
        api_response = api_instance.mammal(
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->mammal: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#mammal.RequestBody) | typing.Union[[RequestBody.Schemas.application_json](#mammal.RequestBody.Schemas.application_json)] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="mammal.RequestBody" >body</a>

# <a id="mammal.RequestBody.Schemas.application_json" >RequestBody.Schemas.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**Mammal**](../../models/Mammal.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#mammal.response_for_200.ApiResponse) | Output mammal

#### <a id="mammal.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.BodySchemas.application_json](#mammal.response_for_200.BodySchemas.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="mammal.response_for_200.BodySchemas.application_json" >response_for_200.BodySchemas.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**Mammal**](../../models/Mammal.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **number_with_validations**
<a name="number_with_validations"></a>


Test serialization of outer number types

### Example

```python
import petstore_api
from petstore_api.apis.tags import fake_api
from petstore_api.model.number_with_validations import NumberWithValidations
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
    body = NumberWithValidations(10)
    try:
        api_response = api_instance.number_with_validations(
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->number_with_validations: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#number_with_validations.RequestBody) | typing.Union[[RequestBody.Schemas.application_json](#number_with_validations.RequestBody.Schemas.application_json), Unset] | optional, default is unset |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="number_with_validations.RequestBody" >body</a>

# <a id="number_with_validations.RequestBody.Schemas.application_json" >RequestBody.Schemas.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**NumberWithValidations**](../../models/NumberWithValidations.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#number_with_validations.response_for_200.ApiResponse) | Output number

#### <a id="number_with_validations.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.BodySchemas.application_json](#number_with_validations.response_for_200.BodySchemas.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="number_with_validations.response_for_200.BodySchemas.application_json" >response_for_200.BodySchemas.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**NumberWithValidations**](../../models/NumberWithValidations.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **object_in_query**
<a name="object_in_query"></a>

user list

### Example

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
    query_params = {
        'mapBean': dict(
        keyword="keyword_example",
    ),
    }
    try:
        # user list
        api_response = api_instance.object_in_query(
            query_params=query_params,
        )
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->object_in_query: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[query_params](#object_in_query.RequestQueryParameters) | [RequestQueryParameters.Params](#object_in_query.RequestQueryParameters.Params) | |
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="object_in_query.RequestQueryParameters" >query_params</a>
#### <a id="object_in_query.RequestQueryParameters.Params" >RequestQueryParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
mapBean | [RequestQueryParameters.Schemas.mapBean](#object_in_query.RequestQueryParameters.Schemas.mapBean) | | optional


# <a id="object_in_query.RequestQueryParameters.Schemas.mapBean" >RequestQueryParameters.Schemas.mapBean</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**keyword** | str,  | str,  |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#object_in_query.response_for_200.ApiResponse) | ok

#### <a id="object_in_query.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **object_model_with_ref_props**
<a name="object_model_with_ref_props"></a>


Test serialization of object with $refed properties

### Example

```python
import petstore_api
from petstore_api.apis.tags import fake_api
from petstore_api.model.object_model_with_ref_props import ObjectModelWithRefProps
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
    body = ObjectModelWithRefProps(
        my_number=NumberWithValidations(10),
        my_string=String("my_string_example"),
        my_boolean=Boolean(True),
    )
    try:
        api_response = api_instance.object_model_with_ref_props(
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->object_model_with_ref_props: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#object_model_with_ref_props.RequestBody) | typing.Union[[RequestBody.Schemas.application_json](#object_model_with_ref_props.RequestBody.Schemas.application_json), Unset] | optional, default is unset |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="object_model_with_ref_props.RequestBody" >body</a>

# <a id="object_model_with_ref_props.RequestBody.Schemas.application_json" >RequestBody.Schemas.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**ObjectModelWithRefProps**](../../models/ObjectModelWithRefProps.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#object_model_with_ref_props.response_for_200.ApiResponse) | Output model

#### <a id="object_model_with_ref_props.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.BodySchemas.application_json](#object_model_with_ref_props.response_for_200.BodySchemas.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="object_model_with_ref_props.response_for_200.BodySchemas.application_json" >response_for_200.BodySchemas.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**ObjectModelWithRefProps**](../../models/ObjectModelWithRefProps.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **parameter_collisions**
<a name="parameter_collisions"></a>

parameter collision case

### Example

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

    # example passing only required values which don't have defaults set
    path_params = {
        '1': "1_example",
        'aB': "aB_example",
        'Ab': "Ab_example",
        'self': "self_example",
        'A-B': "A-B_example",
    }
    query_params = {
    }
    cookie_params = {
    }
    header_params = {
    }
    try:
        # parameter collision case
        api_response = api_instance.parameter_collisions(
            path_params=path_params,
            query_params=query_params,
            header_params=header_params,
            cookie_params=cookie_params,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->parameter_collisions: %s\n" % e)

    # example passing only optional values
    path_params = {
        '1': "1_example",
        'aB': "aB_example",
        'Ab': "Ab_example",
        'self': "self_example",
        'A-B': "A-B_example",
    }
    query_params = {
        '1': "1_example",
        'aB': "aB_example",
        'Ab': "Ab_example",
        'self': "self_example",
        'A-B': "A-B_example",
    }
    cookie_params = {
        '1': "1_example",
        'aB': "aB_example",
        'Ab': "Ab_example",
        'self': "self_example",
        'A-B': "A-B_example",
    }
    header_params = {
        '1': "1_example",
        'aB': "aB_example",
        'self': "self_example",
        'A-B': "A-B_example",
    }
    body = None
    try:
        # parameter collision case
        api_response = api_instance.parameter_collisions(
            path_params=path_params,
            query_params=query_params,
            header_params=header_params,
            cookie_params=cookie_params,
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->parameter_collisions: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#parameter_collisions.RequestBody) | typing.Union[[RequestBody.Schemas.application_json](#parameter_collisions.RequestBody.Schemas.application_json), Unset] | optional, default is unset |
[query_params](#parameter_collisions.RequestQueryParameters) | [RequestQueryParameters.Params](#parameter_collisions.RequestQueryParameters.Params) | |
[header_params](#parameter_collisions.RequestHeaderParameters) | [RequestHeaderParameters.Params](#parameter_collisions.RequestHeaderParameters.Params) | |
[path_params](#parameter_collisions.RequestPathParameters) | [RequestPathParameters.Params](#parameter_collisions.RequestPathParameters.Params) | |
[cookie_params](#parameter_collisions.RequestCookieParameters) | [RequestCookieParameters.Params](#parameter_collisions.RequestCookieParameters.Params) | |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="parameter_collisions.RequestBody" >body</a>

# <a id="parameter_collisions.RequestBody.Schemas.application_json" >RequestBody.Schemas.application_json</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

### <a id="parameter_collisions.RequestQueryParameters" >query_params</a>
#### <a id="parameter_collisions.RequestQueryParameters.Params" >RequestQueryParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
1 | [RequestQueryParameters.Schemas._1](#parameter_collisions.RequestQueryParameters.Schemas._1) | | optional
aB | [RequestQueryParameters.Schemas.aB](#parameter_collisions.RequestQueryParameters.Schemas.aB) | | optional
Ab | [RequestQueryParameters.Schemas.Ab](#parameter_collisions.RequestQueryParameters.Schemas.Ab) | | optional
self | [RequestQueryParameters.Schemas._self](#parameter_collisions.RequestQueryParameters.Schemas._self) | | optional
A-B | [RequestQueryParameters.Schemas.a_b](#parameter_collisions.RequestQueryParameters.Schemas.a_b) | | optional


# <a id="parameter_collisions.RequestQueryParameters.Schemas._1" >RequestQueryParameters.Schemas._1</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# <a id="parameter_collisions.RequestQueryParameters.Schemas.aB" >RequestQueryParameters.Schemas.aB</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# <a id="parameter_collisions.RequestQueryParameters.Schemas.Ab" >RequestQueryParameters.Schemas.Ab</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# <a id="parameter_collisions.RequestQueryParameters.Schemas._self" >RequestQueryParameters.Schemas._self</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# <a id="parameter_collisions.RequestQueryParameters.Schemas.a_b" >RequestQueryParameters.Schemas.a_b</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### <a id="parameter_collisions.RequestHeaderParameters" >header_params</a>
#### <a id="parameter_collisions.RequestHeaderParameters.Params" >RequestHeaderParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
1 | [RequestHeaderParameters.Schemas._1](#parameter_collisions.RequestHeaderParameters.Schemas._1) | | optional
aB | [RequestHeaderParameters.Schemas.aB](#parameter_collisions.RequestHeaderParameters.Schemas.aB) | | optional
self | [RequestHeaderParameters.Schemas._self](#parameter_collisions.RequestHeaderParameters.Schemas._self) | | optional
A-B | [RequestHeaderParameters.Schemas.a_b](#parameter_collisions.RequestHeaderParameters.Schemas.a_b) | | optional

# <a id="parameter_collisions.RequestHeaderParameters.Schemas._1" >RequestHeaderParameters.Schemas._1</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# <a id="parameter_collisions.RequestHeaderParameters.Schemas.aB" >RequestHeaderParameters.Schemas.aB</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# <a id="parameter_collisions.RequestHeaderParameters.Schemas._self" >RequestHeaderParameters.Schemas._self</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# <a id="parameter_collisions.RequestHeaderParameters.Schemas.a_b" >RequestHeaderParameters.Schemas.a_b</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### <a id="parameter_collisions.RequestPathParameters" >path_params</a>
#### <a id="parameter_collisions.RequestPathParameters.Params" >RequestPathParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
1 | [RequestPathParameters.Schemas._1](#parameter_collisions.RequestPathParameters.Schemas._1) | | 
aB | [RequestPathParameters.Schemas.aB](#parameter_collisions.RequestPathParameters.Schemas.aB) | | 
Ab | [RequestPathParameters.Schemas.Ab](#parameter_collisions.RequestPathParameters.Schemas.Ab) | | 
self | [RequestPathParameters.Schemas._self](#parameter_collisions.RequestPathParameters.Schemas._self) | | 
A-B | [RequestPathParameters.Schemas.a_b](#parameter_collisions.RequestPathParameters.Schemas.a_b) | | 

# <a id="parameter_collisions.RequestPathParameters.Schemas._1" >RequestPathParameters.Schemas._1</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# <a id="parameter_collisions.RequestPathParameters.Schemas.aB" >RequestPathParameters.Schemas.aB</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# <a id="parameter_collisions.RequestPathParameters.Schemas.Ab" >RequestPathParameters.Schemas.Ab</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# <a id="parameter_collisions.RequestPathParameters.Schemas._self" >RequestPathParameters.Schemas._self</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# <a id="parameter_collisions.RequestPathParameters.Schemas.a_b" >RequestPathParameters.Schemas.a_b</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### <a id="parameter_collisions.RequestCookieParameters" >cookie_params</a>
#### <a id="parameter_collisions.RequestCookieParameters.Params" >RequestCookieParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
1 | [RequestCookieParameters.Schemas._1](#parameter_collisions.RequestCookieParameters.Schemas._1) | | optional
aB | [RequestCookieParameters.Schemas.aB](#parameter_collisions.RequestCookieParameters.Schemas.aB) | | optional
Ab | [RequestCookieParameters.Schemas.Ab](#parameter_collisions.RequestCookieParameters.Schemas.Ab) | | optional
self | [RequestCookieParameters.Schemas._self](#parameter_collisions.RequestCookieParameters.Schemas._self) | | optional
A-B | [RequestCookieParameters.Schemas.a_b](#parameter_collisions.RequestCookieParameters.Schemas.a_b) | | optional

# <a id="parameter_collisions.RequestCookieParameters.Schemas._1" >RequestCookieParameters.Schemas._1</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# <a id="parameter_collisions.RequestCookieParameters.Schemas.aB" >RequestCookieParameters.Schemas.aB</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# <a id="parameter_collisions.RequestCookieParameters.Schemas.Ab" >RequestCookieParameters.Schemas.Ab</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# <a id="parameter_collisions.RequestCookieParameters.Schemas._self" >RequestCookieParameters.Schemas._self</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# <a id="parameter_collisions.RequestCookieParameters.Schemas.a_b" >RequestCookieParameters.Schemas.a_b</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#parameter_collisions.response_for_200.ApiResponse) | success

#### <a id="parameter_collisions.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.BodySchemas.application_json](#parameter_collisions.response_for_200.BodySchemas.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="parameter_collisions.response_for_200.BodySchemas.application_json" >response_for_200.BodySchemas.application_json</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **query_param_with_json_content_type**
<a name="query_param_with_json_content_type"></a>

query param with json content-type

### Example

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

    # example passing only required values which don't have defaults set
    query_params = {
        'someParam': ,
    }
    try:
        # query param with json content-type
        api_response = api_instance.query_param_with_json_content_type(
            query_params=query_params,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->query_param_with_json_content_type: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[query_params](#query_param_with_json_content_type.RequestQueryParameters) | [RequestQueryParameters.Params](#query_param_with_json_content_type.RequestQueryParameters.Params) | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="query_param_with_json_content_type.RequestQueryParameters" >query_params</a>
#### <a id="query_param_with_json_content_type.RequestQueryParameters.Params" >RequestQueryParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
someParam |  | | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#query_param_with_json_content_type.response_for_200.ApiResponse) | success

#### <a id="query_param_with_json_content_type.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.BodySchemas.application_json](#query_param_with_json_content_type.response_for_200.BodySchemas.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="query_param_with_json_content_type.response_for_200.BodySchemas.application_json" >response_for_200.BodySchemas.application_json</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **query_parameter_collection_format**
<a name="query_parameter_collection_format"></a>


To test the collection format in query parameters

### Example

```python
import petstore_api
from petstore_api.apis.tags import fake_api
from petstore_api.model.string_with_validation import StringWithValidation
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

    # example passing only required values which don't have defaults set
    query_params = {
        'pipe': [
        "pipe_example"
    ],
        'ioutil': [
        "ioutil_example"
    ],
        'http': [
        "http_example"
    ],
        'url': [
        "url_example"
    ],
        'context': [
        "context_example"
    ],
        'refParam': StringWithValidation("refParam_example"),
    }
    try:
        api_response = api_instance.query_parameter_collection_format(
            query_params=query_params,
        )
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->query_parameter_collection_format: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[query_params](#query_parameter_collection_format.RequestQueryParameters) | [RequestQueryParameters.Params](#query_parameter_collection_format.RequestQueryParameters.Params) | |
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="query_parameter_collection_format.RequestQueryParameters" >query_params</a>
#### <a id="query_parameter_collection_format.RequestQueryParameters.Params" >RequestQueryParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
pipe | [RequestQueryParameters.Schemas.pipe](#query_parameter_collection_format.RequestQueryParameters.Schemas.pipe) | | 
ioutil | [RequestQueryParameters.Schemas.ioutil](#query_parameter_collection_format.RequestQueryParameters.Schemas.ioutil) | | 
http | [RequestQueryParameters.Schemas.http](#query_parameter_collection_format.RequestQueryParameters.Schemas.http) | | 
url | [RequestQueryParameters.Schemas.url](#query_parameter_collection_format.RequestQueryParameters.Schemas.url) | | 
context | [RequestQueryParameters.Schemas.context](#query_parameter_collection_format.RequestQueryParameters.Schemas.context) | | 
refParam | [RequestQueryParameters.Schemas.refParam](#query_parameter_collection_format.RequestQueryParameters.Schemas.refParam) | | 


# <a id="query_parameter_collection_format.RequestQueryParameters.Schemas.pipe" >RequestQueryParameters.Schemas.pipe</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

# <a id="query_parameter_collection_format.RequestQueryParameters.Schemas.ioutil" >RequestQueryParameters.Schemas.ioutil</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

# <a id="query_parameter_collection_format.RequestQueryParameters.Schemas.http" >RequestQueryParameters.Schemas.http</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

# <a id="query_parameter_collection_format.RequestQueryParameters.Schemas.url" >RequestQueryParameters.Schemas.url</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

# <a id="query_parameter_collection_format.RequestQueryParameters.Schemas.context" >RequestQueryParameters.Schemas.context</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

# <a id="query_parameter_collection_format.RequestQueryParameters.Schemas.refParam" >RequestQueryParameters.Schemas.refParam</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**StringWithValidation**](../../models/StringWithValidation.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#query_parameter_collection_format.response_for_200.ApiResponse) | Success

#### <a id="query_parameter_collection_format.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **ref_object_in_query**
<a name="ref_object_in_query"></a>

user list

### Example

```python
import petstore_api
from petstore_api.apis.tags import fake_api
from petstore_api.model.foo import Foo
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
    query_params = {
        'mapBean': Foo(
        bar=Bar("bar"),
    ),
    }
    try:
        # user list
        api_response = api_instance.ref_object_in_query(
            query_params=query_params,
        )
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->ref_object_in_query: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[query_params](#ref_object_in_query.RequestQueryParameters) | [RequestQueryParameters.Params](#ref_object_in_query.RequestQueryParameters.Params) | |
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="ref_object_in_query.RequestQueryParameters" >query_params</a>
#### <a id="ref_object_in_query.RequestQueryParameters.Params" >RequestQueryParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
mapBean | [RequestQueryParameters.Schemas.mapBean](#ref_object_in_query.RequestQueryParameters.Schemas.mapBean) | | optional


# <a id="ref_object_in_query.RequestQueryParameters.Schemas.mapBean" >RequestQueryParameters.Schemas.mapBean</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**Foo**](../../models/Foo.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#ref_object_in_query.response_for_200.ApiResponse) | ok

#### <a id="ref_object_in_query.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **response_without_schema**
<a name="response_without_schema"></a>

receives a response without schema

### Example

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

    # example, this endpoint has no required or optional parameters
    try:
        # receives a response without schema
        api_response = api_instance.response_without_schema()
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->response_without_schema: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#response_without_schema.response_for_200.ApiResponse) | contents without schema definition

#### <a id="response_without_schema.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[Unset, Unset, ] |  |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **string**
<a name="string"></a>


Test serialization of outer string types

### Example

```python
import petstore_api
from petstore_api.apis.tags import fake_api
from petstore_api.model.string import String
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
    body = String("body_example")
    try:
        api_response = api_instance.string(
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->string: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#string.RequestBody) | typing.Union[[RequestBody.Schemas.application_json](#string.RequestBody.Schemas.application_json), Unset] | optional, default is unset |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="string.RequestBody" >body</a>

# <a id="string.RequestBody.Schemas.application_json" >RequestBody.Schemas.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**String**](../../models/String.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#string.response_for_200.ApiResponse) | Output string

#### <a id="string.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.BodySchemas.application_json](#string.response_for_200.BodySchemas.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="string.response_for_200.BodySchemas.application_json" >response_for_200.BodySchemas.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**String**](../../models/String.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **string_enum**
<a name="string_enum"></a>


Test serialization of outer enum

### Example

```python
import petstore_api
from petstore_api.apis.tags import fake_api
from petstore_api.model.string_enum import StringEnum
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
    body = StringEnum("placed")
    try:
        api_response = api_instance.string_enum(
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->string_enum: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#string_enum.RequestBody) | typing.Union[[RequestBody.Schemas.application_json](#string_enum.RequestBody.Schemas.application_json), Unset] | optional, default is unset |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="string_enum.RequestBody" >body</a>

# <a id="string_enum.RequestBody.Schemas.application_json" >RequestBody.Schemas.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**StringEnum**](../../models/StringEnum.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#string_enum.response_for_200.ApiResponse) | Output enum

#### <a id="string_enum.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.BodySchemas.application_json](#string_enum.response_for_200.BodySchemas.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="string_enum.response_for_200.BodySchemas.application_json" >response_for_200.BodySchemas.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**StringEnum**](../../models/StringEnum.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **upload_download_file**
<a name="upload_download_file"></a>

uploads a file and downloads a file using application/octet-stream

### Example

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

    # example passing only required values which don't have defaults set
    body = open('/path/to/file', 'rb')
    try:
        # uploads a file and downloads a file using application/octet-stream
        api_response = api_instance.upload_download_file(
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->upload_download_file: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#upload_download_file.RequestBody) | typing.Union[[RequestBody.Schemas.application_octet_stream](#upload_download_file.RequestBody.Schemas.application_octet_stream)] | required |
content_type | str | optional, default is 'application/octet-stream' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/octet-stream', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="upload_download_file.RequestBody" >body</a>

# <a id="upload_download_file.RequestBody.Schemas.application_octet_stream" >RequestBody.Schemas.application_octet_stream</a>

file to upload

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
bytes, io.FileIO, io.BufferedReader,  | bytes, FileIO,  | file to upload | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#upload_download_file.response_for_200.ApiResponse) | successful operation

#### <a id="upload_download_file.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.BodySchemas.application_octet_stream](#upload_download_file.response_for_200.BodySchemas.application_octet_stream), ] |  |
headers | Unset | headers were not defined |

# <a id="upload_download_file.response_for_200.BodySchemas.application_octet_stream" >response_for_200.BodySchemas.application_octet_stream</a>

file to download

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
bytes, io.FileIO, io.BufferedReader,  | bytes, FileIO,  | file to download | 

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **upload_file**
<a name="upload_file"></a>

uploads a file using multipart/form-data

### Example

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
    body = dict(
        additional_metadata="additional_metadata_example",
        file=open('/path/to/file', 'rb'),
    )
    try:
        # uploads a file using multipart/form-data
        api_response = api_instance.upload_file(
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->upload_file: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#upload_file.RequestBody) | typing.Union[[RequestBody.Schemas.multipart_form_data](#upload_file.RequestBody.Schemas.multipart_form_data), Unset] | optional, default is unset |
content_type | str | optional, default is 'multipart/form-data' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="upload_file.RequestBody" >body</a>

# <a id="upload_file.RequestBody.Schemas.multipart_form_data" >RequestBody.Schemas.multipart_form_data</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**file** | bytes, io.FileIO, io.BufferedReader,  | bytes, FileIO,  | file to upload | 
**additionalMetadata** | str,  | str,  | Additional data to pass to server | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#upload_file.response_for_200.ApiResponse) | successful operation

#### <a id="upload_file.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.BodySchemas.application_json](#upload_file.response_for_200.BodySchemas.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="upload_file.response_for_200.BodySchemas.application_json" >response_for_200.BodySchemas.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponse**](../../models/ApiResponse.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **upload_files**
<a name="upload_files"></a>

uploads files using multipart/form-data

### Example

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
    body = dict(
        files=[
            open('/path/to/file', 'rb')
        ],
    )
    try:
        # uploads files using multipart/form-data
        api_response = api_instance.upload_files(
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->upload_files: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#upload_files.RequestBody) | typing.Union[[RequestBody.Schemas.multipart_form_data](#upload_files.RequestBody.Schemas.multipart_form_data), Unset] | optional, default is unset |
content_type | str | optional, default is 'multipart/form-data' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="upload_files.RequestBody" >body</a>

# <a id="upload_files.RequestBody.Schemas.multipart_form_data" >RequestBody.Schemas.multipart_form_data</a>

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**[files](#files)** | list, tuple,  | tuple,  |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# files

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | bytes, io.FileIO, io.BufferedReader,  | bytes, FileIO,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [response_for_200.ApiResponse](#upload_files.response_for_200.ApiResponse) | successful operation

#### <a id="upload_files.response_for_200.ApiResponse" >response_for_200.ApiResponse</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[response_for_200.BodySchemas.application_json](#upload_files.response_for_200.BodySchemas.application_json), ] |  |
headers | Unset | headers were not defined |

# <a id="upload_files.response_for_200.BodySchemas.application_json" >response_for_200.BodySchemas.application_json</a>
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiResponse**](../../models/ApiResponse.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)


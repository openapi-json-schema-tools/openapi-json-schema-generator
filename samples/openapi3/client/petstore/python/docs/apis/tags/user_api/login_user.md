<a name="top"></a>
# **login_user**
<a name="login_user"></a>

## Table of Contents
- [Summary](#summary)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Authorization](#authorization)
- [Code Sample](#code-sample)

## Summary
Logs user into the system

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[query_params](#requestqueryparameters) | [RequestQueryParameters.Params](#RequestQueryParametersParams) | |
accept_content_types | typing.Tuple[str] | default is ("application/xml", "application/json", ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### <a id="requestqueryparameters" >query_params</a>
#### <a id="RequestQueryParametersParams" >RequestQueryParameters.Params</a>

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
username | [Parameter0.schema](#parameter_0schema) | | 
password | [Parameter1.schema](#parameter_1schema) | | 


#### <a id="parameter_0schema" >Parameter0.schema</a>

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

#### <a id="parameter_1schema" >Parameter1.schema</a>

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

## Return Types

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ResponseFor200.response_cls](#response_200response_cls) | successful operation
400 | [ResponseFor400.response_cls](#response_400response_cls) | Invalid username/password supplied

### <a id="response_200response_cls" >ResponseFor200.response_cls</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[[ResponseFor200.content.application_xml.schema](#response_200contentapplication_xmlschema), [ResponseFor200.content.application_json.schema](#response_200contentapplication_jsonschema), ] |  |
headers | [response_200.Headers](#response_200Headers) |  |

#### <a id="response_200contentapplication_xmlschema" >ResponseFor200.content.application_xml.schema</a>

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

#### <a id="response_200contentapplication_jsonschema" >ResponseFor200.content.application_json.schema</a>

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |
#### <a id="response_200Headers" >response_200.Headers</a>

Key | Accessed Type | Description  | Notes
------------- | ------------- | ------------- | -------------
ref-schema-header | [RefSchemaHeader.schema](../../../components/headers/header_ref_schema_header.md#header_ref_schema_headerschema) | | 
X-Rate-Limit | [ResponseFor200.headers.header_x_rate_limit.content.application_json.schema](#response_200headersheader_x_rate_limitcontentapplication_jsonschema) | | 
int32 | [Int32JsonContentTypeHeader.content.application_json.schema](../../../components/headers/header_int32_json_content_type_header.md#header_int32_json_content_type_headercontentapplication_jsonschema) | | 
X-Expires-After | [ResponseFor200.headers.header_x_expires_after.schema](#response_200headersheader_x_expires_afterschema) | | optional
ref-content-schema-header | [RefContentSchemaHeader.content.application_json.schema](../../../components/headers/header_ref_content_schema_header.md#header_ref_content_schema_headercontentapplication_jsonschema) | | 
stringHeader | [RefStringHeader.schema](../../../components/headers/header_ref_string_header.md#header_ref_string_headerschema) | | 
numberHeader | [NumberHeader.schema](../../../components/headers/header_number_header.md#header_number_headerschema) | | optional

#### <a id="response_200headersheader_x_rate_limitcontentapplication_jsonschema" >ResponseFor200.headers.header_x_rate_limit.content.application_json.schema</a>

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 32 bit integer

#### <a id="response_200headersheader_x_expires_afterschema" >ResponseFor200.headers.header_x_expires_after.schema</a>

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str, datetime.datetime,  | str,  |  | value must conform to RFC-3339 date-time

### <a id="response_400response_cls" >ResponseFor400.response_cls</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

## Authorization

No authorization required

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
    query_params = {
        'username': "username_example",
        'password': "password_example",
    }
    try:
        # Logs user into the system
        api_response = api_instance.login_user(
            query_params=query_params,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling UserApi->login_user: %s\n" % e)
```

[[Back to top]](#top) [[Back to API]](../UserApi.md) [[Back to Endpoints]](../../../../README.md#Endpoints) [[Back to README]](../../../../README.md)

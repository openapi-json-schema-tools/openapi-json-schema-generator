petstore_api.paths.fake_test_query_paramters.operation
# Operation Method Name

| Method Name | Api Class | Notes |
| ----------- | --------- | ----- |
| query_parameter_collection_format | [FakeApi](../../apis/tags/fake_api.md) | This api is only for tag=fake |
| put | ApiForPut | This api is only for this endpoint |
| put | FakeTestQueryParamters | This api is only for path=/fake/test-query-paramters |

## Table of Contents
- [General Info](#general-info)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Servers](#servers)
- [Code Sample](#code-sample)

## General Info
| Field | Value |
| ----- | ----- |
| Description | To test the collection format in query parameters |
| Path | "/fake/test-query-paramters" |
| HTTP Method | put |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[query_params](#query_params) | [QueryParametersDictInput](#queryparameters-queryparametersdictinput), [QueryParametersDict](#queryparameters-queryparametersdict) | |
server_index | typing.Optional[int] | default is None | Allows one to select a different [server](#servers). If not None, must be one of [0, 1, 2]
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_response.ApiResponseWithoutDeserialization will be returned
### query_params
### QueryParameters
```
type: schemas.Schema
```

#### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[QueryParametersDictInput](#queryparameters-queryparametersdictinput), [QueryParametersDict](#queryparameters-queryparametersdict) | [QueryParametersDict](#queryparameters-queryparametersdict) |

#### QueryParameters QueryParametersDictInput
```
type: typing.TypedDict
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**context** | [schema.SchemaTupleInput](../../paths/fake_test_query_paramters/put/parameters/parameter_4/schema.md#schematupleinput), [schema_2.SchemaTuple](../../paths/fake_test_query_paramters/put/parameters/parameter_4/schema.md#schematuple) |  |
**http** | [schema.SchemaTupleInput](../../paths/fake_test_query_paramters/put/parameters/parameter_2/schema.md#schematupleinput), [schema_3.SchemaTuple](../../paths/fake_test_query_paramters/put/parameters/parameter_2/schema.md#schematuple) |  |
**ioutil** | [schema.SchemaTupleInput](../../paths/fake_test_query_paramters/put/parameters/parameter_1/schema.md#schematupleinput), [schema.SchemaTuple](../../paths/fake_test_query_paramters/put/parameters/parameter_1/schema.md#schematuple) |  |
**pipe** | [schema.SchemaTupleInput](../../paths/fake_test_query_paramters/put/parameters/parameter_0/schema.md#schematupleinput), [schema_4.SchemaTuple](../../paths/fake_test_query_paramters/put/parameters/parameter_0/schema.md#schematuple) |  |
**refParam** | str |  |
**url** | [schema.SchemaTupleInput](../../paths/fake_test_query_paramters/put/parameters/parameter_3/schema.md#schematupleinput), [schema_5.SchemaTuple](../../paths/fake_test_query_paramters/put/parameters/parameter_3/schema.md#schematuple) |  |

#### QueryParameters QueryParametersDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]
```
##### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**context** | [schema.SchemaTupleInput](../../paths/fake_test_query_paramters/put/parameters/parameter_4/schema.md#schematupleinput), [schema_2.SchemaTuple](../../paths/fake_test_query_paramters/put/parameters/parameter_4/schema.md#schematuple) |  |
**http** | [schema.SchemaTupleInput](../../paths/fake_test_query_paramters/put/parameters/parameter_2/schema.md#schematupleinput), [schema_3.SchemaTuple](../../paths/fake_test_query_paramters/put/parameters/parameter_2/schema.md#schematuple) |  |
**ioutil** | [schema.SchemaTupleInput](../../paths/fake_test_query_paramters/put/parameters/parameter_1/schema.md#schematupleinput), [schema.SchemaTuple](../../paths/fake_test_query_paramters/put/parameters/parameter_1/schema.md#schematuple) |  |
**pipe** | [schema.SchemaTupleInput](../../paths/fake_test_query_paramters/put/parameters/parameter_0/schema.md#schematupleinput), [schema_4.SchemaTuple](../../paths/fake_test_query_paramters/put/parameters/parameter_0/schema.md#schematuple) |  |
**refParam** | str |  |
**url** | [schema.SchemaTupleInput](../../paths/fake_test_query_paramters/put/parameters/parameter_3/schema.md#schematupleinput), [schema_5.SchemaTuple](../../paths/fake_test_query_paramters/put/parameters/parameter_3/schema.md#schematuple) |  |

##### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**context** | [schema.SchemaTuple](../../paths/fake_test_query_paramters/put/parameters/parameter_4/schema.md#schematuple) |  |
**http** | [schema.SchemaTuple](../../paths/fake_test_query_paramters/put/parameters/parameter_2/schema.md#schematuple) |  |
**ioutil** | [schema.SchemaTuple](../../paths/fake_test_query_paramters/put/parameters/parameter_1/schema.md#schematuple) |  |
**pipe** | [schema.SchemaTuple](../../paths/fake_test_query_paramters/put/parameters/parameter_0/schema.md#schematuple) |  |
**refParam** | str |  |
**url** | [schema.SchemaTuple](../../paths/fake_test_query_paramters/put/parameters/parameter_3/schema.md#schematuple) |  |

##### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [QueryParametersDictInput](#queryparameters-queryparametersdictinput), [QueryParametersDict](#queryparameters-queryparametersdict) | [QueryParametersDict](#queryparameters-queryparametersdict) | a constructor

## Return Types

HTTP Status Code | Class | Description
------------- | ------------- | -------------
n/a | api_response.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [SuccessDescriptionOnly.ApiResponse](../../components/responses/response_success_description_only.md#apiresponse) | Success

## Servers

Set the available servers by defining your used servers in ApiConfiguration.server_info
Then select your server by setting a server index in ApiConfiguration.server_index_info or by
passing server_index in to the endpoint method.
- these servers are the general api servers
- defaults to server_index=0, server.url = http://petstore.swagger.io:80/v2

server_index | Class | Description
------------ | ----- | ------------
0 | [Server0](../../servers/server_0.md) | petstore server
1 | [Server1](../../servers/server_1.md) | The local server
2 | [Server2](../../servers/server_2.md) | staging server with no variables

## Code Sample

```python
import petstore_api
from petstore_api.configurations import api_configuration
from petstore_api.apis.tags import fake_api
from petstore_api.paths.fake_test_query_paramters.put import operation
from pprint import pprint
used_configuration = api_configuration.ApiConfiguration(
)
# Enter a context with an instance of the API client
with petstore_api.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = fake_api.FakeApi(api_client)

    # example passing only required values which don't have defaults set
    query_params: operation.QueryParametersDictInput = {
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
        'refParam': string_with_validation.StringWithValidation.validate("refParam_example"),
    }
    try:
        api_response = api_instance.query_parameter_collection_format(
            query_params=query_params,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->query_parameter_collection_format: %s\n" % e)
```

[[Back to top]](#top)
[[Back to FakeApi API]](../../apis/tags/fake_api.md)
[[Back to Endpoints]](../../../README.md#Endpoints) [[Back to README]](../../../README.md)
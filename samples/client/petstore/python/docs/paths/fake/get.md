petstore_api.paths.fake.operation
# Operation Method Name

| Method Name | Api Class | Notes |
| ----------- | --------- | ----- |
| enum_parameters | [FakeApi](../../apis/tags/fake_api.md) | This api is only for tag=fake |
| get | ApiForGet | This api is only for this endpoint |
| get | Fake | This api is only for path=/fake |

## Table of Contents
- [General Info](#general-info)
- [Arguments](#arguments)
- [Return Types](#return-types)
- [Servers](#servers)
- [Code Sample](#code-sample)

## General Info
| Field | Value |
| ----- | ----- |
| Summary | To test enum parameters |
| Description | To test enum parameters |
| Path | "/fake" |
| HTTP Method | get |

## Arguments

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
[body](#requestbody) | typing.Union[[RequestBody.content.application_x_www_form_urlencoded.schema](#RequestBody-content-applicationxwwwformurlencoded-schema), Unset, dict, schemas.immutabledict] | optional, default is unset |
[query_params](#query_params) | [RequestQueryParameters.Params](#requestqueryparametersparams), dict | |
[header_params](#header_params) | [RequestHeaderParameters.Params](#requestheaderparametersparams), dict | |
content_type | str | optional, default is 'application/x-www-form-urlencoded' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ("application/json", ) | Tells the server the content type(s) that are accepted by the client
server_index | typing.Optional[int] | default is None | Allows one to select a different [server](#servers). If not None, must be one of [0, 1, 2]
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_response.ApiResponseWithoutDeserialization will be returned

### RequestBody

#### Content Type To Schema
Content-Type | Schema
------------ | -------
"application/x-www-form-urlencoded" | [content.application_x_www_form_urlencoded.Schema](#requestbody-content-applicationxwwwformurlencoded-schema)

#### RequestBody content ApplicationXWwwFormUrlencoded Schema
petstore_api.paths.fake.get.request_body.content.application_x_www_form_urlencoded.schema
```
type: schemas.Schema
```

##### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[SchemaDictInput](#requestbody-content-applicationxwwwformurlencoded-schema-schemadictinput), [SchemaDict](#requestbody-content-applicationxwwwformurlencoded-schema-schemadict) | [SchemaDict](#requestbody-content-applicationxwwwformurlencoded-schema-schemadict) |

##### RequestBody content ApplicationXWwwFormUrlencoded Schema SchemaDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**enum_form_string_array** | [EnumFormStringArrayTupleInput](#requestbody-content-applicationxwwwformurlencoded-schema-enumformstringarraytupleinput), [EnumFormStringArrayTuple](#requestbody-content-applicationxwwwformurlencoded-schema-enumformstringarraytuple) | Form parameter enum test (string array) | [optional]
**enum_form_string** | typing.Literal["_abc", "-efg", "(xyz)"] | Form parameter enum test (string) | [optional] must be one of ["_abc", "-efg", "(xyz)"] if omitted the server will use the default value of -efg
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

##### RequestBody content ApplicationXWwwFormUrlencoded Schema SchemaDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
###### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**enum_form_string_array** | [EnumFormStringArrayTupleInput](#requestbody-content-applicationxwwwformurlencoded-schema-enumformstringarraytupleinput), [EnumFormStringArrayTuple](#requestbody-content-applicationxwwwformurlencoded-schema-enumformstringarraytuple), schemas.Unset | Form parameter enum test (string array) | [optional]
**enum_form_string** | typing.Literal["_abc", "-efg", "(xyz)"], schemas.Unset | Form parameter enum test (string) | [optional] must be one of ["_abc", "-efg", "(xyz)"] if omitted the server will use the default value of -efg
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

###### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**enum_form_string_array** | [EnumFormStringArrayTuple](#requestbody-content-applicationxwwwformurlencoded-schema-enumformstringarraytuple), schemas.Unset | Form parameter enum test (string array) | [optional]
**enum_form_string** | typing.Literal["_abc", "-efg", "(xyz)"], schemas.Unset | Form parameter enum test (string) | [optional] must be one of ["_abc", "-efg", "(xyz)"] if omitted the server will use the default value of -efg

###### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [SchemaDictInput](#requestbody-content-applicationxwwwformurlencoded-schema-schemadictinput), [SchemaDict](#requestbody-content-applicationxwwwformurlencoded-schema-schemadict) | [SchemaDict](#requestbody-content-applicationxwwwformurlencoded-schema-schemadict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | provides type safety for additional properties

#### RequestBody content ApplicationXWwwFormUrlencoded Schema
```
type: schemas.Schema
```

##### Description
Form parameter enum test (string array)

##### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[EnumFormStringArrayTupleInput](#requestbody-content-applicationxwwwformurlencoded-schema-enumformstringarraytupleinput), [EnumFormStringArrayTuple](#requestbody-content-applicationxwwwformurlencoded-schema-enumformstringarraytuple) | [EnumFormStringArrayTuple](#requestbody-content-applicationxwwwformurlencoded-schema-enumformstringarraytuple) |

##### RequestBody content ApplicationXWwwFormUrlencoded Schema EnumFormStringArrayTupleInput
```
type: typing.Union[
    typing.List[
        typing.Literal[
            ">",
            "$"
        ],
    ],
    typing.Tuple[
        typing.Literal[
            ">",
            "$"
        ],
        ...
    ]
]
```
List/Tuple Item Type | Description | Notes
-------------------- | ------------- | -------------
typing.Literal[">", "$"] |  | must be one of [">", "$"] if omitted the server will use the default value of $

##### RequestBody content ApplicationXWwwFormUrlencoded Schema EnumFormStringArrayTuple
```
base class: typing.Tuple[
    typing.Literal[">", "$"],
    ...
]
```
###### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [EnumFormStringArrayTupleInput](#requestbody-content-applicationxwwwformurlencoded-schema-enumformstringarraytupleinput), [EnumFormStringArrayTuple](#requestbody-content-applicationxwwwformurlencoded-schema-enumformstringarraytuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

###### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | typing.Literal[">", "$"] | must be one of [">", "$"] if omitted the server will use the default value of $ This method is used under the hood when instance[0] is called

### query_params
#### RequestQueryParameters.Params
This is a TypedDict

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
enum_query_string_array | [Parameter2.schema](#parameter2-schema), list, tuple | | optional
enum_query_string | [Parameter3.schema](#parameter3-schema), str | | optional
enum_query_integer | [Parameter4.schema](#parameter4-schema), int | | optional
enum_query_double | [Parameter5.schema](#parameter5-schema), float, int | | optional


#### Parameter2

##### Description
Query parameter enum test (string array)

##### Parameter2 Schema
petstore_api.paths.fake.get.parameters.parameter_2.schema
```
type: schemas.Schema
```

###### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[SchemaTupleInput](#parameter2-schema-schematupleinput), [SchemaTuple](#parameter2-schema-schematuple) | [SchemaTuple](#parameter2-schema-schematuple) |

###### Parameter2 Schema SchemaTupleInput
```
type: typing.Union[
    typing.List[
        typing.Literal[
            ">",
            "$"
        ],
    ],
    typing.Tuple[
        typing.Literal[
            ">",
            "$"
        ],
        ...
    ]
]
```
List/Tuple Item Type | Description | Notes
-------------------- | ------------- | -------------
typing.Literal[">", "$"] |  | must be one of [">", "$"] if omitted the server will use the default value of $

###### Parameter2 Schema SchemaTuple
```
base class: typing.Tuple[
    typing.Literal[">", "$"],
    ...
]
```
####### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [SchemaTupleInput](#parameter2-schema-schematupleinput), [SchemaTuple](#parameter2-schema-schematuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

####### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | typing.Literal[">", "$"] | must be one of [">", "$"] if omitted the server will use the default value of $ This method is used under the hood when instance[0] is called

#### Parameter3

##### Description
Query parameter enum test (string)

##### Parameter3 Schema
petstore_api.paths.fake.get.parameters.parameter_3.schema
```
type: schemas.Schema
```

###### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
typing.Literal["_abc", "-efg", "(xyz)"] | typing.Literal["_abc", "-efg", "(xyz)"] | must be one of ["_abc", "-efg", "(xyz)"] if omitted the server will use the default value of -efg

#### Parameter4

##### Description
Query parameter enum test (double)

##### Parameter4 Schema
petstore_api.paths.fake.get.parameters.parameter_4.schema
```
type: schemas.Schema
```

###### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
typing.Literal[1, -2] | typing.Literal[1, -2] | must be one of [1, -2] value must be a 32 bit integer

#### Parameter5

##### Description
Query parameter enum test (double)

##### Parameter5 Schema
petstore_api.paths.fake.get.parameters.parameter_5.schema
```
type: schemas.Schema
```

###### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
float, int | float, int | must be one of [1.1, -1.2] value must be a 64 bit float

### header_params
#### RequestHeaderParameters.Params
This is a TypedDict

Key | Input Type | Description  | Notes
------------- | ------------- | ------------- | -------------
enum_header_string_array | [Parameter0.schema](#parameter0-schema), list, tuple | | optional
enum_header_string | [Parameter1.schema](#parameter1-schema), str | | optional


#### Parameter0

##### Description
Header parameter enum test (string array)

##### Parameter0 Schema
petstore_api.paths.fake.get.parameters.parameter_0.schema
```
type: schemas.Schema
```

###### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[SchemaTupleInput](#parameter0-schema-schematupleinput), [SchemaTuple](#parameter0-schema-schematuple) | [SchemaTuple](#parameter0-schema-schematuple) |

###### Parameter0 Schema SchemaTupleInput
```
type: typing.Union[
    typing.List[
        typing.Literal[
            ">",
            "$"
        ],
    ],
    typing.Tuple[
        typing.Literal[
            ">",
            "$"
        ],
        ...
    ]
]
```
List/Tuple Item Type | Description | Notes
-------------------- | ------------- | -------------
typing.Literal[">", "$"] |  | must be one of [">", "$"] if omitted the server will use the default value of $

###### Parameter0 Schema SchemaTuple
```
base class: typing.Tuple[
    typing.Literal[">", "$"],
    ...
]
```
####### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [SchemaTupleInput](#parameter0-schema-schematupleinput), [SchemaTuple](#parameter0-schema-schematuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

####### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | typing.Literal[">", "$"] | must be one of [">", "$"] if omitted the server will use the default value of $ This method is used under the hood when instance[0] is called

#### Parameter1

##### Description
Header parameter enum test (string)

##### Parameter1 Schema
petstore_api.paths.fake.get.parameters.parameter_1.schema
```
type: schemas.Schema
```

###### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
typing.Literal["_abc", "-efg", "(xyz)"] | typing.Literal["_abc", "-efg", "(xyz)"] | must be one of ["_abc", "-efg", "(xyz)"] if omitted the server will use the default value of -efg

## Return Types

HTTP Status Code | Class | Description
------------- | ------------- | -------------
n/a | api_response.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [SuccessDescriptionOnly.response_cls](../../components/responses/response_success_description_only.md#response_success_description_onlyresponse_cls) | Success
404 | [ResponseFor404.response_cls](#responsefor404-response_cls) | Not found

## ResponseFor404

### Description
Not found

### ResponseFor404 response_cls
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#responsefor404-body) | [content.application_json.schema](#responsefor404-content-applicationjson-schema) |  |
headers | Unset | headers were not defined |

### ResponseFor404 Body
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema](#responsefor404-content-applicationjson-schema)

### Body Details
#### ResponseFor404 content ApplicationJson Schema
petstore_api.paths.fake.get.responses.response_404.content.application_json.schema
```
type: schemas.Schema
```

##### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict | schemas.immutabledict |

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
from petstore_api.paths.fake.get import operation
from pprint import pprint
used_configuration = api_configuration.ApiConfiguration(
)
# Enter a context with an instance of the API client
with petstore_api.ApiClient(used_configuration) as api_client:
    # Create an instance of the API class
    api_instance = fake_api.FakeApi(api_client)

    # example passing only optional values
    query_params: operation.QueryParametersDictInput = {
        'enum_query_string_array': [
        "$"
    ],
        'enum_query_string': "-efg",
        'enum_query_integer': 1,
        'enum_query_double': 1.1,
    }
    header_params: operation.HeaderParametersDictInput = {
        'enum_header_string_array': [
        "$"
    ],
        'enum_header_string': "-efg",
    }
    body = {
        "enum_form_string_array": [
            "$"
        ],
        "enum_form_string": "-efg",
    }
    try:
        # To test enum parameters
        api_response = api_instance.enum_parameters(
            query_params=query_params,
            header_params=header_params,
            body=body,
        )
        pprint(api_response)
    except petstore_api.ApiException as e:
        print("Exception when calling FakeApi->enum_parameters: %s\n" % e)
```

[[Back to top]](#top)
[[Back to FakeApi API]](../../apis/tags/fake_api.md)
[[Back to Endpoints]](../../../README.md#Endpoints) [[Back to README]](../../../README.md)
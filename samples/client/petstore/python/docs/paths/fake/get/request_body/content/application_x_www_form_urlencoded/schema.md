petstore_api.paths.fake.get.request_body.content.application_x_www_form_urlencoded.schema
# Schema

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[SchemaDictInput](#schemadictinput), [SchemaDict](#schemadict) | [SchemaDict](#schemadict) |

## SchemaDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**enum_form_string_array** | list, tuple | Form parameter enum test (string array) | [optional]
**enum_form_string** | str | Form parameter enum test (string) | [optional] must be one of ["_abc", "-efg", "(xyz)"] if omitted the server will use the default value of -efg
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## SchemaDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**enum_form_string_array** | [EnumFormStringArrayTupleInput](#enumformstringarraytupleinput), [EnumFormStringArrayTuple](#enumformstringarraytuple), schemas.Unset | Form parameter enum test (string array) | [optional]
**enum_form_string** | str, schemas.Unset | Form parameter enum test (string) | [optional] must be one of ["_abc", "-efg", "(xyz)"] if omitted the server will use the default value of -efg
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**enum_form_string_array** | [EnumFormStringArrayTuple](#enumformstringarraytuple), schemas.Unset | Form parameter enum test (string array) | [optional]
**enum_form_string** | str, schemas.Unset | Form parameter enum test (string) | [optional] must be one of ["_abc", "-efg", "(xyz)"] if omitted the server will use the default value of -efg

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [SchemaDictInput](#schemadictinput), [SchemaDict](#schemadict) | [SchemaDict](#schemadict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | provides type safety for additional properties

petstore_api.paths.fake.get.request_body.content.application_x_www_form_urlencoded.schema.properties.enum_form_string_array
# EnumFormStringArray

## Description
Form parameter enum test (string array)

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[EnumFormStringArrayTupleInput](#enumformstringarraytupleinput), [EnumFormStringArrayTuple](#enumformstringarraytuple) | [EnumFormStringArrayTuple](#enumformstringarraytuple) |

## EnumFormStringArrayTupleInput
```
type: typing.Union[
    typing.List[
        typing_extensions.Literal[
            ">",
            "$"
        ],
    ],
    typing.Tuple[
        typing_extensions.Literal[
            ">",
            "$"
        ],
        ...
    ]
]
```
Index | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
≥ 0 | str |  | must be one of [">", "$"] if omitted the server will use the default value of $

## EnumFormStringArrayTuple
```
base class: typing.Tuple[
    typing_extensions.Literal[">", "$"],
    ...
]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [EnumFormStringArrayTupleInput](#enumformstringarraytupleinput), [EnumFormStringArrayTuple](#enumformstringarraytuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | typing_extensions.Literal[">", "$"] | must be one of [">", "$"] if omitted the server will use the default value of $ This method is used under the hood when instance[0] is called

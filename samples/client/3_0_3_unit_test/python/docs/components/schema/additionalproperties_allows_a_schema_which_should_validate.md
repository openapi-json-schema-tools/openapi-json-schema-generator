# AdditionalpropertiesAllowsASchemaWhichShouldValidate
unit_test_api.components.schema.additionalproperties_allows_a_schema_which_should_validate
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[AdditionalpropertiesAllowsASchemaWhichShouldValidateDictInput](#additionalpropertiesallowsaschemawhichshouldvalidatedictinput), [AdditionalpropertiesAllowsASchemaWhichShouldValidateDict](#additionalpropertiesallowsaschemawhichshouldvalidatedict) | [AdditionalpropertiesAllowsASchemaWhichShouldValidateDict](#additionalpropertiesallowsaschemawhichshouldvalidatedict) |

## AdditionalpropertiesAllowsASchemaWhichShouldValidateDictInput
```
type: typing.Mapping[
    str,
    typing.Union[
        typing.Union[
            schemas.INPUT_TYPES_ALL,
            schemas.OUTPUT_BASE_TYPES
        ],
        typing.Union[
            schemas.INPUT_TYPES_ALL,
            schemas.OUTPUT_BASE_TYPES
        ],
        bool,
    ]
]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**foo** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader |  | [optional]
**bar** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader |  | [optional]
**any_string_name** | bool | any string name can be used but the value must be the correct type | [optional]

## AdditionalpropertiesAllowsASchemaWhichShouldValidateDict
```
base class: schemas.immutabledict[str, bool]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**foo** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset |  | [optional]
**bar** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset |  | [optional]
**kwargs** | bool | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**foo** | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO, schemas.Unset |  | [optional]
**bar** | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO, schemas.Unset |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [AdditionalpropertiesAllowsASchemaWhichShouldValidateDictInput](#additionalpropertiesallowsaschemawhichshouldvalidatedictinput), [AdditionalpropertiesAllowsASchemaWhichShouldValidateDict](#additionalpropertiesallowsaschemawhichshouldvalidatedict) | [AdditionalpropertiesAllowsASchemaWhichShouldValidateDict](#additionalpropertiesallowsaschemawhichshouldvalidatedict) | a constructor
get_additional_property_ | str | bool, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

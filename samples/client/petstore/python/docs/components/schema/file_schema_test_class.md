petstore_api.components.schema.file_schema_test_class
# Schema FileSchemaTestClass

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[FileSchemaTestClassDictInput](#fileschematestclassdictinput), [FileSchemaTestClassDict](#fileschematestclassdict) | [FileSchemaTestClassDict](#fileschematestclassdict) |

## FileSchemaTestClassDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**file** | [**File**](file.md), dict, schemas.immutabledict |  | [optional]
**files** | list, tuple |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## FileSchemaTestClassDict
### from_dict_ method
Input Type | Return Type
---------- | -----------
[FileSchemaTestClassDictInput](#fileschematestclassdictinput), [FileSchemaTestClassDict](#fileschematestclassdict) | [FileSchemaTestClassDict](#fileschematestclassdict)

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**file** | [**File**](file.md), dict, schemas.immutabledict, schemas.Unset | [**File**](file.md) |  | [optional]
**files** | list, tuple, schemas.Unset | [properties.Files](#properties-files) |  | [optional]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

# properties Files

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[FilesTupleInput](#properties-files-filestupleinput), [FilesTuple](#properties-files-filestuple) | [FilesTuple](#properties-files-filestuple) |

## properties Files FilesTupleInput
Index | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
≥ 0 | [**File**](file.md) |  |

## properties Files FilesTuple
Index | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
≥ 0 | [**File**](file.md) | [**File**](file.md) |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

petstore_api.components.schema.file_schema_test_class
# Schema FileSchemaTestClass

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[FileSchemaTestClassDictInput](#fileschematestclassdictinput), [FileSchemaTestClassDict](#fileschematestclassdict) | [FileSchemaTestClassDict](#fileschematestclassdict) |

## FileSchemaTestClassDictInput
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**file** | [**File**](file.md), dict, schemas.immutabledict |  | [optional]
**files** | list, tuple |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## FileSchemaTestClassDict
base class: schemas.immutabledict[str, typing.Tuple[schemas.OUTPUT_BASE_TYPES]]

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**file** | [**File**](file.md), dict, schemas.immutabledict, schemas.Unset |  | [optional]
**files** | list, tuple, schemas.Unset |  | [optional]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**file** | [**File**](file.md) |  | [optional]
**files** | [properties.Files](#properties-files) |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [FileSchemaTestClassDictInput](#fileschematestclassdictinput), [FileSchemaTestClassDict](#fileschematestclassdict) | [FileSchemaTestClassDict](#fileschematestclassdict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | provides type safety for additional properties

# properties Files

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[FilesTupleInput](#properties-files-filestupleinput), [FilesTuple](#properties-files-filestuple) | [FilesTuple](#properties-files-filestuple) |

## properties Files FilesTupleInput
```
type: typing.Union[
    typing.List[
        typing.Union[
            file.FileDictInput,
            file.FileDict,
        ],
    ],
    typing.Tuple[
        typing.Union[
            file.FileDictInput,
            file.FileDict,
        ],
        ...
    ]
]
```
Index | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
≥ 0 | [**File**](file.md) |  |

## properties Files FilesTuple
```
base class: typing.Tuple[
    file.FileDict,
    ...
]
```
Index | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
≥ 0 | [**File**](file.md) | [**File**](file.md) |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

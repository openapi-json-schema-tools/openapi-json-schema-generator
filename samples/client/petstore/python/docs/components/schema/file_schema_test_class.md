# FileSchemaTestClass
petstore_api.components.schema.file_schema_test_class
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[FileSchemaTestClassDictInput](#fileschematestclassdictinput), [FileSchemaTestClassDict](#fileschematestclassdict) | [FileSchemaTestClassDict](#fileschematestclassdict) |

## FileSchemaTestClassDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**file** | [file.FileDictInput](../../components/schema/file.md#filedictinput), [file.FileDict](../../components/schema/file.md#filedict) |  | [optional]
**files** | [FilesTupleInput](#filestupleinput), [FilesTuple](#filestuple) |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.FileIO | any string name can be used but the value must be the correct type | [optional]

## FileSchemaTestClassDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**file** | [file.FileDictInput](../../components/schema/file.md#filedictinput), [file.FileDict](../../components/schema/file.md#filedict), schemas.Unset |  | [optional]
**files** | [FilesTupleInput](#filestupleinput), [FilesTuple](#filestuple), schemas.Unset |  | [optional]
**kwargs** | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**file** | [file.FileDict](../../components/schema/file.md#filedict), schemas.Unset |  | [optional]
**files** | [FilesTuple](#filestuple), schemas.Unset |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [FileSchemaTestClassDictInput](#fileschematestclassdictinput), [FileSchemaTestClassDict](#fileschematestclassdict) | [FileSchemaTestClassDict](#fileschematestclassdict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO, schemas.Unset | provides type safety for additional properties

# Files
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[FilesTupleInput](#filestupleinput), [FilesTuple](#filestuple) | [FilesTuple](#filestuple) |

## FilesTupleInput
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
List/Tuple Item Type | Description | Notes
-------------------- | ------------- | -------------
[file.FileDictInput](../../components/schema/file.md#filedictinput), [file.FileDict](../../components/schema/file.md#filedict) |  |

## FilesTuple
```
base class: typing.Tuple[
    file.FileDict,
    ...
]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [FilesTupleInput](#filestupleinput), [FilesTuple](#filestuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | [file.FileDict](../../components/schema/file.md#filedict) | This method is used under the hood when instance[0] is called

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

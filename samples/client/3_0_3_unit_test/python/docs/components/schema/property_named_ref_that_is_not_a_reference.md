# PropertyNamedRefThatIsNotAReference
unit_test_api.components.schema.property_named_ref_that_is_not_a_reference
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[PropertyNamedRefThatIsNotAReferenceDictInput](#propertynamedrefthatisnotareferencedictinput), [PropertyNamedRefThatIsNotAReferenceDict](#propertynamedrefthatisnotareferencedict), str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | [PropertyNamedRefThatIsNotAReferenceDict](#propertynamedrefthatisnotareferencedict), str, float, int, bool, None, tuple, bytes, io.FileIO |

## PropertyNamedRefThatIsNotAReferenceDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**$ref** | str |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.FileIO | any string name can be used but the value must be the correct type | [optional]

## PropertyNamedRefThatIsNotAReferenceDict
```
base class: schemas.immutabledict[str, str]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**kwargs** | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [PropertyNamedRefThatIsNotAReferenceDictInput](#propertynamedrefthatisnotareferencedictinput), [PropertyNamedRefThatIsNotAReferenceDict](#propertynamedrefthatisnotareferencedict), str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | [PropertyNamedRefThatIsNotAReferenceDict](#propertynamedrefthatisnotareferencedict), str, float, int, bool, None, tuple, bytes, io.FileIO | a constructor
&lowbar;&lowbar;getitem&lowbar;&lowbar; | str | str | This model has invalid python names so this method is used under the hood when you access instance["$ref"], 
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO, schemas.Unset }} | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

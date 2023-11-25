# File1
org.openapijsonschematools.components.schemas.File.java
```
type: JsonSchema
```

## Description
Must be named &#x60;File&#x60; for test.

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, Object> | FileMap | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**sourceURI** |  | Test capitalization | [optional]
**any_string_name** | Map, List, decimal.Decimal, float, int, String, LocalDate, ZonedDateTime, UUID, boolean, null, bytes, io.FileIO, io.BufferedReader, schemas.FileIO | any string name can be used but the value must be the correct type | [optional]

## FileMap
```
base class: FrozenMap<String, Object>

```

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**sourceURI** |  | Test capitalization | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ |  |  | a constructor
get_additional_property_ | String | FrozenMap, FrozenList, float, int, String, boolean, null, bytes, schemas.FileIO, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

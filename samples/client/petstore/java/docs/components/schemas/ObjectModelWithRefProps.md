# ObjectModelWithRefProps1
org.openapijsonschematools.components.schemas.ObjectModelWithRefProps.java
```
type: JsonSchema
```

## Description
a model that includes properties which should stay primitive (String + Boolean) and one which is defined as a class, NumberWithValidations

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, Object> | ObjectModelWithRefPropsMap | |

```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**myNumber** |  |  | [optional]
**myString** |  |  | [optional]
**myBoolean** |  |  | [optional]
**any_string_name** | Map, List, decimal.Decimal, float, int, String, LocalDate, ZonedDateTime, UUID, boolean, null, bytes, io.FileIO, io.BufferedReader, schemas.FileIO | any string name can be used but the value must be the correct type | [optional]

```
base class: FrozenMap<String, 
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**myNumber** |  |  | [optional]
**myString** |  |  | [optional]
**myBoolean** |  |  | [optional]
**kwargs** | FrozenMap, FrozenList, float, int, String, boolean, null, bytes, schemas.FileIO | any string name can be used but the value must be the correct type a model that includes properties which should stay primitive (String + Boolean) and one which is defined as a class, NumberWithValidations | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**myNumber** |  |  | [optional]
**myString** |  |  | [optional]
**myBoolean** |  |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ |  |  | a constructor
get_additional_property_ | String | FrozenMap, FrozenList, float, int, String, boolean, null, bytes, schemas.FileIO, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

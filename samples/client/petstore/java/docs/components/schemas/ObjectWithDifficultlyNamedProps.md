# ObjectWithDifficultlyNamedProps1
org.openapijsonschematools.components.schemas.ObjectWithDifficultlyNamedProps.java
```
type: JsonSchema
```

## Description
model with properties that have invalid names for python

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
 |  |

```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**123-list** |  |  |
**$special[property.name]** |  |  | [optional]
**123Number** |  |  | [optional]
**any_string_name** | Map, List, decimal.Decimal, float, int, String, LocalDate, ZonedDateTime, UUID, boolean, null, bytes, io.FileIO, io.BufferedReader, schemas.FileIO | any string name can be used but the value must be the correct type | [optional]

```
base class: FrozenMap<String, 
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**kwargs** | FrozenMap, FrozenList, float, int, String, boolean, null, bytes, schemas.FileIO | any string name can be used but the value must be the correct type model with properties that have invalid names for python | [optional] typed value is accessed with the get_additional_property_ method

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ |  |  | a constructor
&lowbar;&lowbar;getitem&lowbar;&lowbar; | String |  | This model has invalid python names so this method is used under the hood when you access instance["123-list"], instance["$special[property.name]"], instance["123Number"], 
get_additional_property_ | String | FrozenMap, FrozenList, float, int, String, boolean, null, bytes, schemas.FileIO, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

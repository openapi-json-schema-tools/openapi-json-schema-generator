# ObjectWithDifficultlyNamedProps1
org.openapijsonschematools.components.schemas.ObjectWithDifficultlyNamedProps.java
```
type: JsonSchema
```

## Description
model with properties that have invalid names for python

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, Object> | ObjectWithDifficultlyNamedPropsMap | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**123-list** | String |  |
**$special[property.name]** | long |  | [optional] value must be a 64 bit integer
**123Number** | long |  | [optional]
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## ObjectWithDifficultlyNamedPropsMap
```
base class: FrozenMap<String, Object>
```

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ |  |  | a constructor
&lowbar;&lowbar;getitem&lowbar;&lowbar; | String |  | This model has invalid python names so this method is used under the hood when you access instance["123-list"], instance["$special[property.name]"], instance["123Number"], 
get_additional_property_ | String | FrozenMap, FrozenList, float, int, String, boolean, null, bytes, schemas.FileIO, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

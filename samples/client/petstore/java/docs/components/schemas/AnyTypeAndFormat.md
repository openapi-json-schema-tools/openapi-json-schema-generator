# AnyTypeAndFormat1
org.openapijsonschematools.components.schemas.AnyTypeAndFormat.java
```
type: JsonSchema
```

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, Object> | AnyTypeAndFormatMap | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | Object |  | [optional]
**date** | Object |  | [optional]
**date-time** | Object |  | [optional]
**number** | Object |  | [optional]
**binary** | Object |  | [optional]
**int32** | Object |  | [optional]
**int64** | Object |  | [optional]
**double** | Object |  | [optional]
**float** | Object |  | [optional]
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## AnyTypeAndFormatMap
```
base class: FrozenMap<String, Object>
```

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**date** |  |  | [optional]
**binary** |  |  | [optional]
**int32** |  |  | [optional]
**int64** |  |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ |  |  | a constructor
&lowbar;&lowbar;getitem&lowbar;&lowbar; | String |  | This model has invalid python names so this method is used under the hood when you access instance["uuid"], instance["date-time"], instance["number"], instance["double"], instance["float"], 
get_additional_property_ | String | FrozenMap, FrozenList, float, int, String, boolean, null, bytes, schemas.FileIO, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

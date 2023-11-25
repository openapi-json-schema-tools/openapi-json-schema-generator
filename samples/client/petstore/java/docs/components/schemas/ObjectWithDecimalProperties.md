# ObjectWithDecimalProperties1
org.openapijsonschematools.components.schemas.ObjectWithDecimalProperties.java
```
type: JsonSchema
```

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, Object> | ObjectWithDecimalPropertiesMap | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**length** | String |  | [optional]
**width** | String |  | [optional]
**cost** | Map<String, Object> |  | [optional]
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## ObjectWithDecimalPropertiesMap
```
base class: FrozenMap<String, Object>
```

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**length** |  |  | [optional]
**width** |  |  | [optional]
**cost** |  |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ |  |  | a constructor
get_additional_property_ | String | FrozenMap, FrozenList, float, int, String, boolean, null, bytes, schemas.FileIO, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

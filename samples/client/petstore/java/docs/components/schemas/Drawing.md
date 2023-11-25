# Drawing1
org.openapijsonschematools.components.schemas.Drawing.java
```
type: JsonSchema
```

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, Object> | DrawingMap | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**mainShape** | Object |  | [optional]
**shapeOrNull** | Object |  | [optional]
**nullableShape** | Object |  | [optional]
**shapes** | List<Object> |  | [optional]
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## DrawingMap
```
base class: FrozenMap<String, Object>
```

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**mainShape** |  |  | [optional]
**shapeOrNull** |  |  | [optional]
**nullableShape** |  |  | [optional]
**shapes** |  |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | DrawingMap | a constructor
getAdditionalProperty | String | Object | provides type safety for additional properties


[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

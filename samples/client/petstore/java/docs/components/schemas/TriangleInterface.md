# TriangleInterface1
org.openapijsonschematools.components.schemas.TriangleInterface.java
```
type: JsonSchema
```

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| String | String | |
| null | null | |
| int | int | |
| long | long | |
| float | float | |
| double | double | |
| boolean | boolean | |
| Map<String, Object> | TriangleInterfaceMap | |
| List<Object> | FrozenList<Object> | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**shapeType** | String |  | must be one of ["Triangle"]
**triangleType** | String |  |
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## TriangleInterfaceMap
```
base class: FrozenMap<String, Object>
```

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | TriangleInterfaceMap | a constructor
**shapeType** | | String | must be one of ["Triangle"]
**triangleType** | | String |
getAdditionalProperty | String | Object | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

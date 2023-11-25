# QuadrilateralInterface1
org.openapijsonschematools.components.schemas.QuadrilateralInterface.java
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
| Map<String, Object> | QuadrilateralInterfaceMap | |
| List<Object> | FrozenList<Object> | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**quadrilateralType** | String |  |
**shapeType** | String |  | must be one of ["Quadrilateral"]
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## QuadrilateralInterfaceMap
```
base class: FrozenMap<String, Object>
```

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | QuadrilateralInterfaceMap | a constructor
**quadrilateralType** | | String |
**shapeType** | | String | must be one of ["Quadrilateral"]
getAdditionalProperty | String | Object | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

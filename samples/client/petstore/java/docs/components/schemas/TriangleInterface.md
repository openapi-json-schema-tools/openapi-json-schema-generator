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
**shapeType** | String |  |
**triangleType** | String |  |
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## TriangleInterfaceMap
```
base class: FrozenMap<String, Object>
```

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**shapeType** |  |  |
**triangleType** |  |  |

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ |  |  | a constructor
get_additional_property_ | String | FrozenMap, FrozenList, float, int, String, boolean, null, bytes, schemas.FileIO, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

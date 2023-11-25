# ClassModel1
org.openapijsonschematools.components.schemas.ClassModel.java
```
type: JsonSchema
```

## Description
Model for testing model with \&quot;_class\&quot; property

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
| Map<String, Object> | ClassModelMap | |
| List<Object> | FrozenList<Object> | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**_class** | String |  | [optional]
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## ClassModelMap
```
base class: FrozenMap<String, Object>
```

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | ClassModelMap | a constructor
get | String | Object | This model has invalid python names so this method is used under the hood when you access instance["_class"], 
getAdditionalProperty | String | Object | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

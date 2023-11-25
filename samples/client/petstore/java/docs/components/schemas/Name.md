# Name1
org.openapijsonschematools.components.schemas.Name.java
```
type: JsonSchema
```

## Description
Model for testing model name same as property name

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
| Map<String, Object> | NameMap | |
| List<Object> | FrozenList<Object> | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**name** | int |  | value must be a 32 bit integer
**snake_case** | int |  | [optional] value must be a 32 bit integer
**property** | String | this is a reserved python keyword | [optional]
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## NameMap
```
base class: FrozenMap<String, Object>
```

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**name** |  |  |
**snake_case** |  |  | [optional]
**property** |  | this is a reserved python keyword | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | NameMap | a constructor
getAdditionalProperty | String | Object | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

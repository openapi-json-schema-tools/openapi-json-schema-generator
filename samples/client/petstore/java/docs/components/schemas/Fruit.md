# Fruit1
org.openapijsonschematools.components.schemas.Fruit.java
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
| Map<String, Object> | FruitMap | |
| List<Object> | FrozenList<Object> | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**color** | String |  | [optional]
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## FruitMap
```
base class: FrozenMap<String, Object>
```

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**color** |  |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | FruitMap | a constructor
getAdditionalProperty | String | Object | provides type safety for additional properties

## Composed Schemas (allOf/anyOf/oneOf/not)
## oneOf
Schema Class | Input Type | Return Type
------------ | ---------- | -----------
 |  | 
 |  | 

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

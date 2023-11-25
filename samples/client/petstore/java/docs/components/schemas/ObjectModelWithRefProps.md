# ObjectModelWithRefProps1
org.openapijsonschematools.components.schemas.ObjectModelWithRefProps.java
```
type: JsonSchema
```

## Description
a model that includes properties which should stay primitive (String + Boolean) and one which is defined as a class, NumberWithValidations

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, Object> | ObjectModelWithRefPropsMap | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**myNumber** | Number |  | [optional]
**myString** | String |  | [optional]
**myBoolean** | boolean |  | [optional]
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## ObjectModelWithRefPropsMap
```
base class: FrozenMap<String, Object>
```

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**myNumber** |  |  | [optional]
**myString** |  |  | [optional]
**myBoolean** |  |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | ObjectModelWithRefPropsMap | a constructor
getAdditionalProperty | String | Object | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

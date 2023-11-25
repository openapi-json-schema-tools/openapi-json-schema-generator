# File1
org.openapijsonschematools.components.schemas.File.java
```
type: JsonSchema
```

## Description
Must be named &#x60;File&#x60; for test.

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, Object> | FileMap | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**sourceURI** | String | Test capitalization | [optional]
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## FileMap
```
base class: FrozenMap<String, Object>
```

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**sourceURI** |  | Test capitalization | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | FileMap | a constructor
getAdditionalProperty | String | Object | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

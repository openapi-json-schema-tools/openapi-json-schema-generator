# Pet1
org.openapijsonschematools.components.schemas.Pet.java
```
type: JsonSchema
```

## Description
Pet object that needs to be added to the store

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, Object> | PetMap | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**name** | String |  |
**photoUrls** | List<String> |  |
**id** | long |  | [optional] value must be a 64 bit integer
**category** | Map<String, Object> |  | [optional]
**tags** | List<Map<String, Object>> |  | [optional]
**status** | String | pet status in the store | [optional] must be one of ["available", "pending", "sold"]
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## PetMap
```
base class: FrozenMap<String, Object>
```

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**name** |  |  |
**photoUrls** |  |  |
**id** |  |  | [optional]
**category** |  |  | [optional]
**tags** |  |  | [optional]
**status** |  | pet status in the store | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | PetMap | a constructor
getAdditionalProperty | String | Object | provides type safety for additional properties



[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

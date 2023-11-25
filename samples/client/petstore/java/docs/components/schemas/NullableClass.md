# NullableClass1
org.openapijsonschematools.components.schemas.NullableClass.java
```
type: JsonSchema
```

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, Object> | NullableClassMap | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**integer_prop** | Long |  | [optional]
**number_prop** | Number |  | [optional]
**boolean_prop** | Boolean |  | [optional]
**string_prop** | String |  | [optional]
**date_prop** | String |  | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD
**datetime_prop** | String |  | [optional] value must conform to RFC-3339 date-time
**array_nullable_prop** | List<Map<String, Object>> |  | [optional]
**array_and_items_nullable_prop** | List<Map<String, Object>> |  | [optional]
**array_items_nullable** | List<Map<String, Object>> |  | [optional]
**object_nullable_prop** | Map<String, Map<String, Object>> |  | [optional]
**object_and_items_nullable_prop** | Map<String, Map<String, Object>> |  | [optional]
**object_items_nullable** | Map<String, Map<String, Object>> |  | [optional]
**any_string_name** | Map<String, Object> | any string name can be used but the value must be the correct type | [optional]

## NullableClassMap
```
base class: FrozenMap<String, Object>
```

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**integer_prop** |  |  | [optional]
**number_prop** |  |  | [optional]
**boolean_prop** |  |  | [optional]
**string_prop** |  |  | [optional]
**date_prop** |  |  | [optional]
**datetime_prop** |  |  | [optional]
**array_nullable_prop** |  |  | [optional]
**array_and_items_nullable_prop** |  |  | [optional]
**array_items_nullable** |  |  | [optional]
**object_nullable_prop** |  |  | [optional]
**object_and_items_nullable_prop** |  |  | [optional]
**object_items_nullable** |  |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | NullableClassMap | a constructor
getAdditionalProperty | String | FrozenMap<String, Object> | provides type safety for additional properties








[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

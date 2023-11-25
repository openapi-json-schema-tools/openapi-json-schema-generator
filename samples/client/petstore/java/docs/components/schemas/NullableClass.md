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

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | NullableClassMap | a constructor
**integer_prop** | | Long | [optional]
**number_prop** | | Number | [optional]
**boolean_prop** | | Boolean | [optional]
**string_prop** | | String | [optional]
**date_prop** | | String | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD
**datetime_prop** | | String | [optional] value must conform to RFC-3339 date-time
**array_nullable_prop** | | ArrayNullablePropList | [optional]
**array_and_items_nullable_prop** | | ArrayAndItemsNullablePropList | [optional]
**array_items_nullable** | | ArrayItemsNullableList | [optional]
**object_nullable_prop** | | ObjectNullablePropMap | [optional]
**object_and_items_nullable_prop** | | ObjectAndItemsNullablePropMap | [optional]
**object_items_nullable** | | ObjectItemsNullableMap | [optional]
getAdditionalProperty | String | FrozenMap<String, Object> | provides type safety for additional properties








[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

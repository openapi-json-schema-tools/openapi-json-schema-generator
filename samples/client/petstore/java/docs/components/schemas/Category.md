# Category1
org.openapijsonschematools.components.schemas.Category.java
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static CategoryMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**name** | String |  | if omitted the server will use the default value of default-name
**id** | long |  | [optional] value must be a 64 bit integer
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## CategoryMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static CategoryMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | name()<br> if omitted the server will use the default value of default-name |
| long | id()<br>[optional] value must be a 64 bit integer |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

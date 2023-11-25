# Whale1
org.openapijsonschematools.components.schemas.Whale.java
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static WhaleMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**className** | String |  | must be one of ["whale"]
**hasBaleen** | boolean |  | [optional]
**hasTeeth** | boolean |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## WhaleMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static WhaleMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | className()<br> must be one of ["whale"] |
| boolean | hasBaleen()<br>[optional] |
| boolean | hasTeeth()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

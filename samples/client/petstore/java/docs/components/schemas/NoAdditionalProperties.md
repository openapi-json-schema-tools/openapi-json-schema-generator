# NoAdditionalProperties1
org.openapijsonschematools.components.schemas.NoAdditionalProperties.java
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static NoAdditionalPropertiesMap | validate(Map<String, Long> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**id** | long |  | value must be a 64 bit integer
**petId** | long |  | [optional] value must be a 64 bit integer

## NoAdditionalPropertiesMap
```
base class: FrozenMap<String, Long>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static NoAdditionalPropertiesMap | of(Map<String, Long> arg, SchemaConfiguration configuration) |
| long | id()<br> value must be a 64 bit integer |
| long | petId()<br>[optional] value must be a 64 bit integer |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

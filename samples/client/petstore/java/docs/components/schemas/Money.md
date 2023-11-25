# Money1
org.openapijsonschematools.components.schemas.Money.java
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static MoneyMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | String |  | value must be int or float numeric
**currency** | String |  |

## MoneyMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static MoneyMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | amount()<br> value must be int or float numeric |
| String | currency()<br> |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

# ObjectWithDecimalProperties1
org.openapijsonschematools.components.schemas.ObjectWithDecimalProperties.java
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ObjectWithDecimalPropertiesMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**length** | String |  | [optional]
**width** | String |  | [optional] value must be int or float numeric
**cost** | Map<String, Object> |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## ObjectWithDecimalPropertiesMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ObjectWithDecimalPropertiesMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | length()<br>[optional] |
| String | width()<br>[optional] value must be int or float numeric |
| Money.MoneyMap | cost()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

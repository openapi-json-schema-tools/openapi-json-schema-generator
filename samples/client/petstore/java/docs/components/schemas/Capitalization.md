# Capitalization1
org.openapijsonschematools.components.schemas.Capitalization.java
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static CapitalizationMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**smallCamel** | String |  | [optional]
**CapitalCamel** | String |  | [optional]
**small_Snake** | String |  | [optional]
**Capital_Snake** | String |  | [optional]
**SCA_ETH_Flow_Points** | String |  | [optional]
**ATT_NAME** | String | Name of the pet  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## CapitalizationMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static CapitalizationMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | smallCamel()<br>[optional] |
| String | CapitalCamel()<br>[optional] |
| String | small_Snake()<br>[optional] |
| String | Capital_Snake()<br>[optional] |
| String | SCA_ETH_Flow_Points()<br>[optional] |
| String | ATT_NAME()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

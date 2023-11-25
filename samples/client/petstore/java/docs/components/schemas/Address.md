# Address
org.openapijsonschematools.components.schemas.Address.java

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | Address.AdditionalProperties<br> schema class |
| static class | Address.AddressMap<br> output class for Map payloads |
| static class | Address.Address1<br> schema class |

## Address1
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static AddressMap | validate(Map<String, Long> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**anyStringName** | long | any string name can be used but the value must be the correct type | [optional]

## AddressMap
```
base class: FrozenMap<String, Long>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static AddressMap | of(Map<String, Long> arg, SchemaConfiguration configuration) |
| long | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

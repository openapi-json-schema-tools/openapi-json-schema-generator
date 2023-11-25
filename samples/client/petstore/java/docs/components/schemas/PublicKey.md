# PublicKey1
org.openapijsonschematools.components.schemas.PublicKey.java
```
type: JsonSchema
```

## Description
schema that contains a property named key

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static PublicKeyMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**key** | String |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## PublicKeyMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static PublicKeyMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | key()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

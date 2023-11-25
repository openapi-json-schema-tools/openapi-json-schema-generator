# ReqPropsFromTrueAddProps
org.openapijsonschematools.components.schemas.ReqPropsFromTrueAddProps.java

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | ReqPropsFromTrueAddProps.AdditionalProperties<br> schema class |
| static class | ReqPropsFromTrueAddProps.ReqPropsFromTrueAddPropsMap<br> output class for Map payloads |
| static class | ReqPropsFromTrueAddProps.ReqPropsFromTrueAddProps1<br> schema class |

## ReqPropsFromTrueAddProps1
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ReqPropsFromTrueAddPropsMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**invalid-name** | Object |  |
**validName** | Object |  |
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## ReqPropsFromTrueAddPropsMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ReqPropsFromTrueAddPropsMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Object | validName()<br> |
| Object | get(String key)<br>This model has invalid python names so this method is used under the hood when you access instance["invalid-name"],  |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

# ObjWithRequiredPropsBase
org.openapijsonschematools.components.schemas.ObjWithRequiredPropsBase.java

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | ObjWithRequiredPropsBase.B<br> schema class |
| static class | ObjWithRequiredPropsBase.ObjWithRequiredPropsBaseMap<br> output class for Map payloads |
| static class | ObjWithRequiredPropsBase.ObjWithRequiredPropsBase1<br> schema class |

## ObjWithRequiredPropsBase1
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ObjWithRequiredPropsBaseMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**b** | String |  |
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## ObjWithRequiredPropsBaseMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ObjWithRequiredPropsBaseMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | b()<br> |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

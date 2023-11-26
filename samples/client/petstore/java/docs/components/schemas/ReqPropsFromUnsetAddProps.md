# ReqPropsFromUnsetAddProps
org.openapijsonschematools.components.schemas.ReqPropsFromUnsetAddProps.java
public class ReqPropsFromUnsetAddProps

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | ReqPropsFromUnsetAddProps.ReqPropsFromUnsetAddProps1<br> schema class |
| static class | ReqPropsFromUnsetAddProps.ReqPropsFromUnsetAddPropsMap<br> output class for Map payloads |

## ReqPropsFromUnsetAddProps1
public class ReqPropsFromUnsetAddProps1
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ReqPropsFromUnsetAddPropsMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**invalid-name** | Object |  |
**validName** | Object |  |
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## ReqPropsFromUnsetAddPropsMap
public class ReqPropsFromUnsetAddPropsMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ReqPropsFromUnsetAddPropsMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Object | validName()<br> |
| Object | get(String key)<br>This model has invalid python names so this method is used under the hood when you access instance["invalid-name"],  |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

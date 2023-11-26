# ReqPropsFromExplicitAddProps
org.openapijsonschematools.components.schemas.ReqPropsFromExplicitAddProps.java
public class ReqPropsFromExplicitAddProps

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | ReqPropsFromExplicitAddProps.ReqPropsFromExplicitAddProps1<br> schema class |
| static class | ReqPropsFromExplicitAddProps.ReqPropsFromExplicitAddPropsMap<br> output class for Map payloads |
| static class | ReqPropsFromExplicitAddProps.AdditionalProperties<br> schema class |

## ReqPropsFromExplicitAddProps1
public class ReqPropsFromExplicitAddProps1
extends JsonSchema

A schema class that validates payloads


## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ReqPropsFromExplicitAddPropsMap | validate(Map<String, String> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**invalid-name** | String |  |
**validName** | String |  |
**anyStringName** | String | any string name can be used but the value must be the correct type | [optional]

## ReqPropsFromExplicitAddPropsMap
public class ReqPropsFromExplicitAddPropsMap
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ReqPropsFromExplicitAddPropsMap | of(Map<String, String> arg, SchemaConfiguration configuration) |
| String | validName()<br> |
| String | get(String key)<br>This model has invalid python names so this method is used under the hood when you access instance["invalid-name"],  |
| String | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

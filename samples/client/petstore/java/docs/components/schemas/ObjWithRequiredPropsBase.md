# ObjWithRequiredPropsBase
org.openapijsonschematools.components.schemas.ObjWithRequiredPropsBase.java
public class ObjWithRequiredPropsBase

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | ObjWithRequiredPropsBase.ObjWithRequiredPropsBase1<br> schema class |
| static class | ObjWithRequiredPropsBase.ObjWithRequiredPropsBaseMap<br> output class for Map payloads |
| static class | ObjWithRequiredPropsBase.B<br> schema class |

## ObjWithRequiredPropsBase1
public class ObjWithRequiredPropsBase1
extends JsonSchema

A schema class that validates payloads

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
public class ObjWithRequiredPropsBaseMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ObjWithRequiredPropsBaseMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | b()<br> |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## B
public class B
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

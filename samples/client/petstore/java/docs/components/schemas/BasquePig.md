# BasquePig
org.openapijsonschematools.components.schemas.BasquePig.java
public class BasquePig

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [BasquePig.BasquePig1](#basquepig1)<br> schema class |
| static class | [BasquePig.BasquePigMap](#basquepigmap)<br> output class for Map payloads |
| static class | [BasquePig.ClassName](#classname)<br> schema class |

## BasquePig1
public static class BasquePig1<br>
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [BasquePigMap](#basquepigmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## BasquePigMap
public static class BasquePigMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [BasquePigMap](#basquepigmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | className()<br> must be one of ["BasquePig"] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **className** | String |  | must be one of ["BasquePig"] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## ClassName
public static class ClassName<br>
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

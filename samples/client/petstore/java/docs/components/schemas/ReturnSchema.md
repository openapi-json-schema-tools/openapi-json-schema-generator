# ReturnSchema
org.openapijsonschematools.components.schemas.ReturnSchema.java
public class ReturnSchema

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ReturnSchema.ReturnSchema1](#returnschema1)<br> schema class |
| static class | [ReturnSchema.ReturnMap](#returnmap)<br> output class for Map payloads |
| static class | [ReturnSchema.ReturnSchema2](#returnschema2)<br> schema class |

## ReturnSchema1
public static class ReturnSchema1<br>
extends JsonSchema

A schema class that validates payloads

## Description
Model for testing reserved words

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static int | validate(int arg, SchemaConfiguration configuration) |
| static long | validate(long arg, SchemaConfiguration configuration) |
| static float | validate(float arg, SchemaConfiguration configuration) |
| static double | validate(double arg, SchemaConfiguration configuration) |
| static boolean | validate(boolean arg, SchemaConfiguration configuration) |
| static [ReturnMap](#returnmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |
| FrozenList<Object> | validate(List<Object> arg, SchemaConfiguration configuration) |

## ReturnMap
public static class ReturnMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ReturnMap](#returnmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Object | get(String key)<br>This model has invalid python names so this method is used under the hood when you access instance["return"],  |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **return** | int | this is a reserved python keyword | [optional] value must be a 32 bit integer |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## ReturnSchema2
public static class ReturnSchema2<br>
extends Int32JsonSchema

A schema class that validates payloads

## Description
this is a reserved python keyword

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static int | validate(int arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

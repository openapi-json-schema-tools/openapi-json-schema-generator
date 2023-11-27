# ObjectWithOnlyOptionalProps
org.openapijsonschematools.components.schemas.ObjectWithOnlyOptionalProps.java
public class ObjectWithOnlyOptionalProps

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | ObjectWithOnlyOptionalProps.ObjectWithOnlyOptionalProps1<br> schema class |
| static class | ObjectWithOnlyOptionalProps.ObjectWithOnlyOptionalPropsMap<br> output class for Map payloads |
| static class | ObjectWithOnlyOptionalProps.B<br> schema class |
| static class | ObjectWithOnlyOptionalProps.A<br> schema class |
| static class | ObjectWithOnlyOptionalProps.AdditionalProperties<br> schema class |

## ObjectWithOnlyOptionalProps1
public class ObjectWithOnlyOptionalProps1
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectWithOnlyOptionalPropsMap](#objectwithonlyoptionalpropsmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## ObjectWithOnlyOptionalPropsMap
public class ObjectWithOnlyOptionalPropsMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ObjectWithOnlyOptionalPropsMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | a()<br>[optional] |
| Number | b()<br>[optional] |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**a** | String |  | [optional]
**b** | Number |  | [optional]

## B
public class B
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Number | validate(Number arg, SchemaConfiguration configuration) |

## A
public class A
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## AdditionalProperties
public class AdditionalProperties
extends JsonSchema

A schema class that validates payloads

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
| static FrozenMap<String, Object> | Map<String, Object> arg, SchemaConfiguration configuration) |
| FrozenList<Object> | validate(List<Object> arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

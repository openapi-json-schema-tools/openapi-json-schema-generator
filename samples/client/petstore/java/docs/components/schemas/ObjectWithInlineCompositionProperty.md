# ObjectWithInlineCompositionProperty
org.openapijsonschematools.components.schemas.ObjectWithInlineCompositionProperty.java
public class ObjectWithInlineCompositionProperty

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ObjectWithInlineCompositionProperty.ObjectWithInlineCompositionProperty1](#objectwithinlinecompositionproperty1)<br> schema class |
| static class | [ObjectWithInlineCompositionProperty.ObjectWithInlineCompositionPropertyMap](#objectwithinlinecompositionpropertymap)<br> output class for Map payloads |
| static class | [ObjectWithInlineCompositionProperty.SomeProp](#someprop)<br> schema class |
| static class | [ObjectWithInlineCompositionProperty.Schema0](#schema0)<br> schema class |

## ObjectWithInlineCompositionProperty1
public static class ObjectWithInlineCompositionProperty1
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectWithInlineCompositionPropertyMap](#objectwithinlinecompositionpropertymap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## ObjectWithInlineCompositionPropertyMap
public static class ObjectWithInlineCompositionPropertyMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectWithInlineCompositionPropertyMap](#objectwithinlinecompositionpropertymap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Object | someProp()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **someProp** | Object |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## SomeProp
public static class SomeProp
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

## Schema0
public static class Schema0
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

# ObjectWithOnlyOptionalProps
org.openapijsonschematools.components.schemas.ObjectWithOnlyOptionalProps.java
public class ObjectWithOnlyOptionalProps

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ObjectWithOnlyOptionalProps.ObjectWithOnlyOptionalProps1](#objectwithonlyoptionalprops1)<br> schema class |
| static class | [ObjectWithOnlyOptionalProps.ObjectWithOnlyOptionalPropsMap](#objectwithonlyoptionalpropsmap)<br> output class for Map payloads |
| static class | [ObjectWithOnlyOptionalProps.B](#b)<br> schema class |
| static class | [ObjectWithOnlyOptionalProps.A](#a)<br> schema class |
| static class | [ObjectWithOnlyOptionalProps.AdditionalProperties](#additionalproperties)<br> schema class |

## ObjectWithOnlyOptionalProps1
public static class ObjectWithOnlyOptionalProps1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("a", A.class),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("b", B.class)<br>&nbsp;&nbsp;&nbsp;&nbsp;))),<br>new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectWithOnlyOptionalPropsMap](#objectwithonlyoptionalpropsmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## ObjectWithOnlyOptionalPropsMap
public static class ObjectWithOnlyOptionalPropsMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectWithOnlyOptionalPropsMap](#objectwithonlyoptionalpropsmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | a()<br>[optional] |
| Number | b()<br>[optional] |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **a** | String |  | [optional] |
| **b** | Number |  | [optional] |

## B
public static class B<br>
extends NumberJsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Number | validate(Number arg, SchemaConfiguration configuration) |

## A
public static class A<br>
extends StringJsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## AdditionalProperties
public static class AdditionalProperties<br>
extends NotAnyTypeJsonSchema
    // NotAnyTypeSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

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

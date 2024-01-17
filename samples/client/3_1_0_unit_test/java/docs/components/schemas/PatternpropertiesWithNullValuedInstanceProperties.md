# PatternpropertiesWithNullValuedInstanceProperties
org.openapijsonschematools.client.components.schemas.PatternpropertiesWithNullValuedInstanceProperties.java
public class PatternpropertiesWithNullValuedInstanceProperties

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [PatternpropertiesWithNullValuedInstanceProperties.PatternpropertiesWithNullValuedInstanceProperties1](#patternpropertieswithnullvaluedinstanceproperties1)<br> schema class |
| static class | [PatternpropertiesWithNullValuedInstanceProperties.Bar](#bar)<br> schema class |

## PatternpropertiesWithNullValuedInstanceProperties1
public static class PatternpropertiesWithNullValuedInstanceProperties1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<Pattern, Class<? extends JsonSchema>> | patternProperties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new AbstractMap.SimpleEntry<>(Pattern.compile("^.*bar$"), [Bar.class](#bar)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<String, @Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Bar
public static class Bar<br>
extends NullJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

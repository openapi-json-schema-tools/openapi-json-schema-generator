# ReturnSchema
org.openapijsonschematools.client.components.schemas.ReturnSchema.java
public class ReturnSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ReturnSchema.ReturnSchema1](#returnschema1)<br> schema class |
| static class | [ReturnSchema.ReturnMapBuilder1](#returnmapbuilder1)<br> builder for Map payloads |
| static class | [ReturnSchema.ReturnMap](#returnmap)<br> output class for Map payloads |
| static class | [ReturnSchema.ReturnSchema2](#returnschema2)<br> schema class |

## ReturnSchema1
public static class ReturnSchema1<br>
extends JsonSchema

A schema class that validates payloads

## Description
Model for testing reserved words

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("return", [ReturnSchema2.class](#returnschema2)))<br>)<br> |

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
| [ReturnMap](#returnmap) | validate([Map&lt;?, ?&gt;](#returnmapbuilder1) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ReturnMapBuilder1
public class ReturnMapBuilder1<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| ReturnMapBuilder1()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [ReturnMapBuilder1](#returnmapbuilder1) | setReturn(int value) |
| [ReturnMapBuilder1](#returnmapbuilder1) | setReturn(float value) |
| [ReturnMapBuilder1](#returnmapbuilder1) | additionalProperty(String key, Void value) |
| [ReturnMapBuilder1](#returnmapbuilder1) | additionalProperty(String key, boolean value) |
| [ReturnMapBuilder1](#returnmapbuilder1) | additionalProperty(String key, String value) |
| [ReturnMapBuilder1](#returnmapbuilder1) | additionalProperty(String key, int value) |
| [ReturnMapBuilder1](#returnmapbuilder1) | additionalProperty(String key, float value) |
| [ReturnMapBuilder1](#returnmapbuilder1) | additionalProperty(String key, long value) |
| [ReturnMapBuilder1](#returnmapbuilder1) | additionalProperty(String key, double value) |
| [ReturnMapBuilder1](#returnmapbuilder1) | additionalProperty(String key, List<?> value) |
| [ReturnMapBuilder1](#returnmapbuilder1) | additionalProperty(String key, Map<String, ?> value) |

## ReturnMap
public static class ReturnMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ReturnMap](#returnmap) | of([Map<String, ? extends @Nullable Object>](#returnmapbuilder1) arg, SchemaConfiguration configuration) |
| @Nullable Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["return"],  |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## ReturnSchema2
public static class ReturnSchema2<br>
extends Int32JsonSchema

A schema class that validates payloads

## Description
this is a reserved python keyword

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int32JsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

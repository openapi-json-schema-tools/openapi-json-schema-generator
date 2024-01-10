# DependentSchemasSingleDependency
org.openapijsonschematools.client.components.schemas.DependentSchemasSingleDependency.java
public class DependentSchemasSingleDependency

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [DependentSchemasSingleDependency.DependentSchemasSingleDependency1](#dependentschemassingledependency1)<br> schema class |
| static class | [DependentSchemasSingleDependency.Bar](#bar)<br> schema class |
| static class | [DependentSchemasSingleDependency.BarMapBuilder1](#barmapbuilder1)<br> builder for Map payloads |
| static class | [DependentSchemasSingleDependency.BarMap](#barmap)<br> output class for Map payloads |
| static class | [DependentSchemasSingleDependency.Bar1](#bar1)<br> schema class |
| static class | [DependentSchemasSingleDependency.Foo](#foo)<br> schema class |

## DependentSchemasSingleDependency1
public static class DependentSchemasSingleDependency1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

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
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo", [Foo.class](#foo))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("bar", [Bar1.class](#bar1)))<br>)<br> |

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
| [BarMap](#barmap) | validate([Map&lt;?, ?&gt;](#barmapbuilder1) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## BarMapBuilder1
public class BarMapBuilder1<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BarMapBuilder1()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [BarMapBuilder1](#barmapbuilder1) | foo(int value) |
| [BarMapBuilder1](#barmapbuilder1) | foo(float value) |
| [BarMapBuilder1](#barmapbuilder1) | foo(long value) |
| [BarMapBuilder1](#barmapbuilder1) | foo(double value) |
| [BarMapBuilder1](#barmapbuilder1) | bar(int value) |
| [BarMapBuilder1](#barmapbuilder1) | bar(float value) |
| [BarMapBuilder1](#barmapbuilder1) | bar(long value) |
| [BarMapBuilder1](#barmapbuilder1) | bar(double value) |
| [BarMapBuilder1](#barmapbuilder1) | additionalProperty(String key, Void value) |
| [BarMapBuilder1](#barmapbuilder1) | additionalProperty(String key, boolean value) |
| [BarMapBuilder1](#barmapbuilder1) | additionalProperty(String key, String value) |
| [BarMapBuilder1](#barmapbuilder1) | additionalProperty(String key, int value) |
| [BarMapBuilder1](#barmapbuilder1) | additionalProperty(String key, float value) |
| [BarMapBuilder1](#barmapbuilder1) | additionalProperty(String key, long value) |
| [BarMapBuilder1](#barmapbuilder1) | additionalProperty(String key, double value) |
| [BarMapBuilder1](#barmapbuilder1) | additionalProperty(String key, List<?> value) |
| [BarMapBuilder1](#barmapbuilder1) | additionalProperty(String key, Map<String, ?> value) |

## BarMap
public static class BarMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [BarMap](#barmap) | of([Map<String, ? extends @Nullable Object>](#barmapbuilder1) arg, SchemaConfiguration configuration) |
| Number | foo()<br>[optional] |
| Number | bar()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Bar1
public static class Bar1<br>
extends IntJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.IntJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Foo
public static class Foo<br>
extends IntJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.IntJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

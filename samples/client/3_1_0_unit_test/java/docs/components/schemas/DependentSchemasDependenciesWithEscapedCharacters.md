# DependentSchemasDependenciesWithEscapedCharacters
org.openapijsonschematools.client.components.schemas.DependentSchemasDependenciesWithEscapedCharacters.java
public class DependentSchemasDependenciesWithEscapedCharacters

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [DependentSchemasDependenciesWithEscapedCharacters.DependentSchemasDependenciesWithEscapedCharacters1](#dependentschemasdependencieswithescapedcharacters1)<br> schema class |
| static class | [DependentSchemasDependenciesWithEscapedCharacters.Foobar](#foobar)<br> schema class |
| static class | [DependentSchemasDependenciesWithEscapedCharacters.FoobarMapBuilder](#foobarmapbuilder)<br> builder for Map payloads |
| static class | [DependentSchemasDependenciesWithEscapedCharacters.FoobarMap](#foobarmap)<br> output class for Map payloads |
| static class | [DependentSchemasDependenciesWithEscapedCharacters.Footbar](#footbar)<br> schema class |

## DependentSchemasDependenciesWithEscapedCharacters1
public static class DependentSchemasDependenciesWithEscapedCharacters1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | dependentSchemas = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo\tbar", [Footbar.class](#footbar))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo'bar", [Foobar.class](#foobar)))<br>)<br> |

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
## Foobar
public static class Foobar<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo\"bar"<br>)<br> |

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
| [FoobarMap](#foobarmap) | validate([Map&lt;?, ?&gt;](#foobarmapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## FoobarMap0Builder
public class FoobarMap0Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoobarMap0Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [FoobarMap0Builder](#foobarmap0builder) | additionalProperty(String key, Void value) |
| [FoobarMap0Builder](#foobarmap0builder) | additionalProperty(String key, boolean value) |
| [FoobarMap0Builder](#foobarmap0builder) | additionalProperty(String key, String value) |
| [FoobarMap0Builder](#foobarmap0builder) | additionalProperty(String key, int value) |
| [FoobarMap0Builder](#foobarmap0builder) | additionalProperty(String key, float value) |
| [FoobarMap0Builder](#foobarmap0builder) | additionalProperty(String key, long value) |
| [FoobarMap0Builder](#foobarmap0builder) | additionalProperty(String key, double value) |
| [FoobarMap0Builder](#foobarmap0builder) | additionalProperty(String key, List<?> value) |
| [FoobarMap0Builder](#foobarmap0builder) | additionalProperty(String key, Map<String, ?> value) |

## FoobarMapBuilder
public class FoobarMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoobarMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FoobarMap0Builder](#foobarmap0builder) | setFooReverseSolidusQuotationMarkBar(Void value) |
| [FoobarMap0Builder](#foobarmap0builder) | setFooReverseSolidusQuotationMarkBar(boolean value) |
| [FoobarMap0Builder](#foobarmap0builder) | setFooReverseSolidusQuotationMarkBar(String value) |
| [FoobarMap0Builder](#foobarmap0builder) | setFooReverseSolidusQuotationMarkBar(int value) |
| [FoobarMap0Builder](#foobarmap0builder) | setFooReverseSolidusQuotationMarkBar(float value) |
| [FoobarMap0Builder](#foobarmap0builder) | setFooReverseSolidusQuotationMarkBar(long value) |
| [FoobarMap0Builder](#foobarmap0builder) | setFooReverseSolidusQuotationMarkBar(double value) |
| [FoobarMap0Builder](#foobarmap0builder) | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| [FoobarMap0Builder](#foobarmap0builder) | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |

## FoobarMap
public static class FoobarMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FoobarMap](#foobarmap) | of([Map<String, ? extends @Nullable Object>](#foobarmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["foo\&quot;bar"],  |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Footbar
public static class Footbar<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Integer | minProperties = 4 |

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
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

# AllofWithBaseSchema
org.openapijsonschematools.client.components.schemas.AllofWithBaseSchema.java
public class AllofWithBaseSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [AllofWithBaseSchema.AllofWithBaseSchema1](#allofwithbaseschema1)<br> schema class |
| static class | [AllofWithBaseSchema.AllofWithBaseSchemaMapBuilder](#allofwithbaseschemamapbuilder)<br> builder for Map payloads |
| static class | [AllofWithBaseSchema.AllofWithBaseSchemaMap](#allofwithbaseschemamap)<br> output class for Map payloads |
| static class | [AllofWithBaseSchema.Bar](#bar)<br> schema class |
| static class | [AllofWithBaseSchema.Schema1](#schema1)<br> schema class |
| static class | [AllofWithBaseSchema.Schema1MapBuilder](#schema1mapbuilder)<br> builder for Map payloads |
| static class | [AllofWithBaseSchema.Schema1Map](#schema1map)<br> output class for Map payloads |
| static class | [AllofWithBaseSchema.Baz](#baz)<br> schema class |
| static class | [AllofWithBaseSchema.Schema0](#schema0)<br> schema class |
| static class | [AllofWithBaseSchema.Schema0MapBuilder](#schema0mapbuilder)<br> builder for Map payloads |
| static class | [AllofWithBaseSchema.Schema0Map](#schema0map)<br> output class for Map payloads |
| static class | [AllofWithBaseSchema.Foo](#foo)<br> schema class |

## AllofWithBaseSchema1
public static class AllofWithBaseSchema1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("bar", [Bar.class](#bar)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"bar"<br>)<br> |
| List<Class<? extends JsonSchema>> | allOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema0.class](#schema0),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema1.class](#schema1)<br>;)<br> |

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
| [AllofWithBaseSchemaMap](#allofwithbaseschemamap) | validate([Map&lt;?, ?&gt;](#allofwithbaseschemamapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## AllofWithBaseSchemaMap0Builder
public class AllofWithBaseSchemaMap0Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithBaseSchemaMap0Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [AllofWithBaseSchemaMap0Builder](#allofwithbaseschemamap0builder) | additionalProperty(String key, Void value) |
| [AllofWithBaseSchemaMap0Builder](#allofwithbaseschemamap0builder) | additionalProperty(String key, boolean value) |
| [AllofWithBaseSchemaMap0Builder](#allofwithbaseschemamap0builder) | additionalProperty(String key, String value) |
| [AllofWithBaseSchemaMap0Builder](#allofwithbaseschemamap0builder) | additionalProperty(String key, int value) |
| [AllofWithBaseSchemaMap0Builder](#allofwithbaseschemamap0builder) | additionalProperty(String key, float value) |
| [AllofWithBaseSchemaMap0Builder](#allofwithbaseschemamap0builder) | additionalProperty(String key, long value) |
| [AllofWithBaseSchemaMap0Builder](#allofwithbaseschemamap0builder) | additionalProperty(String key, double value) |
| [AllofWithBaseSchemaMap0Builder](#allofwithbaseschemamap0builder) | additionalProperty(String key, List<?> value) |
| [AllofWithBaseSchemaMap0Builder](#allofwithbaseschemamap0builder) | additionalProperty(String key, Map<String, ?> value) |

## AllofWithBaseSchemaMapBuilder
public class AllofWithBaseSchemaMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithBaseSchemaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AllofWithBaseSchemaMap0Builder](#allofwithbaseschemamap0builder) | bar(int value) |
| [AllofWithBaseSchemaMap0Builder](#allofwithbaseschemamap0builder) | bar(float value) |
| [AllofWithBaseSchemaMap0Builder](#allofwithbaseschemamap0builder) | bar(long value) |
| [AllofWithBaseSchemaMap0Builder](#allofwithbaseschemamap0builder) | bar(double value) |

## AllofWithBaseSchemaMap
public static class AllofWithBaseSchemaMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AllofWithBaseSchemaMap](#allofwithbaseschemamap) | of([Map<String, ? extends @Nullable Object>](#allofwithbaseschemamapbuilder) arg, SchemaConfiguration configuration) |
| Number | bar()<br> |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Bar
public static class Bar<br>
extends IntJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.IntJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Schema1
public static class Schema1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("baz", [Baz.class](#baz)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"baz"<br>)<br> |

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
| [Schema1Map](#schema1map) | validate([Map&lt;?, ?&gt;](#schema1mapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema1Map0Builder
public class Schema1Map0Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1Map0Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [Schema1Map0Builder](#schema1map0builder) | additionalProperty(String key, Void value) |
| [Schema1Map0Builder](#schema1map0builder) | additionalProperty(String key, boolean value) |
| [Schema1Map0Builder](#schema1map0builder) | additionalProperty(String key, String value) |
| [Schema1Map0Builder](#schema1map0builder) | additionalProperty(String key, int value) |
| [Schema1Map0Builder](#schema1map0builder) | additionalProperty(String key, float value) |
| [Schema1Map0Builder](#schema1map0builder) | additionalProperty(String key, long value) |
| [Schema1Map0Builder](#schema1map0builder) | additionalProperty(String key, double value) |
| [Schema1Map0Builder](#schema1map0builder) | additionalProperty(String key, List<?> value) |
| [Schema1Map0Builder](#schema1map0builder) | additionalProperty(String key, Map<String, ?> value) |

## Schema1MapBuilder
public class Schema1MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1MapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Schema1Map0Builder](#schema1map0builder) | baz(Void value) |

## Schema1Map
public static class Schema1Map<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Schema1Map](#schema1map) | of([Map<String, ? extends @Nullable Object>](#schema1mapbuilder) arg, SchemaConfiguration configuration) |
| Void | baz()<br> |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Baz
public static class Baz<br>
extends NullJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Schema0
public static class Schema0<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo", [Foo.class](#foo)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo"<br>)<br> |

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
| [Schema0Map](#schema0map) | validate([Map&lt;?, ?&gt;](#schema0mapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema0Map0Builder
public class Schema0Map0Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0Map0Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [Schema0Map0Builder](#schema0map0builder) | additionalProperty(String key, Void value) |
| [Schema0Map0Builder](#schema0map0builder) | additionalProperty(String key, boolean value) |
| [Schema0Map0Builder](#schema0map0builder) | additionalProperty(String key, String value) |
| [Schema0Map0Builder](#schema0map0builder) | additionalProperty(String key, int value) |
| [Schema0Map0Builder](#schema0map0builder) | additionalProperty(String key, float value) |
| [Schema0Map0Builder](#schema0map0builder) | additionalProperty(String key, long value) |
| [Schema0Map0Builder](#schema0map0builder) | additionalProperty(String key, double value) |
| [Schema0Map0Builder](#schema0map0builder) | additionalProperty(String key, List<?> value) |
| [Schema0Map0Builder](#schema0map0builder) | additionalProperty(String key, Map<String, ?> value) |

## Schema0MapBuilder
public class Schema0MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0MapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Schema0Map0Builder](#schema0map0builder) | foo(String value) |

## Schema0Map
public static class Schema0Map<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Schema0Map](#schema0map) | of([Map<String, ? extends @Nullable Object>](#schema0mapbuilder) arg, SchemaConfiguration configuration) |
| String | foo()<br> |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Foo
public static class Foo<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

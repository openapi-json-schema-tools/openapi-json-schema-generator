# AllofWithBaseSchema
unit_test_api.components.schemas.AllofWithBaseSchema.java
public class AllofWithBaseSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [AllofWithBaseSchema.AllofWithBaseSchema1Boxed](#allofwithbaseschema1boxed)<br> sealed interface for validated payloads |
| record | [AllofWithBaseSchema.AllofWithBaseSchema1BoxedVoid](#allofwithbaseschema1boxedvoid)<br> boxed class to store validated null payloads |
| record | [AllofWithBaseSchema.AllofWithBaseSchema1BoxedBoolean](#allofwithbaseschema1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AllofWithBaseSchema.AllofWithBaseSchema1BoxedNumber](#allofwithbaseschema1boxednumber)<br> boxed class to store validated Number payloads |
| record | [AllofWithBaseSchema.AllofWithBaseSchema1BoxedString](#allofwithbaseschema1boxedstring)<br> boxed class to store validated String payloads |
| record | [AllofWithBaseSchema.AllofWithBaseSchema1BoxedList](#allofwithbaseschema1boxedlist)<br> boxed class to store validated List payloads |
| record | [AllofWithBaseSchema.AllofWithBaseSchema1BoxedMap](#allofwithbaseschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AllofWithBaseSchema.AllofWithBaseSchema1](#allofwithbaseschema1)<br> schema class |
| static class | [AllofWithBaseSchema.AllofWithBaseSchemaMapBuilder](#allofwithbaseschemamapbuilder)<br> builder for Map payloads |
| static class | [AllofWithBaseSchema.AllofWithBaseSchemaMap](#allofwithbaseschemamap)<br> output class for Map payloads |
| sealed interface | [AllofWithBaseSchema.BarBoxed](#barboxed)<br> sealed interface for validated payloads |
| record | [AllofWithBaseSchema.BarBoxedNumber](#barboxednumber)<br> boxed class to store validated Number payloads |
| static class | [AllofWithBaseSchema.Bar](#bar)<br> schema class |
| sealed interface | [AllofWithBaseSchema.Schema1Boxed](#schema1boxed)<br> sealed interface for validated payloads |
| record | [AllofWithBaseSchema.Schema1BoxedVoid](#schema1boxedvoid)<br> boxed class to store validated null payloads |
| record | [AllofWithBaseSchema.Schema1BoxedBoolean](#schema1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AllofWithBaseSchema.Schema1BoxedNumber](#schema1boxednumber)<br> boxed class to store validated Number payloads |
| record | [AllofWithBaseSchema.Schema1BoxedString](#schema1boxedstring)<br> boxed class to store validated String payloads |
| record | [AllofWithBaseSchema.Schema1BoxedList](#schema1boxedlist)<br> boxed class to store validated List payloads |
| record | [AllofWithBaseSchema.Schema1BoxedMap](#schema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AllofWithBaseSchema.Schema1](#schema1)<br> schema class |
| static class | [AllofWithBaseSchema.Schema1MapBuilder](#schema1mapbuilder)<br> builder for Map payloads |
| static class | [AllofWithBaseSchema.Schema1Map](#schema1map)<br> output class for Map payloads |
| sealed interface | [AllofWithBaseSchema.BazBoxed](#bazboxed)<br> sealed interface for validated payloads |
| record | [AllofWithBaseSchema.BazBoxedVoid](#bazboxedvoid)<br> boxed class to store validated null payloads |
| static class | [AllofWithBaseSchema.Baz](#baz)<br> schema class |
| sealed interface | [AllofWithBaseSchema.Schema0Boxed](#schema0boxed)<br> sealed interface for validated payloads |
| record | [AllofWithBaseSchema.Schema0BoxedVoid](#schema0boxedvoid)<br> boxed class to store validated null payloads |
| record | [AllofWithBaseSchema.Schema0BoxedBoolean](#schema0boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AllofWithBaseSchema.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| record | [AllofWithBaseSchema.Schema0BoxedString](#schema0boxedstring)<br> boxed class to store validated String payloads |
| record | [AllofWithBaseSchema.Schema0BoxedList](#schema0boxedlist)<br> boxed class to store validated List payloads |
| record | [AllofWithBaseSchema.Schema0BoxedMap](#schema0boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AllofWithBaseSchema.Schema0](#schema0)<br> schema class |
| static class | [AllofWithBaseSchema.Schema0MapBuilder](#schema0mapbuilder)<br> builder for Map payloads |
| static class | [AllofWithBaseSchema.Schema0Map](#schema0map)<br> output class for Map payloads |
| sealed interface | [AllofWithBaseSchema.FooBoxed](#fooboxed)<br> sealed interface for validated payloads |
| record | [AllofWithBaseSchema.FooBoxedString](#fooboxedstring)<br> boxed class to store validated String payloads |
| static class | [AllofWithBaseSchema.Foo](#foo)<br> schema class |

## AllofWithBaseSchema1Boxed
public sealed interface AllofWithBaseSchema1Boxed<br>
permits<br>
[AllofWithBaseSchema1BoxedVoid](#allofwithbaseschema1boxedvoid),
[AllofWithBaseSchema1BoxedBoolean](#allofwithbaseschema1boxedboolean),
[AllofWithBaseSchema1BoxedNumber](#allofwithbaseschema1boxednumber),
[AllofWithBaseSchema1BoxedString](#allofwithbaseschema1boxedstring),
[AllofWithBaseSchema1BoxedList](#allofwithbaseschema1boxedlist),
[AllofWithBaseSchema1BoxedMap](#allofwithbaseschema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## AllofWithBaseSchema1BoxedVoid
public record AllofWithBaseSchema1BoxedVoid<br>
implements [AllofWithBaseSchema1Boxed](#allofwithbaseschema1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithBaseSchema1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AllofWithBaseSchema1BoxedBoolean
public record AllofWithBaseSchema1BoxedBoolean<br>
implements [AllofWithBaseSchema1Boxed](#allofwithbaseschema1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithBaseSchema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AllofWithBaseSchema1BoxedNumber
public record AllofWithBaseSchema1BoxedNumber<br>
implements [AllofWithBaseSchema1Boxed](#allofwithbaseschema1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithBaseSchema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AllofWithBaseSchema1BoxedString
public record AllofWithBaseSchema1BoxedString<br>
implements [AllofWithBaseSchema1Boxed](#allofwithbaseschema1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithBaseSchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AllofWithBaseSchema1BoxedList
public record AllofWithBaseSchema1BoxedList<br>
implements [AllofWithBaseSchema1Boxed](#allofwithbaseschema1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithBaseSchema1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AllofWithBaseSchema1BoxedMap
public record AllofWithBaseSchema1BoxedMap<br>
implements [AllofWithBaseSchema1Boxed](#allofwithbaseschema1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithBaseSchema1BoxedMap([AllofWithBaseSchemaMap](#allofwithbaseschemamap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AllofWithBaseSchemaMap](#allofwithbaseschemamap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| [AllofWithBaseSchemaMap](#allofwithbaseschemamap) | validate([Map&lt;?, ?&gt;](#allofwithbaseschemamapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [AllofWithBaseSchema1BoxedString](#allofwithbaseschema1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [AllofWithBaseSchema1BoxedVoid](#allofwithbaseschema1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [AllofWithBaseSchema1BoxedNumber](#allofwithbaseschema1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [AllofWithBaseSchema1BoxedBoolean](#allofwithbaseschema1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [AllofWithBaseSchema1BoxedMap](#allofwithbaseschema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#allofwithbaseschemamapbuilder) arg, SchemaConfiguration configuration) |
| [AllofWithBaseSchema1BoxedList](#allofwithbaseschema1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [AllofWithBaseSchema1Boxed](#allofwithbaseschema1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## AllofWithBaseSchemaMap0Builder
public class AllofWithBaseSchemaMap0Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
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

### Constructor Summary
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

## BarBoxed
public sealed interface BarBoxed<br>
permits<br>
[BarBoxedNumber](#barboxednumber)

sealed interface that stores validated payloads using boxed classes

## BarBoxedNumber
public record BarBoxedNumber<br>
implements [BarBoxed](#barboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BarBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Bar
public static class Bar<br>
extends IntJsonSchema.IntJsonSchema1

A schema class that validates payloads

| Methods Inherited from class unit_test_api.schemas.IntJsonSchema.IntJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema1Boxed
public sealed interface Schema1Boxed<br>
permits<br>
[Schema1BoxedVoid](#schema1boxedvoid),
[Schema1BoxedBoolean](#schema1boxedboolean),
[Schema1BoxedNumber](#schema1boxednumber),
[Schema1BoxedString](#schema1boxedstring),
[Schema1BoxedList](#schema1boxedlist),
[Schema1BoxedMap](#schema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Schema1BoxedVoid
public record Schema1BoxedVoid<br>
implements [Schema1Boxed](#schema1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema1BoxedBoolean
public record Schema1BoxedBoolean<br>
implements [Schema1Boxed](#schema1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema1BoxedNumber
public record Schema1BoxedNumber<br>
implements [Schema1Boxed](#schema1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema1BoxedString
public record Schema1BoxedString<br>
implements [Schema1Boxed](#schema1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema1BoxedList
public record Schema1BoxedList<br>
implements [Schema1Boxed](#schema1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema1BoxedMap
public record Schema1BoxedMap<br>
implements [Schema1Boxed](#schema1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedMap([Schema1Map](#schema1map) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Schema1Map](#schema1map) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| [Schema1Map](#schema1map) | validate([Map&lt;?, ?&gt;](#schema1mapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [Schema1BoxedString](#schema1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Schema1BoxedVoid](#schema1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [Schema1BoxedNumber](#schema1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [Schema1BoxedBoolean](#schema1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [Schema1BoxedMap](#schema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#schema1mapbuilder) arg, SchemaConfiguration configuration) |
| [Schema1BoxedList](#schema1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [Schema1Boxed](#schema1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Schema1Map0Builder
public class Schema1Map0Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
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

### Constructor Summary
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

## BazBoxed
public sealed interface BazBoxed<br>
permits<br>
[BazBoxedVoid](#bazboxedvoid)

sealed interface that stores validated payloads using boxed classes

## BazBoxedVoid
public record BazBoxedVoid<br>
implements [BazBoxed](#bazboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BazBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Baz
public static class Baz<br>
extends NullJsonSchema.NullJsonSchema1

A schema class that validates payloads

| Methods Inherited from class unit_test_api.schemas.NullJsonSchema.NullJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema0Boxed
public sealed interface Schema0Boxed<br>
permits<br>
[Schema0BoxedVoid](#schema0boxedvoid),
[Schema0BoxedBoolean](#schema0boxedboolean),
[Schema0BoxedNumber](#schema0boxednumber),
[Schema0BoxedString](#schema0boxedstring),
[Schema0BoxedList](#schema0boxedlist),
[Schema0BoxedMap](#schema0boxedmap)

sealed interface that stores validated payloads using boxed classes

## Schema0BoxedVoid
public record Schema0BoxedVoid<br>
implements [Schema0Boxed](#schema0boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema0BoxedBoolean
public record Schema0BoxedBoolean<br>
implements [Schema0Boxed](#schema0boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema0BoxedNumber
public record Schema0BoxedNumber<br>
implements [Schema0Boxed](#schema0boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema0BoxedString
public record Schema0BoxedString<br>
implements [Schema0Boxed](#schema0boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema0BoxedList
public record Schema0BoxedList<br>
implements [Schema0Boxed](#schema0boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema0BoxedMap
public record Schema0BoxedMap<br>
implements [Schema0Boxed](#schema0boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedMap([Schema0Map](#schema0map) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Schema0Map](#schema0map) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| [Schema0Map](#schema0map) | validate([Map&lt;?, ?&gt;](#schema0mapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [Schema0BoxedString](#schema0boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Schema0BoxedVoid](#schema0boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [Schema0BoxedNumber](#schema0boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [Schema0BoxedBoolean](#schema0boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [Schema0BoxedMap](#schema0boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#schema0mapbuilder) arg, SchemaConfiguration configuration) |
| [Schema0BoxedList](#schema0boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [Schema0Boxed](#schema0boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Schema0Map0Builder
public class Schema0Map0Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
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

### Constructor Summary
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

## FooBoxed
public sealed interface FooBoxed<br>
permits<br>
[FooBoxedString](#fooboxedstring)

sealed interface that stores validated payloads using boxed classes

## FooBoxedString
public record FooBoxedString<br>
implements [FooBoxed](#fooboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Foo
public static class Foo<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class unit_test_api.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

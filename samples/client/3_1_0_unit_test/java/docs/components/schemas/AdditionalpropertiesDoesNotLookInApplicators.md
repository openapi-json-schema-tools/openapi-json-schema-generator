# AdditionalpropertiesDoesNotLookInApplicators
unit_test_api.components.schemas.AdditionalpropertiesDoesNotLookInApplicators.java
public class AdditionalpropertiesDoesNotLookInApplicators<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [AdditionalpropertiesDoesNotLookInApplicators.AdditionalpropertiesDoesNotLookInApplicators1Boxed](#additionalpropertiesdoesnotlookinapplicators1boxed)<br> sealed interface for validated payloads |
| record | [AdditionalpropertiesDoesNotLookInApplicators.AdditionalpropertiesDoesNotLookInApplicators1BoxedVoid](#additionalpropertiesdoesnotlookinapplicators1boxedvoid)<br> boxed class to store validated null payloads |
| record | [AdditionalpropertiesDoesNotLookInApplicators.AdditionalpropertiesDoesNotLookInApplicators1BoxedBoolean](#additionalpropertiesdoesnotlookinapplicators1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AdditionalpropertiesDoesNotLookInApplicators.AdditionalpropertiesDoesNotLookInApplicators1BoxedNumber](#additionalpropertiesdoesnotlookinapplicators1boxednumber)<br> boxed class to store validated Number payloads |
| record | [AdditionalpropertiesDoesNotLookInApplicators.AdditionalpropertiesDoesNotLookInApplicators1BoxedString](#additionalpropertiesdoesnotlookinapplicators1boxedstring)<br> boxed class to store validated String payloads |
| record | [AdditionalpropertiesDoesNotLookInApplicators.AdditionalpropertiesDoesNotLookInApplicators1BoxedList](#additionalpropertiesdoesnotlookinapplicators1boxedlist)<br> boxed class to store validated List payloads |
| record | [AdditionalpropertiesDoesNotLookInApplicators.AdditionalpropertiesDoesNotLookInApplicators1BoxedMap](#additionalpropertiesdoesnotlookinapplicators1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalpropertiesDoesNotLookInApplicators.AdditionalpropertiesDoesNotLookInApplicators1](#additionalpropertiesdoesnotlookinapplicators1)<br> schema class |
| static class | [AdditionalpropertiesDoesNotLookInApplicators.AdditionalpropertiesDoesNotLookInApplicatorsMapBuilder](#additionalpropertiesdoesnotlookinapplicatorsmapbuilder)<br> builder for Map payloads |
| static class | [AdditionalpropertiesDoesNotLookInApplicators.AdditionalpropertiesDoesNotLookInApplicatorsMap](#additionalpropertiesdoesnotlookinapplicatorsmap)<br> output class for Map payloads |
| sealed interface | [AdditionalpropertiesDoesNotLookInApplicators.Schema0Boxed](#schema0boxed)<br> sealed interface for validated payloads |
| record | [AdditionalpropertiesDoesNotLookInApplicators.Schema0BoxedVoid](#schema0boxedvoid)<br> boxed class to store validated null payloads |
| record | [AdditionalpropertiesDoesNotLookInApplicators.Schema0BoxedBoolean](#schema0boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AdditionalpropertiesDoesNotLookInApplicators.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| record | [AdditionalpropertiesDoesNotLookInApplicators.Schema0BoxedString](#schema0boxedstring)<br> boxed class to store validated String payloads |
| record | [AdditionalpropertiesDoesNotLookInApplicators.Schema0BoxedList](#schema0boxedlist)<br> boxed class to store validated List payloads |
| record | [AdditionalpropertiesDoesNotLookInApplicators.Schema0BoxedMap](#schema0boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalpropertiesDoesNotLookInApplicators.Schema0](#schema0)<br> schema class |
| static class | [AdditionalpropertiesDoesNotLookInApplicators.Schema0MapBuilder](#schema0mapbuilder)<br> builder for Map payloads |
| static class | [AdditionalpropertiesDoesNotLookInApplicators.Schema0Map](#schema0map)<br> output class for Map payloads |
| sealed interface | [AdditionalpropertiesDoesNotLookInApplicators.FooBoxed](#fooboxed)<br> sealed interface for validated payloads |
| record | [AdditionalpropertiesDoesNotLookInApplicators.FooBoxedVoid](#fooboxedvoid)<br> boxed class to store validated null payloads |
| record | [AdditionalpropertiesDoesNotLookInApplicators.FooBoxedBoolean](#fooboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AdditionalpropertiesDoesNotLookInApplicators.FooBoxedNumber](#fooboxednumber)<br> boxed class to store validated Number payloads |
| record | [AdditionalpropertiesDoesNotLookInApplicators.FooBoxedString](#fooboxedstring)<br> boxed class to store validated String payloads |
| record | [AdditionalpropertiesDoesNotLookInApplicators.FooBoxedList](#fooboxedlist)<br> boxed class to store validated List payloads |
| record | [AdditionalpropertiesDoesNotLookInApplicators.FooBoxedMap](#fooboxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalpropertiesDoesNotLookInApplicators.Foo](#foo)<br> schema class |
| sealed interface | [AdditionalpropertiesDoesNotLookInApplicators.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [AdditionalpropertiesDoesNotLookInApplicators.AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [AdditionalpropertiesDoesNotLookInApplicators.AdditionalProperties](#additionalproperties)<br> schema class |

## AdditionalpropertiesDoesNotLookInApplicators1Boxed
public sealed interface AdditionalpropertiesDoesNotLookInApplicators1Boxed<br>
permits<br>
[AdditionalpropertiesDoesNotLookInApplicators1BoxedVoid](#additionalpropertiesdoesnotlookinapplicators1boxedvoid),
[AdditionalpropertiesDoesNotLookInApplicators1BoxedBoolean](#additionalpropertiesdoesnotlookinapplicators1boxedboolean),
[AdditionalpropertiesDoesNotLookInApplicators1BoxedNumber](#additionalpropertiesdoesnotlookinapplicators1boxednumber),
[AdditionalpropertiesDoesNotLookInApplicators1BoxedString](#additionalpropertiesdoesnotlookinapplicators1boxedstring),
[AdditionalpropertiesDoesNotLookInApplicators1BoxedList](#additionalpropertiesdoesnotlookinapplicators1boxedlist),
[AdditionalpropertiesDoesNotLookInApplicators1BoxedMap](#additionalpropertiesdoesnotlookinapplicators1boxedmap)

sealed interface that stores validated payloads using boxed classes

## AdditionalpropertiesDoesNotLookInApplicators1BoxedVoid
public record AdditionalpropertiesDoesNotLookInApplicators1BoxedVoid<br>
implements [AdditionalpropertiesDoesNotLookInApplicators1Boxed](#additionalpropertiesdoesnotlookinapplicators1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesDoesNotLookInApplicators1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalpropertiesDoesNotLookInApplicators1BoxedBoolean
public record AdditionalpropertiesDoesNotLookInApplicators1BoxedBoolean<br>
implements [AdditionalpropertiesDoesNotLookInApplicators1Boxed](#additionalpropertiesdoesnotlookinapplicators1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesDoesNotLookInApplicators1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalpropertiesDoesNotLookInApplicators1BoxedNumber
public record AdditionalpropertiesDoesNotLookInApplicators1BoxedNumber<br>
implements [AdditionalpropertiesDoesNotLookInApplicators1Boxed](#additionalpropertiesdoesnotlookinapplicators1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesDoesNotLookInApplicators1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalpropertiesDoesNotLookInApplicators1BoxedString
public record AdditionalpropertiesDoesNotLookInApplicators1BoxedString<br>
implements [AdditionalpropertiesDoesNotLookInApplicators1Boxed](#additionalpropertiesdoesnotlookinapplicators1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesDoesNotLookInApplicators1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalpropertiesDoesNotLookInApplicators1BoxedList
public record AdditionalpropertiesDoesNotLookInApplicators1BoxedList<br>
implements [AdditionalpropertiesDoesNotLookInApplicators1Boxed](#additionalpropertiesdoesnotlookinapplicators1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesDoesNotLookInApplicators1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalpropertiesDoesNotLookInApplicators1BoxedMap
public record AdditionalpropertiesDoesNotLookInApplicators1BoxedMap<br>
implements [AdditionalpropertiesDoesNotLookInApplicators1Boxed](#additionalpropertiesdoesnotlookinapplicators1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesDoesNotLookInApplicators1BoxedMap([AdditionalpropertiesDoesNotLookInApplicatorsMap](#additionalpropertiesdoesnotlookinapplicatorsmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AdditionalpropertiesDoesNotLookInApplicatorsMap](#additionalpropertiesdoesnotlookinapplicatorsmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalpropertiesDoesNotLookInApplicators1
public static class AdditionalpropertiesDoesNotLookInApplicators1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |
| List<Class<? extends JsonSchema>> | allOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema0.class](#schema0)<br>;)<br> |

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
| [AdditionalpropertiesDoesNotLookInApplicatorsMap](#additionalpropertiesdoesnotlookinapplicatorsmap) | validate([Map&lt;?, ?&gt;](#additionalpropertiesdoesnotlookinapplicatorsmapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [AdditionalpropertiesDoesNotLookInApplicators1BoxedString](#additionalpropertiesdoesnotlookinapplicators1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [AdditionalpropertiesDoesNotLookInApplicators1BoxedVoid](#additionalpropertiesdoesnotlookinapplicators1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [AdditionalpropertiesDoesNotLookInApplicators1BoxedNumber](#additionalpropertiesdoesnotlookinapplicators1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [AdditionalpropertiesDoesNotLookInApplicators1BoxedBoolean](#additionalpropertiesdoesnotlookinapplicators1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [AdditionalpropertiesDoesNotLookInApplicators1BoxedMap](#additionalpropertiesdoesnotlookinapplicators1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#additionalpropertiesdoesnotlookinapplicatorsmapbuilder) arg, SchemaConfiguration configuration) |
| [AdditionalpropertiesDoesNotLookInApplicators1BoxedList](#additionalpropertiesdoesnotlookinapplicators1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [AdditionalpropertiesDoesNotLookInApplicators1Boxed](#additionalpropertiesdoesnotlookinapplicators1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## AdditionalpropertiesDoesNotLookInApplicatorsMapBuilder
public class AdditionalpropertiesDoesNotLookInApplicatorsMapBuilder<br>
builder for `Map<String, Boolean>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesDoesNotLookInApplicatorsMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Boolean> | build()<br>Returns map input that should be used with Schema.validate |
| [AdditionalpropertiesDoesNotLookInApplicatorsMapBuilder](#additionalpropertiesdoesnotlookinapplicatorsmapbuilder) | additionalProperty(String key, boolean value) |

## AdditionalpropertiesDoesNotLookInApplicatorsMap
public static class AdditionalpropertiesDoesNotLookInApplicatorsMap<br>
extends FrozenMap<String, Boolean>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AdditionalpropertiesDoesNotLookInApplicatorsMap](#additionalpropertiesdoesnotlookinapplicatorsmap) | of([Map<String, Boolean>](#additionalpropertiesdoesnotlookinapplicatorsmapbuilder) arg, SchemaConfiguration configuration) |
| boolean | getAdditionalProperty(String name)<br>provides type safety for additional properties |

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
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [Schema0MapBuilder](#schema0mapbuilder) | foo(Void value) |
| [Schema0MapBuilder](#schema0mapbuilder) | foo(boolean value) |
| [Schema0MapBuilder](#schema0mapbuilder) | foo(String value) |
| [Schema0MapBuilder](#schema0mapbuilder) | foo(int value) |
| [Schema0MapBuilder](#schema0mapbuilder) | foo(float value) |
| [Schema0MapBuilder](#schema0mapbuilder) | foo(long value) |
| [Schema0MapBuilder](#schema0mapbuilder) | foo(double value) |
| [Schema0MapBuilder](#schema0mapbuilder) | foo(List<?> value) |
| [Schema0MapBuilder](#schema0mapbuilder) | foo(Map<String, ?> value) |
| [Schema0MapBuilder](#schema0mapbuilder) | additionalProperty(String key, Void value) |
| [Schema0MapBuilder](#schema0mapbuilder) | additionalProperty(String key, boolean value) |
| [Schema0MapBuilder](#schema0mapbuilder) | additionalProperty(String key, String value) |
| [Schema0MapBuilder](#schema0mapbuilder) | additionalProperty(String key, int value) |
| [Schema0MapBuilder](#schema0mapbuilder) | additionalProperty(String key, float value) |
| [Schema0MapBuilder](#schema0mapbuilder) | additionalProperty(String key, long value) |
| [Schema0MapBuilder](#schema0mapbuilder) | additionalProperty(String key, double value) |
| [Schema0MapBuilder](#schema0mapbuilder) | additionalProperty(String key, List<?> value) |
| [Schema0MapBuilder](#schema0mapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## Schema0Map
public static class Schema0Map<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Schema0Map](#schema0map) | of([Map<String, ? extends @Nullable Object>](#schema0mapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | foo()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## FooBoxed
public sealed interface FooBoxed<br>
permits<br>
[FooBoxedVoid](#fooboxedvoid),
[FooBoxedBoolean](#fooboxedboolean),
[FooBoxedNumber](#fooboxednumber),
[FooBoxedString](#fooboxedstring),
[FooBoxedList](#fooboxedlist),
[FooBoxedMap](#fooboxedmap)

sealed interface that stores validated payloads using boxed classes

## FooBoxedVoid
public record FooBoxedVoid<br>
implements [FooBoxed](#fooboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FooBoxedBoolean
public record FooBoxedBoolean<br>
implements [FooBoxed](#fooboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FooBoxedNumber
public record FooBoxedNumber<br>
implements [FooBoxed](#fooboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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

## FooBoxedList
public record FooBoxedList<br>
implements [FooBoxed](#fooboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FooBoxedMap
public record FooBoxedMap<br>
implements [FooBoxed](#fooboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Foo
public static class Foo<br>
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class unit_test_api.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## AdditionalPropertiesBoxed
public sealed interface AdditionalPropertiesBoxed<br>
permits<br>
[AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)

sealed interface that stores validated payloads using boxed classes

## AdditionalPropertiesBoxedBoolean
public record AdditionalPropertiesBoxedBoolean<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalProperties
public static class AdditionalProperties<br>
extends BooleanJsonSchema.BooleanJsonSchema1

A schema class that validates payloads

| Methods Inherited from class unit_test_api.schemas.BooleanJsonSchema.BooleanJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

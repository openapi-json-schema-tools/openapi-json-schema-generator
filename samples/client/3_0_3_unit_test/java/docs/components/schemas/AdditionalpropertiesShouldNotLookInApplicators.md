# AdditionalpropertiesShouldNotLookInApplicators
org.openapijsonschematools.client.components.schemas.AdditionalpropertiesShouldNotLookInApplicators.java
public class AdditionalpropertiesShouldNotLookInApplicators

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.AdditionalpropertiesShouldNotLookInApplicators1Boxed](#additionalpropertiesshouldnotlookinapplicators1boxed)<br> abstract sealed validated payload class |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.AdditionalpropertiesShouldNotLookInApplicators1BoxedVoid](#additionalpropertiesshouldnotlookinapplicators1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.AdditionalpropertiesShouldNotLookInApplicators1BoxedBoolean](#additionalpropertiesshouldnotlookinapplicators1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.AdditionalpropertiesShouldNotLookInApplicators1BoxedNumber](#additionalpropertiesshouldnotlookinapplicators1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.AdditionalpropertiesShouldNotLookInApplicators1BoxedString](#additionalpropertiesshouldnotlookinapplicators1boxedstring)<br> boxed class to store validated String payloads |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.AdditionalpropertiesShouldNotLookInApplicators1BoxedList](#additionalpropertiesshouldnotlookinapplicators1boxedlist)<br> boxed class to store validated List payloads |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.AdditionalpropertiesShouldNotLookInApplicators1BoxedMap](#additionalpropertiesshouldnotlookinapplicators1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.AdditionalpropertiesShouldNotLookInApplicators1](#additionalpropertiesshouldnotlookinapplicators1)<br> schema class |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.AdditionalpropertiesShouldNotLookInApplicatorsMapBuilder](#additionalpropertiesshouldnotlookinapplicatorsmapbuilder)<br> builder for Map payloads |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.AdditionalpropertiesShouldNotLookInApplicatorsMap](#additionalpropertiesshouldnotlookinapplicatorsmap)<br> output class for Map payloads |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.Schema0Boxed](#schema0boxed)<br> abstract sealed validated payload class |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.Schema0BoxedVoid](#schema0boxedvoid)<br> boxed class to store validated null payloads |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.Schema0BoxedBoolean](#schema0boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.Schema0BoxedString](#schema0boxedstring)<br> boxed class to store validated String payloads |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.Schema0BoxedList](#schema0boxedlist)<br> boxed class to store validated List payloads |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.Schema0BoxedMap](#schema0boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.Schema0](#schema0)<br> schema class |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.Schema0MapBuilder](#schema0mapbuilder)<br> builder for Map payloads |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.Schema0Map](#schema0map)<br> output class for Map payloads |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.FooBoxed](#fooboxed)<br> abstract sealed validated payload class |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.FooBoxedVoid](#fooboxedvoid)<br> boxed class to store validated null payloads |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.FooBoxedBoolean](#fooboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.FooBoxedNumber](#fooboxednumber)<br> boxed class to store validated Number payloads |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.FooBoxedString](#fooboxedstring)<br> boxed class to store validated String payloads |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.FooBoxedList](#fooboxedlist)<br> boxed class to store validated List payloads |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.FooBoxedMap](#fooboxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.Foo](#foo)<br> schema class |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> abstract sealed validated payload class |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.AdditionalProperties](#additionalproperties)<br> schema class |

## AdditionalpropertiesShouldNotLookInApplicators1Boxed
public static abstract sealed class AdditionalpropertiesShouldNotLookInApplicators1Boxed<br>
permits<br>
[AdditionalpropertiesShouldNotLookInApplicators1BoxedVoid](#additionalpropertiesshouldnotlookinapplicators1boxedvoid),
[AdditionalpropertiesShouldNotLookInApplicators1BoxedBoolean](#additionalpropertiesshouldnotlookinapplicators1boxedboolean),
[AdditionalpropertiesShouldNotLookInApplicators1BoxedNumber](#additionalpropertiesshouldnotlookinapplicators1boxednumber),
[AdditionalpropertiesShouldNotLookInApplicators1BoxedString](#additionalpropertiesshouldnotlookinapplicators1boxedstring),
[AdditionalpropertiesShouldNotLookInApplicators1BoxedList](#additionalpropertiesshouldnotlookinapplicators1boxedlist),
[AdditionalpropertiesShouldNotLookInApplicators1BoxedMap](#additionalpropertiesshouldnotlookinapplicators1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## AdditionalpropertiesShouldNotLookInApplicators1BoxedVoid
public static final class AdditionalpropertiesShouldNotLookInApplicators1BoxedVoid<br>
extends [AdditionalpropertiesShouldNotLookInApplicators1Boxed](#additionalpropertiesshouldnotlookinapplicators1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesShouldNotLookInApplicators1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## AdditionalpropertiesShouldNotLookInApplicators1BoxedBoolean
public static final class AdditionalpropertiesShouldNotLookInApplicators1BoxedBoolean<br>
extends [AdditionalpropertiesShouldNotLookInApplicators1Boxed](#additionalpropertiesshouldnotlookinapplicators1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesShouldNotLookInApplicators1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## AdditionalpropertiesShouldNotLookInApplicators1BoxedNumber
public static final class AdditionalpropertiesShouldNotLookInApplicators1BoxedNumber<br>
extends [AdditionalpropertiesShouldNotLookInApplicators1Boxed](#additionalpropertiesshouldnotlookinapplicators1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesShouldNotLookInApplicators1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## AdditionalpropertiesShouldNotLookInApplicators1BoxedString
public static final class AdditionalpropertiesShouldNotLookInApplicators1BoxedString<br>
extends [AdditionalpropertiesShouldNotLookInApplicators1Boxed](#additionalpropertiesshouldnotlookinapplicators1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesShouldNotLookInApplicators1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## AdditionalpropertiesShouldNotLookInApplicators1BoxedList
public static final class AdditionalpropertiesShouldNotLookInApplicators1BoxedList<br>
extends [AdditionalpropertiesShouldNotLookInApplicators1Boxed](#additionalpropertiesshouldnotlookinapplicators1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesShouldNotLookInApplicators1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## AdditionalpropertiesShouldNotLookInApplicators1BoxedMap
public static final class AdditionalpropertiesShouldNotLookInApplicators1BoxedMap<br>
extends [AdditionalpropertiesShouldNotLookInApplicators1Boxed](#additionalpropertiesshouldnotlookinapplicators1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesShouldNotLookInApplicators1BoxedMap([AdditionalpropertiesShouldNotLookInApplicatorsMap](#additionalpropertiesshouldnotlookinapplicatorsmap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [AdditionalpropertiesShouldNotLookInApplicatorsMap](#additionalpropertiesshouldnotlookinapplicatorsmap) | data<br>validated payload |

## AdditionalpropertiesShouldNotLookInApplicators1
public static class AdditionalpropertiesShouldNotLookInApplicators1<br>
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
| [AdditionalpropertiesShouldNotLookInApplicatorsMap](#additionalpropertiesshouldnotlookinapplicatorsmap) | validate([Map&lt;?, ?&gt;](#additionalpropertiesshouldnotlookinapplicatorsmapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [AdditionalpropertiesShouldNotLookInApplicators1BoxedString](#additionalpropertiesshouldnotlookinapplicators1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [AdditionalpropertiesShouldNotLookInApplicators1BoxedVoid](#additionalpropertiesshouldnotlookinapplicators1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [AdditionalpropertiesShouldNotLookInApplicators1BoxedNumber](#additionalpropertiesshouldnotlookinapplicators1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [AdditionalpropertiesShouldNotLookInApplicators1BoxedBoolean](#additionalpropertiesshouldnotlookinapplicators1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [AdditionalpropertiesShouldNotLookInApplicators1BoxedMap](#additionalpropertiesshouldnotlookinapplicators1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#additionalpropertiesshouldnotlookinapplicatorsmapbuilder) arg, SchemaConfiguration configuration) |
| [AdditionalpropertiesShouldNotLookInApplicators1BoxedList](#additionalpropertiesshouldnotlookinapplicators1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## AdditionalpropertiesShouldNotLookInApplicatorsMapBuilder
public class AdditionalpropertiesShouldNotLookInApplicatorsMapBuilder<br>
builder for `Map<String, Boolean>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesShouldNotLookInApplicatorsMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Boolean> | build()<br>Returns map input that should be used with Schema.validate |
| [AdditionalpropertiesShouldNotLookInApplicatorsMapBuilder](#additionalpropertiesshouldnotlookinapplicatorsmapbuilder) | additionalProperty(String key, boolean value) |

## AdditionalpropertiesShouldNotLookInApplicatorsMap
public static class AdditionalpropertiesShouldNotLookInApplicatorsMap<br>
extends FrozenMap<String, Boolean>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AdditionalpropertiesShouldNotLookInApplicatorsMap](#additionalpropertiesshouldnotlookinapplicatorsmap) | of([Map<String, Boolean>](#additionalpropertiesshouldnotlookinapplicatorsmapbuilder) arg, SchemaConfiguration configuration) |
| boolean | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Schema0Boxed
public static abstract sealed class Schema0Boxed<br>
permits<br>
[Schema0BoxedVoid](#schema0boxedvoid),
[Schema0BoxedBoolean](#schema0boxedboolean),
[Schema0BoxedNumber](#schema0boxednumber),
[Schema0BoxedString](#schema0boxedstring),
[Schema0BoxedList](#schema0boxedlist),
[Schema0BoxedMap](#schema0boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Schema0BoxedVoid
public static final class Schema0BoxedVoid<br>
extends [Schema0Boxed](#schema0boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Schema0BoxedBoolean
public static final class Schema0BoxedBoolean<br>
extends [Schema0Boxed](#schema0boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Schema0BoxedNumber
public static final class Schema0BoxedNumber<br>
extends [Schema0Boxed](#schema0boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Schema0BoxedString
public static final class Schema0BoxedString<br>
extends [Schema0Boxed](#schema0boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Schema0BoxedList
public static final class Schema0BoxedList<br>
extends [Schema0Boxed](#schema0boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## Schema0BoxedMap
public static final class Schema0BoxedMap<br>
extends [Schema0Boxed](#schema0boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedMap([Schema0Map](#schema0map) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [Schema0Map](#schema0map) | data<br>validated payload |

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
public static abstract sealed class FooBoxed<br>
permits<br>
[FooBoxedVoid](#fooboxedvoid),
[FooBoxedBoolean](#fooboxedboolean),
[FooBoxedNumber](#fooboxednumber),
[FooBoxedString](#fooboxedstring),
[FooBoxedList](#fooboxedlist),
[FooBoxedMap](#fooboxedmap)

abstract sealed class that stores validated payloads using boxed classes

## FooBoxedVoid
public static final class FooBoxedVoid<br>
extends [FooBoxed](#fooboxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## FooBoxedBoolean
public static final class FooBoxedBoolean<br>
extends [FooBoxed](#fooboxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## FooBoxedNumber
public static final class FooBoxedNumber<br>
extends [FooBoxed](#fooboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## FooBoxedString
public static final class FooBoxedString<br>
extends [FooBoxed](#fooboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## FooBoxedList
public static final class FooBoxedList<br>
extends [FooBoxed](#fooboxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## FooBoxedMap
public static final class FooBoxedMap<br>
extends [FooBoxed](#fooboxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## Foo
public static class Foo<br>
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## AdditionalPropertiesBoxed
public static abstract sealed class AdditionalPropertiesBoxed<br>
permits<br>
[AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)

abstract sealed class that stores validated payloads using boxed classes

## AdditionalPropertiesBoxedBoolean
public static final class AdditionalPropertiesBoxedBoolean<br>
extends [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## AdditionalProperties
public static class AdditionalProperties<br>
extends BooleanJsonSchema.BooleanJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.BooleanJsonSchema.BooleanJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

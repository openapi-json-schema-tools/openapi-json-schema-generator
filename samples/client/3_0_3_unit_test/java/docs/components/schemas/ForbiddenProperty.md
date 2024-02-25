# ForbiddenProperty
org.openapijsonschematools.client.components.schemas.ForbiddenProperty.java
public class ForbiddenProperty<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ForbiddenProperty.ForbiddenProperty1Boxed](#forbiddenproperty1boxed)<br> sealed interface for validated payloads |
| record | [ForbiddenProperty.ForbiddenProperty1BoxedVoid](#forbiddenproperty1boxedvoid)<br> boxed class to store validated null payloads |
| record | [ForbiddenProperty.ForbiddenProperty1BoxedBoolean](#forbiddenproperty1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [ForbiddenProperty.ForbiddenProperty1BoxedNumber](#forbiddenproperty1boxednumber)<br> boxed class to store validated Number payloads |
| record | [ForbiddenProperty.ForbiddenProperty1BoxedString](#forbiddenproperty1boxedstring)<br> boxed class to store validated String payloads |
| record | [ForbiddenProperty.ForbiddenProperty1BoxedList](#forbiddenproperty1boxedlist)<br> boxed class to store validated List payloads |
| record | [ForbiddenProperty.ForbiddenProperty1BoxedMap](#forbiddenproperty1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ForbiddenProperty.ForbiddenProperty1](#forbiddenproperty1)<br> schema class |
| static class | [ForbiddenProperty.ForbiddenPropertyMapBuilder](#forbiddenpropertymapbuilder)<br> builder for Map payloads |
| static class | [ForbiddenProperty.ForbiddenPropertyMap](#forbiddenpropertymap)<br> output class for Map payloads |
| sealed interface | [ForbiddenProperty.FooBoxed](#fooboxed)<br> sealed interface for validated payloads |
| record | [ForbiddenProperty.FooBoxedVoid](#fooboxedvoid)<br> boxed class to store validated null payloads |
| record | [ForbiddenProperty.FooBoxedBoolean](#fooboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [ForbiddenProperty.FooBoxedNumber](#fooboxednumber)<br> boxed class to store validated Number payloads |
| record | [ForbiddenProperty.FooBoxedString](#fooboxedstring)<br> boxed class to store validated String payloads |
| record | [ForbiddenProperty.FooBoxedList](#fooboxedlist)<br> boxed class to store validated List payloads |
| record | [ForbiddenProperty.FooBoxedMap](#fooboxedmap)<br> boxed class to store validated Map payloads |
| static class | [ForbiddenProperty.Foo](#foo)<br> schema class |

## ForbiddenProperty1Boxed
public sealed interface ForbiddenProperty1Boxed<br>
permits<br>
[ForbiddenProperty1BoxedVoid](#forbiddenproperty1boxedvoid),
[ForbiddenProperty1BoxedBoolean](#forbiddenproperty1boxedboolean),
[ForbiddenProperty1BoxedNumber](#forbiddenproperty1boxednumber),
[ForbiddenProperty1BoxedString](#forbiddenproperty1boxedstring),
[ForbiddenProperty1BoxedList](#forbiddenproperty1boxedlist),
[ForbiddenProperty1BoxedMap](#forbiddenproperty1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ForbiddenProperty1BoxedVoid
public record ForbiddenProperty1BoxedVoid<br>
implements [ForbiddenProperty1Boxed](#forbiddenproperty1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ForbiddenProperty1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ForbiddenProperty1BoxedBoolean
public record ForbiddenProperty1BoxedBoolean<br>
implements [ForbiddenProperty1Boxed](#forbiddenproperty1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ForbiddenProperty1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ForbiddenProperty1BoxedNumber
public record ForbiddenProperty1BoxedNumber<br>
implements [ForbiddenProperty1Boxed](#forbiddenproperty1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ForbiddenProperty1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ForbiddenProperty1BoxedString
public record ForbiddenProperty1BoxedString<br>
implements [ForbiddenProperty1Boxed](#forbiddenproperty1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ForbiddenProperty1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ForbiddenProperty1BoxedList
public record ForbiddenProperty1BoxedList<br>
implements [ForbiddenProperty1Boxed](#forbiddenproperty1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ForbiddenProperty1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ForbiddenProperty1BoxedMap
public record ForbiddenProperty1BoxedMap<br>
implements [ForbiddenProperty1Boxed](#forbiddenproperty1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ForbiddenProperty1BoxedMap([ForbiddenPropertyMap](#forbiddenpropertymap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ForbiddenPropertyMap](#forbiddenpropertymap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ForbiddenProperty1
public static class ForbiddenProperty1<br>
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
| [ForbiddenPropertyMap](#forbiddenpropertymap) | validate([Map&lt;?, ?&gt;](#forbiddenpropertymapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [ForbiddenProperty1BoxedString](#forbiddenproperty1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ForbiddenProperty1BoxedVoid](#forbiddenproperty1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [ForbiddenProperty1BoxedNumber](#forbiddenproperty1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ForbiddenProperty1BoxedBoolean](#forbiddenproperty1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [ForbiddenProperty1BoxedMap](#forbiddenproperty1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#forbiddenpropertymapbuilder) arg, SchemaConfiguration configuration) |
| [ForbiddenProperty1BoxedList](#forbiddenproperty1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [ForbiddenProperty1Boxed](#forbiddenproperty1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ForbiddenPropertyMapBuilder
public class ForbiddenPropertyMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ForbiddenPropertyMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [ForbiddenPropertyMapBuilder](#forbiddenpropertymapbuilder) | foo(Void value) |
| [ForbiddenPropertyMapBuilder](#forbiddenpropertymapbuilder) | foo(boolean value) |
| [ForbiddenPropertyMapBuilder](#forbiddenpropertymapbuilder) | foo(String value) |
| [ForbiddenPropertyMapBuilder](#forbiddenpropertymapbuilder) | foo(int value) |
| [ForbiddenPropertyMapBuilder](#forbiddenpropertymapbuilder) | foo(float value) |
| [ForbiddenPropertyMapBuilder](#forbiddenpropertymapbuilder) | foo(long value) |
| [ForbiddenPropertyMapBuilder](#forbiddenpropertymapbuilder) | foo(double value) |
| [ForbiddenPropertyMapBuilder](#forbiddenpropertymapbuilder) | foo(List<?> value) |
| [ForbiddenPropertyMapBuilder](#forbiddenpropertymapbuilder) | foo(Map<String, ?> value) |
| [ForbiddenPropertyMapBuilder](#forbiddenpropertymapbuilder) | additionalProperty(String key, Void value) |
| [ForbiddenPropertyMapBuilder](#forbiddenpropertymapbuilder) | additionalProperty(String key, boolean value) |
| [ForbiddenPropertyMapBuilder](#forbiddenpropertymapbuilder) | additionalProperty(String key, String value) |
| [ForbiddenPropertyMapBuilder](#forbiddenpropertymapbuilder) | additionalProperty(String key, int value) |
| [ForbiddenPropertyMapBuilder](#forbiddenpropertymapbuilder) | additionalProperty(String key, float value) |
| [ForbiddenPropertyMapBuilder](#forbiddenpropertymapbuilder) | additionalProperty(String key, long value) |
| [ForbiddenPropertyMapBuilder](#forbiddenpropertymapbuilder) | additionalProperty(String key, double value) |
| [ForbiddenPropertyMapBuilder](#forbiddenpropertymapbuilder) | additionalProperty(String key, List<?> value) |
| [ForbiddenPropertyMapBuilder](#forbiddenpropertymapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## ForbiddenPropertyMap
public static class ForbiddenPropertyMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ForbiddenPropertyMap](#forbiddenpropertymap) | of([Map<String, ? extends @Nullable Object>](#forbiddenpropertymapbuilder) arg, SchemaConfiguration configuration) |
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
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

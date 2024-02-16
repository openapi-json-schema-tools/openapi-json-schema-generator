# ForbiddenProperty
org.openapijsonschematools.client.components.schemas.ForbiddenProperty.java
public class ForbiddenProperty<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ForbiddenProperty.ForbiddenProperty1Boxed](#forbiddenproperty1boxed)<br> abstract sealed validated payload class |
| static class | [ForbiddenProperty.ForbiddenProperty1BoxedVoid](#forbiddenproperty1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [ForbiddenProperty.ForbiddenProperty1BoxedBoolean](#forbiddenproperty1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [ForbiddenProperty.ForbiddenProperty1BoxedNumber](#forbiddenproperty1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [ForbiddenProperty.ForbiddenProperty1BoxedString](#forbiddenproperty1boxedstring)<br> boxed class to store validated String payloads |
| static class | [ForbiddenProperty.ForbiddenProperty1BoxedList](#forbiddenproperty1boxedlist)<br> boxed class to store validated List payloads |
| static class | [ForbiddenProperty.ForbiddenProperty1BoxedMap](#forbiddenproperty1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ForbiddenProperty.ForbiddenProperty1](#forbiddenproperty1)<br> schema class |
| static class | [ForbiddenProperty.ForbiddenPropertyMapBuilder](#forbiddenpropertymapbuilder)<br> builder for Map payloads |
| static class | [ForbiddenProperty.ForbiddenPropertyMap](#forbiddenpropertymap)<br> output class for Map payloads |
| static class | [ForbiddenProperty.FooBoxed](#fooboxed)<br> abstract sealed validated payload class |
| static class | [ForbiddenProperty.FooBoxedVoid](#fooboxedvoid)<br> boxed class to store validated null payloads |
| static class | [ForbiddenProperty.FooBoxedBoolean](#fooboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [ForbiddenProperty.FooBoxedNumber](#fooboxednumber)<br> boxed class to store validated Number payloads |
| static class | [ForbiddenProperty.FooBoxedString](#fooboxedstring)<br> boxed class to store validated String payloads |
| static class | [ForbiddenProperty.FooBoxedList](#fooboxedlist)<br> boxed class to store validated List payloads |
| static class | [ForbiddenProperty.FooBoxedMap](#fooboxedmap)<br> boxed class to store validated Map payloads |
| static class | [ForbiddenProperty.Foo](#foo)<br> schema class |

## ForbiddenProperty1Boxed
public static abstract sealed class ForbiddenProperty1Boxed<br>
permits<br>
[ForbiddenProperty1BoxedVoid](#forbiddenproperty1boxedvoid),
[ForbiddenProperty1BoxedBoolean](#forbiddenproperty1boxedboolean),
[ForbiddenProperty1BoxedNumber](#forbiddenproperty1boxednumber),
[ForbiddenProperty1BoxedString](#forbiddenproperty1boxedstring),
[ForbiddenProperty1BoxedList](#forbiddenproperty1boxedlist),
[ForbiddenProperty1BoxedMap](#forbiddenproperty1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## ForbiddenProperty1BoxedVoid
public static final class ForbiddenProperty1BoxedVoid<br>
extends [ForbiddenProperty1Boxed](#forbiddenproperty1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ForbiddenProperty1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## ForbiddenProperty1BoxedBoolean
public static final class ForbiddenProperty1BoxedBoolean<br>
extends [ForbiddenProperty1Boxed](#forbiddenproperty1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ForbiddenProperty1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## ForbiddenProperty1BoxedNumber
public static final class ForbiddenProperty1BoxedNumber<br>
extends [ForbiddenProperty1Boxed](#forbiddenproperty1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ForbiddenProperty1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## ForbiddenProperty1BoxedString
public static final class ForbiddenProperty1BoxedString<br>
extends [ForbiddenProperty1Boxed](#forbiddenproperty1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ForbiddenProperty1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## ForbiddenProperty1BoxedList
public static final class ForbiddenProperty1BoxedList<br>
extends [ForbiddenProperty1Boxed](#forbiddenproperty1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ForbiddenProperty1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## ForbiddenProperty1BoxedMap
public static final class ForbiddenProperty1BoxedMap<br>
extends [ForbiddenProperty1Boxed](#forbiddenproperty1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ForbiddenProperty1BoxedMap([ForbiddenPropertyMap](#forbiddenpropertymap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [ForbiddenPropertyMap](#forbiddenpropertymap) | data<br>validated payload |

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
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

# AdditionalpropertiesAreAllowedByDefault
unit_test_api.components.schemas.AdditionalpropertiesAreAllowedByDefault.java
public class AdditionalpropertiesAreAllowedByDefault<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [AdditionalpropertiesAreAllowedByDefault.AdditionalpropertiesAreAllowedByDefault1Boxed](#additionalpropertiesareallowedbydefault1boxed)<br> sealed interface for validated payloads |
| record | [AdditionalpropertiesAreAllowedByDefault.AdditionalpropertiesAreAllowedByDefault1BoxedVoid](#additionalpropertiesareallowedbydefault1boxedvoid)<br> boxed class to store validated null payloads |
| record | [AdditionalpropertiesAreAllowedByDefault.AdditionalpropertiesAreAllowedByDefault1BoxedBoolean](#additionalpropertiesareallowedbydefault1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AdditionalpropertiesAreAllowedByDefault.AdditionalpropertiesAreAllowedByDefault1BoxedNumber](#additionalpropertiesareallowedbydefault1boxednumber)<br> boxed class to store validated Number payloads |
| record | [AdditionalpropertiesAreAllowedByDefault.AdditionalpropertiesAreAllowedByDefault1BoxedString](#additionalpropertiesareallowedbydefault1boxedstring)<br> boxed class to store validated String payloads |
| record | [AdditionalpropertiesAreAllowedByDefault.AdditionalpropertiesAreAllowedByDefault1BoxedList](#additionalpropertiesareallowedbydefault1boxedlist)<br> boxed class to store validated List payloads |
| record | [AdditionalpropertiesAreAllowedByDefault.AdditionalpropertiesAreAllowedByDefault1BoxedMap](#additionalpropertiesareallowedbydefault1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalpropertiesAreAllowedByDefault.AdditionalpropertiesAreAllowedByDefault1](#additionalpropertiesareallowedbydefault1)<br> schema class |
| static class | [AdditionalpropertiesAreAllowedByDefault.AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder)<br> builder for Map payloads |
| static class | [AdditionalpropertiesAreAllowedByDefault.AdditionalpropertiesAreAllowedByDefaultMap](#additionalpropertiesareallowedbydefaultmap)<br> output class for Map payloads |
| sealed interface | [AdditionalpropertiesAreAllowedByDefault.BarBoxed](#barboxed)<br> sealed interface for validated payloads |
| record | [AdditionalpropertiesAreAllowedByDefault.BarBoxedVoid](#barboxedvoid)<br> boxed class to store validated null payloads |
| record | [AdditionalpropertiesAreAllowedByDefault.BarBoxedBoolean](#barboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AdditionalpropertiesAreAllowedByDefault.BarBoxedNumber](#barboxednumber)<br> boxed class to store validated Number payloads |
| record | [AdditionalpropertiesAreAllowedByDefault.BarBoxedString](#barboxedstring)<br> boxed class to store validated String payloads |
| record | [AdditionalpropertiesAreAllowedByDefault.BarBoxedList](#barboxedlist)<br> boxed class to store validated List payloads |
| record | [AdditionalpropertiesAreAllowedByDefault.BarBoxedMap](#barboxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalpropertiesAreAllowedByDefault.Bar](#bar)<br> schema class |
| sealed interface | [AdditionalpropertiesAreAllowedByDefault.FooBoxed](#fooboxed)<br> sealed interface for validated payloads |
| record | [AdditionalpropertiesAreAllowedByDefault.FooBoxedVoid](#fooboxedvoid)<br> boxed class to store validated null payloads |
| record | [AdditionalpropertiesAreAllowedByDefault.FooBoxedBoolean](#fooboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AdditionalpropertiesAreAllowedByDefault.FooBoxedNumber](#fooboxednumber)<br> boxed class to store validated Number payloads |
| record | [AdditionalpropertiesAreAllowedByDefault.FooBoxedString](#fooboxedstring)<br> boxed class to store validated String payloads |
| record | [AdditionalpropertiesAreAllowedByDefault.FooBoxedList](#fooboxedlist)<br> boxed class to store validated List payloads |
| record | [AdditionalpropertiesAreAllowedByDefault.FooBoxedMap](#fooboxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalpropertiesAreAllowedByDefault.Foo](#foo)<br> schema class |

## AdditionalpropertiesAreAllowedByDefault1Boxed
public sealed interface AdditionalpropertiesAreAllowedByDefault1Boxed<br>
permits<br>
[AdditionalpropertiesAreAllowedByDefault1BoxedVoid](#additionalpropertiesareallowedbydefault1boxedvoid),
[AdditionalpropertiesAreAllowedByDefault1BoxedBoolean](#additionalpropertiesareallowedbydefault1boxedboolean),
[AdditionalpropertiesAreAllowedByDefault1BoxedNumber](#additionalpropertiesareallowedbydefault1boxednumber),
[AdditionalpropertiesAreAllowedByDefault1BoxedString](#additionalpropertiesareallowedbydefault1boxedstring),
[AdditionalpropertiesAreAllowedByDefault1BoxedList](#additionalpropertiesareallowedbydefault1boxedlist),
[AdditionalpropertiesAreAllowedByDefault1BoxedMap](#additionalpropertiesareallowedbydefault1boxedmap)

sealed interface that stores validated payloads using boxed classes

## AdditionalpropertiesAreAllowedByDefault1BoxedVoid
public record AdditionalpropertiesAreAllowedByDefault1BoxedVoid<br>
implements [AdditionalpropertiesAreAllowedByDefault1Boxed](#additionalpropertiesareallowedbydefault1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesAreAllowedByDefault1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalpropertiesAreAllowedByDefault1BoxedBoolean
public record AdditionalpropertiesAreAllowedByDefault1BoxedBoolean<br>
implements [AdditionalpropertiesAreAllowedByDefault1Boxed](#additionalpropertiesareallowedbydefault1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesAreAllowedByDefault1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalpropertiesAreAllowedByDefault1BoxedNumber
public record AdditionalpropertiesAreAllowedByDefault1BoxedNumber<br>
implements [AdditionalpropertiesAreAllowedByDefault1Boxed](#additionalpropertiesareallowedbydefault1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesAreAllowedByDefault1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalpropertiesAreAllowedByDefault1BoxedString
public record AdditionalpropertiesAreAllowedByDefault1BoxedString<br>
implements [AdditionalpropertiesAreAllowedByDefault1Boxed](#additionalpropertiesareallowedbydefault1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesAreAllowedByDefault1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalpropertiesAreAllowedByDefault1BoxedList
public record AdditionalpropertiesAreAllowedByDefault1BoxedList<br>
implements [AdditionalpropertiesAreAllowedByDefault1Boxed](#additionalpropertiesareallowedbydefault1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesAreAllowedByDefault1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalpropertiesAreAllowedByDefault1BoxedMap
public record AdditionalpropertiesAreAllowedByDefault1BoxedMap<br>
implements [AdditionalpropertiesAreAllowedByDefault1Boxed](#additionalpropertiesareallowedbydefault1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesAreAllowedByDefault1BoxedMap([AdditionalpropertiesAreAllowedByDefaultMap](#additionalpropertiesareallowedbydefaultmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AdditionalpropertiesAreAllowedByDefaultMap](#additionalpropertiesareallowedbydefaultmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalpropertiesAreAllowedByDefault1
public static class AdditionalpropertiesAreAllowedByDefault1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo", [Foo.class](#foo))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("bar", [Bar.class](#bar)))<br>)<br> |

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
| [AdditionalpropertiesAreAllowedByDefaultMap](#additionalpropertiesareallowedbydefaultmap) | validate([Map&lt;?, ?&gt;](#additionalpropertiesareallowedbydefaultmapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [AdditionalpropertiesAreAllowedByDefault1BoxedString](#additionalpropertiesareallowedbydefault1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [AdditionalpropertiesAreAllowedByDefault1BoxedVoid](#additionalpropertiesareallowedbydefault1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [AdditionalpropertiesAreAllowedByDefault1BoxedNumber](#additionalpropertiesareallowedbydefault1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [AdditionalpropertiesAreAllowedByDefault1BoxedBoolean](#additionalpropertiesareallowedbydefault1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [AdditionalpropertiesAreAllowedByDefault1BoxedMap](#additionalpropertiesareallowedbydefault1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#additionalpropertiesareallowedbydefaultmapbuilder) arg, SchemaConfiguration configuration) |
| [AdditionalpropertiesAreAllowedByDefault1BoxedList](#additionalpropertiesareallowedbydefault1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [AdditionalpropertiesAreAllowedByDefault1Boxed](#additionalpropertiesareallowedbydefault1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## AdditionalpropertiesAreAllowedByDefaultMapBuilder
public class AdditionalpropertiesAreAllowedByDefaultMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesAreAllowedByDefaultMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | foo(Void value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | foo(boolean value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | foo(String value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | foo(int value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | foo(float value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | foo(long value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | foo(double value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | foo(List<?> value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | foo(Map<String, ?> value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | bar(Void value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | bar(boolean value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | bar(String value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | bar(int value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | bar(float value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | bar(long value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | bar(double value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | bar(List<?> value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | bar(Map<String, ?> value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | additionalProperty(String key, Void value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | additionalProperty(String key, boolean value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | additionalProperty(String key, String value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | additionalProperty(String key, int value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | additionalProperty(String key, float value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | additionalProperty(String key, long value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | additionalProperty(String key, double value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | additionalProperty(String key, List<?> value) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## AdditionalpropertiesAreAllowedByDefaultMap
public static class AdditionalpropertiesAreAllowedByDefaultMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AdditionalpropertiesAreAllowedByDefaultMap](#additionalpropertiesareallowedbydefaultmap) | of([Map<String, ? extends @Nullable Object>](#additionalpropertiesareallowedbydefaultmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | foo()<br>[optional] |
| @Nullable Object | bar()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## BarBoxed
public sealed interface BarBoxed<br>
permits<br>
[BarBoxedVoid](#barboxedvoid),
[BarBoxedBoolean](#barboxedboolean),
[BarBoxedNumber](#barboxednumber),
[BarBoxedString](#barboxedstring),
[BarBoxedList](#barboxedlist),
[BarBoxedMap](#barboxedmap)

sealed interface that stores validated payloads using boxed classes

## BarBoxedVoid
public record BarBoxedVoid<br>
implements [BarBoxed](#barboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BarBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## BarBoxedBoolean
public record BarBoxedBoolean<br>
implements [BarBoxed](#barboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BarBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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

## BarBoxedString
public record BarBoxedString<br>
implements [BarBoxed](#barboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BarBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## BarBoxedList
public record BarBoxedList<br>
implements [BarBoxed](#barboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BarBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## BarBoxedMap
public record BarBoxedMap<br>
implements [BarBoxed](#barboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BarBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Bar
public static class Bar<br>
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class unit_test_api.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

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

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

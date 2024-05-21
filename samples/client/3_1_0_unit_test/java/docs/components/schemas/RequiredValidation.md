# RequiredValidation
unit_test_api.components.schemas.RequiredValidation.java
public class RequiredValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [RequiredValidation.RequiredValidation1Boxed](#requiredvalidation1boxed)<br> sealed interface for validated payloads |
| record | [RequiredValidation.RequiredValidation1BoxedVoid](#requiredvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| record | [RequiredValidation.RequiredValidation1BoxedBoolean](#requiredvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [RequiredValidation.RequiredValidation1BoxedNumber](#requiredvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| record | [RequiredValidation.RequiredValidation1BoxedString](#requiredvalidation1boxedstring)<br> boxed class to store validated String payloads |
| record | [RequiredValidation.RequiredValidation1BoxedList](#requiredvalidation1boxedlist)<br> boxed class to store validated List payloads |
| record | [RequiredValidation.RequiredValidation1BoxedMap](#requiredvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [RequiredValidation.RequiredValidation1](#requiredvalidation1)<br> schema class |
| static class | [RequiredValidation.RequiredValidationMapBuilder](#requiredvalidationmapbuilder)<br> builder for Map payloads |
| static class | [RequiredValidation.RequiredValidationMap](#requiredvalidationmap)<br> output class for Map payloads |
| sealed interface | [RequiredValidation.BarBoxed](#barboxed)<br> sealed interface for validated payloads |
| record | [RequiredValidation.BarBoxedVoid](#barboxedvoid)<br> boxed class to store validated null payloads |
| record | [RequiredValidation.BarBoxedBoolean](#barboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [RequiredValidation.BarBoxedNumber](#barboxednumber)<br> boxed class to store validated Number payloads |
| record | [RequiredValidation.BarBoxedString](#barboxedstring)<br> boxed class to store validated String payloads |
| record | [RequiredValidation.BarBoxedList](#barboxedlist)<br> boxed class to store validated List payloads |
| record | [RequiredValidation.BarBoxedMap](#barboxedmap)<br> boxed class to store validated Map payloads |
| static class | [RequiredValidation.Bar](#bar)<br> schema class |
| sealed interface | [RequiredValidation.FooBoxed](#fooboxed)<br> sealed interface for validated payloads |
| record | [RequiredValidation.FooBoxedVoid](#fooboxedvoid)<br> boxed class to store validated null payloads |
| record | [RequiredValidation.FooBoxedBoolean](#fooboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [RequiredValidation.FooBoxedNumber](#fooboxednumber)<br> boxed class to store validated Number payloads |
| record | [RequiredValidation.FooBoxedString](#fooboxedstring)<br> boxed class to store validated String payloads |
| record | [RequiredValidation.FooBoxedList](#fooboxedlist)<br> boxed class to store validated List payloads |
| record | [RequiredValidation.FooBoxedMap](#fooboxedmap)<br> boxed class to store validated Map payloads |
| static class | [RequiredValidation.Foo](#foo)<br> schema class |

## RequiredValidation1Boxed
public sealed interface RequiredValidation1Boxed<br>
permits<br>
[RequiredValidation1BoxedVoid](#requiredvalidation1boxedvoid),
[RequiredValidation1BoxedBoolean](#requiredvalidation1boxedboolean),
[RequiredValidation1BoxedNumber](#requiredvalidation1boxednumber),
[RequiredValidation1BoxedString](#requiredvalidation1boxedstring),
[RequiredValidation1BoxedList](#requiredvalidation1boxedlist),
[RequiredValidation1BoxedMap](#requiredvalidation1boxedmap)

sealed interface that stores validated payloads using boxed classes

## RequiredValidation1BoxedVoid
public record RequiredValidation1BoxedVoid<br>
implements [RequiredValidation1Boxed](#requiredvalidation1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredValidation1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RequiredValidation1BoxedBoolean
public record RequiredValidation1BoxedBoolean<br>
implements [RequiredValidation1Boxed](#requiredvalidation1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RequiredValidation1BoxedNumber
public record RequiredValidation1BoxedNumber<br>
implements [RequiredValidation1Boxed](#requiredvalidation1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RequiredValidation1BoxedString
public record RequiredValidation1BoxedString<br>
implements [RequiredValidation1Boxed](#requiredvalidation1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RequiredValidation1BoxedList
public record RequiredValidation1BoxedList<br>
implements [RequiredValidation1Boxed](#requiredvalidation1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredValidation1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RequiredValidation1BoxedMap
public record RequiredValidation1BoxedMap<br>
implements [RequiredValidation1Boxed](#requiredvalidation1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredValidation1BoxedMap([RequiredValidationMap](#requiredvalidationmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredValidationMap](#requiredvalidationmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RequiredValidation1
public static class RequiredValidation1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo", [Foo.class](#foo))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("bar", [Bar.class](#bar)))<br>)<br> |
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
| [RequiredValidationMap](#requiredvalidationmap) | validate([Map&lt;?, ?&gt;](#requiredvalidationmapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [RequiredValidation1BoxedString](#requiredvalidation1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [RequiredValidation1BoxedVoid](#requiredvalidation1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [RequiredValidation1BoxedNumber](#requiredvalidation1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [RequiredValidation1BoxedBoolean](#requiredvalidation1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [RequiredValidation1BoxedMap](#requiredvalidation1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#requiredvalidationmapbuilder) arg, SchemaConfiguration configuration) |
| [RequiredValidation1BoxedList](#requiredvalidation1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [RequiredValidation1Boxed](#requiredvalidation1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## RequiredValidationMap0Builder
public class RequiredValidationMap0Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredValidationMap0Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | bar(Void value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | bar(boolean value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | bar(String value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | bar(int value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | bar(float value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | bar(long value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | bar(double value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | bar(List<?> value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | bar(Map<String, ?> value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | additionalProperty(String key, Void value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | additionalProperty(String key, boolean value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | additionalProperty(String key, String value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | additionalProperty(String key, int value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | additionalProperty(String key, float value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | additionalProperty(String key, long value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | additionalProperty(String key, double value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | additionalProperty(String key, List<?> value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | additionalProperty(String key, Map<String, ?> value) |

## RequiredValidationMapBuilder
public class RequiredValidationMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredValidationMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | foo(Void value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | foo(boolean value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | foo(String value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | foo(int value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | foo(float value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | foo(long value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | foo(double value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | foo(List<?> value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | foo(Map<String, ?> value) |

## RequiredValidationMap
public static class RequiredValidationMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [RequiredValidationMap](#requiredvalidationmap) | of([Map<String, ? extends @Nullable Object>](#requiredvalidationmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | foo()<br> |
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

# RequiredDefaultValidation
org.openapijsonschematools.client.components.schemas.RequiredDefaultValidation.java
public class RequiredDefaultValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [RequiredDefaultValidation.RequiredDefaultValidation1Boxed](#requireddefaultvalidation1boxed)<br> sealed interface for validated payloads |
| record | [RequiredDefaultValidation.RequiredDefaultValidation1BoxedVoid](#requireddefaultvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| record | [RequiredDefaultValidation.RequiredDefaultValidation1BoxedBoolean](#requireddefaultvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [RequiredDefaultValidation.RequiredDefaultValidation1BoxedNumber](#requireddefaultvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| record | [RequiredDefaultValidation.RequiredDefaultValidation1BoxedString](#requireddefaultvalidation1boxedstring)<br> boxed class to store validated String payloads |
| record | [RequiredDefaultValidation.RequiredDefaultValidation1BoxedList](#requireddefaultvalidation1boxedlist)<br> boxed class to store validated List payloads |
| record | [RequiredDefaultValidation.RequiredDefaultValidation1BoxedMap](#requireddefaultvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [RequiredDefaultValidation.RequiredDefaultValidation1](#requireddefaultvalidation1)<br> schema class |
| static class | [RequiredDefaultValidation.RequiredDefaultValidationMapBuilder](#requireddefaultvalidationmapbuilder)<br> builder for Map payloads |
| static class | [RequiredDefaultValidation.RequiredDefaultValidationMap](#requireddefaultvalidationmap)<br> output class for Map payloads |
| sealed interface | [RequiredDefaultValidation.FooBoxed](#fooboxed)<br> sealed interface for validated payloads |
| record | [RequiredDefaultValidation.FooBoxedVoid](#fooboxedvoid)<br> boxed class to store validated null payloads |
| record | [RequiredDefaultValidation.FooBoxedBoolean](#fooboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [RequiredDefaultValidation.FooBoxedNumber](#fooboxednumber)<br> boxed class to store validated Number payloads |
| record | [RequiredDefaultValidation.FooBoxedString](#fooboxedstring)<br> boxed class to store validated String payloads |
| record | [RequiredDefaultValidation.FooBoxedList](#fooboxedlist)<br> boxed class to store validated List payloads |
| record | [RequiredDefaultValidation.FooBoxedMap](#fooboxedmap)<br> boxed class to store validated Map payloads |
| static class | [RequiredDefaultValidation.Foo](#foo)<br> schema class |

## RequiredDefaultValidation1Boxed
public sealed interface RequiredDefaultValidation1Boxed<br>
permits<br>
[RequiredDefaultValidation1BoxedVoid](#requireddefaultvalidation1boxedvoid),
[RequiredDefaultValidation1BoxedBoolean](#requireddefaultvalidation1boxedboolean),
[RequiredDefaultValidation1BoxedNumber](#requireddefaultvalidation1boxednumber),
[RequiredDefaultValidation1BoxedString](#requireddefaultvalidation1boxedstring),
[RequiredDefaultValidation1BoxedList](#requireddefaultvalidation1boxedlist),
[RequiredDefaultValidation1BoxedMap](#requireddefaultvalidation1boxedmap)

sealed interface that stores validated payloads using boxed classes

## RequiredDefaultValidation1BoxedVoid
public record RequiredDefaultValidation1BoxedVoid<br>
implements [RequiredDefaultValidation1Boxed](#requireddefaultvalidation1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredDefaultValidation1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RequiredDefaultValidation1BoxedBoolean
public record RequiredDefaultValidation1BoxedBoolean<br>
implements [RequiredDefaultValidation1Boxed](#requireddefaultvalidation1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredDefaultValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RequiredDefaultValidation1BoxedNumber
public record RequiredDefaultValidation1BoxedNumber<br>
implements [RequiredDefaultValidation1Boxed](#requireddefaultvalidation1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredDefaultValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RequiredDefaultValidation1BoxedString
public record RequiredDefaultValidation1BoxedString<br>
implements [RequiredDefaultValidation1Boxed](#requireddefaultvalidation1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredDefaultValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RequiredDefaultValidation1BoxedList
public record RequiredDefaultValidation1BoxedList<br>
implements [RequiredDefaultValidation1Boxed](#requireddefaultvalidation1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredDefaultValidation1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RequiredDefaultValidation1BoxedMap
public record RequiredDefaultValidation1BoxedMap<br>
implements [RequiredDefaultValidation1Boxed](#requireddefaultvalidation1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredDefaultValidation1BoxedMap([RequiredDefaultValidationMap](#requireddefaultvalidationmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredDefaultValidationMap](#requireddefaultvalidationmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RequiredDefaultValidation1
public static class RequiredDefaultValidation1<br>
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
| [RequiredDefaultValidationMap](#requireddefaultvalidationmap) | validate([Map&lt;?, ?&gt;](#requireddefaultvalidationmapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [RequiredDefaultValidation1BoxedString](#requireddefaultvalidation1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [RequiredDefaultValidation1BoxedVoid](#requireddefaultvalidation1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [RequiredDefaultValidation1BoxedNumber](#requireddefaultvalidation1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [RequiredDefaultValidation1BoxedBoolean](#requireddefaultvalidation1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [RequiredDefaultValidation1BoxedMap](#requireddefaultvalidation1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#requireddefaultvalidationmapbuilder) arg, SchemaConfiguration configuration) |
| [RequiredDefaultValidation1BoxedList](#requireddefaultvalidation1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [RequiredDefaultValidation1Boxed](#requireddefaultvalidation1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## RequiredDefaultValidationMapBuilder
public class RequiredDefaultValidationMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredDefaultValidationMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [RequiredDefaultValidationMapBuilder](#requireddefaultvalidationmapbuilder) | foo(Void value) |
| [RequiredDefaultValidationMapBuilder](#requireddefaultvalidationmapbuilder) | foo(boolean value) |
| [RequiredDefaultValidationMapBuilder](#requireddefaultvalidationmapbuilder) | foo(String value) |
| [RequiredDefaultValidationMapBuilder](#requireddefaultvalidationmapbuilder) | foo(int value) |
| [RequiredDefaultValidationMapBuilder](#requireddefaultvalidationmapbuilder) | foo(float value) |
| [RequiredDefaultValidationMapBuilder](#requireddefaultvalidationmapbuilder) | foo(long value) |
| [RequiredDefaultValidationMapBuilder](#requireddefaultvalidationmapbuilder) | foo(double value) |
| [RequiredDefaultValidationMapBuilder](#requireddefaultvalidationmapbuilder) | foo(List<?> value) |
| [RequiredDefaultValidationMapBuilder](#requireddefaultvalidationmapbuilder) | foo(Map<String, ?> value) |
| [RequiredDefaultValidationMapBuilder](#requireddefaultvalidationmapbuilder) | additionalProperty(String key, Void value) |
| [RequiredDefaultValidationMapBuilder](#requireddefaultvalidationmapbuilder) | additionalProperty(String key, boolean value) |
| [RequiredDefaultValidationMapBuilder](#requireddefaultvalidationmapbuilder) | additionalProperty(String key, String value) |
| [RequiredDefaultValidationMapBuilder](#requireddefaultvalidationmapbuilder) | additionalProperty(String key, int value) |
| [RequiredDefaultValidationMapBuilder](#requireddefaultvalidationmapbuilder) | additionalProperty(String key, float value) |
| [RequiredDefaultValidationMapBuilder](#requireddefaultvalidationmapbuilder) | additionalProperty(String key, long value) |
| [RequiredDefaultValidationMapBuilder](#requireddefaultvalidationmapbuilder) | additionalProperty(String key, double value) |
| [RequiredDefaultValidationMapBuilder](#requireddefaultvalidationmapbuilder) | additionalProperty(String key, List<?> value) |
| [RequiredDefaultValidationMapBuilder](#requireddefaultvalidationmapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## RequiredDefaultValidationMap
public static class RequiredDefaultValidationMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [RequiredDefaultValidationMap](#requireddefaultvalidationmap) | of([Map<String, ? extends @Nullable Object>](#requireddefaultvalidationmapbuilder) arg, SchemaConfiguration configuration) |
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

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

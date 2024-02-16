# RequiredWithEmptyArray
org.openapijsonschematools.client.components.schemas.RequiredWithEmptyArray.java
public class RequiredWithEmptyArray<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [RequiredWithEmptyArray.RequiredWithEmptyArray1Boxed](#requiredwithemptyarray1boxed)<br> abstract sealed validated payload class |
| static class | [RequiredWithEmptyArray.RequiredWithEmptyArray1BoxedVoid](#requiredwithemptyarray1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [RequiredWithEmptyArray.RequiredWithEmptyArray1BoxedBoolean](#requiredwithemptyarray1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [RequiredWithEmptyArray.RequiredWithEmptyArray1BoxedNumber](#requiredwithemptyarray1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [RequiredWithEmptyArray.RequiredWithEmptyArray1BoxedString](#requiredwithemptyarray1boxedstring)<br> boxed class to store validated String payloads |
| static class | [RequiredWithEmptyArray.RequiredWithEmptyArray1BoxedList](#requiredwithemptyarray1boxedlist)<br> boxed class to store validated List payloads |
| static class | [RequiredWithEmptyArray.RequiredWithEmptyArray1BoxedMap](#requiredwithemptyarray1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [RequiredWithEmptyArray.RequiredWithEmptyArray1](#requiredwithemptyarray1)<br> schema class |
| static class | [RequiredWithEmptyArray.RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder)<br> builder for Map payloads |
| static class | [RequiredWithEmptyArray.RequiredWithEmptyArrayMap](#requiredwithemptyarraymap)<br> output class for Map payloads |
| static class | [RequiredWithEmptyArray.FooBoxed](#fooboxed)<br> abstract sealed validated payload class |
| static class | [RequiredWithEmptyArray.FooBoxedVoid](#fooboxedvoid)<br> boxed class to store validated null payloads |
| static class | [RequiredWithEmptyArray.FooBoxedBoolean](#fooboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [RequiredWithEmptyArray.FooBoxedNumber](#fooboxednumber)<br> boxed class to store validated Number payloads |
| static class | [RequiredWithEmptyArray.FooBoxedString](#fooboxedstring)<br> boxed class to store validated String payloads |
| static class | [RequiredWithEmptyArray.FooBoxedList](#fooboxedlist)<br> boxed class to store validated List payloads |
| static class | [RequiredWithEmptyArray.FooBoxedMap](#fooboxedmap)<br> boxed class to store validated Map payloads |
| static class | [RequiredWithEmptyArray.Foo](#foo)<br> schema class |

## RequiredWithEmptyArray1Boxed
public static abstract sealed class RequiredWithEmptyArray1Boxed<br>
permits<br>
[RequiredWithEmptyArray1BoxedVoid](#requiredwithemptyarray1boxedvoid),
[RequiredWithEmptyArray1BoxedBoolean](#requiredwithemptyarray1boxedboolean),
[RequiredWithEmptyArray1BoxedNumber](#requiredwithemptyarray1boxednumber),
[RequiredWithEmptyArray1BoxedString](#requiredwithemptyarray1boxedstring),
[RequiredWithEmptyArray1BoxedList](#requiredwithemptyarray1boxedlist),
[RequiredWithEmptyArray1BoxedMap](#requiredwithemptyarray1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## RequiredWithEmptyArray1BoxedVoid
public static final class RequiredWithEmptyArray1BoxedVoid<br>
extends [RequiredWithEmptyArray1Boxed](#requiredwithemptyarray1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEmptyArray1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## RequiredWithEmptyArray1BoxedBoolean
public static final class RequiredWithEmptyArray1BoxedBoolean<br>
extends [RequiredWithEmptyArray1Boxed](#requiredwithemptyarray1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEmptyArray1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## RequiredWithEmptyArray1BoxedNumber
public static final class RequiredWithEmptyArray1BoxedNumber<br>
extends [RequiredWithEmptyArray1Boxed](#requiredwithemptyarray1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEmptyArray1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## RequiredWithEmptyArray1BoxedString
public static final class RequiredWithEmptyArray1BoxedString<br>
extends [RequiredWithEmptyArray1Boxed](#requiredwithemptyarray1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEmptyArray1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## RequiredWithEmptyArray1BoxedList
public static final class RequiredWithEmptyArray1BoxedList<br>
extends [RequiredWithEmptyArray1Boxed](#requiredwithemptyarray1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEmptyArray1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## RequiredWithEmptyArray1BoxedMap
public static final class RequiredWithEmptyArray1BoxedMap<br>
extends [RequiredWithEmptyArray1Boxed](#requiredwithemptyarray1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEmptyArray1BoxedMap([RequiredWithEmptyArrayMap](#requiredwithemptyarraymap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [RequiredWithEmptyArrayMap](#requiredwithemptyarraymap) | data<br>validated payload |

## RequiredWithEmptyArray1
public static class RequiredWithEmptyArray1<br>
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
| [RequiredWithEmptyArrayMap](#requiredwithemptyarraymap) | validate([Map&lt;?, ?&gt;](#requiredwithemptyarraymapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [RequiredWithEmptyArray1BoxedString](#requiredwithemptyarray1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [RequiredWithEmptyArray1BoxedVoid](#requiredwithemptyarray1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [RequiredWithEmptyArray1BoxedNumber](#requiredwithemptyarray1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [RequiredWithEmptyArray1BoxedBoolean](#requiredwithemptyarray1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [RequiredWithEmptyArray1BoxedMap](#requiredwithemptyarray1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#requiredwithemptyarraymapbuilder) arg, SchemaConfiguration configuration) |
| [RequiredWithEmptyArray1BoxedList](#requiredwithemptyarray1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## RequiredWithEmptyArrayMapBuilder
public class RequiredWithEmptyArrayMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEmptyArrayMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | foo(Void value) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | foo(boolean value) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | foo(String value) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | foo(int value) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | foo(float value) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | foo(long value) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | foo(double value) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | foo(List<?> value) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | foo(Map<String, ?> value) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | additionalProperty(String key, Void value) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | additionalProperty(String key, boolean value) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | additionalProperty(String key, String value) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | additionalProperty(String key, int value) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | additionalProperty(String key, float value) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | additionalProperty(String key, long value) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | additionalProperty(String key, double value) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | additionalProperty(String key, List<?> value) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## RequiredWithEmptyArrayMap
public static class RequiredWithEmptyArrayMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [RequiredWithEmptyArrayMap](#requiredwithemptyarraymap) | of([Map<String, ? extends @Nullable Object>](#requiredwithemptyarraymapbuilder) arg, SchemaConfiguration configuration) |
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

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

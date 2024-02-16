# ObjectPropertiesValidation
org.openapijsonschematools.client.components.schemas.ObjectPropertiesValidation.java
public class ObjectPropertiesValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ObjectPropertiesValidation.ObjectPropertiesValidation1Boxed](#objectpropertiesvalidation1boxed)<br> abstract sealed validated payload class |
| static class | [ObjectPropertiesValidation.ObjectPropertiesValidation1BoxedVoid](#objectpropertiesvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [ObjectPropertiesValidation.ObjectPropertiesValidation1BoxedBoolean](#objectpropertiesvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [ObjectPropertiesValidation.ObjectPropertiesValidation1BoxedNumber](#objectpropertiesvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [ObjectPropertiesValidation.ObjectPropertiesValidation1BoxedString](#objectpropertiesvalidation1boxedstring)<br> boxed class to store validated String payloads |
| static class | [ObjectPropertiesValidation.ObjectPropertiesValidation1BoxedList](#objectpropertiesvalidation1boxedlist)<br> boxed class to store validated List payloads |
| static class | [ObjectPropertiesValidation.ObjectPropertiesValidation1BoxedMap](#objectpropertiesvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ObjectPropertiesValidation.ObjectPropertiesValidation1](#objectpropertiesvalidation1)<br> schema class |
| static class | [ObjectPropertiesValidation.ObjectPropertiesValidationMapBuilder](#objectpropertiesvalidationmapbuilder)<br> builder for Map payloads |
| static class | [ObjectPropertiesValidation.ObjectPropertiesValidationMap](#objectpropertiesvalidationmap)<br> output class for Map payloads |
| static class | [ObjectPropertiesValidation.BarBoxed](#barboxed)<br> abstract sealed validated payload class |
| static class | [ObjectPropertiesValidation.BarBoxedString](#barboxedstring)<br> boxed class to store validated String payloads |
| static class | [ObjectPropertiesValidation.Bar](#bar)<br> schema class |
| static class | [ObjectPropertiesValidation.FooBoxed](#fooboxed)<br> abstract sealed validated payload class |
| static class | [ObjectPropertiesValidation.FooBoxedNumber](#fooboxednumber)<br> boxed class to store validated Number payloads |
| static class | [ObjectPropertiesValidation.Foo](#foo)<br> schema class |

## ObjectPropertiesValidation1Boxed
public static abstract sealed class ObjectPropertiesValidation1Boxed<br>
permits<br>
[ObjectPropertiesValidation1BoxedVoid](#objectpropertiesvalidation1boxedvoid),
[ObjectPropertiesValidation1BoxedBoolean](#objectpropertiesvalidation1boxedboolean),
[ObjectPropertiesValidation1BoxedNumber](#objectpropertiesvalidation1boxednumber),
[ObjectPropertiesValidation1BoxedString](#objectpropertiesvalidation1boxedstring),
[ObjectPropertiesValidation1BoxedList](#objectpropertiesvalidation1boxedlist),
[ObjectPropertiesValidation1BoxedMap](#objectpropertiesvalidation1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## ObjectPropertiesValidation1BoxedVoid
public static final class ObjectPropertiesValidation1BoxedVoid<br>
extends [ObjectPropertiesValidation1Boxed](#objectpropertiesvalidation1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectPropertiesValidation1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## ObjectPropertiesValidation1BoxedBoolean
public static final class ObjectPropertiesValidation1BoxedBoolean<br>
extends [ObjectPropertiesValidation1Boxed](#objectpropertiesvalidation1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectPropertiesValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## ObjectPropertiesValidation1BoxedNumber
public static final class ObjectPropertiesValidation1BoxedNumber<br>
extends [ObjectPropertiesValidation1Boxed](#objectpropertiesvalidation1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectPropertiesValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## ObjectPropertiesValidation1BoxedString
public static final class ObjectPropertiesValidation1BoxedString<br>
extends [ObjectPropertiesValidation1Boxed](#objectpropertiesvalidation1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectPropertiesValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## ObjectPropertiesValidation1BoxedList
public static final class ObjectPropertiesValidation1BoxedList<br>
extends [ObjectPropertiesValidation1Boxed](#objectpropertiesvalidation1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectPropertiesValidation1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## ObjectPropertiesValidation1BoxedMap
public static final class ObjectPropertiesValidation1BoxedMap<br>
extends [ObjectPropertiesValidation1Boxed](#objectpropertiesvalidation1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectPropertiesValidation1BoxedMap([ObjectPropertiesValidationMap](#objectpropertiesvalidationmap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [ObjectPropertiesValidationMap](#objectpropertiesvalidationmap) | data<br>validated payload |

## ObjectPropertiesValidation1
public static class ObjectPropertiesValidation1<br>
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
| [ObjectPropertiesValidationMap](#objectpropertiesvalidationmap) | validate([Map&lt;?, ?&gt;](#objectpropertiesvalidationmapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [ObjectPropertiesValidation1BoxedString](#objectpropertiesvalidation1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ObjectPropertiesValidation1BoxedVoid](#objectpropertiesvalidation1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [ObjectPropertiesValidation1BoxedNumber](#objectpropertiesvalidation1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ObjectPropertiesValidation1BoxedBoolean](#objectpropertiesvalidation1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [ObjectPropertiesValidation1BoxedMap](#objectpropertiesvalidation1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#objectpropertiesvalidationmapbuilder) arg, SchemaConfiguration configuration) |
| [ObjectPropertiesValidation1BoxedList](#objectpropertiesvalidation1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ObjectPropertiesValidationMapBuilder
public class ObjectPropertiesValidationMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectPropertiesValidationMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [ObjectPropertiesValidationMapBuilder](#objectpropertiesvalidationmapbuilder) | foo(int value) |
| [ObjectPropertiesValidationMapBuilder](#objectpropertiesvalidationmapbuilder) | foo(float value) |
| [ObjectPropertiesValidationMapBuilder](#objectpropertiesvalidationmapbuilder) | foo(long value) |
| [ObjectPropertiesValidationMapBuilder](#objectpropertiesvalidationmapbuilder) | foo(double value) |
| [ObjectPropertiesValidationMapBuilder](#objectpropertiesvalidationmapbuilder) | bar(String value) |
| [ObjectPropertiesValidationMapBuilder](#objectpropertiesvalidationmapbuilder) | additionalProperty(String key, Void value) |
| [ObjectPropertiesValidationMapBuilder](#objectpropertiesvalidationmapbuilder) | additionalProperty(String key, boolean value) |
| [ObjectPropertiesValidationMapBuilder](#objectpropertiesvalidationmapbuilder) | additionalProperty(String key, String value) |
| [ObjectPropertiesValidationMapBuilder](#objectpropertiesvalidationmapbuilder) | additionalProperty(String key, int value) |
| [ObjectPropertiesValidationMapBuilder](#objectpropertiesvalidationmapbuilder) | additionalProperty(String key, float value) |
| [ObjectPropertiesValidationMapBuilder](#objectpropertiesvalidationmapbuilder) | additionalProperty(String key, long value) |
| [ObjectPropertiesValidationMapBuilder](#objectpropertiesvalidationmapbuilder) | additionalProperty(String key, double value) |
| [ObjectPropertiesValidationMapBuilder](#objectpropertiesvalidationmapbuilder) | additionalProperty(String key, List<?> value) |
| [ObjectPropertiesValidationMapBuilder](#objectpropertiesvalidationmapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## ObjectPropertiesValidationMap
public static class ObjectPropertiesValidationMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectPropertiesValidationMap](#objectpropertiesvalidationmap) | of([Map<String, ? extends @Nullable Object>](#objectpropertiesvalidationmapbuilder) arg, SchemaConfiguration configuration) |
| Number | foo()<br>[optional] |
| String | bar()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## BarBoxed
public static abstract sealed class BarBoxed<br>
permits<br>
[BarBoxedString](#barboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## BarBoxedString
public static final class BarBoxedString<br>
extends [BarBoxed](#barboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BarBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Bar
public static class Bar<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## FooBoxed
public static abstract sealed class FooBoxed<br>
permits<br>
[FooBoxedNumber](#fooboxednumber)

abstract sealed class that stores validated payloads using boxed classes

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

## Foo
public static class Foo<br>
extends IntJsonSchema.IntJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.IntJsonSchema.IntJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

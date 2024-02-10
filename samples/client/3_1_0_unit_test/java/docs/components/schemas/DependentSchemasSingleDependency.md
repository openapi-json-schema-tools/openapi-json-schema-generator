# DependentSchemasSingleDependency
org.openapijsonschematools.client.components.schemas.DependentSchemasSingleDependency.java
public class DependentSchemasSingleDependency

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [DependentSchemasSingleDependency.DependentSchemasSingleDependency1Boxed](#dependentschemassingledependency1boxed)<br> abstract sealed validated payload class |
| static class | [DependentSchemasSingleDependency.DependentSchemasSingleDependency1BoxedVoid](#dependentschemassingledependency1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [DependentSchemasSingleDependency.DependentSchemasSingleDependency1BoxedBoolean](#dependentschemassingledependency1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [DependentSchemasSingleDependency.DependentSchemasSingleDependency1BoxedNumber](#dependentschemassingledependency1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [DependentSchemasSingleDependency.DependentSchemasSingleDependency1BoxedString](#dependentschemassingledependency1boxedstring)<br> boxed class to store validated String payloads |
| static class | [DependentSchemasSingleDependency.DependentSchemasSingleDependency1BoxedList](#dependentschemassingledependency1boxedlist)<br> boxed class to store validated List payloads |
| static class | [DependentSchemasSingleDependency.DependentSchemasSingleDependency1BoxedMap](#dependentschemassingledependency1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [DependentSchemasSingleDependency.DependentSchemasSingleDependency1](#dependentschemassingledependency1)<br> schema class |
| static class | [DependentSchemasSingleDependency.BarBoxed](#barboxed)<br> abstract sealed validated payload class |
| static class | [DependentSchemasSingleDependency.BarBoxedVoid](#barboxedvoid)<br> boxed class to store validated null payloads |
| static class | [DependentSchemasSingleDependency.BarBoxedBoolean](#barboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [DependentSchemasSingleDependency.BarBoxedNumber](#barboxednumber)<br> boxed class to store validated Number payloads |
| static class | [DependentSchemasSingleDependency.BarBoxedString](#barboxedstring)<br> boxed class to store validated String payloads |
| static class | [DependentSchemasSingleDependency.BarBoxedList](#barboxedlist)<br> boxed class to store validated List payloads |
| static class | [DependentSchemasSingleDependency.BarBoxedMap](#barboxedmap)<br> boxed class to store validated Map payloads |
| static class | [DependentSchemasSingleDependency.Bar](#bar)<br> schema class |
| static class | [DependentSchemasSingleDependency.BarMapBuilder1](#barmapbuilder1)<br> builder for Map payloads |
| static class | [DependentSchemasSingleDependency.BarMap](#barmap)<br> output class for Map payloads |
| static class | [DependentSchemasSingleDependency.Bar1Boxed](#bar1boxed)<br> abstract sealed validated payload class |
| static class | [DependentSchemasSingleDependency.Bar1BoxedNumber](#bar1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [DependentSchemasSingleDependency.Bar1](#bar1)<br> schema class |
| static class | [DependentSchemasSingleDependency.FooBoxed](#fooboxed)<br> abstract sealed validated payload class |
| static class | [DependentSchemasSingleDependency.FooBoxedNumber](#fooboxednumber)<br> boxed class to store validated Number payloads |
| static class | [DependentSchemasSingleDependency.Foo](#foo)<br> schema class |

## DependentSchemasSingleDependency1Boxed
public static abstract sealed class DependentSchemasSingleDependency1Boxed<br>
permits<br>
[DependentSchemasSingleDependency1BoxedVoid](#dependentschemassingledependency1boxedvoid),
[DependentSchemasSingleDependency1BoxedBoolean](#dependentschemassingledependency1boxedboolean),
[DependentSchemasSingleDependency1BoxedNumber](#dependentschemassingledependency1boxednumber),
[DependentSchemasSingleDependency1BoxedString](#dependentschemassingledependency1boxedstring),
[DependentSchemasSingleDependency1BoxedList](#dependentschemassingledependency1boxedlist),
[DependentSchemasSingleDependency1BoxedMap](#dependentschemassingledependency1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## DependentSchemasSingleDependency1BoxedVoid
public static final class DependentSchemasSingleDependency1BoxedVoid<br>
extends [DependentSchemasSingleDependency1Boxed](#dependentschemassingledependency1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasSingleDependency1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## DependentSchemasSingleDependency1BoxedBoolean
public static final class DependentSchemasSingleDependency1BoxedBoolean<br>
extends [DependentSchemasSingleDependency1Boxed](#dependentschemassingledependency1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasSingleDependency1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## DependentSchemasSingleDependency1BoxedNumber
public static final class DependentSchemasSingleDependency1BoxedNumber<br>
extends [DependentSchemasSingleDependency1Boxed](#dependentschemassingledependency1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasSingleDependency1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## DependentSchemasSingleDependency1BoxedString
public static final class DependentSchemasSingleDependency1BoxedString<br>
extends [DependentSchemasSingleDependency1Boxed](#dependentschemassingledependency1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasSingleDependency1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## DependentSchemasSingleDependency1BoxedList
public static final class DependentSchemasSingleDependency1BoxedList<br>
extends [DependentSchemasSingleDependency1Boxed](#dependentschemassingledependency1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasSingleDependency1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## DependentSchemasSingleDependency1BoxedMap
public static final class DependentSchemasSingleDependency1BoxedMap<br>
extends [DependentSchemasSingleDependency1Boxed](#dependentschemassingledependency1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasSingleDependency1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## DependentSchemasSingleDependency1
public static class DependentSchemasSingleDependency1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | dependentSchemas = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("bar", [Bar.class](#bar)))<br>)<br> |

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
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [DependentSchemasSingleDependency1BoxedString](#dependentschemassingledependency1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [DependentSchemasSingleDependency1BoxedVoid](#dependentschemassingledependency1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [DependentSchemasSingleDependency1BoxedNumber](#dependentschemassingledependency1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [DependentSchemasSingleDependency1BoxedBoolean](#dependentschemassingledependency1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [DependentSchemasSingleDependency1BoxedMap](#dependentschemassingledependency1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [DependentSchemasSingleDependency1BoxedList](#dependentschemassingledependency1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## BarBoxed
public static abstract sealed class BarBoxed<br>
permits<br>
[BarBoxedVoid](#barboxedvoid),
[BarBoxedBoolean](#barboxedboolean),
[BarBoxedNumber](#barboxednumber),
[BarBoxedString](#barboxedstring),
[BarBoxedList](#barboxedlist),
[BarBoxedMap](#barboxedmap)

abstract sealed class that stores validated payloads using boxed classes

## BarBoxedVoid
public static final class BarBoxedVoid<br>
extends [BarBoxed](#barboxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BarBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## BarBoxedBoolean
public static final class BarBoxedBoolean<br>
extends [BarBoxed](#barboxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BarBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## BarBoxedNumber
public static final class BarBoxedNumber<br>
extends [BarBoxed](#barboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BarBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

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

## BarBoxedList
public static final class BarBoxedList<br>
extends [BarBoxed](#barboxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BarBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## BarBoxedMap
public static final class BarBoxedMap<br>
extends [BarBoxed](#barboxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BarBoxedMap([BarMap](#barmap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [BarMap](#barmap) | data<br>validated payload |

## Bar
public static class Bar<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo", [Foo.class](#foo))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("bar", [Bar1.class](#bar1)))<br>)<br> |

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
| [BarMap](#barmap) | validate([Map&lt;?, ?&gt;](#barmapbuilder1) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [BarBoxedString](#barboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [BarBoxedVoid](#barboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [BarBoxedNumber](#barboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [BarBoxedBoolean](#barboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [BarBoxedMap](#barboxedmap) | validateAndBox([Map&lt;?, ?&gt;](#barmapbuilder1) arg, SchemaConfiguration configuration) |
| [BarBoxedList](#barboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## BarMapBuilder1
public class BarMapBuilder1<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BarMapBuilder1()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [BarMapBuilder1](#barmapbuilder1) | foo(int value) |
| [BarMapBuilder1](#barmapbuilder1) | foo(float value) |
| [BarMapBuilder1](#barmapbuilder1) | foo(long value) |
| [BarMapBuilder1](#barmapbuilder1) | foo(double value) |
| [BarMapBuilder1](#barmapbuilder1) | bar(int value) |
| [BarMapBuilder1](#barmapbuilder1) | bar(float value) |
| [BarMapBuilder1](#barmapbuilder1) | bar(long value) |
| [BarMapBuilder1](#barmapbuilder1) | bar(double value) |
| [BarMapBuilder1](#barmapbuilder1) | additionalProperty(String key, Void value) |
| [BarMapBuilder1](#barmapbuilder1) | additionalProperty(String key, boolean value) |
| [BarMapBuilder1](#barmapbuilder1) | additionalProperty(String key, String value) |
| [BarMapBuilder1](#barmapbuilder1) | additionalProperty(String key, int value) |
| [BarMapBuilder1](#barmapbuilder1) | additionalProperty(String key, float value) |
| [BarMapBuilder1](#barmapbuilder1) | additionalProperty(String key, long value) |
| [BarMapBuilder1](#barmapbuilder1) | additionalProperty(String key, double value) |
| [BarMapBuilder1](#barmapbuilder1) | additionalProperty(String key, List<?> value) |
| [BarMapBuilder1](#barmapbuilder1) | additionalProperty(String key, Map<String, ?> value) |

## BarMap
public static class BarMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [BarMap](#barmap) | of([Map<String, ? extends @Nullable Object>](#barmapbuilder1) arg, SchemaConfiguration configuration) |
| Number | foo()<br>[optional] |
| Number | bar()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Bar1Boxed
public static abstract sealed class Bar1Boxed<br>
permits<br>
[Bar1BoxedNumber](#bar1boxednumber)

abstract sealed class that stores validated payloads using boxed classes

## Bar1BoxedNumber
public static final class Bar1BoxedNumber<br>
extends [Bar1Boxed](#bar1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Bar1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Bar1
public static class Bar1<br>
extends IntJsonSchema.IntJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.IntJsonSchema.IntJsonSchema1 |
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

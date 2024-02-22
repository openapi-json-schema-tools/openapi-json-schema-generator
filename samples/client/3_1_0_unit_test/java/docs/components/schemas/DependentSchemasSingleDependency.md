# DependentSchemasSingleDependency
org.openapijsonschematools.client.components.schemas.DependentSchemasSingleDependency.java
public class DependentSchemasSingleDependency<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [DependentSchemasSingleDependency.DependentSchemasSingleDependency1Boxed](#dependentschemassingledependency1boxed)<br> sealed interface for validated payloads |
| record | [DependentSchemasSingleDependency.DependentSchemasSingleDependency1BoxedVoid](#dependentschemassingledependency1boxedvoid)<br> boxed class to store validated null payloads |
| record | [DependentSchemasSingleDependency.DependentSchemasSingleDependency1BoxedBoolean](#dependentschemassingledependency1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [DependentSchemasSingleDependency.DependentSchemasSingleDependency1BoxedNumber](#dependentschemassingledependency1boxednumber)<br> boxed class to store validated Number payloads |
| record | [DependentSchemasSingleDependency.DependentSchemasSingleDependency1BoxedString](#dependentschemassingledependency1boxedstring)<br> boxed class to store validated String payloads |
| record | [DependentSchemasSingleDependency.DependentSchemasSingleDependency1BoxedList](#dependentschemassingledependency1boxedlist)<br> boxed class to store validated List payloads |
| record | [DependentSchemasSingleDependency.DependentSchemasSingleDependency1BoxedMap](#dependentschemassingledependency1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [DependentSchemasSingleDependency.DependentSchemasSingleDependency1](#dependentschemassingledependency1)<br> schema class |
| sealed interface | [DependentSchemasSingleDependency.BarBoxed](#barboxed)<br> sealed interface for validated payloads |
| record | [DependentSchemasSingleDependency.BarBoxedVoid](#barboxedvoid)<br> boxed class to store validated null payloads |
| record | [DependentSchemasSingleDependency.BarBoxedBoolean](#barboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [DependentSchemasSingleDependency.BarBoxedNumber](#barboxednumber)<br> boxed class to store validated Number payloads |
| record | [DependentSchemasSingleDependency.BarBoxedString](#barboxedstring)<br> boxed class to store validated String payloads |
| record | [DependentSchemasSingleDependency.BarBoxedList](#barboxedlist)<br> boxed class to store validated List payloads |
| record | [DependentSchemasSingleDependency.BarBoxedMap](#barboxedmap)<br> boxed class to store validated Map payloads |
| static class | [DependentSchemasSingleDependency.Bar](#bar)<br> schema class |
| static class | [DependentSchemasSingleDependency.BarMapBuilder1](#barmapbuilder1)<br> builder for Map payloads |
| static class | [DependentSchemasSingleDependency.BarMap](#barmap)<br> output class for Map payloads |
| sealed interface | [DependentSchemasSingleDependency.Bar1Boxed](#bar1boxed)<br> sealed interface for validated payloads |
| record | [DependentSchemasSingleDependency.Bar1BoxedNumber](#bar1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [DependentSchemasSingleDependency.Bar1](#bar1)<br> schema class |
| sealed interface | [DependentSchemasSingleDependency.FooBoxed](#fooboxed)<br> sealed interface for validated payloads |
| record | [DependentSchemasSingleDependency.FooBoxedNumber](#fooboxednumber)<br> boxed class to store validated Number payloads |
| static class | [DependentSchemasSingleDependency.Foo](#foo)<br> schema class |

## DependentSchemasSingleDependency1Boxed
public sealed interface DependentSchemasSingleDependency1Boxed<br>
permits<br>
[DependentSchemasSingleDependency1BoxedVoid](#dependentschemassingledependency1boxedvoid),
[DependentSchemasSingleDependency1BoxedBoolean](#dependentschemassingledependency1boxedboolean),
[DependentSchemasSingleDependency1BoxedNumber](#dependentschemassingledependency1boxednumber),
[DependentSchemasSingleDependency1BoxedString](#dependentschemassingledependency1boxedstring),
[DependentSchemasSingleDependency1BoxedList](#dependentschemassingledependency1boxedlist),
[DependentSchemasSingleDependency1BoxedMap](#dependentschemassingledependency1boxedmap)

sealed interface that stores validated payloads using boxed classes

## DependentSchemasSingleDependency1BoxedVoid
public record DependentSchemasSingleDependency1BoxedVoid<br>
implements [DependentSchemasSingleDependency1Boxed](#dependentschemassingledependency1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasSingleDependency1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DependentSchemasSingleDependency1BoxedBoolean
public record DependentSchemasSingleDependency1BoxedBoolean<br>
implements [DependentSchemasSingleDependency1Boxed](#dependentschemassingledependency1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasSingleDependency1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DependentSchemasSingleDependency1BoxedNumber
public record DependentSchemasSingleDependency1BoxedNumber<br>
implements [DependentSchemasSingleDependency1Boxed](#dependentschemassingledependency1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasSingleDependency1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DependentSchemasSingleDependency1BoxedString
public record DependentSchemasSingleDependency1BoxedString<br>
implements [DependentSchemasSingleDependency1Boxed](#dependentschemassingledependency1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasSingleDependency1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DependentSchemasSingleDependency1BoxedList
public record DependentSchemasSingleDependency1BoxedList<br>
implements [DependentSchemasSingleDependency1Boxed](#dependentschemassingledependency1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasSingleDependency1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DependentSchemasSingleDependency1BoxedMap
public record DependentSchemasSingleDependency1BoxedMap<br>
implements [DependentSchemasSingleDependency1Boxed](#dependentschemassingledependency1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasSingleDependency1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
| [DependentSchemasSingleDependency1Boxed](#dependentschemassingledependency1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

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
| BarBoxedMap([BarMap](#barmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [BarMap](#barmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
| [BarBoxed](#barboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
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
public sealed interface Bar1Boxed<br>
permits<br>
[Bar1BoxedNumber](#bar1boxednumber)

sealed interface that stores validated payloads using boxed classes

## Bar1BoxedNumber
public record Bar1BoxedNumber<br>
implements [Bar1Boxed](#bar1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Bar1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Bar1
public static class Bar1<br>
extends IntJsonSchema.IntJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.IntJsonSchema.IntJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## FooBoxed
public sealed interface FooBoxed<br>
permits<br>
[FooBoxedNumber](#fooboxednumber)

sealed interface that stores validated payloads using boxed classes

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

## Foo
public static class Foo<br>
extends IntJsonSchema.IntJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.IntJsonSchema.IntJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

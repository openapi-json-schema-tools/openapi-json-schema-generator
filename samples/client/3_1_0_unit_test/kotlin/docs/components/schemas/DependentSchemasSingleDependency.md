# DependentSchemasSingleDependency
org.openapijsonschematools.client.components.schemas.DependentSchemasSingleDependency.java
class DependentSchemasSingleDependency<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
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
sealed interface DependentSchemasSingleDependency1Boxed<br>
permits<br>
[DependentSchemasSingleDependency1BoxedVoid](#dependentschemassingledependency1boxedvoid),
[DependentSchemasSingleDependency1BoxedBoolean](#dependentschemassingledependency1boxedboolean),
[DependentSchemasSingleDependency1BoxedNumber](#dependentschemassingledependency1boxednumber),
[DependentSchemasSingleDependency1BoxedString](#dependentschemassingledependency1boxedstring),
[DependentSchemasSingleDependency1BoxedList](#dependentschemassingledependency1boxedlist),
[DependentSchemasSingleDependency1BoxedMap](#dependentschemassingledependency1boxedmap)

sealed interface that stores validated payloads using boxed classes

## DependentSchemasSingleDependency1BoxedVoid
data class DependentSchemasSingleDependency1BoxedVoid<br>
implements [DependentSchemasSingleDependency1Boxed](#dependentschemassingledependency1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasSingleDependency1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## DependentSchemasSingleDependency1BoxedBoolean
data class DependentSchemasSingleDependency1BoxedBoolean<br>
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
| Any? | getData()<br>validated payload |

## DependentSchemasSingleDependency1BoxedNumber
data class DependentSchemasSingleDependency1BoxedNumber<br>
implements [DependentSchemasSingleDependency1Boxed](#dependentschemassingledependency1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasSingleDependency1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## DependentSchemasSingleDependency1BoxedString
data class DependentSchemasSingleDependency1BoxedString<br>
implements [DependentSchemasSingleDependency1Boxed](#dependentschemassingledependency1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasSingleDependency1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## DependentSchemasSingleDependency1BoxedList
data class DependentSchemasSingleDependency1BoxedList<br>
implements [DependentSchemasSingleDependency1Boxed](#dependentschemassingledependency1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasSingleDependency1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## DependentSchemasSingleDependency1BoxedMap
data class DependentSchemasSingleDependency1BoxedMap<br>
implements [DependentSchemasSingleDependency1Boxed](#dependentschemassingledependency1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasSingleDependency1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## DependentSchemasSingleDependency1
class DependentSchemasSingleDependency1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | dependentSchemas = mapOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;"bar" to [Bar::class.java](#bar))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(arg: String, configuration: SchemaConfiguration) |
| Nothing? | validate(arg: Nothing?, configuration: SchemaConfiguration) |
| int | validate(arg: int, configuration: SchemaConfiguration) |
| long | validate(arg: long, configuration: SchemaConfiguration) |
| float | validate(arg: float, configuration: SchemaConfiguration) |
| double | validate(arg: double, configuration: SchemaConfiguration) |
| Number | validate(arg: Number, configuration: SchemaConfiguration) |
| boolean | validate(arg: boolean, configuration: SchemaConfiguration) |
| FrozenMap<Any?> | validate(arg: Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [DependentSchemasSingleDependency1BoxedString](#dependentschemassingledependency1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [DependentSchemasSingleDependency1BoxedVoid](#dependentschemassingledependency1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [DependentSchemasSingleDependency1BoxedNumber](#dependentschemassingledependency1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [DependentSchemasSingleDependency1BoxedBoolean](#dependentschemassingledependency1boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [DependentSchemasSingleDependency1BoxedMap](#dependentschemassingledependency1boxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [DependentSchemasSingleDependency1BoxedList](#dependentschemassingledependency1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [DependentSchemasSingleDependency1Boxed](#dependentschemassingledependency1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## BarBoxed
sealed interface BarBoxed<br>
permits<br>
[BarBoxedVoid](#barboxedvoid),
[BarBoxedBoolean](#barboxedboolean),
[BarBoxedNumber](#barboxednumber),
[BarBoxedString](#barboxedstring),
[BarBoxedList](#barboxedlist),
[BarBoxedMap](#barboxedmap)

sealed interface that stores validated payloads using boxed classes

## BarBoxedVoid
data class BarBoxedVoid<br>
implements [BarBoxed](#barboxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BarBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## BarBoxedBoolean
data class BarBoxedBoolean<br>
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
| Any? | getData()<br>validated payload |

## BarBoxedNumber
data class BarBoxedNumber<br>
implements [BarBoxed](#barboxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BarBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## BarBoxedString
data class BarBoxedString<br>
implements [BarBoxed](#barboxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BarBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## BarBoxedList
data class BarBoxedList<br>
implements [BarBoxed](#barboxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BarBoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## BarBoxedMap
data class BarBoxedMap<br>
implements [BarBoxed](#barboxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BarBoxedMap([BarMap](#barmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [BarMap](#barmap) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Bar
class Bar<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = mapOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo" to [Foo::class.java](#foo)),<br>&nbsp;&nbsp;&nbsp;&nbsp;"bar" to [Bar1::class.java](#bar1))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(arg: String, configuration: SchemaConfiguration) |
| Nothing? | validate(arg: Nothing?, configuration: SchemaConfiguration) |
| int | validate(arg: int, configuration: SchemaConfiguration) |
| long | validate(arg: long, configuration: SchemaConfiguration) |
| float | validate(arg: float, configuration: SchemaConfiguration) |
| double | validate(arg: double, configuration: SchemaConfiguration) |
| Number | validate(arg: Number, configuration: SchemaConfiguration) |
| boolean | validate(arg: boolean, configuration: SchemaConfiguration) |
| [BarMap](#barmap) | validate(arg: [Map&lt;?, ?&gt;](#barmapbuilder1), configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [BarBoxedString](#barboxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [BarBoxedVoid](#barboxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [BarBoxedNumber](#barboxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [BarBoxedBoolean](#barboxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [BarBoxedMap](#barboxedmap) | validateAndBox([Map&lt;?, ?&gt;](#barmapbuilder1), configuration: SchemaConfiguration) |
| [BarBoxedList](#barboxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [BarBoxed](#barboxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## BarMapBuilder1
class BarMapBuilder1<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BarMapBuilder1()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Any?> | build()<br>Returns map input that should be used with Schema.validate |
| [BarMapBuilder1](#barmapbuilder1) | foo(value: Int) |
| [BarMapBuilder1](#barmapbuilder1) | foo(value: Float) |
| [BarMapBuilder1](#barmapbuilder1) | foo(value: Long) |
| [BarMapBuilder1](#barmapbuilder1) | foo(value: Double) |
| [BarMapBuilder1](#barmapbuilder1) | bar(value: Int) |
| [BarMapBuilder1](#barmapbuilder1) | bar(value: Float) |
| [BarMapBuilder1](#barmapbuilder1) | bar(value: Long) |
| [BarMapBuilder1](#barmapbuilder1) | bar(value: Double) |
| [BarMapBuilder1](#barmapbuilder1) | additionalProperty(key: String, value: Nothing?) |
| [BarMapBuilder1](#barmapbuilder1) | additionalProperty(key: String, value: Boolean) |
| [BarMapBuilder1](#barmapbuilder1) | additionalProperty(key: String, value: String) |
| [BarMapBuilder1](#barmapbuilder1) | additionalProperty(key: String, value: Int) |
| [BarMapBuilder1](#barmapbuilder1) | additionalProperty(key: String, value: Float) |
| [BarMapBuilder1](#barmapbuilder1) | additionalProperty(key: String, value: Long) |
| [BarMapBuilder1](#barmapbuilder1) | additionalProperty(key: String, value: Double) |
| [BarMapBuilder1](#barmapbuilder1) | additionalProperty(key: String, value: List<Any?>) |
| [BarMapBuilder1](#barmapbuilder1) | additionalProperty(key: String, value: Map<String, Any?>) |

## BarMap
class BarMap<br>
extends FrozenMap<String, Any?>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [BarMap](#barmap) | of([Map<String, Any?>](#barmapbuilder1) arg, SchemaConfiguration configuration) |
| Number | foo()<br>[optional] |
| Number | bar()<br>[optional] |
| Any? | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Bar1Boxed
sealed interface Bar1Boxed<br>
permits<br>
[Bar1BoxedNumber](#bar1boxednumber)

sealed interface that stores validated payloads using boxed classes

## Bar1BoxedNumber
data class Bar1BoxedNumber<br>
implements [Bar1Boxed](#bar1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Bar1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Bar1
class Bar1<br>
extends IntJsonSchema.IntJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.IntJsonSchema.IntJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## FooBoxed
sealed interface FooBoxed<br>
permits<br>
[FooBoxedNumber](#fooboxednumber)

sealed interface that stores validated payloads using boxed classes

## FooBoxedNumber
data class FooBoxedNumber<br>
implements [FooBoxed](#fooboxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Foo
class Foo<br>
extends IntJsonSchema.IntJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.IntJsonSchema.IntJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

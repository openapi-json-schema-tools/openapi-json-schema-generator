# ForbiddenProperty
org.openapijsonschematools.client.components.schemas.ForbiddenProperty.java
class ForbiddenProperty<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
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
| sealed interface | [ForbiddenProperty.NotBoxed](#notboxed)<br> sealed interface for validated payloads |
| record | [ForbiddenProperty.NotBoxedVoid](#notboxedvoid)<br> boxed class to store validated null payloads |
| record | [ForbiddenProperty.NotBoxedBoolean](#notboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [ForbiddenProperty.NotBoxedNumber](#notboxednumber)<br> boxed class to store validated Number payloads |
| record | [ForbiddenProperty.NotBoxedString](#notboxedstring)<br> boxed class to store validated String payloads |
| record | [ForbiddenProperty.NotBoxedList](#notboxedlist)<br> boxed class to store validated List payloads |
| record | [ForbiddenProperty.NotBoxedMap](#notboxedmap)<br> boxed class to store validated Map payloads |
| static class | [ForbiddenProperty.Not](#not)<br> schema class |

## ForbiddenProperty1Boxed
sealed interface ForbiddenProperty1Boxed<br>
permits<br>
[ForbiddenProperty1BoxedVoid](#forbiddenproperty1boxedvoid),
[ForbiddenProperty1BoxedBoolean](#forbiddenproperty1boxedboolean),
[ForbiddenProperty1BoxedNumber](#forbiddenproperty1boxednumber),
[ForbiddenProperty1BoxedString](#forbiddenproperty1boxedstring),
[ForbiddenProperty1BoxedList](#forbiddenproperty1boxedlist),
[ForbiddenProperty1BoxedMap](#forbiddenproperty1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ForbiddenProperty1BoxedVoid
data class ForbiddenProperty1BoxedVoid<br>
implements [ForbiddenProperty1Boxed](#forbiddenproperty1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ForbiddenProperty1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ForbiddenProperty1BoxedBoolean
data class ForbiddenProperty1BoxedBoolean<br>
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
| Any? | getData()<br>validated payload |

## ForbiddenProperty1BoxedNumber
data class ForbiddenProperty1BoxedNumber<br>
implements [ForbiddenProperty1Boxed](#forbiddenproperty1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ForbiddenProperty1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ForbiddenProperty1BoxedString
data class ForbiddenProperty1BoxedString<br>
implements [ForbiddenProperty1Boxed](#forbiddenproperty1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ForbiddenProperty1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ForbiddenProperty1BoxedList
data class ForbiddenProperty1BoxedList<br>
implements [ForbiddenProperty1Boxed](#forbiddenproperty1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ForbiddenProperty1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ForbiddenProperty1BoxedMap
data class ForbiddenProperty1BoxedMap<br>
implements [ForbiddenProperty1Boxed](#forbiddenproperty1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ForbiddenProperty1BoxedMap([ForbiddenPropertyMap](#forbiddenpropertymap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ForbiddenPropertyMap](#forbiddenpropertymap) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ForbiddenProperty1
class ForbiddenProperty1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = mapOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo" to [Foo::class.java](#foo))<br>)<br> |

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
| [ForbiddenPropertyMap](#forbiddenpropertymap) | validate(arg: [Map&lt;?, ?&gt;](#forbiddenpropertymapbuilder), configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [ForbiddenProperty1BoxedString](#forbiddenproperty1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [ForbiddenProperty1BoxedVoid](#forbiddenproperty1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [ForbiddenProperty1BoxedNumber](#forbiddenproperty1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [ForbiddenProperty1BoxedBoolean](#forbiddenproperty1boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [ForbiddenProperty1BoxedMap](#forbiddenproperty1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#forbiddenpropertymapbuilder), configuration: SchemaConfiguration) |
| [ForbiddenProperty1BoxedList](#forbiddenproperty1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [ForbiddenProperty1Boxed](#forbiddenproperty1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## ForbiddenPropertyMapBuilder
class ForbiddenPropertyMapBuilder<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ForbiddenPropertyMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Any?> | build()<br>Returns map input that should be used with Schema.validate |
| [ForbiddenPropertyMapBuilder](#forbiddenpropertymapbuilder) | foo(value: Nothing?) |
| [ForbiddenPropertyMapBuilder](#forbiddenpropertymapbuilder) | foo(value: Boolean) |
| [ForbiddenPropertyMapBuilder](#forbiddenpropertymapbuilder) | foo(value: String) |
| [ForbiddenPropertyMapBuilder](#forbiddenpropertymapbuilder) | foo(value: Int) |
| [ForbiddenPropertyMapBuilder](#forbiddenpropertymapbuilder) | foo(value: Float) |
| [ForbiddenPropertyMapBuilder](#forbiddenpropertymapbuilder) | foo(value: Long) |
| [ForbiddenPropertyMapBuilder](#forbiddenpropertymapbuilder) | foo(value: Double) |
| [ForbiddenPropertyMapBuilder](#forbiddenpropertymapbuilder) | foo(value: List<Any?>) |
| [ForbiddenPropertyMapBuilder](#forbiddenpropertymapbuilder) | foo(value: Map<String, Any?>) |
| [ForbiddenPropertyMapBuilder](#forbiddenpropertymapbuilder) | additionalProperty(key: String, value: Nothing?) |
| [ForbiddenPropertyMapBuilder](#forbiddenpropertymapbuilder) | additionalProperty(key: String, value: Boolean) |
| [ForbiddenPropertyMapBuilder](#forbiddenpropertymapbuilder) | additionalProperty(key: String, value: String) |
| [ForbiddenPropertyMapBuilder](#forbiddenpropertymapbuilder) | additionalProperty(key: String, value: Int) |
| [ForbiddenPropertyMapBuilder](#forbiddenpropertymapbuilder) | additionalProperty(key: String, value: Float) |
| [ForbiddenPropertyMapBuilder](#forbiddenpropertymapbuilder) | additionalProperty(key: String, value: Long) |
| [ForbiddenPropertyMapBuilder](#forbiddenpropertymapbuilder) | additionalProperty(key: String, value: Double) |
| [ForbiddenPropertyMapBuilder](#forbiddenpropertymapbuilder) | additionalProperty(key: String, value: List<Any?>) |
| [ForbiddenPropertyMapBuilder](#forbiddenpropertymapbuilder) | additionalProperty(key: String, value: Map<String, Any?>) |

## ForbiddenPropertyMap
class ForbiddenPropertyMap<br>
extends FrozenMap<String, Any?>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ForbiddenPropertyMap](#forbiddenpropertymap) | of([Map<String, Any?>](#forbiddenpropertymapbuilder) arg, SchemaConfiguration configuration) |
| Any? | foo()<br>[optional] |
| Any? | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## FooBoxed
sealed interface FooBoxed<br>
permits<br>
[FooBoxedVoid](#fooboxedvoid),
[FooBoxedBoolean](#fooboxedboolean),
[FooBoxedNumber](#fooboxednumber),
[FooBoxedString](#fooboxedstring),
[FooBoxedList](#fooboxedlist),
[FooBoxedMap](#fooboxedmap)

sealed interface that stores validated payloads using boxed classes

## FooBoxedVoid
data class FooBoxedVoid<br>
implements [FooBoxed](#fooboxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## FooBoxedBoolean
data class FooBoxedBoolean<br>
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
| Any? | getData()<br>validated payload |

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

## FooBoxedString
data class FooBoxedString<br>
implements [FooBoxed](#fooboxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## FooBoxedList
data class FooBoxedList<br>
implements [FooBoxed](#fooboxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooBoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## FooBoxedMap
data class FooBoxedMap<br>
implements [FooBoxed](#fooboxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooBoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Foo
class Foo<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | not = [Not::class.java](#not) |

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
| [FooBoxedString](#fooboxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [FooBoxedVoid](#fooboxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [FooBoxedNumber](#fooboxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [FooBoxedBoolean](#fooboxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [FooBoxedMap](#fooboxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [FooBoxedList](#fooboxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [FooBoxed](#fooboxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## NotBoxed
sealed interface NotBoxed<br>
permits<br>
[NotBoxedVoid](#notboxedvoid),
[NotBoxedBoolean](#notboxedboolean),
[NotBoxedNumber](#notboxednumber),
[NotBoxedString](#notboxedstring),
[NotBoxedList](#notboxedlist),
[NotBoxedMap](#notboxedmap)

sealed interface that stores validated payloads using boxed classes

## NotBoxedVoid
data class NotBoxedVoid<br>
implements [NotBoxed](#notboxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NotBoxedBoolean
data class NotBoxedBoolean<br>
implements [NotBoxed](#notboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NotBoxedNumber
data class NotBoxedNumber<br>
implements [NotBoxed](#notboxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NotBoxedString
data class NotBoxedString<br>
implements [NotBoxed](#notboxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NotBoxedList
data class NotBoxedList<br>
implements [NotBoxed](#notboxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotBoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NotBoxedMap
data class NotBoxedMap<br>
implements [NotBoxed](#notboxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotBoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Not
class Not<br>
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

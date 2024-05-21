# Allof
org.openapijsonschematools.client.components.schemas.Allof.java
class Allof<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Allof.Allof1Boxed](#allof1boxed)<br> sealed interface for validated payloads |
| data class | [Allof.Allof1BoxedVoid](#allof1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [Allof.Allof1BoxedBoolean](#allof1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [Allof.Allof1BoxedNumber](#allof1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [Allof.Allof1BoxedString](#allof1boxedstring)<br> boxed class to store validated String payloads |
| data class | [Allof.Allof1BoxedList](#allof1boxedlist)<br> boxed class to store validated List payloads |
| data class | [Allof.Allof1BoxedMap](#allof1boxedmap)<br> boxed class to store validated Map payloads |
| class | [Allof.Allof1](#allof1)<br> schema class |
| sealed interface | [Allof.Schema1Boxed](#schema1boxed)<br> sealed interface for validated payloads |
| data class | [Allof.Schema1BoxedVoid](#schema1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [Allof.Schema1BoxedBoolean](#schema1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [Allof.Schema1BoxedNumber](#schema1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [Allof.Schema1BoxedString](#schema1boxedstring)<br> boxed class to store validated String payloads |
| data class | [Allof.Schema1BoxedList](#schema1boxedlist)<br> boxed class to store validated List payloads |
| data class | [Allof.Schema1BoxedMap](#schema1boxedmap)<br> boxed class to store validated Map payloads |
| class | [Allof.Schema1](#schema1)<br> schema class |
| class | [Allof.Schema1MapBuilder](#schema1mapbuilder)<br> builder for Map payloads |
| class | [Allof.Schema1Map](#schema1map)<br> output class for Map payloads |
| sealed interface | [Allof.FooBoxed](#fooboxed)<br> sealed interface for validated payloads |
| data class | [Allof.FooBoxedString](#fooboxedstring)<br> boxed class to store validated String payloads |
| class | [Allof.Foo](#foo)<br> schema class |
| sealed interface | [Allof.Schema0Boxed](#schema0boxed)<br> sealed interface for validated payloads |
| data class | [Allof.Schema0BoxedVoid](#schema0boxedvoid)<br> boxed class to store validated null payloads |
| data class | [Allof.Schema0BoxedBoolean](#schema0boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [Allof.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| data class | [Allof.Schema0BoxedString](#schema0boxedstring)<br> boxed class to store validated String payloads |
| data class | [Allof.Schema0BoxedList](#schema0boxedlist)<br> boxed class to store validated List payloads |
| data class | [Allof.Schema0BoxedMap](#schema0boxedmap)<br> boxed class to store validated Map payloads |
| class | [Allof.Schema0](#schema0)<br> schema class |
| class | [Allof.Schema0MapBuilder](#schema0mapbuilder)<br> builder for Map payloads |
| class | [Allof.Schema0Map](#schema0map)<br> output class for Map payloads |
| sealed interface | [Allof.BarBoxed](#barboxed)<br> sealed interface for validated payloads |
| data class | [Allof.BarBoxedNumber](#barboxednumber)<br> boxed class to store validated Number payloads |
| class | [Allof.Bar](#bar)<br> schema class |

## Allof1Boxed
sealed interface Allof1Boxed<br>
permits<br>
[Allof1BoxedVoid](#allof1boxedvoid),
[Allof1BoxedBoolean](#allof1boxedboolean),
[Allof1BoxedNumber](#allof1boxednumber),
[Allof1BoxedString](#allof1boxedstring),
[Allof1BoxedList](#allof1boxedlist),
[Allof1BoxedMap](#allof1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Allof1BoxedVoid
data class Allof1BoxedVoid<br>
implements [Allof1Boxed](#allof1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Allof1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Allof1BoxedBoolean
data class Allof1BoxedBoolean<br>
implements [Allof1Boxed](#allof1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Allof1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Allof1BoxedNumber
data class Allof1BoxedNumber<br>
implements [Allof1Boxed](#allof1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Allof1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Allof1BoxedString
data class Allof1BoxedString<br>
implements [Allof1Boxed](#allof1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Allof1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Allof1BoxedList
data class Allof1BoxedList<br>
implements [Allof1Boxed](#allof1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Allof1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Allof1BoxedMap
data class Allof1BoxedMap<br>
implements [Allof1Boxed](#allof1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Allof1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Allof1
class Allof1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | allOf = listOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema0::class.java](#schema0),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema1::class.java](#schema1)<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(arg: String, configuration: SchemaConfiguration) |
| Nothing? | validate(arg: Nothing?, configuration: SchemaConfiguration) |
| Int | validate(arg: Int, configuration: SchemaConfiguration) |
| Long | validate(arg: Long, configuration: SchemaConfiguration) |
| Float | validate(arg: Float, configuration: SchemaConfiguration) |
| Double | validate(arg: Double, configuration: SchemaConfiguration) |
| Number | validate(arg: Number, configuration: SchemaConfiguration) |
| Boolean | validate(arg: Boolean, configuration: SchemaConfiguration) |
| FrozenMap<Any?> | validate(arg: Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [Allof1BoxedString](#allof1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [Allof1BoxedVoid](#allof1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [Allof1BoxedNumber](#allof1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [Allof1BoxedBoolean](#allof1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [Allof1BoxedMap](#allof1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [Allof1BoxedList](#allof1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [Allof1Boxed](#allof1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## Schema1Boxed
sealed interface Schema1Boxed<br>
permits<br>
[Schema1BoxedVoid](#schema1boxedvoid),
[Schema1BoxedBoolean](#schema1boxedboolean),
[Schema1BoxedNumber](#schema1boxednumber),
[Schema1BoxedString](#schema1boxedstring),
[Schema1BoxedList](#schema1boxedlist),
[Schema1BoxedMap](#schema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Schema1BoxedVoid
data class Schema1BoxedVoid<br>
implements [Schema1Boxed](#schema1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema1BoxedBoolean
data class Schema1BoxedBoolean<br>
implements [Schema1Boxed](#schema1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema1BoxedNumber
data class Schema1BoxedNumber<br>
implements [Schema1Boxed](#schema1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema1BoxedString
data class Schema1BoxedString<br>
implements [Schema1Boxed](#schema1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema1BoxedList
data class Schema1BoxedList<br>
implements [Schema1Boxed](#schema1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema1BoxedMap
data class Schema1BoxedMap<br>
implements [Schema1Boxed](#schema1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedMap([Schema1Map](#schema1map) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Schema1Map](#schema1map) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema1
class Schema1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = mapOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo" to [Foo::class.java](#foo))<br>)<br> |
| Set<String> | required = setOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(arg: String, configuration: SchemaConfiguration) |
| Nothing? | validate(arg: Nothing?, configuration: SchemaConfiguration) |
| Int | validate(arg: Int, configuration: SchemaConfiguration) |
| Long | validate(arg: Long, configuration: SchemaConfiguration) |
| Float | validate(arg: Float, configuration: SchemaConfiguration) |
| Double | validate(arg: Double, configuration: SchemaConfiguration) |
| Number | validate(arg: Number, configuration: SchemaConfiguration) |
| Boolean | validate(arg: Boolean, configuration: SchemaConfiguration) |
| [Schema1Map](#schema1map) | validate(arg: [Map&lt;*, *&gt;](#schema1mapbuilder), configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [Schema1BoxedString](#schema1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [Schema1BoxedVoid](#schema1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [Schema1BoxedNumber](#schema1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [Schema1BoxedBoolean](#schema1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [Schema1BoxedMap](#schema1boxedmap) | validateAndBox([Map&lt;*, *&gt;](#schema1mapbuilder), configuration: SchemaConfiguration) |
| [Schema1BoxedList](#schema1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [Schema1Boxed](#schema1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## Schema1Map0Builder
class Schema1Map0Builder<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1Map0Builder(Map<String, Any?> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Any?> | build()<br>Returns map input that should be used with Schema.validate |
| [Schema1Map0Builder](#schema1map0builder) | additionalProperty(key: String, value: Nothing?) |
| [Schema1Map0Builder](#schema1map0builder) | additionalProperty(key: String, value: Boolean) |
| [Schema1Map0Builder](#schema1map0builder) | additionalProperty(key: String, value: String) |
| [Schema1Map0Builder](#schema1map0builder) | additionalProperty(key: String, value: Int) |
| [Schema1Map0Builder](#schema1map0builder) | additionalProperty(key: String, value: Float) |
| [Schema1Map0Builder](#schema1map0builder) | additionalProperty(key: String, value: Long) |
| [Schema1Map0Builder](#schema1map0builder) | additionalProperty(key: String, value: Double) |
| [Schema1Map0Builder](#schema1map0builder) | additionalProperty(key: String, value: List<Any?>) |
| [Schema1Map0Builder](#schema1map0builder) | additionalProperty(key: String, value: Map<String, Any?>) |

## Schema1MapBuilder
class Schema1MapBuilder<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1MapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Schema1Map0Builder](#schema1map0builder) | foo(value: String) |

## Schema1Map
class Schema1Map<br>
extends FrozenMap<String, Any?>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Schema1Map](#schema1map) | of([Map<String, Any?>](#schema1mapbuilder) arg, SchemaConfiguration configuration) |
| String | foo()<br> |
| Any? | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## FooBoxed
sealed interface FooBoxed<br>
permits<br>
[FooBoxedString](#fooboxedstring)

sealed interface that stores validated payloads using boxed classes

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

## Foo
class Foo<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema0Boxed
sealed interface Schema0Boxed<br>
permits<br>
[Schema0BoxedVoid](#schema0boxedvoid),
[Schema0BoxedBoolean](#schema0boxedboolean),
[Schema0BoxedNumber](#schema0boxednumber),
[Schema0BoxedString](#schema0boxedstring),
[Schema0BoxedList](#schema0boxedlist),
[Schema0BoxedMap](#schema0boxedmap)

sealed interface that stores validated payloads using boxed classes

## Schema0BoxedVoid
data class Schema0BoxedVoid<br>
implements [Schema0Boxed](#schema0boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema0BoxedBoolean
data class Schema0BoxedBoolean<br>
implements [Schema0Boxed](#schema0boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema0BoxedNumber
data class Schema0BoxedNumber<br>
implements [Schema0Boxed](#schema0boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema0BoxedString
data class Schema0BoxedString<br>
implements [Schema0Boxed](#schema0boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema0BoxedList
data class Schema0BoxedList<br>
implements [Schema0Boxed](#schema0boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema0BoxedMap
data class Schema0BoxedMap<br>
implements [Schema0Boxed](#schema0boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedMap([Schema0Map](#schema0map) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Schema0Map](#schema0map) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema0
class Schema0<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = mapOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;"bar" to [Bar::class.java](#bar))<br>)<br> |
| Set<String> | required = setOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;"bar"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(arg: String, configuration: SchemaConfiguration) |
| Nothing? | validate(arg: Nothing?, configuration: SchemaConfiguration) |
| Int | validate(arg: Int, configuration: SchemaConfiguration) |
| Long | validate(arg: Long, configuration: SchemaConfiguration) |
| Float | validate(arg: Float, configuration: SchemaConfiguration) |
| Double | validate(arg: Double, configuration: SchemaConfiguration) |
| Number | validate(arg: Number, configuration: SchemaConfiguration) |
| Boolean | validate(arg: Boolean, configuration: SchemaConfiguration) |
| [Schema0Map](#schema0map) | validate(arg: [Map&lt;*, *&gt;](#schema0mapbuilder), configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [Schema0BoxedString](#schema0boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [Schema0BoxedVoid](#schema0boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [Schema0BoxedNumber](#schema0boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [Schema0BoxedBoolean](#schema0boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [Schema0BoxedMap](#schema0boxedmap) | validateAndBox([Map&lt;*, *&gt;](#schema0mapbuilder), configuration: SchemaConfiguration) |
| [Schema0BoxedList](#schema0boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [Schema0Boxed](#schema0boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## Schema0Map0Builder
class Schema0Map0Builder<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0Map0Builder(Map<String, Any?> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Any?> | build()<br>Returns map input that should be used with Schema.validate |
| [Schema0Map0Builder](#schema0map0builder) | additionalProperty(key: String, value: Nothing?) |
| [Schema0Map0Builder](#schema0map0builder) | additionalProperty(key: String, value: Boolean) |
| [Schema0Map0Builder](#schema0map0builder) | additionalProperty(key: String, value: String) |
| [Schema0Map0Builder](#schema0map0builder) | additionalProperty(key: String, value: Int) |
| [Schema0Map0Builder](#schema0map0builder) | additionalProperty(key: String, value: Float) |
| [Schema0Map0Builder](#schema0map0builder) | additionalProperty(key: String, value: Long) |
| [Schema0Map0Builder](#schema0map0builder) | additionalProperty(key: String, value: Double) |
| [Schema0Map0Builder](#schema0map0builder) | additionalProperty(key: String, value: List<Any?>) |
| [Schema0Map0Builder](#schema0map0builder) | additionalProperty(key: String, value: Map<String, Any?>) |

## Schema0MapBuilder
class Schema0MapBuilder<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0MapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Schema0Map0Builder](#schema0map0builder) | bar(value: Int) |
| [Schema0Map0Builder](#schema0map0builder) | bar(value: Float) |
| [Schema0Map0Builder](#schema0map0builder) | bar(value: Long) |
| [Schema0Map0Builder](#schema0map0builder) | bar(value: Double) |

## Schema0Map
class Schema0Map<br>
extends FrozenMap<String, Any?>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Schema0Map](#schema0map) | of([Map<String, Any?>](#schema0mapbuilder) arg, SchemaConfiguration configuration) |
| Number | bar()<br> |
| Any? | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## BarBoxed
sealed interface BarBoxed<br>
permits<br>
[BarBoxedNumber](#barboxednumber)

sealed interface that stores validated payloads using boxed classes

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

## Bar
class Bar<br>
extends IntJsonSchema.IntJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.IntJsonSchema.IntJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

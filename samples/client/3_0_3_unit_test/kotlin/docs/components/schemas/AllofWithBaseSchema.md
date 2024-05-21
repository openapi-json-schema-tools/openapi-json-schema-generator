# AllofWithBaseSchema
org.openapijsonschematools.client.components.schemas.AllofWithBaseSchema.java
class AllofWithBaseSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [AllofWithBaseSchema.AllofWithBaseSchema1Boxed](#allofwithbaseschema1boxed)<br> sealed interface for validated payloads |
| data class | [AllofWithBaseSchema.AllofWithBaseSchema1BoxedVoid](#allofwithbaseschema1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [AllofWithBaseSchema.AllofWithBaseSchema1BoxedBoolean](#allofwithbaseschema1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [AllofWithBaseSchema.AllofWithBaseSchema1BoxedNumber](#allofwithbaseschema1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [AllofWithBaseSchema.AllofWithBaseSchema1BoxedString](#allofwithbaseschema1boxedstring)<br> boxed class to store validated String payloads |
| data class | [AllofWithBaseSchema.AllofWithBaseSchema1BoxedList](#allofwithbaseschema1boxedlist)<br> boxed class to store validated List payloads |
| data class | [AllofWithBaseSchema.AllofWithBaseSchema1BoxedMap](#allofwithbaseschema1boxedmap)<br> boxed class to store validated Map payloads |
| class | [AllofWithBaseSchema.AllofWithBaseSchema1](#allofwithbaseschema1)<br> schema class |
| class | [AllofWithBaseSchema.AllofWithBaseSchemaMapBuilder](#allofwithbaseschemamapbuilder)<br> builder for Map payloads |
| class | [AllofWithBaseSchema.AllofWithBaseSchemaMap](#allofwithbaseschemamap)<br> output class for Map payloads |
| sealed interface | [AllofWithBaseSchema.BarBoxed](#barboxed)<br> sealed interface for validated payloads |
| data class | [AllofWithBaseSchema.BarBoxedNumber](#barboxednumber)<br> boxed class to store validated Number payloads |
| class | [AllofWithBaseSchema.Bar](#bar)<br> schema class |
| sealed interface | [AllofWithBaseSchema.Schema1Boxed](#schema1boxed)<br> sealed interface for validated payloads |
| data class | [AllofWithBaseSchema.Schema1BoxedVoid](#schema1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [AllofWithBaseSchema.Schema1BoxedBoolean](#schema1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [AllofWithBaseSchema.Schema1BoxedNumber](#schema1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [AllofWithBaseSchema.Schema1BoxedString](#schema1boxedstring)<br> boxed class to store validated String payloads |
| data class | [AllofWithBaseSchema.Schema1BoxedList](#schema1boxedlist)<br> boxed class to store validated List payloads |
| data class | [AllofWithBaseSchema.Schema1BoxedMap](#schema1boxedmap)<br> boxed class to store validated Map payloads |
| class | [AllofWithBaseSchema.Schema1](#schema1)<br> schema class |
| class | [AllofWithBaseSchema.Schema1MapBuilder](#schema1mapbuilder)<br> builder for Map payloads |
| class | [AllofWithBaseSchema.Schema1Map](#schema1map)<br> output class for Map payloads |
| sealed interface | [AllofWithBaseSchema.BazBoxed](#bazboxed)<br> sealed interface for validated payloads |
| data class | [AllofWithBaseSchema.BazBoxedVoid](#bazboxedvoid)<br> boxed class to store validated null payloads |
| class | [AllofWithBaseSchema.Baz](#baz)<br> schema class |
| sealed interface | [AllofWithBaseSchema.Schema0Boxed](#schema0boxed)<br> sealed interface for validated payloads |
| data class | [AllofWithBaseSchema.Schema0BoxedVoid](#schema0boxedvoid)<br> boxed class to store validated null payloads |
| data class | [AllofWithBaseSchema.Schema0BoxedBoolean](#schema0boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [AllofWithBaseSchema.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| data class | [AllofWithBaseSchema.Schema0BoxedString](#schema0boxedstring)<br> boxed class to store validated String payloads |
| data class | [AllofWithBaseSchema.Schema0BoxedList](#schema0boxedlist)<br> boxed class to store validated List payloads |
| data class | [AllofWithBaseSchema.Schema0BoxedMap](#schema0boxedmap)<br> boxed class to store validated Map payloads |
| class | [AllofWithBaseSchema.Schema0](#schema0)<br> schema class |
| class | [AllofWithBaseSchema.Schema0MapBuilder](#schema0mapbuilder)<br> builder for Map payloads |
| class | [AllofWithBaseSchema.Schema0Map](#schema0map)<br> output class for Map payloads |
| sealed interface | [AllofWithBaseSchema.FooBoxed](#fooboxed)<br> sealed interface for validated payloads |
| data class | [AllofWithBaseSchema.FooBoxedString](#fooboxedstring)<br> boxed class to store validated String payloads |
| class | [AllofWithBaseSchema.Foo](#foo)<br> schema class |

## AllofWithBaseSchema1Boxed
sealed interface AllofWithBaseSchema1Boxed<br>
permits<br>
[AllofWithBaseSchema1BoxedVoid](#allofwithbaseschema1boxedvoid),
[AllofWithBaseSchema1BoxedBoolean](#allofwithbaseschema1boxedboolean),
[AllofWithBaseSchema1BoxedNumber](#allofwithbaseschema1boxednumber),
[AllofWithBaseSchema1BoxedString](#allofwithbaseschema1boxedstring),
[AllofWithBaseSchema1BoxedList](#allofwithbaseschema1boxedlist),
[AllofWithBaseSchema1BoxedMap](#allofwithbaseschema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## AllofWithBaseSchema1BoxedVoid
data class AllofWithBaseSchema1BoxedVoid<br>
implements [AllofWithBaseSchema1Boxed](#allofwithbaseschema1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithBaseSchema1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AllofWithBaseSchema1BoxedBoolean
data class AllofWithBaseSchema1BoxedBoolean<br>
implements [AllofWithBaseSchema1Boxed](#allofwithbaseschema1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithBaseSchema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AllofWithBaseSchema1BoxedNumber
data class AllofWithBaseSchema1BoxedNumber<br>
implements [AllofWithBaseSchema1Boxed](#allofwithbaseschema1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithBaseSchema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AllofWithBaseSchema1BoxedString
data class AllofWithBaseSchema1BoxedString<br>
implements [AllofWithBaseSchema1Boxed](#allofwithbaseschema1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithBaseSchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AllofWithBaseSchema1BoxedList
data class AllofWithBaseSchema1BoxedList<br>
implements [AllofWithBaseSchema1Boxed](#allofwithbaseschema1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithBaseSchema1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AllofWithBaseSchema1BoxedMap
data class AllofWithBaseSchema1BoxedMap<br>
implements [AllofWithBaseSchema1Boxed](#allofwithbaseschema1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithBaseSchema1BoxedMap([AllofWithBaseSchemaMap](#allofwithbaseschemamap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AllofWithBaseSchemaMap](#allofwithbaseschemamap) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AllofWithBaseSchema1
class AllofWithBaseSchema1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = mapOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;"bar" to [Bar::class.java](#bar))<br>)<br> |
| Set<String> | required = setOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;"bar"<br>)<br> |
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
| [AllofWithBaseSchemaMap](#allofwithbaseschemamap) | validate(arg: [Map&lt;*, *&gt;](#allofwithbaseschemamapbuilder), configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [AllofWithBaseSchema1BoxedString](#allofwithbaseschema1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [AllofWithBaseSchema1BoxedVoid](#allofwithbaseschema1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [AllofWithBaseSchema1BoxedNumber](#allofwithbaseschema1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [AllofWithBaseSchema1BoxedBoolean](#allofwithbaseschema1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [AllofWithBaseSchema1BoxedMap](#allofwithbaseschema1boxedmap) | validateAndBox([Map&lt;*, *&gt;](#allofwithbaseschemamapbuilder), configuration: SchemaConfiguration) |
| [AllofWithBaseSchema1BoxedList](#allofwithbaseschema1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [AllofWithBaseSchema1Boxed](#allofwithbaseschema1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## AllofWithBaseSchemaMap0Builder
class AllofWithBaseSchemaMap0Builder<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithBaseSchemaMap0Builder(Map<String, Any?> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Any?> | build()<br>Returns map input that should be used with Schema.validate |
| [AllofWithBaseSchemaMap0Builder](#allofwithbaseschemamap0builder) | additionalProperty(key: String, value: Nothing?) |
| [AllofWithBaseSchemaMap0Builder](#allofwithbaseschemamap0builder) | additionalProperty(key: String, value: Boolean) |
| [AllofWithBaseSchemaMap0Builder](#allofwithbaseschemamap0builder) | additionalProperty(key: String, value: String) |
| [AllofWithBaseSchemaMap0Builder](#allofwithbaseschemamap0builder) | additionalProperty(key: String, value: Int) |
| [AllofWithBaseSchemaMap0Builder](#allofwithbaseschemamap0builder) | additionalProperty(key: String, value: Float) |
| [AllofWithBaseSchemaMap0Builder](#allofwithbaseschemamap0builder) | additionalProperty(key: String, value: Long) |
| [AllofWithBaseSchemaMap0Builder](#allofwithbaseschemamap0builder) | additionalProperty(key: String, value: Double) |
| [AllofWithBaseSchemaMap0Builder](#allofwithbaseschemamap0builder) | additionalProperty(key: String, value: List<Any?>) |
| [AllofWithBaseSchemaMap0Builder](#allofwithbaseschemamap0builder) | additionalProperty(key: String, value: Map<String, Any?>) |

## AllofWithBaseSchemaMapBuilder
class AllofWithBaseSchemaMapBuilder<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithBaseSchemaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AllofWithBaseSchemaMap0Builder](#allofwithbaseschemamap0builder) | bar(value: Int) |
| [AllofWithBaseSchemaMap0Builder](#allofwithbaseschemamap0builder) | bar(value: Float) |
| [AllofWithBaseSchemaMap0Builder](#allofwithbaseschemamap0builder) | bar(value: Long) |
| [AllofWithBaseSchemaMap0Builder](#allofwithbaseschemamap0builder) | bar(value: Double) |

## AllofWithBaseSchemaMap
class AllofWithBaseSchemaMap<br>
extends FrozenMap<String, Any?>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AllofWithBaseSchemaMap](#allofwithbaseschemamap) | of([Map<String, Any?>](#allofwithbaseschemamapbuilder) arg, SchemaConfiguration configuration) |
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
| Map<String, Class<? extends JsonSchema>> | properties = mapOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;"baz" to [Baz::class.java](#baz))<br>)<br> |
| Set<String> | required = setOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;"baz"<br>)<br> |

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
| [Schema1Map0Builder](#schema1map0builder) | baz(value: Nothing?) |

## Schema1Map
class Schema1Map<br>
extends FrozenMap<String, Any?>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Schema1Map](#schema1map) | of([Map<String, Any?>](#schema1mapbuilder) arg, SchemaConfiguration configuration) |
| Nothing? | baz()<br> |
| Any? | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## BazBoxed
sealed interface BazBoxed<br>
permits<br>
[BazBoxedVoid](#bazboxedvoid)

sealed interface that stores validated payloads using boxed classes

## BazBoxedVoid
data class BazBoxedVoid<br>
implements [BazBoxed](#bazboxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BazBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Baz
class Baz<br>
extends NullJsonSchema.NullJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NullJsonSchema.NullJsonSchema1 |
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
| [Schema0Map0Builder](#schema0map0builder) | foo(value: String) |

## Schema0Map
class Schema0Map<br>
extends FrozenMap<String, Any?>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Schema0Map](#schema0map) | of([Map<String, Any?>](#schema0mapbuilder) arg, SchemaConfiguration configuration) |
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

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

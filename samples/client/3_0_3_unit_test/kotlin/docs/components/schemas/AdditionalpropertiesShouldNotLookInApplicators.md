# AdditionalpropertiesShouldNotLookInApplicators
org.openapijsonschematools.client.components.schemas.AdditionalpropertiesShouldNotLookInApplicators.java
class AdditionalpropertiesShouldNotLookInApplicators<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [AdditionalpropertiesShouldNotLookInApplicators.AdditionalpropertiesShouldNotLookInApplicators1Boxed](#additionalpropertiesshouldnotlookinapplicators1boxed)<br> sealed interface for validated payloads |
| data class | [AdditionalpropertiesShouldNotLookInApplicators.AdditionalpropertiesShouldNotLookInApplicators1BoxedVoid](#additionalpropertiesshouldnotlookinapplicators1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [AdditionalpropertiesShouldNotLookInApplicators.AdditionalpropertiesShouldNotLookInApplicators1BoxedBoolean](#additionalpropertiesshouldnotlookinapplicators1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [AdditionalpropertiesShouldNotLookInApplicators.AdditionalpropertiesShouldNotLookInApplicators1BoxedNumber](#additionalpropertiesshouldnotlookinapplicators1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [AdditionalpropertiesShouldNotLookInApplicators.AdditionalpropertiesShouldNotLookInApplicators1BoxedString](#additionalpropertiesshouldnotlookinapplicators1boxedstring)<br> boxed class to store validated String payloads |
| data class | [AdditionalpropertiesShouldNotLookInApplicators.AdditionalpropertiesShouldNotLookInApplicators1BoxedList](#additionalpropertiesshouldnotlookinapplicators1boxedlist)<br> boxed class to store validated List payloads |
| data class | [AdditionalpropertiesShouldNotLookInApplicators.AdditionalpropertiesShouldNotLookInApplicators1BoxedMap](#additionalpropertiesshouldnotlookinapplicators1boxedmap)<br> boxed class to store validated Map payloads |
| class | [AdditionalpropertiesShouldNotLookInApplicators.AdditionalpropertiesShouldNotLookInApplicators1](#additionalpropertiesshouldnotlookinapplicators1)<br> schema class |
| class | [AdditionalpropertiesShouldNotLookInApplicators.AdditionalpropertiesShouldNotLookInApplicatorsMapBuilder](#additionalpropertiesshouldnotlookinapplicatorsmapbuilder)<br> builder for Map payloads |
| class | [AdditionalpropertiesShouldNotLookInApplicators.AdditionalpropertiesShouldNotLookInApplicatorsMap](#additionalpropertiesshouldnotlookinapplicatorsmap)<br> output class for Map payloads |
| sealed interface | [AdditionalpropertiesShouldNotLookInApplicators.Schema0Boxed](#schema0boxed)<br> sealed interface for validated payloads |
| data class | [AdditionalpropertiesShouldNotLookInApplicators.Schema0BoxedVoid](#schema0boxedvoid)<br> boxed class to store validated null payloads |
| data class | [AdditionalpropertiesShouldNotLookInApplicators.Schema0BoxedBoolean](#schema0boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [AdditionalpropertiesShouldNotLookInApplicators.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| data class | [AdditionalpropertiesShouldNotLookInApplicators.Schema0BoxedString](#schema0boxedstring)<br> boxed class to store validated String payloads |
| data class | [AdditionalpropertiesShouldNotLookInApplicators.Schema0BoxedList](#schema0boxedlist)<br> boxed class to store validated List payloads |
| data class | [AdditionalpropertiesShouldNotLookInApplicators.Schema0BoxedMap](#schema0boxedmap)<br> boxed class to store validated Map payloads |
| class | [AdditionalpropertiesShouldNotLookInApplicators.Schema0](#schema0)<br> schema class |
| class | [AdditionalpropertiesShouldNotLookInApplicators.Schema0MapBuilder](#schema0mapbuilder)<br> builder for Map payloads |
| class | [AdditionalpropertiesShouldNotLookInApplicators.Schema0Map](#schema0map)<br> output class for Map payloads |
| sealed interface | [AdditionalpropertiesShouldNotLookInApplicators.FooBoxed](#fooboxed)<br> sealed interface for validated payloads |
| data class | [AdditionalpropertiesShouldNotLookInApplicators.FooBoxedVoid](#fooboxedvoid)<br> boxed class to store validated null payloads |
| data class | [AdditionalpropertiesShouldNotLookInApplicators.FooBoxedBoolean](#fooboxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [AdditionalpropertiesShouldNotLookInApplicators.FooBoxedNumber](#fooboxednumber)<br> boxed class to store validated Number payloads |
| data class | [AdditionalpropertiesShouldNotLookInApplicators.FooBoxedString](#fooboxedstring)<br> boxed class to store validated String payloads |
| data class | [AdditionalpropertiesShouldNotLookInApplicators.FooBoxedList](#fooboxedlist)<br> boxed class to store validated List payloads |
| data class | [AdditionalpropertiesShouldNotLookInApplicators.FooBoxedMap](#fooboxedmap)<br> boxed class to store validated Map payloads |
| class | [AdditionalpropertiesShouldNotLookInApplicators.Foo](#foo)<br> schema class |
| sealed interface | [AdditionalpropertiesShouldNotLookInApplicators.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed interface for validated payloads |
| data class | [AdditionalpropertiesShouldNotLookInApplicators.AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| class | [AdditionalpropertiesShouldNotLookInApplicators.AdditionalProperties](#additionalproperties)<br> schema class |

## AdditionalpropertiesShouldNotLookInApplicators1Boxed
sealed interface AdditionalpropertiesShouldNotLookInApplicators1Boxed<br>
permits<br>
[AdditionalpropertiesShouldNotLookInApplicators1BoxedVoid](#additionalpropertiesshouldnotlookinapplicators1boxedvoid),
[AdditionalpropertiesShouldNotLookInApplicators1BoxedBoolean](#additionalpropertiesshouldnotlookinapplicators1boxedboolean),
[AdditionalpropertiesShouldNotLookInApplicators1BoxedNumber](#additionalpropertiesshouldnotlookinapplicators1boxednumber),
[AdditionalpropertiesShouldNotLookInApplicators1BoxedString](#additionalpropertiesshouldnotlookinapplicators1boxedstring),
[AdditionalpropertiesShouldNotLookInApplicators1BoxedList](#additionalpropertiesshouldnotlookinapplicators1boxedlist),
[AdditionalpropertiesShouldNotLookInApplicators1BoxedMap](#additionalpropertiesshouldnotlookinapplicators1boxedmap)

sealed interface that stores validated payloads using boxed classes

## AdditionalpropertiesShouldNotLookInApplicators1BoxedVoid
data class AdditionalpropertiesShouldNotLookInApplicators1BoxedVoid<br>
implements [AdditionalpropertiesShouldNotLookInApplicators1Boxed](#additionalpropertiesshouldnotlookinapplicators1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesShouldNotLookInApplicators1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalpropertiesShouldNotLookInApplicators1BoxedBoolean
data class AdditionalpropertiesShouldNotLookInApplicators1BoxedBoolean<br>
implements [AdditionalpropertiesShouldNotLookInApplicators1Boxed](#additionalpropertiesshouldnotlookinapplicators1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesShouldNotLookInApplicators1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalpropertiesShouldNotLookInApplicators1BoxedNumber
data class AdditionalpropertiesShouldNotLookInApplicators1BoxedNumber<br>
implements [AdditionalpropertiesShouldNotLookInApplicators1Boxed](#additionalpropertiesshouldnotlookinapplicators1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesShouldNotLookInApplicators1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalpropertiesShouldNotLookInApplicators1BoxedString
data class AdditionalpropertiesShouldNotLookInApplicators1BoxedString<br>
implements [AdditionalpropertiesShouldNotLookInApplicators1Boxed](#additionalpropertiesshouldnotlookinapplicators1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesShouldNotLookInApplicators1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalpropertiesShouldNotLookInApplicators1BoxedList
data class AdditionalpropertiesShouldNotLookInApplicators1BoxedList<br>
implements [AdditionalpropertiesShouldNotLookInApplicators1Boxed](#additionalpropertiesshouldnotlookinapplicators1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesShouldNotLookInApplicators1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalpropertiesShouldNotLookInApplicators1BoxedMap
data class AdditionalpropertiesShouldNotLookInApplicators1BoxedMap<br>
implements [AdditionalpropertiesShouldNotLookInApplicators1Boxed](#additionalpropertiesshouldnotlookinapplicators1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesShouldNotLookInApplicators1BoxedMap([AdditionalpropertiesShouldNotLookInApplicatorsMap](#additionalpropertiesshouldnotlookinapplicatorsmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AdditionalpropertiesShouldNotLookInApplicatorsMap](#additionalpropertiesshouldnotlookinapplicatorsmap) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalpropertiesShouldNotLookInApplicators1
class AdditionalpropertiesShouldNotLookInApplicators1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties::class.java](#additionalproperties) |
| List<Class<? extends JsonSchema>> | allOf = listOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema0::class.java](#schema0)<br>;)<br> |

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
| [AdditionalpropertiesShouldNotLookInApplicatorsMap](#additionalpropertiesshouldnotlookinapplicatorsmap) | validate(arg: [Map&lt;*, *&gt;](#additionalpropertiesshouldnotlookinapplicatorsmapbuilder), configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [AdditionalpropertiesShouldNotLookInApplicators1BoxedString](#additionalpropertiesshouldnotlookinapplicators1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [AdditionalpropertiesShouldNotLookInApplicators1BoxedVoid](#additionalpropertiesshouldnotlookinapplicators1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [AdditionalpropertiesShouldNotLookInApplicators1BoxedNumber](#additionalpropertiesshouldnotlookinapplicators1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [AdditionalpropertiesShouldNotLookInApplicators1BoxedBoolean](#additionalpropertiesshouldnotlookinapplicators1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [AdditionalpropertiesShouldNotLookInApplicators1BoxedMap](#additionalpropertiesshouldnotlookinapplicators1boxedmap) | validateAndBox([Map&lt;*, *&gt;](#additionalpropertiesshouldnotlookinapplicatorsmapbuilder), configuration: SchemaConfiguration) |
| [AdditionalpropertiesShouldNotLookInApplicators1BoxedList](#additionalpropertiesshouldnotlookinapplicators1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [AdditionalpropertiesShouldNotLookInApplicators1Boxed](#additionalpropertiesshouldnotlookinapplicators1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## AdditionalpropertiesShouldNotLookInApplicatorsMapBuilder
class AdditionalpropertiesShouldNotLookInApplicatorsMapBuilder<br>
builder for `Map<String, Boolean>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesShouldNotLookInApplicatorsMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Boolean> | build()<br>Returns map input that should be used with Schema.validate |
| [AdditionalpropertiesShouldNotLookInApplicatorsMapBuilder](#additionalpropertiesshouldnotlookinapplicatorsmapbuilder) | additionalProperty(key: String, value: Boolean) |

## AdditionalpropertiesShouldNotLookInApplicatorsMap
class AdditionalpropertiesShouldNotLookInApplicatorsMap<br>
extends FrozenMap<String, Boolean>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AdditionalpropertiesShouldNotLookInApplicatorsMap](#additionalpropertiesshouldnotlookinapplicatorsmap) | of([Map<String, Boolean>](#additionalpropertiesshouldnotlookinapplicatorsmapbuilder) arg, SchemaConfiguration configuration) |
| Boolean | getAdditionalProperty(String name)<br>provides type safety for additional properties |

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
| Map<String, Any?> | build()<br>Returns map input that should be used with Schema.validate |
| [Schema0MapBuilder](#schema0mapbuilder) | foo(value: Nothing?) |
| [Schema0MapBuilder](#schema0mapbuilder) | foo(value: Boolean) |
| [Schema0MapBuilder](#schema0mapbuilder) | foo(value: String) |
| [Schema0MapBuilder](#schema0mapbuilder) | foo(value: Int) |
| [Schema0MapBuilder](#schema0mapbuilder) | foo(value: Float) |
| [Schema0MapBuilder](#schema0mapbuilder) | foo(value: Long) |
| [Schema0MapBuilder](#schema0mapbuilder) | foo(value: Double) |
| [Schema0MapBuilder](#schema0mapbuilder) | foo(value: List<Any?>) |
| [Schema0MapBuilder](#schema0mapbuilder) | foo(value: Map<String, Any?>) |
| [Schema0MapBuilder](#schema0mapbuilder) | additionalProperty(key: String, value: Nothing?) |
| [Schema0MapBuilder](#schema0mapbuilder) | additionalProperty(key: String, value: Boolean) |
| [Schema0MapBuilder](#schema0mapbuilder) | additionalProperty(key: String, value: String) |
| [Schema0MapBuilder](#schema0mapbuilder) | additionalProperty(key: String, value: Int) |
| [Schema0MapBuilder](#schema0mapbuilder) | additionalProperty(key: String, value: Float) |
| [Schema0MapBuilder](#schema0mapbuilder) | additionalProperty(key: String, value: Long) |
| [Schema0MapBuilder](#schema0mapbuilder) | additionalProperty(key: String, value: Double) |
| [Schema0MapBuilder](#schema0mapbuilder) | additionalProperty(key: String, value: List<Any?>) |
| [Schema0MapBuilder](#schema0mapbuilder) | additionalProperty(key: String, value: Map<String, Any?>) |

## Schema0Map
class Schema0Map<br>
extends FrozenMap<String, Any?>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Schema0Map](#schema0map) | of([Map<String, Any?>](#schema0mapbuilder) arg, SchemaConfiguration configuration) |
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

data class that stores validated boolean payloads, sealed permits implementation

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
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## AdditionalPropertiesBoxed
sealed interface AdditionalPropertiesBoxed<br>
permits<br>
[AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)

sealed interface that stores validated payloads using boxed classes

## AdditionalPropertiesBoxedBoolean
data class AdditionalPropertiesBoxedBoolean<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalProperties
class AdditionalProperties<br>
extends BooleanJsonSchema.BooleanJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.BooleanJsonSchema.BooleanJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

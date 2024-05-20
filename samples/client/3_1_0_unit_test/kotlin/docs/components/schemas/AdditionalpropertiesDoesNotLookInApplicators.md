# AdditionalpropertiesDoesNotLookInApplicators
org.openapijsonschematools.client.components.schemas.AdditionalpropertiesDoesNotLookInApplicators.java
class AdditionalpropertiesDoesNotLookInApplicators<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [AdditionalpropertiesDoesNotLookInApplicators.AdditionalpropertiesDoesNotLookInApplicators1Boxed](#additionalpropertiesdoesnotlookinapplicators1boxed)<br> sealed interface for validated payloads |
| record | [AdditionalpropertiesDoesNotLookInApplicators.AdditionalpropertiesDoesNotLookInApplicators1BoxedVoid](#additionalpropertiesdoesnotlookinapplicators1boxedvoid)<br> boxed class to store validated null payloads |
| record | [AdditionalpropertiesDoesNotLookInApplicators.AdditionalpropertiesDoesNotLookInApplicators1BoxedBoolean](#additionalpropertiesdoesnotlookinapplicators1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AdditionalpropertiesDoesNotLookInApplicators.AdditionalpropertiesDoesNotLookInApplicators1BoxedNumber](#additionalpropertiesdoesnotlookinapplicators1boxednumber)<br> boxed class to store validated Number payloads |
| record | [AdditionalpropertiesDoesNotLookInApplicators.AdditionalpropertiesDoesNotLookInApplicators1BoxedString](#additionalpropertiesdoesnotlookinapplicators1boxedstring)<br> boxed class to store validated String payloads |
| record | [AdditionalpropertiesDoesNotLookInApplicators.AdditionalpropertiesDoesNotLookInApplicators1BoxedList](#additionalpropertiesdoesnotlookinapplicators1boxedlist)<br> boxed class to store validated List payloads |
| record | [AdditionalpropertiesDoesNotLookInApplicators.AdditionalpropertiesDoesNotLookInApplicators1BoxedMap](#additionalpropertiesdoesnotlookinapplicators1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalpropertiesDoesNotLookInApplicators.AdditionalpropertiesDoesNotLookInApplicators1](#additionalpropertiesdoesnotlookinapplicators1)<br> schema class |
| static class | [AdditionalpropertiesDoesNotLookInApplicators.AdditionalpropertiesDoesNotLookInApplicatorsMapBuilder](#additionalpropertiesdoesnotlookinapplicatorsmapbuilder)<br> builder for Map payloads |
| static class | [AdditionalpropertiesDoesNotLookInApplicators.AdditionalpropertiesDoesNotLookInApplicatorsMap](#additionalpropertiesdoesnotlookinapplicatorsmap)<br> output class for Map payloads |
| sealed interface | [AdditionalpropertiesDoesNotLookInApplicators.Schema0Boxed](#schema0boxed)<br> sealed interface for validated payloads |
| record | [AdditionalpropertiesDoesNotLookInApplicators.Schema0BoxedVoid](#schema0boxedvoid)<br> boxed class to store validated null payloads |
| record | [AdditionalpropertiesDoesNotLookInApplicators.Schema0BoxedBoolean](#schema0boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AdditionalpropertiesDoesNotLookInApplicators.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| record | [AdditionalpropertiesDoesNotLookInApplicators.Schema0BoxedString](#schema0boxedstring)<br> boxed class to store validated String payloads |
| record | [AdditionalpropertiesDoesNotLookInApplicators.Schema0BoxedList](#schema0boxedlist)<br> boxed class to store validated List payloads |
| record | [AdditionalpropertiesDoesNotLookInApplicators.Schema0BoxedMap](#schema0boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalpropertiesDoesNotLookInApplicators.Schema0](#schema0)<br> schema class |
| static class | [AdditionalpropertiesDoesNotLookInApplicators.Schema0MapBuilder](#schema0mapbuilder)<br> builder for Map payloads |
| static class | [AdditionalpropertiesDoesNotLookInApplicators.Schema0Map](#schema0map)<br> output class for Map payloads |
| sealed interface | [AdditionalpropertiesDoesNotLookInApplicators.FooBoxed](#fooboxed)<br> sealed interface for validated payloads |
| record | [AdditionalpropertiesDoesNotLookInApplicators.FooBoxedVoid](#fooboxedvoid)<br> boxed class to store validated null payloads |
| record | [AdditionalpropertiesDoesNotLookInApplicators.FooBoxedBoolean](#fooboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AdditionalpropertiesDoesNotLookInApplicators.FooBoxedNumber](#fooboxednumber)<br> boxed class to store validated Number payloads |
| record | [AdditionalpropertiesDoesNotLookInApplicators.FooBoxedString](#fooboxedstring)<br> boxed class to store validated String payloads |
| record | [AdditionalpropertiesDoesNotLookInApplicators.FooBoxedList](#fooboxedlist)<br> boxed class to store validated List payloads |
| record | [AdditionalpropertiesDoesNotLookInApplicators.FooBoxedMap](#fooboxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalpropertiesDoesNotLookInApplicators.Foo](#foo)<br> schema class |
| sealed interface | [AdditionalpropertiesDoesNotLookInApplicators.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [AdditionalpropertiesDoesNotLookInApplicators.AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [AdditionalpropertiesDoesNotLookInApplicators.AdditionalProperties](#additionalproperties)<br> schema class |

## AdditionalpropertiesDoesNotLookInApplicators1Boxed
sealed interface AdditionalpropertiesDoesNotLookInApplicators1Boxed<br>
permits<br>
[AdditionalpropertiesDoesNotLookInApplicators1BoxedVoid](#additionalpropertiesdoesnotlookinapplicators1boxedvoid),
[AdditionalpropertiesDoesNotLookInApplicators1BoxedBoolean](#additionalpropertiesdoesnotlookinapplicators1boxedboolean),
[AdditionalpropertiesDoesNotLookInApplicators1BoxedNumber](#additionalpropertiesdoesnotlookinapplicators1boxednumber),
[AdditionalpropertiesDoesNotLookInApplicators1BoxedString](#additionalpropertiesdoesnotlookinapplicators1boxedstring),
[AdditionalpropertiesDoesNotLookInApplicators1BoxedList](#additionalpropertiesdoesnotlookinapplicators1boxedlist),
[AdditionalpropertiesDoesNotLookInApplicators1BoxedMap](#additionalpropertiesdoesnotlookinapplicators1boxedmap)

sealed interface that stores validated payloads using boxed classes

## AdditionalpropertiesDoesNotLookInApplicators1BoxedVoid
data class AdditionalpropertiesDoesNotLookInApplicators1BoxedVoid<br>
implements [AdditionalpropertiesDoesNotLookInApplicators1Boxed](#additionalpropertiesdoesnotlookinapplicators1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesDoesNotLookInApplicators1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalpropertiesDoesNotLookInApplicators1BoxedBoolean
data class AdditionalpropertiesDoesNotLookInApplicators1BoxedBoolean<br>
implements [AdditionalpropertiesDoesNotLookInApplicators1Boxed](#additionalpropertiesdoesnotlookinapplicators1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesDoesNotLookInApplicators1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalpropertiesDoesNotLookInApplicators1BoxedNumber
data class AdditionalpropertiesDoesNotLookInApplicators1BoxedNumber<br>
implements [AdditionalpropertiesDoesNotLookInApplicators1Boxed](#additionalpropertiesdoesnotlookinapplicators1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesDoesNotLookInApplicators1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalpropertiesDoesNotLookInApplicators1BoxedString
data class AdditionalpropertiesDoesNotLookInApplicators1BoxedString<br>
implements [AdditionalpropertiesDoesNotLookInApplicators1Boxed](#additionalpropertiesdoesnotlookinapplicators1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesDoesNotLookInApplicators1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalpropertiesDoesNotLookInApplicators1BoxedList
data class AdditionalpropertiesDoesNotLookInApplicators1BoxedList<br>
implements [AdditionalpropertiesDoesNotLookInApplicators1Boxed](#additionalpropertiesdoesnotlookinapplicators1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesDoesNotLookInApplicators1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalpropertiesDoesNotLookInApplicators1BoxedMap
data class AdditionalpropertiesDoesNotLookInApplicators1BoxedMap<br>
implements [AdditionalpropertiesDoesNotLookInApplicators1Boxed](#additionalpropertiesdoesnotlookinapplicators1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesDoesNotLookInApplicators1BoxedMap([AdditionalpropertiesDoesNotLookInApplicatorsMap](#additionalpropertiesdoesnotlookinapplicatorsmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AdditionalpropertiesDoesNotLookInApplicatorsMap](#additionalpropertiesdoesnotlookinapplicatorsmap) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalpropertiesDoesNotLookInApplicators1
class AdditionalpropertiesDoesNotLookInApplicators1<br>
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
| [AdditionalpropertiesDoesNotLookInApplicatorsMap](#additionalpropertiesdoesnotlookinapplicatorsmap) | validate(arg: [Map&lt;*, *&gt;](#additionalpropertiesdoesnotlookinapplicatorsmapbuilder), configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [AdditionalpropertiesDoesNotLookInApplicators1BoxedString](#additionalpropertiesdoesnotlookinapplicators1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [AdditionalpropertiesDoesNotLookInApplicators1BoxedVoid](#additionalpropertiesdoesnotlookinapplicators1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [AdditionalpropertiesDoesNotLookInApplicators1BoxedNumber](#additionalpropertiesdoesnotlookinapplicators1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [AdditionalpropertiesDoesNotLookInApplicators1BoxedBoolean](#additionalpropertiesdoesnotlookinapplicators1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [AdditionalpropertiesDoesNotLookInApplicators1BoxedMap](#additionalpropertiesdoesnotlookinapplicators1boxedmap) | validateAndBox([Map&lt;*, *&gt;](#additionalpropertiesdoesnotlookinapplicatorsmapbuilder), configuration: SchemaConfiguration) |
| [AdditionalpropertiesDoesNotLookInApplicators1BoxedList](#additionalpropertiesdoesnotlookinapplicators1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [AdditionalpropertiesDoesNotLookInApplicators1Boxed](#additionalpropertiesdoesnotlookinapplicators1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## AdditionalpropertiesDoesNotLookInApplicatorsMapBuilder
class AdditionalpropertiesDoesNotLookInApplicatorsMapBuilder<br>
builder for `Map<String, Boolean>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesDoesNotLookInApplicatorsMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Boolean> | build()<br>Returns map input that should be used with Schema.validate |
| [AdditionalpropertiesDoesNotLookInApplicatorsMapBuilder](#additionalpropertiesdoesnotlookinapplicatorsmapbuilder) | additionalProperty(key: String, value: Boolean) |

## AdditionalpropertiesDoesNotLookInApplicatorsMap
class AdditionalpropertiesDoesNotLookInApplicatorsMap<br>
extends FrozenMap<String, Boolean>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AdditionalpropertiesDoesNotLookInApplicatorsMap](#additionalpropertiesdoesnotlookinapplicatorsmap) | of([Map<String, Boolean>](#additionalpropertiesdoesnotlookinapplicatorsmapbuilder) arg, SchemaConfiguration configuration) |
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

record that stores validated boolean payloads, sealed permits implementation

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

record that stores validated boolean payloads, sealed permits implementation

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

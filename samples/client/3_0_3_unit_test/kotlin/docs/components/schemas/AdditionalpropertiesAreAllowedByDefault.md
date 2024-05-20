# AdditionalpropertiesAreAllowedByDefault
org.openapijsonschematools.client.components.schemas.AdditionalpropertiesAreAllowedByDefault.java
class AdditionalpropertiesAreAllowedByDefault<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [AdditionalpropertiesAreAllowedByDefault.AdditionalpropertiesAreAllowedByDefault1Boxed](#additionalpropertiesareallowedbydefault1boxed)<br> sealed interface for validated payloads |
| record | [AdditionalpropertiesAreAllowedByDefault.AdditionalpropertiesAreAllowedByDefault1BoxedVoid](#additionalpropertiesareallowedbydefault1boxedvoid)<br> boxed class to store validated null payloads |
| record | [AdditionalpropertiesAreAllowedByDefault.AdditionalpropertiesAreAllowedByDefault1BoxedBoolean](#additionalpropertiesareallowedbydefault1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AdditionalpropertiesAreAllowedByDefault.AdditionalpropertiesAreAllowedByDefault1BoxedNumber](#additionalpropertiesareallowedbydefault1boxednumber)<br> boxed class to store validated Number payloads |
| record | [AdditionalpropertiesAreAllowedByDefault.AdditionalpropertiesAreAllowedByDefault1BoxedString](#additionalpropertiesareallowedbydefault1boxedstring)<br> boxed class to store validated String payloads |
| record | [AdditionalpropertiesAreAllowedByDefault.AdditionalpropertiesAreAllowedByDefault1BoxedList](#additionalpropertiesareallowedbydefault1boxedlist)<br> boxed class to store validated List payloads |
| record | [AdditionalpropertiesAreAllowedByDefault.AdditionalpropertiesAreAllowedByDefault1BoxedMap](#additionalpropertiesareallowedbydefault1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalpropertiesAreAllowedByDefault.AdditionalpropertiesAreAllowedByDefault1](#additionalpropertiesareallowedbydefault1)<br> schema class |
| static class | [AdditionalpropertiesAreAllowedByDefault.AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder)<br> builder for Map payloads |
| static class | [AdditionalpropertiesAreAllowedByDefault.AdditionalpropertiesAreAllowedByDefaultMap](#additionalpropertiesareallowedbydefaultmap)<br> output class for Map payloads |
| sealed interface | [AdditionalpropertiesAreAllowedByDefault.BarBoxed](#barboxed)<br> sealed interface for validated payloads |
| record | [AdditionalpropertiesAreAllowedByDefault.BarBoxedVoid](#barboxedvoid)<br> boxed class to store validated null payloads |
| record | [AdditionalpropertiesAreAllowedByDefault.BarBoxedBoolean](#barboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AdditionalpropertiesAreAllowedByDefault.BarBoxedNumber](#barboxednumber)<br> boxed class to store validated Number payloads |
| record | [AdditionalpropertiesAreAllowedByDefault.BarBoxedString](#barboxedstring)<br> boxed class to store validated String payloads |
| record | [AdditionalpropertiesAreAllowedByDefault.BarBoxedList](#barboxedlist)<br> boxed class to store validated List payloads |
| record | [AdditionalpropertiesAreAllowedByDefault.BarBoxedMap](#barboxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalpropertiesAreAllowedByDefault.Bar](#bar)<br> schema class |
| sealed interface | [AdditionalpropertiesAreAllowedByDefault.FooBoxed](#fooboxed)<br> sealed interface for validated payloads |
| record | [AdditionalpropertiesAreAllowedByDefault.FooBoxedVoid](#fooboxedvoid)<br> boxed class to store validated null payloads |
| record | [AdditionalpropertiesAreAllowedByDefault.FooBoxedBoolean](#fooboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AdditionalpropertiesAreAllowedByDefault.FooBoxedNumber](#fooboxednumber)<br> boxed class to store validated Number payloads |
| record | [AdditionalpropertiesAreAllowedByDefault.FooBoxedString](#fooboxedstring)<br> boxed class to store validated String payloads |
| record | [AdditionalpropertiesAreAllowedByDefault.FooBoxedList](#fooboxedlist)<br> boxed class to store validated List payloads |
| record | [AdditionalpropertiesAreAllowedByDefault.FooBoxedMap](#fooboxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalpropertiesAreAllowedByDefault.Foo](#foo)<br> schema class |

## AdditionalpropertiesAreAllowedByDefault1Boxed
sealed interface AdditionalpropertiesAreAllowedByDefault1Boxed<br>
permits<br>
[AdditionalpropertiesAreAllowedByDefault1BoxedVoid](#additionalpropertiesareallowedbydefault1boxedvoid),
[AdditionalpropertiesAreAllowedByDefault1BoxedBoolean](#additionalpropertiesareallowedbydefault1boxedboolean),
[AdditionalpropertiesAreAllowedByDefault1BoxedNumber](#additionalpropertiesareallowedbydefault1boxednumber),
[AdditionalpropertiesAreAllowedByDefault1BoxedString](#additionalpropertiesareallowedbydefault1boxedstring),
[AdditionalpropertiesAreAllowedByDefault1BoxedList](#additionalpropertiesareallowedbydefault1boxedlist),
[AdditionalpropertiesAreAllowedByDefault1BoxedMap](#additionalpropertiesareallowedbydefault1boxedmap)

sealed interface that stores validated payloads using boxed classes

## AdditionalpropertiesAreAllowedByDefault1BoxedVoid
data class AdditionalpropertiesAreAllowedByDefault1BoxedVoid<br>
implements [AdditionalpropertiesAreAllowedByDefault1Boxed](#additionalpropertiesareallowedbydefault1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesAreAllowedByDefault1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalpropertiesAreAllowedByDefault1BoxedBoolean
data class AdditionalpropertiesAreAllowedByDefault1BoxedBoolean<br>
implements [AdditionalpropertiesAreAllowedByDefault1Boxed](#additionalpropertiesareallowedbydefault1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesAreAllowedByDefault1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalpropertiesAreAllowedByDefault1BoxedNumber
data class AdditionalpropertiesAreAllowedByDefault1BoxedNumber<br>
implements [AdditionalpropertiesAreAllowedByDefault1Boxed](#additionalpropertiesareallowedbydefault1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesAreAllowedByDefault1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalpropertiesAreAllowedByDefault1BoxedString
data class AdditionalpropertiesAreAllowedByDefault1BoxedString<br>
implements [AdditionalpropertiesAreAllowedByDefault1Boxed](#additionalpropertiesareallowedbydefault1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesAreAllowedByDefault1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalpropertiesAreAllowedByDefault1BoxedList
data class AdditionalpropertiesAreAllowedByDefault1BoxedList<br>
implements [AdditionalpropertiesAreAllowedByDefault1Boxed](#additionalpropertiesareallowedbydefault1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesAreAllowedByDefault1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalpropertiesAreAllowedByDefault1BoxedMap
data class AdditionalpropertiesAreAllowedByDefault1BoxedMap<br>
implements [AdditionalpropertiesAreAllowedByDefault1Boxed](#additionalpropertiesareallowedbydefault1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesAreAllowedByDefault1BoxedMap([AdditionalpropertiesAreAllowedByDefaultMap](#additionalpropertiesareallowedbydefaultmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AdditionalpropertiesAreAllowedByDefaultMap](#additionalpropertiesareallowedbydefaultmap) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalpropertiesAreAllowedByDefault1
class AdditionalpropertiesAreAllowedByDefault1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = mapOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo" to [Foo::class.java](#foo)),<br>&nbsp;&nbsp;&nbsp;&nbsp;"bar" to [Bar::class.java](#bar))<br>)<br> |

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
| [AdditionalpropertiesAreAllowedByDefaultMap](#additionalpropertiesareallowedbydefaultmap) | validate(arg: [Map&lt;*, *&gt;](#additionalpropertiesareallowedbydefaultmapbuilder), configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [AdditionalpropertiesAreAllowedByDefault1BoxedString](#additionalpropertiesareallowedbydefault1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [AdditionalpropertiesAreAllowedByDefault1BoxedVoid](#additionalpropertiesareallowedbydefault1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [AdditionalpropertiesAreAllowedByDefault1BoxedNumber](#additionalpropertiesareallowedbydefault1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [AdditionalpropertiesAreAllowedByDefault1BoxedBoolean](#additionalpropertiesareallowedbydefault1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [AdditionalpropertiesAreAllowedByDefault1BoxedMap](#additionalpropertiesareallowedbydefault1boxedmap) | validateAndBox([Map&lt;*, *&gt;](#additionalpropertiesareallowedbydefaultmapbuilder), configuration: SchemaConfiguration) |
| [AdditionalpropertiesAreAllowedByDefault1BoxedList](#additionalpropertiesareallowedbydefault1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [AdditionalpropertiesAreAllowedByDefault1Boxed](#additionalpropertiesareallowedbydefault1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## AdditionalpropertiesAreAllowedByDefaultMapBuilder
class AdditionalpropertiesAreAllowedByDefaultMapBuilder<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesAreAllowedByDefaultMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Any?> | build()<br>Returns map input that should be used with Schema.validate |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | foo(value: Nothing?) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | foo(value: Boolean) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | foo(value: String) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | foo(value: Int) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | foo(value: Float) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | foo(value: Long) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | foo(value: Double) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | foo(value: List<Any?>) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | foo(value: Map<String, Any?>) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | bar(value: Nothing?) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | bar(value: Boolean) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | bar(value: String) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | bar(value: Int) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | bar(value: Float) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | bar(value: Long) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | bar(value: Double) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | bar(value: List<Any?>) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | bar(value: Map<String, Any?>) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | additionalProperty(key: String, value: Nothing?) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | additionalProperty(key: String, value: Boolean) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | additionalProperty(key: String, value: String) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | additionalProperty(key: String, value: Int) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | additionalProperty(key: String, value: Float) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | additionalProperty(key: String, value: Long) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | additionalProperty(key: String, value: Double) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | additionalProperty(key: String, value: List<Any?>) |
| [AdditionalpropertiesAreAllowedByDefaultMapBuilder](#additionalpropertiesareallowedbydefaultmapbuilder) | additionalProperty(key: String, value: Map<String, Any?>) |

## AdditionalpropertiesAreAllowedByDefaultMap
class AdditionalpropertiesAreAllowedByDefaultMap<br>
extends FrozenMap<String, Any?>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AdditionalpropertiesAreAllowedByDefaultMap](#additionalpropertiesareallowedbydefaultmap) | of([Map<String, Any?>](#additionalpropertiesareallowedbydefaultmapbuilder) arg, SchemaConfiguration configuration) |
| Any? | foo()<br>[optional] |
| Any? | bar()<br>[optional] |
| Any? | getAdditionalProperty(String name)<br>provides type safety for additional properties |

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
| BarBoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Bar
class Bar<br>
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

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

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

# RequiredWithEmptyArray
org.openapijsonschematools.client.components.schemas.RequiredWithEmptyArray.java
class RequiredWithEmptyArray<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [RequiredWithEmptyArray.RequiredWithEmptyArray1Boxed](#requiredwithemptyarray1boxed)<br> sealed interface for validated payloads |
| data class | [RequiredWithEmptyArray.RequiredWithEmptyArray1BoxedVoid](#requiredwithemptyarray1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [RequiredWithEmptyArray.RequiredWithEmptyArray1BoxedBoolean](#requiredwithemptyarray1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [RequiredWithEmptyArray.RequiredWithEmptyArray1BoxedNumber](#requiredwithemptyarray1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [RequiredWithEmptyArray.RequiredWithEmptyArray1BoxedString](#requiredwithemptyarray1boxedstring)<br> boxed class to store validated String payloads |
| data class | [RequiredWithEmptyArray.RequiredWithEmptyArray1BoxedList](#requiredwithemptyarray1boxedlist)<br> boxed class to store validated List payloads |
| data class | [RequiredWithEmptyArray.RequiredWithEmptyArray1BoxedMap](#requiredwithemptyarray1boxedmap)<br> boxed class to store validated Map payloads |
| class | [RequiredWithEmptyArray.RequiredWithEmptyArray1](#requiredwithemptyarray1)<br> schema class |
| class | [RequiredWithEmptyArray.RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder)<br> builder for Map payloads |
| class | [RequiredWithEmptyArray.RequiredWithEmptyArrayMap](#requiredwithemptyarraymap)<br> output class for Map payloads |
| sealed interface | [RequiredWithEmptyArray.FooBoxed](#fooboxed)<br> sealed interface for validated payloads |
| data class | [RequiredWithEmptyArray.FooBoxedVoid](#fooboxedvoid)<br> boxed class to store validated null payloads |
| data class | [RequiredWithEmptyArray.FooBoxedBoolean](#fooboxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [RequiredWithEmptyArray.FooBoxedNumber](#fooboxednumber)<br> boxed class to store validated Number payloads |
| data class | [RequiredWithEmptyArray.FooBoxedString](#fooboxedstring)<br> boxed class to store validated String payloads |
| data class | [RequiredWithEmptyArray.FooBoxedList](#fooboxedlist)<br> boxed class to store validated List payloads |
| data class | [RequiredWithEmptyArray.FooBoxedMap](#fooboxedmap)<br> boxed class to store validated Map payloads |
| class | [RequiredWithEmptyArray.Foo](#foo)<br> schema class |

## RequiredWithEmptyArray1Boxed
sealed interface RequiredWithEmptyArray1Boxed<br>
permits<br>
[RequiredWithEmptyArray1BoxedVoid](#requiredwithemptyarray1boxedvoid),
[RequiredWithEmptyArray1BoxedBoolean](#requiredwithemptyarray1boxedboolean),
[RequiredWithEmptyArray1BoxedNumber](#requiredwithemptyarray1boxednumber),
[RequiredWithEmptyArray1BoxedString](#requiredwithemptyarray1boxedstring),
[RequiredWithEmptyArray1BoxedList](#requiredwithemptyarray1boxedlist),
[RequiredWithEmptyArray1BoxedMap](#requiredwithemptyarray1boxedmap)

sealed interface that stores validated payloads using boxed classes

## RequiredWithEmptyArray1BoxedVoid
data class RequiredWithEmptyArray1BoxedVoid<br>
implements [RequiredWithEmptyArray1Boxed](#requiredwithemptyarray1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEmptyArray1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RequiredWithEmptyArray1BoxedBoolean
data class RequiredWithEmptyArray1BoxedBoolean<br>
implements [RequiredWithEmptyArray1Boxed](#requiredwithemptyarray1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEmptyArray1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RequiredWithEmptyArray1BoxedNumber
data class RequiredWithEmptyArray1BoxedNumber<br>
implements [RequiredWithEmptyArray1Boxed](#requiredwithemptyarray1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEmptyArray1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RequiredWithEmptyArray1BoxedString
data class RequiredWithEmptyArray1BoxedString<br>
implements [RequiredWithEmptyArray1Boxed](#requiredwithemptyarray1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEmptyArray1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RequiredWithEmptyArray1BoxedList
data class RequiredWithEmptyArray1BoxedList<br>
implements [RequiredWithEmptyArray1Boxed](#requiredwithemptyarray1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEmptyArray1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RequiredWithEmptyArray1BoxedMap
data class RequiredWithEmptyArray1BoxedMap<br>
implements [RequiredWithEmptyArray1Boxed](#requiredwithemptyarray1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEmptyArray1BoxedMap([RequiredWithEmptyArrayMap](#requiredwithemptyarraymap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredWithEmptyArrayMap](#requiredwithemptyarraymap) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RequiredWithEmptyArray1
class RequiredWithEmptyArray1<br>
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
| [RequiredWithEmptyArrayMap](#requiredwithemptyarraymap) | validate(arg: [Map&lt;*, *&gt;](#requiredwithemptyarraymapbuilder), configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [RequiredWithEmptyArray1BoxedString](#requiredwithemptyarray1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [RequiredWithEmptyArray1BoxedVoid](#requiredwithemptyarray1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [RequiredWithEmptyArray1BoxedNumber](#requiredwithemptyarray1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [RequiredWithEmptyArray1BoxedBoolean](#requiredwithemptyarray1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [RequiredWithEmptyArray1BoxedMap](#requiredwithemptyarray1boxedmap) | validateAndBox([Map&lt;*, *&gt;](#requiredwithemptyarraymapbuilder), configuration: SchemaConfiguration) |
| [RequiredWithEmptyArray1BoxedList](#requiredwithemptyarray1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [RequiredWithEmptyArray1Boxed](#requiredwithemptyarray1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## RequiredWithEmptyArrayMapBuilder
class RequiredWithEmptyArrayMapBuilder<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEmptyArrayMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Any?> | build()<br>Returns map input that should be used with Schema.validate |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | foo(value: Nothing?) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | foo(value: Boolean) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | foo(value: String) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | foo(value: Int) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | foo(value: Float) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | foo(value: Long) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | foo(value: Double) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | foo(value: List<Any?>) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | foo(value: Map<String, Any?>) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | additionalProperty(key: String, value: Nothing?) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | additionalProperty(key: String, value: Boolean) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | additionalProperty(key: String, value: String) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | additionalProperty(key: String, value: Int) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | additionalProperty(key: String, value: Float) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | additionalProperty(key: String, value: Long) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | additionalProperty(key: String, value: Double) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | additionalProperty(key: String, value: List<Any?>) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | additionalProperty(key: String, value: Map<String, Any?>) |

## RequiredWithEmptyArrayMap
class RequiredWithEmptyArrayMap<br>
extends FrozenMap<String, Any?>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [RequiredWithEmptyArrayMap](#requiredwithemptyarraymap) | of([Map<String, Any?>](#requiredwithemptyarraymapbuilder) arg, SchemaConfiguration configuration) |
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

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

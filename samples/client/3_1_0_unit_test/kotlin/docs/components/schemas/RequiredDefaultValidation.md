# RequiredDefaultValidation
org.openapijsonschematools.client.components.schemas.RequiredDefaultValidation.java
class RequiredDefaultValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [RequiredDefaultValidation.RequiredDefaultValidation1Boxed](#requireddefaultvalidation1boxed)<br> sealed interface for validated payloads |
| data class | [RequiredDefaultValidation.RequiredDefaultValidation1BoxedVoid](#requireddefaultvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [RequiredDefaultValidation.RequiredDefaultValidation1BoxedBoolean](#requireddefaultvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [RequiredDefaultValidation.RequiredDefaultValidation1BoxedNumber](#requireddefaultvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [RequiredDefaultValidation.RequiredDefaultValidation1BoxedString](#requireddefaultvalidation1boxedstring)<br> boxed class to store validated String payloads |
| data class | [RequiredDefaultValidation.RequiredDefaultValidation1BoxedList](#requireddefaultvalidation1boxedlist)<br> boxed class to store validated List payloads |
| data class | [RequiredDefaultValidation.RequiredDefaultValidation1BoxedMap](#requireddefaultvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| class | [RequiredDefaultValidation.RequiredDefaultValidation1](#requireddefaultvalidation1)<br> schema class |
| class | [RequiredDefaultValidation.RequiredDefaultValidationMapBuilder](#requireddefaultvalidationmapbuilder)<br> builder for Map payloads |
| class | [RequiredDefaultValidation.RequiredDefaultValidationMap](#requireddefaultvalidationmap)<br> output class for Map payloads |
| sealed interface | [RequiredDefaultValidation.FooBoxed](#fooboxed)<br> sealed interface for validated payloads |
| data class | [RequiredDefaultValidation.FooBoxedVoid](#fooboxedvoid)<br> boxed class to store validated null payloads |
| data class | [RequiredDefaultValidation.FooBoxedBoolean](#fooboxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [RequiredDefaultValidation.FooBoxedNumber](#fooboxednumber)<br> boxed class to store validated Number payloads |
| data class | [RequiredDefaultValidation.FooBoxedString](#fooboxedstring)<br> boxed class to store validated String payloads |
| data class | [RequiredDefaultValidation.FooBoxedList](#fooboxedlist)<br> boxed class to store validated List payloads |
| data class | [RequiredDefaultValidation.FooBoxedMap](#fooboxedmap)<br> boxed class to store validated Map payloads |
| class | [RequiredDefaultValidation.Foo](#foo)<br> schema class |

## RequiredDefaultValidation1Boxed
sealed interface RequiredDefaultValidation1Boxed<br>
permits<br>
[RequiredDefaultValidation1BoxedVoid](#requireddefaultvalidation1boxedvoid),
[RequiredDefaultValidation1BoxedBoolean](#requireddefaultvalidation1boxedboolean),
[RequiredDefaultValidation1BoxedNumber](#requireddefaultvalidation1boxednumber),
[RequiredDefaultValidation1BoxedString](#requireddefaultvalidation1boxedstring),
[RequiredDefaultValidation1BoxedList](#requireddefaultvalidation1boxedlist),
[RequiredDefaultValidation1BoxedMap](#requireddefaultvalidation1boxedmap)

sealed interface that stores validated payloads using boxed classes

## RequiredDefaultValidation1BoxedVoid
data class RequiredDefaultValidation1BoxedVoid<br>
implements [RequiredDefaultValidation1Boxed](#requireddefaultvalidation1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredDefaultValidation1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RequiredDefaultValidation1BoxedBoolean
data class RequiredDefaultValidation1BoxedBoolean<br>
implements [RequiredDefaultValidation1Boxed](#requireddefaultvalidation1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredDefaultValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RequiredDefaultValidation1BoxedNumber
data class RequiredDefaultValidation1BoxedNumber<br>
implements [RequiredDefaultValidation1Boxed](#requireddefaultvalidation1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredDefaultValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RequiredDefaultValidation1BoxedString
data class RequiredDefaultValidation1BoxedString<br>
implements [RequiredDefaultValidation1Boxed](#requireddefaultvalidation1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredDefaultValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RequiredDefaultValidation1BoxedList
data class RequiredDefaultValidation1BoxedList<br>
implements [RequiredDefaultValidation1Boxed](#requireddefaultvalidation1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredDefaultValidation1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RequiredDefaultValidation1BoxedMap
data class RequiredDefaultValidation1BoxedMap<br>
implements [RequiredDefaultValidation1Boxed](#requireddefaultvalidation1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredDefaultValidation1BoxedMap([RequiredDefaultValidationMap](#requireddefaultvalidationmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredDefaultValidationMap](#requireddefaultvalidationmap) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RequiredDefaultValidation1
class RequiredDefaultValidation1<br>
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
| [RequiredDefaultValidationMap](#requireddefaultvalidationmap) | validate(arg: [Map&lt;*, *&gt;](#requireddefaultvalidationmapbuilder), configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [RequiredDefaultValidation1BoxedString](#requireddefaultvalidation1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [RequiredDefaultValidation1BoxedVoid](#requireddefaultvalidation1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [RequiredDefaultValidation1BoxedNumber](#requireddefaultvalidation1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [RequiredDefaultValidation1BoxedBoolean](#requireddefaultvalidation1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [RequiredDefaultValidation1BoxedMap](#requireddefaultvalidation1boxedmap) | validateAndBox([Map&lt;*, *&gt;](#requireddefaultvalidationmapbuilder), configuration: SchemaConfiguration) |
| [RequiredDefaultValidation1BoxedList](#requireddefaultvalidation1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [RequiredDefaultValidation1Boxed](#requireddefaultvalidation1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## RequiredDefaultValidationMapBuilder
class RequiredDefaultValidationMapBuilder<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredDefaultValidationMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Any?> | build()<br>Returns map input that should be used with Schema.validate |
| [RequiredDefaultValidationMapBuilder](#requireddefaultvalidationmapbuilder) | foo(value: Nothing?) |
| [RequiredDefaultValidationMapBuilder](#requireddefaultvalidationmapbuilder) | foo(value: Boolean) |
| [RequiredDefaultValidationMapBuilder](#requireddefaultvalidationmapbuilder) | foo(value: String) |
| [RequiredDefaultValidationMapBuilder](#requireddefaultvalidationmapbuilder) | foo(value: Int) |
| [RequiredDefaultValidationMapBuilder](#requireddefaultvalidationmapbuilder) | foo(value: Float) |
| [RequiredDefaultValidationMapBuilder](#requireddefaultvalidationmapbuilder) | foo(value: Long) |
| [RequiredDefaultValidationMapBuilder](#requireddefaultvalidationmapbuilder) | foo(value: Double) |
| [RequiredDefaultValidationMapBuilder](#requireddefaultvalidationmapbuilder) | foo(value: List<Any?>) |
| [RequiredDefaultValidationMapBuilder](#requireddefaultvalidationmapbuilder) | foo(value: Map<String, Any?>) |
| [RequiredDefaultValidationMapBuilder](#requireddefaultvalidationmapbuilder) | additionalProperty(key: String, value: Nothing?) |
| [RequiredDefaultValidationMapBuilder](#requireddefaultvalidationmapbuilder) | additionalProperty(key: String, value: Boolean) |
| [RequiredDefaultValidationMapBuilder](#requireddefaultvalidationmapbuilder) | additionalProperty(key: String, value: String) |
| [RequiredDefaultValidationMapBuilder](#requireddefaultvalidationmapbuilder) | additionalProperty(key: String, value: Int) |
| [RequiredDefaultValidationMapBuilder](#requireddefaultvalidationmapbuilder) | additionalProperty(key: String, value: Float) |
| [RequiredDefaultValidationMapBuilder](#requireddefaultvalidationmapbuilder) | additionalProperty(key: String, value: Long) |
| [RequiredDefaultValidationMapBuilder](#requireddefaultvalidationmapbuilder) | additionalProperty(key: String, value: Double) |
| [RequiredDefaultValidationMapBuilder](#requireddefaultvalidationmapbuilder) | additionalProperty(key: String, value: List<Any?>) |
| [RequiredDefaultValidationMapBuilder](#requireddefaultvalidationmapbuilder) | additionalProperty(key: String, value: Map<String, Any?>) |

## RequiredDefaultValidationMap
class RequiredDefaultValidationMap<br>
extends FrozenMap<String, Any?>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [RequiredDefaultValidationMap](#requireddefaultvalidationmap) | of([Map<String, Any?>](#requireddefaultvalidationmapbuilder) arg, SchemaConfiguration configuration) |
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

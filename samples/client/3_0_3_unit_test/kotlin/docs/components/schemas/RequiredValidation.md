# RequiredValidation
org.openapijsonschematools.client.components.schemas.RequiredValidation.java
class RequiredValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [RequiredValidation.RequiredValidation1Boxed](#requiredvalidation1boxed)<br> sealed interface for validated payloads |
| data class | [RequiredValidation.RequiredValidation1BoxedVoid](#requiredvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [RequiredValidation.RequiredValidation1BoxedBoolean](#requiredvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [RequiredValidation.RequiredValidation1BoxedNumber](#requiredvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [RequiredValidation.RequiredValidation1BoxedString](#requiredvalidation1boxedstring)<br> boxed class to store validated String payloads |
| data class | [RequiredValidation.RequiredValidation1BoxedList](#requiredvalidation1boxedlist)<br> boxed class to store validated List payloads |
| data class | [RequiredValidation.RequiredValidation1BoxedMap](#requiredvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| class | [RequiredValidation.RequiredValidation1](#requiredvalidation1)<br> schema class |
| class | [RequiredValidation.RequiredValidationMapBuilder](#requiredvalidationmapbuilder)<br> builder for Map payloads |
| class | [RequiredValidation.RequiredValidationMap](#requiredvalidationmap)<br> output class for Map payloads |
| sealed interface | [RequiredValidation.BarBoxed](#barboxed)<br> sealed interface for validated payloads |
| data class | [RequiredValidation.BarBoxedVoid](#barboxedvoid)<br> boxed class to store validated null payloads |
| data class | [RequiredValidation.BarBoxedBoolean](#barboxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [RequiredValidation.BarBoxedNumber](#barboxednumber)<br> boxed class to store validated Number payloads |
| data class | [RequiredValidation.BarBoxedString](#barboxedstring)<br> boxed class to store validated String payloads |
| data class | [RequiredValidation.BarBoxedList](#barboxedlist)<br> boxed class to store validated List payloads |
| data class | [RequiredValidation.BarBoxedMap](#barboxedmap)<br> boxed class to store validated Map payloads |
| class | [RequiredValidation.Bar](#bar)<br> schema class |
| sealed interface | [RequiredValidation.FooBoxed](#fooboxed)<br> sealed interface for validated payloads |
| data class | [RequiredValidation.FooBoxedVoid](#fooboxedvoid)<br> boxed class to store validated null payloads |
| data class | [RequiredValidation.FooBoxedBoolean](#fooboxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [RequiredValidation.FooBoxedNumber](#fooboxednumber)<br> boxed class to store validated Number payloads |
| data class | [RequiredValidation.FooBoxedString](#fooboxedstring)<br> boxed class to store validated String payloads |
| data class | [RequiredValidation.FooBoxedList](#fooboxedlist)<br> boxed class to store validated List payloads |
| data class | [RequiredValidation.FooBoxedMap](#fooboxedmap)<br> boxed class to store validated Map payloads |
| class | [RequiredValidation.Foo](#foo)<br> schema class |

## RequiredValidation1Boxed
sealed interface RequiredValidation1Boxed<br>
permits<br>
[RequiredValidation1BoxedVoid](#requiredvalidation1boxedvoid),
[RequiredValidation1BoxedBoolean](#requiredvalidation1boxedboolean),
[RequiredValidation1BoxedNumber](#requiredvalidation1boxednumber),
[RequiredValidation1BoxedString](#requiredvalidation1boxedstring),
[RequiredValidation1BoxedList](#requiredvalidation1boxedlist),
[RequiredValidation1BoxedMap](#requiredvalidation1boxedmap)

sealed interface that stores validated payloads using boxed classes

## RequiredValidation1BoxedVoid
data class RequiredValidation1BoxedVoid<br>
implements [RequiredValidation1Boxed](#requiredvalidation1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredValidation1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RequiredValidation1BoxedBoolean
data class RequiredValidation1BoxedBoolean<br>
implements [RequiredValidation1Boxed](#requiredvalidation1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RequiredValidation1BoxedNumber
data class RequiredValidation1BoxedNumber<br>
implements [RequiredValidation1Boxed](#requiredvalidation1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RequiredValidation1BoxedString
data class RequiredValidation1BoxedString<br>
implements [RequiredValidation1Boxed](#requiredvalidation1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RequiredValidation1BoxedList
data class RequiredValidation1BoxedList<br>
implements [RequiredValidation1Boxed](#requiredvalidation1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredValidation1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RequiredValidation1BoxedMap
data class RequiredValidation1BoxedMap<br>
implements [RequiredValidation1Boxed](#requiredvalidation1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredValidation1BoxedMap([RequiredValidationMap](#requiredvalidationmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredValidationMap](#requiredvalidationmap) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RequiredValidation1
class RequiredValidation1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = mapOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo" to [Foo::class.java](#foo)),<br>&nbsp;&nbsp;&nbsp;&nbsp;"bar" to [Bar::class.java](#bar))<br>)<br> |
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
| [RequiredValidationMap](#requiredvalidationmap) | validate(arg: [Map&lt;*, *&gt;](#requiredvalidationmapbuilder), configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [RequiredValidation1BoxedString](#requiredvalidation1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [RequiredValidation1BoxedVoid](#requiredvalidation1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [RequiredValidation1BoxedNumber](#requiredvalidation1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [RequiredValidation1BoxedBoolean](#requiredvalidation1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [RequiredValidation1BoxedMap](#requiredvalidation1boxedmap) | validateAndBox([Map&lt;*, *&gt;](#requiredvalidationmapbuilder), configuration: SchemaConfiguration) |
| [RequiredValidation1BoxedList](#requiredvalidation1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [RequiredValidation1Boxed](#requiredvalidation1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## RequiredValidationMap0Builder
class RequiredValidationMap0Builder<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredValidationMap0Builder(Map<String, Any?> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Any?> | build()<br>Returns map input that should be used with Schema.validate |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | bar(value: Nothing?) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | bar(value: Boolean) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | bar(value: String) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | bar(value: Int) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | bar(value: Float) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | bar(value: Long) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | bar(value: Double) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | bar(value: List<Any?>) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | bar(value: Map<String, Any?>) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | additionalProperty(key: String, value: Nothing?) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | additionalProperty(key: String, value: Boolean) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | additionalProperty(key: String, value: String) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | additionalProperty(key: String, value: Int) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | additionalProperty(key: String, value: Float) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | additionalProperty(key: String, value: Long) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | additionalProperty(key: String, value: Double) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | additionalProperty(key: String, value: List<Any?>) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | additionalProperty(key: String, value: Map<String, Any?>) |

## RequiredValidationMapBuilder
class RequiredValidationMapBuilder<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredValidationMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | foo(value: Nothing?) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | foo(value: Boolean) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | foo(value: String) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | foo(value: Int) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | foo(value: Float) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | foo(value: Long) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | foo(value: Double) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | foo(value: List<Any?>) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | foo(value: Map<String, Any?>) |

## RequiredValidationMap
class RequiredValidationMap<br>
extends FrozenMap<String, Any?>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [RequiredValidationMap](#requiredvalidationmap) | of([Map<String, Any?>](#requiredvalidationmapbuilder) arg, SchemaConfiguration configuration) |
| Any? | foo()<br> |
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

data class that stores validated boolean payloads, sealed permits implementation

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

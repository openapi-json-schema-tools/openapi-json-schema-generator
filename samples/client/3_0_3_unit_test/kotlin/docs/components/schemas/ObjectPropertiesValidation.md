# ObjectPropertiesValidation
org.openapijsonschematools.client.components.schemas.ObjectPropertiesValidation.java
class ObjectPropertiesValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ObjectPropertiesValidation.ObjectPropertiesValidation1Boxed](#objectpropertiesvalidation1boxed)<br> sealed interface for validated payloads |
| record | [ObjectPropertiesValidation.ObjectPropertiesValidation1BoxedVoid](#objectpropertiesvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| record | [ObjectPropertiesValidation.ObjectPropertiesValidation1BoxedBoolean](#objectpropertiesvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [ObjectPropertiesValidation.ObjectPropertiesValidation1BoxedNumber](#objectpropertiesvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| record | [ObjectPropertiesValidation.ObjectPropertiesValidation1BoxedString](#objectpropertiesvalidation1boxedstring)<br> boxed class to store validated String payloads |
| record | [ObjectPropertiesValidation.ObjectPropertiesValidation1BoxedList](#objectpropertiesvalidation1boxedlist)<br> boxed class to store validated List payloads |
| record | [ObjectPropertiesValidation.ObjectPropertiesValidation1BoxedMap](#objectpropertiesvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ObjectPropertiesValidation.ObjectPropertiesValidation1](#objectpropertiesvalidation1)<br> schema class |
| static class | [ObjectPropertiesValidation.ObjectPropertiesValidationMapBuilder](#objectpropertiesvalidationmapbuilder)<br> builder for Map payloads |
| static class | [ObjectPropertiesValidation.ObjectPropertiesValidationMap](#objectpropertiesvalidationmap)<br> output class for Map payloads |
| sealed interface | [ObjectPropertiesValidation.BarBoxed](#barboxed)<br> sealed interface for validated payloads |
| record | [ObjectPropertiesValidation.BarBoxedString](#barboxedstring)<br> boxed class to store validated String payloads |
| static class | [ObjectPropertiesValidation.Bar](#bar)<br> schema class |
| sealed interface | [ObjectPropertiesValidation.FooBoxed](#fooboxed)<br> sealed interface for validated payloads |
| record | [ObjectPropertiesValidation.FooBoxedNumber](#fooboxednumber)<br> boxed class to store validated Number payloads |
| static class | [ObjectPropertiesValidation.Foo](#foo)<br> schema class |

## ObjectPropertiesValidation1Boxed
sealed interface ObjectPropertiesValidation1Boxed<br>
permits<br>
[ObjectPropertiesValidation1BoxedVoid](#objectpropertiesvalidation1boxedvoid),
[ObjectPropertiesValidation1BoxedBoolean](#objectpropertiesvalidation1boxedboolean),
[ObjectPropertiesValidation1BoxedNumber](#objectpropertiesvalidation1boxednumber),
[ObjectPropertiesValidation1BoxedString](#objectpropertiesvalidation1boxedstring),
[ObjectPropertiesValidation1BoxedList](#objectpropertiesvalidation1boxedlist),
[ObjectPropertiesValidation1BoxedMap](#objectpropertiesvalidation1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ObjectPropertiesValidation1BoxedVoid
data class ObjectPropertiesValidation1BoxedVoid<br>
implements [ObjectPropertiesValidation1Boxed](#objectpropertiesvalidation1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectPropertiesValidation1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ObjectPropertiesValidation1BoxedBoolean
data class ObjectPropertiesValidation1BoxedBoolean<br>
implements [ObjectPropertiesValidation1Boxed](#objectpropertiesvalidation1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectPropertiesValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ObjectPropertiesValidation1BoxedNumber
data class ObjectPropertiesValidation1BoxedNumber<br>
implements [ObjectPropertiesValidation1Boxed](#objectpropertiesvalidation1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectPropertiesValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ObjectPropertiesValidation1BoxedString
data class ObjectPropertiesValidation1BoxedString<br>
implements [ObjectPropertiesValidation1Boxed](#objectpropertiesvalidation1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectPropertiesValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ObjectPropertiesValidation1BoxedList
data class ObjectPropertiesValidation1BoxedList<br>
implements [ObjectPropertiesValidation1Boxed](#objectpropertiesvalidation1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectPropertiesValidation1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ObjectPropertiesValidation1BoxedMap
data class ObjectPropertiesValidation1BoxedMap<br>
implements [ObjectPropertiesValidation1Boxed](#objectpropertiesvalidation1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectPropertiesValidation1BoxedMap([ObjectPropertiesValidationMap](#objectpropertiesvalidationmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ObjectPropertiesValidationMap](#objectpropertiesvalidationmap) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ObjectPropertiesValidation1
class ObjectPropertiesValidation1<br>
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
| [ObjectPropertiesValidationMap](#objectpropertiesvalidationmap) | validate(arg: [Map&lt;*, *&gt;](#objectpropertiesvalidationmapbuilder), configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [ObjectPropertiesValidation1BoxedString](#objectpropertiesvalidation1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [ObjectPropertiesValidation1BoxedVoid](#objectpropertiesvalidation1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [ObjectPropertiesValidation1BoxedNumber](#objectpropertiesvalidation1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [ObjectPropertiesValidation1BoxedBoolean](#objectpropertiesvalidation1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [ObjectPropertiesValidation1BoxedMap](#objectpropertiesvalidation1boxedmap) | validateAndBox([Map&lt;*, *&gt;](#objectpropertiesvalidationmapbuilder), configuration: SchemaConfiguration) |
| [ObjectPropertiesValidation1BoxedList](#objectpropertiesvalidation1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [ObjectPropertiesValidation1Boxed](#objectpropertiesvalidation1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## ObjectPropertiesValidationMapBuilder
class ObjectPropertiesValidationMapBuilder<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectPropertiesValidationMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Any?> | build()<br>Returns map input that should be used with Schema.validate |
| [ObjectPropertiesValidationMapBuilder](#objectpropertiesvalidationmapbuilder) | foo(value: Int) |
| [ObjectPropertiesValidationMapBuilder](#objectpropertiesvalidationmapbuilder) | foo(value: Float) |
| [ObjectPropertiesValidationMapBuilder](#objectpropertiesvalidationmapbuilder) | foo(value: Long) |
| [ObjectPropertiesValidationMapBuilder](#objectpropertiesvalidationmapbuilder) | foo(value: Double) |
| [ObjectPropertiesValidationMapBuilder](#objectpropertiesvalidationmapbuilder) | bar(value: String) |
| [ObjectPropertiesValidationMapBuilder](#objectpropertiesvalidationmapbuilder) | additionalProperty(key: String, value: Nothing?) |
| [ObjectPropertiesValidationMapBuilder](#objectpropertiesvalidationmapbuilder) | additionalProperty(key: String, value: Boolean) |
| [ObjectPropertiesValidationMapBuilder](#objectpropertiesvalidationmapbuilder) | additionalProperty(key: String, value: String) |
| [ObjectPropertiesValidationMapBuilder](#objectpropertiesvalidationmapbuilder) | additionalProperty(key: String, value: Int) |
| [ObjectPropertiesValidationMapBuilder](#objectpropertiesvalidationmapbuilder) | additionalProperty(key: String, value: Float) |
| [ObjectPropertiesValidationMapBuilder](#objectpropertiesvalidationmapbuilder) | additionalProperty(key: String, value: Long) |
| [ObjectPropertiesValidationMapBuilder](#objectpropertiesvalidationmapbuilder) | additionalProperty(key: String, value: Double) |
| [ObjectPropertiesValidationMapBuilder](#objectpropertiesvalidationmapbuilder) | additionalProperty(key: String, value: List<Any?>) |
| [ObjectPropertiesValidationMapBuilder](#objectpropertiesvalidationmapbuilder) | additionalProperty(key: String, value: Map<String, Any?>) |

## ObjectPropertiesValidationMap
class ObjectPropertiesValidationMap<br>
extends FrozenMap<String, Any?>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectPropertiesValidationMap](#objectpropertiesvalidationmap) | of([Map<String, Any?>](#objectpropertiesvalidationmapbuilder) arg, SchemaConfiguration configuration) |
| Number | foo()<br>[optional] |
| String | bar()<br>[optional] |
| Any? | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## BarBoxed
sealed interface BarBoxed<br>
permits<br>
[BarBoxedString](#barboxedstring)

sealed interface that stores validated payloads using boxed classes

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

## Bar
class Bar<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
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

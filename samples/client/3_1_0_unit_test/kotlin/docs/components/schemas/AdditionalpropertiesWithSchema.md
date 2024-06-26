# AdditionalpropertiesWithSchema
org.openapijsonschematools.client.components.schemas.AdditionalpropertiesWithSchema.java
class AdditionalpropertiesWithSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [AdditionalpropertiesWithSchema.AdditionalpropertiesWithSchema1Boxed](#additionalpropertieswithschema1boxed)<br> sealed interface for validated payloads |
| data class | [AdditionalpropertiesWithSchema.AdditionalpropertiesWithSchema1BoxedMap](#additionalpropertieswithschema1boxedmap)<br> boxed class to store validated Map payloads |
| class | [AdditionalpropertiesWithSchema.AdditionalpropertiesWithSchema1](#additionalpropertieswithschema1)<br> schema class |
| class | [AdditionalpropertiesWithSchema.AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder)<br> builder for Map payloads |
| class | [AdditionalpropertiesWithSchema.AdditionalpropertiesWithSchemaMap](#additionalpropertieswithschemamap)<br> output class for Map payloads |
| sealed interface | [AdditionalpropertiesWithSchema.BarBoxed](#barboxed)<br> sealed interface for validated payloads |
| data class | [AdditionalpropertiesWithSchema.BarBoxedVoid](#barboxedvoid)<br> boxed class to store validated null payloads |
| data class | [AdditionalpropertiesWithSchema.BarBoxedBoolean](#barboxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [AdditionalpropertiesWithSchema.BarBoxedNumber](#barboxednumber)<br> boxed class to store validated Number payloads |
| data class | [AdditionalpropertiesWithSchema.BarBoxedString](#barboxedstring)<br> boxed class to store validated String payloads |
| data class | [AdditionalpropertiesWithSchema.BarBoxedList](#barboxedlist)<br> boxed class to store validated List payloads |
| data class | [AdditionalpropertiesWithSchema.BarBoxedMap](#barboxedmap)<br> boxed class to store validated Map payloads |
| class | [AdditionalpropertiesWithSchema.Bar](#bar)<br> schema class |
| sealed interface | [AdditionalpropertiesWithSchema.FooBoxed](#fooboxed)<br> sealed interface for validated payloads |
| data class | [AdditionalpropertiesWithSchema.FooBoxedVoid](#fooboxedvoid)<br> boxed class to store validated null payloads |
| data class | [AdditionalpropertiesWithSchema.FooBoxedBoolean](#fooboxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [AdditionalpropertiesWithSchema.FooBoxedNumber](#fooboxednumber)<br> boxed class to store validated Number payloads |
| data class | [AdditionalpropertiesWithSchema.FooBoxedString](#fooboxedstring)<br> boxed class to store validated String payloads |
| data class | [AdditionalpropertiesWithSchema.FooBoxedList](#fooboxedlist)<br> boxed class to store validated List payloads |
| data class | [AdditionalpropertiesWithSchema.FooBoxedMap](#fooboxedmap)<br> boxed class to store validated Map payloads |
| class | [AdditionalpropertiesWithSchema.Foo](#foo)<br> schema class |
| sealed interface | [AdditionalpropertiesWithSchema.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed interface for validated payloads |
| data class | [AdditionalpropertiesWithSchema.AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| class | [AdditionalpropertiesWithSchema.AdditionalProperties](#additionalproperties)<br> schema class |

## AdditionalpropertiesWithSchema1Boxed
sealed interface AdditionalpropertiesWithSchema1Boxed<br>
permits<br>
[AdditionalpropertiesWithSchema1BoxedMap](#additionalpropertieswithschema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## AdditionalpropertiesWithSchema1BoxedMap
data class AdditionalpropertiesWithSchema1BoxedMap<br>
implements [AdditionalpropertiesWithSchema1Boxed](#additionalpropertieswithschema1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesWithSchema1BoxedMap([AdditionalpropertiesWithSchemaMap](#additionalpropertieswithschemamap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AdditionalpropertiesWithSchemaMap](#additionalpropertieswithschemamap) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalpropertiesWithSchema1
class AdditionalpropertiesWithSchema1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.validation.FrozenList
import org.openapijsonschematools.client.schemas.validation.FrozenMap
import org.openapijsonschematools.client.components.schemas.AdditionalpropertiesWithSchema

val configuration = SchemaConfiguration()

// Map validation
val validatedPayload: AdditionalpropertiesWithSchema.AdditionalpropertiesWithSchemaMap =
    AdditionalpropertiesWithSchema.AdditionalpropertiesWithSchema1.validate(
    AdditionalpropertiesWithSchema.AdditionalpropertiesWithSchemaMapBuilder()
        .additionalProperty("someAdditionalProperty", true)

    .build(),
    configuration
)
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = setOf(Map::class.java) |
| Map<String, Class<? extends JsonSchema>> | properties = mapOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo" to [Foo::class.java](#foo)),<br>&nbsp;&nbsp;&nbsp;&nbsp;"bar" to [Bar::class.java](#bar))<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties::class.java](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AdditionalpropertiesWithSchemaMap](#additionalpropertieswithschemamap) | validate(arg: [Map&lt;*, *&gt;](#additionalpropertieswithschemamapbuilder), configuration: SchemaConfiguration) |
| [AdditionalpropertiesWithSchema1BoxedMap](#additionalpropertieswithschema1boxedmap) | validateAndBox([Map&lt;*, *&gt;](#additionalpropertieswithschemamapbuilder), configuration: SchemaConfiguration) |
| [AdditionalpropertiesWithSchema1Boxed](#additionalpropertieswithschema1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## AdditionalpropertiesWithSchemaMapBuilder
class AdditionalpropertiesWithSchemaMapBuilder<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesWithSchemaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Any?> | build()<br>Returns map input that should be used with Schema.validate |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | foo(value: Nothing?) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | foo(value: Boolean) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | foo(value: String) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | foo(value: Int) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | foo(value: Float) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | foo(value: Long) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | foo(value: Double) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | foo(value: List<Any?>) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | foo(value: Map<String, Any?>) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | bar(value: Nothing?) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | bar(value: Boolean) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | bar(value: String) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | bar(value: Int) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | bar(value: Float) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | bar(value: Long) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | bar(value: Double) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | bar(value: List<Any?>) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | bar(value: Map<String, Any?>) |
| [AdditionalpropertiesWithSchemaMapBuilder](#additionalpropertieswithschemamapbuilder) | additionalProperty(key: String, value: Boolean) |

## AdditionalpropertiesWithSchemaMap
class AdditionalpropertiesWithSchemaMap<br>
extends FrozenMap<String, Any?>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AdditionalpropertiesWithSchemaMap](#additionalpropertieswithschemamap) | of([Map<String, Any?>](#additionalpropertieswithschemamapbuilder) arg, SchemaConfiguration configuration) |
| Any? | foo()<br>[optional] |
| Any? | bar()<br>[optional] |
| Boolean | getAdditionalProperty(String name)<br>provides type safety for additional properties |

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

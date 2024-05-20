# UnevaluatedpropertiesWithAdjacentAdditionalproperties
org.openapijsonschematools.client.components.schemas.UnevaluatedpropertiesWithAdjacentAdditionalproperties.java
class UnevaluatedpropertiesWithAdjacentAdditionalproperties<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedpropertiesWithAdjacentAdditionalproperties1Boxed](#unevaluatedpropertieswithadjacentadditionalproperties1boxed)<br> sealed interface for validated payloads |
| record | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedpropertiesWithAdjacentAdditionalproperties1BoxedMap](#unevaluatedpropertieswithadjacentadditionalproperties1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedpropertiesWithAdjacentAdditionalproperties1](#unevaluatedpropertieswithadjacentadditionalproperties1)<br> schema class |
| sealed interface | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedPropertiesBoxed](#unevaluatedpropertiesboxed)<br> sealed interface for validated payloads |
| record | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedPropertiesBoxedVoid](#unevaluatedpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedPropertiesBoxedBoolean](#unevaluatedpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedPropertiesBoxedNumber](#unevaluatedpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedPropertiesBoxedString](#unevaluatedpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedPropertiesBoxedList](#unevaluatedpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedPropertiesBoxedMap](#unevaluatedpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedProperties](#unevaluatedproperties)<br> schema class |
| static class | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder)<br> builder for Map payloads |
| static class | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMap](#unevaluatedpropertieswithadjacentadditionalpropertiesmap)<br> output class for Map payloads |
| sealed interface | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.FooBoxed](#fooboxed)<br> sealed interface for validated payloads |
| record | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.FooBoxedString](#fooboxedstring)<br> boxed class to store validated String payloads |
| static class | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.Foo](#foo)<br> schema class |
| sealed interface | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [UnevaluatedpropertiesWithAdjacentAdditionalproperties.AdditionalProperties](#additionalproperties)<br> schema class |

## UnevaluatedpropertiesWithAdjacentAdditionalproperties1Boxed
sealed interface UnevaluatedpropertiesWithAdjacentAdditionalproperties1Boxed<br>
permits<br>
[UnevaluatedpropertiesWithAdjacentAdditionalproperties1BoxedMap](#unevaluatedpropertieswithadjacentadditionalproperties1boxedmap)

sealed interface that stores validated payloads using boxed classes

## UnevaluatedpropertiesWithAdjacentAdditionalproperties1BoxedMap
data class UnevaluatedpropertiesWithAdjacentAdditionalproperties1BoxedMap<br>
implements [UnevaluatedpropertiesWithAdjacentAdditionalproperties1Boxed](#unevaluatedpropertieswithadjacentadditionalproperties1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesWithAdjacentAdditionalproperties1BoxedMap([UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMap](#unevaluatedpropertieswithadjacentadditionalpropertiesmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMap](#unevaluatedpropertieswithadjacentadditionalpropertiesmap) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluatedpropertiesWithAdjacentAdditionalproperties1
class UnevaluatedpropertiesWithAdjacentAdditionalproperties1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.validation.MapUtils
import org.openapijsonschematools.client.schemas.validation.FrozenList
import org.openapijsonschematools.client.schemas.validation.FrozenMap
import org.openapijsonschematools.client.components.schemas.UnevaluatedpropertiesWithAdjacentAdditionalproperties

val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())

// Map validation
val validatedPayload: UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMap =
    UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedpropertiesWithAdjacentAdditionalproperties1.validate(
    UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder()
        .foo("a")

    .build(),
    configuration
)
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = setOf(Map::class.java) |
| Map<String, Class<? extends JsonSchema>> | properties = mapOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo" to [Foo::class.java](#foo))<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties::class.java](#additionalproperties) |
| Class<? extends JsonSchema> | unevaluatedProperties = [UnevaluatedProperties::class.java](#unevaluatedproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMap](#unevaluatedpropertieswithadjacentadditionalpropertiesmap) | validate(arg: [Map&lt;*, *&gt;](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder), configuration: SchemaConfiguration) |
| [UnevaluatedpropertiesWithAdjacentAdditionalproperties1BoxedMap](#unevaluatedpropertieswithadjacentadditionalproperties1boxedmap) | validateAndBox([Map&lt;*, *&gt;](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder), configuration: SchemaConfiguration) |
| [UnevaluatedpropertiesWithAdjacentAdditionalproperties1Boxed](#unevaluatedpropertieswithadjacentadditionalproperties1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## UnevaluatedPropertiesBoxed
sealed interface UnevaluatedPropertiesBoxed<br>
permits<br>
[UnevaluatedPropertiesBoxedVoid](#unevaluatedpropertiesboxedvoid),
[UnevaluatedPropertiesBoxedBoolean](#unevaluatedpropertiesboxedboolean),
[UnevaluatedPropertiesBoxedNumber](#unevaluatedpropertiesboxednumber),
[UnevaluatedPropertiesBoxedString](#unevaluatedpropertiesboxedstring),
[UnevaluatedPropertiesBoxedList](#unevaluatedpropertiesboxedlist),
[UnevaluatedPropertiesBoxedMap](#unevaluatedpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## UnevaluatedPropertiesBoxedVoid
data class UnevaluatedPropertiesBoxedVoid<br>
implements [UnevaluatedPropertiesBoxed](#unevaluatedpropertiesboxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedPropertiesBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluatedPropertiesBoxedBoolean
data class UnevaluatedPropertiesBoxedBoolean<br>
implements [UnevaluatedPropertiesBoxed](#unevaluatedpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluatedPropertiesBoxedNumber
data class UnevaluatedPropertiesBoxedNumber<br>
implements [UnevaluatedPropertiesBoxed](#unevaluatedpropertiesboxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluatedPropertiesBoxedString
data class UnevaluatedPropertiesBoxedString<br>
implements [UnevaluatedPropertiesBoxed](#unevaluatedpropertiesboxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluatedPropertiesBoxedList
data class UnevaluatedPropertiesBoxedList<br>
implements [UnevaluatedPropertiesBoxed](#unevaluatedpropertiesboxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedPropertiesBoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluatedPropertiesBoxedMap
data class UnevaluatedPropertiesBoxedMap<br>
implements [UnevaluatedPropertiesBoxed](#unevaluatedpropertiesboxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedPropertiesBoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluatedProperties
class UnevaluatedProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder
class UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Any?> | build()<br>Returns map input that should be used with Schema.validate |
| [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder) | foo(value: String) |
| [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder) | additionalProperty(key: String, value: Nothing?) |
| [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder) | additionalProperty(key: String, value: Boolean) |
| [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder) | additionalProperty(key: String, value: String) |
| [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder) | additionalProperty(key: String, value: Int) |
| [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder) | additionalProperty(key: String, value: Float) |
| [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder) | additionalProperty(key: String, value: Long) |
| [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder) | additionalProperty(key: String, value: Double) |
| [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder) | additionalProperty(key: String, value: List<Any?>) |
| [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder) | additionalProperty(key: String, value: Map<String, Any?>) |

## UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMap
class UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMap<br>
extends FrozenMap<String, Any?>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMap](#unevaluatedpropertieswithadjacentadditionalpropertiesmap) | of([Map<String, Any?>](#unevaluatedpropertieswithadjacentadditionalpropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| String | foo()<br>[optional] |
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

## AdditionalPropertiesBoxed
sealed interface AdditionalPropertiesBoxed<br>
permits<br>
[AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid),
[AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean),
[AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber),
[AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring),
[AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist),
[AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## AdditionalPropertiesBoxedVoid
data class AdditionalPropertiesBoxedVoid<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

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

## AdditionalPropertiesBoxedNumber
data class AdditionalPropertiesBoxedNumber<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalPropertiesBoxedString
data class AdditionalPropertiesBoxedString<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalPropertiesBoxedList
data class AdditionalPropertiesBoxedList<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalPropertiesBoxedMap
data class AdditionalPropertiesBoxedMap<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalProperties
class AdditionalProperties<br>
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

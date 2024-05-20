# AdditionalpropertiesAllowsASchemaWhichShouldValidate
org.openapijsonschematools.client.components.schemas.AdditionalpropertiesAllowsASchemaWhichShouldValidate.java
class AdditionalpropertiesAllowsASchemaWhichShouldValidate<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [AdditionalpropertiesAllowsASchemaWhichShouldValidate.AdditionalpropertiesAllowsASchemaWhichShouldValidate1Boxed](#additionalpropertiesallowsaschemawhichshouldvalidate1boxed)<br> sealed interface for validated payloads |
| record | [AdditionalpropertiesAllowsASchemaWhichShouldValidate.AdditionalpropertiesAllowsASchemaWhichShouldValidate1BoxedMap](#additionalpropertiesallowsaschemawhichshouldvalidate1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalpropertiesAllowsASchemaWhichShouldValidate.AdditionalpropertiesAllowsASchemaWhichShouldValidate1](#additionalpropertiesallowsaschemawhichshouldvalidate1)<br> schema class |
| static class | [AdditionalpropertiesAllowsASchemaWhichShouldValidate.AdditionalpropertiesAllowsASchemaWhichShouldValidateMapBuilder](#additionalpropertiesallowsaschemawhichshouldvalidatemapbuilder)<br> builder for Map payloads |
| static class | [AdditionalpropertiesAllowsASchemaWhichShouldValidate.AdditionalpropertiesAllowsASchemaWhichShouldValidateMap](#additionalpropertiesallowsaschemawhichshouldvalidatemap)<br> output class for Map payloads |
| sealed interface | [AdditionalpropertiesAllowsASchemaWhichShouldValidate.BarBoxed](#barboxed)<br> sealed interface for validated payloads |
| record | [AdditionalpropertiesAllowsASchemaWhichShouldValidate.BarBoxedVoid](#barboxedvoid)<br> boxed class to store validated null payloads |
| record | [AdditionalpropertiesAllowsASchemaWhichShouldValidate.BarBoxedBoolean](#barboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AdditionalpropertiesAllowsASchemaWhichShouldValidate.BarBoxedNumber](#barboxednumber)<br> boxed class to store validated Number payloads |
| record | [AdditionalpropertiesAllowsASchemaWhichShouldValidate.BarBoxedString](#barboxedstring)<br> boxed class to store validated String payloads |
| record | [AdditionalpropertiesAllowsASchemaWhichShouldValidate.BarBoxedList](#barboxedlist)<br> boxed class to store validated List payloads |
| record | [AdditionalpropertiesAllowsASchemaWhichShouldValidate.BarBoxedMap](#barboxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalpropertiesAllowsASchemaWhichShouldValidate.Bar](#bar)<br> schema class |
| sealed interface | [AdditionalpropertiesAllowsASchemaWhichShouldValidate.FooBoxed](#fooboxed)<br> sealed interface for validated payloads |
| record | [AdditionalpropertiesAllowsASchemaWhichShouldValidate.FooBoxedVoid](#fooboxedvoid)<br> boxed class to store validated null payloads |
| record | [AdditionalpropertiesAllowsASchemaWhichShouldValidate.FooBoxedBoolean](#fooboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AdditionalpropertiesAllowsASchemaWhichShouldValidate.FooBoxedNumber](#fooboxednumber)<br> boxed class to store validated Number payloads |
| record | [AdditionalpropertiesAllowsASchemaWhichShouldValidate.FooBoxedString](#fooboxedstring)<br> boxed class to store validated String payloads |
| record | [AdditionalpropertiesAllowsASchemaWhichShouldValidate.FooBoxedList](#fooboxedlist)<br> boxed class to store validated List payloads |
| record | [AdditionalpropertiesAllowsASchemaWhichShouldValidate.FooBoxedMap](#fooboxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalpropertiesAllowsASchemaWhichShouldValidate.Foo](#foo)<br> schema class |
| sealed interface | [AdditionalpropertiesAllowsASchemaWhichShouldValidate.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [AdditionalpropertiesAllowsASchemaWhichShouldValidate.AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [AdditionalpropertiesAllowsASchemaWhichShouldValidate.AdditionalProperties](#additionalproperties)<br> schema class |

## AdditionalpropertiesAllowsASchemaWhichShouldValidate1Boxed
sealed interface AdditionalpropertiesAllowsASchemaWhichShouldValidate1Boxed<br>
permits<br>
[AdditionalpropertiesAllowsASchemaWhichShouldValidate1BoxedMap](#additionalpropertiesallowsaschemawhichshouldvalidate1boxedmap)

sealed interface that stores validated payloads using boxed classes

## AdditionalpropertiesAllowsASchemaWhichShouldValidate1BoxedMap
data class AdditionalpropertiesAllowsASchemaWhichShouldValidate1BoxedMap<br>
implements [AdditionalpropertiesAllowsASchemaWhichShouldValidate1Boxed](#additionalpropertiesallowsaschemawhichshouldvalidate1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesAllowsASchemaWhichShouldValidate1BoxedMap([AdditionalpropertiesAllowsASchemaWhichShouldValidateMap](#additionalpropertiesallowsaschemawhichshouldvalidatemap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AdditionalpropertiesAllowsASchemaWhichShouldValidateMap](#additionalpropertiesallowsaschemawhichshouldvalidatemap) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalpropertiesAllowsASchemaWhichShouldValidate1
class AdditionalpropertiesAllowsASchemaWhichShouldValidate1<br>
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
import org.openapijsonschematools.client.components.schemas.AdditionalpropertiesAllowsASchemaWhichShouldValidate

val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())

// Map validation
val validatedPayload: AdditionalpropertiesAllowsASchemaWhichShouldValidate.AdditionalpropertiesAllowsASchemaWhichShouldValidateMap =
    AdditionalpropertiesAllowsASchemaWhichShouldValidate.AdditionalpropertiesAllowsASchemaWhichShouldValidate1.validate(
    AdditionalpropertiesAllowsASchemaWhichShouldValidate.AdditionalpropertiesAllowsASchemaWhichShouldValidateMapBuilder()
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
| [AdditionalpropertiesAllowsASchemaWhichShouldValidateMap](#additionalpropertiesallowsaschemawhichshouldvalidatemap) | validate(arg: [Map&lt;*, *&gt;](#additionalpropertiesallowsaschemawhichshouldvalidatemapbuilder), configuration: SchemaConfiguration) |
| [AdditionalpropertiesAllowsASchemaWhichShouldValidate1BoxedMap](#additionalpropertiesallowsaschemawhichshouldvalidate1boxedmap) | validateAndBox([Map&lt;*, *&gt;](#additionalpropertiesallowsaschemawhichshouldvalidatemapbuilder), configuration: SchemaConfiguration) |
| [AdditionalpropertiesAllowsASchemaWhichShouldValidate1Boxed](#additionalpropertiesallowsaschemawhichshouldvalidate1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## AdditionalpropertiesAllowsASchemaWhichShouldValidateMapBuilder
class AdditionalpropertiesAllowsASchemaWhichShouldValidateMapBuilder<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesAllowsASchemaWhichShouldValidateMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Any?> | build()<br>Returns map input that should be used with Schema.validate |
| [AdditionalpropertiesAllowsASchemaWhichShouldValidateMapBuilder](#additionalpropertiesallowsaschemawhichshouldvalidatemapbuilder) | foo(value: Nothing?) |
| [AdditionalpropertiesAllowsASchemaWhichShouldValidateMapBuilder](#additionalpropertiesallowsaschemawhichshouldvalidatemapbuilder) | foo(value: Boolean) |
| [AdditionalpropertiesAllowsASchemaWhichShouldValidateMapBuilder](#additionalpropertiesallowsaschemawhichshouldvalidatemapbuilder) | foo(value: String) |
| [AdditionalpropertiesAllowsASchemaWhichShouldValidateMapBuilder](#additionalpropertiesallowsaschemawhichshouldvalidatemapbuilder) | foo(value: Int) |
| [AdditionalpropertiesAllowsASchemaWhichShouldValidateMapBuilder](#additionalpropertiesallowsaschemawhichshouldvalidatemapbuilder) | foo(value: Float) |
| [AdditionalpropertiesAllowsASchemaWhichShouldValidateMapBuilder](#additionalpropertiesallowsaschemawhichshouldvalidatemapbuilder) | foo(value: Long) |
| [AdditionalpropertiesAllowsASchemaWhichShouldValidateMapBuilder](#additionalpropertiesallowsaschemawhichshouldvalidatemapbuilder) | foo(value: Double) |
| [AdditionalpropertiesAllowsASchemaWhichShouldValidateMapBuilder](#additionalpropertiesallowsaschemawhichshouldvalidatemapbuilder) | foo(value: List<Any?>) |
| [AdditionalpropertiesAllowsASchemaWhichShouldValidateMapBuilder](#additionalpropertiesallowsaschemawhichshouldvalidatemapbuilder) | foo(value: Map<String, Any?>) |
| [AdditionalpropertiesAllowsASchemaWhichShouldValidateMapBuilder](#additionalpropertiesallowsaschemawhichshouldvalidatemapbuilder) | bar(value: Nothing?) |
| [AdditionalpropertiesAllowsASchemaWhichShouldValidateMapBuilder](#additionalpropertiesallowsaschemawhichshouldvalidatemapbuilder) | bar(value: Boolean) |
| [AdditionalpropertiesAllowsASchemaWhichShouldValidateMapBuilder](#additionalpropertiesallowsaschemawhichshouldvalidatemapbuilder) | bar(value: String) |
| [AdditionalpropertiesAllowsASchemaWhichShouldValidateMapBuilder](#additionalpropertiesallowsaschemawhichshouldvalidatemapbuilder) | bar(value: Int) |
| [AdditionalpropertiesAllowsASchemaWhichShouldValidateMapBuilder](#additionalpropertiesallowsaschemawhichshouldvalidatemapbuilder) | bar(value: Float) |
| [AdditionalpropertiesAllowsASchemaWhichShouldValidateMapBuilder](#additionalpropertiesallowsaschemawhichshouldvalidatemapbuilder) | bar(value: Long) |
| [AdditionalpropertiesAllowsASchemaWhichShouldValidateMapBuilder](#additionalpropertiesallowsaschemawhichshouldvalidatemapbuilder) | bar(value: Double) |
| [AdditionalpropertiesAllowsASchemaWhichShouldValidateMapBuilder](#additionalpropertiesallowsaschemawhichshouldvalidatemapbuilder) | bar(value: List<Any?>) |
| [AdditionalpropertiesAllowsASchemaWhichShouldValidateMapBuilder](#additionalpropertiesallowsaschemawhichshouldvalidatemapbuilder) | bar(value: Map<String, Any?>) |
| [AdditionalpropertiesAllowsASchemaWhichShouldValidateMapBuilder](#additionalpropertiesallowsaschemawhichshouldvalidatemapbuilder) | additionalProperty(key: String, value: Boolean) |

## AdditionalpropertiesAllowsASchemaWhichShouldValidateMap
class AdditionalpropertiesAllowsASchemaWhichShouldValidateMap<br>
extends FrozenMap<String, Any?>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AdditionalpropertiesAllowsASchemaWhichShouldValidateMap](#additionalpropertiesallowsaschemawhichshouldvalidatemap) | of([Map<String, Any?>](#additionalpropertiesallowsaschemawhichshouldvalidatemapbuilder) arg, SchemaConfiguration configuration) |
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

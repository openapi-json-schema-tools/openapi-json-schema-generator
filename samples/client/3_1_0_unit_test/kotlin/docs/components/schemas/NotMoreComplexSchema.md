# NotMoreComplexSchema
org.openapijsonschematools.client.components.schemas.NotMoreComplexSchema.java
class NotMoreComplexSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [NotMoreComplexSchema.NotMoreComplexSchema1Boxed](#notmorecomplexschema1boxed)<br> sealed interface for validated payloads |
| data class | [NotMoreComplexSchema.NotMoreComplexSchema1BoxedVoid](#notmorecomplexschema1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [NotMoreComplexSchema.NotMoreComplexSchema1BoxedBoolean](#notmorecomplexschema1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [NotMoreComplexSchema.NotMoreComplexSchema1BoxedNumber](#notmorecomplexschema1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [NotMoreComplexSchema.NotMoreComplexSchema1BoxedString](#notmorecomplexschema1boxedstring)<br> boxed class to store validated String payloads |
| data class | [NotMoreComplexSchema.NotMoreComplexSchema1BoxedList](#notmorecomplexschema1boxedlist)<br> boxed class to store validated List payloads |
| data class | [NotMoreComplexSchema.NotMoreComplexSchema1BoxedMap](#notmorecomplexschema1boxedmap)<br> boxed class to store validated Map payloads |
| class | [NotMoreComplexSchema.NotMoreComplexSchema1](#notmorecomplexschema1)<br> schema class |
| sealed interface | [NotMoreComplexSchema.NotBoxed](#notboxed)<br> sealed interface for validated payloads |
| data class | [NotMoreComplexSchema.NotBoxedMap](#notboxedmap)<br> boxed class to store validated Map payloads |
| class | [NotMoreComplexSchema.Not](#not)<br> schema class |
| class | [NotMoreComplexSchema.NotMapBuilder](#notmapbuilder)<br> builder for Map payloads |
| class | [NotMoreComplexSchema.NotMap](#notmap)<br> output class for Map payloads |
| sealed interface | [NotMoreComplexSchema.FooBoxed](#fooboxed)<br> sealed interface for validated payloads |
| data class | [NotMoreComplexSchema.FooBoxedString](#fooboxedstring)<br> boxed class to store validated String payloads |
| class | [NotMoreComplexSchema.Foo](#foo)<br> schema class |

## NotMoreComplexSchema1Boxed
sealed interface NotMoreComplexSchema1Boxed<br>
permits<br>
[NotMoreComplexSchema1BoxedVoid](#notmorecomplexschema1boxedvoid),
[NotMoreComplexSchema1BoxedBoolean](#notmorecomplexschema1boxedboolean),
[NotMoreComplexSchema1BoxedNumber](#notmorecomplexschema1boxednumber),
[NotMoreComplexSchema1BoxedString](#notmorecomplexschema1boxedstring),
[NotMoreComplexSchema1BoxedList](#notmorecomplexschema1boxedlist),
[NotMoreComplexSchema1BoxedMap](#notmorecomplexschema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## NotMoreComplexSchema1BoxedVoid
data class NotMoreComplexSchema1BoxedVoid<br>
implements [NotMoreComplexSchema1Boxed](#notmorecomplexschema1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotMoreComplexSchema1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NotMoreComplexSchema1BoxedBoolean
data class NotMoreComplexSchema1BoxedBoolean<br>
implements [NotMoreComplexSchema1Boxed](#notmorecomplexschema1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotMoreComplexSchema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NotMoreComplexSchema1BoxedNumber
data class NotMoreComplexSchema1BoxedNumber<br>
implements [NotMoreComplexSchema1Boxed](#notmorecomplexschema1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotMoreComplexSchema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NotMoreComplexSchema1BoxedString
data class NotMoreComplexSchema1BoxedString<br>
implements [NotMoreComplexSchema1Boxed](#notmorecomplexschema1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotMoreComplexSchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NotMoreComplexSchema1BoxedList
data class NotMoreComplexSchema1BoxedList<br>
implements [NotMoreComplexSchema1Boxed](#notmorecomplexschema1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotMoreComplexSchema1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NotMoreComplexSchema1BoxedMap
data class NotMoreComplexSchema1BoxedMap<br>
implements [NotMoreComplexSchema1Boxed](#notmorecomplexschema1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotMoreComplexSchema1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NotMoreComplexSchema1
class NotMoreComplexSchema1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | not = [Not::class.java](#not) |

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
| FrozenMap<Any?> | validate(arg: Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [NotMoreComplexSchema1BoxedString](#notmorecomplexschema1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [NotMoreComplexSchema1BoxedVoid](#notmorecomplexschema1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [NotMoreComplexSchema1BoxedNumber](#notmorecomplexschema1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [NotMoreComplexSchema1BoxedBoolean](#notmorecomplexschema1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [NotMoreComplexSchema1BoxedMap](#notmorecomplexschema1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [NotMoreComplexSchema1BoxedList](#notmorecomplexschema1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [NotMoreComplexSchema1Boxed](#notmorecomplexschema1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## NotBoxed
sealed interface NotBoxed<br>
permits<br>
[NotBoxedMap](#notboxedmap)

sealed interface that stores validated payloads using boxed classes

## NotBoxedMap
data class NotBoxedMap<br>
implements [NotBoxed](#notboxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotBoxedMap([NotMap](#notmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [NotMap](#notmap) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Not
class Not<br>
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
import org.openapijsonschematools.client.components.schemas.NotMoreComplexSchema

val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())

// Map validation
val validatedPayload: NotMoreComplexSchema.NotMap =
    NotMoreComplexSchema.Not.validate(
    NotMoreComplexSchema.NotMapBuilder()
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

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [NotMap](#notmap) | validate(arg: [Map&lt;*, *&gt;](#notmapbuilder), configuration: SchemaConfiguration) |
| [NotBoxedMap](#notboxedmap) | validateAndBox([Map&lt;*, *&gt;](#notmapbuilder), configuration: SchemaConfiguration) |
| [NotBoxed](#notboxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## NotMapBuilder
class NotMapBuilder<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Any?> | build()<br>Returns map input that should be used with Schema.validate |
| [NotMapBuilder](#notmapbuilder) | foo(value: String) |
| [NotMapBuilder](#notmapbuilder) | additionalProperty(key: String, value: Nothing?) |
| [NotMapBuilder](#notmapbuilder) | additionalProperty(key: String, value: Boolean) |
| [NotMapBuilder](#notmapbuilder) | additionalProperty(key: String, value: String) |
| [NotMapBuilder](#notmapbuilder) | additionalProperty(key: String, value: Int) |
| [NotMapBuilder](#notmapbuilder) | additionalProperty(key: String, value: Float) |
| [NotMapBuilder](#notmapbuilder) | additionalProperty(key: String, value: Long) |
| [NotMapBuilder](#notmapbuilder) | additionalProperty(key: String, value: Double) |
| [NotMapBuilder](#notmapbuilder) | additionalProperty(key: String, value: List<Any?>) |
| [NotMapBuilder](#notmapbuilder) | additionalProperty(key: String, value: Map<String, Any?>) |

## NotMap
class NotMap<br>
extends FrozenMap<String, Any?>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [NotMap](#notmap) | of([Map<String, Any?>](#notmapbuilder) arg, SchemaConfiguration configuration) |
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

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

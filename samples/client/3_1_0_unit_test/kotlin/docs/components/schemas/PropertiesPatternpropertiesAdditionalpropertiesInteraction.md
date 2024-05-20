# PropertiesPatternpropertiesAdditionalpropertiesInteraction
org.openapijsonschematools.client.components.schemas.PropertiesPatternpropertiesAdditionalpropertiesInteraction.java
class PropertiesPatternpropertiesAdditionalpropertiesInteraction<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteraction1Boxed](#propertiespatternpropertiesadditionalpropertiesinteraction1boxed)<br> sealed interface for validated payloads |
| data class | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteraction1BoxedMap](#propertiespatternpropertiesadditionalpropertiesinteraction1boxedmap)<br> boxed class to store validated Map payloads |
| class | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteraction1](#propertiespatternpropertiesadditionalpropertiesinteraction1)<br> schema class |
| class | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteractionMapBuilder](#propertiespatternpropertiesadditionalpropertiesinteractionmapbuilder)<br> builder for Map payloads |
| class | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteractionMap](#propertiespatternpropertiesadditionalpropertiesinteractionmap)<br> output class for Map payloads |
| sealed interface | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.BarBoxed](#barboxed)<br> sealed interface for validated payloads |
| data class | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.BarBoxedList](#barboxedlist)<br> boxed class to store validated List payloads |
| class | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.Bar](#bar)<br> schema class |
| sealed interface | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.FooBoxed](#fooboxed)<br> sealed interface for validated payloads |
| data class | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.FooBoxedList](#fooboxedlist)<br> boxed class to store validated List payloads |
| class | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.Foo](#foo)<br> schema class |
| sealed interface | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.FoBoxed](#foboxed)<br> sealed interface for validated payloads |
| data class | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.FoBoxedVoid](#foboxedvoid)<br> boxed class to store validated null payloads |
| data class | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.FoBoxedBoolean](#foboxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.FoBoxedNumber](#foboxednumber)<br> boxed class to store validated Number payloads |
| data class | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.FoBoxedString](#foboxedstring)<br> boxed class to store validated String payloads |
| data class | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.FoBoxedList](#foboxedlist)<br> boxed class to store validated List payloads |
| data class | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.FoBoxedMap](#foboxedmap)<br> boxed class to store validated Map payloads |
| class | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.Fo](#fo)<br> schema class |
| sealed interface | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed interface for validated payloads |
| data class | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| class | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.AdditionalProperties](#additionalproperties)<br> schema class |

## PropertiesPatternpropertiesAdditionalpropertiesInteraction1Boxed
sealed interface PropertiesPatternpropertiesAdditionalpropertiesInteraction1Boxed<br>
permits<br>
[PropertiesPatternpropertiesAdditionalpropertiesInteraction1BoxedMap](#propertiespatternpropertiesadditionalpropertiesinteraction1boxedmap)

sealed interface that stores validated payloads using boxed classes

## PropertiesPatternpropertiesAdditionalpropertiesInteraction1BoxedMap
data class PropertiesPatternpropertiesAdditionalpropertiesInteraction1BoxedMap<br>
implements [PropertiesPatternpropertiesAdditionalpropertiesInteraction1Boxed](#propertiespatternpropertiesadditionalpropertiesinteraction1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesPatternpropertiesAdditionalpropertiesInteraction1BoxedMap([PropertiesPatternpropertiesAdditionalpropertiesInteractionMap](#propertiespatternpropertiesadditionalpropertiesinteractionmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PropertiesPatternpropertiesAdditionalpropertiesInteractionMap](#propertiespatternpropertiesadditionalpropertiesinteractionmap) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PropertiesPatternpropertiesAdditionalpropertiesInteraction1
class PropertiesPatternpropertiesAdditionalpropertiesInteraction1<br>
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
import org.openapijsonschematools.client.components.schemas.PropertiesPatternpropertiesAdditionalpropertiesInteraction

val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())

// Map validation
val validatedPayload: PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteractionMap =
    PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteraction1.validate(
    PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteractionMapBuilder()
        .additionalProperty("someAdditionalProperty", 1)

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
| Map<Pattern, Class<? extends JsonSchema>> | patternProperties = mapOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;Pattern.compile("f.o") to [Fo::class.java](#fo))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PropertiesPatternpropertiesAdditionalpropertiesInteractionMap](#propertiespatternpropertiesadditionalpropertiesinteractionmap) | validate(arg: [Map&lt;*, *&gt;](#propertiespatternpropertiesadditionalpropertiesinteractionmapbuilder), configuration: SchemaConfiguration) |
| [PropertiesPatternpropertiesAdditionalpropertiesInteraction1BoxedMap](#propertiespatternpropertiesadditionalpropertiesinteraction1boxedmap) | validateAndBox([Map&lt;*, *&gt;](#propertiespatternpropertiesadditionalpropertiesinteractionmapbuilder), configuration: SchemaConfiguration) |
| [PropertiesPatternpropertiesAdditionalpropertiesInteraction1Boxed](#propertiespatternpropertiesadditionalpropertiesinteraction1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## PropertiesPatternpropertiesAdditionalpropertiesInteractionMapBuilder
class PropertiesPatternpropertiesAdditionalpropertiesInteractionMapBuilder<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesPatternpropertiesAdditionalpropertiesInteractionMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Any?> | build()<br>Returns map input that should be used with Schema.validate |
| [PropertiesPatternpropertiesAdditionalpropertiesInteractionMapBuilder](#propertiespatternpropertiesadditionalpropertiesinteractionmapbuilder) | foo(value: List<Any?>) |
| [PropertiesPatternpropertiesAdditionalpropertiesInteractionMapBuilder](#propertiespatternpropertiesadditionalpropertiesinteractionmapbuilder) | bar(value: List<Any?>) |
| [PropertiesPatternpropertiesAdditionalpropertiesInteractionMapBuilder](#propertiespatternpropertiesadditionalpropertiesinteractionmapbuilder) | additionalProperty(key: String, value: Int) |
| [PropertiesPatternpropertiesAdditionalpropertiesInteractionMapBuilder](#propertiespatternpropertiesadditionalpropertiesinteractionmapbuilder) | additionalProperty(key: String, value: Float) |
| [PropertiesPatternpropertiesAdditionalpropertiesInteractionMapBuilder](#propertiespatternpropertiesadditionalpropertiesinteractionmapbuilder) | additionalProperty(key: String, value: Long) |
| [PropertiesPatternpropertiesAdditionalpropertiesInteractionMapBuilder](#propertiespatternpropertiesadditionalpropertiesinteractionmapbuilder) | additionalProperty(key: String, value: Double) |

## PropertiesPatternpropertiesAdditionalpropertiesInteractionMap
class PropertiesPatternpropertiesAdditionalpropertiesInteractionMap<br>
extends FrozenMap<String, Any?>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PropertiesPatternpropertiesAdditionalpropertiesInteractionMap](#propertiespatternpropertiesadditionalpropertiesinteractionmap) | of([Map<String, Any?>](#propertiespatternpropertiesadditionalpropertiesinteractionmapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<Any?> | foo()<br>[optional] |
| FrozenList<Any?> | bar()<br>[optional] |
| Number | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## BarBoxed
sealed interface BarBoxed<br>
permits<br>
[BarBoxedList](#barboxedlist)

sealed interface that stores validated payloads using boxed classes

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

## Bar
class Bar<br>
extends ListJsonSchema.ListJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.ListJsonSchema.ListJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## FooBoxed
sealed interface FooBoxed<br>
permits<br>
[FooBoxedList](#fooboxedlist)

sealed interface that stores validated payloads using boxed classes

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

## Foo
class Foo<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = setOf(List::class.java) |
| Int | maxItems = 3 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [FooBoxedList](#fooboxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [FooBoxed](#fooboxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## FoBoxed
sealed interface FoBoxed<br>
permits<br>
[FoBoxedVoid](#foboxedvoid),
[FoBoxedBoolean](#foboxedboolean),
[FoBoxedNumber](#foboxednumber),
[FoBoxedString](#foboxedstring),
[FoBoxedList](#foboxedlist),
[FoBoxedMap](#foboxedmap)

sealed interface that stores validated payloads using boxed classes

## FoBoxedVoid
data class FoBoxedVoid<br>
implements [FoBoxed](#foboxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## FoBoxedBoolean
data class FoBoxedBoolean<br>
implements [FoBoxed](#foboxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## FoBoxedNumber
data class FoBoxedNumber<br>
implements [FoBoxed](#foboxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## FoBoxedString
data class FoBoxedString<br>
implements [FoBoxed](#foboxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## FoBoxedList
data class FoBoxedList<br>
implements [FoBoxed](#foboxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoBoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## FoBoxedMap
data class FoBoxedMap<br>
implements [FoBoxed](#foboxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoBoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Fo
class Fo<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Int | minItems = 2 |

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
| [FoBoxedString](#foboxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [FoBoxedVoid](#foboxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [FoBoxedNumber](#foboxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [FoBoxedBoolean](#foboxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [FoBoxedMap](#foboxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [FoBoxedList](#foboxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [FoBoxed](#foboxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## AdditionalPropertiesBoxed
sealed interface AdditionalPropertiesBoxed<br>
permits<br>
[AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber)

sealed interface that stores validated payloads using boxed classes

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

## AdditionalProperties
class AdditionalProperties<br>
extends IntJsonSchema.IntJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.IntJsonSchema.IntJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

# AdditionalpropertiesCanExistByItself
org.openapijsonschematools.client.components.schemas.AdditionalpropertiesCanExistByItself.java
class AdditionalpropertiesCanExistByItself<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [AdditionalpropertiesCanExistByItself.AdditionalpropertiesCanExistByItself1Boxed](#additionalpropertiescanexistbyitself1boxed)<br> sealed interface for validated payloads |
| data class | [AdditionalpropertiesCanExistByItself.AdditionalpropertiesCanExistByItself1BoxedMap](#additionalpropertiescanexistbyitself1boxedmap)<br> boxed class to store validated Map payloads |
| class | [AdditionalpropertiesCanExistByItself.AdditionalpropertiesCanExistByItself1](#additionalpropertiescanexistbyitself1)<br> schema class |
| class | [AdditionalpropertiesCanExistByItself.AdditionalpropertiesCanExistByItselfMapBuilder](#additionalpropertiescanexistbyitselfmapbuilder)<br> builder for Map payloads |
| class | [AdditionalpropertiesCanExistByItself.AdditionalpropertiesCanExistByItselfMap](#additionalpropertiescanexistbyitselfmap)<br> output class for Map payloads |
| sealed interface | [AdditionalpropertiesCanExistByItself.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed interface for validated payloads |
| data class | [AdditionalpropertiesCanExistByItself.AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| class | [AdditionalpropertiesCanExistByItself.AdditionalProperties](#additionalproperties)<br> schema class |

## AdditionalpropertiesCanExistByItself1Boxed
sealed interface AdditionalpropertiesCanExistByItself1Boxed<br>
permits<br>
[AdditionalpropertiesCanExistByItself1BoxedMap](#additionalpropertiescanexistbyitself1boxedmap)

sealed interface that stores validated payloads using boxed classes

## AdditionalpropertiesCanExistByItself1BoxedMap
data class AdditionalpropertiesCanExistByItself1BoxedMap<br>
implements [AdditionalpropertiesCanExistByItself1Boxed](#additionalpropertiescanexistbyitself1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesCanExistByItself1BoxedMap([AdditionalpropertiesCanExistByItselfMap](#additionalpropertiescanexistbyitselfmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AdditionalpropertiesCanExistByItselfMap](#additionalpropertiescanexistbyitselfmap) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalpropertiesCanExistByItself1
class AdditionalpropertiesCanExistByItself1<br>
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
import org.openapijsonschematools.client.components.schemas.AdditionalpropertiesCanExistByItself

val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())

// Map validation
val validatedPayload: AdditionalpropertiesCanExistByItself.AdditionalpropertiesCanExistByItselfMap =
    AdditionalpropertiesCanExistByItself.AdditionalpropertiesCanExistByItself1.validate(
    AdditionalpropertiesCanExistByItself.AdditionalpropertiesCanExistByItselfMapBuilder()
        .additionalProperty("someAdditionalProperty", true)

    .build(),
    configuration
)
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = setOf(Map::class.java) |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties::class.java](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AdditionalpropertiesCanExistByItselfMap](#additionalpropertiescanexistbyitselfmap) | validate(arg: [Map&lt;*, *&gt;](#additionalpropertiescanexistbyitselfmapbuilder), configuration: SchemaConfiguration) |
| [AdditionalpropertiesCanExistByItself1BoxedMap](#additionalpropertiescanexistbyitself1boxedmap) | validateAndBox([Map&lt;*, *&gt;](#additionalpropertiescanexistbyitselfmapbuilder), configuration: SchemaConfiguration) |
| [AdditionalpropertiesCanExistByItself1Boxed](#additionalpropertiescanexistbyitself1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## AdditionalpropertiesCanExistByItselfMapBuilder
class AdditionalpropertiesCanExistByItselfMapBuilder<br>
builder for `Map<String, Boolean>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesCanExistByItselfMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Boolean> | build()<br>Returns map input that should be used with Schema.validate |
| [AdditionalpropertiesCanExistByItselfMapBuilder](#additionalpropertiescanexistbyitselfmapbuilder) | additionalProperty(key: String, value: Boolean) |

## AdditionalpropertiesCanExistByItselfMap
class AdditionalpropertiesCanExistByItselfMap<br>
extends FrozenMap<String, Boolean>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AdditionalpropertiesCanExistByItselfMap](#additionalpropertiescanexistbyitselfmap) | of([Map<String, Boolean>](#additionalpropertiescanexistbyitselfmapbuilder) arg, SchemaConfiguration configuration) |
| Boolean | getAdditionalProperty(String name)<br>provides type safety for additional properties |

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

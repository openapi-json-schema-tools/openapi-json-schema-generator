# RefInAdditionalproperties
org.openapijsonschematools.client.components.schemas.RefInAdditionalproperties.java
class RefInAdditionalproperties<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [RefInAdditionalproperties.RefInAdditionalproperties1Boxed](#refinadditionalproperties1boxed)<br> sealed interface for validated payloads |
| data class | [RefInAdditionalproperties.RefInAdditionalproperties1BoxedMap](#refinadditionalproperties1boxedmap)<br> boxed class to store validated Map payloads |
| class | [RefInAdditionalproperties.RefInAdditionalproperties1](#refinadditionalproperties1)<br> schema class |
| class | [RefInAdditionalproperties.RefInAdditionalpropertiesMapBuilder](#refinadditionalpropertiesmapbuilder)<br> builder for Map payloads |
| class | [RefInAdditionalproperties.RefInAdditionalpropertiesMap](#refinadditionalpropertiesmap)<br> output class for Map payloads |

## RefInAdditionalproperties1Boxed
sealed interface RefInAdditionalproperties1Boxed<br>
permits<br>
[RefInAdditionalproperties1BoxedMap](#refinadditionalproperties1boxedmap)

sealed interface that stores validated payloads using boxed classes

## RefInAdditionalproperties1BoxedMap
data class RefInAdditionalproperties1BoxedMap<br>
implements [RefInAdditionalproperties1Boxed](#refinadditionalproperties1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInAdditionalproperties1BoxedMap([RefInAdditionalpropertiesMap](#refinadditionalpropertiesmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RefInAdditionalpropertiesMap](#refinadditionalpropertiesmap) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RefInAdditionalproperties1
class RefInAdditionalproperties1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.validation.FrozenList
import org.openapijsonschematools.client.schemas.validation.FrozenMap
import org.openapijsonschematools.client.components.schemas.RefInAdditionalproperties

val configuration = SchemaConfiguration()

// Map validation
val validatedPayload: RefInAdditionalproperties.RefInAdditionalpropertiesMap =
    RefInAdditionalproperties.RefInAdditionalproperties1.validate(
    RefInAdditionalproperties.RefInAdditionalpropertiesMapBuilder()
    .build(),
    configuration
)
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = setOf(Map::class.java) |
| Class<? extends JsonSchema> | additionalProperties = [PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReference1::class.java](../../components/schemas/PropertyNamedRefThatIsNotAReference.md#propertynamedrefthatisnotareference1) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RefInAdditionalpropertiesMap](#refinadditionalpropertiesmap) | validate(arg: [Map&lt;*, *&gt;](#refinadditionalpropertiesmapbuilder), configuration: SchemaConfiguration) |
| [RefInAdditionalproperties1BoxedMap](#refinadditionalproperties1boxedmap) | validateAndBox([Map&lt;*, *&gt;](#refinadditionalpropertiesmapbuilder), configuration: SchemaConfiguration) |
| [RefInAdditionalproperties1Boxed](#refinadditionalproperties1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## RefInAdditionalpropertiesMapBuilder
class RefInAdditionalpropertiesMapBuilder<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInAdditionalpropertiesMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Any?> | build()<br>Returns map input that should be used with Schema.validate |
| [RefInAdditionalpropertiesMapBuilder](#refinadditionalpropertiesmapbuilder) | additionalProperty(key: String, value: Nothing?) |
| [RefInAdditionalpropertiesMapBuilder](#refinadditionalpropertiesmapbuilder) | additionalProperty(key: String, value: Boolean) |
| [RefInAdditionalpropertiesMapBuilder](#refinadditionalpropertiesmapbuilder) | additionalProperty(key: String, value: String) |
| [RefInAdditionalpropertiesMapBuilder](#refinadditionalpropertiesmapbuilder) | additionalProperty(key: String, value: Int) |
| [RefInAdditionalpropertiesMapBuilder](#refinadditionalpropertiesmapbuilder) | additionalProperty(key: String, value: Float) |
| [RefInAdditionalpropertiesMapBuilder](#refinadditionalpropertiesmapbuilder) | additionalProperty(key: String, value: Long) |
| [RefInAdditionalpropertiesMapBuilder](#refinadditionalpropertiesmapbuilder) | additionalProperty(key: String, value: Double) |
| [RefInAdditionalpropertiesMapBuilder](#refinadditionalpropertiesmapbuilder) | additionalProperty(key: String, value: List<Any?>) |
| [RefInAdditionalpropertiesMapBuilder](#refinadditionalpropertiesmapbuilder) | additionalProperty(key: String, value: Map<String, Any?>) |

## RefInAdditionalpropertiesMap
class RefInAdditionalpropertiesMap<br>
extends FrozenMap<String, Any?>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [RefInAdditionalpropertiesMap](#refinadditionalpropertiesmap) | of([Map<String, Any?>](#refinadditionalpropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| Any? | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

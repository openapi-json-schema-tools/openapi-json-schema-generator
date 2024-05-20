# UnevaluatedpropertiesSchema
org.openapijsonschematools.client.components.schemas.UnevaluatedpropertiesSchema.java
class UnevaluatedpropertiesSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [UnevaluatedpropertiesSchema.UnevaluatedpropertiesSchema1Boxed](#unevaluatedpropertiesschema1boxed)<br> sealed interface for validated payloads |
| record | [UnevaluatedpropertiesSchema.UnevaluatedpropertiesSchema1BoxedMap](#unevaluatedpropertiesschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UnevaluatedpropertiesSchema.UnevaluatedpropertiesSchema1](#unevaluatedpropertiesschema1)<br> schema class |
| sealed interface | [UnevaluatedpropertiesSchema.UnevaluatedPropertiesBoxed](#unevaluatedpropertiesboxed)<br> sealed interface for validated payloads |
| record | [UnevaluatedpropertiesSchema.UnevaluatedPropertiesBoxedString](#unevaluatedpropertiesboxedstring)<br> boxed class to store validated String payloads |
| static class | [UnevaluatedpropertiesSchema.UnevaluatedProperties](#unevaluatedproperties)<br> schema class |

## UnevaluatedpropertiesSchema1Boxed
sealed interface UnevaluatedpropertiesSchema1Boxed<br>
permits<br>
[UnevaluatedpropertiesSchema1BoxedMap](#unevaluatedpropertiesschema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## UnevaluatedpropertiesSchema1BoxedMap
data class UnevaluatedpropertiesSchema1BoxedMap<br>
implements [UnevaluatedpropertiesSchema1Boxed](#unevaluatedpropertiesschema1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesSchema1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluatedpropertiesSchema1
class UnevaluatedpropertiesSchema1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = setOf(Map::class.java) |
| Class<? extends JsonSchema> | unevaluatedProperties = [UnevaluatedProperties::class.java](#unevaluatedproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<String, Any?> | validate(arg: Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [UnevaluatedpropertiesSchema1BoxedMap](#unevaluatedpropertiesschema1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [UnevaluatedpropertiesSchema1Boxed](#unevaluatedpropertiesschema1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## UnevaluatedPropertiesBoxed
sealed interface UnevaluatedPropertiesBoxed<br>
permits<br>
[UnevaluatedPropertiesBoxedString](#unevaluatedpropertiesboxedstring)

sealed interface that stores validated payloads using boxed classes

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

## UnevaluatedProperties
class UnevaluatedProperties<br>
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
import org.openapijsonschematools.client.components.schemas.UnevaluatedpropertiesSchema

val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())

// String validation
val validatedPayload: String = UnevaluatedpropertiesSchema.UnevaluatedProperties.validate(
    "a",
    configuration
)
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = setOf(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String::class.java<br/>)<br/> |
| Int | minLength = 3 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(arg: String, configuration: SchemaConfiguration) |
| [UnevaluatedPropertiesBoxedString](#unevaluatedpropertiesboxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [UnevaluatedPropertiesBoxed](#unevaluatedpropertiesboxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

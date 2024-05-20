# TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing
org.openapijsonschematools.client.components.schemas.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.java
class TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1Boxed](#thedefaultkeyworddoesnotdoanythingifthepropertyismissing1boxed)<br> sealed interface for validated payloads |
| data class | [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1BoxedMap](#thedefaultkeyworddoesnotdoanythingifthepropertyismissing1boxedmap)<br> boxed class to store validated Map payloads |
| class | [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1](#thedefaultkeyworddoesnotdoanythingifthepropertyismissing1)<br> schema class |
| class | [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmapbuilder)<br> builder for Map payloads |
| class | [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmap)<br> output class for Map payloads |
| sealed interface | [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.AlphaBoxed](#alphaboxed)<br> sealed interface for validated payloads |
| data class | [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.AlphaBoxedNumber](#alphaboxednumber)<br> boxed class to store validated Number payloads |
| class | [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.Alpha](#alpha)<br> schema class |

## TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1Boxed
sealed interface TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1Boxed<br>
permits<br>
[TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1BoxedMap](#thedefaultkeyworddoesnotdoanythingifthepropertyismissing1boxedmap)

sealed interface that stores validated payloads using boxed classes

## TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1BoxedMap
data class TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1BoxedMap<br>
implements [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1Boxed](#thedefaultkeyworddoesnotdoanythingifthepropertyismissing1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1BoxedMap([TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmap) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1
class TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1<br>
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
import org.openapijsonschematools.client.components.schemas.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing

val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())

// Map validation
val validatedPayload: TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap =
    TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1.validate(
    TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder()
        .alpha(1)

    .build(),
    configuration
)
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = setOf(Map::class.java) |
| Map<String, Class<? extends JsonSchema>> | properties = mapOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;"alpha" to [Alpha::class.java](#alpha))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmap) | validate(arg: [Map&lt;*, *&gt;](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmapbuilder), configuration: SchemaConfiguration) |
| [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1BoxedMap](#thedefaultkeyworddoesnotdoanythingifthepropertyismissing1boxedmap) | validateAndBox([Map&lt;*, *&gt;](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmapbuilder), configuration: SchemaConfiguration) |
| [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1Boxed](#thedefaultkeyworddoesnotdoanythingifthepropertyismissing1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder
class TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Any?> | build()<br>Returns map input that should be used with Schema.validate |
| [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmapbuilder) | alpha(value: Int) |
| [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmapbuilder) | alpha(value: Float) |
| [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmapbuilder) | alpha(value: Long) |
| [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmapbuilder) | alpha(value: Double) |
| [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmapbuilder) | additionalProperty(key: String, value: Nothing?) |
| [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmapbuilder) | additionalProperty(key: String, value: Boolean) |
| [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmapbuilder) | additionalProperty(key: String, value: String) |
| [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmapbuilder) | additionalProperty(key: String, value: Int) |
| [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmapbuilder) | additionalProperty(key: String, value: Float) |
| [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmapbuilder) | additionalProperty(key: String, value: Long) |
| [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmapbuilder) | additionalProperty(key: String, value: Double) |
| [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmapbuilder) | additionalProperty(key: String, value: List<Any?>) |
| [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmapbuilder) | additionalProperty(key: String, value: Map<String, Any?>) |

## TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap
class TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap<br>
extends FrozenMap<String, Any?>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmap) | of([Map<String, Any?>](#thedefaultkeyworddoesnotdoanythingifthepropertyismissingmapbuilder) arg, SchemaConfiguration configuration) |
| Number | alpha()<br>[optional] if omitted the server will use the default value of 5.0 |
| Any? | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## AlphaBoxed
sealed interface AlphaBoxed<br>
permits<br>
[AlphaBoxedNumber](#alphaboxednumber)

sealed interface that stores validated payloads using boxed classes

## AlphaBoxedNumber
data class AlphaBoxedNumber<br>
implements [AlphaBoxed](#alphaboxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AlphaBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Alpha
class Alpha<br>
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
import org.openapijsonschematools.client.components.schemas.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing

val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())

// int validation
val validatedPayload: Int = TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.Alpha.validate(
    1,
    configuration
)
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = setOf(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Int::class.java,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Long::class.java,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Float::class.java,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Double::class.java<br/>)<br/> |
| Number | maximum = 3 |
| Any? | defaultValue = 5.0 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | validate(arg: Number, configuration: SchemaConfiguration) |
| [AlphaBoxedNumber](#alphaboxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [AlphaBoxed](#alphaboxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

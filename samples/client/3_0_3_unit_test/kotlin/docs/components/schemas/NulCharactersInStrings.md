# NulCharactersInStrings
org.openapijsonschematools.client.components.schemas.NulCharactersInStrings.java
class NulCharactersInStrings<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [NulCharactersInStrings.NulCharactersInStrings1Boxed](#nulcharactersinstrings1boxed)<br> sealed interface for validated payloads |
| data class | [NulCharactersInStrings.NulCharactersInStrings1BoxedString](#nulcharactersinstrings1boxedstring)<br> boxed class to store validated String payloads |
| class | [NulCharactersInStrings.NulCharactersInStrings1](#nulcharactersinstrings1)<br> schema class |
| enum | [NulCharactersInStrings.StringNulCharactersInStringsEnums](#stringnulcharactersinstringsenums)<br>String enum |

## NulCharactersInStrings1Boxed
sealed interface NulCharactersInStrings1Boxed<br>
permits<br>
[NulCharactersInStrings1BoxedString](#nulcharactersinstrings1boxedstring)

sealed interface that stores validated payloads using boxed classes

## NulCharactersInStrings1BoxedString
data class NulCharactersInStrings1BoxedString<br>
implements [NulCharactersInStrings1Boxed](#nulcharactersinstrings1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NulCharactersInStrings1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NulCharactersInStrings1
class NulCharactersInStrings1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.validation.FrozenList
import org.openapijsonschematools.client.schemas.validation.FrozenMap
import org.openapijsonschematools.client.components.schemas.NulCharactersInStrings

val configuration = SchemaConfiguration()

// String validation
val validatedPayload: String = NulCharactersInStrings.NulCharactersInStrings1.validate(
    "hello\u0000there",
    configuration
)
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = setOf(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String::class.java<br/>)<br/> |
| Set<Any> | enumValues = setOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;"hello\u0000there"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(arg: String, configuration: SchemaConfiguration) |
| String | validate(arg: [StringNulCharactersInStringsEnums](#stringnulcharactersinstringsenums), configuration: SchemaConfiguration) |
| [NulCharactersInStrings1BoxedString](#nulcharactersinstrings1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [NulCharactersInStrings1Boxed](#nulcharactersinstrings1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## StringNulCharactersInStringsEnums
public enum StringNulCharactersInStringsEnums<br>
extends `Enum<StringNulCharactersInStringsEnums>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| HELLO_NULL_THERE | value = "hello\u0000there" |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

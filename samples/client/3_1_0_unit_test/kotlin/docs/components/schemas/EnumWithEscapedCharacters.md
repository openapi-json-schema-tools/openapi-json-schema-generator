# EnumWithEscapedCharacters
org.openapijsonschematools.client.components.schemas.EnumWithEscapedCharacters.java
class EnumWithEscapedCharacters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [EnumWithEscapedCharacters.EnumWithEscapedCharacters1Boxed](#enumwithescapedcharacters1boxed)<br> sealed interface for validated payloads |
| record | [EnumWithEscapedCharacters.EnumWithEscapedCharacters1BoxedString](#enumwithescapedcharacters1boxedstring)<br> boxed class to store validated String payloads |
| static class | [EnumWithEscapedCharacters.EnumWithEscapedCharacters1](#enumwithescapedcharacters1)<br> schema class |
| enum | [EnumWithEscapedCharacters.StringEnumWithEscapedCharactersEnums](#stringenumwithescapedcharactersenums)<br>String enum |

## EnumWithEscapedCharacters1Boxed
sealed interface EnumWithEscapedCharacters1Boxed<br>
permits<br>
[EnumWithEscapedCharacters1BoxedString](#enumwithescapedcharacters1boxedstring)

sealed interface that stores validated payloads using boxed classes

## EnumWithEscapedCharacters1BoxedString
data class EnumWithEscapedCharacters1BoxedString<br>
implements [EnumWithEscapedCharacters1Boxed](#enumwithescapedcharacters1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EnumWithEscapedCharacters1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## EnumWithEscapedCharacters1
class EnumWithEscapedCharacters1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.components.schemas.EnumWithEscapedCharacters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// String validation
String validatedPayload = EnumWithEscapedCharacters.EnumWithEscapedCharacters1.validate(
    "foo\nbar",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = setOf(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String::class.java<br/>)<br/> |
| Set<Any> | enumValues = setOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo\nbar",<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo\rbar"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(arg: String, configuration: SchemaConfiguration) |
| String | validate(arg: [StringEnumWithEscapedCharactersEnums](#stringenumwithescapedcharactersenums), configuration: SchemaConfiguration) |
| [EnumWithEscapedCharacters1BoxedString](#enumwithescapedcharacters1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [EnumWithEscapedCharacters1Boxed](#enumwithescapedcharacters1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## StringEnumWithEscapedCharactersEnums
public enum StringEnumWithEscapedCharactersEnums<br>
extends `Enum<StringEnumWithEscapedCharactersEnums>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| FOO_LINE_FEED_LF_BAR | value = "foo\nbar" |
| FOO_CARRIAGE_RETURN_CR_BAR | value = "foo\rbar" |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

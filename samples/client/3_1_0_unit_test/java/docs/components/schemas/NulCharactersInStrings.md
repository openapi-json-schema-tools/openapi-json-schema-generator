# NulCharactersInStrings
org.openapijsonschematools.client.components.schemas.NulCharactersInStrings.java
public class NulCharactersInStrings<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [NulCharactersInStrings.NulCharactersInStrings1Boxed](#nulcharactersinstrings1boxed)<br> abstract sealed validated payload class |
| static class | [NulCharactersInStrings.NulCharactersInStrings1BoxedString](#nulcharactersinstrings1boxedstring)<br> boxed class to store validated String payloads |
| static class | [NulCharactersInStrings.NulCharactersInStrings1](#nulcharactersinstrings1)<br> schema class |
| enum | [NulCharactersInStrings.StringNulCharactersInStringsEnums](#stringnulcharactersinstringsenums)<br>String enum |

## NulCharactersInStrings1Boxed
public static abstract sealed class NulCharactersInStrings1Boxed<br>
permits<br>
[NulCharactersInStrings1BoxedString](#nulcharactersinstrings1boxedstring)

abstract sealed class that stores validated payloads using boxed classes

## NulCharactersInStrings1BoxedString
public static final class NulCharactersInStrings1BoxedString<br>
extends [NulCharactersInStrings1Boxed](#nulcharactersinstrings1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NulCharactersInStrings1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## NulCharactersInStrings1
public static class NulCharactersInStrings1<br>
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

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// String validation
String validatedPayload = NulCharactersInStrings.NulCharactersInStrings1.validate(
    "hello\0there",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;"hello\0there"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| String | validate([StringNulCharactersInStringsEnums](#stringnulcharactersinstringsenums) arg, SchemaConfiguration configuration) |
| [NulCharactersInStrings1BoxedString](#nulcharactersinstrings1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## StringNulCharactersInStringsEnums
public enum StringNulCharactersInStringsEnums<br>
extends `Enum<StringNulCharactersInStringsEnums>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| HELLO_NULL_THERE | value = "hello\0there" |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

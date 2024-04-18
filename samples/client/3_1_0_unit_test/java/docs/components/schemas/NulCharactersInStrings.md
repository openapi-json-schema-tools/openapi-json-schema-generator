# NulCharactersInStrings
unit_test_api.components.schemas.NulCharactersInStrings.java
public class NulCharactersInStrings<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [NulCharactersInStrings.NulCharactersInStrings1Boxed](#nulcharactersinstrings1boxed)<br> sealed interface for validated payloads |
| record | [NulCharactersInStrings.NulCharactersInStrings1BoxedString](#nulcharactersinstrings1boxedstring)<br> boxed class to store validated String payloads |
| static class | [NulCharactersInStrings.NulCharactersInStrings1](#nulcharactersinstrings1)<br> schema class |
| enum | [NulCharactersInStrings.StringNulCharactersInStringsEnums](#stringnulcharactersinstringsenums)<br>String enum |

## NulCharactersInStrings1Boxed
public sealed interface NulCharactersInStrings1Boxed<br>
permits<br>
[NulCharactersInStrings1BoxedString](#nulcharactersinstrings1boxedstring)

sealed interface that stores validated payloads using boxed classes

## NulCharactersInStrings1BoxedString
public record NulCharactersInStrings1BoxedString<br>
implements [NulCharactersInStrings1Boxed](#nulcharactersinstrings1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NulCharactersInStrings1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NulCharactersInStrings1
public static class NulCharactersInStrings1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import unit_test_api.configurations.JsonSchemaKeywordFlags;
import unit_test_api.configurations.SchemaConfiguration;
import unit_test_api.exceptions.ValidationException;
import unit_test_api.schemas.validation.MapUtils;
import unit_test_api.schemas.validation.FrozenList;
import unit_test_api.schemas.validation.FrozenMap;
import unit_test_api.components.schemas.NulCharactersInStrings;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

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
| [NulCharactersInStrings1Boxed](#nulcharactersinstrings1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
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

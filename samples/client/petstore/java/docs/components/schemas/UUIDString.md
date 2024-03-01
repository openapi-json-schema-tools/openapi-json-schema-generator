# UUIDString
org.openapijsonschematools.client.components.schemas.UUIDString.java
public class UUIDString<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [UUIDString.UUIDString1Boxed](#uuidstring1boxed)<br> sealed interface for validated payloads |
| record | [UUIDString.UUIDString1BoxedString](#uuidstring1boxedstring)<br> boxed class to store validated String payloads |
| static class | [UUIDString.UUIDString1](#uuidstring1)<br> schema class |

## UUIDString1Boxed
public sealed interface UUIDString1Boxed<br>
permits<br>
[UUIDString1BoxedString](#uuidstring1boxedstring)

sealed interface that stores validated payloads using boxed classes

## UUIDString1BoxedString
public record UUIDString1BoxedString<br>
implements [UUIDString1Boxed](#uuidstring1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UUIDString1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UUIDString1
public static class UUIDString1<br>
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
import org.openapijsonschematools.client.components.schemas.UUIDString;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// String validation
String validatedPayload = UUIDString.UUIDString1.validate(
    "046b6c7f-0b8a-43b9-b35d-6489e6daee91",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| String | type = "uuid"; |
| Integer | minLength = 1 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| [UUIDString1BoxedString](#uuidstring1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [UUIDString1Boxed](#uuidstring1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

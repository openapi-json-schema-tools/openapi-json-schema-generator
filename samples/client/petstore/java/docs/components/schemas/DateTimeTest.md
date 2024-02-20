# DateTimeTest
org.openapijsonschematools.client.components.schemas.DateTimeTest.java
public class DateTimeTest<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [DateTimeTest.DateTimeTest1Boxed](#datetimetest1boxed)<br> abstract sealed validated payload class |
| record | [DateTimeTest.DateTimeTest1BoxedString](#datetimetest1boxedstring)<br> boxed class to store validated String payloads |
| static class | [DateTimeTest.DateTimeTest1](#datetimetest1)<br> schema class |

## DateTimeTest1Boxed
public sealed interface DateTimeTest1Boxed<br>
permits<br>
[DateTimeTest1BoxedString](#datetimetest1boxedstring)

sealed interface that stores validated payloads using boxed classes

## DateTimeTest1BoxedString
public record DateTimeTest1BoxedString<br>
implements [DateTimeTest1Boxed](#datetimetest1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateTimeTest1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DateTimeTest1
public static class DateTimeTest1<br>
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
String validatedPayload = DateTimeTest.DateTimeTest1.validate(
    "1970-01-01T00:00:00.00Z",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| String | type = "date-time"; |
| @Nullable Object | defaultValue = "2010-01-01T10:10:10.000111+01:00" |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| [DateTimeTest1BoxedString](#datetimetest1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [DateTimeTest1Boxed](#datetimetest1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

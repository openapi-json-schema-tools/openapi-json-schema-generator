# Schema1
public class Schema1<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Schema1.Schema11Boxed](#schema11boxed)<br> sealed interface for validated payloads |
| record | [Schema1.Schema11BoxedString](#schema11boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema1.Schema11](#schema11)<br> schema class |
| enum | [Schema1.StringSchemaEnums1](#stringschemaenums1)<br>String enum |

## Schema11Boxed
public sealed interface Schema11Boxed<br>
permits<br>
[Schema11BoxedString](#schema11boxedstring)

sealed interface that stores validated payloads using boxed classes

## Schema11BoxedString
public record Schema11BoxedString<br>
implements [Schema11Boxed](#schema11boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema11BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema11
public static class Schema11<br>
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
import org.openapijsonschematools.client.paths.fake.delete.parameters.parameter1.Schema1;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// String validation
String validatedPayload = Schema1.Schema11.validate(
    "true",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;"true",<br>&nbsp;&nbsp;&nbsp;&nbsp;"false"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| String | validate([StringSchemaEnums1](#stringschemaenums1) arg, SchemaConfiguration configuration) |
| [Schema11BoxedString](#schema11boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Schema11Boxed](#schema11boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## StringSchemaEnums1
public enum StringSchemaEnums1<br>
extends `Enum<StringSchemaEnums1>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| TRUE | value = "true" |
| FALSE | value = "false" |

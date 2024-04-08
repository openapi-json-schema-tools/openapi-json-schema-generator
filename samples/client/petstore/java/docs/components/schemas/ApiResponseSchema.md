# ApiResponseSchema
org.openapijsonschematools.client.components.schemas.ApiResponseSchema.java
public class ApiResponseSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ApiResponseSchema.ApiResponseSchema1Boxed](#apiresponseschema1boxed)<br> sealed interface for validated payloads |
| record | [ApiResponseSchema.ApiResponseSchema1BoxedMap](#apiresponseschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ApiResponseSchema.ApiResponseSchema1](#apiresponseschema1)<br> schema class |
| static class | [ApiResponseSchema.ApiResponseMapBuilder](#apiresponsemapbuilder)<br> builder for Map payloads |
| static class | [ApiResponseSchema.ApiResponseMap](#apiresponsemap)<br> output class for Map payloads |
| sealed interface | [ApiResponseSchema.MessageBoxed](#messageboxed)<br> sealed interface for validated payloads |
| record | [ApiResponseSchema.MessageBoxedString](#messageboxedstring)<br> boxed class to store validated String payloads |
| static class | [ApiResponseSchema.Message](#message)<br> schema class |
| sealed interface | [ApiResponseSchema.TypeBoxed](#typeboxed)<br> sealed interface for validated payloads |
| record | [ApiResponseSchema.TypeBoxedString](#typeboxedstring)<br> boxed class to store validated String payloads |
| static class | [ApiResponseSchema.Type](#type)<br> schema class |
| sealed interface | [ApiResponseSchema.CodeBoxed](#codeboxed)<br> sealed interface for validated payloads |
| record | [ApiResponseSchema.CodeBoxedNumber](#codeboxednumber)<br> boxed class to store validated Number payloads |
| static class | [ApiResponseSchema.Code](#code)<br> schema class |

## ApiResponseSchema1Boxed
public sealed interface ApiResponseSchema1Boxed<br>
permits<br>
[ApiResponseSchema1BoxedMap](#apiresponseschema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ApiResponseSchema1BoxedMap
public record ApiResponseSchema1BoxedMap<br>
implements [ApiResponseSchema1Boxed](#apiresponseschema1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApiResponseSchema1BoxedMap([ApiResponseMap](#apiresponsemap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ApiResponseMap](#apiresponsemap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ApiResponseSchema1
public static class ApiResponseSchema1<br>
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
import org.openapijsonschematools.client.components.schemas.ApiResponseSchema;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
ApiResponseSchema.ApiResponseMap validatedPayload =
    ApiResponseSchema.ApiResponseSchema1.validate(
    new ApiResponseSchema.ApiResponseMapBuilder()
        .code(1)

        .type("a")

        .message("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("code", [Code.class](#code))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("type", [Type.class](#type))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("message", [Message.class](#message)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ApiResponseMap](#apiresponsemap) | validate([Map&lt;?, ?&gt;](#apiresponsemapbuilder) arg, SchemaConfiguration configuration) |
| [ApiResponseSchema1BoxedMap](#apiresponseschema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#apiresponsemapbuilder) arg, SchemaConfiguration configuration) |
| [ApiResponseSchema1Boxed](#apiresponseschema1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ApiResponseMapBuilder
public class ApiResponseMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApiResponseMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [ApiResponseMapBuilder](#apiresponsemapbuilder) | code(int value) |
| [ApiResponseMapBuilder](#apiresponsemapbuilder) | code(float value) |
| [ApiResponseMapBuilder](#apiresponsemapbuilder) | type(String value) |
| [ApiResponseMapBuilder](#apiresponsemapbuilder) | message(String value) |
| [ApiResponseMapBuilder](#apiresponsemapbuilder) | additionalProperty(String key, Void value) |
| [ApiResponseMapBuilder](#apiresponsemapbuilder) | additionalProperty(String key, boolean value) |
| [ApiResponseMapBuilder](#apiresponsemapbuilder) | additionalProperty(String key, String value) |
| [ApiResponseMapBuilder](#apiresponsemapbuilder) | additionalProperty(String key, int value) |
| [ApiResponseMapBuilder](#apiresponsemapbuilder) | additionalProperty(String key, float value) |
| [ApiResponseMapBuilder](#apiresponsemapbuilder) | additionalProperty(String key, long value) |
| [ApiResponseMapBuilder](#apiresponsemapbuilder) | additionalProperty(String key, double value) |
| [ApiResponseMapBuilder](#apiresponsemapbuilder) | additionalProperty(String key, List<?> value) |
| [ApiResponseMapBuilder](#apiresponsemapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## ApiResponseMap
public static class ApiResponseMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ApiResponseMap](#apiresponsemap) | of([Map<String, ? extends @Nullable Object>](#apiresponsemapbuilder) arg, SchemaConfiguration configuration) |
| Number | code()<br>[optional] value must be a 32 bit integer |
| String | type()<br>[optional] |
| String | message()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## MessageBoxed
public sealed interface MessageBoxed<br>
permits<br>
[MessageBoxedString](#messageboxedstring)

sealed interface that stores validated payloads using boxed classes

## MessageBoxedString
public record MessageBoxedString<br>
implements [MessageBoxed](#messageboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MessageBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Message
public static class Message<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## TypeBoxed
public sealed interface TypeBoxed<br>
permits<br>
[TypeBoxedString](#typeboxedstring)

sealed interface that stores validated payloads using boxed classes

## TypeBoxedString
public record TypeBoxedString<br>
implements [TypeBoxed](#typeboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TypeBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Type
public static class Type<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## CodeBoxed
public sealed interface CodeBoxed<br>
permits<br>
[CodeBoxedNumber](#codeboxednumber)

sealed interface that stores validated payloads using boxed classes

## CodeBoxedNumber
public record CodeBoxedNumber<br>
implements [CodeBoxed](#codeboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CodeBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Code
public static class Code<br>
extends Int32JsonSchema.Int32JsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int32JsonSchema.Int32JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

# ApiResponseSchema
org.openapijsonschematools.client.components.schemas.ApiResponseSchema.java
public class ApiResponseSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ApiResponseSchema.ApiResponseSchema1](#apiresponseschema1)<br> schema class |
| static class | [ApiResponseSchema.ApiResponseMapBuilder](#apiresponsemapbuilder)<br> builder for Map payloads |
| static class | [ApiResponseSchema.ApiResponseMap](#apiresponsemap)<br> output class for Map payloads |
| static class | [ApiResponseSchema.Message](#message)<br> schema class |
| static class | [ApiResponseSchema.Type](#type)<br> schema class |
| static class | [ApiResponseSchema.Code](#code)<br> schema class |

## ApiResponseSchema1
public static class ApiResponseSchema1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
ApiResponseSchema.ApiResponseMap validatedPayload =
    ApiResponseSchema.ApiResponseSchema1.validate(
    MapMaker.makeMap(
        new AbstractMap.SimpleEntry<String, Object>(
            "code",
            1
        ),
        new AbstractMap.SimpleEntry<String, Object>(
            "type",
            "a"
        ),
        new AbstractMap.SimpleEntry<String, Object>(
            "message",
            "a"
        )
    ),
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
| [ApiResponseMap](#apiresponsemap) | validate([Map<?, ?>](#apiresponsemapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ApiResponseMapBuilder
public class ApiResponseMapBuilder<br>
builder for `Map<String, ? extends @Nullable Object>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **code** | Number |  | [optional] value must be a 32 bit integer |
| **type** | String |  | [optional] |
| **message** | String |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## ApiResponseMap
public static class ApiResponseMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ApiResponseMap](#apiresponsemap) | of([Map<String, ? extends @Nullable Object>](#apiresponsemapbuilder) arg, SchemaConfiguration configuration) |
| int | code()<br>[optional] value must be a 32 bit integer |
| String | type()<br>[optional] |
| String | message()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Message
public static class Message<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Type
public static class Type<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Code
public static class Code<br>
extends Int32JsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int32JsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

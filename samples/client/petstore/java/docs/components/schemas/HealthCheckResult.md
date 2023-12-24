# HealthCheckResult
org.openapijsonschematools.client.components.schemas.HealthCheckResult.java
public class HealthCheckResult

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for list payloads
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [HealthCheckResult.HealthCheckResult1](#healthcheckresult1)<br> schema class |
| static class | [HealthCheckResult.HealthCheckResultMapInput](#healthcheckresultmapinput)<br> builder for Map payloads |
| static class | [HealthCheckResult.HealthCheckResultMap](#healthcheckresultmap)<br> output class for Map payloads |
| static class | [HealthCheckResult.NullableMessage](#nullablemessage)<br> schema class |

## HealthCheckResult1
public static class HealthCheckResult1<br>
extends JsonSchema

A schema class that validates payloads

## Description
Just a string to inform instance is up and running. Make it nullable in hope to get it as pointer in generated model.

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
HealthCheckResult.HealthCheckResultMap validatedPayload =
    HealthCheckResult.HealthCheckResult1.validate(
    MapMaker.makeMap(
        new AbstractMap.SimpleEntry<>(
            "NullableMessage",
            null
        )
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(Map.class)<br/> |
| Map<String, Class<? extends JsonSchema>> | &nbsp;&nbsp;&nbsp;&nbsp;properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("NullableMessage", [NullableMessage.class](#nullablemessage)))<br>&nbsp;&nbsp;&nbsp;&nbsp;)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [HealthCheckResultMap](#healthcheckresultmap) | validate([Map<?, ?>](#healthcheckresultmapinput) arg, SchemaConfiguration configuration) |
| static @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## HealthCheckResultMapInput
public class HealthCheckResultMapInput<br>
builder for `Map<String, ? extends @Nullable Object>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **NullableMessage** | ? extends @Nullable String |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## HealthCheckResultMap
public static class HealthCheckResultMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [HealthCheckResultMap](#healthcheckresultmap) | of([Map<String, ? extends @Nullable Object>](#healthcheckresultmapinput) arg, SchemaConfiguration configuration) |
| @Nullable String | NullableMessage()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## NullableMessage
public static class NullableMessage<br>
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

// null validation
Void validatedPayload = HealthCheckResult.NullableMessage.validate(
    (Void) null,
    configuration
);

// String validation
String validatedPayload = HealthCheckResult.NullableMessage.validate(
    "a",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>&nbsp;&nbsp;&nbsp;&nbsp;)<br/> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static String | validate(String arg, SchemaConfiguration configuration) |
| static @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

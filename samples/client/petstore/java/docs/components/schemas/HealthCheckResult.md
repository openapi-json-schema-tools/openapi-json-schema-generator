# HealthCheckResult
org.openapijsonschematools.client.components.schemas.HealthCheckResult.java
public class HealthCheckResult

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [HealthCheckResult.HealthCheckResult1Boxed](#healthcheckresult1boxed)<br> sealed validated payload class |
| static class | [HealthCheckResult.HealthCheckResult1](#healthcheckresult1)<br> schema class |
| static class | [HealthCheckResult.HealthCheckResultMapBuilder](#healthcheckresultmapbuilder)<br> builder for Map payloads |
| static class | [HealthCheckResult.HealthCheckResultMap](#healthcheckresultmap)<br> output class for Map payloads |
| static class | [HealthCheckResult.NullableMessageBoxed](#nullablemessageboxed)<br> sealed validated payload class |
| static class | [HealthCheckResult.NullableMessage](#nullablemessage)<br> schema class |

## HealthCheckResult1Boxed
public static abstract sealed class HealthCheckResult1Boxed<br>
permits<br>
[HealthCheckResult1BoxedMap](#healthcheckresult1boxedmap)

A sealed class that stores validated payloads using boxed classes

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
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
HealthCheckResult.HealthCheckResultMap validatedPayload =
    HealthCheckResult.HealthCheckResult1.validate(
    new HealthCheckResult.HealthCheckResultMapBuilder()
        .NullableMessage(null)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("NullableMessage", [NullableMessage.class](#nullablemessage)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [HealthCheckResultMap](#healthcheckresultmap) | validate([Map&lt;?, ?&gt;](#healthcheckresultmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## HealthCheckResultMapBuilder
public class HealthCheckResultMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| HealthCheckResultMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [HealthCheckResultMapBuilder](#healthcheckresultmapbuilder) | NullableMessage(Void value) |
| [HealthCheckResultMapBuilder](#healthcheckresultmapbuilder) | NullableMessage(String value) |
| [HealthCheckResultMapBuilder](#healthcheckresultmapbuilder) | additionalProperty(String key, Void value) |
| [HealthCheckResultMapBuilder](#healthcheckresultmapbuilder) | additionalProperty(String key, boolean value) |
| [HealthCheckResultMapBuilder](#healthcheckresultmapbuilder) | additionalProperty(String key, String value) |
| [HealthCheckResultMapBuilder](#healthcheckresultmapbuilder) | additionalProperty(String key, int value) |
| [HealthCheckResultMapBuilder](#healthcheckresultmapbuilder) | additionalProperty(String key, float value) |
| [HealthCheckResultMapBuilder](#healthcheckresultmapbuilder) | additionalProperty(String key, long value) |
| [HealthCheckResultMapBuilder](#healthcheckresultmapbuilder) | additionalProperty(String key, double value) |
| [HealthCheckResultMapBuilder](#healthcheckresultmapbuilder) | additionalProperty(String key, List<?> value) |
| [HealthCheckResultMapBuilder](#healthcheckresultmapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## HealthCheckResultMap
public static class HealthCheckResultMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [HealthCheckResultMap](#healthcheckresultmap) | of([Map<String, ? extends @Nullable Object>](#healthcheckresultmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable String | NullableMessage()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## NullableMessageBoxed
public static abstract sealed class NullableMessageBoxed<br>
permits<br>
[NullableMessageBoxedVoid](#nullablemessageboxedvoid),
[NullableMessageBoxedString](#nullablemessageboxedstring)

A sealed class that stores validated payloads using boxed classes

## NullableMessage
public static class NullableMessage<br>
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
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| String | validate(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

# MultipartformdataSchema
public class MultipartformdataSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [MultipartformdataSchema.MultipartformdataSchema1Boxed](#multipartformdataschema1boxed)<br> sealed interface for validated payloads |
| record | [MultipartformdataSchema.MultipartformdataSchema1BoxedMap](#multipartformdataschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [MultipartformdataSchema.MultipartformdataSchema1](#multipartformdataschema1)<br> schema class |
| static class | [MultipartformdataSchema.MultipartformdataSchemaMapBuilder](#multipartformdataschemamapbuilder)<br> builder for Map payloads |
| static class | [MultipartformdataSchema.MultipartformdataSchemaMap](#multipartformdataschemamap)<br> output class for Map payloads |
| sealed interface | [MultipartformdataSchema.MultipartformdataBBoxed](#multipartformdatabboxed)<br> sealed interface for validated payloads |
| record | [MultipartformdataSchema.MultipartformdataBBoxedString](#multipartformdatabboxedstring)<br> boxed class to store validated String payloads |
| static class | [MultipartformdataSchema.MultipartformdataB](#multipartformdatab)<br> schema class |

## MultipartformdataSchema1Boxed
public sealed interface MultipartformdataSchema1Boxed<br>
permits<br>
[MultipartformdataSchema1BoxedMap](#multipartformdataschema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## MultipartformdataSchema1BoxedMap
public record MultipartformdataSchema1BoxedMap<br>
implements [MultipartformdataSchema1Boxed](#multipartformdataschema1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipartformdataSchema1BoxedMap([MultipartformdataSchemaMap](#multipartformdataschemamap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [MultipartformdataSchemaMap](#multipartformdataschemamap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MultipartformdataSchema1
public static class MultipartformdataSchema1<br>
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
import org.openapijsonschematools.client.paths.fakemultiplerequestbodycontenttypes.post.requestbody.content.multipartformdata.MultipartformdataSchema;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
MultipartformdataSchema.MultipartformdataSchemaMap validatedPayload =
    MultipartformdataSchema.MultipartformdataSchema1.validate(
    new MultipartformdataSchema.MultipartformdataSchemaMapBuilder()
        .b("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("b", [MultipartformdataB.class](#multipartformdatab)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [MultipartformdataSchemaMap](#multipartformdataschemamap) | validate([Map&lt;?, ?&gt;](#multipartformdataschemamapbuilder) arg, SchemaConfiguration configuration) |
| [MultipartformdataSchema1BoxedMap](#multipartformdataschema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#multipartformdataschemamapbuilder) arg, SchemaConfiguration configuration) |
| [MultipartformdataSchema1Boxed](#multipartformdataschema1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## MultipartformdataSchemaMapBuilder
public class MultipartformdataSchemaMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipartformdataSchemaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [MultipartformdataSchemaMapBuilder](#multipartformdataschemamapbuilder) | b(String value) |
| [MultipartformdataSchemaMapBuilder](#multipartformdataschemamapbuilder) | additionalProperty(String key, Nothing? value) |
| [MultipartformdataSchemaMapBuilder](#multipartformdataschemamapbuilder) | additionalProperty(String key, boolean value) |
| [MultipartformdataSchemaMapBuilder](#multipartformdataschemamapbuilder) | additionalProperty(String key, String value) |
| [MultipartformdataSchemaMapBuilder](#multipartformdataschemamapbuilder) | additionalProperty(String key, int value) |
| [MultipartformdataSchemaMapBuilder](#multipartformdataschemamapbuilder) | additionalProperty(String key, float value) |
| [MultipartformdataSchemaMapBuilder](#multipartformdataschemamapbuilder) | additionalProperty(String key, long value) |
| [MultipartformdataSchemaMapBuilder](#multipartformdataschemamapbuilder) | additionalProperty(String key, double value) |
| [MultipartformdataSchemaMapBuilder](#multipartformdataschemamapbuilder) | additionalProperty(String key, List<?> value) |
| [MultipartformdataSchemaMapBuilder](#multipartformdataschemamapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## MultipartformdataSchemaMap
public static class MultipartformdataSchemaMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MultipartformdataSchemaMap](#multipartformdataschemamap) | of([Map<String, ? extends @Nullable Object>](#multipartformdataschemamapbuilder) arg, SchemaConfiguration configuration) |
| String | b()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## MultipartformdataBBoxed
public sealed interface MultipartformdataBBoxed<br>
permits<br>
[MultipartformdataBBoxedString](#multipartformdatabboxedstring)

sealed interface that stores validated payloads using boxed classes

## MultipartformdataBBoxedString
public record MultipartformdataBBoxedString<br>
implements [MultipartformdataBBoxed](#multipartformdatabboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipartformdataBBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MultipartformdataB
public static class MultipartformdataB<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

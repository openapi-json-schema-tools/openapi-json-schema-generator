# MultipartformdataSchema
public class MultipartformdataSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [MultipartformdataSchema.MultipartformdataSchema1Boxed](#multipartformdataschema1boxed)<br> abstract sealed validated payload class |
| static class | [MultipartformdataSchema.MultipartformdataSchema1BoxedMap](#multipartformdataschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [MultipartformdataSchema.MultipartformdataSchema1](#multipartformdataschema1)<br> schema class |
| static class | [MultipartformdataSchema.MultipartformdataSchemaMapBuilder](#multipartformdataschemamapbuilder)<br> builder for Map payloads |
| static class | [MultipartformdataSchema.MultipartformdataSchemaMap](#multipartformdataschemamap)<br> output class for Map payloads |
| static class | [MultipartformdataSchema.MultipartformdataFileBoxed](#multipartformdatafileboxed)<br> abstract sealed validated payload class |
| static class | [MultipartformdataSchema.MultipartformdataFile](#multipartformdatafile)<br> schema class |
| static class | [MultipartformdataSchema.MultipartformdataAdditionalMetadataBoxed](#multipartformdataadditionalmetadataboxed)<br> abstract sealed validated payload class |
| static class | [MultipartformdataSchema.MultipartformdataAdditionalMetadataBoxedString](#multipartformdataadditionalmetadataboxedstring)<br> boxed class to store validated String payloads |
| static class | [MultipartformdataSchema.MultipartformdataAdditionalMetadata](#multipartformdataadditionalmetadata)<br> schema class |

## MultipartformdataSchema1Boxed
public sealed interface MultipartformdataSchema1Boxed<br>
permits<br>
[MultipartformdataSchema1BoxedMap](#multipartformdataschema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## MultipartformdataSchema1BoxedMap
public static final class MultipartformdataSchema1BoxedMap<br>
implements [MultipartformdataSchema1Boxed](#multipartformdataschema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipartformdataSchema1BoxedMap([MultipartformdataSchemaMap](#multipartformdataschemamap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [MultipartformdataSchemaMap](#multipartformdataschemamap) | data<br>validated payload |

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

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
MultipartformdataSchema.MultipartformdataSchemaMap validatedPayload =
    MultipartformdataSchema.MultipartformdataSchema1.validate(
    new MultipartformdataSchema.MultipartformdataSchemaMapBuilder()
        .file("a")

        .additionalMetadata("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("additionalMetadata", [MultipartformdataAdditionalMetadata.class](#multipartformdataadditionalmetadata))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("file", [MultipartformdataFile.class](#multipartformdatafile)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"file"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [MultipartformdataSchemaMap](#multipartformdataschemamap) | validate([Map&lt;?, ?&gt;](#multipartformdataschemamapbuilder) arg, SchemaConfiguration configuration) |
| [MultipartformdataSchema1BoxedMap](#multipartformdataschema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#multipartformdataschemamapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## MultipartformdataSchemaMap0Builder
public class MultipartformdataSchemaMap0Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipartformdataSchemaMap0Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [MultipartformdataSchemaMap0Builder](#multipartformdataschemamap0builder) | additionalMetadata(String value) |
| [MultipartformdataSchemaMap0Builder](#multipartformdataschemamap0builder) | additionalProperty(String key, Void value) |
| [MultipartformdataSchemaMap0Builder](#multipartformdataschemamap0builder) | additionalProperty(String key, boolean value) |
| [MultipartformdataSchemaMap0Builder](#multipartformdataschemamap0builder) | additionalProperty(String key, String value) |
| [MultipartformdataSchemaMap0Builder](#multipartformdataschemamap0builder) | additionalProperty(String key, int value) |
| [MultipartformdataSchemaMap0Builder](#multipartformdataschemamap0builder) | additionalProperty(String key, float value) |
| [MultipartformdataSchemaMap0Builder](#multipartformdataschemamap0builder) | additionalProperty(String key, long value) |
| [MultipartformdataSchemaMap0Builder](#multipartformdataschemamap0builder) | additionalProperty(String key, double value) |
| [MultipartformdataSchemaMap0Builder](#multipartformdataschemamap0builder) | additionalProperty(String key, List<?> value) |
| [MultipartformdataSchemaMap0Builder](#multipartformdataschemamap0builder) | additionalProperty(String key, Map<String, ?> value) |

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
| [MultipartformdataSchemaMap0Builder](#multipartformdataschemamap0builder) | file(String value) |

## MultipartformdataSchemaMap
public static class MultipartformdataSchemaMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MultipartformdataSchemaMap](#multipartformdataschemamap) | of([Map<String, ? extends @Nullable Object>](#multipartformdataschemamapbuilder) arg, SchemaConfiguration configuration) |
| String | file()<br> |
| String | additionalMetadata()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## MultipartformdataFileBoxed
public sealed interface MultipartformdataFileBoxed<br>
permits<br>

sealed interface that stores validated payloads using boxed classes

## MultipartformdataFile
public static class MultipartformdataFile<br>
extends JsonSchema

A schema class that validates payloads

## Description
file to upload

## MultipartformdataAdditionalMetadataBoxed
public sealed interface MultipartformdataAdditionalMetadataBoxed<br>
permits<br>
[MultipartformdataAdditionalMetadataBoxedString](#multipartformdataadditionalmetadataboxedstring)

sealed interface that stores validated payloads using boxed classes

## MultipartformdataAdditionalMetadataBoxedString
public static final class MultipartformdataAdditionalMetadataBoxedString<br>
implements [MultipartformdataAdditionalMetadataBoxed](#multipartformdataadditionalmetadataboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipartformdataAdditionalMetadataBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## MultipartformdataAdditionalMetadata
public static class MultipartformdataAdditionalMetadata<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

## Description
Additional data to pass to server

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

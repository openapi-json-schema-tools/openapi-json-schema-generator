# Schema
public class Schema

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema.Schema1Boxed](#schema1boxed)<br> sealed validated payload class |
| static class | [Schema.Schema1](#schema1)<br> schema class |
| static class | [Schema.SchemaMapBuilder](#schemamapbuilder)<br> builder for Map payloads |
| static class | [Schema.SchemaMap](#schemamap)<br> output class for Map payloads |
| static class | [Schema.RequiredFileBoxed](#requiredfileboxed)<br> sealed validated payload class |
| static class | [Schema.RequiredFile](#requiredfile)<br> schema class |
| static class | [Schema.AdditionalMetadataBoxed](#additionalmetadataboxed)<br> sealed validated payload class |
| static class | [Schema.AdditionalMetadata](#additionalmetadata)<br> schema class |

## Schema1Boxed
public static abstract sealed class Schema1Boxed<br>
permits<br>
[Schema1BoxedMap](#schema1boxedmap)

A sealed class that stores validated payloads using boxed classes

## Schema1BoxedMap
public static final class Schema1BoxedMap<br>
extends Schema1Boxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedMap(SchemaMap data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| SchemaMap | data<br>validated payload |

## Schema1
public static class Schema1<br>
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
Schema.SchemaMap validatedPayload =
    Schema.Schema1.validate(
    new Schema.SchemaMapBuilder()
        .requiredFile("a")

        .additionalMetadata("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("additionalMetadata", [AdditionalMetadata.class](#additionalmetadata))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("requiredFile", [RequiredFile.class](#requiredfile)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"requiredFile"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap](#schemamap) | validate([Map&lt;?, ?&gt;](#schemamapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## SchemaMap0Builder
public class SchemaMap0Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMap0Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [SchemaMap0Builder](#schemamap0builder) | additionalMetadata(String value) |
| [SchemaMap0Builder](#schemamap0builder) | additionalProperty(String key, Void value) |
| [SchemaMap0Builder](#schemamap0builder) | additionalProperty(String key, boolean value) |
| [SchemaMap0Builder](#schemamap0builder) | additionalProperty(String key, String value) |
| [SchemaMap0Builder](#schemamap0builder) | additionalProperty(String key, int value) |
| [SchemaMap0Builder](#schemamap0builder) | additionalProperty(String key, float value) |
| [SchemaMap0Builder](#schemamap0builder) | additionalProperty(String key, long value) |
| [SchemaMap0Builder](#schemamap0builder) | additionalProperty(String key, double value) |
| [SchemaMap0Builder](#schemamap0builder) | additionalProperty(String key, List<?> value) |
| [SchemaMap0Builder](#schemamap0builder) | additionalProperty(String key, Map<String, ?> value) |

## SchemaMapBuilder
public class SchemaMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap0Builder](#schemamap0builder) | requiredFile(String value) |

## SchemaMap
public static class SchemaMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SchemaMap](#schemamap) | of([Map<String, ? extends @Nullable Object>](#schemamapbuilder) arg, SchemaConfiguration configuration) |
| String | requiredFile()<br> |
| String | additionalMetadata()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## RequiredFileBoxed
public static abstract sealed class RequiredFileBoxed<br>
permits<br>

A sealed class that stores validated payloads using boxed classes

## RequiredFile
public static class RequiredFile<br>
extends JsonSchema

A schema class that validates payloads

## Description
file to upload

## AdditionalMetadataBoxed
public static abstract sealed class AdditionalMetadataBoxed<br>
permits<br>
[AdditionalMetadataBoxedString](#additionalmetadataboxedstring)

A sealed class that stores validated payloads using boxed classes

## AdditionalMetadataBoxedString
public static final class AdditionalMetadataBoxedString<br>
extends AdditionalMetadataBoxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalMetadataBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## AdditionalMetadata
public static class AdditionalMetadata<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

## Description
Additional data to pass to server

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

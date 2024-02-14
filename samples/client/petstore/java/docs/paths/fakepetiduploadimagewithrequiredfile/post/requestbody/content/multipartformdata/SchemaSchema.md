# SchemaSchema
public class SchemaSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [SchemaSchema.SchemaSchema1Boxed](#schemaschema1boxed)<br> abstract sealed validated payload class |
| static class | [SchemaSchema.SchemaSchema1BoxedMap](#schemaschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [SchemaSchema.SchemaSchema1](#schemaschema1)<br> schema class |
| static class | [SchemaSchema.SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder)<br> builder for Map payloads |
| static class | [SchemaSchema.SchemaMapSchemaMap](#schemamapschemamap)<br> output class for Map payloads |
| static class | [SchemaSchema.RequiredFileRequiredFileBoxed](#requiredfilerequiredfileboxed)<br> abstract sealed validated payload class |
| static class | [SchemaSchema.RequiredFileRequiredFile](#requiredfilerequiredfile)<br> schema class |
| static class | [SchemaSchema.AdditionalMetadataAdditionalMetadataBoxed](#additionalmetadataadditionalmetadataboxed)<br> abstract sealed validated payload class |
| static class | [SchemaSchema.AdditionalMetadataAdditionalMetadataBoxedString](#additionalmetadataadditionalmetadataboxedstring)<br> boxed class to store validated String payloads |
| static class | [SchemaSchema.AdditionalMetadataAdditionalMetadata](#additionalmetadataadditionalmetadata)<br> schema class |

## SchemaSchema1Boxed
public static abstract sealed class SchemaSchema1Boxed<br>
permits<br>
[SchemaSchema1BoxedMap](#schemaschema1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## SchemaSchema1BoxedMap
public static final class SchemaSchema1BoxedMap<br>
extends [SchemaSchema1Boxed](#schemaschema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaSchema1BoxedMap([SchemaMapSchemaMap](#schemamapschemamap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [SchemaMapSchemaMap](#schemamapschemamap) | data<br>validated payload |

## SchemaSchema1
public static class SchemaSchema1<br>
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
SchemaSchema.SchemaMapSchemaMap validatedPayload =
    SchemaSchema.SchemaSchema1.validate(
    new SchemaSchema.SchemaMapBuilderSchemaMapBuilder()
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
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("additionalMetadata", [AdditionalMetadataAdditionalMetadata.class](#additionalmetadataadditionalmetadata))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("requiredFile", [RequiredFileRequiredFile.class](#requiredfilerequiredfile)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"requiredFile"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMapSchemaMap](#schemamapschemamap) | validate([Map&lt;?, ?&gt;](#schemamapbuilderschemamapbuilder) arg, SchemaConfiguration configuration) |
| [SchemaSchema1BoxedMap](#schemaschema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#schemamapbuilderschemamapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## SchemaMap0BuilderSchemaMap0Builder
public class SchemaMap0BuilderSchemaMap0Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMap0BuilderSchemaMap0Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [SchemaMap0BuilderSchemaMap0Builder](#schemamap0builderschemamap0builder) | additionalMetadata(String value) |
| [SchemaMap0BuilderSchemaMap0Builder](#schemamap0builderschemamap0builder) | additionalProperty(String key, Void value) |
| [SchemaMap0BuilderSchemaMap0Builder](#schemamap0builderschemamap0builder) | additionalProperty(String key, boolean value) |
| [SchemaMap0BuilderSchemaMap0Builder](#schemamap0builderschemamap0builder) | additionalProperty(String key, String value) |
| [SchemaMap0BuilderSchemaMap0Builder](#schemamap0builderschemamap0builder) | additionalProperty(String key, int value) |
| [SchemaMap0BuilderSchemaMap0Builder](#schemamap0builderschemamap0builder) | additionalProperty(String key, float value) |
| [SchemaMap0BuilderSchemaMap0Builder](#schemamap0builderschemamap0builder) | additionalProperty(String key, long value) |
| [SchemaMap0BuilderSchemaMap0Builder](#schemamap0builderschemamap0builder) | additionalProperty(String key, double value) |
| [SchemaMap0BuilderSchemaMap0Builder](#schemamap0builderschemamap0builder) | additionalProperty(String key, List<?> value) |
| [SchemaMap0BuilderSchemaMap0Builder](#schemamap0builderschemamap0builder) | additionalProperty(String key, Map<String, ?> value) |

## SchemaMapBuilderSchemaMapBuilder
public class SchemaMapBuilderSchemaMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMapBuilderSchemaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap0BuilderSchemaMap0Builder](#schemamap0builderschemamap0builder) | requiredFile(String value) |

## SchemaMapSchemaMap
public static class SchemaMapSchemaMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SchemaMapSchemaMap](#schemamapschemamap) | of([Map<String, ? extends @Nullable Object>](#schemamapbuilderschemamapbuilder) arg, SchemaConfiguration configuration) |
| String | requiredFile()<br> |
| String | additionalMetadata()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## RequiredFileRequiredFileBoxed
public static abstract sealed class RequiredFileRequiredFileBoxed<br>
permits<br>

abstract sealed class that stores validated payloads using boxed classes

## RequiredFileRequiredFile
public static class RequiredFileRequiredFile<br>
extends JsonSchema

A schema class that validates payloads

## Description
file to upload

## AdditionalMetadataAdditionalMetadataBoxed
public static abstract sealed class AdditionalMetadataAdditionalMetadataBoxed<br>
permits<br>
[AdditionalMetadataAdditionalMetadataBoxedString](#additionalmetadataadditionalmetadataboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## AdditionalMetadataAdditionalMetadataBoxedString
public static final class AdditionalMetadataAdditionalMetadataBoxedString<br>
extends [AdditionalMetadataAdditionalMetadataBoxed](#additionalmetadataadditionalmetadataboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalMetadataAdditionalMetadataBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## AdditionalMetadataAdditionalMetadata
public static class AdditionalMetadataAdditionalMetadata<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

## Description
Additional data to pass to server

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

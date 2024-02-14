# Multipart1formdataSchema
public class Multipart1formdataSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Multipart1formdataSchema.Multipart1formdataSchema1Boxed](#multipart1formdataschema1boxed)<br> abstract sealed validated payload class |
| static class | [Multipart1formdataSchema.Multipart1formdataSchema1BoxedMap](#multipart1formdataschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Multipart1formdataSchema.Multipart1formdataSchema1](#multipart1formdataschema1)<br> schema class |
| static class | [Multipart1formdataSchema.Multipart1formdataSchemaMapBuilder](#multipart1formdataschemamapbuilder)<br> builder for Map payloads |
| static class | [Multipart1formdataSchema.Multipart1formdataSchemaMap](#multipart1formdataschemamap)<br> output class for Map payloads |
| static class | [Multipart1formdataSchema.Multipart1formdataFileBoxed](#multipart1formdatafileboxed)<br> abstract sealed validated payload class |
| static class | [Multipart1formdataSchema.Multipart1formdataFile](#multipart1formdatafile)<br> schema class |
| static class | [Multipart1formdataSchema.Multipart1formdataAdditionalMetadataBoxed](#multipart1formdataadditionalmetadataboxed)<br> abstract sealed validated payload class |
| static class | [Multipart1formdataSchema.Multipart1formdataAdditionalMetadataBoxedString](#multipart1formdataadditionalmetadataboxedstring)<br> boxed class to store validated String payloads |
| static class | [Multipart1formdataSchema.Multipart1formdataAdditionalMetadata](#multipart1formdataadditionalmetadata)<br> schema class |

## Multipart1formdataSchema1Boxed
public static abstract sealed class Multipart1formdataSchema1Boxed<br>
permits<br>
[Multipart1formdataSchema1BoxedMap](#multipart1formdataschema1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Multipart1formdataSchema1BoxedMap
public static final class Multipart1formdataSchema1BoxedMap<br>
extends [Multipart1formdataSchema1Boxed](#multipart1formdataschema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Multipart1formdataSchema1BoxedMap([Multipart1formdataSchemaMap](#multipart1formdataschemamap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [Multipart1formdataSchemaMap](#multipart1formdataschemamap) | data<br>validated payload |

## Multipart1formdataSchema1
public static class Multipart1formdataSchema1<br>
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
Multipart1formdataSchema.Multipart1formdataSchemaMap validatedPayload =
    Multipart1formdataSchema.Multipart1formdataSchema1.validate(
    new Multipart1formdataSchema.Multipart1formdataSchemaMapBuilder()
        .additionalMetadata("a")

        .file("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("additionalMetadata", [Multipart1formdataAdditionalMetadata.class](#multipart1formdataadditionalmetadata))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("file", [Multipart1formdataFile.class](#multipart1formdatafile)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Multipart1formdataSchemaMap](#multipart1formdataschemamap) | validate([Map&lt;?, ?&gt;](#multipart1formdataschemamapbuilder) arg, SchemaConfiguration configuration) |
| [Multipart1formdataSchema1BoxedMap](#multipart1formdataschema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#multipart1formdataschemamapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Multipart1formdataSchemaMapBuilder
public class Multipart1formdataSchemaMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Multipart1formdataSchemaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [Multipart1formdataSchemaMapBuilder](#multipart1formdataschemamapbuilder) | additionalMetadata(String value) |
| [Multipart1formdataSchemaMapBuilder](#multipart1formdataschemamapbuilder) | file(String value) |
| [Multipart1formdataSchemaMapBuilder](#multipart1formdataschemamapbuilder) | additionalProperty(String key, Void value) |
| [Multipart1formdataSchemaMapBuilder](#multipart1formdataschemamapbuilder) | additionalProperty(String key, boolean value) |
| [Multipart1formdataSchemaMapBuilder](#multipart1formdataschemamapbuilder) | additionalProperty(String key, String value) |
| [Multipart1formdataSchemaMapBuilder](#multipart1formdataschemamapbuilder) | additionalProperty(String key, int value) |
| [Multipart1formdataSchemaMapBuilder](#multipart1formdataschemamapbuilder) | additionalProperty(String key, float value) |
| [Multipart1formdataSchemaMapBuilder](#multipart1formdataschemamapbuilder) | additionalProperty(String key, long value) |
| [Multipart1formdataSchemaMapBuilder](#multipart1formdataschemamapbuilder) | additionalProperty(String key, double value) |
| [Multipart1formdataSchemaMapBuilder](#multipart1formdataschemamapbuilder) | additionalProperty(String key, List<?> value) |
| [Multipart1formdataSchemaMapBuilder](#multipart1formdataschemamapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## Multipart1formdataSchemaMap
public static class Multipart1formdataSchemaMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Multipart1formdataSchemaMap](#multipart1formdataschemamap) | of([Map<String, ? extends @Nullable Object>](#multipart1formdataschemamapbuilder) arg, SchemaConfiguration configuration) |
| String | additionalMetadata()<br>[optional] |
| String | file()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Multipart1formdataFileBoxed
public static abstract sealed class Multipart1formdataFileBoxed<br>
permits<br>

abstract sealed class that stores validated payloads using boxed classes

## Multipart1formdataFile
public static class Multipart1formdataFile<br>
extends JsonSchema

A schema class that validates payloads

## Description
file to upload

## Multipart1formdataAdditionalMetadataBoxed
public static abstract sealed class Multipart1formdataAdditionalMetadataBoxed<br>
permits<br>
[Multipart1formdataAdditionalMetadataBoxedString](#multipart1formdataadditionalmetadataboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Multipart1formdataAdditionalMetadataBoxedString
public static final class Multipart1formdataAdditionalMetadataBoxedString<br>
extends [Multipart1formdataAdditionalMetadataBoxed](#multipart1formdataadditionalmetadataboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Multipart1formdataAdditionalMetadataBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Multipart1formdataAdditionalMetadata
public static class Multipart1formdataAdditionalMetadata<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

## Description
Additional data to pass to server

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

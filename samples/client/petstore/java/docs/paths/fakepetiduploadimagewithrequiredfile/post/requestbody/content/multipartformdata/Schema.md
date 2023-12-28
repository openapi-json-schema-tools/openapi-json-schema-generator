# Schema
org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.requestbody.content.multipartformdata.Schema.java
public class Schema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema.Schema1](#schema1)<br> schema class |
| static class | [Schema.SchemaMapBuilder](#schemamapbuilder)<br> builder for Map payloads |
| static class | [Schema.SchemaMap](#schemamap)<br> output class for Map payloads |
| static class | [Schema.RequiredFile](#requiredfile)<br> schema class |
| static class | [Schema.AdditionalMetadata](#additionalmetadata)<br> schema class |

## Schema1
public static class Schema1<br>
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
Schema.SchemaMap validatedPayload =
    Schema.Schema1.validate(
    MapMaker.makeMap(
        new AbstractMap.SimpleEntry<String, String>(
            "requiredFile",
            "a"
        ),
        new AbstractMap.SimpleEntry<String, String>(
            "additionalMetadata",
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
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("additionalMetadata", [AdditionalMetadata.class](#additionalmetadata))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("requiredFile", [RequiredFile.class](#requiredfile)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"requiredFile"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap](#schemamap) | validate([Map<?, ?>](#schemamapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## SchemaMapBuilder
public class SchemaMapBuilder<br>
builder for `Map<String, ? extends @Nullable Object>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **requiredFile** | String | file to upload | |
| **additionalMetadata** | String | Additional data to pass to server | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

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
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## RequiredFile
public static class RequiredFile<br>
extends JsonSchema

A schema class that validates payloads

## Description
file to upload

## AdditionalMetadata
public static class AdditionalMetadata<br>
extends StringJsonSchema

A schema class that validates payloads

## Description
Additional data to pass to server

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

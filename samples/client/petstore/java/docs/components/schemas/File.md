# File
org.openapijsonschematools.client.components.schemas.File.java
public class File

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for list payloads
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [File.File1](#file1)<br> schema class |
| static class | [File.FileMapInput](#filemapinput)<br> builder for Map payloads |
| static class | [File.FileMap](#filemap)<br> output class for Map payloads |
| static class | [File.SourceURI](#sourceuri)<br> schema class |

## File1
public static class File1<br>
extends JsonSchema

A schema class that validates payloads

## Description
Must be named &#x60;File&#x60; for test.

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
File.FileMap validatedPayload =
    File.File1.validate(
    MapMaker.makeMap(
        new AbstractMap.SimpleEntry<>(
            "sourceURI",
            "a"
        )
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(Map.class)<br/> |
| Map<String, Class<? extends JsonSchema>> | &nbsp;&nbsp;&nbsp;&nbsp;properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("sourceURI", [SourceURI.class](#sourceuri)))<br>&nbsp;&nbsp;&nbsp;&nbsp;)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FileMap](#filemap) | validate([Map<String, ?>](#filemapinput) arg, SchemaConfiguration configuration) |
| static @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## FileMapInput
public class FileMapInput<br>
builder for `Map<String, ? extends @Nullable Object>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **sourceURI** | String | Test capitalization | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## FileMap
public static class FileMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FileMap](#filemap) | of([Map<String, ? extends @Nullable Object>](#filemapinput) arg, SchemaConfiguration configuration) |
| String | sourceURI()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## SourceURI
public static class SourceURI<br>
extends StringJsonSchema

A schema class that validates payloads

## Description
Test capitalization

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

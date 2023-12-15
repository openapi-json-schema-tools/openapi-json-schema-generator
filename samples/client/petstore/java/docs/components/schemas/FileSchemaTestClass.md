# FileSchemaTestClass
org.openapijsonschematools.client.components.schemas.FileSchemaTestClass.java
public class FileSchemaTestClass

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for list payloads
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [FileSchemaTestClass.FileSchemaTestClass1](#fileschematestclass1)<br> schema class |
| static class | [FileSchemaTestClass.FileSchemaTestClassMapInput](#fileschematestclassmapinput)<br> builder for Map payloads |
| static class | [FileSchemaTestClass.FileSchemaTestClassMap](#fileschematestclassmap)<br> output class for Map payloads |
| static class | [FileSchemaTestClass.Files](#files)<br> schema class |
| static class | [FileSchemaTestClass.FilesListInput](#fileslistinput)<br> builder for List payloads |
| static class | [FileSchemaTestClass.FilesList](#fileslist)<br> output class for List payloads |

## FileSchemaTestClass1
public static class FileSchemaTestClass1<br>
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
FileSchemaTestClass.FileSchemaTestClassMap validatedPayload =
    FileSchemaTestClass.FileSchemaTestClass1.validate(
    MapMaker.makeMap(
        new AbstractMap.SimpleEntry<>(
            "files",
            Arrays.asList(
            )
        )
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(FrozenMap.class)<br/> |
| Map<String, Class<? extends JsonSchema>> | &nbsp;&nbsp;&nbsp;&nbsp;properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("file", [File.File1.class](../../components/schemas/File.md#file1)),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("files", [Files.class](#files)))<br>&nbsp;&nbsp;&nbsp;&nbsp;)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FileSchemaTestClassMap](#fileschematestclassmap) | validate([Map<String, Object>](#fileschematestclassmapinput) arg, SchemaConfiguration configuration) |

## FileSchemaTestClassMapInput
public class FileSchemaTestClassMapInput<br>
builder for `Map<String, Object>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **file** | Map<String, Object> |  | [optional] |
| **files** | List<Map<String, Object>> |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## FileSchemaTestClassMap
public static class FileSchemaTestClassMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FileSchemaTestClassMap](#fileschematestclassmap) | of([Map<String, Object>](#fileschematestclassmapinput) arg, SchemaConfiguration configuration) |
| [File.FileMap](../../components/schemas/File.md#filemap) | file()<br>[optional] |
| [FilesList](#fileslist) | files()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Files
public static class Files<br>
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

// List validation
FileSchemaTestClass.FilesList validatedPayload =
    FileSchemaTestClass.Files.validate(
    Arrays.asList(
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(FrozenList.class)<br/> |
| Class<? extends JsonSchema> | &nbsp;&nbsp;&nbsp;&nbsp;items = [File.File1.class](../../components/schemas/File.md#file1)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FilesList](#fileslist) | validate([List<Map<String, Object>>](#fileslistinput) arg, SchemaConfiguration configuration) |

## FilesListInput
public class FilesListInput<br>
builder for `List<Map<String, Object>>`

A class that builds the List input type

## Input List Items
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Map<String, Object> |  |

## FilesList
public class FilesList<br>
extends `FrozenList<File.FileMap>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FilesList](#fileslist) | of([List<Map<String, Object>>](#fileslistinput) arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)

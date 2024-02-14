# SchemaSchema
public class SchemaSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads
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
| static class | [SchemaSchema.FilesFilesBoxed](#filesfilesboxed)<br> abstract sealed validated payload class |
| static class | [SchemaSchema.FilesFilesBoxedList](#filesfilesboxedlist)<br> boxed class to store validated List payloads |
| static class | [SchemaSchema.FilesFiles](#filesfiles)<br> schema class |
| static class | [SchemaSchema.FilesListBuilderFilesListBuilder](#fileslistbuilderfileslistbuilder)<br> builder for List payloads |
| static class | [SchemaSchema.FilesListFilesList](#fileslistfileslist)<br> output class for List payloads |
| static class | [SchemaSchema.ItemsItemsBoxed](#itemsitemsboxed)<br> abstract sealed validated payload class |
| static class | [SchemaSchema.ItemsItems](#itemsitems)<br> schema class |

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
        .files(
            Arrays.asList(
                "a"
            )
        )
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("files", [FilesFiles.class](#filesfiles)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMapSchemaMap](#schemamapschemamap) | validate([Map&lt;?, ?&gt;](#schemamapbuilderschemamapbuilder) arg, SchemaConfiguration configuration) |
| [SchemaSchema1BoxedMap](#schemaschema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#schemamapbuilderschemamapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
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
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder) | files(List<String> value) |
| [SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder) | additionalProperty(String key, Void value) |
| [SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder) | additionalProperty(String key, boolean value) |
| [SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder) | additionalProperty(String key, String value) |
| [SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder) | additionalProperty(String key, int value) |
| [SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder) | additionalProperty(String key, float value) |
| [SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder) | additionalProperty(String key, long value) |
| [SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder) | additionalProperty(String key, double value) |
| [SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder) | additionalProperty(String key, List<?> value) |
| [SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## SchemaMapSchemaMap
public static class SchemaMapSchemaMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SchemaMapSchemaMap](#schemamapschemamap) | of([Map<String, ? extends @Nullable Object>](#schemamapbuilderschemamapbuilder) arg, SchemaConfiguration configuration) |
| [FilesListFilesList](#fileslistfileslist) | files()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## FilesFilesBoxed
public static abstract sealed class FilesFilesBoxed<br>
permits<br>
[FilesFilesBoxedList](#filesfilesboxedlist)

abstract sealed class that stores validated payloads using boxed classes

## FilesFilesBoxedList
public static final class FilesFilesBoxedList<br>
extends [FilesFilesBoxed](#filesfilesboxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FilesFilesBoxedList([FilesListFilesList](#fileslistfileslist) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [FilesListFilesList](#fileslistfileslist) | data<br>validated payload |

## FilesFiles
public static class FilesFiles<br>
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

// List validation
SchemaSchema.FilesListFilesList validatedPayload =
    SchemaSchema.FilesFiles.validate(
    new SchemaSchema.FilesListBuilderFilesListBuilder()
        .add("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(List.class) |
| Class<? extends JsonSchema> | items = [ItemsItems.class](#itemsitems) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FilesListFilesList](#fileslistfileslist) | validate([List<?>](#fileslistbuilderfileslistbuilder) arg, SchemaConfiguration configuration) |
| [FilesFilesBoxedList](#filesfilesboxedlist) | validateAndBox([List<?>](#fileslistbuilderfileslistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## FilesListBuilderFilesListBuilder
public class FilesListBuilderFilesListBuilder<br>
builder for `List<String>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FilesListBuilderFilesListBuilder()<br>Creates an empty list |
| FilesListBuilderFilesListBuilder(List<String> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FilesListBuilderFilesListBuilder | add(String item) |
| List<String> | build()<br>Returns list input that should be used with Schema.validate |

## FilesListFilesList
public class FilesListFilesList<br>
extends `FrozenList<String>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FilesListFilesList](#fileslistfileslist) | of([List<String>](#fileslistbuilderfileslistbuilder) arg, SchemaConfiguration configuration) |

## ItemsItemsBoxed
public static abstract sealed class ItemsItemsBoxed<br>
permits<br>

abstract sealed class that stores validated payloads using boxed classes

## ItemsItems
public static class ItemsItems<br>
extends JsonSchema

A schema class that validates payloads

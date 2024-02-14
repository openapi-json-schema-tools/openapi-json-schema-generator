# Multipart~1formDataSchema
public class Multipart~1formDataSchema

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
| static class | [Multipart~1formDataSchema.Multipart~1formDataSchema1Boxed](#multipart~1formdataschema1boxed)<br> abstract sealed validated payload class |
| static class | [Multipart~1formDataSchema.Multipart~1formDataSchema1BoxedMap](#multipart~1formdataschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Multipart~1formDataSchema.Multipart~1formDataSchema1](#multipart~1formdataschema1)<br> schema class |
| static class | [Multipart~1formDataSchema.Multipart~1formDataSchemaMapBuilder](#multipart~1formdataschemamapbuilder)<br> builder for Map payloads |
| static class | [Multipart~1formDataSchema.Multipart~1formDataSchemaMap](#multipart~1formdataschemamap)<br> output class for Map payloads |
| static class | [Multipart~1formDataSchema.Multipart~1formDataFilesBoxed](#multipart~1formdatafilesboxed)<br> abstract sealed validated payload class |
| static class | [Multipart~1formDataSchema.Multipart~1formDataFilesBoxedList](#multipart~1formdatafilesboxedlist)<br> boxed class to store validated List payloads |
| static class | [Multipart~1formDataSchema.Multipart~1formDataFiles](#multipart~1formdatafiles)<br> schema class |
| static class | [Multipart~1formDataSchema.Multipart~1formDataFilesListBuilder](#multipart~1formdatafileslistbuilder)<br> builder for List payloads |
| static class | [Multipart~1formDataSchema.Multipart~1formDataFilesList](#multipart~1formdatafileslist)<br> output class for List payloads |
| static class | [Multipart~1formDataSchema.Multipart~1formDataItemsBoxed](#multipart~1formdataitemsboxed)<br> abstract sealed validated payload class |
| static class | [Multipart~1formDataSchema.Multipart~1formDataItems](#multipart~1formdataitems)<br> schema class |

## Multipart~1formDataSchema1Boxed
public static abstract sealed class Multipart~1formDataSchema1Boxed<br>
permits<br>
[Multipart~1formDataSchema1BoxedMap](#multipart~1formdataschema1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Multipart~1formDataSchema1BoxedMap
public static final class Multipart~1formDataSchema1BoxedMap<br>
extends [Multipart~1formDataSchema1Boxed](#multipart~1formdataschema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Multipart~1formDataSchema1BoxedMap([Multipart~1formDataSchemaMap](#multipart~1formdataschemamap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [Multipart~1formDataSchemaMap](#multipart~1formdataschemamap) | data<br>validated payload |

## Multipart~1formDataSchema1
public static class Multipart~1formDataSchema1<br>
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
Multipart~1formDataSchema.Multipart~1formDataSchemaMap validatedPayload =
    Multipart~1formDataSchema.Multipart~1formDataSchema1.validate(
    new Multipart~1formDataSchema.Multipart~1formDataSchemaMapBuilder()
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
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("files", [Multipart~1formDataFiles.class](#multipart~1formdatafiles)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Multipart~1formDataSchemaMap](#multipart~1formdataschemamap) | validate([Map&lt;?, ?&gt;](#multipart~1formdataschemamapbuilder) arg, SchemaConfiguration configuration) |
| [Multipart~1formDataSchema1BoxedMap](#multipart~1formdataschema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#multipart~1formdataschemamapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Multipart~1formDataSchemaMapBuilder
public class Multipart~1formDataSchemaMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Multipart~1formDataSchemaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [Multipart~1formDataSchemaMapBuilder](#multipart~1formdataschemamapbuilder) | files(List<String> value) |
| [Multipart~1formDataSchemaMapBuilder](#multipart~1formdataschemamapbuilder) | additionalProperty(String key, Void value) |
| [Multipart~1formDataSchemaMapBuilder](#multipart~1formdataschemamapbuilder) | additionalProperty(String key, boolean value) |
| [Multipart~1formDataSchemaMapBuilder](#multipart~1formdataschemamapbuilder) | additionalProperty(String key, String value) |
| [Multipart~1formDataSchemaMapBuilder](#multipart~1formdataschemamapbuilder) | additionalProperty(String key, int value) |
| [Multipart~1formDataSchemaMapBuilder](#multipart~1formdataschemamapbuilder) | additionalProperty(String key, float value) |
| [Multipart~1formDataSchemaMapBuilder](#multipart~1formdataschemamapbuilder) | additionalProperty(String key, long value) |
| [Multipart~1formDataSchemaMapBuilder](#multipart~1formdataschemamapbuilder) | additionalProperty(String key, double value) |
| [Multipart~1formDataSchemaMapBuilder](#multipart~1formdataschemamapbuilder) | additionalProperty(String key, List<?> value) |
| [Multipart~1formDataSchemaMapBuilder](#multipart~1formdataschemamapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## Multipart~1formDataSchemaMap
public static class Multipart~1formDataSchemaMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Multipart~1formDataSchemaMap](#multipart~1formdataschemamap) | of([Map<String, ? extends @Nullable Object>](#multipart~1formdataschemamapbuilder) arg, SchemaConfiguration configuration) |
| [Multipart~1formDataFilesList](#multipart~1formdatafileslist) | files()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Multipart~1formDataFilesBoxed
public static abstract sealed class Multipart~1formDataFilesBoxed<br>
permits<br>
[Multipart~1formDataFilesBoxedList](#multipart~1formdatafilesboxedlist)

abstract sealed class that stores validated payloads using boxed classes

## Multipart~1formDataFilesBoxedList
public static final class Multipart~1formDataFilesBoxedList<br>
extends [Multipart~1formDataFilesBoxed](#multipart~1formdatafilesboxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Multipart~1formDataFilesBoxedList([Multipart~1formDataFilesList](#multipart~1formdatafileslist) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [Multipart~1formDataFilesList](#multipart~1formdatafileslist) | data<br>validated payload |

## Multipart~1formDataFiles
public static class Multipart~1formDataFiles<br>
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
Multipart~1formDataSchema.Multipart~1formDataFilesList validatedPayload =
    Multipart~1formDataSchema.Multipart~1formDataFiles.validate(
    new Multipart~1formDataSchema.Multipart~1formDataFilesListBuilder()
        .add("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(List.class) |
| Class<? extends JsonSchema> | items = [Multipart~1formDataItems.class](#multipart~1formdataitems) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Multipart~1formDataFilesList](#multipart~1formdatafileslist) | validate([List<?>](#multipart~1formdatafileslistbuilder) arg, SchemaConfiguration configuration) |
| [Multipart~1formDataFilesBoxedList](#multipart~1formdatafilesboxedlist) | validateAndBox([List<?>](#multipart~1formdatafileslistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Multipart~1formDataFilesListBuilder
public class Multipart~1formDataFilesListBuilder<br>
builder for `List<String>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Multipart~1formDataFilesListBuilder()<br>Creates an empty list |
| Multipart~1formDataFilesListBuilder(List<String> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Multipart~1formDataFilesListBuilder | add(String item) |
| List<String> | build()<br>Returns list input that should be used with Schema.validate |

## Multipart~1formDataFilesList
public class Multipart~1formDataFilesList<br>
extends `FrozenList<String>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Multipart~1formDataFilesList](#multipart~1formdatafileslist) | of([List<String>](#multipart~1formdatafileslistbuilder) arg, SchemaConfiguration configuration) |

## Multipart~1formDataItemsBoxed
public static abstract sealed class Multipart~1formDataItemsBoxed<br>
permits<br>

abstract sealed class that stores validated payloads using boxed classes

## Multipart~1formDataItems
public static class Multipart~1formDataItems<br>
extends JsonSchema

A schema class that validates payloads

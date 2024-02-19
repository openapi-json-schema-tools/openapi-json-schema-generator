# MultipartformdataSchema
public class MultipartformdataSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads
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
| static class | [MultipartformdataSchema.MultipartformdataFilesBoxed](#multipartformdatafilesboxed)<br> abstract sealed validated payload class |
| static class | [MultipartformdataSchema.MultipartformdataFilesBoxedList](#multipartformdatafilesboxedlist)<br> boxed class to store validated List payloads |
| static class | [MultipartformdataSchema.MultipartformdataFiles](#multipartformdatafiles)<br> schema class |
| static class | [MultipartformdataSchema.MultipartformdataFilesListBuilder](#multipartformdatafileslistbuilder)<br> builder for List payloads |
| static class | [MultipartformdataSchema.MultipartformdataFilesList](#multipartformdatafileslist)<br> output class for List payloads |
| static class | [MultipartformdataSchema.MultipartformdataItemsBoxed](#multipartformdataitemsboxed)<br> abstract sealed validated payload class |
| static class | [MultipartformdataSchema.MultipartformdataItems](#multipartformdataitems)<br> schema class |

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
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("files", [MultipartformdataFiles.class](#multipartformdatafiles)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [MultipartformdataSchemaMap](#multipartformdataschemamap) | validate([Map&lt;?, ?&gt;](#multipartformdataschemamapbuilder) arg, SchemaConfiguration configuration) |
| [MultipartformdataSchema1BoxedMap](#multipartformdataschema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#multipartformdataschemamapbuilder) arg, SchemaConfiguration configuration) |
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
| [MultipartformdataSchemaMapBuilder](#multipartformdataschemamapbuilder) | files(List<String> value) |
| [MultipartformdataSchemaMapBuilder](#multipartformdataschemamapbuilder) | additionalProperty(String key, Void value) |
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
| [MultipartformdataFilesList](#multipartformdatafileslist) | files()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## MultipartformdataFilesBoxed
public sealed interface MultipartformdataFilesBoxed<br>
permits<br>
[MultipartformdataFilesBoxedList](#multipartformdatafilesboxedlist)

sealed interface that stores validated payloads using boxed classes

## MultipartformdataFilesBoxedList
public static final class MultipartformdataFilesBoxedList<br>
implements [MultipartformdataFilesBoxed](#multipartformdatafilesboxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipartformdataFilesBoxedList([MultipartformdataFilesList](#multipartformdatafileslist) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [MultipartformdataFilesList](#multipartformdatafileslist) | data<br>validated payload |

## MultipartformdataFiles
public static class MultipartformdataFiles<br>
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
MultipartformdataSchema.MultipartformdataFilesList validatedPayload =
    MultipartformdataSchema.MultipartformdataFiles.validate(
    new MultipartformdataSchema.MultipartformdataFilesListBuilder()
        .add("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(List.class) |
| Class<? extends JsonSchema> | items = [MultipartformdataItems.class](#multipartformdataitems) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [MultipartformdataFilesList](#multipartformdatafileslist) | validate([List<?>](#multipartformdatafileslistbuilder) arg, SchemaConfiguration configuration) |
| [MultipartformdataFilesBoxedList](#multipartformdatafilesboxedlist) | validateAndBox([List<?>](#multipartformdatafileslistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## MultipartformdataFilesListBuilder
public class MultipartformdataFilesListBuilder<br>
builder for `List<String>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipartformdataFilesListBuilder()<br>Creates an empty list |
| MultipartformdataFilesListBuilder(List<String> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| MultipartformdataFilesListBuilder | add(String item) |
| List<String> | build()<br>Returns list input that should be used with Schema.validate |

## MultipartformdataFilesList
public class MultipartformdataFilesList<br>
extends `FrozenList<String>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MultipartformdataFilesList](#multipartformdatafileslist) | of([List<String>](#multipartformdatafileslistbuilder) arg, SchemaConfiguration configuration) |

## MultipartformdataItemsBoxed
public sealed interface MultipartformdataItemsBoxed<br>
permits<br>

sealed interface that stores validated payloads using boxed classes

## MultipartformdataItems
public static class MultipartformdataItems<br>
extends JsonSchema

A schema class that validates payloads

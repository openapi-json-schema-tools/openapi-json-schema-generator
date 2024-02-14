# Multipart1formdataSchema
public class Multipart1formdataSchema

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
| static class | [Multipart1formdataSchema.Multipart1formdataSchema1Boxed](#multipart1formdataschema1boxed)<br> abstract sealed validated payload class |
| static class | [Multipart1formdataSchema.Multipart1formdataSchema1BoxedMap](#multipart1formdataschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Multipart1formdataSchema.Multipart1formdataSchema1](#multipart1formdataschema1)<br> schema class |
| static class | [Multipart1formdataSchema.Multipart1formdataSchemaMapBuilder](#multipart1formdataschemamapbuilder)<br> builder for Map payloads |
| static class | [Multipart1formdataSchema.Multipart1formdataSchemaMap](#multipart1formdataschemamap)<br> output class for Map payloads |
| static class | [Multipart1formdataSchema.Multipart1formdataFilesBoxed](#multipart1formdatafilesboxed)<br> abstract sealed validated payload class |
| static class | [Multipart1formdataSchema.Multipart1formdataFilesBoxedList](#multipart1formdatafilesboxedlist)<br> boxed class to store validated List payloads |
| static class | [Multipart1formdataSchema.Multipart1formdataFiles](#multipart1formdatafiles)<br> schema class |
| static class | [Multipart1formdataSchema.Multipart1formdataFilesListBuilder](#multipart1formdatafileslistbuilder)<br> builder for List payloads |
| static class | [Multipart1formdataSchema.Multipart1formdataFilesList](#multipart1formdatafileslist)<br> output class for List payloads |
| static class | [Multipart1formdataSchema.Multipart1formdataItemsBoxed](#multipart1formdataitemsboxed)<br> abstract sealed validated payload class |
| static class | [Multipart1formdataSchema.Multipart1formdataItems](#multipart1formdataitems)<br> schema class |

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
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("files", [Multipart1formdataFiles.class](#multipart1formdatafiles)))<br>)<br> |

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
| [Multipart1formdataSchemaMapBuilder](#multipart1formdataschemamapbuilder) | files(List<String> value) |
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
| [Multipart1formdataFilesList](#multipart1formdatafileslist) | files()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Multipart1formdataFilesBoxed
public static abstract sealed class Multipart1formdataFilesBoxed<br>
permits<br>
[Multipart1formdataFilesBoxedList](#multipart1formdatafilesboxedlist)

abstract sealed class that stores validated payloads using boxed classes

## Multipart1formdataFilesBoxedList
public static final class Multipart1formdataFilesBoxedList<br>
extends [Multipart1formdataFilesBoxed](#multipart1formdatafilesboxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Multipart1formdataFilesBoxedList([Multipart1formdataFilesList](#multipart1formdatafileslist) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [Multipart1formdataFilesList](#multipart1formdatafileslist) | data<br>validated payload |

## Multipart1formdataFiles
public static class Multipart1formdataFiles<br>
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
Multipart1formdataSchema.Multipart1formdataFilesList validatedPayload =
    Multipart1formdataSchema.Multipart1formdataFiles.validate(
    new Multipart1formdataSchema.Multipart1formdataFilesListBuilder()
        .add("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(List.class) |
| Class<? extends JsonSchema> | items = [Multipart1formdataItems.class](#multipart1formdataitems) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Multipart1formdataFilesList](#multipart1formdatafileslist) | validate([List<?>](#multipart1formdatafileslistbuilder) arg, SchemaConfiguration configuration) |
| [Multipart1formdataFilesBoxedList](#multipart1formdatafilesboxedlist) | validateAndBox([List<?>](#multipart1formdatafileslistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Multipart1formdataFilesListBuilder
public class Multipart1formdataFilesListBuilder<br>
builder for `List<String>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Multipart1formdataFilesListBuilder()<br>Creates an empty list |
| Multipart1formdataFilesListBuilder(List<String> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Multipart1formdataFilesListBuilder | add(String item) |
| List<String> | build()<br>Returns list input that should be used with Schema.validate |

## Multipart1formdataFilesList
public class Multipart1formdataFilesList<br>
extends `FrozenList<String>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Multipart1formdataFilesList](#multipart1formdatafileslist) | of([List<String>](#multipart1formdatafileslistbuilder) arg, SchemaConfiguration configuration) |

## Multipart1formdataItemsBoxed
public static abstract sealed class Multipart1formdataItemsBoxed<br>
permits<br>

abstract sealed class that stores validated payloads using boxed classes

## Multipart1formdataItems
public static class Multipart1formdataItems<br>
extends JsonSchema

A schema class that validates payloads

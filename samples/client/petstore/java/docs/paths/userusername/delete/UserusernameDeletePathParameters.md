# UserusernameDeletePathParameters
public class UserusernameDeletePathParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [UserusernameDeletePathParameters.UserusernameDeletePathParameters1Boxed](#userusernamedeletepathparameters1boxed)<br> sealed interface for validated payloads |
| record | [UserusernameDeletePathParameters.UserusernameDeletePathParameters1BoxedMap](#userusernamedeletepathparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UserusernameDeletePathParameters.UserusernameDeletePathParameters1](#userusernamedeletepathparameters1)<br> schema class |
| static class | [UserusernameDeletePathParameters.UserusernameDeletePathParametersMapBuilder](#userusernamedeletepathparametersmapbuilder)<br> builder for Map payloads |
| static class | [UserusernameDeletePathParameters.UserusernameDeletePathParametersMap](#userusernamedeletepathparametersmap)<br> output class for Map payloads |
| sealed interface | [UserusernameDeletePathParameters.UserusernameDeleteadditionalPropertiesBoxed](#userusernamedeleteadditionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [UserusernameDeletePathParameters.UserusernameDeleteadditionalPropertiesBoxedVoid](#userusernamedeleteadditionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [UserusernameDeletePathParameters.UserusernameDeleteadditionalPropertiesBoxedBoolean](#userusernamedeleteadditionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [UserusernameDeletePathParameters.UserusernameDeleteadditionalPropertiesBoxedNumber](#userusernamedeleteadditionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [UserusernameDeletePathParameters.UserusernameDeleteadditionalPropertiesBoxedString](#userusernamedeleteadditionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [UserusernameDeletePathParameters.UserusernameDeleteadditionalPropertiesBoxedList](#userusernamedeleteadditionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [UserusernameDeletePathParameters.UserusernameDeleteadditionalPropertiesBoxedMap](#userusernamedeleteadditionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [UserusernameDeletePathParameters.UserusernameDeleteadditionalProperties](#userusernamedeleteadditionalproperties)<br> schema class |

## UserusernameDeletePathParameters1Boxed
public sealed interface UserusernameDeletePathParameters1Boxed<br>
permits<br>
[UserusernameDeletePathParameters1BoxedMap](#userusernamedeletepathparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## UserusernameDeletePathParameters1BoxedMap
public record UserusernameDeletePathParameters1BoxedMap<br>
implements [UserusernameDeletePathParameters1Boxed](#userusernamedeletepathparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernameDeletePathParameters1BoxedMap([UserusernameDeletePathParametersMap](#userusernamedeletepathparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserusernameDeletePathParametersMap](#userusernamedeletepathparametersmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernameDeletePathParameters1
public static class UserusernameDeletePathParameters1<br>
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
import org.openapijsonschematools.client.paths.userusername.delete.UserusernameDeletePathParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
UserusernameDeletePathParameters.UserusernameDeletePathParametersMap validatedPayload =
    UserusernameDeletePathParameters.UserusernameDeletePathParameters1.validate(
    new UserusernameDeletePathParameters.UserusernameDeletePathParametersMapBuilder()
        .username("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("username", [Schema.Schema1.class](../../../components/parameters/pathusername/Schema.md#schema1))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"username"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [UserusernameDeleteadditionalProperties.class](#userusernamedeleteadditionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserusernameDeletePathParametersMap](#userusernamedeletepathparametersmap) | validate([Map&lt;?, ?&gt;](#userusernamedeletepathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [UserusernameDeletePathParameters1BoxedMap](#userusernamedeletepathparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#userusernamedeletepathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [UserusernameDeletePathParameters1Boxed](#userusernamedeletepathparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## UserusernameDeletePathParametersMap0Builder
public class UserusernameDeletePathParametersMap0Builder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernameDeletePathParametersMap0Builder(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |

## UserusernameDeletePathParametersMapBuilder
public class UserusernameDeletePathParametersMapBuilder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernameDeletePathParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserusernameDeletePathParametersMap0Builder](#userusernamedeletepathparametersmap0builder) | username(String value) |

## UserusernameDeletePathParametersMap
public static class UserusernameDeletePathParametersMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [UserusernameDeletePathParametersMap](#userusernamedeletepathparametersmap) | of([Map<String, String>](#userusernamedeletepathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| String | username()<br> |

## UserusernameDeleteadditionalPropertiesBoxed
public sealed interface UserusernameDeleteadditionalPropertiesBoxed<br>
permits<br>
[UserusernameDeleteadditionalPropertiesBoxedVoid](#userusernamedeleteadditionalpropertiesboxedvoid),
[UserusernameDeleteadditionalPropertiesBoxedBoolean](#userusernamedeleteadditionalpropertiesboxedboolean),
[UserusernameDeleteadditionalPropertiesBoxedNumber](#userusernamedeleteadditionalpropertiesboxednumber),
[UserusernameDeleteadditionalPropertiesBoxedString](#userusernamedeleteadditionalpropertiesboxedstring),
[UserusernameDeleteadditionalPropertiesBoxedList](#userusernamedeleteadditionalpropertiesboxedlist),
[UserusernameDeleteadditionalPropertiesBoxedMap](#userusernamedeleteadditionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## UserusernameDeleteadditionalPropertiesBoxedVoid
public record UserusernameDeleteadditionalPropertiesBoxedVoid<br>
implements [UserusernameDeleteadditionalPropertiesBoxed](#userusernamedeleteadditionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernameDeleteadditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernameDeleteadditionalPropertiesBoxedBoolean
public record UserusernameDeleteadditionalPropertiesBoxedBoolean<br>
implements [UserusernameDeleteadditionalPropertiesBoxed](#userusernamedeleteadditionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernameDeleteadditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernameDeleteadditionalPropertiesBoxedNumber
public record UserusernameDeleteadditionalPropertiesBoxedNumber<br>
implements [UserusernameDeleteadditionalPropertiesBoxed](#userusernamedeleteadditionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernameDeleteadditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernameDeleteadditionalPropertiesBoxedString
public record UserusernameDeleteadditionalPropertiesBoxedString<br>
implements [UserusernameDeleteadditionalPropertiesBoxed](#userusernamedeleteadditionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernameDeleteadditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernameDeleteadditionalPropertiesBoxedList
public record UserusernameDeleteadditionalPropertiesBoxedList<br>
implements [UserusernameDeleteadditionalPropertiesBoxed](#userusernamedeleteadditionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernameDeleteadditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernameDeleteadditionalPropertiesBoxedMap
public record UserusernameDeleteadditionalPropertiesBoxedMap<br>
implements [UserusernameDeleteadditionalPropertiesBoxed](#userusernamedeleteadditionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernameDeleteadditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernameDeleteadditionalProperties
public static class UserusernameDeleteadditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

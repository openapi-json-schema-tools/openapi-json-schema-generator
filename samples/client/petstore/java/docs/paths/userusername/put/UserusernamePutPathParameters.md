# UserusernamePutPathParameters
public class UserusernamePutPathParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [UserusernamePutPathParameters.UserusernamePutPathParameters1Boxed](#userusernameputpathparameters1boxed)<br> sealed interface for validated payloads |
| record | [UserusernamePutPathParameters.UserusernamePutPathParameters1BoxedMap](#userusernameputpathparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UserusernamePutPathParameters.UserusernamePutPathParameters1](#userusernameputpathparameters1)<br> schema class |
| static class | [UserusernamePutPathParameters.UserusernamePutPathParametersMapBuilder](#userusernameputpathparametersmapbuilder)<br> builder for Map payloads |
| static class | [UserusernamePutPathParameters.UserusernamePutPathParametersMap](#userusernameputpathparametersmap)<br> output class for Map payloads |
| sealed interface | [UserusernamePutPathParameters.UserusernamePutadditionalPropertiesBoxed](#userusernameputadditionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [UserusernamePutPathParameters.UserusernamePutadditionalPropertiesBoxedVoid](#userusernameputadditionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [UserusernamePutPathParameters.UserusernamePutadditionalPropertiesBoxedBoolean](#userusernameputadditionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [UserusernamePutPathParameters.UserusernamePutadditionalPropertiesBoxedNumber](#userusernameputadditionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [UserusernamePutPathParameters.UserusernamePutadditionalPropertiesBoxedString](#userusernameputadditionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [UserusernamePutPathParameters.UserusernamePutadditionalPropertiesBoxedList](#userusernameputadditionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [UserusernamePutPathParameters.UserusernamePutadditionalPropertiesBoxedMap](#userusernameputadditionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [UserusernamePutPathParameters.UserusernamePutadditionalProperties](#userusernameputadditionalproperties)<br> schema class |

## UserusernamePutPathParameters1Boxed
public sealed interface UserusernamePutPathParameters1Boxed<br>
permits<br>
[UserusernamePutPathParameters1BoxedMap](#userusernameputpathparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## UserusernamePutPathParameters1BoxedMap
public record UserusernamePutPathParameters1BoxedMap<br>
implements [UserusernamePutPathParameters1Boxed](#userusernameputpathparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernamePutPathParameters1BoxedMap([UserusernamePutPathParametersMap](#userusernameputpathparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserusernamePutPathParametersMap](#userusernameputpathparametersmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernamePutPathParameters1
public static class UserusernamePutPathParameters1<br>
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
import org.openapijsonschematools.client.paths.userusername.put.UserusernamePutPathParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
UserusernamePutPathParameters.UserusernamePutPathParametersMap validatedPayload =
    UserusernamePutPathParameters.UserusernamePutPathParameters1.validate(
    new UserusernamePutPathParameters.UserusernamePutPathParametersMapBuilder()
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
| Class<? extends JsonSchema> | additionalProperties = [UserusernamePutadditionalProperties.class](#userusernameputadditionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserusernamePutPathParametersMap](#userusernameputpathparametersmap) | validate([Map&lt;?, ?&gt;](#userusernameputpathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [UserusernamePutPathParameters1BoxedMap](#userusernameputpathparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#userusernameputpathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [UserusernamePutPathParameters1Boxed](#userusernameputpathparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## UserusernamePutPathParametersMap0Builder
public class UserusernamePutPathParametersMap0Builder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernamePutPathParametersMap0Builder(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |

## UserusernamePutPathParametersMapBuilder
public class UserusernamePutPathParametersMapBuilder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernamePutPathParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserusernamePutPathParametersMap0Builder](#userusernameputpathparametersmap0builder) | username(String value) |

## UserusernamePutPathParametersMap
public static class UserusernamePutPathParametersMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [UserusernamePutPathParametersMap](#userusernameputpathparametersmap) | of([Map<String, String>](#userusernameputpathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| String | username()<br> |

## UserusernamePutadditionalPropertiesBoxed
public sealed interface UserusernamePutadditionalPropertiesBoxed<br>
permits<br>
[UserusernamePutadditionalPropertiesBoxedVoid](#userusernameputadditionalpropertiesboxedvoid),
[UserusernamePutadditionalPropertiesBoxedBoolean](#userusernameputadditionalpropertiesboxedboolean),
[UserusernamePutadditionalPropertiesBoxedNumber](#userusernameputadditionalpropertiesboxednumber),
[UserusernamePutadditionalPropertiesBoxedString](#userusernameputadditionalpropertiesboxedstring),
[UserusernamePutadditionalPropertiesBoxedList](#userusernameputadditionalpropertiesboxedlist),
[UserusernamePutadditionalPropertiesBoxedMap](#userusernameputadditionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## UserusernamePutadditionalPropertiesBoxedVoid
public record UserusernamePutadditionalPropertiesBoxedVoid<br>
implements [UserusernamePutadditionalPropertiesBoxed](#userusernameputadditionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernamePutadditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernamePutadditionalPropertiesBoxedBoolean
public record UserusernamePutadditionalPropertiesBoxedBoolean<br>
implements [UserusernamePutadditionalPropertiesBoxed](#userusernameputadditionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernamePutadditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernamePutadditionalPropertiesBoxedNumber
public record UserusernamePutadditionalPropertiesBoxedNumber<br>
implements [UserusernamePutadditionalPropertiesBoxed](#userusernameputadditionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernamePutadditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernamePutadditionalPropertiesBoxedString
public record UserusernamePutadditionalPropertiesBoxedString<br>
implements [UserusernamePutadditionalPropertiesBoxed](#userusernameputadditionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernamePutadditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernamePutadditionalPropertiesBoxedList
public record UserusernamePutadditionalPropertiesBoxedList<br>
implements [UserusernamePutadditionalPropertiesBoxed](#userusernameputadditionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernamePutadditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernamePutadditionalPropertiesBoxedMap
public record UserusernamePutadditionalPropertiesBoxedMap<br>
implements [UserusernamePutadditionalPropertiesBoxed](#userusernameputadditionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernamePutadditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernamePutadditionalProperties
public static class UserusernamePutadditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

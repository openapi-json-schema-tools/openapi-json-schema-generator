# UserusernameGetPathParameters
public class UserusernameGetPathParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [UserusernameGetPathParameters.UserusernameGetPathParameters1Boxed](#userusernamegetpathparameters1boxed)<br> sealed interface for validated payloads |
| record | [UserusernameGetPathParameters.UserusernameGetPathParameters1BoxedMap](#userusernamegetpathparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UserusernameGetPathParameters.UserusernameGetPathParameters1](#userusernamegetpathparameters1)<br> schema class |
| static class | [UserusernameGetPathParameters.UserusernameGetPathParametersMapBuilder](#userusernamegetpathparametersmapbuilder)<br> builder for Map payloads |
| static class | [UserusernameGetPathParameters.UserusernameGetPathParametersMap](#userusernamegetpathparametersmap)<br> output class for Map payloads |
| sealed interface | [UserusernameGetPathParameters.UserusernameGetadditionalPropertiesBoxed](#userusernamegetadditionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [UserusernameGetPathParameters.UserusernameGetadditionalPropertiesBoxedVoid](#userusernamegetadditionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [UserusernameGetPathParameters.UserusernameGetadditionalPropertiesBoxedBoolean](#userusernamegetadditionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [UserusernameGetPathParameters.UserusernameGetadditionalPropertiesBoxedNumber](#userusernamegetadditionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [UserusernameGetPathParameters.UserusernameGetadditionalPropertiesBoxedString](#userusernamegetadditionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [UserusernameGetPathParameters.UserusernameGetadditionalPropertiesBoxedList](#userusernamegetadditionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [UserusernameGetPathParameters.UserusernameGetadditionalPropertiesBoxedMap](#userusernamegetadditionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [UserusernameGetPathParameters.UserusernameGetadditionalProperties](#userusernamegetadditionalproperties)<br> schema class |

## UserusernameGetPathParameters1Boxed
public sealed interface UserusernameGetPathParameters1Boxed<br>
permits<br>
[UserusernameGetPathParameters1BoxedMap](#userusernamegetpathparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## UserusernameGetPathParameters1BoxedMap
public record UserusernameGetPathParameters1BoxedMap<br>
implements [UserusernameGetPathParameters1Boxed](#userusernamegetpathparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernameGetPathParameters1BoxedMap([UserusernameGetPathParametersMap](#userusernamegetpathparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserusernameGetPathParametersMap](#userusernamegetpathparametersmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernameGetPathParameters1
public static class UserusernameGetPathParameters1<br>
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
import org.openapijsonschematools.client.paths.userusername.get.UserusernameGetPathParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
UserusernameGetPathParameters.UserusernameGetPathParametersMap validatedPayload =
    UserusernameGetPathParameters.UserusernameGetPathParameters1.validate(
    new UserusernameGetPathParameters.UserusernameGetPathParametersMapBuilder()
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
| Class<? extends JsonSchema> | additionalProperties = [UserusernameGetadditionalProperties.class](#userusernamegetadditionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserusernameGetPathParametersMap](#userusernamegetpathparametersmap) | validate([Map&lt;?, ?&gt;](#userusernamegetpathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [UserusernameGetPathParameters1BoxedMap](#userusernamegetpathparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#userusernamegetpathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [UserusernameGetPathParameters1Boxed](#userusernamegetpathparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## UserusernameGetPathParametersMap0Builder
public class UserusernameGetPathParametersMap0Builder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernameGetPathParametersMap0Builder(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |

## UserusernameGetPathParametersMapBuilder
public class UserusernameGetPathParametersMapBuilder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernameGetPathParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserusernameGetPathParametersMap0Builder](#userusernamegetpathparametersmap0builder) | username(String value) |

## UserusernameGetPathParametersMap
public static class UserusernameGetPathParametersMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [UserusernameGetPathParametersMap](#userusernamegetpathparametersmap) | of([Map<String, String>](#userusernamegetpathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| String | username()<br> |

## UserusernameGetadditionalPropertiesBoxed
public sealed interface UserusernameGetadditionalPropertiesBoxed<br>
permits<br>
[UserusernameGetadditionalPropertiesBoxedVoid](#userusernamegetadditionalpropertiesboxedvoid),
[UserusernameGetadditionalPropertiesBoxedBoolean](#userusernamegetadditionalpropertiesboxedboolean),
[UserusernameGetadditionalPropertiesBoxedNumber](#userusernamegetadditionalpropertiesboxednumber),
[UserusernameGetadditionalPropertiesBoxedString](#userusernamegetadditionalpropertiesboxedstring),
[UserusernameGetadditionalPropertiesBoxedList](#userusernamegetadditionalpropertiesboxedlist),
[UserusernameGetadditionalPropertiesBoxedMap](#userusernamegetadditionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## UserusernameGetadditionalPropertiesBoxedVoid
public record UserusernameGetadditionalPropertiesBoxedVoid<br>
implements [UserusernameGetadditionalPropertiesBoxed](#userusernamegetadditionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernameGetadditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernameGetadditionalPropertiesBoxedBoolean
public record UserusernameGetadditionalPropertiesBoxedBoolean<br>
implements [UserusernameGetadditionalPropertiesBoxed](#userusernamegetadditionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernameGetadditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernameGetadditionalPropertiesBoxedNumber
public record UserusernameGetadditionalPropertiesBoxedNumber<br>
implements [UserusernameGetadditionalPropertiesBoxed](#userusernamegetadditionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernameGetadditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernameGetadditionalPropertiesBoxedString
public record UserusernameGetadditionalPropertiesBoxedString<br>
implements [UserusernameGetadditionalPropertiesBoxed](#userusernamegetadditionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernameGetadditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernameGetadditionalPropertiesBoxedList
public record UserusernameGetadditionalPropertiesBoxedList<br>
implements [UserusernameGetadditionalPropertiesBoxed](#userusernamegetadditionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernameGetadditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernameGetadditionalPropertiesBoxedMap
public record UserusernameGetadditionalPropertiesBoxedMap<br>
implements [UserusernameGetadditionalPropertiesBoxed](#userusernamegetadditionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserusernameGetadditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserusernameGetadditionalProperties
public static class UserusernameGetadditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
